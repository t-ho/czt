//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.2-b15-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2003.10.28 at 04:14:13 NZDT 
//


package net.sourceforge.czt.tcoz.jaxb.gen;


/**
 * Java content class for SynPllProExpr complex type.
 * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/research/projects/gnast/src/xsd/TCOZ.xsd line 177)
 * <p>
 * <pre>
 * &lt;complexType name="SynPllProExpr">
 *   &lt;complexContent>
 *     &lt;extension base="{http://czt.sourceforge.net/object-z}TwoOpExpr">
 *       &lt;sequence>
 *         &lt;element name="Events" type="{http://czt.sourceforge.net/tcoz}EventSet"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface SynPllProExpr
    extends net.sourceforge.czt.oz.jaxb.gen.TwoOpExpr
{


    /**
     * 
     * @return
     *     possible object is
     *     {@link net.sourceforge.czt.tcoz.jaxb.gen.EventSet}
     */
    net.sourceforge.czt.tcoz.jaxb.gen.EventSet getEvents();

    /**
     * 
     * @param value
     *     allowed object is
     *     {@link net.sourceforge.czt.tcoz.jaxb.gen.EventSet}
     */
    void setEvents(net.sourceforge.czt.tcoz.jaxb.gen.EventSet value);

}
