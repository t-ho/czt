//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.1-05/30/2003 05:06 AM(java_re)-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2003.08.20 at 09:36:24 NZST 
//


package net.sourceforge.czt.core.jaxb.gen;


/**
 * Java content class for QntPred complex type.
 *  <p>The following schema fragment specifies the expected content contained within this java content object.
 * <p>
 * <pre>
 * &lt;complexType name="QntPred">
 *   &lt;complexContent>
 *     &lt;extension base="{http://czt.sourceforge.net/zml}Pred">
 *       &lt;sequence>
 *         &lt;element ref="{http://czt.sourceforge.net/zml}SchText"/>
 *         &lt;choice>
 *           &lt;element ref="{http://czt.sourceforge.net/zml}FalsePred"/>
 *           &lt;element ref="{http://czt.sourceforge.net/zml}TruePred"/>
 *           &lt;element ref="{http://czt.sourceforge.net/zml}AndPred"/>
 *           &lt;element ref="{http://czt.sourceforge.net/zml}ImpliesPred"/>
 *           &lt;element ref="{http://czt.sourceforge.net/zml}IffPred"/>
 *           &lt;element ref="{http://czt.sourceforge.net/zml}OrPred"/>
 *           &lt;element ref="{http://czt.sourceforge.net/zml}ExistsPred"/>
 *           &lt;element ref="{http://czt.sourceforge.net/zml}Exists1Pred"/>
 *           &lt;element ref="{http://czt.sourceforge.net/zml}ForallPred"/>
 *           &lt;element ref="{http://czt.sourceforge.net/zml}ExprPred"/>
 *           &lt;element ref="{http://czt.sourceforge.net/zml}MemPred"/>
 *           &lt;element ref="{http://czt.sourceforge.net/zml}NegPred"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface QntPred
    extends net.sourceforge.czt.core.jaxb.gen.Pred
{


    /**
     * 
     * @return possible object is
     * {@link net.sourceforge.czt.core.jaxb.gen.SchText}
     */
    net.sourceforge.czt.core.jaxb.gen.SchText getSchText();

    /**
     * 
     * @param value allowed object is
     * {@link net.sourceforge.czt.core.jaxb.gen.SchText}
     */
    void setSchText(net.sourceforge.czt.core.jaxb.gen.SchText value);

    /**
     * 
     * @return possible object is
     * {@link net.sourceforge.czt.core.jaxb.gen.MemPredElement}
     * {@link net.sourceforge.czt.core.jaxb.gen.ExprPredElement}
     * {@link net.sourceforge.czt.core.jaxb.gen.ExistsPred}
     * {@link net.sourceforge.czt.core.jaxb.gen.OrPred}
     * {@link net.sourceforge.czt.core.jaxb.gen.Exists1Pred}
     * {@link net.sourceforge.czt.core.jaxb.gen.FalsePred}
     * {@link net.sourceforge.czt.core.jaxb.gen.ForallPred}
     * {@link net.sourceforge.czt.core.jaxb.gen.NegPredElement}
     * {@link net.sourceforge.czt.core.jaxb.gen.IffPred}
     * {@link net.sourceforge.czt.core.jaxb.gen.TruePred}
     * {@link net.sourceforge.czt.core.jaxb.gen.ImpliesPred}
     * {@link net.sourceforge.czt.core.jaxb.gen.AndPredElement}
     */
    net.sourceforge.czt.core.jaxb.gen.Pred getPred();

    /**
     * 
     * @param value allowed object is
     * {@link net.sourceforge.czt.core.jaxb.gen.MemPredElement}
     * {@link net.sourceforge.czt.core.jaxb.gen.ExprPredElement}
     * {@link net.sourceforge.czt.core.jaxb.gen.ExistsPred}
     * {@link net.sourceforge.czt.core.jaxb.gen.OrPred}
     * {@link net.sourceforge.czt.core.jaxb.gen.Exists1Pred}
     * {@link net.sourceforge.czt.core.jaxb.gen.FalsePred}
     * {@link net.sourceforge.czt.core.jaxb.gen.ForallPred}
     * {@link net.sourceforge.czt.core.jaxb.gen.NegPredElement}
     * {@link net.sourceforge.czt.core.jaxb.gen.IffPred}
     * {@link net.sourceforge.czt.core.jaxb.gen.TruePred}
     * {@link net.sourceforge.czt.core.jaxb.gen.ImpliesPred}
     * {@link net.sourceforge.czt.core.jaxb.gen.AndPredElement}
     */
    void setPred(net.sourceforge.czt.core.jaxb.gen.Pred value);

}
