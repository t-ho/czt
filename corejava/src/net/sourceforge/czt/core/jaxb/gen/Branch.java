//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.2-b15-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2003.10.28 at 04:14:13 NZDT 
//


package net.sourceforge.czt.core.jaxb.gen;


/**
 * Java content class for Branch complex type.
 * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/research/projects/gnast/src/xsd/Z.xsd line 1217)
 * <p>
 * <pre>
 * &lt;complexType name="Branch">
 *   &lt;complexContent>
 *     &lt;extension base="{http://czt.sourceforge.net/zml}TermA">
 *       &lt;sequence>
 *         &lt;element ref="{http://czt.sourceforge.net/zml}DeclName"/>
 *         &lt;element ref="{http://czt.sourceforge.net/zml}Expr" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface Branch
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
     *     {@link net.sourceforge.czt.core.jaxb.gen.DeclNameElement}
     *     {@link net.sourceforge.czt.core.jaxb.gen.DeclName}
     */
    net.sourceforge.czt.core.jaxb.gen.DeclName getDeclName();

    /**
     * 
     * @param value
     *     allowed object is
     *     {@link net.sourceforge.czt.core.jaxb.gen.DeclNameElement}
     *     {@link net.sourceforge.czt.core.jaxb.gen.DeclName}
     */
    void setDeclName(net.sourceforge.czt.core.jaxb.gen.DeclName value);

}
