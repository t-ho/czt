
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

import net.sourceforge.czt.base.impl.*;
import net.sourceforge.czt.util.TypesafeList;
import net.sourceforge.czt.z.ast.*;
import net.sourceforge.czt.z.impl.*;
import net.sourceforge.czt.zpatt.ast.*;
import net.sourceforge.czt.zpatt.visitor.*;

import net.sourceforge.czt.zpatt.visitor.SubstituteVisitor;

/**
 * An implementation of the interface
 * {@link Substitute}.
 *
 * @author Gnast version 0.1
 */
public class SubstituteImpl
  extends TermImpl   implements Substitute
{
  /**
   * The default constructor.
   *
   * Do not use it explicitly, unless you are extending this class.
   * If you want to create an instance of this class, please use the
   * {@link ZpattFactory object factory}.
   */
  protected SubstituteImpl()
  {
  }

  /**
   * Compares the specified object with this SubstituteImpl
   * for equality.  Returns true if and only if the specified object is
   * also a(n) SubstituteImpl and all the getter methods except getAnns
   * return equal objects.
   */
  public boolean equals(Object obj)
  {
    if (obj != null) {
      if (this.getClass().equals(obj.getClass()) && super.equals(obj)) {
        SubstituteImpl object = (SubstituteImpl) obj;
        if (expr_ != null) {
          if (!expr_.equals(object.expr_)) {
            return false;
          }
        } else {
          if (object.expr_ != null) {
            return false;
          }
        }
        if (pred_ != null) {
          if (!pred_.equals(object.pred_)) {
            return false;
          }
        } else {
          if (object.pred_ != null) {
            return false;
          }
        }
        return true;
      }
    }
    return false;
  }

  /**
   * Returns the hash code value for this SubstituteImpl.
   * The hash code of a SubstituteImpl is defined to be
   * the result of the following calculation:
   *
   * @czt.todo Write the calculation procedure for method hashCode().
   */
  public int hashCode()
  {
    final int constant = 31;

    int hashCode = super.hashCode();
    hashCode += "SubstituteImpl".hashCode();
    if (expr_ != null) {
      hashCode += constant * expr_.hashCode();
    }
    if (pred_ != null) {
      hashCode += constant * pred_.hashCode();
    }
    return hashCode;
  }

  /**
   * Accepts a visitor.
   */
  public Object accept(net.sourceforge.czt.util.Visitor v)
  {
    if (v instanceof SubstituteVisitor) {
      SubstituteVisitor visitor = (SubstituteVisitor) v;
      return visitor.visitSubstitute(this);
    }
    return super.accept(v);
  }

  /**
   * Returns a new object of this class.
   */
  public net.sourceforge.czt.base.ast.Term create(Object[] args)
  {
    Substitute zedObject = null;
    try {
      java.util.List expr = (java.util.List) args[0];
      java.util.List pred = (java.util.List) args[1];
      zedObject = new SubstituteImpl();
      if (expr != null) {
        zedObject.getExpr().addAll(expr);
      }
      if (pred != null) {
        zedObject.getPred().addAll(pred);
      }
    } catch (IndexOutOfBoundsException e) {
      throw new IllegalArgumentException();
    } catch (ClassCastException e) {
      throw new IllegalArgumentException();
    }
    return zedObject;
  }

  public Object[] getChildren()
  {
    Object[] erg = { getExpr(), getPred() };
    return erg;
  }


  private java.util.List expr_ =
    new TypesafeList(net.sourceforge.czt.z.ast.Expr.class);

  public java.util.List getExpr()
  {
    return expr_;
  }


  private java.util.List pred_ =
    new TypesafeList(net.sourceforge.czt.z.ast.Pred.class);

  public java.util.List getPred()
  {
    return pred_;
  }
}
