//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.1-05/30/2003 05:06 AM(java_re)-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2003.10.08 at 02:45:10 NZDT 
//


package net.sourceforge.czt.tcoz.jaxb.gen;


/**
 * Java content class for InterruptTimeOpExpr complex type.
 *  <p>The following schema fragment specifies the expected content contained within this java content object.
 * <p>
 * <pre>
 * &lt;complexType name="InterruptTimeOpExpr">
 *   &lt;complexContent>
 *     &lt;extension base="{http://czt.sourceforge.net/object-z}OperationExpr">
 *       &lt;sequence>
 *         &lt;element name="NormalOp" type="{http://czt.sourceforge.net/object-z}OperationExpr"/>
 *         &lt;element name="IntOrTimeout" type="{http://czt.sourceforge.net/zml}Expr1"/>
 *         &lt;element name="HandlerOp" type="{http://czt.sourceforge.net/object-z}OperationExpr"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface InterruptTimeOpExpr
    extends net.sourceforge.czt.oz.jaxb.gen.OperationExpr
{


    /**
     * 
     * @return possible object is
     * {@link net.sourceforge.czt.oz.jaxb.gen.OperationExpr}
     */
    net.sourceforge.czt.oz.jaxb.gen.OperationExpr getNormalOp();

    /**
     * 
     * @param value allowed object is
     * {@link net.sourceforge.czt.oz.jaxb.gen.OperationExpr}
     */
    void setNormalOp(net.sourceforge.czt.oz.jaxb.gen.OperationExpr value);

    /**
     * 
     * @return possible object is
     * {@link net.sourceforge.czt.core.jaxb.gen.Expr1}
     */
    net.sourceforge.czt.core.jaxb.gen.Expr1 getIntOrTimeout();

    /**
     * 
     * @param value allowed object is
     * {@link net.sourceforge.czt.core.jaxb.gen.Expr1}
     */
    void setIntOrTimeout(net.sourceforge.czt.core.jaxb.gen.Expr1 value);

    /**
     * 
     * @return possible object is
     * {@link net.sourceforge.czt.oz.jaxb.gen.OperationExpr}
     */
    net.sourceforge.czt.oz.jaxb.gen.OperationExpr getHandlerOp();

    /**
     * 
     * @param value allowed object is
     * {@link net.sourceforge.czt.oz.jaxb.gen.OperationExpr}
     */
    void setHandlerOp(net.sourceforge.czt.oz.jaxb.gen.OperationExpr value);

}
