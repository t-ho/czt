//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.4-b18-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2005.02.23 at 12:42:00 GMT 
//


package net.sourceforge.czt.circus.jaxb.gen;


/**
 * Java content class for RepParallelAction complex type.
 * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/research/czt/gnast/src/xsd/Circus.xsd line 1309)
 * <p>
 * <pre>
 * &lt;complexType name="RepParallelAction">
 *   &lt;complexContent>
 *     &lt;extension base="{http://czt.sourceforge.net/circus}CSPActionR">
 *       &lt;sequence>
 *         &lt;element name="LeftNS" type="{http://czt.sourceforge.net/circus}NSExpr"/>
 *         &lt;element name="RightNS" type="{http://czt.sourceforge.net/circus}NSExpr"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface RepParallelAction
    extends net.sourceforge.czt.circus.jaxb.gen.CSPActionR
{


    /**
     * Gets the value of the rightNS property.
     * 
     * @return
     *     possible object is
     *     {@link net.sourceforge.czt.circus.jaxb.gen.NSExpr}
     */
    net.sourceforge.czt.circus.jaxb.gen.NSExpr getRightNS();

    /**
     * Sets the value of the rightNS property.
     * 
     * @param value
     *     allowed object is
     *     {@link net.sourceforge.czt.circus.jaxb.gen.NSExpr}
     */
    void setRightNS(net.sourceforge.czt.circus.jaxb.gen.NSExpr value);

    /**
     * Gets the value of the leftNS property.
     * 
     * @return
     *     possible object is
     *     {@link net.sourceforge.czt.circus.jaxb.gen.NSExpr}
     */
    net.sourceforge.czt.circus.jaxb.gen.NSExpr getLeftNS();

    /**
     * Sets the value of the leftNS property.
     * 
     * @param value
     *     allowed object is
     *     {@link net.sourceforge.czt.circus.jaxb.gen.NSExpr}
     */
    void setLeftNS(net.sourceforge.czt.circus.jaxb.gen.NSExpr value);

}
