//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.4-b18-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2005.02.23 at 12:42:00 GMT 
//


package net.sourceforge.czt.oz.jaxb.gen;


/**
 * Java content class for ClassType complex type.
 * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/research/czt/gnast/src/xsd/Object-Z.xsd line 362)
 * <p>
 * <pre>
 * &lt;complexType name="ClassType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://czt.sourceforge.net/zml}Type2">
 *       &lt;sequence>
 *         &lt;element ref="{http://czt.sourceforge.net/object-z}ClassSignature"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface ClassType
    extends net.sourceforge.czt.z.jaxb.gen.Type2
{


    /**
     * Gets the value of the classSignature property.
     * 
     * @return
     *     possible object is
     *     {@link net.sourceforge.czt.oz.jaxb.gen.ClassSignatureElement}
     *     {@link net.sourceforge.czt.oz.jaxb.gen.ClassSignature}
     */
    net.sourceforge.czt.oz.jaxb.gen.ClassSignature getClassSignature();

    /**
     * Sets the value of the classSignature property.
     * 
     * @param value
     *     allowed object is
     *     {@link net.sourceforge.czt.oz.jaxb.gen.ClassSignatureElement}
     *     {@link net.sourceforge.czt.oz.jaxb.gen.ClassSignature}
     */
    void setClassSignature(net.sourceforge.czt.oz.jaxb.gen.ClassSignature value);

}
