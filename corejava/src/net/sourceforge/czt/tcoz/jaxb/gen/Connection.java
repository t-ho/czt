//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.1-05/30/2003 05:06 AM(java_re)-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2003.10.08 at 02:45:10 NZDT 
//


package net.sourceforge.czt.tcoz.jaxb.gen;


/**
 * Java content class for Connection complex type.
 *  <p>The following schema fragment specifies the expected content contained within this java content object.
 * <p>
 * <pre>
 * &lt;complexType name="Connection">
 *   &lt;complexContent>
 *     &lt;extension base="{http://czt.sourceforge.net/zml}TermA">
 *       &lt;sequence>
 *         &lt;element name="LeftProcess" type="{http://czt.sourceforge.net/object-z}StringListType"/>
 *         &lt;element name="RightProcess" type="{http://czt.sourceforge.net/object-z}StringListType"/>
 *         &lt;element name="Channels" type="{http://czt.sourceforge.net/object-z}StringListType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface Connection
    extends net.sourceforge.czt.core.jaxb.gen.TermA
{


    /**
     * 
     * @return possible object is
     * {@link net.sourceforge.czt.oz.jaxb.gen.StringListType}
     */
    net.sourceforge.czt.oz.jaxb.gen.StringListType getChannels();

    /**
     * 
     * @param value allowed object is
     * {@link net.sourceforge.czt.oz.jaxb.gen.StringListType}
     */
    void setChannels(net.sourceforge.czt.oz.jaxb.gen.StringListType value);

    /**
     * 
     * @return possible object is
     * {@link net.sourceforge.czt.oz.jaxb.gen.StringListType}
     */
    net.sourceforge.czt.oz.jaxb.gen.StringListType getRightProcess();

    /**
     * 
     * @param value allowed object is
     * {@link net.sourceforge.czt.oz.jaxb.gen.StringListType}
     */
    void setRightProcess(net.sourceforge.czt.oz.jaxb.gen.StringListType value);

    /**
     * 
     * @return possible object is
     * {@link net.sourceforge.czt.oz.jaxb.gen.StringListType}
     */
    net.sourceforge.czt.oz.jaxb.gen.StringListType getLeftProcess();

    /**
     * 
     * @param value allowed object is
     * {@link net.sourceforge.czt.oz.jaxb.gen.StringListType}
     */
    void setLeftProcess(net.sourceforge.czt.oz.jaxb.gen.StringListType value);

}
