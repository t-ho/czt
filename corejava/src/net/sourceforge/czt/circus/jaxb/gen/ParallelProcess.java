//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.4-b18-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2005.03.01 at 02:55:30 GMT 
//


package net.sourceforge.czt.circus.jaxb.gen;


/**
 * Java content class for ParallelProcess complex type.
 * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/research/czt/gnast/src/xsd/Circus.xsd line 1064)
 * <p>
 * <pre>
 * &lt;complexType name="ParallelProcess">
 *   &lt;complexContent>
 *     &lt;extension base="{http://czt.sourceforge.net/circus}Process2">
 *       &lt;sequence>
 *         &lt;element ref="{http://czt.sourceforge.net/circus}ChannelSet"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface ParallelProcess
    extends net.sourceforge.czt.circus.jaxb.gen.Process2
{


    /**
     * Gets the value of the channelSet property.
     * 
     * @return
     *     possible object is
     *     {@link net.sourceforge.czt.circus.jaxb.gen.SetChannelSetElement}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.UnionChannelSet}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.IntersectChannelSet}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.ChannelSet}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.ChannelSetElement}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.RefChannelSetElement}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.DifferenceChannelSet}
     */
    net.sourceforge.czt.circus.jaxb.gen.ChannelSet getChannelSet();

    /**
     * Sets the value of the channelSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link net.sourceforge.czt.circus.jaxb.gen.SetChannelSetElement}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.UnionChannelSet}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.IntersectChannelSet}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.ChannelSet}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.ChannelSetElement}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.RefChannelSetElement}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.DifferenceChannelSet}
     */
    void setChannelSet(net.sourceforge.czt.circus.jaxb.gen.ChannelSet value);

}
