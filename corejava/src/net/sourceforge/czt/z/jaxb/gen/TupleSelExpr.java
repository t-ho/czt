//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.4-b18-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2005.03.01 at 02:55:30 GMT 
//


package net.sourceforge.czt.z.jaxb.gen;


/**
 * Java content class for TupleSelExpr complex type.
 * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/research/czt/gnast/src/xsd/Z.xsd line 1538)
 * <p>
 * <pre>
 * &lt;complexType name="TupleSelExpr">
 *   &lt;complexContent>
 *     &lt;extension base="{http://czt.sourceforge.net/zml}Expr1">
 *       &lt;attribute name="Select" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface TupleSelExpr
    extends net.sourceforge.czt.z.jaxb.gen.Expr1
{


    /**
     * Gets the value of the select property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.Integer}
     */
    java.lang.Integer getSelect();

    /**
     * Sets the value of the select property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.Integer}
     */
    void setSelect(java.lang.Integer value);

}
