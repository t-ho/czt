//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.2-b15-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2003.10.28 at 04:14:13 NZDT 
//


package net.sourceforge.czt.core.jaxb.gen;


/**
 * Java content class for BindSelExpr complex type.
 * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/research/projects/gnast/src/xsd/Z.xsd line 1022)
 * <p>
 * <pre>
 * &lt;complexType name="BindSelExpr">
 *   &lt;complexContent>
 *     &lt;extension base="{http://czt.sourceforge.net/zml}Expr1">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://czt.sourceforge.net/zml}RefName"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface BindSelExpr
    extends net.sourceforge.czt.core.jaxb.gen.Expr1
{


    /**
     * 
     * @return
     *     possible object is
     *     {@link net.sourceforge.czt.core.jaxb.gen.RefName}
     */
    net.sourceforge.czt.core.jaxb.gen.RefName getName();

    /**
     * 
     * @param value
     *     allowed object is
     *     {@link net.sourceforge.czt.core.jaxb.gen.RefName}
     */
    void setName(net.sourceforge.czt.core.jaxb.gen.RefName value);

}
