
/******************************************************************************
DO NOT EDIT THIS FILE!  THIS FILE WAS GENERATED BY GNAST
FROM THE TEMPLATE FILE AstClass.vm.
ANY MODIFICATIONS TO THIS FILE WILL BE LOST UPON REGENERATION.

-------------------------------------------------------------------------------

Copyright 2003, 2004, 2005 Mark Utting
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
******************************************************************************/

package net.sourceforge.czt.circus.impl;

import java.util.*;
import java.util.logging.*;

import net.sourceforge.czt.base.impl.*;
import net.sourceforge.czt.util.TypesafeList;
import net.sourceforge.czt.z.ast.*;
import net.sourceforge.czt.z.impl.*;
import net.sourceforge.czt.circus.ast.*;
import net.sourceforge.czt.circus.visitor.*;

import net.sourceforge.czt.circus.visitor.ActualParamProcVisitor;

/**
 * An implementation of the interface
 * {@link ActualParamProc}.
 *
 * @author Gnast version 0.1
 */
public class ActualParamProcImpl
  extends ProcEImpl   implements ActualParamProc
{
  /**
   * The default constructor.
   *
   * Do not use it explicitly, unless you are extending this class.
   * If you want to create an instance of this class, please use the
   * {@link net.sourceforge.czt.circus.ast.CircusFactory object factory}.
   */
  protected ActualParamProcImpl()
  {
  }

  /**
   * Compares the specified object with this ActualParamProcImpl
   * for equality.  Returns true if and only if the specified object is
   * also a(n) ActualParamProcImpl and all the getter methods except getAnns
   * return equal objects.
   */
  public boolean equals(Object obj)
  {
    if (obj != null) {
      if (this.getClass().equals(obj.getClass()) && super.equals(obj)) {
        ActualParamProcImpl object = (ActualParamProcImpl) obj;
        return true;
      }
    }
    return false;
  }

  /**
   * Returns the hash code value for this ActualParamProcImpl.
   */
  public int hashCode()
  {
    final int constant = 31;

    int hashCode = super.hashCode();
    hashCode += "ActualParamProcImpl".hashCode();
    return hashCode;
  }

  /**
   * Accepts a visitor.
   */
  public Object accept(net.sourceforge.czt.util.Visitor v)
  {
    if (v instanceof ActualParamProcVisitor) {
      ActualParamProcVisitor visitor = (ActualParamProcVisitor) v;
      return visitor.visitActualParamProc(this);
    }
    return super.accept(v);
  }

  /**
   * Returns a new object of this class.
   */
  public net.sourceforge.czt.base.ast.Term create(Object[] args)
  {
    ActualParamProc zedObject = null;
    try {
      ProcDef procDef = (ProcDef) args[0];
      java.util.List expr = (java.util.List) args[1];
      zedObject = new ActualParamProcImpl();
      zedObject.setProcDef(procDef);
      if (expr != null) {
        zedObject.getExpr().addAll(expr);
      }
    }
    catch (IndexOutOfBoundsException e) {
      throw new IllegalArgumentException();
    }
    catch (ClassCastException e) {
      throw new IllegalArgumentException();
    }
    return zedObject;
  }

  public Object[] getChildren()
  {
    Object[] erg = { getProcDef(), getExpr() };
    return erg;
  }
}
