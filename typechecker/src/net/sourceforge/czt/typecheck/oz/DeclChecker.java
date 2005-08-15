/*
  Copyright (C) 2004, 2005 Tim Miller
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
package net.sourceforge.czt.typecheck.oz;

import java.util.List;

import net.sourceforge.czt.z.ast.*;
import net.sourceforge.czt.z.visitor.*;
import net.sourceforge.czt.typecheck.z.util.UResult;

/**
 * A <code>DeclChecker</code> instance visits the Decl instances in an
 * AST, checks the preds for type consistencies, adding an ErrorAnn if
 * there are inconsistencies.
 *
 * All visit methods to Decl objects return a list of NameTypePair
 * objects indicating the variables and their types.
 */
public class DeclChecker
  extends Checker
  implements DeclVisitor,
             VarDeclVisitor
{
  //a Z decl checker
  protected net.sourceforge.czt.typecheck.z.DeclChecker zDeclChecker_;

  public DeclChecker(TypeChecker typeChecker)
  {
    super(typeChecker);
    zDeclChecker_ =
      new net.sourceforge.czt.typecheck.z.DeclChecker(typeChecker);
  }

  public Object visitDecl(Decl decl)
  {
    return decl.accept(zDeclChecker_);
  }

  public Object visitVarDecl(VarDecl varDecl)
  {
    //get and visit the expression
    Expr expr = varDecl.getExpr();
    Type2 exprType = (Type2) expr.accept(exprChecker());

    //expr should be a set expr
    PowerType vPowerType = factory().createPowerType();
    UResult unified = strongUnify(vPowerType, exprType);

    //the list of name type pairs in this VarDecl
    List<NameTypePair> pairs = checkVarDecl(varDecl, unified,
                                            exprType, vPowerType);
    return pairs;
  }
}
