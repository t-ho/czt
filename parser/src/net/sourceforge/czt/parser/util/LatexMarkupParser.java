/*
Copyright (C) 2004 Petra Malik
This file is part of the CZT project: http://czt.sourceforge.net

The CZT project contains free software; you can redistribute it and/or
modify it under the terms of the GNU General Public License as published
by the Free Software Foundation; either version 2 of the License, or
(at your option) any later version.

The CZT project is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License along
with CZT; if not, write to the Free Software Foundation, Inc.,
59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
*/

package net.sourceforge.czt.parser.util;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java_cup.runtime.Scanner;
import java_cup.runtime.Symbol;

import net.sourceforge.czt.session.SectionManager;
import net.sourceforge.czt.z.ast.Directive;
import net.sourceforge.czt.z.ast.DirectiveType;
import net.sourceforge.czt.z.ast.ZFactory;
import net.sourceforge.czt.z.impl.ZFactoryImpl;

/**
 * A latex markup parser that looks like a scanner.
 * Instances of this class are usually used after the Latex2Unicode
 * converter.  It preprocesses the output of the converter and updates
 * the markup function appropriately.  It is possible to use the same
 * markup function in the converter if the following conditions hold:
 * <ul>
 *   <li>Each markup command is used AFTER it is defined in a markup
 *       directive.</li>
 *   <li>There is exactly one section header.  This means that anonymous
 *       specifications are not supported yet.</li>
 * </ul>
 */
public class LatexMarkupParser
  implements Scanner
{
  private static ZFactory factory_ = new ZFactoryImpl();

  /**
   * The latex to unicode scanner that provides the input.
   */
  private LatexScanner scanner_;

  /**
   * The session manager.
   */
  private SectionManager manager_;

  /**
   * The markup function for the current section.
   */
  private LatexMarkupFunction markupFunction_ = null;

  /**
   * All markup functions created so far.
   */
  private Map markupFunctions_ = new HashMap();

  /**
   * Are we just parsing a section header?
   */
  private boolean sectHead_ = false;

  /**
   * The current section name.
   */
  private String sectName_ = null;

  /**
   * The parents of the current section.
   */
  private String parents_ = null;

  /**
   * Creates a new latex markup parser that uses the scanner provided.
   */
  public LatexMarkupParser(LatexScanner scanner,
                           SectionManager manager)
  {
    scanner_ = scanner;
    manager_ = manager;
  }

  /**
   * Adds the markup function of the given specification
   * to the current markup function.
   *
   * @param parent the name of the parent specification.
   */
  private void addMarkupFunction(String parent)
    throws MarkupException
  {
    if (markupFunction_ == null) {
      markupFunction_ = new LatexMarkupFunction(sectName_);
      markupFunctions_.put(sectName_, markupFunction_);
      scanner_.setMarkupFunction(markupFunction_);
    }
    LatexMarkupFunction markupFunction =
      manager_.getLatexMarkupFunction(parent);
    markupFunction_.add(markupFunction);
  }

  public Map getMarkupFunctions()
  {
    return markupFunctions_;
  }

  public Symbol next_token()
    throws Exception
  {
    Symbol token = scanner_.next_token();
    if (sectName_ == null &&
        (token.sym == LatexSym.CHAR_MARKUP ||
         token.sym == LatexSym.WORD_MARKUP ||
         token.sym == LatexSym.INWORD_MARKUP ||
         token.sym == LatexSym.PREWORD_MARKUP ||
         token.sym == LatexSym.POSTWORD_MARKUP ||
         token.sym == LatexSym.UNICODE)) {
      // we are parsing an anonymous specification
      sectName_ = "Specification";
      parents_ = "standard_toolkit";
      addMarkupFunction("prelude");
      addMarkupFunction(parents_);
    }
    if (sectHead_) { // we are just parsing a section header
      if (token.sym == LatexSym.END) { // end of section header
        sectName_ = sectName_.trim();
        markupFunction_ = new LatexMarkupFunction(sectName_);
        markupFunctions_.put(sectName_, markupFunction_);
        scanner_.setMarkupFunction(markupFunction_);
        if (! sectName_.equals("prelude")) {
          addMarkupFunction("prelude");
        }
        if (parents_ != null) {
          String[] parents = parents_.split(",");
          for (int i = 0; i < parents.length; i++) {
            String parent = parents[i].trim();
            addMarkupFunction(parent);
          }
        }
        sectHead_ = false;
      }
      else if (token.sym == LatexSym.SECTION) { // section token
        // start parsing section name
        sectName_ = "";
      }
      else if (token.sym == LatexSym.PARENTS) { // parents token
        // start parsing parents
        parents_ = "";
      }
      else {
        if (parents_ != null) {
          parents_ += token.value;
        }
        else if (sectName_ != null) {
          sectName_ += token.value;
        }
        else {
          System.err.println("Unexpected token '" + token.value +
                             "' within a section header.");
        }
      }
    }
    else if (token.sym == LatexSym.SECT) { // begin of a section header
      sectHead_ = true;
      parents_ = null;
      sectName_ = null;
    }
    else if (token.sym == LatexSym.CHAR_MARKUP) {
      Directive directive = parseCharMarkupDirective((String) token.value);
      if (directive != null) {
        markupFunction_.add(directive);
      }
    }
    else if (token.sym == LatexSym.WORD_MARKUP) {
      parseWordMarkup(DirectiveType.NONE);
    }
    else if (token.sym == LatexSym.INWORD_MARKUP) {
      parseWordMarkup(DirectiveType.IN);
    }
    else if (token.sym == LatexSym.PREWORD_MARKUP) {
      parseWordMarkup(DirectiveType.PRE);
    }
    else if (token.sym == LatexSym.POSTWORD_MARKUP) {
      parseWordMarkup(DirectiveType.POST);
    }
    return token;
  }

  private void parseWordMarkup(DirectiveType type)
    throws Exception
  {
    String name = parseName();
    String latex = parseUnicode();
    Directive directive = factory_.createDirective(name, latex, type);
    markupFunction_.add(directive);
  }

  private String parseName()
    throws Exception
  {
    Symbol token = scanner_.next_token();
    if (token.sym == LatexSym.NAME) {
      return (String) token.value;
    }
    System.err.println("Error while parsing markup directive.");
    return null;
  }

  private String parseUnicode()
    throws Exception
  {
    String result = "";
    Symbol token = scanner_.next_token();
    while (token.sym != LatexSym.END_MARKUP) {
      result += token.value;
      token = scanner_.next_token();
    }
    return result;
  }

  public static Directive parseCharMarkupDirective(String directive)
  {
    String[] splitted = directive.split("[ \t]+");
    final int expectedLength = 3;
    if (splitted.length == expectedLength) {
      DirectiveType type = DirectiveType.NONE;
      String name = splitted[1];
      if ("%%Zprechar".equals(splitted[0])) {
        type = DirectiveType.PRE;
      }
      else if ("%%Zpostchar".equals(splitted[0])) {
        type = DirectiveType.POST;
      }
      else if ("%%Zinchar".equals(splitted[0])) {
        type = DirectiveType.IN;
      }

      if (splitted[2].startsWith("U+")) {
        final int beginString = 2;
        final int endString = 6;
        String hexValue = splitted[2].substring(beginString, endString);
        final int hexBase = 16;
        int decimal = Integer.parseInt(hexValue, hexBase);
        // Java 1.4
        Character character = new Character((char) decimal);
        String unicode = character.toString();
        // Java 1.5
        //        char[] chars = Character.toChars(decimal);
        //        String unicode = new String(chars);
        return factory_.createDirective(name, unicode, type);
      }
      System.err.println("WARNING: Cannot parse " + directive);
      return null;
    }
    System.err.println("WARNING: Cannot parse " + directive);
    return null;
  }

  public interface LatexScanner
    extends Scanner
  {
    void setMarkupFunction(LatexMarkupFunction markupFunction);
  }
}
