//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.4-b18-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2005.02.23 at 12:42:00 GMT 
//


package net.sourceforge.czt.z.jaxb.gen;


/**
 * Java content class for ApplExpr complex type.
 * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/research/czt/gnast/src/xsd/Z.xsd line 1545)
 * <p>
 * <pre>
 * &lt;complexType name="ApplExpr">
 *   &lt;complexContent>
 *     &lt;extension base="{http://czt.sourceforge.net/zml}Expr2">
 *       &lt;attribute name="Mixfix" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface ApplExpr
    extends net.sourceforge.czt.z.jaxb.gen.Expr2
{


    /**
     * Gets the value of the mixfix property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.Boolean}
     */
    java.lang.Boolean getMixfix();

    /**
     * Sets the value of the mixfix property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.Boolean}
     */
    void setMixfix(java.lang.Boolean value);

}
