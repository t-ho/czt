<?xml version="1.0"?> 
<!-- -->
<!-- qntpred.xsl -->
<!-- -->
<!-- -->
<!-- -->
<!-- @author: Gerret Apelt -->
<!-- @date: $date$ -->
<!-- @version: $version$ -->
<!-- -->
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
  xmlns:Z="http://czt.sourceforge.net/zml"
  xmlns:xalan="http://xml.apache.org/xalan"
  xmlns:cztext="xalan://net.sourceforge.czt.zmltp.xslextension.NodesetSemanticIntersection"
  xmlns="http://czt.sourceforge.net/zml"
  version="1.0">

  <xsl:template match="Z:SchText" mode="Qnt1PredDeclarations">    
    <xsl:for-each select="child::*[cztext:isInSubstitutionGroup(., $dsgns/*)]">
      <xsl:apply-templates select="."/>
      <xsl:if test="position() != last()">; </xsl:if>
    </xsl:for-each>
  </xsl:template>

  <xsl:template match="Z:SchText" mode="Qnt1PredPredicates">
    <xsl:for-each select="child::*[last() and cztext:isInSubstitutionGroup(., $psgns/*)]">
      <xsl:apply-templates select="."/>
    </xsl:for-each>
  </xsl:template>

  <!-- Render an existential quantifier expression -->
  <xsl:template match="Z:ExistsPred">
    &#x2203;
    <xsl:apply-templates select="Z:SchText" mode="Qnt1PredDeclarations"/>
    <xsl:if test="Z:SchText/child::*[cztext:isInSubstitutionGroup(., $psgns/*)]"> | </xsl:if>
    <xsl:apply-templates select="Z:SchText" mode="Qnt1PredPredicates"/>
    <xsl:if test="child::*[last() and cztext:isInSubstitutionGroup(., $psgns/*)]">     
      &#x2981;
      <xsl:apply-templates select="child::*[last()]"/>
    </xsl:if>
  </xsl:template>

  <!-- Exists1Expr -->
  <xsl:template match="Z:ExistsPred">
    &#x2203;
    <xsl:apply-templates select="Z:SchText" mode="Qnt1PredDeclarations"/>
    <xsl:if test="Z:SchText/child::*[cztext:isInSubstitutionGroup(., $psgns/*)]"> | </xsl:if>
    <xsl:apply-templates select="Z:SchText" mode="Qnt1PredPredicates"/>
    <xsl:if test="child::*[last() and cztext:isInSubstitutionGroup(., $psgns/*)]">     
      &#x2981;
      <xsl:apply-templates select="child::*[last()]"/>
    </xsl:if>
  </xsl:template>

  <!-- ForAll Expression -->
  <xsl:template match="Z:ExistsPred">
    &#x2200;
    <xsl:apply-templates select="Z:SchText" mode="Qnt1PredDeclarations"/>
    <xsl:if test="Z:SchText/child::*[cztext:isInSubstitutionGroup(., $psgns/*)]"> | </xsl:if>
    <xsl:apply-templates select="Z:SchText" mode="Qnt1PredPredicates"/>
    <xsl:if test="child::*[last() and cztext:isInSubstitutionGroup(., $psgns/*)]">     
      &#x2981;
      <xsl:apply-templates select="child::*[last()]"/>
    </xsl:if>
  </xsl:template>

</xsl:stylesheet>

