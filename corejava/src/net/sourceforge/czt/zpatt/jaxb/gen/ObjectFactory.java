//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.2-b15-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2003.10.28 at 04:14:13 NZDT 
//


package net.sourceforge.czt.zpatt.jaxb.gen;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the net.sourceforge.czt.zpatt.jaxb.gen package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
public class ObjectFactory
    extends net.sourceforge.czt.core.jaxb.gen.impl.runtime.DefaultJAXBContextImpl
{

    private static java.util.HashMap defaultImplementations = new java.util.HashMap();
    private static java.util.HashMap rootTagMap = new java.util.HashMap();
    public final static net.sourceforge.czt.core.jaxb.gen.impl.runtime.GrammarInfo grammarInfo = new net.sourceforge.czt.core.jaxb.gen.impl.runtime.GrammarInfoImpl(rootTagMap, defaultImplementations, (net.sourceforge.czt.zpatt.jaxb.gen.ObjectFactory.class));
    public final static java.lang.Class version = (net.sourceforge.czt.zpatt.jaxb.gen.impl.JAXBVersion.class);

    static {
        defaultImplementations.put((net.sourceforge.czt.zpatt.jaxb.gen.JokerExprElement.class), "net.sourceforge.czt.zpatt.jaxb.gen.impl.JokerExprElementImpl");
        defaultImplementations.put((net.sourceforge.czt.zpatt.jaxb.gen.JokerPred.class), "net.sourceforge.czt.zpatt.jaxb.gen.impl.JokerPredImpl");
        defaultImplementations.put((net.sourceforge.czt.zpatt.jaxb.gen.SubstList.class), "net.sourceforge.czt.zpatt.jaxb.gen.impl.SubstListImpl");
        defaultImplementations.put((net.sourceforge.czt.zpatt.jaxb.gen.Substitute.class), "net.sourceforge.czt.zpatt.jaxb.gen.impl.SubstituteImpl");
        defaultImplementations.put((net.sourceforge.czt.zpatt.jaxb.gen.JokerPredElement.class), "net.sourceforge.czt.zpatt.jaxb.gen.impl.JokerPredElementImpl");
        defaultImplementations.put((net.sourceforge.czt.zpatt.jaxb.gen.SubstListElement.class), "net.sourceforge.czt.zpatt.jaxb.gen.impl.SubstListElementImpl");
        defaultImplementations.put((net.sourceforge.czt.zpatt.jaxb.gen.SubstituteElement.class), "net.sourceforge.czt.zpatt.jaxb.gen.impl.SubstituteElementImpl");
        defaultImplementations.put((net.sourceforge.czt.zpatt.jaxb.gen.JokerExpr.class), "net.sourceforge.czt.zpatt.jaxb.gen.impl.JokerExprImpl");
        rootTagMap.put(new javax.xml.namespace.QName("http://czt.sourceforge.net/zpatt", "Substitute"), (net.sourceforge.czt.zpatt.jaxb.gen.SubstituteElement.class));
        rootTagMap.put(new javax.xml.namespace.QName("http://czt.sourceforge.net/zpatt", "JokerExpr"), (net.sourceforge.czt.zpatt.jaxb.gen.JokerExprElement.class));
        rootTagMap.put(new javax.xml.namespace.QName("http://czt.sourceforge.net/zpatt", "JokerPred"), (net.sourceforge.czt.zpatt.jaxb.gen.JokerPredElement.class));
        rootTagMap.put(new javax.xml.namespace.QName("http://czt.sourceforge.net/zpatt", "SubstList"), (net.sourceforge.czt.zpatt.jaxb.gen.SubstListElement.class));
    }

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: net.sourceforge.czt.zpatt.jaxb.gen
     * 
     */
    public ObjectFactory() {
        super(grammarInfo);
    }

    /**
     * Create an instance of the specified Java content interface.
     * 
     * @param javaContentInterface
     *     the Class object of the javacontent interface to instantiate
     * @return
     *     a new instance
     * @throws JAXBException
     *     if an error occurs
     */
    public java.lang.Object newInstance(java.lang.Class javaContentInterface)
        throws javax.xml.bind.JAXBException
    {
        return super.newInstance(javaContentInterface);
    }

    /**
     * Get the specified property. This method can only be
     * used to get provider specific properties.
     * Attempting to get an undefined property will result
     * in a PropertyException being thrown.
     * 
     * @param name
     *     the name of the property to retrieve
     * @return
     *     the value of the requested property
     * @throws PropertyException
     *     when there is an error retrieving the given property or value
     */
    public java.lang.Object getProperty(java.lang.String name)
        throws javax.xml.bind.PropertyException
    {
        return super.getProperty(name);
    }

    /**
     * Set the specified property. This method can only be
     * used to set provider specific properties.
     * Attempting to set an undefined property will result
     * in a PropertyException being thrown.
     * 
     * @param value
     *     the value of the property to be set
     * @param name
     *     the name of the property to retrieve
     * @throws PropertyException
     *     when there is an error processing the given property or value
     */
    public void setProperty(java.lang.String name, java.lang.Object value)
        throws javax.xml.bind.PropertyException
    {
        super.setProperty(name, value);
    }

    /**
     * Create an instance of JokerExprElement
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sourceforge.czt.zpatt.jaxb.gen.JokerExprElement createJokerExprElement()
        throws javax.xml.bind.JAXBException
    {
        return new net.sourceforge.czt.zpatt.jaxb.gen.impl.JokerExprElementImpl();
    }

    /**
     * Create an instance of JokerPred
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sourceforge.czt.zpatt.jaxb.gen.JokerPred createJokerPred()
        throws javax.xml.bind.JAXBException
    {
        return new net.sourceforge.czt.zpatt.jaxb.gen.impl.JokerPredImpl();
    }

    /**
     * Create an instance of SubstList
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sourceforge.czt.zpatt.jaxb.gen.SubstList createSubstList()
        throws javax.xml.bind.JAXBException
    {
        return new net.sourceforge.czt.zpatt.jaxb.gen.impl.SubstListImpl();
    }

    /**
     * Create an instance of Substitute
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sourceforge.czt.zpatt.jaxb.gen.Substitute createSubstitute()
        throws javax.xml.bind.JAXBException
    {
        return new net.sourceforge.czt.zpatt.jaxb.gen.impl.SubstituteImpl();
    }

    /**
     * Create an instance of JokerPredElement
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sourceforge.czt.zpatt.jaxb.gen.JokerPredElement createJokerPredElement()
        throws javax.xml.bind.JAXBException
    {
        return new net.sourceforge.czt.zpatt.jaxb.gen.impl.JokerPredElementImpl();
    }

    /**
     * Create an instance of SubstListElement
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sourceforge.czt.zpatt.jaxb.gen.SubstListElement createSubstListElement()
        throws javax.xml.bind.JAXBException
    {
        return new net.sourceforge.czt.zpatt.jaxb.gen.impl.SubstListElementImpl();
    }

    /**
     * Create an instance of SubstituteElement
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sourceforge.czt.zpatt.jaxb.gen.SubstituteElement createSubstituteElement()
        throws javax.xml.bind.JAXBException
    {
        return new net.sourceforge.czt.zpatt.jaxb.gen.impl.SubstituteElementImpl();
    }

    /**
     * Create an instance of JokerExpr
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sourceforge.czt.zpatt.jaxb.gen.JokerExpr createJokerExpr()
        throws javax.xml.bind.JAXBException
    {
        return new net.sourceforge.czt.zpatt.jaxb.gen.impl.JokerExprImpl();
    }

}
