
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

import net.sourceforge.czt.core.visitor.SchExpr2Visitor;

/**
 * An implementation of the interface
 * {@link SchExpr2}.
 *
 * @author Gnast version 0.1
 */
public abstract class SchExpr2Impl
extends Expr2Impl implements SchExpr2
{

  /**
   * Compares the specified object with this SchExpr2Impl
   * for equality.  Returns true if and only if the specified object is
   * also a(n) SchExpr2Impl and all the getter methods except getAnns
   * return equal objects.
   */
  public boolean equals(Object obj)
  {
    if(obj != null &&
       this.getClass().equals(obj.getClass()) &&
       super.equals(obj)) {
      SchExpr2Impl object = (SchExpr2Impl) obj;
      return true;
    }
    return false;
  }

  /**
   * Returns the hash code value for this SchExpr2Impl.
   * The hash code of a SchExpr2Impl is defined to be
   * the result of the following calculation:
   *
   * @czt.todo Write the calculation procedure for method hashCode().
   */
  public int hashCode()
  {
    int hashCode = super.hashCode();
    hashCode += "SchExpr2Impl".hashCode();
    return hashCode;
  }

  /**
   * Accepts a visitor.
   */
  public Object accept(net.sourceforge.czt.util.Visitor v)
  {
    if (v instanceof SchExpr2Visitor)
    {
      SchExpr2Visitor visitor = (SchExpr2Visitor) v;
      return visitor.visitSchExpr2(this);
    }
    return super.accept(v);
  }

}
