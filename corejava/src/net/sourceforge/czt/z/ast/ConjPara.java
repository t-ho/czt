
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
package net.sourceforge.czt.z.ast;

import net.sourceforge.czt.base.ast.*;

/**
 * A (generic) conjecture paragraph (C.4.11, C.4.12).
 *
 * @author Gnast version 0.1
 */
public interface ConjPara extends Para
{

  /**
   * <p>Returns the DeclName elements.</p>
   * <p>To add or remove elements, use the methods provided by
   * the List interface (that's why there is no need for a setter
   * method).</p>
   *
   * @return a list of DeclName elements.
   */
  java.util.List getDeclName();

  /**
   * Returns the Pred element.
   *
   * @return the Pred element.
   */
  Pred getPred();

  /**
   * Sets the Pred element.
   *
   * @param pred   the Pred element.
   * @see #getPred
   */
  void setPred(Pred pred);
}
