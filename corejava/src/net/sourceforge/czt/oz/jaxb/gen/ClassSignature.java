//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.4-b18-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2005.03.01 at 10:46:36 GMT 
//


package net.sourceforge.czt.oz.jaxb.gen;


/**
 * Java content class for ClassSignature complex type.
 * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/research/czt/gnast/src/xsd/Object-Z.xsd line 371)
 * <p>
 * <pre>
 * &lt;complexType name="ClassSignature">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ClassName" type="{http://czt.sourceforge.net/zml}DeclName" minOccurs="0"/>
 *         &lt;element name="PrimaryDecl" type="{http://czt.sourceforge.net/zml}Signature" minOccurs="0"/>
 *         &lt;element name="SecondaryDecl" type="{http://czt.sourceforge.net/zml}Signature" minOccurs="0"/>
 *         &lt;element name="ParentClass" type="{http://czt.sourceforge.net/zml}RefName" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Attribute" type="{http://czt.sourceforge.net/zml}NameTypePair" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Operation" type="{http://czt.sourceforge.net/object-z}NameSignaturePair" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Visibility" type="{http://czt.sourceforge.net/zml}RefName" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface ClassSignature {


    /**
     * Gets the value of the Visibility property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the Visibility property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVisibility().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link net.sourceforge.czt.z.jaxb.gen.RefName}
     * 
     */
    java.util.List getVisibility();

    /**
     * Gets the value of the Operation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the Operation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOperation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link net.sourceforge.czt.oz.jaxb.gen.NameSignaturePair}
     * 
     */
    java.util.List getOperation();

    /**
     * Gets the value of the secondaryDecl property.
     * 
     * @return
     *     possible object is
     *     {@link net.sourceforge.czt.z.jaxb.gen.Signature}
     */
    net.sourceforge.czt.z.jaxb.gen.Signature getSecondaryDecl();

    /**
     * Sets the value of the secondaryDecl property.
     * 
     * @param value
     *     allowed object is
     *     {@link net.sourceforge.czt.z.jaxb.gen.Signature}
     */
    void setSecondaryDecl(net.sourceforge.czt.z.jaxb.gen.Signature value);

    /**
     * Gets the value of the Attribute property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the Attribute property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttribute().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link net.sourceforge.czt.z.jaxb.gen.NameTypePair}
     * 
     */
    java.util.List getAttribute();

    /**
     * Gets the value of the primaryDecl property.
     * 
     * @return
     *     possible object is
     *     {@link net.sourceforge.czt.z.jaxb.gen.Signature}
     */
    net.sourceforge.czt.z.jaxb.gen.Signature getPrimaryDecl();

    /**
     * Sets the value of the primaryDecl property.
     * 
     * @param value
     *     allowed object is
     *     {@link net.sourceforge.czt.z.jaxb.gen.Signature}
     */
    void setPrimaryDecl(net.sourceforge.czt.z.jaxb.gen.Signature value);

    /**
     * Gets the value of the ParentClass property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ParentClass property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParentClass().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link net.sourceforge.czt.z.jaxb.gen.RefName}
     * 
     */
    java.util.List getParentClass();

    /**
     * Gets the value of the className property.
     * 
     * @return
     *     possible object is
     *     {@link net.sourceforge.czt.z.jaxb.gen.DeclName}
     */
    net.sourceforge.czt.z.jaxb.gen.DeclName getClassName();

    /**
     * Sets the value of the className property.
     * 
     * @param value
     *     allowed object is
     *     {@link net.sourceforge.czt.z.jaxb.gen.DeclName}
     */
    void setClassName(net.sourceforge.czt.z.jaxb.gen.DeclName value);

}
