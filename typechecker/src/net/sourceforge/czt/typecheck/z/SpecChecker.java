/*
  Copyright (C) 2004 Tim Miller
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
package net.sourceforge.czt.typecheck.z;

import java.util.List;
import java.util.Iterator;

import net.sourceforge.czt.base.ast.*;
import net.sourceforge.czt.z.ast.*;
import net.sourceforge.czt.z.visitor.*;
import net.sourceforge.czt.base.util.*;
import net.sourceforge.czt.base.visitor.*;
import net.sourceforge.czt.typecheck.util.typingenv.*;
import net.sourceforge.czt.typecheck.util.impl.*;

/**
 */
class SpecChecker
  extends Checker
  implements SpecVisitor,
             ZSectVisitor,
             ParentVisitor,
             SectVisitor
{
  public SpecChecker(TypeChecker typeChecker)
  {
    super(typeChecker);
  }

  public Object visitSpec(Spec spec)
  {
    List sects = spec.getSect();
    for (Iterator iter = sects.iterator(); iter.hasNext(); ) {
      Sect sect = (Sect) iter.next();
      sect.accept(this);
    }

    //sectTypeEnv().dump();

    //if there are any errors, return false
    Boolean result = Boolean.TRUE;
    if (errors().size() > 0) {
      result = Boolean.FALSE;
    }
    return result;
  }

  /**
   * Any "left over" sections.
   */
  public Object visitSect(Sect sect)
  {
    return Boolean.TRUE;
  }

  public Object visitZSect(ZSect zSect)
  {
    debug("visiting ZSect " + zSect.getName());

    sectName(zSect.getName());

    //if this section has already been declared, raise an error
    if (sectTypeEnv().isChecked(sectName())) {
      ErrorAnn message = errorFactory().redeclaredSection(zSect);
      error(zSect, message);
    }

    //set this as the new section in SectTypeEnv and ErrorFactory
    sectTypeEnv().setSection(sectName());
    errorFactory().setSection(sectName());

    //get and visit the parent sections of the current section
    List parents = zSect.getParent();
    List names = list();
    for (Iterator iter = parents.iterator(); iter.hasNext(); ) {
      Parent parent = (Parent) iter.next();
      parent.accept(this);

      if (names.contains(parent.getWord())) {
        ErrorAnn message = errorFactory().redeclaredParent(parent, sectName());
        error(parent, message);
      }
      else if (parent.getWord().equals(sectName())) {
        ErrorAnn message = errorFactory().selfParent(parent);
        error(parent, message);
      }
      else {
        names.add(parent.getWord());
      }
    }

    //get and visit the paragraphs of the current section
    List paras = zSect.getPara();
    for (Iterator iter = paras.iterator(); iter.hasNext(); ) {
      Para para = (Para) iter.next();
      para.accept(paraChecker());
    }

    //post-check any previously unresolved expressions
    postChecker().postCheck();

    //annotate this section with the type info from this section
    //and its parents
    addAnn(zSect, sectTypeEnv().getSectTypeEnvAnn());

    //if there are any errors, return false
    Boolean result = Boolean.TRUE;
    if (errors().size() > 0) {
      result = Boolean.FALSE;
    }
    return result;
  }

  public Object visitParent(Parent parent)
  {
    sectTypeEnv().addParent(parent.getWord());

    TermA termA = (TermA) sectInfo().getInfo(parent.getWord(), ZSect.class);
    String section = sectTypeEnv().getSection();

    //if there is no SectTypeEnvAnn, then we must typecheck this section
    SectTypeEnvAnn ann = (SectTypeEnvAnn) termA.getAnn(SectTypeEnvAnn.class);
    if (ann == null) {
      List errors = TypeCheckUtils.typecheck(termA, sectInfo());
      errors().addAll(errors);
      ann = (SectTypeEnvAnn) termA.getAnn(SectTypeEnvAnn.class);
    }

    List triples = ann.getNameSectTypeTriple();
    for (Iterator iter = triples.iterator(); iter.hasNext(); ) {
      NameSectTypeTriple triple = (NameSectTypeTriple) iter.next();
      sectTypeEnv().addParent(triple.getSect());
      sectTypeEnv().add(triple);
    }
    sectTypeEnv().setSection(section);
    errorFactory().setSection(section);
    return null;
  }
}
