//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.1-05/30/2003 05:06 AM(java_re)-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2003.10.08 at 02:45:10 NZDT 
//


package net.sourceforge.czt.oz.jaxb.gen;


/**
 * Java content class for RenameOpExpr complex type.
 *  <p>The following schema fragment specifies the expected content contained within this java content object.
 * <p>
 * <pre>
 * &lt;complexType name="RenameOpExpr">
 *   &lt;complexContent>
 *     &lt;extension base="{http://czt.sourceforge.net/object-z}OperationExpr">
 *       &lt;sequence>
 *         &lt;element ref="{http://czt.sourceforge.net/object-z}OperationExpr"/>
 *         &lt;element ref="{http://czt.sourceforge.net/object-z}RenameList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface RenameOpExpr
    extends net.sourceforge.czt.oz.jaxb.gen.OperationExpr
{


    /**
     * 
     * @return possible object is
     * {@link net.sourceforge.czt.oz.jaxb.gen.RenameList}
     */
    net.sourceforge.czt.oz.jaxb.gen.RenameList getRenameList();

    /**
     * 
     * @param value allowed object is
     * {@link net.sourceforge.czt.oz.jaxb.gen.RenameList}
     */
    void setRenameList(net.sourceforge.czt.oz.jaxb.gen.RenameList value);

    /**
     * 
     * @return possible object is
     * {@link net.sourceforge.czt.oz.jaxb.gen.BasicOpExprElement}
     * {@link net.sourceforge.czt.oz.jaxb.gen.SeqOpExpr}
     * {@link net.sourceforge.czt.oz.jaxb.gen.ConjOpExpr}
     * {@link net.sourceforge.czt.oz.jaxb.gen.RenameOpExprElement}
     * {@link net.sourceforge.czt.tcoz.jaxb.gen.DivergeProExpr}
     * {@link net.sourceforge.czt.oz.jaxb.gen.ParallelOpExpr}
     * {@link net.sourceforge.czt.tcoz.jaxb.gen.GuardProExpr}
     * {@link net.sourceforge.czt.tcoz.jaxb.gen.TimeoutEndProExpr}
     * {@link net.sourceforge.czt.tcoz.jaxb.gen.InterruptProExpr}
     * {@link net.sourceforge.czt.oz.jaxb.gen.DistConjOpExpr}
     * {@link net.sourceforge.czt.oz.jaxb.gen.OperationExpr}
     * {@link net.sourceforge.czt.tcoz.jaxb.gen.TopologyProExpr}
     * {@link net.sourceforge.czt.tcoz.jaxb.gen.RecProExpr}
     * {@link net.sourceforge.czt.tcoz.jaxb.gen.StopProExpr}
     * {@link net.sourceforge.czt.oz.jaxb.gen.DistChoiceOpExpr}
     * {@link net.sourceforge.czt.tcoz.jaxb.gen.InterleaveProExpr}
     * {@link net.sourceforge.czt.tcoz.jaxb.gen.WaitProExpr}
     * {@link net.sourceforge.czt.oz.jaxb.gen.HideOpExprElement}
     * {@link net.sourceforge.czt.tcoz.jaxb.gen.SynPllProExpr}
     * {@link net.sourceforge.czt.oz.jaxb.gen.ExChoiceOpExpr}
     * {@link net.sourceforge.czt.oz.jaxb.gen.AssoParallelOpExpr}
     * {@link net.sourceforge.czt.oz.jaxb.gen.ScopeEnrichOpExpr}
     * {@link net.sourceforge.czt.tcoz.jaxb.gen.DeadlineProExpr}
     * {@link net.sourceforge.czt.tcoz.jaxb.gen.TimeoutStartProExpr}
     * {@link net.sourceforge.czt.oz.jaxb.gen.ParenOpExpr}
     * {@link net.sourceforge.czt.tcoz.jaxb.gen.WaitUntilProExpr}
     * {@link net.sourceforge.czt.tcoz.jaxb.gen.AtProExpr}
     * {@link net.sourceforge.czt.oz.jaxb.gen.OpPromotionExprElement}
     * {@link net.sourceforge.czt.tcoz.jaxb.gen.SkipProExpr}
     * {@link net.sourceforge.czt.oz.jaxb.gen.DistSeqOpExpr}
     */
    net.sourceforge.czt.oz.jaxb.gen.OperationExpr getOperationExpr();

    /**
     * 
     * @param value allowed object is
     * {@link net.sourceforge.czt.oz.jaxb.gen.BasicOpExprElement}
     * {@link net.sourceforge.czt.oz.jaxb.gen.SeqOpExpr}
     * {@link net.sourceforge.czt.oz.jaxb.gen.ConjOpExpr}
     * {@link net.sourceforge.czt.oz.jaxb.gen.RenameOpExprElement}
     * {@link net.sourceforge.czt.tcoz.jaxb.gen.DivergeProExpr}
     * {@link net.sourceforge.czt.oz.jaxb.gen.ParallelOpExpr}
     * {@link net.sourceforge.czt.tcoz.jaxb.gen.GuardProExpr}
     * {@link net.sourceforge.czt.tcoz.jaxb.gen.TimeoutEndProExpr}
     * {@link net.sourceforge.czt.tcoz.jaxb.gen.InterruptProExpr}
     * {@link net.sourceforge.czt.oz.jaxb.gen.DistConjOpExpr}
     * {@link net.sourceforge.czt.oz.jaxb.gen.OperationExpr}
     * {@link net.sourceforge.czt.tcoz.jaxb.gen.TopologyProExpr}
     * {@link net.sourceforge.czt.tcoz.jaxb.gen.RecProExpr}
     * {@link net.sourceforge.czt.tcoz.jaxb.gen.StopProExpr}
     * {@link net.sourceforge.czt.oz.jaxb.gen.DistChoiceOpExpr}
     * {@link net.sourceforge.czt.tcoz.jaxb.gen.InterleaveProExpr}
     * {@link net.sourceforge.czt.tcoz.jaxb.gen.WaitProExpr}
     * {@link net.sourceforge.czt.oz.jaxb.gen.HideOpExprElement}
     * {@link net.sourceforge.czt.tcoz.jaxb.gen.SynPllProExpr}
     * {@link net.sourceforge.czt.oz.jaxb.gen.ExChoiceOpExpr}
     * {@link net.sourceforge.czt.oz.jaxb.gen.AssoParallelOpExpr}
     * {@link net.sourceforge.czt.oz.jaxb.gen.ScopeEnrichOpExpr}
     * {@link net.sourceforge.czt.tcoz.jaxb.gen.DeadlineProExpr}
     * {@link net.sourceforge.czt.tcoz.jaxb.gen.TimeoutStartProExpr}
     * {@link net.sourceforge.czt.oz.jaxb.gen.ParenOpExpr}
     * {@link net.sourceforge.czt.tcoz.jaxb.gen.WaitUntilProExpr}
     * {@link net.sourceforge.czt.tcoz.jaxb.gen.AtProExpr}
     * {@link net.sourceforge.czt.oz.jaxb.gen.OpPromotionExprElement}
     * {@link net.sourceforge.czt.tcoz.jaxb.gen.SkipProExpr}
     * {@link net.sourceforge.czt.oz.jaxb.gen.DistSeqOpExpr}
     */
    void setOperationExpr(net.sourceforge.czt.oz.jaxb.gen.OperationExpr value);

}
