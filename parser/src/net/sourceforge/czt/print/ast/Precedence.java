/*
  Copyright (C) 2004, 2006 Petra Malik
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

package net.sourceforge.czt.print.ast;

import java.util.HashMap;
import java.util.Map;

public class Precedence
  implements Comparable
{
  private Integer prec1_;
  private Integer prec2_;
  private static final Map<Integer,Precedence> map_ =
    new HashMap<Integer,Precedence>();

  public static Precedence precedence(int prec)
  {
    Precedence result = map_.get(prec);
    if (result == null) {
      result = new Precedence(prec);
      map_.put(prec, result);
    }
    return result;
  }

  public static Precedence precedence(int prec1, int prec2)
  {
    return new Precedence(prec1, prec2);
  }

  private Precedence(int prec)
  {
    prec1_ = new Integer(prec);
    prec2_ = new Integer(0);
  }

  private Precedence(int prec1, int prec2)
  {
    prec1_ = new Integer(prec1);
    prec2_ = new Integer(prec2);
  }

  public int compareTo(Object o)
  {
    Precedence p = (Precedence) o;
    final int compareFirst = prec1_.compareTo(p.prec1_);
    if (compareFirst == 0) return prec2_.compareTo(p.prec2_);
    return compareFirst;
  }

  public boolean equals(Object o)
  {
    if (o != null && getClass().equals(o.getClass())) {
      Precedence p = (Precedence) o;
      return prec1_.equals(p.prec1_) && prec2_.equals(p.prec2_);
    }
    return false;
  }

  public int hashCode()
  {
    return prec1_.hashCode() + 31 * prec2_.hashCode();
  }
}
