//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.4-b18-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2005.03.01 at 02:55:30 GMT 
//


package net.sourceforge.czt.circus.jaxb.gen;


/**
 * Java content class for ParAction complex type.
 * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/research/czt/gnast/src/xsd/Circus.xsd line 1310)
 * <p>
 * <pre>
 * &lt;complexType name="ParAction">
 *   &lt;complexContent>
 *     &lt;extension base="{http://czt.sourceforge.net/circus}Action2">
 *       &lt;sequence>
 *         &lt;element ref="{http://czt.sourceforge.net/circus}NameSet"/>
 *         &lt;element ref="{http://czt.sourceforge.net/circus}NameSet"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface ParAction
    extends net.sourceforge.czt.circus.jaxb.gen.Action2
{


    /**
     * Gets the value of the leftNameSet property.
     * 
     * @return
     *     possible object is
     *     {@link net.sourceforge.czt.circus.jaxb.gen.RefNameSetElement}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.UnionNameSet}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.DifferenceNameSet}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.IntersectionNameSet}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.NameSetElement}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.NameSet}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.SetNameSetElement}
     */
    net.sourceforge.czt.circus.jaxb.gen.NameSet getLeftNameSet();

    /**
     * Sets the value of the leftNameSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link net.sourceforge.czt.circus.jaxb.gen.RefNameSetElement}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.UnionNameSet}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.DifferenceNameSet}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.IntersectionNameSet}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.NameSetElement}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.NameSet}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.SetNameSetElement}
     */
    void setLeftNameSet(net.sourceforge.czt.circus.jaxb.gen.NameSet value);

    /**
     * Gets the value of the rightNameSet property.
     * 
     * @return
     *     possible object is
     *     {@link net.sourceforge.czt.circus.jaxb.gen.RefNameSetElement}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.UnionNameSet}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.DifferenceNameSet}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.IntersectionNameSet}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.NameSetElement}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.NameSet}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.SetNameSetElement}
     */
    net.sourceforge.czt.circus.jaxb.gen.NameSet getRightNameSet();

    /**
     * Sets the value of the rightNameSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link net.sourceforge.czt.circus.jaxb.gen.RefNameSetElement}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.UnionNameSet}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.DifferenceNameSet}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.IntersectionNameSet}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.NameSetElement}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.NameSet}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.SetNameSetElement}
     */
    void setRightNameSet(net.sourceforge.czt.circus.jaxb.gen.NameSet value);

}
