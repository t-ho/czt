//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.1-05/30/2003 05:06 AM(java_re)-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2003.10.08 at 02:45:10 NZDT 
//


package net.sourceforge.czt.tcoz.jaxb.gen;


/**
 * Java content class for anonymous complex type.
 *  <p>The following schema fragment specifies the expected content contained within this java content object.
 * <p>
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://czt.sourceforge.net/object-z}OperationExpr">
 *       &lt;sequence>
 *         &lt;element ref="{http://czt.sourceforge.net/tcoz}Connection" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface TopologyProExprType
    extends net.sourceforge.czt.oz.jaxb.gen.OperationExpr
{


    /**
     * Gets the value of the Connection property.
     * 
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there's any setter method for the Connection property.
     * 
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConnection().add(newItem);
     * </pre>
     * 
     * 
     * Objects of the following type(s) are allowed in the list
     * {@link net.sourceforge.czt.tcoz.jaxb.gen.Connection}
     * 
     */
    java.util.List getConnection();

}
