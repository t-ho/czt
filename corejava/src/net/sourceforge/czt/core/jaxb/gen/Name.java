//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.1-05/30/2003 05:06 AM(java_re)-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2003.08.25 at 03:03:07 NZST 
//


package net.sourceforge.czt.core.jaxb.gen;


/**
 * Java content class for Name complex type.
 *  <p>The following schema fragment specifies the expected content contained within this java content object.
 * <p>
 * <pre>
 * &lt;complexType name="Name">
 *   &lt;complexContent>
 *     &lt;extension base="{http://czt.sourceforge.net/zml}TermA">
 *       &lt;sequence>
 *         &lt;element name="Word" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element ref="{http://czt.sourceforge.net/zml}InStroke"/>
 *           &lt;element ref="{http://czt.sourceforge.net/zml}OutStroke"/>
 *           &lt;element ref="{http://czt.sourceforge.net/zml}NextStroke"/>
 *           &lt;element ref="{http://czt.sourceforge.net/zml}NumStroke"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface Name
    extends net.sourceforge.czt.core.jaxb.gen.TermA
{


    /**
     * 
     * @return possible object is
     * {@link java.lang.String}
     */
    java.lang.String getWord();

    /**
     * 
     * @param value allowed object is
     * {@link java.lang.String}
     */
    void setWord(java.lang.String value);

    /**
     * Gets the value of the Stroke property.
     * 
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there's any setter method for the Stroke property.
     * 
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStroke().add(newItem);
     * </pre>
     * 
     * 
     * Objects of the following type(s) are allowed in the list
     * {@link net.sourceforge.czt.core.jaxb.gen.NextStroke}
     * {@link net.sourceforge.czt.core.jaxb.gen.InStroke}
     * {@link net.sourceforge.czt.core.jaxb.gen.NumStrokeElement}
     * {@link net.sourceforge.czt.core.jaxb.gen.OutStroke}
     * 
     */
    java.util.List getStroke();

}
