//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.2-b15-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2004.07.23 at 10:52:41 NZST 
//


package net.sourceforge.czt.oz.jaxb.gen;


/**
 * Java content class for DistOpExpr complex type.
 * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/research/projects/gnast/src/xsd/Object-Z.xsd line 430)
 * <p>
 * <pre>
 * &lt;complexType name="DistOpExpr">
 *   &lt;complexContent>
 *     &lt;extension base="{http://czt.sourceforge.net/object-z}OperationExpr">
 *       &lt;sequence>
 *         &lt;element ref="{http://czt.sourceforge.net/object-z}MainOpExpr"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface DistOpExpr
    extends net.sourceforge.czt.oz.jaxb.gen.OperationExpr
{


    /**
     * 
     * @return
     *     possible object is
     *     {@link net.sourceforge.czt.oz.jaxb.gen.MainOpExprElement}
     *     {@link net.sourceforge.czt.oz.jaxb.gen.MainOpExpr}
     */
    net.sourceforge.czt.oz.jaxb.gen.MainOpExpr getMainOpExpr();

    /**
     * 
     * @param value
     *     allowed object is
     *     {@link net.sourceforge.czt.oz.jaxb.gen.MainOpExprElement}
     *     {@link net.sourceforge.czt.oz.jaxb.gen.MainOpExpr}
     */
    void setMainOpExpr(net.sourceforge.czt.oz.jaxb.gen.MainOpExpr value);

}
