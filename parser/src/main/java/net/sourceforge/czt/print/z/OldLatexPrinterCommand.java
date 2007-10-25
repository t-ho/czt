/*
  Copyright (C) 2006, 2007 Petra Malik
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

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Properties;

import net.sourceforge.czt.java_cup.runtime.Symbol;

import net.sourceforge.czt.base.ast.Term;
import net.sourceforge.czt.print.ast.*;
import net.sourceforge.czt.print.util.OldLatexString;
import net.sourceforge.czt.print.util.PrintException;
import net.sourceforge.czt.print.util.PrintPropertiesKeys;
import net.sourceforge.czt.session.*;
import net.sourceforge.czt.util.CztException;
import net.sourceforge.czt.z.util.Section;

public class OldLatexPrinterCommand
  extends AbstractLatexPrinterCommand
  implements Command
{
  public boolean compute(String name, SectionManager manager)
    throws CommandException
  {
    try {
      final Writer writer = new StringWriter();
      final Key key = new Key(name, Term.class);
      final Term term = (Term) manager.get(key);
      printOldLatex(term, writer, manager);
      writer.close();
      manager.put(new Key(name, OldLatexString.class),
                  new OldLatexString(writer.toString()));
      return true;
    }
    catch (IOException e) {
      throw new CommandException(e);
    }
  }

  public void printOldLatex(Term term,
                            Writer out,
                            SectionManager sectInfo)
  {
    String sectionName = Section.STANDARD_TOOLKIT.getName();
    printOldLatex(term, out, sectInfo, sectionName);
  }

  public void printOldLatex(Term term,
                            Writer out,
                            SectionManager sectInfo,
                            String sectionName)
  {
    term.accept(new ToSpiveyZVisitor());
    AstToPrintTreeVisitor toPrintTree =
      new AstToPrintTreeVisitor(sectInfo);
    toPrintTree.setOldZ(true);
    Term tree = toPrintTree(toPrintTree, term, sectionName);
    Properties props = new Properties(sectInfo.getProperties());
    props.setProperty(PrintPropertiesKeys.PROP_Z_EVES, "true");
    ZmlScanner scanner = new ZmlScanner(tree, props);
    Unicode2OldLatex parser = new Unicode2OldLatex(prepare(scanner, term));
    parser.setSectionInfo(sectInfo, sectionName);
    UnicodePrinter printer = new UnicodePrinter(out);
    parser.setWriter(printer);
    try {
      parser.parse();
    }
    catch (Exception e) {
      String msg = "An exception occurred while trying to print " +
        "old (Spivey's) LaTeX markup.";
      throw new PrintException(msg, e);
    }
  }
}
