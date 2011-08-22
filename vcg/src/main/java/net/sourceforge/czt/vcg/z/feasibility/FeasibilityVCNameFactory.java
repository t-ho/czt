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

package net.sourceforge.czt.vcg.z.feasibility;

import net.sourceforge.czt.vcg.util.VCNameFactory;
import net.sourceforge.czt.z.ast.Para;

/**
 *
 * @author Leo Freitas
 * @date Aug 19, 2011
 */
public class FeasibilityVCNameFactory implements VCNameFactory
{

  @Override
  public String createNameForVCOf(Para para, String type)
  {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public String createVCSectName(String originalSectName, String extra)
  {
    throw new UnsupportedOperationException("Not supported yet.");
  }

}