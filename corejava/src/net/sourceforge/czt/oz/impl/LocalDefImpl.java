
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
import net.sourceforge.czt.util.TypesafeList;
import net.sourceforge.czt.z.ast.*;
import net.sourceforge.czt.z.impl.*;
import net.sourceforge.czt.oz.ast.*;
import net.sourceforge.czt.oz.visitor.*;

import net.sourceforge.czt.oz.visitor.LocalDefVisitor;

/**
 * An implementation of the interface
 * {@link LocalDef}.
 *
 * @author Gnast version 0.1
 */
public class LocalDefImpl
  extends TermAImpl   implements LocalDef
{
  /**
   * The default constructor.
   *
   * Do not use it explicitly, unless you are extending this class.
   * If you want to create an instance of this class, please use the
   * {@link OzFactory object factory}.
   */
  protected LocalDefImpl()
  {
  }

  /**
   * Compares the specified object with this LocalDefImpl
   * for equality.  Returns true if and only if the specified object is
   * also a(n) LocalDefImpl and all the getter methods except getAnns
   * return equal objects.
   */
  public boolean equals(Object obj)
  {
    if (obj != null) {
      if (this.getClass().equals(obj.getClass()) && super.equals(obj)) {
        LocalDefImpl object = (LocalDefImpl) obj;
        if (givenPara_ != null) {
          if (!givenPara_.equals(object.givenPara_)) {
            return false;
          }
        } else {
          if (object.givenPara_ != null) {
            return false;
          }
        }
        if (axPara_ != null) {
          if (!axPara_.equals(object.axPara_)) {
            return false;
          }
        } else {
          if (object.axPara_ != null) {
            return false;
          }
        }
        if (freePara_ != null) {
          if (!freePara_.equals(object.freePara_)) {
            return false;
          }
        } else {
          if (object.freePara_ != null) {
            return false;
          }
        }
        return true;
      }
    }
    return false;
  }

  /**
   * Returns the hash code value for this LocalDefImpl.
   * The hash code of a LocalDefImpl is defined to be
   * the result of the following calculation:
   *
   * @czt.todo Write the calculation procedure for method hashCode().
   */
  public int hashCode()
  {
    final int constant = 31;

    int hashCode = super.hashCode();
    hashCode += "LocalDefImpl".hashCode();
    if (givenPara_ != null) {
      hashCode += constant * givenPara_.hashCode();
    }
    if (axPara_ != null) {
      hashCode += constant * axPara_.hashCode();
    }
    if (freePara_ != null) {
      hashCode += constant * freePara_.hashCode();
    }
    return hashCode;
  }

  /**
   * Accepts a visitor.
   */
  public Object accept(net.sourceforge.czt.util.Visitor v)
  {
    if (v instanceof LocalDefVisitor) {
      LocalDefVisitor visitor = (LocalDefVisitor) v;
      return visitor.visitLocalDef(this);
    }
    return super.accept(v);
  }

  /**
   * Returns a new object of this class.
   */
  public net.sourceforge.czt.base.ast.Term create(Object[] args)
  {
    LocalDef zedObject = null;
    try {
      java.util.List givenPara = (java.util.List) args[0];
      java.util.List axPara = (java.util.List) args[1];
      java.util.List freePara = (java.util.List) args[2];
      zedObject = new LocalDefImpl();
      if (givenPara != null) {
        zedObject.getGivenPara().addAll(givenPara);
      }
      if (axPara != null) {
        zedObject.getAxPara().addAll(axPara);
      }
      if (freePara != null) {
        zedObject.getFreePara().addAll(freePara);
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
    Object[] erg = { getGivenPara(), getAxPara(), getFreePara() };
    return erg;
  }


  private java.util.List givenPara_ =
    new TypesafeList(net.sourceforge.czt.z.ast.GivenPara.class);

  public java.util.List getGivenPara()
  {
    return givenPara_;
  }


  private java.util.List axPara_ =
    new TypesafeList(net.sourceforge.czt.z.ast.AxPara.class);

  public java.util.List getAxPara()
  {
    return axPara_;
  }


  private java.util.List freePara_ =
    new TypesafeList(net.sourceforge.czt.z.ast.FreePara.class);

  public java.util.List getFreePara()
  {
    return freePara_;
  }
}
