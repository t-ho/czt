//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.4-b18-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2005.02.23 at 12:42:00 GMT 
//


package net.sourceforge.czt.circus.jaxb.gen;


/**
 * Java content class for RepParallelCompProc complex type.
 * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/research/czt/gnast/src/xsd/Circus.xsd line 1079)
 * <p>
 * <pre>
 * &lt;complexType name="RepParallelCompProc">
 *   &lt;complexContent>
 *     &lt;extension base="{http://czt.sourceforge.net/circus}ProcR">
 *       &lt;sequence>
 *         &lt;element ref="{http://czt.sourceforge.net/circus}CSExpr"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface RepParallelCompProc
    extends net.sourceforge.czt.circus.jaxb.gen.ProcR
{


    /**
     * Gets the value of the csExpr property.
     * 
     * @return
     *     possible object is
     *     {@link net.sourceforge.czt.circus.jaxb.gen.CSExprElement}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.CSExpr}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.CSExprSetElement}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.CSExprRefElement}
     */
    net.sourceforge.czt.circus.jaxb.gen.CSExpr getCSExpr();

    /**
     * Sets the value of the csExpr property.
     * 
     * @param value
     *     allowed object is
     *     {@link net.sourceforge.czt.circus.jaxb.gen.CSExprElement}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.CSExpr}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.CSExprSetElement}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.CSExprRefElement}
     */
    void setCSExpr(net.sourceforge.czt.circus.jaxb.gen.CSExpr value);

}
