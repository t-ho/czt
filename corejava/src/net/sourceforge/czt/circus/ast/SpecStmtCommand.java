
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
 * Command declaring a specification statement
        in Carroll Morgan's style.
 *
 * @author Gnast version 0.1
 */
public interface SpecStmtCommand extends Command
{

  /**
   * <p>Returns the Frame elements.</p>
   * <p>To add or remove elements, use the methods provided by
   * the List interface (that's why there is no need for a setter
   * method).</p>
   *
   * @return a list of RefName elements.
   */
  net.sourceforge.czt.base.ast.ListTerm getFrame();

  /**
   * Returns the Pre element.
   *
   * @return the Pre element.
   */
  net.sourceforge.czt.z.ast.Pred getPre();

  /**
   * Sets the Pre element.
   *
   * @param pre   the Pre element.
   * @see #getPre
   */
  void setPre(net.sourceforge.czt.z.ast.Pred pre);

  /**
   * Returns the Post element.
   *
   * @return the Post element.
   */
  net.sourceforge.czt.z.ast.Pred getPost();

  /**
   * Sets the Post element.
   *
   * @param post   the Post element.
   * @see #getPost
   */
  void setPost(net.sourceforge.czt.z.ast.Pred post);
}
