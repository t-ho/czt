//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.4-b18-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2005.03.01 at 10:46:36 GMT 
//


package net.sourceforge.czt.circus.jaxb.gen;


/**
 * Java content class for MixedField complex type.
 * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/research/czt/gnast/src/xsd/Circus.xsd line 1557)
 * <p>
 * <pre>
 * &lt;complexType name="MixedField">
 *   &lt;complexContent>
 *     &lt;extension base="{http://czt.sourceforge.net/circus}Field">
 *       &lt;sequence>
 *         &lt;element ref="{http://czt.sourceforge.net/circus}InputField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://czt.sourceforge.net/circus}OutputField" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface MixedField
    extends net.sourceforge.czt.circus.jaxb.gen.Field
{


    /**
     * Gets the value of the InputField property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the InputField property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInputField().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link net.sourceforge.czt.circus.jaxb.gen.InputField}
     * {@link net.sourceforge.czt.circus.jaxb.gen.InputFieldElement}
     * 
     */
    java.util.List getInputField();

    /**
     * Gets the value of the OutputField property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the OutputField property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOutputField().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link net.sourceforge.czt.circus.jaxb.gen.OutputField}
     * {@link net.sourceforge.czt.circus.jaxb.gen.OutputFieldElement}
     * 
     */
    java.util.List getOutputField();

}
