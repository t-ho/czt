//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.4-b18-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2005.03.01 at 02:55:30 GMT 
//


package net.sourceforge.czt.z.jaxb.gen;


/**
 * An operator template paragraph (C.4.13). This contains a list
 * of at least two Oper elements.  In fact, Oper has two subtypes
 * (Operand and Operator) and the list must alternate between these.
 * In other words, every Operand must be followed by an Operator
 * (unless it is the last element in the list) and every Operator
 * must be followed by an Operand (unless it is the last in the list).
 * For example, an infix operator like '+' would be defined by
 * Operand, Operator with Word="+", Operand.
 * 
 * Java content class for OptempPara element declaration.
 * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/research/czt/gnast/src/xsd/Z.xsd line 208)
 * <p>
 * <pre>
 * &lt;element name="OptempPara" type="{http://czt.sourceforge.net/zml}OptempPara"/>
 * </pre>
 * 
 */
public interface OptempParaElement
    extends javax.xml.bind.Element, net.sourceforge.czt.z.jaxb.gen.OptempPara
{


}
