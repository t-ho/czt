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
import java.util.Set;

import net.sourceforge.czt.animation.eval.Envir;
import net.sourceforge.czt.util.Visitor;
import net.sourceforge.czt.z.ast.ZRefName;

public class FlatNot extends FlatPred
{
  private FlatPredList predlist_;

  public FlatNot(FlatPredList fps)
  {
    args_ = new ArrayList<ZRefName>(fps.freeVars());
    predlist_ = fps;
    solutionsReturned_ = -1;
  }

  /** Chooses the mode in which the predicate can be evaluated.*/
  public ModeList chooseMode(/*@non_null@*/ Envir env)
  {
    Mode result = modeAllDefined(env);
    if (result == null)
      return null;
    else
      return predlist_.chooseMode(env);
  }

  //@ requires mode instanceof ModeList;
  public void setMode(/*@non_null@*/Mode mode)
  {
    super.setMode(mode);
    predlist_.setMode( (ModeList)mode );
  }

  public Set<ZRefName> freeVars()
  {
    return predlist_.freeVars();
  }
  
  public void startEvaluation()
  {
    assert(evalMode_ != null);
    super.startEvaluation();
    predlist_.startEvaluation();
  }

  /** Does the actual evaluation */
  public boolean nextEvaluation()
  {
    assert(evalMode_ != null);
    if (solutionsReturned_ == 0) {
      solutionsReturned_++;
      return !(predlist_.nextEvaluation());
    }
    return false;
  }


  ///////////////////////// Pred methods ///////////////////////

  public String toString() {
    return "FlatNot( " + predlist_.toString() + " )";
  }
  
  public Object accept(Visitor visitor)
  {
    if (visitor instanceof FlatNotVisitor) {
      FlatNotVisitor flatNotVisitor = (FlatNotVisitor) visitor;
      return flatNotVisitor.visitFlatNot(this);
    }
    return super.accept(visitor);
  }
}
