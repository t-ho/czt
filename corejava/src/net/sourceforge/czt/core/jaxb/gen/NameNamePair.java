//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.1-05/30/2003 05:06 AM(java_re)-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2003.10.08 at 02:45:10 NZDT 
//


package net.sourceforge.czt.core.jaxb.gen;


/**
 * Java content class for NameNamePair complex type.
 *  <p>The following schema fragment specifies the expected content contained within this java content object.
 * <p>
 * <pre>
 * &lt;complexType name="NameNamePair">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OldName" type="{http://czt.sourceforge.net/zml}RefName"/>
 *         &lt;element name="NewName" type="{http://czt.sourceforge.net/zml}DeclName"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface NameNamePair {


    /**
     * 
     * @return possible object is
     * {@link net.sourceforge.czt.core.jaxb.gen.DeclName}
     */
    net.sourceforge.czt.core.jaxb.gen.DeclName getNewName();

    /**
     * 
     * @param value allowed object is
     * {@link net.sourceforge.czt.core.jaxb.gen.DeclName}
     */
    void setNewName(net.sourceforge.czt.core.jaxb.gen.DeclName value);

    /**
     * 
     * @return possible object is
     * {@link net.sourceforge.czt.core.jaxb.gen.RefName}
     */
    net.sourceforge.czt.core.jaxb.gen.RefName getOldName();

    /**
     * 
     * @param value allowed object is
     * {@link net.sourceforge.czt.core.jaxb.gen.RefName}
     */
    void setOldName(net.sourceforge.czt.core.jaxb.gen.RefName value);

}
