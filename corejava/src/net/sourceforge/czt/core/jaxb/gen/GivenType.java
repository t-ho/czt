//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.1-05/30/2003 05:06 AM(java_re)-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2003.08.20 at 09:36:24 NZST 
//


package net.sourceforge.czt.core.jaxb.gen;


/**
 * Java content class for GivenType complex type.
 *  <p>The following schema fragment specifies the expected content contained within this java content object.
 * <p>
 * <pre>
 * &lt;complexType name="GivenType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://czt.sourceforge.net/zml}Type">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://czt.sourceforge.net/zml}DeclName"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface GivenType
    extends net.sourceforge.czt.core.jaxb.gen.Type
{


    /**
     * 
     * @return possible object is
     * {@link net.sourceforge.czt.core.jaxb.gen.DeclName}
     */
    net.sourceforge.czt.core.jaxb.gen.DeclName getName();

    /**
     * 
     * @param value allowed object is
     * {@link net.sourceforge.czt.core.jaxb.gen.DeclName}
     */
    void setName(net.sourceforge.czt.core.jaxb.gen.DeclName value);

}
