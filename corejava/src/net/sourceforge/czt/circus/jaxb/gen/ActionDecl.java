//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.4-b18-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2005.02.23 at 12:42:00 GMT 
//


package net.sourceforge.czt.circus.jaxb.gen;


/**
 * Java content class for ActionDecl complex type.
 * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/research/czt/gnast/src/xsd/Circus.xsd line 1139)
 * <p>
 * <pre>
 * &lt;complexType name="ActionDecl">
 *   &lt;complexContent>
 *     &lt;extension base="{http://czt.sourceforge.net/circus}ProcPara">
 *       &lt;sequence>
 *         &lt;element ref="{http://czt.sourceforge.net/zml}DeclName"/>
 *         &lt;element ref="{http://czt.sourceforge.net/circus}ActionDef"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface ActionDecl
    extends net.sourceforge.czt.circus.jaxb.gen.ProcPara
{


    /**
     * Gets the value of the actionDef property.
     * 
     * @return
     *     possible object is
     *     {@link net.sourceforge.czt.circus.jaxb.gen.ActionDefElement}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.PrefixingActionElement}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.RepSeqCompAction}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.VarDeclCmdElement}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.ChaosAction}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.GuardedActionElement}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.FormalParamAction}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.RepExtChAction}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.AssignmentCmdElement}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.ExtChoiceAction}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.SeqCompAction}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.ParallelCompActionElement}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.RepIntChAction}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.MuActionElement}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.SchemaActionElement}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.RepParallelCompActionElement}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.SkipAction}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.IntChoiceAction}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.InterleaveAction}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.CallActionElement}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.HideActionElement}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.SpecStmtCmdElement}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.RepInterleaveAction}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.ActualParamActionElement}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.StopAction}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.IfGuardedCmdElement}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.ActionDef}
     */
    net.sourceforge.czt.circus.jaxb.gen.ActionDef getActionDef();

    /**
     * Sets the value of the actionDef property.
     * 
     * @param value
     *     allowed object is
     *     {@link net.sourceforge.czt.circus.jaxb.gen.ActionDefElement}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.PrefixingActionElement}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.RepSeqCompAction}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.VarDeclCmdElement}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.ChaosAction}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.GuardedActionElement}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.FormalParamAction}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.RepExtChAction}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.AssignmentCmdElement}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.ExtChoiceAction}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.SeqCompAction}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.ParallelCompActionElement}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.RepIntChAction}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.MuActionElement}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.SchemaActionElement}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.RepParallelCompActionElement}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.SkipAction}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.IntChoiceAction}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.InterleaveAction}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.CallActionElement}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.HideActionElement}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.SpecStmtCmdElement}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.RepInterleaveAction}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.ActualParamActionElement}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.StopAction}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.IfGuardedCmdElement}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.ActionDef}
     */
    void setActionDef(net.sourceforge.czt.circus.jaxb.gen.ActionDef value);

    /**
     * Gets the value of the declName property.
     * 
     * @return
     *     possible object is
     *     {@link net.sourceforge.czt.z.jaxb.gen.DeclNameElement}
     *     {@link net.sourceforge.czt.z.jaxb.gen.DeclName}
     *     {@link net.sourceforge.czt.zpatt.jaxb.gen.JokerNameElement}
     */
    net.sourceforge.czt.z.jaxb.gen.DeclName getDeclName();

    /**
     * Sets the value of the declName property.
     * 
     * @param value
     *     allowed object is
     *     {@link net.sourceforge.czt.z.jaxb.gen.DeclNameElement}
     *     {@link net.sourceforge.czt.z.jaxb.gen.DeclName}
     *     {@link net.sourceforge.czt.zpatt.jaxb.gen.JokerNameElement}
     */
    void setDeclName(net.sourceforge.czt.z.jaxb.gen.DeclName value);

}
