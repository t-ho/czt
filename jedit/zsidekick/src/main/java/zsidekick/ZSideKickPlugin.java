/*
 * ZSideKickPlugin.java
 * Copyright (C) 2006, 2007 Petra Malik
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */
package zsidekick;

import net.sourceforge.czt.dc.z.DomainCheckPropertyKeys;
import net.sourceforge.czt.parser.util.ParsePropertiesKeys;
import net.sourceforge.czt.print.util.PrintPropertiesKeys;
import org.gjt.sp.jedit.*;

public class ZSideKickPlugin
  extends EditPlugin implements ParsePropertiesKeys,   
                                PrintPropertiesKeys,
                    	       net.sourceforge.czt.typecheck.z.TypecheckPropertiesKeys,
                             net.sourceforge.czt.typecheck.oz.TypecheckPropertiesKeys,
                            DomainCheckPropertyKeys
// normalise these names? or does jEdit require a full path name with the plugin? TODO
                            // from CZTPATH it does look it can be normalised! (Leo)
{
  // Parsing related
  public static final String PROP_IGNORE_UNKNOWN_LATEX_COMMANDS =
    "ZSideKickPlugin.ignoreUnknownLatexCommands";
  
  // Printing related
  public static final String PROP_PRINT_IDS =
    "ZSideKickPlugin.printIds";
  public static final String PROP_TXTWIDTH =
    "ZSideKickPlugin.textWidth";

  // Typechecking Z         related
  public static final String PROP_RECURSIVE_TYPES =
    "ZSideKickPlugin.recursiveTypes";

  // Typechecking OZ related
  public static final String PROP_USE_STRONG_TYPING =
    "ZSideKickPlugin.useStrongTyping";

  // jEdit related
  public static final String PROP_DEBUG_ZSIDEKICK = 
    "ZSideKickPlugin.debug";
  public static final String DEBUG_LOG_FILENAME=
    "JEdit-SectionManager.log";
  public static final String NAME = "zsidekick";
  public static final String OPTION_PREFIX = "options.zsidekick.";
  
  // CZT Session related
  public static final String PROP_CZTPATH = "czt.path";  
}
