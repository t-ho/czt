//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.2-b15-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2003.12.09 at 10:30:14 NZDT 
//


package net.sourceforge.czt.z.jaxb.gen;


/**
 * Java content class for OptempPara complex type.
 * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/research/projects/gnast/src/xsd/Z.xsd line 776)
 * <p>
 * <pre>
 * &lt;complexType name="OptempPara">
 *   &lt;complexContent>
 *     &lt;extension base="{http://czt.sourceforge.net/zml}Para">
 *       &lt;choice maxOccurs="unbounded" minOccurs="2">
 *         &lt;element name="Word" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element ref="{http://czt.sourceforge.net/zml}Operand"/>
 *       &lt;/choice>
 *       &lt;attribute name="Prec" use="required" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="Cat" use="required" type="{http://czt.sourceforge.net/zml}Cat" />
 *       &lt;attribute name="Assoc" type="{http://czt.sourceforge.net/zml}Assoc" default="Left" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface OptempPara
    extends net.sourceforge.czt.z.jaxb.gen.Para
{


    /**
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getCat();

    /**
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setCat(java.lang.String value);

    /**
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getAssoc();

    /**
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setAssoc(java.lang.String value);

    /**
     * 
     * @return
     *     possible object is
     *     {@link java.lang.Integer}
     */
    java.lang.Integer getPrec();

    /**
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.Integer}
     */
    void setPrec(java.lang.Integer value);

    /**
     * Gets the value of the WordOrOperand property.
     * 
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the WordOrOperand property.
     * 
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWordOrOperand().add(newItem);
     * </pre>
     * 
     * 
     * Objects of the following type(s) are allowed in the list
     * {@link net.sourceforge.czt.z.jaxb.gen.OptempPara.Word}
     * {@link net.sourceforge.czt.z.jaxb.gen.OperandElement}
     * 
     */
    java.util.List getWordOrOperand();


    /**
     * Java content class for Word element declaration.
     * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/research/projects/gnast/src/xsd/Z.xsd line 785)
     * <p>
     * <pre>
     * &lt;element name="Word" type="{http://www.w3.org/2001/XMLSchema}string"/>
     * </pre>
     * 
     */
    public interface Word
        extends javax.xml.bind.Element
    {


        /**
         * 
         * @return
         *     possible object is
         *     {@link java.lang.String}
         */
        java.lang.String getValue();

        /**
         * 
         * @param value
         *     allowed object is
         *     {@link java.lang.String}
         */
        void setValue(java.lang.String value);

    }

}
