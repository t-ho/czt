/*
 GAfFE - A (G)raphical (A)nimator (F)ront(E)nd for Z - Part of the CZT Project.
 Copyright 2003 Nicholas Daley

 This program is free software; you can redistribute it and/or
 modify it under the terms of the GNU General Public License
 as published by the Free Software Foundation; either version 2
 of the License, or (at your option) any later version.

 This program is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; without even the implied warranty of
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 GNU General Public License for more details.

 You should have received a copy of the GNU General Public License
 along with this program; if not, write to the Free Software
 Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */

package net.sourceforge.czt.animation.gui.history;

import java.net.URL;

import net.sourceforge.czt.animation.eval.ZLive;
import net.sourceforge.czt.animation.gui.temp.ZFactory;
import net.sourceforge.czt.parser.util.DefinitionTable;
import net.sourceforge.czt.parser.util.DefinitionTable.Definition;
import net.sourceforge.czt.session.Key;
import net.sourceforge.czt.session.Markup;
import net.sourceforge.czt.session.SectionManager;
import net.sourceforge.czt.session.Source;
import net.sourceforge.czt.session.UrlSource;
import net.sourceforge.czt.z.ast.Expr;
import net.sourceforge.czt.z.ast.ZSect;

/**
 * History Interface that proxy to ZLive.
 */
public class ZLiveHistory extends BasicHistory
{
  private ZLive zLive_;
  private SectionManager sectman_;
  private DefinitionTable dt;
  private Key key;
  /**
   * 
   */
  public ZLiveHistory()
  {
    super();
  }
  
  /**
   * @param stateSchema
   * @param initSchema
   */
  public ZLiveHistory(String stateSchema, String initSchema)
  {
    super();
    System.out.println("Please specify the URL for the tex file");
  }
  
  public ZLiveHistory(String stateSchema, String initSchema, URL specURL)
  {
    zLive_ = ZFactory.getZLive();
    sectman_ = zLive_.getSectionManager();
    sectman_.putCommands("zpatt");
    try {
      Source spec = new UrlSource(specURL);
      spec.setMarkup(Markup.LATEX);
      sectman_.put(new Key("ZLiveHistory",Source.class), spec);
      ZSect sec = (ZSect) sectman_.get(new Key("ZLiveHistory", ZSect.class));
      zLive_.setCurrentSection(sec.getName());
      key = new Key("ZLiveDefn", DefinitionTable.class);
      dt = (DefinitionTable) sectman_.get(key);
      this.activateSchema(initSchema);
    }
    catch (Exception e) {
      System.err.println("ERROR creating ZLiveHistory section: " + e);
      e.printStackTrace();
    }
  }
  
  public void activateSchema(String schema)
  {
    Definition def = dt.lookup(schema);
    Expr rhs = def.getExpr();
    zLive_.evalExpr(rhs);
  }
}
