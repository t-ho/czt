
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

package net.sourceforge.czt.zpatt.dom;

import java.util.logging.Logger;
import java.util.*;
import org.w3c.dom.*;

import net.sourceforge.czt.zpatt.util.ZPattVisitor;
import net.sourceforge.czt.zpatt.ast.*;
import net.sourceforge.czt.core.ast.*;


/**
 * Transformer from AST classes to a DOM tree.
 *
 * @author Gnast version 0.1
 */
public class AstToDom extends net.sourceforge.czt.core.dom.AstToDom implements ZPattVisitor
{
  private static final Logger sLogger =
    Logger.getLogger("net.sourceforge.czt.zpatt.dom.AstToDom");


  public AstToDom(Document document)
  {
    super(document);
  }


  public Object visitJokerExpr(JokerExpr zedObject)
  {
    sLogger.entering("dom.AstToDom", "visitJokerExpr", zedObject);
    Element elem = mDocument.createElementNS("http://czt.sourceforge.net/zml", "JokerExpr");
    try {
      if (zedObject.getName()!=null) {
        elem.setAttributeNS("http://czt.sourceforge.net/zml", "Name", zedObject.getName().toString());
      }
    } catch(Exception e) { e.printStackTrace(); }

    sLogger.exiting("dom.AstToDom", "visitJokerExpr", elem);
    return elem;
  }

  public Object visitSubstitute(Substitute zedObject)
  {
    sLogger.entering("dom.AstToDom", "visitSubstitute", zedObject);
    Element elem = mDocument.createElementNS("http://czt.sourceforge.net/zml", "Substitute");
    try {
      for(Iterator iter=zedObject.getExpr().iterator(); iter.hasNext();) {
	Object o = iter.next();
	if (o instanceof Term) {
	  Node node = (Node) ((Term) o).accept(this);
	  elem.appendChild(node);
	} else {
	  elem.appendChild(mDocument.createTextNode(o.toString()));
	}
      }
      for(Iterator iter=zedObject.getPred().iterator(); iter.hasNext();) {
	Object o = iter.next();
	if (o instanceof Term) {
	  Node node = (Node) ((Term) o).accept(this);
	  elem.appendChild(node);
	} else {
	  elem.appendChild(mDocument.createTextNode(o.toString()));
	}
      }
    } catch(Exception e) { e.printStackTrace(); }

    sLogger.exiting("dom.AstToDom", "visitSubstitute", elem);
    return elem;
  }

  public Object visitJokerPred(JokerPred zedObject)
  {
    sLogger.entering("dom.AstToDom", "visitJokerPred", zedObject);
    Element elem = mDocument.createElementNS("http://czt.sourceforge.net/zml", "JokerPred");
    try {
      if (zedObject.getName()!=null) {
        elem.setAttributeNS("http://czt.sourceforge.net/zml", "Name", zedObject.getName().toString());
      }
    } catch(Exception e) { e.printStackTrace(); }

    sLogger.exiting("dom.AstToDom", "visitJokerPred", elem);
    return elem;
  }

  public Object visitSubstList(SubstList zedObject)
  {
    sLogger.entering("dom.AstToDom", "visitSubstList", zedObject);
    Element elem = mDocument.createElementNS("http://czt.sourceforge.net/zml", "SubstList");
    try {
      for(Iterator iter=zedObject.getSubstitute().iterator(); iter.hasNext();) {
	Object o = iter.next();
	if (o instanceof Term) {
	  Node node = (Node) ((Term) o).accept(this);
	  elem.appendChild(node);
	} else {
	  elem.appendChild(mDocument.createTextNode(o.toString()));
	}
      }
    } catch(Exception e) { e.printStackTrace(); }

    sLogger.exiting("dom.AstToDom", "visitSubstList", elem);
    return elem;
  }
}
