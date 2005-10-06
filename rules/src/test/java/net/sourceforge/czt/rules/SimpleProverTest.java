/*
  Copyright (C) 2005 Mark Utting
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

import java.io.*;
import java.net.URL;
import java.util.*;

import junit.framework.*;

import net.sourceforge.czt.base.ast.Term;
import net.sourceforge.czt.parser.util.ParseException;
import net.sourceforge.czt.parser.zpatt.ParseUtils;
import net.sourceforge.czt.print.z.PrintUtils;
import net.sourceforge.czt.rules.ast.*;
import net.sourceforge.czt.session.*;
import net.sourceforge.czt.z.ast.*;
import net.sourceforge.czt.z.visitor.*;
import net.sourceforge.czt.zpatt.ast.*;
import net.sourceforge.czt.zpatt.util.Factory;
import net.sourceforge.czt.zpatt.jaxb.JaxbXmlReader;

public class SimpleProverTest
  extends TestCase
{
  Factory factory_ = new Factory(new ProverFactory());
  SectionManager manager_ = new SectionManager();

  public void testSimple1()
  {
    prove("/simple1.tex");
  }

  public void testSimple2()
  {
    prove("/simple2.tex");
  }

  public void testSimple3()
  {
    prove("/simple3.tex");
  }

  private void prove(String resource)
  {
    try {
      URL url = getClass().getResource(resource);
      assertFalse(url == null);
      Term term = ParseUtils.parse(new UrlSource(url), manager_);
      String sectname = term.accept(new GetZSectNameVisitor());
      List<Rule> rules = collectRules(term);
      List<ConjPara> conjectures = collectConjectures(term);
      for (Iterator<ConjPara> i = conjectures.iterator(); i.hasNext(); ) {
        ConjPara conjPara = i.next();
        PredSequent sequent = factory_.createPredSequent();
	SimpleProver.CopyVisitor visitor =
	    new SimpleProver.CopyVisitor(factory_);
        sequent.setPred((Pred) conjPara.getPred().accept(visitor));
        SimpleProver prover =
          new SimpleProver(rules, factory_, manager_, sectname);
        if (! prover.prove(sequent)) {
          StringWriter writer = new StringWriter();
          PrintUtils.print(conjPara.getPred(),
                           writer,
                           manager_,
                           "standard_toolkit",
                           Markup.LATEX);
          writer.close();
          fail("Failed to prove " + writer.toString());
        }
      }
    }
    catch (ParseException e) {
      fail("Should not throw exception " + e);
    }
    catch (IOException e) {
      fail("Should not throw exception " + e);
    }
  }

  public static List<Rule> collectRules(Term term)
  {
    List<Rule> result = new ArrayList<Rule>();  
    if (term instanceof Spec) {
      for (Iterator i = ((Spec) term).getSect().iterator(); i.hasNext(); ) {
        Sect sect = (Sect) i.next();
        if (sect instanceof ZSect) {
          for (Iterator j = ((ZSect) sect).getPara().iterator();
               j.hasNext(); ) {
            Para para = (Para) j.next();
            if (para instanceof Rule) {
              result.add((Rule) para);
            }
          }
        }
      }
    }
    return result;
  }

  public static List<ConjPara> collectConjectures(Term term)
  {
    List<ConjPara> result = new ArrayList<ConjPara>();  
    if (term instanceof Spec) {
      for (Iterator i = ((Spec) term).getSect().iterator(); i.hasNext(); ) {
        Sect sect = (Sect) i.next();
        if (sect instanceof ZSect) {
          for (Iterator j = ((ZSect) sect).getPara().iterator();
               j.hasNext(); ) {
            Para para = (Para) j.next();
            if (para instanceof ConjPara) {
              result.add((ConjPara) para);
            }
          }
        }
      }
    }
    return result;
  }

  public static class GetZSectNameVisitor
    implements SpecVisitor<String>,
               ZSectVisitor<String>
  {
    public String visitSpec(Spec spec)
    {
      for (Sect sect : spec.getSect()) {
        String name = sect.accept(this);
        if (name != null) return name;
      }
      return null;
    }

    public String visitZSect(ZSect zSect)
    {
      return zSect.getName();
    }
  }
}
