
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
package net.sourceforge.czt.tcoz.ast;

import net.sourceforge.czt.base.ast.*;
import net.sourceforge.czt.z.ast.*;
import net.sourceforge.czt.oz.ast.*;

/**
 *
 * @author Gnast version 0.1
 */
public interface WaitUntilProExpr extends OperationExpr
{

  /**
   * Returns the OperationExpr element.
   *
   * @return the OperationExpr element.
   */
  net.sourceforge.czt.oz.ast.OperationExpr getOperationExpr();

  /**
   * Sets the OperationExpr element.
   *
   * @param operationExpr   the OperationExpr element.
   * @see #getOperationExpr
   */
  void setOperationExpr(net.sourceforge.czt.oz.ast.OperationExpr operationExpr);

  /**
   * Returns the WaitUntil element.
   *
   * @return the WaitUntil element.
   */
  net.sourceforge.czt.z.ast.Expr1 getWaitUntil();

  /**
   * Sets the WaitUntil element.
   *
   * @param waitUntil   the WaitUntil element.
   * @see #getWaitUntil
   */
  void setWaitUntil(net.sourceforge.czt.z.ast.Expr1 waitUntil);
}
