
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

package net.sourceforge.czt.oz.impl;

import java.util.*;
import java.util.logging.*;

import net.sourceforge.czt.base.impl.*;
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
extends ParaImpl implements ClassPara
{
  /**
   * The default constructor.
   *
   * Do not use it explicitly, unless you are extending this class.
   * If you want to create an instance of this class, please use the
   * {@link OZFactory object factory}.
   */
  protected ClassParaImpl() { }

  /**
   * Compares the specified object with this ClassParaImpl
   * for equality.  Returns true if and only if the specified object is
   * also a(n) ClassParaImpl and all the getter methods except getAnns
   * return equal objects.
   */
  public boolean equals(Object obj)
  {
    if(obj != null &&
       this.getClass().equals(obj.getClass()) &&
       super.equals(obj)) {
      ClassParaImpl object = (ClassParaImpl) obj;
      if((mName == null && object.mName != null) ||
         (mName != null &&
         ! mName.equals(object.mName))) return false;
      if(mName == null && object.mName != null)
        return false;
      if((mFormalParameters == null && object.mFormalParameters != null) ||
         (mFormalParameters != null &&
         ! mFormalParameters.equals(object.mFormalParameters))) return false;
      if(mFormalParameters == null && object.mFormalParameters != null)
        return false;
      if((mVisibilityList == null && object.mVisibilityList != null) ||
         (mVisibilityList != null &&
         ! mVisibilityList.equals(object.mVisibilityList))) return false;
      if(mVisibilityList == null && object.mVisibilityList != null)
        return false;
      if((mInheritedClass == null && object.mInheritedClass != null) ||
         (mInheritedClass != null &&
         ! mInheritedClass.equals(object.mInheritedClass))) return false;
      if(mInheritedClass == null && object.mInheritedClass != null)
        return false;
      if((mLocalDef == null && object.mLocalDef != null) ||
         (mLocalDef != null &&
         ! mLocalDef.equals(object.mLocalDef))) return false;
      if(mLocalDef == null && object.mLocalDef != null)
        return false;
      if((mState == null && object.mState != null) ||
         (mState != null &&
         ! mState.equals(object.mState))) return false;
      if(mState == null && object.mState != null)
        return false;
      if((mInitialState == null && object.mInitialState != null) ||
         (mInitialState != null &&
         ! mInitialState.equals(object.mInitialState))) return false;
      if(mInitialState == null && object.mInitialState != null)
        return false;
      if((mOperation == null && object.mOperation != null) ||
         (mOperation != null &&
         ! mOperation.equals(object.mOperation))) return false;
      if(mOperation == null && object.mOperation != null)
        return false;
      return true;
    }
    return false;
  }

  /**
   * Returns the hash code value for this ClassParaImpl.
   * The hash code of a ClassParaImpl is defined to be
   * the result of the following calculation:
   *
   * @czt.todo Write the calculation procedure for method hashCode().
   */
  public int hashCode()
  {
    int hashCode = super.hashCode();
    hashCode += "ClassParaImpl".hashCode();
    if(mName != null) {
      hashCode += 31*mName.hashCode();
    }
    if(mFormalParameters != null) {
      hashCode += 31*mFormalParameters.hashCode();
    }
    if(mVisibilityList != null) {
      hashCode += 31*mVisibilityList.hashCode();
    }
    if(mInheritedClass != null) {
      hashCode += 31*mInheritedClass.hashCode();
    }
    if(mLocalDef != null) {
      hashCode += 31*mLocalDef.hashCode();
    }
    if(mState != null) {
      hashCode += 31*mState.hashCode();
    }
    if(mInitialState != null) {
      hashCode += 31*mInitialState.hashCode();
    }
    if(mOperation != null) {
      hashCode += 31*mOperation.hashCode();
    }
    return hashCode;
  }

  /**
   * Accepts a visitor.
   */
  public Object accept(net.sourceforge.czt.util.Visitor v)
  {
    if (v instanceof ClassParaVisitor)
    {
      ClassParaVisitor visitor = (ClassParaVisitor) v;
      return visitor.visitClassPara(this);
    }
    return super.accept(v);
  }

  /**
   * Returns a new object of this class.
   */
  public net.sourceforge.czt.base.ast.Term create(Object[] args) {
    ClassPara zedObject = null;
    try {
      net.sourceforge.czt.z.ast.DeclName name = (net.sourceforge.czt.z.ast.DeclName) args[0];
      FormalParameters formalParameters = (FormalParameters) args[1];
      StringListType visibilityList = (StringListType) args[2];
      java.util.List inheritedClass = (java.util.List) args[3];
      LocalDef localDef = (LocalDef) args[4];
      State state = (State) args[5];
      InitialState initialState = (InitialState) args[6];
      java.util.List operation = (java.util.List) args[7];
      zedObject = new ClassParaImpl();
      zedObject.setName(name);
      zedObject.setFormalParameters(formalParameters);
      zedObject.setVisibilityList(visibilityList);
      if(inheritedClass != null) {
        zedObject.getInheritedClass().addAll(inheritedClass);
      }
      zedObject.setLocalDef(localDef);
      zedObject.setState(state);
      zedObject.setInitialState(initialState);
      if(operation != null) {
        zedObject.getOperation().addAll(operation);
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
    Object[] erg = { getName(), getFormalParameters(), getVisibilityList(), getInheritedClass(), getLocalDef(), getState(), getInitialState(), getOperation() };
    return erg;
  }

  private net.sourceforge.czt.z.ast.DeclName mName;

  public net.sourceforge.czt.z.ast.DeclName getName()
  {
    return mName;
  }

  public void setName(net.sourceforge.czt.z.ast.DeclName name)
  {
    mName = name;
  }

  private FormalParameters mFormalParameters;

  public FormalParameters getFormalParameters()
  {
    return mFormalParameters;
  }

  public void setFormalParameters(FormalParameters formalParameters)
  {
    mFormalParameters = formalParameters;
  }

  private StringListType mVisibilityList;

  public StringListType getVisibilityList()
  {
    return mVisibilityList;
  }

  public void setVisibilityList(StringListType visibilityList)
  {
    mVisibilityList = visibilityList;
  }

  private java.util.List mInheritedClass = new java.util.Vector();

  public java.util.List getInheritedClass()
  {
    return mInheritedClass;
  }

  private LocalDef mLocalDef;

  public LocalDef getLocalDef()
  {
    return mLocalDef;
  }

  public void setLocalDef(LocalDef localDef)
  {
    mLocalDef = localDef;
  }

  private State mState;

  public State getState()
  {
    return mState;
  }

  public void setState(State state)
  {
    mState = state;
  }

  private InitialState mInitialState;

  public InitialState getInitialState()
  {
    return mInitialState;
  }

  public void setInitialState(InitialState initialState)
  {
    mInitialState = initialState;
  }

  private java.util.List mOperation = new java.util.Vector();

  public java.util.List getOperation()
  {
    return mOperation;
  }
}
