/*
  Copyright (C) 2006 Petra Malik
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

package net.sourceforge.czt.rules;

import java.io.Writer;
import java.util.Properties;

import net.sourceforge.czt.java_cup.runtime.Symbol;

import net.sourceforge.czt.base.ast.Term;
import net.sourceforge.czt.print.ast.*;
import net.sourceforge.czt.print.util.PrintPropertiesKeys;
import net.sourceforge.czt.print.z.PrecedenceParenAnnVisitor;
import net.sourceforge.czt.print.z.UnicodePrinter;
import net.sourceforge.czt.print.zpatt.SectHeadScanner;
import net.sourceforge.czt.print.zpatt.Sym;
import net.sourceforge.czt.print.zpatt.Unicode2Latex;
import net.sourceforge.czt.print.zpatt.ZmlScanner;
import net.sourceforge.czt.print.zpatt.ZpattPrintVisitor;
import net.sourceforge.czt.session.*;
import net.sourceforge.czt.util.CztException;
import net.sourceforge.czt.z.ast.Para;
import net.sourceforge.czt.zpatt.ast.Binding;

/**
 * Utilities for printing Z specifications given as an AST.
 *
 * @author Petra Malik
 */
public final class PrintUtils
{
  /**
   * Do not create instances of this class.
   */
  private PrintUtils()
  {
  }

  /**
   * Prints a given term (usually a Spec or Sect) in the specified
   * markup to the given writer.  The section information is used to
   * obtain the operator table and latex markup table needed for
   * printing, and should therefore be able to provide information of
   * type <code>net.sourceforge.czt.parser.util.OpTable.class</code>
   * and
   * <code>net.sourceforge.czt.parser.util.LatexMarkupTable.class</code>.
   *
   * This method may be used for terms like Spec and Sect that contain
   * a section header so that context information can be obtained from
   * the tree itself.  See {@link
   * #print(Term,Writer,SectionManager,String,Markup)} for
   * writing trees that do not contain context information.
   */
  public static void print(Term term,
                           Writer out,
                           SectionManager sectInfo,
                           Markup markup)
  {
    if (markup == Markup.LATEX) {
      printLatex(term, out, sectInfo);
    }
    else if (markup == Markup.UNICODE) {
      printUnicode(term, out, sectInfo);
    }
    else {
      String message = "Attempt to print unsupported markup";
      throw new UnsupportedOperationException(message);
    }
  }

  public static void print(Term term,
                           Writer out,
                           SectionManager sectInfo,
                           String sectName,
                           Markup markup)
  {
    if (markup == Markup.LATEX) {
      printLatex(term, out, sectInfo, sectName);
    }
    else if (markup == Markup.UNICODE) {
      printUnicode(term, out, sectInfo, sectName);
    }
    else {
      String message = "Attempt to print unsupported markup";
      throw new UnsupportedOperationException(message);
    }
  }

  /**
   * Prints a given term (usually a Spec or Sect) as latex markup to
   * the given writer.  The section information is used to obtain the
   * operator table and latex markup table needed for printing, and
   * should therefore be able to provide information of type
   * <code>net.sourceforge.czt.parser.util.OpTable.class</code> and
   * <code>net.sourceforge.czt.parser.util.LatexMarkupTable.class</code>.
   *
   * This method may be used for terms like Spec and Sect that contain
   * a section header so that context information can be obtained from
   * the tree itself.  See {@link
   * #printLatex(Term,Writer,SectionManager,String)} for
   * writing trees that do not contain context information.
   */
  public static void printLatex(Term term, Writer out, SectionManager sectInfo)
  {
    net.sourceforge.czt.rules.AstToPrintTreeVisitor toPrintTree =
      new net.sourceforge.czt.rules.AstToPrintTreeVisitor(sectInfo);
    Term tree = (Term) term.accept(toPrintTree);
    ZmlScanner scanner = new ZmlScanner(tree, sectInfo.getProperties());
    Unicode2Latex parser = new Unicode2Latex(new SectHeadScanner(scanner));
    parser.setSectionInfo(sectInfo);
    UnicodePrinter printer = new UnicodePrinter(out);
    parser.setWriter(printer);
    try {
      parser.parse();
    }
    catch (Exception e) {
      throw new CztException(e);
    }
  }

  /**
   * Prints a given term (usually an Expr or Pred) as latex markup to
   * the given writer.  The name of section (where this term belongs
   * to) and the section information is used to obtain the operator
   * table and latex markup table needed for printing.  The section
   * information should therefore be able to provide information of
   * type <code>net.sourceforge.czt.parser.util.OpTable.class</code>
   * and
   * <code>net.sourceforge.czt.parser.util.LatexMarkupTable.class</code>.
   *
   * This method may be used for terms like Expr and Pred that do not
   * contain a section header so that context information cannot be
   * obtained from the tree itself.  See
   * {@link #printLatex(Term,Writer,SectionManager)} for writing trees that do
   * contain context information.
   */
  public static void printLatex(Term term,
                                Writer out,
                                SectionManager sectInfo,
                                String sectionName)
  {
    AstToPrintTreeVisitor toPrintTree = new AstToPrintTreeVisitor(sectInfo);
    Term tree;
    try {
      tree = (Term) toPrintTree.run(term, sectionName);
    }
    catch (CommandException exception) {
      throw new CztException(exception);
    }
    ZmlScanner scanner = new ZmlScanner(tree, sectInfo.getProperties());
    if (tree instanceof Para) {
      scanner.prepend(new Symbol(Sym.PARA_START));
      scanner.append(new Symbol(Sym.PARA_END));
    }
    else {
      scanner.prepend(new Symbol(Sym.TOKENSEQ));
      scanner.append(new Symbol(Sym.TOKENSEQ));
    }
    Unicode2Latex parser = new Unicode2Latex(scanner);
    parser.setSectionInfo(sectInfo, sectionName);
    UnicodePrinter printer = new UnicodePrinter(out);
    parser.setWriter(printer);
    try {
      parser.parse();
    }
    catch (Exception e) {
      throw new CztException(e);
    }
  }

  /**
   * Prints a given term (usually a Spec or Sect) as unicode to the
   * given writer.  The section information is used to obtain the
   * operator table and latex markup table needed for printing, and
   * should therefore be able to provide information of type
   * <code>net.sourceforge.czt.parser.util.OpTable.class</code>.
   *
   * This method may be used for terms like Spec and Sect that contain
   * a section header so that context information can be obtained from
   * the tree itself.  See
   * {@link #printUnicode(Term,Writer,SectionManager,String)} for writing trees
   * that do not contain context information.
   */
  public static void printUnicode(Term term,
                                  Writer out,
                                  SectionManager sectInfo)
  {
    AstToPrintTreeVisitor toPrintTree = new AstToPrintTreeVisitor(sectInfo);
    Term tree = (Term) term.accept(toPrintTree);
    PrecedenceParenAnnVisitor precVisitor =
      new PrecedenceParenAnnVisitor();
    tree.accept(precVisitor);
    UnicodePrinter printer = new UnicodePrinter(out);
    Properties props = sectInfo.getProperties();
    ZpattPrintVisitor visitor = new ZpattPrintVisitor(printer, props);
    tree.accept(visitor);
  }

  /**
   * Prints a given term (usually an Expr or Pred) as unicode to the
   * given writer.  The name of section (where this term belongs to)
   * and the section information is used to obtain the operator table
   * and latex markup table needed for printing.  The section
   * information should therefore be able to provide information of
   * type <code>net.sourceforge.czt.parser.util.OpTable.class</code>.
   *
   * This method may be used for terms like Expr and Pred that do not
   * contain a section header so that context information cannot be
   * obtained from the tree itself.  See
   * {@link #printUnicode(Term,Writer,SectionManager)} for writing trees that do
   * contain context information.
   */
  public static void printUnicode(Term term,
                                  Writer out,
                                  SectionManager sectInfo,
                                  String sectionName)
  {
    AstToPrintTreeVisitor toPrintTree = new AstToPrintTreeVisitor(sectInfo);
    Term tree;
    try {
      tree = (Term) toPrintTree.run(term, sectionName);
    }
    catch (CommandException exception) {
      throw new CztException(exception);
    }
    PrecedenceParenAnnVisitor precVisitor =
      new PrecedenceParenAnnVisitor();
    tree.accept(precVisitor);
    UnicodePrinter printer = new UnicodePrinter(out);
    Properties props = sectInfo.getProperties();
    ZpattPrintVisitor visitor = new ZpattPrintVisitor(printer, props);
    tree.accept(visitor);
  }
}
