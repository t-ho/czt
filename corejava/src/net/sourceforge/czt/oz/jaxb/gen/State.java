//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.4-b18-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2005.03.01 at 10:46:36 GMT 
//


package net.sourceforge.czt.oz.jaxb.gen;


/**
 * Java content class for State complex type.
 * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/research/czt/gnast/src/xsd/Object-Z.xsd line 245)
 * <p>
 * <pre>
 * &lt;complexType name="State">
 *   &lt;complexContent>
 *     &lt;extension base="{http://czt.sourceforge.net/zml}TermA">
 *       &lt;sequence>
 *         &lt;element name="PrimaryDecl" type="{http://czt.sourceforge.net/zml}Decl" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SecondaryDecl" type="{http://czt.sourceforge.net/zml}Decl" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://czt.sourceforge.net/zml}Pred" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface State
    extends net.sourceforge.czt.z.jaxb.gen.TermA
{


    /**
     * Gets the value of the SecondaryDecl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the SecondaryDecl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSecondaryDecl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link net.sourceforge.czt.z.jaxb.gen.Decl}
     * 
     */
    java.util.List getSecondaryDecl();

    /**
     * Gets the value of the PrimaryDecl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the PrimaryDecl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrimaryDecl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link net.sourceforge.czt.z.jaxb.gen.Decl}
     * 
     */
    java.util.List getPrimaryDecl();

    /**
     * Gets the value of the pred property.
     * 
     * @return
     *     possible object is
     *     {@link net.sourceforge.czt.z.jaxb.gen.PredElement}
     *     {@link net.sourceforge.czt.z.jaxb.gen.FalsePred}
     *     {@link net.sourceforge.czt.z.jaxb.gen.AndPredElement}
     *     {@link net.sourceforge.czt.z.jaxb.gen.ExprPredElement}
     *     {@link net.sourceforge.czt.z.jaxb.gen.TruePred}
     *     {@link net.sourceforge.czt.z.jaxb.gen.Exists1Pred}
     *     {@link net.sourceforge.czt.z.jaxb.gen.ForallPred}
     *     {@link net.sourceforge.czt.zpatt.jaxb.gen.JokerPredElement}
     *     {@link net.sourceforge.czt.z.jaxb.gen.Pred}
     *     {@link net.sourceforge.czt.z.jaxb.gen.MemPredElement}
     *     {@link net.sourceforge.czt.z.jaxb.gen.IffPred}
     *     {@link net.sourceforge.czt.z.jaxb.gen.OrPred}
     *     {@link net.sourceforge.czt.z.jaxb.gen.ImpliesPred}
     *     {@link net.sourceforge.czt.z.jaxb.gen.NegPredElement}
     *     {@link net.sourceforge.czt.z.jaxb.gen.ExistsPred}
     */
    net.sourceforge.czt.z.jaxb.gen.Pred getPred();

    /**
     * Sets the value of the pred property.
     * 
     * @param value
     *     allowed object is
     *     {@link net.sourceforge.czt.z.jaxb.gen.PredElement}
     *     {@link net.sourceforge.czt.z.jaxb.gen.FalsePred}
     *     {@link net.sourceforge.czt.z.jaxb.gen.AndPredElement}
     *     {@link net.sourceforge.czt.z.jaxb.gen.ExprPredElement}
     *     {@link net.sourceforge.czt.z.jaxb.gen.TruePred}
     *     {@link net.sourceforge.czt.z.jaxb.gen.Exists1Pred}
     *     {@link net.sourceforge.czt.z.jaxb.gen.ForallPred}
     *     {@link net.sourceforge.czt.zpatt.jaxb.gen.JokerPredElement}
     *     {@link net.sourceforge.czt.z.jaxb.gen.Pred}
     *     {@link net.sourceforge.czt.z.jaxb.gen.MemPredElement}
     *     {@link net.sourceforge.czt.z.jaxb.gen.IffPred}
     *     {@link net.sourceforge.czt.z.jaxb.gen.OrPred}
     *     {@link net.sourceforge.czt.z.jaxb.gen.ImpliesPred}
     *     {@link net.sourceforge.czt.z.jaxb.gen.NegPredElement}
     *     {@link net.sourceforge.czt.z.jaxb.gen.ExistsPred}
     */
    void setPred(net.sourceforge.czt.z.jaxb.gen.Pred value);

}
