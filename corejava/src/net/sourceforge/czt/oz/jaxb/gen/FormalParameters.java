//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.2-b15-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2004.01.29 at 12:59:34 NZDT 
//


package net.sourceforge.czt.oz.jaxb.gen;


/**
 * Java content class for FormalParameters complex type.
 * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/research/projects/gnast/src/xsd/Object-Z.xsd line 225)
 * <p>
 * <pre>
 * &lt;complexType name="FormalParameters">
 *   &lt;complexContent>
 *     &lt;extension base="{http://czt.sourceforge.net/zml}TermA">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://czt.sourceforge.net/zml}DeclName" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface FormalParameters
    extends net.sourceforge.czt.z.jaxb.gen.TermA
{


    /**
     * Gets the value of the Name property.
     * 
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the Name property.
     * 
     * For example, to add a new item, do as follows:
     * <pre>
     *    getName().add(newItem);
     * </pre>
     * 
     * 
     * Objects of the following type(s) are allowed in the list
     * {@link net.sourceforge.czt.z.jaxb.gen.DeclName}
     * 
     */
    java.util.List getName();

}
