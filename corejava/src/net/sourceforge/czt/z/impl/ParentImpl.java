
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

package net.sourceforge.czt.z.impl;

import java.util.*;
import java.util.logging.*;

import net.sourceforge.czt.base.impl.*;
import net.sourceforge.czt.z.ast.*;
import net.sourceforge.czt.z.visitor.*;

import net.sourceforge.czt.z.visitor.ParentVisitor;

/**
 * An implementation of the interface
 * {@link Parent}.
 *
 * @author Gnast version 0.1
 */
public class ParentImpl
extends TermAImpl implements Parent
{
  /**
   * The default constructor.
   *
   * Do not use it explicitly, unless you are extending this class.
   * If you want to create an instance of this class, please use the
   * {@link ZFactory object factory}.
   */
  protected ParentImpl() { }

  /**
   * Compares the specified object with this ParentImpl
   * for equality.  Returns true if and only if the specified object is
   * also a(n) ParentImpl and all the getter methods except getAnns
   * return equal objects.
   */
  public boolean equals(Object obj)
  {
    if(obj != null &&
       this.getClass().equals(obj.getClass()) &&
       super.equals(obj)) {
      ParentImpl object = (ParentImpl) obj;
      if((mWord == null && object.mWord != null) ||
         (mWord != null &&
         ! mWord.equals(object.mWord))) return false;
      if(mWord == null && object.mWord != null)
        return false;
      return true;
    }
    return false;
  }

  /**
   * Returns the hash code value for this ParentImpl.
   * The hash code of a ParentImpl is defined to be
   * the result of the following calculation:
   *
   * @czt.todo Write the calculation procedure for method hashCode().
   */
  public int hashCode()
  {
    int hashCode = super.hashCode();
    hashCode += "ParentImpl".hashCode();
    if(mWord != null) {
      hashCode += 31*mWord.hashCode();
    }
    return hashCode;
  }

  /**
   * Accepts a visitor.
   */
  public Object accept(net.sourceforge.czt.util.Visitor v)
  {
    if (v instanceof ParentVisitor)
    {
      ParentVisitor visitor = (ParentVisitor) v;
      return visitor.visitParent(this);
    }
    return super.accept(v);
  }

  /**
   * Returns a new object of this class.
   */
  public net.sourceforge.czt.base.ast.Term create(Object[] args) {
    Parent zedObject = null;
    try {
      String word = (String) args[0];
      zedObject = new ParentImpl();
      zedObject.setWord(word);
    } catch (IndexOutOfBoundsException e) {
      throw new IllegalArgumentException();
    } catch (ClassCastException e) {
      throw new IllegalArgumentException();
    }
    return zedObject;
  }

  public Object[] getChildren()
  {
    Object[] erg = { getWord() };
    return erg;
  }

  private String mWord;

  public String getWord()
  {
    return mWord;
  }

  public void setWord(String word)
  {
    mWord = word;
  }
}
