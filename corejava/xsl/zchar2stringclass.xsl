<?xml version="1.0" encoding="utf-8"?>
<xsl:transform xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
                version="1.0">

  <xsl:output method="text"/>
  <xsl:strip-space elements="*"/>

  <xsl:template match="/">
    <xsl:text>
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

package net.sourceforge.czt.z.util;

/**
 * An interface for commonly used Z characters.
 *
 * @author generated by Gnast XSL script zchar2stringclass.xsl
 */
public interface ZString
{
</xsl:text>
<xsl:apply-templates select="*"/>
<xsl:text>
  String SUB1 = SE + "1" + NW;
  String SUP1 = NE + "1" + SW;
  String ZED = ZEDCHAR;
  String AX = AXCHAR;
  String SCH = SCHCHAR;
  String GENAX = AXCHAR + GENCHAR;
  String GENSCH = SCHCHAR + GENCHAR;
  String END = ENDCHAR;
  String NL = NLCHAR;
  String CONJECTURE = VDASH + "?";
}
</xsl:text>
  </xsl:template>

  <xsl:template match="*[@regexp]"/>

  <xsl:template match="char">
    <xsl:text>

  /**
   * </xsl:text><xsl:value-of select="@description"/><xsl:text>.
   */
  String </xsl:text>
    <xsl:value-of select="@id"/>
    <xsl:text> = String.valueOf(ZChar.</xsl:text>
    <xsl:value-of select="@id"/>
    <xsl:text>);</xsl:text>
  </xsl:template>

</xsl:transform>
