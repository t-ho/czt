//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.4-b18-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2005.02.23 at 12:42:00 GMT 
//


package net.sourceforge.czt.z.jaxb.gen;


/**
 * Java content class for GenParamType complex type.
 * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/research/czt/gnast/src/xsd/Z.xsd line 1768)
 * <p>
 * <pre>
 * &lt;complexType name="GenParamType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://czt.sourceforge.net/zml}Type2">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://czt.sourceforge.net/zml}DeclName"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface GenParamType
    extends net.sourceforge.czt.z.jaxb.gen.Type2
{


    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link net.sourceforge.czt.z.jaxb.gen.DeclName}
     */
    net.sourceforge.czt.z.jaxb.gen.DeclName getName();

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link net.sourceforge.czt.z.jaxb.gen.DeclName}
     */
    void setName(net.sourceforge.czt.z.jaxb.gen.DeclName value);

}
