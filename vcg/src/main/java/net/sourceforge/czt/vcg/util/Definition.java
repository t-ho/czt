/*
 * Copyright (C) 2011 Leo Freitas
 * This file is part of the CZT project.
 *
 * The CZT project contains free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * The CZT project is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with CZT; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 */
package net.sourceforge.czt.vcg.util;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.SortedMap;
import java.util.TreeMap;
import net.sourceforge.czt.parser.util.InfoTable;
import net.sourceforge.czt.z.ast.Expr;
import net.sourceforge.czt.z.ast.Type2;
import net.sourceforge.czt.z.ast.ZName;
import net.sourceforge.czt.z.ast.ZNameList;
import net.sourceforge.czt.z.util.ZUtils;

/**
 * This defines a definition, including its name.
 * That is, for the generic definition g[T,U] = T \fun U,
 * this Definition records the type parameters T,U,
 * the right hand side expression, the name, and the kind
 * of definition it is given the context where it appeared.
 * If types are available, a carrier set is also attached; it's null otherwise.
 *
 * @authot Leo Freitas
 */
public class Definition extends InfoTable.Info implements Comparable<Definition>
{

  private final ZName defName_;
  private final DefinitionKind defKind_;
  private final ZNameList genericParams_;
  private final Expr definition_;
  private final Type2 carrierType_;
  private final SortedMap<ZName, Definition> locals_;

  protected Definition(String sectName, ZName defName, 
          ZNameList generic, Expr definition, Type2 carrierType,
          DefinitionKind definitionKind)
  {
    super(sectName);
    assert generic != null && defName != null && definition != null && definitionKind != null;
    genericParams_ = generic;
    defName_ = defName;
    definition_ = definition;
    defKind_ = definitionKind;
    carrierType_ = carrierType; // type maybe null
    locals_ = new TreeMap<ZName, Definition>(ZUtils.ZNAME_COMPARATOR);
  }

  public SortedMap<ZName, Definition> getLocalDecls()
  {
    return Collections.unmodifiableSortedMap(locals_);
  }

  protected Definition addLocalDecl(ZName defName,
          ZNameList generic, Expr definition, Type2 carrierSet,
          DefinitionKind definitionKind) throws DefinitionException
  {
    Definition localDef = new Definition(getSectionName(), defName,
            generic, definition, carrierSet, definitionKind);
    addLocalDecl(localDef);
    return localDef;
  }

  protected void addLocalDecl(Definition def) throws DefinitionException
  {
    ZName defName = def.getDefName();
    Definition oldLocalDef = locals_.put(defName, def);
    if (oldLocalDef != null)
    {
      final String message = "Duplicated local def \"" + DefinitionTable.printTerm(defName) +
              "\" of \"" + DefinitionTable.printTerm(defName_) + "\" in section " + getSectionName();
      throw new DefinitionException(oldLocalDef.getDefName(), message);
    }
  }

  /** Returns the list of generic type parameters of this definition.
   *  It never returns null, so if the definition has no generic
   *  parameters, it returns an empty list.
   * @return List of the names of any type parameters.
   */
  public ZNameList getGenericParams()
  {
    return genericParams_;
  }

  /** For an equality definition (name==expr), this returns the
   *  right-hand side of the definition, expr.
   *  For a variable declaration (name:expr), this returns the type
   *  expression, expr.  Note that this is often more specific than
   *  the carrier set of name (as returned by the typechecker).
   * @return
   */
  public Expr getExpr()
  {
    return definition_;
  }

  /** Tells you whether this name was declared via a constant
   * definition, or a variable declaration.
   * @return
   */
  public DefinitionKind getDefinitionKind()
  {
    return defKind_;
  }

  /**
   * Carrier set, if available; null otherwise.
   * @return
   */
  public Type2 getCarrierType()
  {
    return carrierType_;
  }

  public ZName getDefName()
  {
    return defName_;
  }

  private static int localsDepth_ = 0;

  private static String asMany(char ch, int count)
  {
    StringBuilder builder = new StringBuilder(count);
    while (count > 0)
    {
      builder.append(ch);
      count--;
    }
    return builder.toString();
  }

  protected String printLocals(boolean simple)
  {
    StringBuilder buffer = new StringBuilder(locals_.size()+1 * 20);
    buffer.append('\n');
    buffer.append(asMany('\t', localsDepth_+1));
    buffer.append("Locals = {");
    if (!locals_.isEmpty())
    {
      Iterator<SortedMap.Entry<ZName, Definition>> itE = locals_.entrySet().iterator();
      buffer.append(" ");
      while (itE.hasNext())
      {
        SortedMap.Entry<ZName, Definition> entry2 = itE.next();
        buffer.append('\n');
        buffer.append(asMany('\t', localsDepth_+2));
        buffer.append(DefinitionTable.printTerm(entry2.getKey()));
        buffer.append("=");
        buffer.append(entry2.getValue().toString(simple));
      }
      //buffer.append('\n');
      //buffer.append(asMany('\t', localsDepth_+1));
    }
    buffer.append(" }");
    return buffer.toString();
  }

  // Add \n\t here since it is likely to appear from within a DefTable.
  @Override
  public String toString()
  {
    return "\n\t DEFNAME = " + DefinitionTable.printTerm(defName_) +
           "\n\t DEFEXPR = " + DefinitionTable.printTerm(definition_) +
           "\n\t " + (genericParams_.isEmpty() ? "" :
                 "GENERICS= " + DefinitionTable.printTerm(genericParams_) +
           "\n\t ") + "KIND    = " + defKind_.toString() +
                      (carrierType_ == null ? "" :
           "\n\t CARSET  = " + DefinitionTable.printTerm(carrierType_).replaceAll("\n;","; ").replaceAll("\n]", "] ")) +
                      (locals_.isEmpty() ? "" :
           "\n\t LOCALS  = \n\t\t   " + locals_.toString().replaceAll("\n\t", "\n\t\t").replaceAll("}", "}\n\t"));
  }

  public String toString(boolean simple)
  {
    if (simple)
    {
      localsDepth_++;
      String result = (genericParams_.isEmpty() ? "" : " [" + DefinitionTable.printTerm(genericParams_) + "]") + defKind_.toString() +
             //"(" + DefinitionTable.printTerm(defName_) + ", " +
                    //+ ")"
                   (!locals_.isEmpty() ? printLocals(simple) : "");
      localsDepth_--;
      return result;
    }
    else
      return toString();
  }

  @Override
  public boolean equals(Object o)
  {
    boolean result = o == this;
    if (!result && o instanceof Definition)
    {
      Definition d = (Definition) o;
      result = this.getSectionName().equals(d.getSectionName()) &&
              this.defName_.equals(d.defName_) &&
              this.defKind_.equals(d.defKind_) &&
              this.genericParams_.equals(d.genericParams_) &&
              this.locals_.equals(d.locals_);
    }
    return result;
  }

  @Override
  public int hashCode()
  {
    int hash = 31;
    hash = 29 * hash + this.getSectionName().hashCode();
    hash = 29 * hash + this.defName_.hashCode();
    hash = 29 * hash + this.defKind_.hashCode();
    hash = 29 * hash + this.genericParams_.hashCode();
    hash = 29 * hash + this.locals_.hashCode();
    return hash;
  }

  @Override
  public int compareTo(Definition o)
  {
    // first compare by DefKind order
    int result = this.defKind_.value() - o.defKind_.value();
    if (result == 0)
    {
      // next by name order
      result = ZUtils.compareTo(this.getDefName(), o.getDefName());

      // if the same binding, check if they come from the same schema name (e.g., handle name collusion)
      if (result == 0 && this.defKind_.isSchemaBinding())
      {
        result = ZUtils.compareTo(this.defKind_.getSchName(), o.defKind_.getSchName());
      }
    }
    return result;
  }
}