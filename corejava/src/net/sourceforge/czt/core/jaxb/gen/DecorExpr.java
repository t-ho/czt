//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.1-05/30/2003 05:06 AM(java_re)-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2003.08.25 at 03:03:07 NZST 
//


package net.sourceforge.czt.core.jaxb.gen;


/**
 * Java content class for DecorExpr complex type.
 *  <p>The following schema fragment specifies the expected content contained within this java content object.
 * <p>
 * <pre>
 * &lt;complexType name="DecorExpr">
 *   &lt;complexContent>
 *     &lt;extension base="{http://czt.sourceforge.net/zml}Expr1">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element ref="{http://czt.sourceforge.net/zml}InStroke"/>
 *           &lt;element ref="{http://czt.sourceforge.net/zml}OutStroke"/>
 *           &lt;element ref="{http://czt.sourceforge.net/zml}NextStroke"/>
 *           &lt;element ref="{http://czt.sourceforge.net/zml}NumStroke"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface DecorExpr
    extends net.sourceforge.czt.core.jaxb.gen.Expr1
{


    /**
     * 
     * @return possible object is
     * {@link net.sourceforge.czt.core.jaxb.gen.NextStroke}
     * {@link net.sourceforge.czt.core.jaxb.gen.InStroke}
     * {@link net.sourceforge.czt.core.jaxb.gen.NumStrokeElement}
     * {@link net.sourceforge.czt.core.jaxb.gen.OutStroke}
     */
    net.sourceforge.czt.core.jaxb.gen.Stroke getStroke();

    /**
     * 
     * @param value allowed object is
     * {@link net.sourceforge.czt.core.jaxb.gen.NextStroke}
     * {@link net.sourceforge.czt.core.jaxb.gen.InStroke}
     * {@link net.sourceforge.czt.core.jaxb.gen.NumStrokeElement}
     * {@link net.sourceforge.czt.core.jaxb.gen.OutStroke}
     */
    void setStroke(net.sourceforge.czt.core.jaxb.gen.Stroke value);

}
