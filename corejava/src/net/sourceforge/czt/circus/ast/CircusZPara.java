
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
 * A Z paragraph in a Circus specification. This is a wrapper class allowing us to differentiate
    		Z paragraphs outside a process definition. This is important because (standard) Z paragraphs are allowed anywhere,
    		but Circus paragraphs are not allowed inside process definition. Therefore, a Circus paragraph cannot
    		directly extend a Z paragraph. With this distinction of Circus paragraph not being a Z paragraph extension, 
    		we can enforce that Circus paragraphs do not appear inside process definition.
    		At the same time, with a CircusZPara wrapper we ensure that a Circus specification can indeed contain
    		Z paragraph outside a process.
 *
 * @author Gnast version 0.1
 */
public interface CircusZPara extends CircusPara
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
