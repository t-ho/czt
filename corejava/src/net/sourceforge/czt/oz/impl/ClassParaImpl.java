
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

package net.sourceforge.czt.oz.impl;

import java.util.*;
import java.util.logging.*;

import net.sourceforge.czt.base.impl.*;
import net.sourceforge.czt.util.TypesafeList;
import net.sourceforge.czt.z.ast.*;
import net.sourceforge.czt.z.impl.*;
import net.sourceforge.czt.oz.ast.*;
import net.sourceforge.czt.oz.visitor.*;

import net.sourceforge.czt.oz.visitor.ClassParaVisitor;

/**
 * An implementation of the interface
 * {@link ClassPara}.
 *
 * @author Gnast version 0.1
 */
public class ClassParaImpl
  extends ParaImpl   implements ClassPara
{
  /**
   * The default constructor.
   *
   * Do not use it explicitly, unless you are extending this class.
   * If you want to create an instance of this class, please use the
   * {@link net.sourceforge.czt.oz.ast.OzFactory object factory}.
   */
  protected ClassParaImpl()
  {
  }

  /**
   * Compares the specified object with this ClassParaImpl
   * for equality.  Returns true if and only if the specified object is
   * also a(n) ClassParaImpl and all the getter methods except getAnns
   * return equal objects.
   */
  public boolean equals(Object obj)
  {
    if (obj != null) {
      if (this.getClass().equals(obj.getClass()) && super.equals(obj)) {
        ClassParaImpl object = (ClassParaImpl) obj;
        if (name_ != null) {
          if (!name_.equals(object.name_)) {
            return false;
          }
        }
        else {
          if (object.name_ != null) {
            return false;
          }
        }
        if (formalParameters_ != null) {
          if (!formalParameters_.equals(object.formalParameters_)) {
            return false;
          }
        }
        else {
          if (object.formalParameters_ != null) {
            return false;
          }
        }
        if (visibility_ != null) {
          if (!visibility_.equals(object.visibility_)) {
            return false;
          }
        }
        else {
          if (object.visibility_ != null) {
            return false;
          }
        }
        if (inheritedClass_ != null) {
          if (!inheritedClass_.equals(object.inheritedClass_)) {
            return false;
          }
        }
        else {
          if (object.inheritedClass_ != null) {
            return false;
          }
        }
        if (localDef_ != null) {
          if (!localDef_.equals(object.localDef_)) {
            return false;
          }
        }
        else {
          if (object.localDef_ != null) {
            return false;
          }
        }
        if (state_ != null) {
          if (!state_.equals(object.state_)) {
            return false;
          }
        }
        else {
          if (object.state_ != null) {
            return false;
          }
        }
        if (initialState_ != null) {
          if (!initialState_.equals(object.initialState_)) {
            return false;
          }
        }
        else {
          if (object.initialState_ != null) {
            return false;
          }
        }
        if (operation_ != null) {
          if (!operation_.equals(object.operation_)) {
            return false;
          }
        }
        else {
          if (object.operation_ != null) {
            return false;
          }
        }
        return true;
      }
    }
    return false;
  }

  /**
   * Returns the hash code value for this ClassParaImpl.
   */
  public int hashCode()
  {
    final int constant = 31;

    int hashCode = super.hashCode();
    hashCode += "ClassParaImpl".hashCode();
    if (name_ != null) {
      hashCode += constant * name_.hashCode();
    }
    if (formalParameters_ != null) {
      hashCode += constant * formalParameters_.hashCode();
    }
    if (visibility_ != null) {
      hashCode += constant * visibility_.hashCode();
    }
    if (inheritedClass_ != null) {
      hashCode += constant * inheritedClass_.hashCode();
    }
    if (localDef_ != null) {
      hashCode += constant * localDef_.hashCode();
    }
    if (state_ != null) {
      hashCode += constant * state_.hashCode();
    }
    if (initialState_ != null) {
      hashCode += constant * initialState_.hashCode();
    }
    if (operation_ != null) {
      hashCode += constant * operation_.hashCode();
    }
    return hashCode;
  }

  /**
   * Accepts a visitor.
   */
  public Object accept(net.sourceforge.czt.util.Visitor v)
  {
    if (v instanceof ClassParaVisitor) {
      ClassParaVisitor visitor = (ClassParaVisitor) v;
      return visitor.visitClassPara(this);
    }
    return super.accept(v);
  }

  /**
   * Returns a new object of this class.
   */
  public net.sourceforge.czt.base.ast.Term create(Object[] args)
  {
    ClassPara zedObject = null;
    try {
      net.sourceforge.czt.z.ast.DeclName name = (net.sourceforge.czt.z.ast.DeclName) args[0];
      java.util.List formalParameters = (java.util.List) args[1];
      java.util.List visibility = (java.util.List) args[2];
      java.util.List inheritedClass = (java.util.List) args[3];
      java.util.List localDef = (java.util.List) args[4];
      State state = (State) args[5];
      InitialState initialState = (InitialState) args[6];
      java.util.List operation = (java.util.List) args[7];
      zedObject = new ClassParaImpl();
      zedObject.setName(name);
      if (formalParameters != null) {
        zedObject.getFormalParameters().addAll(formalParameters);
      }
      if (visibility != null) {
        zedObject.getVisibility().addAll(visibility);
      }
      if (inheritedClass != null) {
        zedObject.getInheritedClass().addAll(inheritedClass);
      }
      if (localDef != null) {
        zedObject.getLocalDef().addAll(localDef);
      }
      zedObject.setState(state);
      zedObject.setInitialState(initialState);
      if (operation != null) {
        zedObject.getOperation().addAll(operation);
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
    Object[] erg = { getName(), getFormalParameters(), getVisibility(), getInheritedClass(), getLocalDef(), getState(), getInitialState(), getOperation() };
    return erg;
  }

  private net.sourceforge.czt.z.ast.DeclName name_;

  public net.sourceforge.czt.z.ast.DeclName getName()
  {
    return name_;
  }

  public void setName(net.sourceforge.czt.z.ast.DeclName name)
  {
    name_ = name;
  }


  private net.sourceforge.czt.base.ast.ListTerm formalParameters_ =
    new net.sourceforge.czt.base.impl.ListTermImpl(net.sourceforge.czt.z.ast.DeclName.class);

  public net.sourceforge.czt.base.ast.ListTerm getFormalParameters()
  {
    return formalParameters_;
  }


  private net.sourceforge.czt.base.ast.ListTerm visibility_ =
    new net.sourceforge.czt.base.impl.ListTermImpl(net.sourceforge.czt.z.ast.RefName.class);

  public net.sourceforge.czt.base.ast.ListTerm getVisibility()
  {
    return visibility_;
  }


  private net.sourceforge.czt.base.ast.ListTerm inheritedClass_ =
    new net.sourceforge.czt.base.impl.ListTermImpl(net.sourceforge.czt.z.ast.Expr.class);

  public net.sourceforge.czt.base.ast.ListTerm getInheritedClass()
  {
    return inheritedClass_;
  }


  private net.sourceforge.czt.base.ast.ListTerm localDef_ =
    new net.sourceforge.czt.base.impl.ListTermImpl(net.sourceforge.czt.z.ast.Para.class);

  public net.sourceforge.czt.base.ast.ListTerm getLocalDef()
  {
    return localDef_;
  }

  private State state_;

  public State getState()
  {
    return state_;
  }

  public void setState(State state)
  {
    state_ = state;
  }

  private InitialState initialState_;

  public InitialState getInitialState()
  {
    return initialState_;
  }

  public void setInitialState(InitialState initialState)
  {
    initialState_ = initialState;
  }


  private net.sourceforge.czt.base.ast.ListTerm operation_ =
    new net.sourceforge.czt.base.impl.ListTermImpl(Operation.class);

  public net.sourceforge.czt.base.ast.ListTerm getOperation()
  {
    return operation_;
  }
}
