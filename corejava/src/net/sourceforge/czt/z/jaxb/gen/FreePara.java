//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.2-b15-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2003.12.09 at 10:30:14 NZDT 
//


package net.sourceforge.czt.z.jaxb.gen;


/**
 * Java content class for FreePara complex type.
 * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/research/projects/gnast/src/xsd/Z.xsd line 749)
 * <p>
 * <pre>
 * &lt;complexType name="FreePara">
 *   &lt;complexContent>
 *     &lt;extension base="{http://czt.sourceforge.net/zml}Para">
 *       &lt;sequence>
 *         &lt;element ref="{http://czt.sourceforge.net/zml}Freetype" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface FreePara
    extends net.sourceforge.czt.z.jaxb.gen.Para
{


    /**
     * Gets the value of the Freetype property.
     * 
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the Freetype property.
     * 
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFreetype().add(newItem);
     * </pre>
     * 
     * 
     * Objects of the following type(s) are allowed in the list
     * {@link net.sourceforge.czt.z.jaxb.gen.Freetype}
     * {@link net.sourceforge.czt.z.jaxb.gen.FreetypeElement}
     * 
     */
    java.util.List getFreetype();

}
