//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.1-05/30/2003 05:06 AM(java_re)-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2003.08.25 at 03:03:07 NZST 
//


package net.sourceforge.czt.core.jaxb.gen;


/**
 * Java content class for NameExprPair complex type.
 *  <p>The following schema fragment specifies the expected content contained within this java content object.
 * <p>
 * <pre>
 * &lt;complexType name="NameExprPair">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://czt.sourceforge.net/zml}DeclName"/>
 *         &lt;choice>
 *           &lt;element ref="{http://czt.sourceforge.net/zml}BindSelExpr"/>
 *           &lt;element ref="{http://czt.sourceforge.net/zml}DecorExpr"/>
 *           &lt;element ref="{http://czt.sourceforge.net/zml}HideExpr"/>
 *           &lt;element ref="{http://czt.sourceforge.net/zml}NegExpr"/>
 *           &lt;element ref="{http://czt.sourceforge.net/zml}PowerExpr"/>
 *           &lt;element ref="{http://czt.sourceforge.net/zml}PreExpr"/>
 *           &lt;element ref="{http://czt.sourceforge.net/zml}RenameExpr"/>
 *           &lt;element ref="{http://czt.sourceforge.net/zml}ThetaExpr"/>
 *           &lt;element ref="{http://czt.sourceforge.net/zml}TupleSelExpr"/>
 *           &lt;element ref="{http://czt.sourceforge.net/zml}CompExpr"/>
 *           &lt;element ref="{http://czt.sourceforge.net/zml}PipeExpr"/>
 *           &lt;element ref="{http://czt.sourceforge.net/zml}ProjExpr"/>
 *           &lt;element ref="{http://czt.sourceforge.net/zml}AndExpr"/>
 *           &lt;element ref="{http://czt.sourceforge.net/zml}OrExpr"/>
 *           &lt;element ref="{http://czt.sourceforge.net/zml}ImpliesExpr"/>
 *           &lt;element ref="{http://czt.sourceforge.net/zml}IffExpr"/>
 *           &lt;element ref="{http://czt.sourceforge.net/zml}ApplExpr"/>
 *           &lt;element ref="{http://czt.sourceforge.net/zml}ProdExpr"/>
 *           &lt;element ref="{http://czt.sourceforge.net/zml}TupleExpr"/>
 *           &lt;element ref="{http://czt.sourceforge.net/zml}SetExpr"/>
 *           &lt;element ref="{http://czt.sourceforge.net/zml}ExistsExpr"/>
 *           &lt;element ref="{http://czt.sourceforge.net/zml}Exists1Expr"/>
 *           &lt;element ref="{http://czt.sourceforge.net/zml}ForallExpr"/>
 *           &lt;element ref="{http://czt.sourceforge.net/zml}LambdaExpr"/>
 *           &lt;element ref="{http://czt.sourceforge.net/zml}LetExpr"/>
 *           &lt;element ref="{http://czt.sourceforge.net/zml}MuExpr"/>
 *           &lt;element ref="{http://czt.sourceforge.net/zml}SetCompExpr"/>
 *           &lt;element ref="{http://czt.sourceforge.net/zml}BindExpr"/>
 *           &lt;element ref="{http://czt.sourceforge.net/zml}CondExpr"/>
 *           &lt;element ref="{http://czt.sourceforge.net/zml}NumExpr"/>
 *           &lt;element ref="{http://czt.sourceforge.net/zml}RefExpr"/>
 *           &lt;element ref="{http://czt.sourceforge.net/zml}SchExpr"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface NameExprPair {


    /**
     * 
     * @return possible object is
     * {@link net.sourceforge.czt.core.jaxb.gen.SchExprElement}
     * {@link net.sourceforge.czt.core.jaxb.gen.ImpliesExpr}
     * {@link net.sourceforge.czt.core.jaxb.gen.TupleExpr}
     * {@link net.sourceforge.czt.core.jaxb.gen.RefExprElement}
     * {@link net.sourceforge.czt.core.jaxb.gen.ProdExpr}
     * {@link net.sourceforge.czt.core.jaxb.gen.PowerExpr}
     * {@link net.sourceforge.czt.core.jaxb.gen.PreExpr}
     * {@link net.sourceforge.czt.core.jaxb.gen.LetExpr}
     * {@link net.sourceforge.czt.core.jaxb.gen.PipeExpr}
     * {@link net.sourceforge.czt.core.jaxb.gen.TupleSelExprElement}
     * {@link net.sourceforge.czt.core.jaxb.gen.RenameExprElement}
     * {@link net.sourceforge.czt.core.jaxb.gen.Exists1Expr}
     * {@link net.sourceforge.czt.core.jaxb.gen.IffExpr}
     * {@link net.sourceforge.czt.core.jaxb.gen.ApplExprElement}
     * {@link net.sourceforge.czt.core.jaxb.gen.BindExprElement}
     * {@link net.sourceforge.czt.core.jaxb.gen.ProjExpr}
     * {@link net.sourceforge.czt.core.jaxb.gen.DecorExprElement}
     * {@link net.sourceforge.czt.core.jaxb.gen.MuExpr}
     * {@link net.sourceforge.czt.core.jaxb.gen.CondExprElement}
     * {@link net.sourceforge.czt.core.jaxb.gen.BindSelExprElement}
     * {@link net.sourceforge.czt.core.jaxb.gen.LambdaExpr}
     * {@link net.sourceforge.czt.core.jaxb.gen.SetCompExpr}
     * {@link net.sourceforge.czt.core.jaxb.gen.NumExprElement}
     * {@link net.sourceforge.czt.core.jaxb.gen.ExistsExpr}
     * {@link net.sourceforge.czt.core.jaxb.gen.CompExpr}
     * {@link net.sourceforge.czt.core.jaxb.gen.SetExpr}
     * {@link net.sourceforge.czt.core.jaxb.gen.ThetaExprElement}
     * {@link net.sourceforge.czt.core.jaxb.gen.HideExprElement}
     * {@link net.sourceforge.czt.core.jaxb.gen.OrExpr}
     * {@link net.sourceforge.czt.core.jaxb.gen.AndExpr}
     * {@link net.sourceforge.czt.core.jaxb.gen.NegExpr}
     * {@link net.sourceforge.czt.core.jaxb.gen.ForallExpr}
     */
    net.sourceforge.czt.core.jaxb.gen.Expr getExpr();

    /**
     * 
     * @param value allowed object is
     * {@link net.sourceforge.czt.core.jaxb.gen.SchExprElement}
     * {@link net.sourceforge.czt.core.jaxb.gen.ImpliesExpr}
     * {@link net.sourceforge.czt.core.jaxb.gen.TupleExpr}
     * {@link net.sourceforge.czt.core.jaxb.gen.RefExprElement}
     * {@link net.sourceforge.czt.core.jaxb.gen.ProdExpr}
     * {@link net.sourceforge.czt.core.jaxb.gen.PowerExpr}
     * {@link net.sourceforge.czt.core.jaxb.gen.PreExpr}
     * {@link net.sourceforge.czt.core.jaxb.gen.LetExpr}
     * {@link net.sourceforge.czt.core.jaxb.gen.PipeExpr}
     * {@link net.sourceforge.czt.core.jaxb.gen.TupleSelExprElement}
     * {@link net.sourceforge.czt.core.jaxb.gen.RenameExprElement}
     * {@link net.sourceforge.czt.core.jaxb.gen.Exists1Expr}
     * {@link net.sourceforge.czt.core.jaxb.gen.IffExpr}
     * {@link net.sourceforge.czt.core.jaxb.gen.ApplExprElement}
     * {@link net.sourceforge.czt.core.jaxb.gen.BindExprElement}
     * {@link net.sourceforge.czt.core.jaxb.gen.ProjExpr}
     * {@link net.sourceforge.czt.core.jaxb.gen.DecorExprElement}
     * {@link net.sourceforge.czt.core.jaxb.gen.MuExpr}
     * {@link net.sourceforge.czt.core.jaxb.gen.CondExprElement}
     * {@link net.sourceforge.czt.core.jaxb.gen.BindSelExprElement}
     * {@link net.sourceforge.czt.core.jaxb.gen.LambdaExpr}
     * {@link net.sourceforge.czt.core.jaxb.gen.SetCompExpr}
     * {@link net.sourceforge.czt.core.jaxb.gen.NumExprElement}
     * {@link net.sourceforge.czt.core.jaxb.gen.ExistsExpr}
     * {@link net.sourceforge.czt.core.jaxb.gen.CompExpr}
     * {@link net.sourceforge.czt.core.jaxb.gen.SetExpr}
     * {@link net.sourceforge.czt.core.jaxb.gen.ThetaExprElement}
     * {@link net.sourceforge.czt.core.jaxb.gen.HideExprElement}
     * {@link net.sourceforge.czt.core.jaxb.gen.OrExpr}
     * {@link net.sourceforge.czt.core.jaxb.gen.AndExpr}
     * {@link net.sourceforge.czt.core.jaxb.gen.NegExpr}
     * {@link net.sourceforge.czt.core.jaxb.gen.ForallExpr}
     */
    void setExpr(net.sourceforge.czt.core.jaxb.gen.Expr value);

    /**
     * 
     * @return possible object is
     * {@link net.sourceforge.czt.core.jaxb.gen.DeclName}
     */
    net.sourceforge.czt.core.jaxb.gen.DeclName getName();

    /**
     * 
     * @param value allowed object is
     * {@link net.sourceforge.czt.core.jaxb.gen.DeclName}
     */
    void setName(net.sourceforge.czt.core.jaxb.gen.DeclName value);

}
