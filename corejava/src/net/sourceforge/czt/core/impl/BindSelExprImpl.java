
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
import net.sourceforge.czt.core.visitor.*;

import net.sourceforge.czt.core.visitor.BindSelExprVisitor;

/**
 * An implementation of the interface
 * {@link BindSelExpr}.
 *
 * @author Gnast version 0.1
 */
public class BindSelExprImpl
extends Expr1Impl implements BindSelExpr
{
  private static final Logger sLogger =
    Logger.getLogger("net.sourceforge.czt.core.impl.BindSelExprImpl");

  /**
   * The default constructor.
   *
   * Do not use it explicitly, unless you are extending this class.
   * If you want to create an instance of this class, please use the
   * {@link CoreFactory object factory}.
   */
  protected BindSelExprImpl() { }

  /**
   * Compares the specified object with this BindSelExprImpl
   * for equality.  Returns true if and only if the specified object is
   * also a(n) BindSelExprImpl and all the getter methods except getAnns
   * return equal objects.
   */
  public boolean equals(Object obj)
  {
    if(obj != null &&
       this.getClass().equals(obj.getClass()) &&
       super.equals(obj)) {
      BindSelExprImpl object = (BindSelExprImpl) obj;
      if((mName == null && object.mName != null) ||
         (mName != null &&
         ! mName.equals(object.mName))) return false;
      if(mName == null && object.mName != null)
        return false;
      return true;
    }
    return false;
  }

  /**
   * Returns the hash code value for this BindSelExprImpl.
   * The hash code of a BindSelExprImpl is defined to be
   * the result of the following calculation:
   *
   * @czt.todo Write the calculation procedure for method hashCode().
   */
  public int hashCode()
  {
    int hashCode = super.hashCode();
    hashCode += "BindSelExprImpl".hashCode();
    if(mName != null) {
      hashCode += 31*mName.hashCode();
    }
    return hashCode;
  }

  /**
   * Accepts a visitor.
   */
  public Object accept(net.sourceforge.czt.util.Visitor v)
  {
    if (v instanceof BindSelExprVisitor)
    {
      BindSelExprVisitor visitor = (BindSelExprVisitor) v;
      return visitor.visitBindSelExpr(this);
    }
    return super.accept(v);
  }

  /**
   * Returns a new object of this class.
   */
  public Term create(Object[] args) {
    sLogger.entering("BindSelExprImpl", "create", args);
    BindSelExpr zedObject = null;
    try {
      RefName name = (RefName) args[0];
      Expr expr = (Expr) args[1];
      zedObject = new BindSelExprImpl();
      zedObject.setName(name);
      zedObject.setExpr(expr);
    } catch (IndexOutOfBoundsException e) {
      throw new IllegalArgumentException();
    } catch (ClassCastException e) {
      throw new IllegalArgumentException();
    }
    sLogger.exiting("BindSelExprImpl", "create", zedObject);
    return zedObject;
  }

  public Object[] getChildren()
  {
    sLogger.entering("BindSelExprImpl", "getChildren");
    Object[] erg = { getName(), getExpr() };
    sLogger.exiting("BindSelExprImpl", "getChildren", erg);
    return erg;
  }

  private RefName mName;

  public RefName getName()
  {
    return mName;
  }

  public void setName(RefName name)
  {
    mName = name;
  }
}
