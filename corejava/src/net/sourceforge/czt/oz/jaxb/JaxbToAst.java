
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

package net.sourceforge.czt.oz.jaxb;

import java.util.*;
import java.util.logging.Logger;

import net.sourceforge.czt.util.ReflectiveVisitor;
import net.sourceforge.czt.oz.ast.*;

/**
 * The unmarshaller responsible for deserializing XML data.
 *
 * @author Gnast version 0.1
 */
public class JaxbToAst extends net.sourceforge.czt.z.jaxb.JaxbToAst
{
  protected OzFactory mOzFactory_;

  public JaxbToAst()
  {
    mOzFactory_ =
      new net.sourceforge.czt.oz.impl.OzFactoryImpl();
  }

  public JaxbToAst(net.sourceforge.czt.z.ast.ZFactory vZFactory, OzFactory vOzFactory)
  {
    super(vZFactory);
    mOzFactory_ = vOzFactory;
  }

  private static Logger getLogger()
  {
    return Logger.getLogger("net.sourceforge.czt.oz.jaxb.JaxbToAst");
  }

  public Object visitObject(Object object)
  {
    getLogger().fine("Visit " + object.getClass().toString());
    if (object instanceof String
        || object instanceof Boolean
        || object instanceof List
        || object instanceof Integer
        || object instanceof java.math.BigInteger) {
      return object;
    }
    throw new UnsupportedOperationException("Unexpected element "
                                            + object.getClass().getName());
  }

  public Object visitRefNameList(net.sourceforge.czt.oz.jaxb.gen.RefNameList jaxbObject)
  {
    getLogger().entering("JaxbToAst", "visitRefNameList", jaxbObject);
    java.util.List name = new java.util.Vector();
    for (Iterator iter = jaxbObject.getName().iterator(); iter.hasNext();) {
      Object obj = iter.next();
      Object o = dispatch(obj);
      name.add(o);
    }
    RefNameList erg = mOzFactory_.createRefNameList(name);
    if (jaxbObject.getAnns() != null
        && jaxbObject.getAnns().getany() != null) {
      List annsList = erg.getAnns();
      List anyList = jaxbObject.getAnns().getany();
      for (Iterator iter = anyList.iterator(); iter.hasNext();) {
        Object obj = iter.next();
        Object o = dispatch(obj);
        annsList.add(o);
      }
    }
    getLogger().exiting("JaxbToAst", "visitRefNameList", erg);
    return erg;
  }

  public Object visitActualParameters(net.sourceforge.czt.oz.jaxb.gen.ActualParameters jaxbObject)
  {
    getLogger().entering("JaxbToAst", "visitActualParameters", jaxbObject);
    java.util.List expr = new java.util.Vector();
    for (Iterator iter = jaxbObject.getExpr().iterator(); iter.hasNext();) {
      Object obj = iter.next();
      Object o = dispatch(obj);
      expr.add(o);
    }
    ActualParameters erg = mOzFactory_.createActualParameters(expr);
    if (jaxbObject.getAnns() != null
        && jaxbObject.getAnns().getany() != null) {
      List annsList = erg.getAnns();
      List anyList = jaxbObject.getAnns().getany();
      for (Iterator iter = anyList.iterator(); iter.hasNext();) {
        Object obj = iter.next();
        Object o = dispatch(obj);
        annsList.add(o);
      }
    }
    getLogger().exiting("JaxbToAst", "visitActualParameters", erg);
    return erg;
  }

  public Object visitDistConjOpExpr(net.sourceforge.czt.oz.jaxb.gen.DistConjOpExpr jaxbObject)
  {
    getLogger().entering("JaxbToAst", "visitDistConjOpExpr", jaxbObject);
    MainOpExpr mainOpExpr =
      (MainOpExpr) dispatch(jaxbObject.getMainOpExpr());
    DistConjOpExpr erg = mOzFactory_.createDistConjOpExpr(mainOpExpr);
    if (jaxbObject.getAnns() != null
        && jaxbObject.getAnns().getany() != null) {
      List annsList = erg.getAnns();
      List anyList = jaxbObject.getAnns().getany();
      for (Iterator iter = anyList.iterator(); iter.hasNext();) {
        Object obj = iter.next();
        Object o = dispatch(obj);
        annsList.add(o);
      }
    }
    getLogger().exiting("JaxbToAst", "visitDistConjOpExpr", erg);
    return erg;
  }

  public Object visitBasicOpExpr(net.sourceforge.czt.oz.jaxb.gen.BasicOpExpr jaxbObject)
  {
    getLogger().entering("JaxbToAst", "visitBasicOpExpr", jaxbObject);
    RefNameList deltaList =
      (RefNameList) dispatch(jaxbObject.getDeltaList());
    net.sourceforge.czt.z.ast.SchText schText =
      (net.sourceforge.czt.z.ast.SchText) dispatch(jaxbObject.getSchText());
    BasicOpExpr erg = mOzFactory_.createBasicOpExpr(deltaList, schText);
    if (jaxbObject.getAnns() != null
        && jaxbObject.getAnns().getany() != null) {
      List annsList = erg.getAnns();
      List anyList = jaxbObject.getAnns().getany();
      for (Iterator iter = anyList.iterator(); iter.hasNext();) {
        Object obj = iter.next();
        Object o = dispatch(obj);
        annsList.add(o);
      }
    }
    getLogger().exiting("JaxbToAst", "visitBasicOpExpr", erg);
    return erg;
  }

  public Object visitMainOpExpr(net.sourceforge.czt.oz.jaxb.gen.MainOpExpr jaxbObject)
  {
    getLogger().entering("JaxbToAst", "visitMainOpExpr", jaxbObject);
    net.sourceforge.czt.z.ast.SchText schText =
      (net.sourceforge.czt.z.ast.SchText) dispatch(jaxbObject.getSchText());
    OperationExpr operationExpr =
      (OperationExpr) dispatch(jaxbObject.getOperationExpr());
    MainOpExpr erg = mOzFactory_.createMainOpExpr(schText, operationExpr);
    if (jaxbObject.getAnns() != null
        && jaxbObject.getAnns().getany() != null) {
      List annsList = erg.getAnns();
      List anyList = jaxbObject.getAnns().getany();
      for (Iterator iter = anyList.iterator(); iter.hasNext();) {
        Object obj = iter.next();
        Object o = dispatch(obj);
        annsList.add(o);
      }
    }
    getLogger().exiting("JaxbToAst", "visitMainOpExpr", erg);
    return erg;
  }

  public Object visitHideOpExpr(net.sourceforge.czt.oz.jaxb.gen.HideOpExpr jaxbObject)
  {
    getLogger().entering("JaxbToAst", "visitHideOpExpr", jaxbObject);
    OperationExpr operationExpr =
      (OperationExpr) dispatch(jaxbObject.getOperationExpr());
    java.util.List hideName = new java.util.Vector();
    for (Iterator iter = jaxbObject.getHideName().iterator(); iter.hasNext();) {
      Object obj = iter.next();
      Object o = dispatch(obj);
      hideName.add(o);
    }
    HideOpExpr erg = mOzFactory_.createHideOpExpr(operationExpr, hideName);
    if (jaxbObject.getAnns() != null
        && jaxbObject.getAnns().getany() != null) {
      List annsList = erg.getAnns();
      List anyList = jaxbObject.getAnns().getany();
      for (Iterator iter = anyList.iterator(); iter.hasNext();) {
        Object obj = iter.next();
        Object o = dispatch(obj);
        annsList.add(o);
      }
    }
    getLogger().exiting("JaxbToAst", "visitHideOpExpr", erg);
    return erg;
  }

  public Object visitSeqOpExpr(net.sourceforge.czt.oz.jaxb.gen.SeqOpExpr jaxbObject)
  {
    getLogger().entering("JaxbToAst", "visitSeqOpExpr", jaxbObject);
    OperationExpr leftOperationExpr =
      (OperationExpr) dispatch(jaxbObject.getLeftOperationExpr());
    OperationExpr rightOperationExpr =
      (OperationExpr) dispatch(jaxbObject.getRightOperationExpr());
    SeqOpExpr erg = mOzFactory_.createSeqOpExpr(leftOperationExpr, rightOperationExpr);
    if (jaxbObject.getAnns() != null
        && jaxbObject.getAnns().getany() != null) {
      List annsList = erg.getAnns();
      List anyList = jaxbObject.getAnns().getany();
      for (Iterator iter = anyList.iterator(); iter.hasNext();) {
        Object obj = iter.next();
        Object o = dispatch(obj);
        annsList.add(o);
      }
    }
    getLogger().exiting("JaxbToAst", "visitSeqOpExpr", erg);
    return erg;
  }

  public Object visitInheritedClass(net.sourceforge.czt.oz.jaxb.gen.InheritedClass jaxbObject)
  {
    getLogger().entering("JaxbToAst", "visitInheritedClass", jaxbObject);
    net.sourceforge.czt.z.ast.RefName name =
      (net.sourceforge.czt.z.ast.RefName) dispatch(jaxbObject.getName());
    ActualParameters actualParameters =
      (ActualParameters) dispatch(jaxbObject.getActualParameters());
    net.sourceforge.czt.z.ast.RenameExpr renameExpr =
      (net.sourceforge.czt.z.ast.RenameExpr) dispatch(jaxbObject.getRenameExpr());
    InheritedClass erg = mOzFactory_.createInheritedClass(name, actualParameters, renameExpr);
    if (jaxbObject.getAnns() != null
        && jaxbObject.getAnns().getany() != null) {
      List annsList = erg.getAnns();
      List anyList = jaxbObject.getAnns().getany();
      for (Iterator iter = anyList.iterator(); iter.hasNext();) {
        Object obj = iter.next();
        Object o = dispatch(obj);
        annsList.add(o);
      }
    }
    getLogger().exiting("JaxbToAst", "visitInheritedClass", erg);
    return erg;
  }

  public Object visitDistChoiceOpExpr(net.sourceforge.czt.oz.jaxb.gen.DistChoiceOpExpr jaxbObject)
  {
    getLogger().entering("JaxbToAst", "visitDistChoiceOpExpr", jaxbObject);
    MainOpExpr mainOpExpr =
      (MainOpExpr) dispatch(jaxbObject.getMainOpExpr());
    DistChoiceOpExpr erg = mOzFactory_.createDistChoiceOpExpr(mainOpExpr);
    if (jaxbObject.getAnns() != null
        && jaxbObject.getAnns().getany() != null) {
      List annsList = erg.getAnns();
      List anyList = jaxbObject.getAnns().getany();
      for (Iterator iter = anyList.iterator(); iter.hasNext();) {
        Object obj = iter.next();
        Object o = dispatch(obj);
        annsList.add(o);
      }
    }
    getLogger().exiting("JaxbToAst", "visitDistChoiceOpExpr", erg);
    return erg;
  }

  public Object visitAssoParallelOpExpr(net.sourceforge.czt.oz.jaxb.gen.AssoParallelOpExpr jaxbObject)
  {
    getLogger().entering("JaxbToAst", "visitAssoParallelOpExpr", jaxbObject);
    OperationExpr leftOperationExpr =
      (OperationExpr) dispatch(jaxbObject.getLeftOperationExpr());
    OperationExpr rightOperationExpr =
      (OperationExpr) dispatch(jaxbObject.getRightOperationExpr());
    AssoParallelOpExpr erg = mOzFactory_.createAssoParallelOpExpr(leftOperationExpr, rightOperationExpr);
    if (jaxbObject.getAnns() != null
        && jaxbObject.getAnns().getany() != null) {
      List annsList = erg.getAnns();
      List anyList = jaxbObject.getAnns().getany();
      for (Iterator iter = anyList.iterator(); iter.hasNext();) {
        Object obj = iter.next();
        Object o = dispatch(obj);
        annsList.add(o);
      }
    }
    getLogger().exiting("JaxbToAst", "visitAssoParallelOpExpr", erg);
    return erg;
  }

  public Object visitState(net.sourceforge.czt.oz.jaxb.gen.State jaxbObject)
  {
    getLogger().entering("JaxbToAst", "visitState", jaxbObject);
    java.util.List decl = new java.util.Vector();
    for (Iterator iter = jaxbObject.getDecl().iterator(); iter.hasNext();) {
      Object obj = iter.next();
      Object o = dispatch(obj);
      decl.add(o);
    }
    SecondaryAttributes secondaryAttributes =
      (SecondaryAttributes) dispatch(jaxbObject.getSecondaryAttributes());
    java.util.List pred = new java.util.Vector();
    for (Iterator iter = jaxbObject.getPred().iterator(); iter.hasNext();) {
      Object obj = iter.next();
      Object o = dispatch(obj);
      pred.add(o);
    }
    State erg = mOzFactory_.createState(decl, secondaryAttributes, pred);
    if (jaxbObject.getAnns() != null
        && jaxbObject.getAnns().getany() != null) {
      List annsList = erg.getAnns();
      List anyList = jaxbObject.getAnns().getany();
      for (Iterator iter = anyList.iterator(); iter.hasNext();) {
        Object obj = iter.next();
        Object o = dispatch(obj);
        annsList.add(o);
      }
    }
    getLogger().exiting("JaxbToAst", "visitState", erg);
    return erg;
  }

  public Object visitConjOpExpr(net.sourceforge.czt.oz.jaxb.gen.ConjOpExpr jaxbObject)
  {
    getLogger().entering("JaxbToAst", "visitConjOpExpr", jaxbObject);
    OperationExpr leftOperationExpr =
      (OperationExpr) dispatch(jaxbObject.getLeftOperationExpr());
    OperationExpr rightOperationExpr =
      (OperationExpr) dispatch(jaxbObject.getRightOperationExpr());
    ConjOpExpr erg = mOzFactory_.createConjOpExpr(leftOperationExpr, rightOperationExpr);
    if (jaxbObject.getAnns() != null
        && jaxbObject.getAnns().getany() != null) {
      List annsList = erg.getAnns();
      List anyList = jaxbObject.getAnns().getany();
      for (Iterator iter = anyList.iterator(); iter.hasNext();) {
        Object obj = iter.next();
        Object o = dispatch(obj);
        annsList.add(o);
      }
    }
    getLogger().exiting("JaxbToAst", "visitConjOpExpr", erg);
    return erg;
  }

  public Object visitOpPromotionExpr(net.sourceforge.czt.oz.jaxb.gen.OpPromotionExpr jaxbObject)
  {
    getLogger().entering("JaxbToAst", "visitOpPromotionExpr", jaxbObject);
    net.sourceforge.czt.z.ast.Expr expr =
      (net.sourceforge.czt.z.ast.Expr) dispatch(jaxbObject.getExpr());
    net.sourceforge.czt.z.ast.RefName opName =
      (net.sourceforge.czt.z.ast.RefName) dispatch(jaxbObject.getOpName());
    OpPromotionExpr erg = mOzFactory_.createOpPromotionExpr(expr, opName);
    if (jaxbObject.getAnns() != null
        && jaxbObject.getAnns().getany() != null) {
      List annsList = erg.getAnns();
      List anyList = jaxbObject.getAnns().getany();
      for (Iterator iter = anyList.iterator(); iter.hasNext();) {
        Object obj = iter.next();
        Object o = dispatch(obj);
        annsList.add(o);
      }
    }
    getLogger().exiting("JaxbToAst", "visitOpPromotionExpr", erg);
    return erg;
  }

  public Object visitClassPara(net.sourceforge.czt.oz.jaxb.gen.ClassPara jaxbObject)
  {
    getLogger().entering("JaxbToAst", "visitClassPara", jaxbObject);
    net.sourceforge.czt.z.ast.DeclName name =
      (net.sourceforge.czt.z.ast.DeclName) dispatch(jaxbObject.getName());
    FormalParameters formalParameters =
      (FormalParameters) dispatch(jaxbObject.getFormalParameters());
    RefNameList visibilityList =
      (RefNameList) dispatch(jaxbObject.getVisibilityList());
    java.util.List inheritedClass = new java.util.Vector();
    for (Iterator iter = jaxbObject.getInheritedClass().iterator(); iter.hasNext();) {
      Object obj = iter.next();
      Object o = dispatch(obj);
      inheritedClass.add(o);
    }
    LocalDef localDef =
      (LocalDef) dispatch(jaxbObject.getLocalDef());
    State state =
      (State) dispatch(jaxbObject.getState());
    InitialState initialState =
      (InitialState) dispatch(jaxbObject.getInitialState());
    java.util.List operation = new java.util.Vector();
    for (Iterator iter = jaxbObject.getOperation().iterator(); iter.hasNext();) {
      Object obj = iter.next();
      Object o = dispatch(obj);
      operation.add(o);
    }
    ClassPara erg = mOzFactory_.createClassPara(name, formalParameters, visibilityList, inheritedClass, localDef, state, initialState, operation);
    getLogger().exiting("JaxbToAst", "visitClassPara", erg);
    return erg;
  }

  public Object visitParenOpExpr(net.sourceforge.czt.oz.jaxb.gen.ParenOpExpr jaxbObject)
  {
    getLogger().entering("JaxbToAst", "visitParenOpExpr", jaxbObject);
    ParenOpExpr erg = mOzFactory_.createParenOpExpr();
    if (jaxbObject.getAnns() != null
        && jaxbObject.getAnns().getany() != null) {
      List annsList = erg.getAnns();
      List anyList = jaxbObject.getAnns().getany();
      for (Iterator iter = anyList.iterator(); iter.hasNext();) {
        Object obj = iter.next();
        Object o = dispatch(obj);
        annsList.add(o);
      }
    }
    getLogger().exiting("JaxbToAst", "visitParenOpExpr", erg);
    return erg;
  }

  public Object visitOperation(net.sourceforge.czt.oz.jaxb.gen.Operation jaxbObject)
  {
    getLogger().entering("JaxbToAst", "visitOperation", jaxbObject);
    net.sourceforge.czt.z.ast.DeclName name =
      (net.sourceforge.czt.z.ast.DeclName) dispatch(jaxbObject.getName());
    OperationBoxExpr operationBoxExpr =
      (OperationBoxExpr) dispatch(jaxbObject.getOperationBoxExpr());
    Operation erg = mOzFactory_.createOperation(name, operationBoxExpr);
    if (jaxbObject.getAnns() != null
        && jaxbObject.getAnns().getany() != null) {
      List annsList = erg.getAnns();
      List anyList = jaxbObject.getAnns().getany();
      for (Iterator iter = anyList.iterator(); iter.hasNext();) {
        Object obj = iter.next();
        Object o = dispatch(obj);
        annsList.add(o);
      }
    }
    getLogger().exiting("JaxbToAst", "visitOperation", erg);
    return erg;
  }

  public Object visitLocalDef(net.sourceforge.czt.oz.jaxb.gen.LocalDef jaxbObject)
  {
    getLogger().entering("JaxbToAst", "visitLocalDef", jaxbObject);
    java.util.List givenPara = new java.util.Vector();
    for (Iterator iter = jaxbObject.getGivenPara().iterator(); iter.hasNext();) {
      Object obj = iter.next();
      Object o = dispatch(obj);
      givenPara.add(o);
    }
    java.util.List axPara = new java.util.Vector();
    for (Iterator iter = jaxbObject.getAxPara().iterator(); iter.hasNext();) {
      Object obj = iter.next();
      Object o = dispatch(obj);
      axPara.add(o);
    }
    java.util.List freePara = new java.util.Vector();
    for (Iterator iter = jaxbObject.getFreePara().iterator(); iter.hasNext();) {
      Object obj = iter.next();
      Object o = dispatch(obj);
      freePara.add(o);
    }
    LocalDef erg = mOzFactory_.createLocalDef(givenPara, axPara, freePara);
    if (jaxbObject.getAnns() != null
        && jaxbObject.getAnns().getany() != null) {
      List annsList = erg.getAnns();
      List anyList = jaxbObject.getAnns().getany();
      for (Iterator iter = anyList.iterator(); iter.hasNext();) {
        Object obj = iter.next();
        Object o = dispatch(obj);
        annsList.add(o);
      }
    }
    getLogger().exiting("JaxbToAst", "visitLocalDef", erg);
    return erg;
  }

  public Object visitOperationBox(net.sourceforge.czt.oz.jaxb.gen.OperationBox jaxbObject)
  {
    getLogger().entering("JaxbToAst", "visitOperationBox", jaxbObject);
    RefNameList deltaList =
      (RefNameList) dispatch(jaxbObject.getDeltaList());
    java.util.List decl = new java.util.Vector();
    for (Iterator iter = jaxbObject.getDecl().iterator(); iter.hasNext();) {
      Object obj = iter.next();
      Object o = dispatch(obj);
      decl.add(o);
    }
    java.util.List pred = new java.util.Vector();
    for (Iterator iter = jaxbObject.getPred().iterator(); iter.hasNext();) {
      Object obj = iter.next();
      Object o = dispatch(obj);
      pred.add(o);
    }
    OperationBox erg = mOzFactory_.createOperationBox(deltaList, decl, pred);
    if (jaxbObject.getAnns() != null
        && jaxbObject.getAnns().getany() != null) {
      List annsList = erg.getAnns();
      List anyList = jaxbObject.getAnns().getany();
      for (Iterator iter = anyList.iterator(); iter.hasNext();) {
        Object obj = iter.next();
        Object o = dispatch(obj);
        annsList.add(o);
      }
    }
    getLogger().exiting("JaxbToAst", "visitOperationBox", erg);
    return erg;
  }

  public Object visitInitialState(net.sourceforge.czt.oz.jaxb.gen.InitialState jaxbObject)
  {
    getLogger().entering("JaxbToAst", "visitInitialState", jaxbObject);
    java.util.List pred = new java.util.Vector();
    for (Iterator iter = jaxbObject.getPred().iterator(); iter.hasNext();) {
      Object obj = iter.next();
      Object o = dispatch(obj);
      pred.add(o);
    }
    InitialState erg = mOzFactory_.createInitialState(pred);
    if (jaxbObject.getAnns() != null
        && jaxbObject.getAnns().getany() != null) {
      List annsList = erg.getAnns();
      List anyList = jaxbObject.getAnns().getany();
      for (Iterator iter = anyList.iterator(); iter.hasNext();) {
        Object obj = iter.next();
        Object o = dispatch(obj);
        annsList.add(o);
      }
    }
    getLogger().exiting("JaxbToAst", "visitInitialState", erg);
    return erg;
  }

  public Object visitDistSeqOpExpr(net.sourceforge.czt.oz.jaxb.gen.DistSeqOpExpr jaxbObject)
  {
    getLogger().entering("JaxbToAst", "visitDistSeqOpExpr", jaxbObject);
    MainOpExpr mainOpExpr =
      (MainOpExpr) dispatch(jaxbObject.getMainOpExpr());
    DistSeqOpExpr erg = mOzFactory_.createDistSeqOpExpr(mainOpExpr);
    if (jaxbObject.getAnns() != null
        && jaxbObject.getAnns().getany() != null) {
      List annsList = erg.getAnns();
      List anyList = jaxbObject.getAnns().getany();
      for (Iterator iter = anyList.iterator(); iter.hasNext();) {
        Object obj = iter.next();
        Object o = dispatch(obj);
        annsList.add(o);
      }
    }
    getLogger().exiting("JaxbToAst", "visitDistSeqOpExpr", erg);
    return erg;
  }

  public Object visitScopeEnrichOpExpr(net.sourceforge.czt.oz.jaxb.gen.ScopeEnrichOpExpr jaxbObject)
  {
    getLogger().entering("JaxbToAst", "visitScopeEnrichOpExpr", jaxbObject);
    OperationExpr leftOperationExpr =
      (OperationExpr) dispatch(jaxbObject.getLeftOperationExpr());
    OperationExpr rightOperationExpr =
      (OperationExpr) dispatch(jaxbObject.getRightOperationExpr());
    ScopeEnrichOpExpr erg = mOzFactory_.createScopeEnrichOpExpr(leftOperationExpr, rightOperationExpr);
    if (jaxbObject.getAnns() != null
        && jaxbObject.getAnns().getany() != null) {
      List annsList = erg.getAnns();
      List anyList = jaxbObject.getAnns().getany();
      for (Iterator iter = anyList.iterator(); iter.hasNext();) {
        Object obj = iter.next();
        Object o = dispatch(obj);
        annsList.add(o);
      }
    }
    getLogger().exiting("JaxbToAst", "visitScopeEnrichOpExpr", erg);
    return erg;
  }

  public Object visitSecondaryAttributes(net.sourceforge.czt.oz.jaxb.gen.SecondaryAttributes jaxbObject)
  {
    getLogger().entering("JaxbToAst", "visitSecondaryAttributes", jaxbObject);
    java.util.List varDecl = new java.util.Vector();
    for (Iterator iter = jaxbObject.getVarDecl().iterator(); iter.hasNext();) {
      Object obj = iter.next();
      Object o = dispatch(obj);
      varDecl.add(o);
    }
    SecondaryAttributes erg = mOzFactory_.createSecondaryAttributes(varDecl);
    if (jaxbObject.getAnns() != null
        && jaxbObject.getAnns().getany() != null) {
      List annsList = erg.getAnns();
      List anyList = jaxbObject.getAnns().getany();
      for (Iterator iter = anyList.iterator(); iter.hasNext();) {
        Object obj = iter.next();
        Object o = dispatch(obj);
        annsList.add(o);
      }
    }
    getLogger().exiting("JaxbToAst", "visitSecondaryAttributes", erg);
    return erg;
  }

  public Object visitRenameOpExpr(net.sourceforge.czt.oz.jaxb.gen.RenameOpExpr jaxbObject)
  {
    getLogger().entering("JaxbToAst", "visitRenameOpExpr", jaxbObject);
    OperationExpr operationExpr =
      (OperationExpr) dispatch(jaxbObject.getOperationExpr());
    java.util.List nameNamePair = new java.util.Vector();
    for (Iterator iter = jaxbObject.getNameNamePair().iterator(); iter.hasNext();) {
      Object obj = iter.next();
      Object o = dispatch(obj);
      nameNamePair.add(o);
    }
    RenameOpExpr erg = mOzFactory_.createRenameOpExpr(operationExpr, nameNamePair);
    if (jaxbObject.getAnns() != null
        && jaxbObject.getAnns().getany() != null) {
      List annsList = erg.getAnns();
      List anyList = jaxbObject.getAnns().getany();
      for (Iterator iter = anyList.iterator(); iter.hasNext();) {
        Object obj = iter.next();
        Object o = dispatch(obj);
        annsList.add(o);
      }
    }
    getLogger().exiting("JaxbToAst", "visitRenameOpExpr", erg);
    return erg;
  }

  public Object visitExChoiceOpExpr(net.sourceforge.czt.oz.jaxb.gen.ExChoiceOpExpr jaxbObject)
  {
    getLogger().entering("JaxbToAst", "visitExChoiceOpExpr", jaxbObject);
    OperationExpr leftOperationExpr =
      (OperationExpr) dispatch(jaxbObject.getLeftOperationExpr());
    OperationExpr rightOperationExpr =
      (OperationExpr) dispatch(jaxbObject.getRightOperationExpr());
    ExChoiceOpExpr erg = mOzFactory_.createExChoiceOpExpr(leftOperationExpr, rightOperationExpr);
    if (jaxbObject.getAnns() != null
        && jaxbObject.getAnns().getany() != null) {
      List annsList = erg.getAnns();
      List anyList = jaxbObject.getAnns().getany();
      for (Iterator iter = anyList.iterator(); iter.hasNext();) {
        Object obj = iter.next();
        Object o = dispatch(obj);
        annsList.add(o);
      }
    }
    getLogger().exiting("JaxbToAst", "visitExChoiceOpExpr", erg);
    return erg;
  }

  public Object visitParallelOpExpr(net.sourceforge.czt.oz.jaxb.gen.ParallelOpExpr jaxbObject)
  {
    getLogger().entering("JaxbToAst", "visitParallelOpExpr", jaxbObject);
    OperationExpr leftOperationExpr =
      (OperationExpr) dispatch(jaxbObject.getLeftOperationExpr());
    OperationExpr rightOperationExpr =
      (OperationExpr) dispatch(jaxbObject.getRightOperationExpr());
    ParallelOpExpr erg = mOzFactory_.createParallelOpExpr(leftOperationExpr, rightOperationExpr);
    if (jaxbObject.getAnns() != null
        && jaxbObject.getAnns().getany() != null) {
      List annsList = erg.getAnns();
      List anyList = jaxbObject.getAnns().getany();
      for (Iterator iter = anyList.iterator(); iter.hasNext();) {
        Object obj = iter.next();
        Object o = dispatch(obj);
        annsList.add(o);
      }
    }
    getLogger().exiting("JaxbToAst", "visitParallelOpExpr", erg);
    return erg;
  }

  public Object visitFormalParameters(net.sourceforge.czt.oz.jaxb.gen.FormalParameters jaxbObject)
  {
    getLogger().entering("JaxbToAst", "visitFormalParameters", jaxbObject);
    java.util.List name = new java.util.Vector();
    for (Iterator iter = jaxbObject.getName().iterator(); iter.hasNext();) {
      Object obj = iter.next();
      Object o = dispatch(obj);
      name.add(o);
    }
    FormalParameters erg = mOzFactory_.createFormalParameters(name);
    if (jaxbObject.getAnns() != null
        && jaxbObject.getAnns().getany() != null) {
      List annsList = erg.getAnns();
      List anyList = jaxbObject.getAnns().getany();
      for (Iterator iter = anyList.iterator(); iter.hasNext();) {
        Object obj = iter.next();
        Object o = dispatch(obj);
        annsList.add(o);
      }
    }
    getLogger().exiting("JaxbToAst", "visitFormalParameters", erg);
    return erg;
  }
}
