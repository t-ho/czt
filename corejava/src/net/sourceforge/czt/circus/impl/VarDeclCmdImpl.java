
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

import net.sourceforge.czt.circus.visitor.VarDeclCmdVisitor;

/**
 * An implementation of the interface
 * {@link VarDeclCmd}.
 *
 * @author Gnast version 0.1
 */
public class VarDeclCmdImpl
  extends CommandImpl   implements VarDeclCmd
{
  /**
   * The default constructor.
   *
   * Do not use it explicitly, unless you are extending this class.
   * If you want to create an instance of this class, please use the
   * {@link net.sourceforge.czt.circus.ast.CircusFactory object factory}.
   */
  protected VarDeclCmdImpl()
  {
  }

  /**
   * Compares the specified object with this VarDeclCmdImpl
   * for equality.  Returns true if and only if the specified object is
   * also a(n) VarDeclCmdImpl and all the getter methods except getAnns
   * return equal objects.
   */
  public boolean equals(Object obj)
  {
    if (obj != null) {
      if (this.getClass().equals(obj.getClass()) && super.equals(obj)) {
        VarDeclCmdImpl object = (VarDeclCmdImpl) obj;
        if (varDecl_ != null) {
          if (!varDecl_.equals(object.varDecl_)) {
            return false;
          }
        }
        else {
          if (object.varDecl_ != null) {
            return false;
          }
        }
        if (actionDef_ != null) {
          if (!actionDef_.equals(object.actionDef_)) {
            return false;
          }
        }
        else {
          if (object.actionDef_ != null) {
            return false;
          }
        }
        return true;
      }
    }
    return false;
  }

  /**
   * Returns the hash code value for this VarDeclCmdImpl.
   */
  public int hashCode()
  {
    final int constant = 31;

    int hashCode = super.hashCode();
    hashCode += "VarDeclCmdImpl".hashCode();
    if (varDecl_ != null) {
      hashCode += constant * varDecl_.hashCode();
    }
    if (actionDef_ != null) {
      hashCode += constant * actionDef_.hashCode();
    }
    return hashCode;
  }

  /**
   * Accepts a visitor.
   */
  public Object accept(net.sourceforge.czt.util.Visitor v)
  {
    if (v instanceof VarDeclCmdVisitor) {
      VarDeclCmdVisitor visitor = (VarDeclCmdVisitor) v;
      return visitor.visitVarDeclCmd(this);
    }
    return super.accept(v);
  }

  /**
   * Returns a new object of this class.
   */
  public net.sourceforge.czt.base.ast.Term create(Object[] args)
  {
    VarDeclCmd zedObject = null;
    try {
      net.sourceforge.czt.z.ast.VarDecl varDecl = (net.sourceforge.czt.z.ast.VarDecl) args[0];
      ActionDef actionDef = (ActionDef) args[1];
      zedObject = new VarDeclCmdImpl();
      zedObject.setVarDecl(varDecl);
      zedObject.setActionDef(actionDef);
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
    Object[] erg = { getVarDecl(), getActionDef() };
    return erg;
  }

  private net.sourceforge.czt.z.ast.VarDecl varDecl_;

  public net.sourceforge.czt.z.ast.VarDecl getVarDecl()
  {
    return varDecl_;
  }

  public void setVarDecl(net.sourceforge.czt.z.ast.VarDecl varDecl)
  {
    varDecl_ = varDecl;
  }

  private ActionDef actionDef_;

  public ActionDef getActionDef()
  {
    return actionDef_;
  }

  public void setActionDef(ActionDef actionDef)
  {
    actionDef_ = actionDef;
  }
}
