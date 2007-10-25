/*
  Copyright (C) 2007 Petra Malik
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

package net.sourceforge.czt.print.z;

import java.util.Properties;

import net.sourceforge.czt.base.ast.Term;
import net.sourceforge.czt.print.util.PrettyPrinter;
import net.sourceforge.czt.print.util.PrintException;
import net.sourceforge.czt.print.util.PrintPropertiesKeys;
import net.sourceforge.czt.print.util.TokenSequence;
import net.sourceforge.czt.session.CommandException;
import net.sourceforge.czt.session.SectionManager;

public class AbstractPrinterCommand
{
  public TokenSequence toUnicode(Term term,
                                 SectionManager sectInfo,
                                 String sectionName,
                                 Properties props)
  {
    Term tree = preprocess(term, sectInfo, sectionName);
    PrecedenceParenAnnVisitor precVisitor =
      new PrecedenceParenAnnVisitor();
    tree.accept(precVisitor);
    TokenSequenceVisitor visitor = new TokenSequenceVisitor(props);
    tree.accept(visitor);
    TokenSequence tseq = visitor.getResult();
    int textWidth = textWidth(props);
    if (textWidth > 0) {
      PrettyPrinter prettyPrinter = new PrettyPrinter();
      prettyPrinter.setLineWidth(textWidth);
      prettyPrinter.handleTokenSequence(tseq, 0);
    }
    return tseq;
  }


  protected int textWidth(Properties props)
  {
    String value = props.getProperty(PrintPropertiesKeys.PROP_TXT_WIDTH);
    try {
      return Integer.valueOf(value);
    }
    catch (NumberFormatException e) {
      return -1;
    }
  }

  protected Term preprocess(Term term,
                            SectionManager manager,
                            String section)
    throws PrintException
  {
    AstToPrintTreeVisitor toPrintTree = new AstToPrintTreeVisitor(manager);
    return toPrintTree(toPrintTree, term, section);
  }

  protected Term toPrintTree(AstToPrintTreeVisitor toPrintTree,
                             Term term,
                             String sectionName)
  {
    try {
      return (Term) toPrintTree.run(term, sectionName);
    }
    catch (CommandException exception) {
      String msg =
        "A command exception occurred while trying to print Unicode markup " +
        "for term within section " + sectionName;
      throw new PrintException(msg, exception);
    }
  }
}
