/*
  Copyright (C) 2006 Mark Utting
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

package net.sourceforge.czt.z.util;

import java.util.ResourceBundle;

import net.sourceforge.czt.base.ast.*;
import net.sourceforge.czt.base.visitor.*;
import net.sourceforge.czt.util.Visitor;

public class ConcreteSyntaxDescriptionVisitor
  implements TermVisitor<String>
{
  private String resourceName_ =
    "net.sourceforge.czt.z.util.LongDescriptionResourceBundle";
  private Visitor<ConcreteSyntaxSymbol> visitor_ =
    new ConcreteSyntaxSymbolVisitor();
  private Visitor<String> nameVisitor_ = new GetNameVisitor();

  public ConcreteSyntaxDescriptionVisitor()
  {
  }

  public ConcreteSyntaxDescriptionVisitor(String resourceName)
  {
    resourceName_ = resourceName;
  }

  public ConcreteSyntaxDescriptionVisitor(Visitor<ConcreteSyntaxSymbol> v)
  {
    visitor_ = v;
  }

  public ConcreteSyntaxDescriptionVisitor(String resourceName,
                                          Visitor<ConcreteSyntaxSymbol> v)
  {
    resourceName_ = resourceName;
    visitor_ = v;
  }

  public ConcreteSyntaxDescriptionVisitor(String resourceName,
                                          Visitor<ConcreteSyntaxSymbol> v,
                                          Visitor<String> nameVisitor)
  {
    resourceName_ = resourceName;
    visitor_ = v;
    nameVisitor_ = nameVisitor;
  }

  public String visitTerm(Term term)
  {
    ConcreteSyntaxSymbol symbol = term.accept(visitor_);
    String localized =
      ResourceBundle.getBundle(resourceName_).getString(symbol.toString());
    String name = term.accept(nameVisitor_);
    if (name != null) return localized + " \"" + name + "\"";
    else return localized;
  }
}
