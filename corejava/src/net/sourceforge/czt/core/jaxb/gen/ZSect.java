//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.2-b15-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2003.10.28 at 04:14:13 NZDT 
//


package net.sourceforge.czt.core.jaxb.gen;


/**
 * A parsed Z section (may contain unparsed paragraphs)
 * Java content class for ZSect complex type.
 * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/research/projects/gnast/src/xsd/Z.xsd line 635)
 * <p>
 * <pre>
 * &lt;complexType name="ZSect">
 *   &lt;complexContent>
 *     &lt;extension base="{http://czt.sourceforge.net/zml}Sect">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element ref="{http://czt.sourceforge.net/zml}Parent" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://czt.sourceforge.net/zml}Para" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface ZSect
    extends net.sourceforge.czt.core.jaxb.gen.Sect
{


    /**
     * Gets the value of the Parent property.
     * 
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the Parent property.
     * 
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParent().add(newItem);
     * </pre>
     * 
     * 
     * Objects of the following type(s) are allowed in the list
     * {@link net.sourceforge.czt.core.jaxb.gen.Parent}
     * {@link net.sourceforge.czt.core.jaxb.gen.ParentElement}
     * 
     */
    java.util.List getParent();

    /**
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getName();

    /**
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setName(java.lang.String value);

    /**
     * Gets the value of the Para property.
     * 
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the Para property.
     * 
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPara().add(newItem);
     * </pre>
     * 
     * 
     * Objects of the following type(s) are allowed in the list
     * {@link net.sourceforge.czt.core.jaxb.gen.GivenParaElement}
     * {@link net.sourceforge.czt.oz.jaxb.gen.ClassParaElement}
     * {@link net.sourceforge.czt.core.jaxb.gen.ParaElement}
     * {@link net.sourceforge.czt.core.jaxb.gen.ConjParaElement}
     * {@link net.sourceforge.czt.core.jaxb.gen.FreeParaElement}
     * {@link net.sourceforge.czt.core.jaxb.gen.NarrParaElement}
     * {@link net.sourceforge.czt.core.jaxb.gen.Para}
     * {@link net.sourceforge.czt.core.jaxb.gen.OptempParaElement}
     * {@link net.sourceforge.czt.core.jaxb.gen.AxParaElement}
     * {@link net.sourceforge.czt.core.jaxb.gen.UnparsedParaElement}
     * 
     */
    java.util.List getPara();

}
