/**
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

import java.io.*;
import java.util.logging.*;

import net.sourceforge.czt.core.util.*;
import net.sourceforge.czt.core.jaxb.JaxbXmlReader;
import net.sourceforge.czt.core.jaxb.JaxbXmlWriter;
import net.sourceforge.czt.core.dom.DomXmlWriter;
import net.sourceforge.czt.core.ast.Spec;

public class Main {
  public static void main( String[] args ) {
    try {
      // Unmarshal file eg1.xml ...
      XmlReader reader = new JaxbXmlReader();
      Spec spec =
	(Spec) reader.read(new java.io.File("../../../zml/examples/eg1.xml"));

      // ... and marshal it to stdout
      // first we use Jaxb
      XmlWriter writer = new JaxbXmlWriter();
      System.out.println("****************************************");
      System.out.println("Marshalling using Jaxb");
      System.out.println("****************************************");
      writer.write(spec, System.out);

      // now we use DOM
      System.out.println();
      System.out.println("****************************************");
      System.out.println("Marshalling using DOM");
      System.out.println("(namespace information and nice indentation missing):");
      System.out.println("****************************************");
      writer = new DomXmlWriter();
      writer.write(spec, System.out);
    } catch( Exception e ) {
      e.printStackTrace();
    }
  }
}
