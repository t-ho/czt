//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.2-b15-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2004.05.14 at 01:55:34 NZST 
//


package net.sourceforge.czt.zpatt.jaxb.gen;


/**
 * Java content class for Substitute complex type.
 * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/research/projects/gnast/src/xsd/ZPattern.xsd line 98)
 * <p>
 * <pre>
 * &lt;complexType name="Substitute">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://czt.sourceforge.net/zml}Expr" maxOccurs="2" minOccurs="2"/>
 *         &lt;element ref="{http://czt.sourceforge.net/zml}Pred" maxOccurs="2" minOccurs="2"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface Substitute {


    /**
     * Gets the value of the Expr property.
     * 
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the Expr property.
     * 
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExpr().add(newItem);
     * </pre>
     * 
     * 
     * Objects of the following type(s) are allowed in the list
     * {@link net.sourceforge.czt.z.jaxb.gen.QntExprElement}
     * {@link net.sourceforge.czt.z.jaxb.gen.ExistsExpr}
     * {@link net.sourceforge.czt.z.jaxb.gen.BindExprElement}
     * {@link net.sourceforge.czt.z.jaxb.gen.RenameExprElement}
     * {@link net.sourceforge.czt.z.jaxb.gen.ThetaExprElement}
     * {@link net.sourceforge.czt.zpatt.jaxb.gen.JokerExprElement}
     * {@link net.sourceforge.czt.z.jaxb.gen.Expr}
     * {@link net.sourceforge.czt.z.jaxb.gen.CompExpr}
     * {@link net.sourceforge.czt.z.jaxb.gen.OrExpr}
     * {@link net.sourceforge.czt.z.jaxb.gen.LetExpr}
     * {@link net.sourceforge.czt.z.jaxb.gen.NegExpr}
     * {@link net.sourceforge.czt.z.jaxb.gen.PowerExpr}
     * {@link net.sourceforge.czt.z.jaxb.gen.SetExpr}
     * {@link net.sourceforge.czt.tcoz.jaxb.gen.ChannelExprElement}
     * {@link net.sourceforge.czt.z.jaxb.gen.LambdaExpr}
     * {@link net.sourceforge.czt.oz.jaxb.gen.SelfExpr}
     * {@link net.sourceforge.czt.z.jaxb.gen.Expr0NElement}
     * {@link net.sourceforge.czt.z.jaxb.gen.ForallExpr}
     * {@link net.sourceforge.czt.oz.jaxb.gen.PromotedAttrExprElement}
     * {@link net.sourceforge.czt.z.jaxb.gen.AndExpr}
     * {@link net.sourceforge.czt.oz.jaxb.gen.ContainmentExpr}
     * {@link net.sourceforge.czt.z.jaxb.gen.ProjExpr}
     * {@link net.sourceforge.czt.z.jaxb.gen.Qnt1ExprElement}
     * {@link net.sourceforge.czt.z.jaxb.gen.SchExpr2Element}
     * {@link net.sourceforge.czt.z.jaxb.gen.ExprElement}
     * {@link net.sourceforge.czt.z.jaxb.gen.NumExprElement}
     * {@link net.sourceforge.czt.z.jaxb.gen.ApplExprElement}
     * {@link net.sourceforge.czt.z.jaxb.gen.Exists1Expr}
     * {@link net.sourceforge.czt.z.jaxb.gen.TupleSelExprElement}
     * {@link net.sourceforge.czt.z.jaxb.gen.HideExprElement}
     * {@link net.sourceforge.czt.z.jaxb.gen.ProdExpr}
     * {@link net.sourceforge.czt.z.jaxb.gen.Expr2NElement}
     * {@link net.sourceforge.czt.z.jaxb.gen.SchExprElement}
     * {@link net.sourceforge.czt.z.jaxb.gen.RefExprElement}
     * {@link net.sourceforge.czt.z.jaxb.gen.ImpliesExpr}
     * {@link net.sourceforge.czt.z.jaxb.gen.Expr1Element}
     * {@link net.sourceforge.czt.z.jaxb.gen.BindSelExprElement}
     * {@link net.sourceforge.czt.z.jaxb.gen.IffExpr}
     * {@link net.sourceforge.czt.z.jaxb.gen.MuExpr}
     * {@link net.sourceforge.czt.z.jaxb.gen.CondExprElement}
     * {@link net.sourceforge.czt.z.jaxb.gen.PreExpr}
     * {@link net.sourceforge.czt.z.jaxb.gen.Expr2Element}
     * {@link net.sourceforge.czt.z.jaxb.gen.DecorExprElement}
     * {@link net.sourceforge.czt.oz.jaxb.gen.PolyExpr}
     * {@link net.sourceforge.czt.z.jaxb.gen.TupleExpr}
     * {@link net.sourceforge.czt.z.jaxb.gen.PipeExpr}
     * {@link net.sourceforge.czt.z.jaxb.gen.SetCompExpr}
     * 
     */
    java.util.List getExpr();

    /**
     * Gets the value of the Pred property.
     * 
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the Pred property.
     * 
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPred().add(newItem);
     * </pre>
     * 
     * 
     * Objects of the following type(s) are allowed in the list
     * {@link net.sourceforge.czt.z.jaxb.gen.Exists1Pred}
     * {@link net.sourceforge.czt.z.jaxb.gen.ExistsPred}
     * {@link net.sourceforge.czt.z.jaxb.gen.Pred}
     * {@link net.sourceforge.czt.z.jaxb.gen.TruePred}
     * {@link net.sourceforge.czt.z.jaxb.gen.Pred2Element}
     * {@link net.sourceforge.czt.z.jaxb.gen.NegPredElement}
     * {@link net.sourceforge.czt.z.jaxb.gen.FalsePred}
     * {@link net.sourceforge.czt.zpatt.jaxb.gen.JokerPredElement}
     * {@link net.sourceforge.czt.z.jaxb.gen.FactElement}
     * {@link net.sourceforge.czt.z.jaxb.gen.PredElement}
     * {@link net.sourceforge.czt.z.jaxb.gen.OrPred}
     * {@link net.sourceforge.czt.z.jaxb.gen.MemPredElement}
     * {@link net.sourceforge.czt.z.jaxb.gen.QntPredElement}
     * {@link net.sourceforge.czt.z.jaxb.gen.ExprPredElement}
     * {@link net.sourceforge.czt.z.jaxb.gen.IffPred}
     * {@link net.sourceforge.czt.z.jaxb.gen.ForallPred}
     * {@link net.sourceforge.czt.oz.jaxb.gen.PromotedInitPredElement}
     * {@link net.sourceforge.czt.z.jaxb.gen.AndPredElement}
     * {@link net.sourceforge.czt.z.jaxb.gen.ImpliesPred}
     * 
     */
    java.util.List getPred();

}
