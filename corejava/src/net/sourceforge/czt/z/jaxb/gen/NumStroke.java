//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.2-b15-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2004.01.06 at 09:18:18 NZDT 
//


package net.sourceforge.czt.z.jaxb.gen;


/**
 * Multidigit strokes are not allowed
 * Java content class for NumStroke complex type.
 * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/research/projects/gnast/src/xsd/Z.xsd line 887)
 * <p>
 * <pre>
 * &lt;complexType name="NumStroke">
 *   &lt;complexContent>
 *     &lt;extension base="{http://czt.sourceforge.net/zml}Stroke">
 *       &lt;attribute name="Number" use="required" type="{http://czt.sourceforge.net/zml}Number" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface NumStroke
    extends net.sourceforge.czt.z.jaxb.gen.Stroke
{


    /**
     * 
     * @return
     *     possible object is
     *     {@link java.lang.Integer}
     */
    java.lang.Integer getNumber();

    /**
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.Integer}
     */
    void setNumber(java.lang.Integer value);

}
