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

import java.util.List;
import java.util.ArrayList;
import java.math.*;
import net.sourceforge.czt.util.*;
import net.sourceforge.czt.base.ast.*;
import net.sourceforge.czt.base.visitor.*;
import net.sourceforge.czt.z.util.Factory;
import net.sourceforge.czt.z.ast.*;
import net.sourceforge.czt.z.visitor.*;
import net.sourceforge.czt.animation.eval.*;
import net.sourceforge.czt.animation.eval.flatpred.*;

/** FlatPlus implements the a <= b predicate. */
public class FlatLessThanEquals extends FlatPred
{
  protected BigInteger next;
  private Factory factory_ = new Factory();

  public FlatLessThanEquals(RefName a, RefName b)
  {
    args = new ArrayList(2);
    args.add(a);
    args.add(b);
    solutionsReturned = -1;
  }

  //@ requires newargs.size() == 2;
  public FlatLessThanEquals(ArrayList newargs)
  {
    if (newargs == null || newargs.size() != 2)
      throw new IllegalArgumentException("FlatLessThanEquals requires 2 args");
    args = newargs;
    solutionsReturned = -1;
  }
  
  /** Chooses the mode in which the predicate can be evaluated.*/
  public Mode chooseMode(/*@non_null@*/ Envir env)
  {
    Mode m = modeOneOutput(env);
    if(m!=null) 
      if(m.getSolutions()>0.5)
        m.setSolutions(Double.MAX_VALUE);
    return m;
  }
  
  public void startEvaluation() 
  {
    solutionsReturned = 0;
    next = null;
  }

  /** Does the actual evaluation */
  public boolean nextEvaluation() {
    assert (evalMode_ != null);
    assert (solutionsReturned >= 0);
    boolean result = false;
    solutionsReturned++;
    if (evalMode_.isInput(0) && evalMode_.isInput(1)) {
      if (solutionsReturned == 1) {
        Expr a = evalMode_.getEnvir().lookup((RefName) args.get(0));
        Expr b = evalMode_.getEnvir().lookup((RefName) args.get(1));
        BigInteger x = ((NumExpr) a).getValue();
        BigInteger y = ((NumExpr) b).getValue();
        if (x.compareTo(y) <= 0)
          result = true;
      }
    }
    else if (evalMode_.isInput(0)) {
      if (next == null) {
        Expr a = evalMode_.getEnvir().lookup((RefName) args.get(0));
        BigInteger x = ((NumExpr) a).getValue();
        next = x;
      }
      else
        next = next.add(BigInteger.ONE);
      BigInteger y = next;
      Expr b = factory_.createNumExpr(y);
      evalMode_.getEnvir().setValue((RefName) args.get(1), b);
      result = true;
    }
    else if (evalMode_.isInput(1)) {
      if (next == null) {
        Expr b = evalMode_.getEnvir().lookup((RefName) args.get(1));
        BigInteger y = ((NumExpr) b).getValue();
        next = y;
      }
      else
        next = next.subtract(BigInteger.ONE);
      BigInteger x = next;
      Expr a = factory_.createNumExpr(x);
      evalMode_.getEnvir().setValue((RefName) args.get(0), a);
      result = true;
    }
    return result;
  }

  ///////////////////////// Pred methods ///////////////////////

  public Object accept(Visitor visitor)
  {
    if (visitor instanceof FlatLessThanEqualsVisitor) {
      FlatLessThanEqualsVisitor v = (FlatLessThanEqualsVisitor) visitor;
      return v.visitFlatLessThanEquals(this);
    }
    return super.accept(visitor);
  }
}
