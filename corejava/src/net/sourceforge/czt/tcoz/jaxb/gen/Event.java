//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.2-b15-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2003.10.28 at 04:14:13 NZDT 
//


package net.sourceforge.czt.tcoz.jaxb.gen;


/**
 * The expression is needed to cater for cases such as right!first(h)... In or out stroke is mandatory in Z:RefNameType
 * Java content class for Event complex type.
 * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/research/projects/gnast/src/xsd/TCOZ.xsd line 286)
 * <p>
 * <pre>
 * &lt;complexType name="Event">
 *   &lt;complexContent>
 *     &lt;extension base="{http://czt.sourceforge.net/zml}TermA">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://czt.sourceforge.net/zml}RefName"/>
 *         &lt;element ref="{http://czt.sourceforge.net/zml}Expr" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface Event
    extends net.sourceforge.czt.core.jaxb.gen.TermA
{


    /**
     * 
     * @return
     *     possible object is
     *     {@link net.sourceforge.czt.core.jaxb.gen.NumExprElement}
     *     {@link net.sourceforge.czt.core.jaxb.gen.ExistsExpr}
     *     {@link net.sourceforge.czt.core.jaxb.gen.OrExpr}
     *     {@link net.sourceforge.czt.core.jaxb.gen.IffExpr}
     *     {@link net.sourceforge.czt.core.jaxb.gen.SchExpr2Element}
     *     {@link net.sourceforge.czt.core.jaxb.gen.PowerExpr}
     *     {@link net.sourceforge.czt.core.jaxb.gen.BindSelExprElement}
     *     {@link net.sourceforge.czt.core.jaxb.gen.RenameExprElement}
     *     {@link net.sourceforge.czt.core.jaxb.gen.RefExprElement}
     *     {@link net.sourceforge.czt.core.jaxb.gen.BindExprElement}
     *     {@link net.sourceforge.czt.core.jaxb.gen.PreExpr}
     *     {@link net.sourceforge.czt.core.jaxb.gen.CompExpr}
     *     {@link net.sourceforge.czt.core.jaxb.gen.DecorExprElement}
     *     {@link net.sourceforge.czt.core.jaxb.gen.Expr0NElement}
     *     {@link net.sourceforge.czt.core.jaxb.gen.SetCompExpr}
     *     {@link net.sourceforge.czt.core.jaxb.gen.HideExprElement}
     *     {@link net.sourceforge.czt.core.jaxb.gen.Qnt1ExprElement}
     *     {@link net.sourceforge.czt.core.jaxb.gen.Expr2Element}
     *     {@link net.sourceforge.czt.core.jaxb.gen.Exists1Expr}
     *     {@link net.sourceforge.czt.core.jaxb.gen.PipeExpr}
     *     {@link net.sourceforge.czt.core.jaxb.gen.Expr1Element}
     *     {@link net.sourceforge.czt.tcoz.jaxb.gen.ChannelExprElement}
     *     {@link net.sourceforge.czt.core.jaxb.gen.ProdExpr}
     *     {@link net.sourceforge.czt.core.jaxb.gen.ExprElement}
     *     {@link net.sourceforge.czt.core.jaxb.gen.TupleExpr}
     *     {@link net.sourceforge.czt.core.jaxb.gen.QntExprElement}
     *     {@link net.sourceforge.czt.core.jaxb.gen.Expr}
     *     {@link net.sourceforge.czt.core.jaxb.gen.ImpliesExpr}
     *     {@link net.sourceforge.czt.core.jaxb.gen.LetExpr}
     *     {@link net.sourceforge.czt.core.jaxb.gen.SetExpr}
     *     {@link net.sourceforge.czt.core.jaxb.gen.CondExprElement}
     *     {@link net.sourceforge.czt.core.jaxb.gen.SchExprElement}
     *     {@link net.sourceforge.czt.core.jaxb.gen.ProjExpr}
     *     {@link net.sourceforge.czt.core.jaxb.gen.Expr2NElement}
     *     {@link net.sourceforge.czt.core.jaxb.gen.ThetaExprElement}
     *     {@link net.sourceforge.czt.core.jaxb.gen.TupleSelExprElement}
     *     {@link net.sourceforge.czt.core.jaxb.gen.AndExpr}
     *     {@link net.sourceforge.czt.zpatt.jaxb.gen.JokerExprElement}
     *     {@link net.sourceforge.czt.core.jaxb.gen.NegExpr}
     *     {@link net.sourceforge.czt.core.jaxb.gen.MuExpr}
     *     {@link net.sourceforge.czt.core.jaxb.gen.LambdaExpr}
     *     {@link net.sourceforge.czt.core.jaxb.gen.ApplExprElement}
     *     {@link net.sourceforge.czt.core.jaxb.gen.ForallExpr}
     */
    net.sourceforge.czt.core.jaxb.gen.Expr getExpr();

    /**
     * 
     * @param value
     *     allowed object is
     *     {@link net.sourceforge.czt.core.jaxb.gen.NumExprElement}
     *     {@link net.sourceforge.czt.core.jaxb.gen.ExistsExpr}
     *     {@link net.sourceforge.czt.core.jaxb.gen.OrExpr}
     *     {@link net.sourceforge.czt.core.jaxb.gen.IffExpr}
     *     {@link net.sourceforge.czt.core.jaxb.gen.SchExpr2Element}
     *     {@link net.sourceforge.czt.core.jaxb.gen.PowerExpr}
     *     {@link net.sourceforge.czt.core.jaxb.gen.BindSelExprElement}
     *     {@link net.sourceforge.czt.core.jaxb.gen.RenameExprElement}
     *     {@link net.sourceforge.czt.core.jaxb.gen.RefExprElement}
     *     {@link net.sourceforge.czt.core.jaxb.gen.BindExprElement}
     *     {@link net.sourceforge.czt.core.jaxb.gen.PreExpr}
     *     {@link net.sourceforge.czt.core.jaxb.gen.CompExpr}
     *     {@link net.sourceforge.czt.core.jaxb.gen.DecorExprElement}
     *     {@link net.sourceforge.czt.core.jaxb.gen.Expr0NElement}
     *     {@link net.sourceforge.czt.core.jaxb.gen.SetCompExpr}
     *     {@link net.sourceforge.czt.core.jaxb.gen.HideExprElement}
     *     {@link net.sourceforge.czt.core.jaxb.gen.Qnt1ExprElement}
     *     {@link net.sourceforge.czt.core.jaxb.gen.Expr2Element}
     *     {@link net.sourceforge.czt.core.jaxb.gen.Exists1Expr}
     *     {@link net.sourceforge.czt.core.jaxb.gen.PipeExpr}
     *     {@link net.sourceforge.czt.core.jaxb.gen.Expr1Element}
     *     {@link net.sourceforge.czt.tcoz.jaxb.gen.ChannelExprElement}
     *     {@link net.sourceforge.czt.core.jaxb.gen.ProdExpr}
     *     {@link net.sourceforge.czt.core.jaxb.gen.ExprElement}
     *     {@link net.sourceforge.czt.core.jaxb.gen.TupleExpr}
     *     {@link net.sourceforge.czt.core.jaxb.gen.QntExprElement}
     *     {@link net.sourceforge.czt.core.jaxb.gen.Expr}
     *     {@link net.sourceforge.czt.core.jaxb.gen.ImpliesExpr}
     *     {@link net.sourceforge.czt.core.jaxb.gen.LetExpr}
     *     {@link net.sourceforge.czt.core.jaxb.gen.SetExpr}
     *     {@link net.sourceforge.czt.core.jaxb.gen.CondExprElement}
     *     {@link net.sourceforge.czt.core.jaxb.gen.SchExprElement}
     *     {@link net.sourceforge.czt.core.jaxb.gen.ProjExpr}
     *     {@link net.sourceforge.czt.core.jaxb.gen.Expr2NElement}
     *     {@link net.sourceforge.czt.core.jaxb.gen.ThetaExprElement}
     *     {@link net.sourceforge.czt.core.jaxb.gen.TupleSelExprElement}
     *     {@link net.sourceforge.czt.core.jaxb.gen.AndExpr}
     *     {@link net.sourceforge.czt.zpatt.jaxb.gen.JokerExprElement}
     *     {@link net.sourceforge.czt.core.jaxb.gen.NegExpr}
     *     {@link net.sourceforge.czt.core.jaxb.gen.MuExpr}
     *     {@link net.sourceforge.czt.core.jaxb.gen.LambdaExpr}
     *     {@link net.sourceforge.czt.core.jaxb.gen.ApplExprElement}
     *     {@link net.sourceforge.czt.core.jaxb.gen.ForallExpr}
     */
    void setExpr(net.sourceforge.czt.core.jaxb.gen.Expr value);

    /**
     * 
     * @return
     *     possible object is
     *     {@link net.sourceforge.czt.core.jaxb.gen.RefName}
     */
    net.sourceforge.czt.core.jaxb.gen.RefName getName();

    /**
     * 
     * @param value
     *     allowed object is
     *     {@link net.sourceforge.czt.core.jaxb.gen.RefName}
     */
    void setName(net.sourceforge.czt.core.jaxb.gen.RefName value);

}
