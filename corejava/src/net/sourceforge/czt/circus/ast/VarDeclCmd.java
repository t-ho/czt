
/******************************************************************************
DO NOT EDIT THIS FILE!  THIS FILE WAS GENERATED BY GNAST
FROM THE TEMPLATE FILE AstInterface.vm.
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

package net.sourceforge.czt.circus.ast;

import net.sourceforge.czt.base.ast.*;
import net.sourceforge.czt.z.ast.*;

/**
 * Command declaring variables local to an action definition.
 *
 * @author Gnast version 0.1
 */
public interface VarDeclCmd extends Command
{

  /**
   * Returns the VarDecl element.
   *
   * @return the VarDecl element.
   */
  net.sourceforge.czt.z.ast.VarDecl getVarDecl();

  /**
   * Sets the VarDecl element.
   *
   * @param varDecl   the VarDecl element.
   * @see #getVarDecl
   */
  void setVarDecl(net.sourceforge.czt.z.ast.VarDecl varDecl);

  /**
   * Returns the ActionDef element.
   *
   * @return the ActionDef element.
   */
  ActionDef getActionDef();

  /**
   * Sets the ActionDef element.
   *
   * @param actionDef   the ActionDef element.
   * @see #getActionDef
   */
  void setActionDef(ActionDef actionDef);
}
