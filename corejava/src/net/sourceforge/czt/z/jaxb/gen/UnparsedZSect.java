//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.4-b18-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2005.03.01 at 02:55:30 GMT 
//


package net.sourceforge.czt.z.jaxb.gen;


/**
 * Java content class for UnparsedZSect complex type.
 * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/research/czt/gnast/src/xsd/Z.xsd line 1152)
 * <p>
 * <pre>
 * &lt;complexType name="UnparsedZSect">
 *   &lt;complexContent>
 *     &lt;extension base="{http://czt.sourceforge.net/zml}Sect">
 *       &lt;sequence>
 *         &lt;element name="Content" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface UnparsedZSect
    extends net.sourceforge.czt.z.jaxb.gen.Sect
{


    /**
     * Gets the value of the content property.
     * 
     * @return
     *     possible object is
     *     {@link org.w3._2001.xmlschema.AnyType}
     */
    org.w3._2001.xmlschema.AnyType getContent();

    /**
     * Sets the value of the content property.
     * 
     * @param value
     *     allowed object is
     *     {@link org.w3._2001.xmlschema.AnyType}
     */
    void setContent(org.w3._2001.xmlschema.AnyType value);

}
