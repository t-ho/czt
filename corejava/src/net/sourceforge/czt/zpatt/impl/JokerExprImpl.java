
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

package net.sourceforge.czt.zpatt.impl;

import java.util.*;
import java.util.logging.*;

import net.sourceforge.czt.core.ast.*;
import net.sourceforge.czt.core.impl.*;
import net.sourceforge.czt.zpatt.ast.*;
import net.sourceforge.czt.zpatt.util.*;

import net.sourceforge.czt.zpatt.visitor.JokerExprVisitor;

/**
 * An implementation of the interface
 * {@link JokerExpr}.
 *
 * @author Gnast version 0.1
 */
public class JokerExprImpl
extends ExprImpl implements JokerExpr
{
  private static final Logger sLogger =
    Logger.getLogger("net.sourceforge.czt.zpatt.impl.JokerExprImpl");

  /**
   * The default constructor.
   *
   * Do not use it explicitly, unless you are extending this class.
   * If you want to create an instance of this class, please use the
   * {@link ZPattFactory object factory}.
   */
  protected JokerExprImpl() { }

  /**
   * Compares the specified object with this JokerExprImpl
   * for equality.  Returns true if and only if the specified object is
   * also a(n) JokerExprImpl and all the getter methods except getAnns
   * return equal objects.
   */
  public boolean equals(Object obj)
  {
    if(obj != null &&
       this.getClass().equals(obj.getClass()) &&
       super.equals(obj)) {
      JokerExprImpl object = (JokerExprImpl) obj;
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
   * Returns the hash code value for this JokerExprImpl.
   * The hash code of a JokerExprImpl is defined to be
   * the result of the following calculation:
   *
   * @czt.todo Write the calculation procedure for method hashCode().
   */
  public int hashCode()
  {
    int hashCode = super.hashCode();
    hashCode += "JokerExprImpl".hashCode();
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
    if (v instanceof JokerExprVisitor)
    {
      JokerExprVisitor visitor = (JokerExprVisitor) v;
      return visitor.visitJokerExpr(this);
    }
    return super.accept(v);
  }

  /**
   * Returns a new object of this class.
   */
  public Term create(Object[] args) {
    sLogger.entering("JokerExprImpl", "create", args);
    JokerExpr zedObject = null;
    try {
      String name = (String) args[0];
      zedObject = new JokerExprImpl();
      zedObject.setName(name);
    } catch (IndexOutOfBoundsException e) {
      throw new IllegalArgumentException();
    } catch (ClassCastException e) {
      throw new IllegalArgumentException();
    }
    sLogger.exiting("JokerExprImpl", "create", zedObject);
    return zedObject;
  }

  public Object[] getChildren()
  {
    sLogger.entering("JokerExprImpl", "getChildren");
    Object[] erg = { getName() };
    sLogger.exiting("JokerExprImpl", "getChildren", erg);
    return erg;
  }

  private String mName;

  public String getName()
  {
    return mName;
  }

  public void setName(String name)
  {
    mName = name;
  }
}
