//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.2-b15-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2003.10.28 at 04:14:13 NZDT 
//


package net.sourceforge.czt.core.jaxb.gen;


/**
 * Java content class for BindExpr complex type.
 * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/research/projects/gnast/src/xsd/Z.xsd line 958)
 * <p>
 * <pre>
 * &lt;complexType name="BindExpr">
 *   &lt;complexContent>
 *     &lt;extension base="{http://czt.sourceforge.net/zml}Expr">
 *       &lt;sequence>
 *         &lt;element ref="{http://czt.sourceforge.net/zml}NameExprPair" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface BindExpr
    extends net.sourceforge.czt.core.jaxb.gen.Expr
{


    /**
     * Gets the value of the NameExprPair property.
     * 
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the NameExprPair property.
     * 
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNameExprPair().add(newItem);
     * </pre>
     * 
     * 
     * Objects of the following type(s) are allowed in the list
     * {@link net.sourceforge.czt.core.jaxb.gen.NameExprPair}
     * {@link net.sourceforge.czt.core.jaxb.gen.NameExprPairElement}
     * 
     */
    java.util.List getNameExprPair();

}
