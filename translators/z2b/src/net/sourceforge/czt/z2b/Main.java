package net.sourceforge.czt.z2b;
/**
Copyright 2003 Mark Utting
This file is part of the CZT project.

The CZT project contains free software; you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation; either version 2 of the License, or
(at your option) any later version.

The CZT project is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with CZT; if not, write to the Free Software
Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
*/

import java.io.*;
import java.util.logging.*;
import java.util.*;
import java.net.URL;

import net.sourceforge.czt.base.ast.*;
import net.sourceforge.czt.base.util.*;
import net.sourceforge.czt.z.ast.*;
import net.sourceforge.czt.z.jaxb.JaxbXmlReader;
import net.sourceforge.czt.z.dom.DomXmlWriter;

import net.sourceforge.czt.animation.gui.generation.*;
import net.sourceforge.czt.animation.gui.generation.plugins.*;
import net.sourceforge.czt.animation.gui.generation.plugins.impl.*;


/** Translate a Z specification from ZML format into B format.
 *
 *  It takes a file spec.xml and produces a file spec.mch.
 */
public class Main {

  private static PluginList plugins
    = new PluginList(
        new Class[] {
	  SpecSource.class,
	  SchemaExtractor.class,
	  SchemaIdentifier.class,
	  VariableExtractor.class},
	new Class[] {
	  SpecReaderSource.class,
	  VisitorSchemaExtractor.class,
	  CommandLineSchemaIdentifier.class,
	  DefaultVariableExtractor.class},
	"Z2B",
	"Translates a Z specification (*.xml) into B format (.mch).");
  
  public static void main(String[] args) {
    try {
      // set up our debug log.
      Handler handler = new FileHandler("z2b.log");
      handler.setLevel(Level.ALL);
      handler.setEncoding("utf8");
      Logger.getLogger("").addHandler(handler);
      Logger.getLogger("net.sourceforge.czt.z2b").setLevel(Level.FINEST);

      // process all command line arguments
      // Note: this may change the plugins from the defaults above.
      plugins.processOptions(args);

      // Now make shortcuts to the plugins that we need.
      SpecSource source
	= (SpecSource)plugins.getPlugin(SpecSource.class);

      // Now read the spec 
      Spec spec = (Spec)source.obtainSpec();
      URL specURL = source.getURL();


      // now create the output file
      Logger.getLogger("net.sourceforge.czt.z2b").
	fine("input file is "+specURL);

      // set up the translation engine
      Z2B tr = new Z2B(plugins,new net.sourceforge.czt.z.impl.ZFactoryImpl());

      // choose the section
      ZSect sect;
      List sects = spec.getSect();
      if (sects.size() == 1 && sects.get(0) instanceof ZSect) {
	sect = (ZSect)spec.getSect().get(0);
      } else {
	throw new BException("multiple sections not supported yet");
      }

      // do the translation
      BMachine mach = tr.makeBMachine(spec,sect,specURL);

      // Output the machine to the .mch file
      BWriter bwriter = createBWriter(specURL);
      mach.print(bwriter);
      bwriter.close();
    } catch( Exception e ) {
      e.printStackTrace();
    }
  }
 

  /** Create the output B file.
   *  TODO: make this a plugin!
   *
   *  It takes a file spec.xml and creates a file spec.mch.
   *
   * @param inName The path to the ZML file.  Must end with ".xml" or ".zml".
   */
  public static BWriter createBWriter(URL inName)
    throws IOException
  {
    // create output file (*.mch)
    String outName = inName.getPath();
    if ( ! inName.getProtocol().equals("file")) {
      // put the output in the current directory
      int slash = outName.lastIndexOf('/');
      if (slash >= 0 && slash < outName.length())
	outName = outName.substring(slash+1); 
    }
    // Now strip off any known suffix
    if (outName.endsWith(".xml")
	|| outName.endsWith(".zml")) {
      outName = outName.substring(0, outName.length()-4);
    }

    if (outName.length() == 0) {
      outName = "spec";
    }
    outName += ".mch";
    
    Writer out = new BufferedWriter(new FileWriter(outName));
    return new BWriter(out, inName.toString());
  }
}
