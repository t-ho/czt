/**
 Copyright (C) 2007 Mark Utting
 This file is part of the CZT project.

 The CZT project contains free software; you can redistribute it and/or modify
 it under the terms of the GNU General Public License as published by
 the Free Software Foundation; either version 2 of the License, or
 (at your option) any later version.

 The CZT project is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; without even the implied warranty of
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 GNU General Public License for more details.

 You should have received a copy of the GNU General Public License
 along with CZT; if not, write to the Free Software
 Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 */

package net.sourceforge.czt.modeljunit;

import net.sourceforge.czt.jdsl.graph.api.Edge;
import net.sourceforge.czt.jdsl.graph.api.EdgeIterator;
import net.sourceforge.czt.jdsl.graph.api.InspectableGraph;
import net.sourceforge.czt.modeljunit.coverage.ActionCoverage;
import net.sourceforge.czt.modeljunit.coverage.CoverageMetric;
import net.sourceforge.czt.modeljunit.coverage.TransitionCoverage;
import net.sourceforge.czt.modeljunit.examples.FSM;
import net.sourceforge.czt.modeljunit.timing.TimedFsmModel;
import net.sourceforge.czt.modeljunit.timing.TimedModel;

/** A test generator that looks N-levels ahead in the graph.
 *
 *  It chooses the highest-valued transition (action) that is enabled
 *  in the current state.
 *  The value of transitions/actions and states is determined by three
 *  parameters, NEWTRANS, NEWACTION and DEPTH.
 *
 *  In a given state, the value of an action that has never been taken
 *  before in that state (so its destination state is unknown)
 *  is NEWACTION if its action has never been taken anywhere in the graph,
 *  or NEWTRANS if its action has been taken elsewhere.
 *
 *  The value of an action that has been taken before is the
 *  value of the state that it leads to (*), minus the number of times
 *  that the transition has been taken.  So previously-taken paths
 *  gradually become less and less attractive.
 *  (*) if the action is non-deterministic, then there are several
 *  transitions labelled with that action, and the value of the action
 *  is the maximum of the value of those transitions.
 *
 *  The value of a state is zero if it is the current state,
 *  or if it is at least DEPTH steps away from the current state,
 *  otherwise it is the maximum value of its outgoing transitions.
 *  This means that the lookahead is limited to paths of length DEPTH.
 *
 *  The get/setMaxLength methods can be used to control the maximum
 *  length of each generated test.  If the test generation has not
 *  reached a terminal state before that length, it does a reset.
 *
 *  @author Pele Douangsavanh and Mark Utting
 */
public class LookaheadTester extends Tester
{
  /** How worthwhile is it to explore a new transition? */
  protected int NEW_TRANS = 10;

  /** How worthwhile is it to use a completely new action? */
  protected int NEW_ACTION = 15;

  /** How far should we look ahead? */
  protected int DEPTH = 3;

  /** The maximum length of each generated test */
  protected int maxLength_ = 100;

  /** The length of the current test sequence generated by this tester. */
  protected int currLength_ = 0;

  protected GraphListener graph_;

  protected CoverageMetric transitions_;

  protected CoverageMetric actions_;

  /**
   * @return the depth of the recursive lookahead
   */
  public int getDepth()
  {
    return DEPTH;
  }

  /**
   * Set the lookahead depth.
   * depth=N means explore all known paths ahead upto length N.
   * depth=1 means look only at the outgoing transitions of the current state,
   * so this gives similar behaviour to GreedyTester (but not
   * exactly the same, because this tester uses alphabetical ordering of
   * the transition names to decide between equally good transitions, whereas
   * GreedyTester makes a random choice between them).
   *
   * @param depth the depth of the recursive lookahead (1..n)
   *              This should be reasonably small, otherwise the lookahead
   *              may be exponentially slow.  The default value is 3.
   */
  public void setDepth(int depth)
  {
    assert depth > 0;
    this.DEPTH = depth;
  }

  public int getNewActionValue()
  {
    return NEW_ACTION;
  }

  /** Set the NEW_ACTION parameter.
   *  Higher values make the lookahead more eager to try new actions.
   * @param value
   */
  public void setNewActionValue(int value)
  {
    this.NEW_ACTION = value;
  }

  public int getNewTransValue()
  {
    return NEW_TRANS;
  }

  /** Set the NEW_TRANS parameter.
   *  Higher values make the lookahead more eager to try new transitions
   *  (actions that are in the TODO list of a given state).
   * @param value
   */
  public void setNewTransValue(int value)
  {
    this.NEW_TRANS = value;
  }

  /** The maximum length of each generated test. */
  public int getMaxLength()
  {
    return maxLength_;
  }

  /** Set the maximum length of each generated test. */
  public void setMaxLength(int maxLength)
  {
    this.maxLength_ = maxLength;
  }

  /**
   *  Creates a test generator that can does smart look ahead.
   *
   * @param model  Must be non-null;
   */
  public LookaheadTester(Model model)
  {
    super(model);
    model.addListener("graph");
    transitions_ = (CoverageMetric) model.addListener(new TransitionCoverage());
    actions_ = (CoverageMetric) model.addListener(new ActionCoverage());
    graph_ = (GraphListener) model.getListener("graph");
  }

  /**
   * A convenience constructor that puts a Model wrapper around an FsmModel.
   * @param fsm  Must be non-null.
   */
  public LookaheadTester(FsmModel fsm)
  {
    super(fsm);
    model_.addListener("graph");
    transitions_ = (CoverageMetric) model_.addListener(new TransitionCoverage());
    actions_ = (CoverageMetric) model_.addListener(new ActionCoverage());
    graph_ = (GraphListener) model_.getListener("graph");
  }
  


  public String getName()
  {
    return "Lookahead Walk";
  }

  public String getDescription()
  {
    return "At each state, this test generator looks ahead through all" +
    		" the known paths, upto a fixed DEPTH, to find the path" +
    		" that leads to an Action or a Transition that has not yet" +
    		" been explored.  Can be exponentially slow if DEPTH is set" +
    		" too large.";
  }

  /**
   * Evaluate the desirability of reaching {@code state}.
   * However, at the top level of recursion (when {@code depth} equals
   * getDepth()), it returns the number of the best action to take.
   * @param state
   * @param depth The depth of lookahead
   * @return A desirability integer, or an action number.
   */
  public int evalState(Object state, int depth)
  {
    if (depth == 0 || depth < DEPTH && state == model_.getCurrentState())
      return 0;
    int[] worth = new int[model_.getNumActions()];
    for (int i = 0; i < worth.length; i++) {
      worth[i] = Integer.MIN_VALUE;
    }

    InspectableGraph fsmGraph = graph_.getGraph();
    EdgeIterator edges = fsmGraph.edges();

    // look ahead into the paths that we know about
    // TODO: iterate only over the nodes out of this state
    while (edges.hasNext()) {
      Edge e = edges.nextEdge();
      Object origin = fsmGraph.origin(e).element();
      Object dest = fsmGraph.destination(e).element();
      String actionName = (String) e.element();
      int actionNum = model_.getActionNumber(actionName);
      if (origin.equals(state)) {
        Transition tr = new Transition(origin, (String) e.element(), dest);
        Integer takenBefore = transitions_.getDetails().get(tr);
        if (takenBefore == null) {
          // This means that the transitions_ coverage is less accurate
          // than the graph_ coverage, probably because they were added
          // at different times.
          // But we know that this transition has been taken at least once.
          takenBefore = 1;
        }
        int destWorth = evalState(dest, depth - 1); // recursive lookahead
        int tempBest = destWorth - takenBefore.intValue();
        //System.out.println("  evalState(" + state + "," + depth
        //    + ") sees action " + actionNum + "=" + takenBefore + " and dest "
        //    + dest + "=" + destWorth);
        if (tempBest > worth[actionNum]) {
          //System.out.println("  worth[" + actionNum + "] = " + tempBest);
          worth[actionNum] = tempBest;
        }
      }
    }

    // assign values to the unknown (unexplored) paths
    for (int i = 0; i < model_.getNumActions(); i++) {
      if (graph_.isTodo(state, i)) {
        String actionName = model_.getActionName(i);
        if (actions_.getDetails().containsKey(actionName)) {
          //System.out.println("  worth[" + i + "] (TODO) = " + NEW_TRANS);
          worth[i] = NEW_TRANS;
        }
        else {
          //System.out.println("  worth[" + i + "] (TODO) = " + NEW_ACTION);
          worth[i] = NEW_ACTION;
        }
      }
    }

    // find the best action
    // (we consider only enabled actions if depth==DEPTH)
    // Note: every enabled action must either be in TODO,
    // or have been taken previously, so its worth will be > MIN_VALUE.
    int bestAction = -1;
    int bestWorth = Integer.MIN_VALUE;
    for (int i = 0; i < model_.getNumActions(); i++) {
      if (worth[i] > bestWorth && (depth != DEPTH || model_.isEnabled(i))) {
        bestAction = i;
        bestWorth = worth[i];
      }
    }
    if (depth == DEPTH) {
      // This is the start state of our lookahead
      assert state == model_.getCurrentState();
      //System.out.println("RETURN bestAction="+bestAction+" worth "+bestWorth);
      return bestAction;
    }
    else {
      //System.out.println("evalState("+state+","+depth+") returns sum="+bestWorth);
      return bestWorth;
    }
  }

  @Override
  public void reset()
  {
    super.reset();
    currLength_ = 0;
  }

  @Override
  public int generate()
  {
    assert DEPTH > 0;
    int action = evalState(model_.getCurrentState(), DEPTH);
    if (action < 0 || currLength_ >= maxLength_) {
      model_.doReset();
      currLength_ = 0;
    }
    else {
      currLength_++;
      if (!model_.doAction(action))
        throw new RuntimeException(this.getClass().getName()
            + ": could not take action " + action);
    }
    return action;
  }

  public static void main(String[] args)
  {
    LookaheadTester tester = new LookaheadTester(new FSM());
    tester.addListener(new VerboseListener());
    tester.generate(10);
  }
}
