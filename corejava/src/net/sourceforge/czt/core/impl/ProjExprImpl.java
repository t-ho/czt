
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
 * {@link ProjExpr}.
 *
 * @author Gnast version 0.1
 */
public class ProjExprImpl
extends SchExpr2Impl implements ProjExpr
{
  private static final Logger sLogger =
    Logger.getLogger("net.sourceforge.czt.core.impl.ProjExprImpl");

  /**
   * The default constructor.
   *
   * Do not use it explicitly, unless you are extending this class.
   * If you want to create an instance of this class, please use the
   * {@link CoreFactory object factory}.
   */
  protected ProjExprImpl() { }
 
  /**
   * Compares the specified object with this ProjExprImpl
   * for equality.  Returns true if and only if the specified object is
   * also a(n) ProjExprImpl and all the getter methods except getAnns
   * return equal objects.
   */
  public boolean equals(Object obj)
  {
    if(obj != null &&
       this.getClass().equals(obj.getClass()) &&
       super.equals(obj)) {
      ProjExprImpl object = (ProjExprImpl) obj;
      return true;
    }
    return false;
  }

  /**
   * Returns the hash code value for this ProjExprImpl.
   * The hash code of a ProjExprImpl is defined to be
   * the result of the following calculation:
   *
   * @czt.todo Write the calculation procedure for method hashCode().
   */
  public int hashCode()
  {
    int hashCode = super.hashCode();
    hashCode += "ProjExprImpl".hashCode();
    return hashCode;
  }

  /**
   * Accepts a visitor.
   */
  public Object accept(AstVisitor v) {
    return v.visitProjExpr(this);
  }

  /**
   * Returns a new object of this class.
   */
  public Term create(Object[] args) {
    sLogger.entering("ProjExprImpl", "create", args);
    ProjExpr zedObject = null;
    try {
      java.util.List expr = (java.util.List) args[0];
      zedObject = new ProjExprImpl();
      if(expr != null) {
        zedObject.getExpr().addAll(expr);
      }
    } catch (IndexOutOfBoundsException e) {
      throw new IllegalArgumentException();
    } catch (ClassCastException e) {
      throw new IllegalArgumentException();
    }
    sLogger.exiting("ProjExprImpl", "create", zedObject);
    return zedObject;
  }

  public Object[] getChildren()
  {
    sLogger.entering("ProjExprImpl", "getChildren");
    Object[] erg = { getExpr() };
    sLogger.exiting("ProjExprImpl", "getChildren", erg);
    return erg;
  }
}
