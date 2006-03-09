/*
  Copyright (C) 2005, 2006 Petra Malik
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

package net.sourceforge.czt.parser.util;

import net.sourceforge.czt.base.ast.Term;
import net.sourceforge.czt.session.*;
import net.sourceforge.czt.z.ast.Spec;
import net.sourceforge.czt.z.ast.ZSect;

public class TermCommand
  implements Command
{
  public boolean compute(String name, SectionManager manager)
    throws CommandException
  {
    final Key newKey = new Key(name, Term.class);
    Key zSectKey = new Key(name, ZSect.class);
    Key specKey = new Key(name, Spec.class);
    if (manager.isCached(zSectKey)) {
      manager.put(newKey, manager.get(zSectKey));
      return true;
    }
    if (manager.isCached(specKey)) {
      manager.put(newKey, manager.get(specKey));
      return true;
    }
    Term term = null;
    try {
      term = (ZSect) manager.get(zSectKey);
    }
    catch (CommandException exception) {
      term = (Spec) manager.get(specKey);
    }
    if (term != null) {
      manager.put(newKey, term);
      return true;
    }
    return false;
  }
}
