/*
  ZLive - A Z animator -- Part of the CZT Project.
  Copyright 2004 Mark Utting

  This program is free software; you can redistribute it and/or
  modify it under the terms of the GNU General Public License
  as published by the Free Software Foundation; either version 2
  of the License, or (at your option) any later version.

  This program is distributed in the hope that it will be useful,
  but WITHOUT ANY WARRANTY; without even the implied warranty of
  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
  GNU General Public License for more details.

  You should have received a copy of the GNU General Public License
  along with this program; if not, write to the Free Software
  Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
*/
package net.sourceforge.czt.animation.eval.flatpred;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.logging.Logger;

import net.sourceforge.czt.animation.eval.Envir;
import net.sourceforge.czt.util.Visitor;
import net.sourceforge.czt.z.ast.ZDeclName;
import net.sourceforge.czt.z.ast.ZRefName;

public class FlatForall extends FlatPred
{
  protected static final Logger sLogger
  = Logger.getLogger("net.sourceforge.czt.animation.eval");

  protected FlatPredList schText_;
  protected FlatPredList body_;
  
  /** The mode returned by schText_ */
  protected Mode schMode_ = null;

  /** The mode returned by body_ */
  protected Mode bodyMode_ = null;

  public FlatForall(FlatPredList sch, FlatPredList body)
  {
    sLogger.entering("FlatForall","FlatForall");
    schText_ = sch;
    body_ = body;
    
    // freeVars_ := sch.freeVars + (body.freeVars - sch.boundVars)
    freeVars_ = new HashSet<ZRefName>(schText_.freeVars());
    sLogger.fine("schText freevars = "+schText_.freeVars());
    sLogger.fine("schText boundvars = "+schText_.boundVars());
    sLogger.fine("body freevars = "+body_.freeVars());
    Set<ZDeclName> bound = sch.boundVars();
    for (ZRefName v : body_.freeVars()) {
      // TODO: implement special free/boundVar sets which can compare
      //       ZRefName against ZDeclName.
      // or (hack) ZDeclName dname = factory_.createZDeclName(v);
      if ( ! bound.contains(v))
        freeVars_.add(v);
    }
    sLogger.fine("freevars = "+freeVars_);
    freeVars_ = new HashSet<ZRefName>();  // TODO: remove this when above name comparison works properly
    args_ = new ArrayList<ZRefName>(freeVars_);
    solutionsReturned_ = -1;
    sLogger.exiting("FlatForall","FlatForall");
  }

  /** Chooses the mode in which the predicate can be evaluated.
   *  @czt.todo Quantifiers are one place where it would be nice to 
   *            have separate 'cost' and 'numSolutions' information 
   *            within Mode objects, because the cost of evaluating a
   *            universal quantifier can be large, even though it returns
   *            only a single true or false solution.
   */
  public ModeList chooseMode(/*@non_null@*/ Envir env)
  {
    sLogger.entering("FlatForall","chooseMode",env);
    sLogger.fine("freevars="+freeVars_.toString());
    // Use modeAllDefined to check that all free variables are defined
    Mode mode = modeAllDefined(env);
    Mode schMode = null;
    Mode bodyMode = null;
    ModeList result = null;

    if (mode != null) {
      // Now check if the bound vars are finite enough to enumerate
      schMode = schText_.chooseMode(env);
      sLogger.fine("schema text gives mode = " + schMode);
      if (schMode != null) {
	// Now check that the body of the quantifier can be evaluated.
	bodyMode = body_.chooseMode(schMode.getEnvir());
	sLogger.fine("body gives mode: " + bodyMode);
      }
    }

    if (bodyMode != null) {
      // package schMode and bodyMode into a compound Mode
      result = new ModeList(mode);
      result.add(schMode);
      result.add(bodyMode);
    }

    sLogger.exiting("FlatForall","chooseMode",result);
    return result;
  }

  public Set<ZRefName> freeVars()
  { return freeVars_; }

  //@ requires mode instanceof ModeList;
  public void setMode(/*@non_null@*/Mode mode)
  {
    super.setMode(mode);
    Iterator<Mode> submodes = ((ModeList)mode).iterator();
    schText_.setMode(submodes.next());
    body_.setMode(submodes.next());
    assert( ! submodes.hasNext());
  }

  public void startEvaluation()
  {
    sLogger.entering("FlatForAll","startEvaluation");
    assert(evalMode_ != null);
    assert(evalMode_ instanceof ModeList);
    super.startEvaluation();
    schText_.startEvaluation();
    // body_ will be started during nextEvaluation()
    sLogger.exiting("FlatForAll","startEvaluation");
  }

  /** Does the actual evaluation */
  public boolean nextEvaluation()
  {
    sLogger.entering("FlatForAll","nextEvaluation");
    assert(evalMode_ != null);
    while (schText_.nextEvaluation()) {
      body_.startEvaluation();
      if (!(body_.nextEvaluation())) {
	sLogger.exiting("FlatForAll","nextEvaluation",Boolean.FALSE);
        return false;
      }
    }
    sLogger.exiting("FlatForAll","nextEvaluation",Boolean.TRUE);
    return true;
  }


  public String toString() {
    StringBuffer result = new StringBuffer();
    // Start with the class name (in case it is a subclass).
    String fullName = this.getClass().getName();
    int dotPos = fullName.lastIndexOf('.') + 1; // -1 becomes 0.
    result.append(fullName.substring(dotPos));
    // Now add ( SchemaText @ Body )
    result.append("( ");
    result.append(schText_.toString());
    result.append(" @ ");
    result.append(body_.toString());
    result.append(" )");
    return result.toString();
  }


  ///////////////////////// Pred methods ///////////////////////

  public <R> R accept(Visitor<R> visitor)
  {
    if (visitor instanceof FlatForallVisitor)
      return ((FlatForallVisitor<R>) visitor).visitFlatForall(this);
    else
      return super.accept(visitor);
  }
}
