
/*
THIS FILE WAS GENERATED BY GNAST.
ANY MODIFICATIONS TO THIS FILE WILL BE LOST UPON REGENERATION.

************************************************************

Copyright 2003 Mark Utting
This file is part of the czt project.

The czt project contains free software; you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation; either version 2 of the License, or
(at your option) any later version.

The czt project is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with czt; if not, write to the Free Software
Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
*/

package net.sourceforge.czt.core.impl;

import java.util.*;
import java.util.logging.*;

import net.sourceforge.czt.core.ast.*;
import net.sourceforge.czt.core.util.*;

/**
 * An implementation of the interface
 * {@link ThetaExpr}.
 *
 * @author Gnast version 0.1
 */
public class ThetaExprImpl
extends Expr1Impl implements ThetaExpr
{
  private static final Logger sLogger =
    Logger.getLogger("net.sourceforge.czt.core.impl.ThetaExprImpl");

  /**
   * The default constructor.
   *
   * Do not use it explicitly, unless you are extending this class.
   * If you want to create an instance of this class, please use the
   * {@link CoreFactory object factory}.
   */
  protected ThetaExprImpl() { }
 
  /**
   * Compares the specified object with this ThetaExprImpl
   * for equality.  Returns true if and only if the specified object is
   * also a(n) ThetaExprImpl and all the getter methods except getAnns
   * return equal objects.
   */
  public boolean equals(Object obj)
  {
    if(obj != null &&
       this.getClass().equals(obj.getClass()) &&
       super.equals(obj)) {
      ThetaExprImpl object = (ThetaExprImpl) obj;
      if((mStroke == null && object.mStroke != null) ||
         (mStroke != null &&
         ! mStroke.equals(object.mStroke))) return false;
      if(mStroke == null && object.mStroke != null)
        return false;
      return true;
    }
    return false;
  }

  /**
   * Returns the hash code value for this ThetaExprImpl.
   * The hash code of a ThetaExprImpl is defined to be
   * the result of the following calculation:
   *
   * @czt.todo Write the calculation procedure for method hashCode().
   */
  public int hashCode()
  {
    int hashCode = super.hashCode();
    hashCode += "ThetaExprImpl".hashCode();
    if(mStroke != null) {
      hashCode += 31*mStroke.hashCode();
    }
    return hashCode;
  }

  /**
   * Accepts a visitor.
   */
  public Object accept(AstVisitor v) {
    return v.visitThetaExpr(this);
  }

  /**
   * Returns a new object of this class.
   */
  public Term create(Object[] args) {
    sLogger.entering("ThetaExprImpl", "create", args);
    ThetaExpr zedObject = null;
    try {
      java.util.List stroke = (java.util.List) args[0];
      Expr expr = (Expr) args[1];
      zedObject = new ThetaExprImpl();
      if(stroke != null) {
        zedObject.getStroke().addAll(stroke);
      }
      zedObject.setExpr(expr);
    } catch (IndexOutOfBoundsException e) {
      throw new IllegalArgumentException();
    } catch (ClassCastException e) {
      throw new IllegalArgumentException();
    }
    sLogger.exiting("ThetaExprImpl", "create", zedObject);
    return zedObject;
  }

  public Object[] getChildren()
  {
    sLogger.entering("ThetaExprImpl", "getChildren");
    Object[] erg = { getStroke(), getExpr() };
    sLogger.exiting("ThetaExprImpl", "getChildren", erg);
    return erg;
  }

  private java.util.List mStroke = new java.util.Vector();

  public java.util.List getStroke()
  {
    return mStroke;
  }
}
