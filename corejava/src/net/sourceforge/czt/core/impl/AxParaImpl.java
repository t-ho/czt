
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
 * {@link AxPara}.
 *
 * @author Gnast version 0.1
 */
public class AxParaImpl
extends ParaImpl implements AxPara
{
  private static final Logger sLogger =
    Logger.getLogger("net.sourceforge.czt.core.impl.AxParaImpl");

  /**
   * The constructor.
   *
   * Do not use it explicitly, unless you are extending this class.
   * If you want to create an instance of this class, please use the
   * {@link CoreFactory object factory}.
   */
  protected AxParaImpl(java.util.List declName)
  {
    super();
    mDeclName = new ImmutableList(declName);
  }
 
  /**
   * Compares the specified object with this AxParaImpl
   * for equality.  Returns true if and only if the specified object is
   * also a(n) AxParaImpl and all the getter methods except getAnns
   * return equal objects.
   */
  public boolean equals(Object obj)
  {
    if(obj != null &&
       this.getClass().equals(obj.getClass()) &&
       super.equals(obj)) {
      AxParaImpl object = (AxParaImpl) obj;
      if((mDeclName == null && object.mDeclName != null) ||
         (mDeclName != null &&
         ! mDeclName.equals(object.mDeclName))) return false;
      if(mDeclName == null && object.mDeclName != null)
        return false;
      if((mSchText == null && object.mSchText != null) ||
         (mSchText != null &&
         ! mSchText.equals(object.mSchText))) return false;
      if(mSchText == null && object.mSchText != null)
        return false;
      if((mBox == null && object.mBox != null) ||
         (mBox != null &&
         ! mBox.equals(object.mBox))) return false;
      if(mBox == null && object.mBox != null)
        return false;
      return true;
    }
    return false;
  }

  /**
   * Returns the hash code value for this AxParaImpl.
   * The hash code of a AxParaImpl is defined to be
   * the result of the following calculation:
   *
   * @czt.todo Write the calculation procedure for method hashCode().
   */
  public int hashCode()
  {
    int hashCode = super.hashCode();
    hashCode += "AxParaImpl".hashCode();
    if(mDeclName != null) {
      hashCode += 31*mDeclName.hashCode();
    }
    if(mSchText != null) {
      hashCode += 31*mSchText.hashCode();
    }
    if(mBox != null) {
      hashCode += 31*mBox.hashCode();
    }
    return hashCode;
  }

  /**
   * Accepts a visitor.
   */
  public Object accept(AstVisitor v) {
    return v.visitAxPara(this);
  }

  /**
   * Returns a new object of this class.
   */
  public Term create(Object[] args) {
    sLogger.entering("AxParaImpl", "create", args);
    AxPara zedObject = null;
    try {
      java.util.List declName = (java.util.List) args[0];
      SchText schText = (SchText) args[1];
      Box box = (Box) args[2];
      zedObject = new AxParaImpl(declName);
      zedObject.setSchText(schText);
      zedObject.setBox(box);
    } catch (IndexOutOfBoundsException e) {
      throw new IllegalArgumentException();
    } catch (ClassCastException e) {
      throw new IllegalArgumentException();
    }
    sLogger.exiting("AxParaImpl", "create", zedObject);
    return zedObject;
  }

  public Object[] getChildren()
  {
    sLogger.entering("AxParaImpl", "getChildren");
    Object[] erg = { getDeclName(), getSchText(), getBox() };
    sLogger.exiting("AxParaImpl", "getChildren", erg);
    return erg;
  }

  private ImmutableList mDeclName;

  public ImmutableList getDeclName()
  {
    return mDeclName;
  }

  private SchText mSchText;

  public SchText getSchText()
  {
    return mSchText;
  }

  public void setSchText(SchText schText)
  {
    mSchText = schText;
  }

  private Box mBox;

  public Box getBox()
  {
    return mBox;
  }

  public void setBox(Box box)
  {
    mBox = box;
  }
}
