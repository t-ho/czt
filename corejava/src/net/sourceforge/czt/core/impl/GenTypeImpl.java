
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

import net.sourceforge.czt.core.visitor.GenTypeVisitor;

/**
 * An implementation of the interface
 * {@link GenType}.
 *
 * @author Gnast version 0.1
 */
public class GenTypeImpl
extends TypeImpl implements GenType
{
  private static final Logger sLogger =
    Logger.getLogger("net.sourceforge.czt.core.impl.GenTypeImpl");

  /**
   * The default constructor.
   *
   * Do not use it explicitly, unless you are extending this class.
   * If you want to create an instance of this class, please use the
   * {@link CoreFactory object factory}.
   */
  protected GenTypeImpl() { }

  /**
   * Compares the specified object with this GenTypeImpl
   * for equality.  Returns true if and only if the specified object is
   * also a(n) GenTypeImpl and all the getter methods except getAnns
   * return equal objects.
   */
  public boolean equals(Object obj)
  {
    if(obj != null &&
       this.getClass().equals(obj.getClass()) &&
       super.equals(obj)) {
      GenTypeImpl object = (GenTypeImpl) obj;
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
   * Returns the hash code value for this GenTypeImpl.
   * The hash code of a GenTypeImpl is defined to be
   * the result of the following calculation:
   *
   * @czt.todo Write the calculation procedure for method hashCode().
   */
  public int hashCode()
  {
    int hashCode = super.hashCode();
    hashCode += "GenTypeImpl".hashCode();
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
    if (v instanceof GenTypeVisitor)
    {
      GenTypeVisitor visitor = (GenTypeVisitor) v;
      return visitor.visitGenType(this);
    }
    return super.accept(v);
  }

  /**
   * Returns a new object of this class.
   */
  public Term create(Object[] args) {
    sLogger.entering("GenTypeImpl", "create", args);
    GenType zedObject = null;
    try {
      DeclName name = (DeclName) args[0];
      zedObject = new GenTypeImpl();
      zedObject.setName(name);
    } catch (IndexOutOfBoundsException e) {
      throw new IllegalArgumentException();
    } catch (ClassCastException e) {
      throw new IllegalArgumentException();
    }
    sLogger.exiting("GenTypeImpl", "create", zedObject);
    return zedObject;
  }

  public Object[] getChildren()
  {
    sLogger.entering("GenTypeImpl", "getChildren");
    Object[] erg = { getName() };
    sLogger.exiting("GenTypeImpl", "getChildren", erg);
    return erg;
  }

  private DeclName mName;

  public DeclName getName()
  {
    return mName;
  }

  public void setName(DeclName name)
  {
    mName = name;
  }
}
