
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
 * A Z paragraph contained into a process definition. We need to declare it separately in order 
				ensure that a Z paragraph placed inside a process is also a process paragraph.
				That is different from a Z paragraph outside a process definition (see CircusZPara).
				Both classes are needed in order to allow differentiation of Z paragraphs at different point 
				in the AST hierarchy.
 *
 * @author Gnast version 0.1
 */
public interface ProcZPara extends ProcPara
{

  /**
   * Returns the Para element.
   *
   * @return the Para element.
   */
  net.sourceforge.czt.z.ast.Para getPara();

  /**
   * Sets the Para element.
   *
   * @param para   the Para element.
   * @see #getPara
   */
  void setPara(net.sourceforge.czt.z.ast.Para para);
}
