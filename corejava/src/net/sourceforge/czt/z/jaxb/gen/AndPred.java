//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.4-b18-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2005.02.23 at 12:42:00 GMT 
//


package net.sourceforge.czt.z.jaxb.gen;


/**
 * Java content class for AndPred complex type.
 * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/research/czt/gnast/src/xsd/Z.xsd line 1635)
 * <p>
 * <pre>
 * &lt;complexType name="AndPred">
 *   &lt;complexContent>
 *     &lt;extension base="{http://czt.sourceforge.net/zml}Pred2">
 *       &lt;attribute name="Op" type="{http://czt.sourceforge.net/zml}Op" default="And" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface AndPred
    extends net.sourceforge.czt.z.jaxb.gen.Pred2
{


    /**
     * Gets the value of the op property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getOp();

    /**
     * Sets the value of the op property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setOp(java.lang.String value);

}
