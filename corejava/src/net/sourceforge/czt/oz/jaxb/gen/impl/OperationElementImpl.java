//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.2-b15-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2004.07.23 at 10:52:41 NZST 
//


package net.sourceforge.czt.oz.jaxb.gen.impl;

public class OperationElementImpl
    extends net.sourceforge.czt.oz.jaxb.gen.impl.OperationImpl
    implements net.sourceforge.czt.oz.jaxb.gen.OperationElement, com.sun.xml.bind.RIElement, com.sun.xml.bind.JAXBObject, net.sourceforge.czt.oz.jaxb.gen.impl.runtime.UnmarshallableObject, net.sourceforge.czt.oz.jaxb.gen.impl.runtime.XMLSerializable, net.sourceforge.czt.oz.jaxb.gen.impl.runtime.ValidatableObject
{

    public final static java.lang.Class version = (net.sourceforge.czt.oz.jaxb.gen.impl.JAXBVersion.class);
    private static com.sun.msv.grammar.Grammar schemaFragment;

    private final static java.lang.Class PRIMARY_INTERFACE_CLASS() {
        return (net.sourceforge.czt.oz.jaxb.gen.OperationElement.class);
    }

    public java.lang.String ____jaxb_ri____getNamespaceURI() {
        return "http://czt.sourceforge.net/object-z";
    }

    public java.lang.String ____jaxb_ri____getLocalName() {
        return "Operation";
    }

    public net.sourceforge.czt.oz.jaxb.gen.impl.runtime.UnmarshallingEventHandler createUnmarshaller(net.sourceforge.czt.oz.jaxb.gen.impl.runtime.UnmarshallingContext context) {
        return new net.sourceforge.czt.oz.jaxb.gen.impl.OperationElementImpl.Unmarshaller(context);
    }

    public void serializeBody(net.sourceforge.czt.oz.jaxb.gen.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        context.startElement("http://czt.sourceforge.net/object-z", "Operation");
        super.serializeURIs(context);
        context.endNamespaceDecls();
        super.serializeAttributes(context);
        context.endAttributes();
        super.serializeBody(context);
        context.endElement();
    }

    public void serializeAttributes(net.sourceforge.czt.oz.jaxb.gen.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
    }

    public void serializeURIs(net.sourceforge.czt.oz.jaxb.gen.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
    }

    public java.lang.Class getPrimaryInterface() {
        return (net.sourceforge.czt.oz.jaxb.gen.OperationElement.class);
    }

    public com.sun.msv.verifier.DocumentDeclaration createRawValidator() {
        if (schemaFragment == null) {
            schemaFragment = com.sun.xml.bind.validator.SchemaDeserializer.deserialize((
 "\u00ac\u00ed\u0000\u0005sr\u0000\'com.sun.msv.grammar.trex.ElementPattern\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000"
+"\tnameClasst\u0000\u001fLcom/sun/msv/grammar/NameClass;xr\u0000\u001ecom.sun.msv."
+"grammar.ElementExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002Z\u0000\u001aignoreUndeclaredAttributesL\u0000"
+"\fcontentModelt\u0000 Lcom/sun/msv/grammar/Expression;xr\u0000\u001ecom.sun."
+"msv.grammar.Expression\u00f8\u0018\u0082\u00e8N5~O\u0002\u0000\u0003I\u0000\u000ecachedHashCodeL\u0000\u0013epsilon"
+"Reducibilityt\u0000\u0013Ljava/lang/Boolean;L\u0000\u000bexpandedExpq\u0000~\u0000\u0003xp\u0010\u00da\u0018\u00bcp"
+"p\u0000sr\u0000\u001fcom.sun.msv.grammar.SequenceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun."
+"msv.grammar.BinaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0004exp1q\u0000~\u0000\u0003L\u0000\u0004exp2q\u0000~\u0000\u0003xq\u0000~"
+"\u0000\u0004\u0010\u00da\u0018\u00b1ppsq\u0000~\u0000\u0007\u000f\u0090O\u00a9ppsq\u0000~\u0000\u0007\u0004*[Nppsr\u0000\u001dcom.sun.msv.grammar.Choi"
+"ceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\b\u0002+\bMppsq\u0000~\u0000\u0000\u0002+\bBsr\u0000\u0011java.lang.Boolean\u00cd"
+" r\u0080\u00d5\u009c\u00fa\u00ee\u0002\u0000\u0001Z\u0000\u0005valuexp\u0000p\u0000sq\u0000~\u0000\u0007\u0002+\b7ppsq\u0000~\u0000\u0000\u0000Q\r\u00e4pp\u0000sq\u0000~\u0000\f\u0000Q\r\u00d9pp"
+"sr\u0000 com.sun.msv.grammar.OneOrMoreExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001ccom.sun.m"
+"sv.grammar.UnaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\u0003expq\u0000~\u0000\u0003xq\u0000~\u0000\u0004\u0000Q\r\u00ceq\u0000~\u0000\u0010psr\u0000"
+" com.sun.msv.grammar.AttributeExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003expq\u0000~\u0000\u0003L\u0000\tna"
+"meClassq\u0000~\u0000\u0001xq\u0000~\u0000\u0004\u0000Q\r\u00cbq\u0000~\u0000\u0010psr\u00002com.sun.msv.grammar.Expressi"
+"on$AnyStringExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004\u0000\u0000\u0000\bsq\u0000~\u0000\u000f\u0001q\u0000~\u0000\u001asr\u0000 c"
+"om.sun.msv.grammar.AnyNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun.msv.gr"
+"ammar.NameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com.sun.msv.grammar.Expressi"
+"on$EpsilonExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004\u0000\u0000\u0000\tq\u0000~\u0000\u001bq\u0000~\u0000 sr\u0000#com.s"
+"un.msv.grammar.SimpleNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\tlocalNamet\u0000\u0012Ljav"
+"a/lang/String;L\u0000\fnamespaceURIq\u0000~\u0000\"xq\u0000~\u0000\u001dt\u0000-net.sourceforge.c"
+"zt.z.jaxb.gen.TermA.AnnsTypet\u0000+http://java.sun.com/jaxb/xjc/"
+"dummy-elementssq\u0000~\u0000\f\u0001\u00d9\u00faNppsq\u0000~\u0000\u0017\u0001\u00d9\u00faCq\u0000~\u0000\u0010psr\u0000\u001bcom.sun.msv.gr"
+"ammar.DataExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\u0002dtt\u0000\u001fLorg/relaxng/datatype/Dataty"
+"pe;L\u0000\u0006exceptq\u0000~\u0000\u0003L\u0000\u0004namet\u0000\u001dLcom/sun/msv/util/StringPair;xq\u0000~"
+"\u0000\u0004\u00016\f\u00a3ppsr\u0000\"com.sun.msv.datatype.xsd.QnameType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000"
+"*com.sun.msv.datatype.xsd.BuiltinAtomicType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000%co"
+"m.sun.msv.datatype.xsd.ConcreteType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\'com.sun.ms"
+"v.datatype.xsd.XSDatatypeImpl\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\fnamespaceUriq\u0000~\u0000\""
+"L\u0000\btypeNameq\u0000~\u0000\"L\u0000\nwhiteSpacet\u0000.Lcom/sun/msv/datatype/xsd/Wh"
+"iteSpaceProcessor;xpt\u0000 http://www.w3.org/2001/XMLSchemat\u0000\u0005QN"
+"amesr\u00005com.sun.msv.datatype.xsd.WhiteSpaceProcessor$Collapse"
+"\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000,com.sun.msv.datatype.xsd.WhiteSpaceProcessor\u0000"
+"\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com.sun.msv.grammar.Expression$NullSetExpres"
+"sion\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004\u0000\u0000\u0000\nq\u0000~\u0000\u0010psr\u0000\u001bcom.sun.msv.util.StringPa"
+"ir\u00d0t\u001ejB\u008f\u008d\u00a0\u0002\u0000\u0002L\u0000\tlocalNameq\u0000~\u0000\"L\u0000\fnamespaceURIq\u0000~\u0000\"xpq\u0000~\u00003q\u0000~"
+"\u00002sq\u0000~\u0000!t\u0000\u0004typet\u0000)http://www.w3.org/2001/XMLSchema-instanceq"
+"\u0000~\u0000 sq\u0000~\u0000!t\u0000\u0004Annst\u0000\u001ehttp://czt.sourceforge.net/zmlq\u0000~\u0000 sq\u0000~\u0000"
+"\u0000\u0001\u00ffR\u00fcpp\u0000sq\u0000~\u0000\u0007\u0001\u00ffR\u00f1ppsq\u0000~\u0000\u0000\u0000Q\r\u00e4pp\u0000sq\u0000~\u0000\f\u0000Q\r\u00d9ppsq\u0000~\u0000\u0014\u0000Q\r\u00ceq\u0000~\u0000\u0010"
+"psq\u0000~\u0000\u0017\u0000Q\r\u00cbq\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000\'net.sourceforge.czt"
+".z.jaxb.gen.DeclNameq\u0000~\u0000%sq\u0000~\u0000\f\u0001\u00aeE\bppsq\u0000~\u0000\u0017\u0001\u00aeD\u00fdq\u0000~\u0000\u0010pq\u0000~\u0000+sq"
+"\u0000~\u0000!q\u0000~\u0000<q\u0000~\u0000=q\u0000~\u0000 sq\u0000~\u0000!t\u0000\u0004Namet\u0000#http://czt.sourceforge.ne"
+"t/object-zsq\u0000~\u0000\f\u000be\u00f4Vppsq\u0000~\u0000\f\u000b\u0014\u00e6pppsq\u0000~\u0000\f\n\u00c3\u00d8\u008appsq\u0000~\u0000\f\nr\u00ca\u00a4ppsq"
+"\u0000~\u0000\f\n!\u00bc\u00beppsq\u0000~\u0000\f\t\u00d0\u00ae\u00d8ppsq\u0000~\u0000\f\t\u007f\u00a0\u00f2ppsq\u0000~\u0000\f\t.\u0093\fppsq\u0000~\u0000\f\b\u00dd\u0085&ppsq"
+"\u0000~\u0000\f\b\u008cw@ppsq\u0000~\u0000\f\b;iZppsq\u0000~\u0000\f\u0007\u00ea[tppsq\u0000~\u0000\f\u0007\u0099M\u008eppsq\u0000~\u0000\f\u0007H?\u00a8ppsq"
+"\u0000~\u0000\f\u0006\u00f71\u00c2ppsq\u0000~\u0000\f\u0006\u00a6#\u00dcppsq\u0000~\u0000\f\u0006U\u0015\u00f6ppsq\u0000~\u0000\f\u0006\u0004\b\u0010ppsq\u0000~\u0000\f\u0005\u00b2\u00fa*ppsq"
+"\u0000~\u0000\f\u0005a\u00ecDppsq\u0000~\u0000\f\u0005\u0010\u00de^ppsq\u0000~\u0000\f\u0004\u00bf\u00d0xppsq\u0000~\u0000\f\u0004n\u00c2\u0092ppsq\u0000~\u0000\f\u0004\u001d\u00b4\u00acppsq"
+"\u0000~\u0000\f\u0003\u00cc\u00a6\u00c6ppsq\u0000~\u0000\f\u0003{\u0098\u00e0ppsq\u0000~\u0000\f\u0003*\u008a\u00fappsq\u0000~\u0000\f\u0002\u00d9}\u0014ppsq\u0000~\u0000\f\u0002\u0088o.ppsq"
+"\u0000~\u0000\f\u00027aHppsq\u0000~\u0000\f\u0001\u00e6Sbppsq\u0000~\u0000\f\u0001\u0095E|ppsq\u0000~\u0000\f\u0001D7\u0096ppsq\u0000~\u0000\f\u0000\u00f3)\u00b0ppsq"
+"\u0000~\u0000\f\u0000\u00a2\u001b\u00cappsq\u0000~\u0000\u0000\u0000Q\r\u00e4pp\u0000sq\u0000~\u0000\f\u0000Q\r\u00d9ppsq\u0000~\u0000\u0014\u0000Q\r\u00ceq\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0000Q\r"
+"\u00cbq\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u00007net.sourceforge.czt.tcoz.jaxb"
+".gen.DistInterleaveProExprq\u0000~\u0000%sq\u0000~\u0000\u0000\u0000Q\r\u00e4pp\u0000sq\u0000~\u0000\f\u0000Q\r\u00d9ppsq\u0000~"
+"\u0000\u0014\u0000Q\r\u00ceq\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0000Q\r\u00cbq\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u00003net.sour"
+"ceforge.czt.tcoz.jaxb.gen.InterleaveProExprq\u0000~\u0000%sq\u0000~\u0000\u0000\u0000Q\r\u00e4pp"
+"\u0000sq\u0000~\u0000\f\u0000Q\r\u00d9ppsq\u0000~\u0000\u0014\u0000Q\r\u00ceq\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0000Q\r\u00cbq\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 "
+"sq\u0000~\u0000!t\u00003net.sourceforge.czt.tcoz.jaxb.gen.TimeoutEndProExpr"
+"q\u0000~\u0000%sq\u0000~\u0000\u0000\u0000Q\r\u00e4pp\u0000sq\u0000~\u0000\f\u0000Q\r\u00d9ppsq\u0000~\u0000\u0014\u0000Q\r\u00ceq\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0000Q\r\u00cbq\u0000~\u0000"
+"\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000)net.sourceforge.czt.oz.jaxb.gen.Se"
+"qOpExprq\u0000~\u0000%sq\u0000~\u0000\u0000\u0000Q\r\u00e4pp\u0000sq\u0000~\u0000\f\u0000Q\r\u00d9ppsq\u0000~\u0000\u0014\u0000Q\r\u00ceq\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0000"
+"Q\r\u00cbq\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000.net.sourceforge.czt.oz.jaxb"
+".gen.DistConjOpExprq\u0000~\u0000%sq\u0000~\u0000\u0000\u0000Q\r\u00e4pp\u0000sq\u0000~\u0000\f\u0000Q\r\u00d9ppsq\u0000~\u0000\u0014\u0000Q\r\u00ceq"
+"\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0000Q\r\u00cbq\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u00000net.sourceforge"
+".czt.oz.jaxb.gen.DistChoiceOpExprq\u0000~\u0000%sq\u0000~\u0000\u0000\u0000Q\r\u00e4pp\u0000sq\u0000~\u0000\f\u0000Q\r"
+"\u00d9ppsq\u0000~\u0000\u0014\u0000Q\r\u00ceq\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0000Q\r\u00cbq\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u00003n"
+"et.sourceforge.czt.tcoz.jaxb.gen.RecProExprElementq\u0000~\u0000%sq\u0000~\u0000"
+"\u0000\u0000Q\r\u00e4pp\u0000sq\u0000~\u0000\f\u0000Q\r\u00d9ppsq\u0000~\u0000\u0014\u0000Q\r\u00ceq\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0000Q\r\u00cbq\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~"
+"\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000*net.sourceforge.czt.oz.jaxb.gen.ConjOpExprq\u0000"
+"~\u0000%sq\u0000~\u0000\u0000\u0000Q\r\u00e4pp\u0000sq\u0000~\u0000\f\u0000Q\r\u00d9ppsq\u0000~\u0000\u0014\u0000Q\r\u00ceq\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0000Q\r\u00cbq\u0000~\u0000\u0010p"
+"q\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u00002net.sourceforge.czt.tcoz.jaxb.gen.At"
+"ProExprElementq\u0000~\u0000%sq\u0000~\u0000\u0000\u0000Q\r\u00e4pp\u0000sq\u0000~\u0000\f\u0000Q\r\u00d9ppsq\u0000~\u0000\u0014\u0000Q\r\u00ceq\u0000~\u0000\u0010p"
+"sq\u0000~\u0000\u0017\u0000Q\r\u00cbq\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u00005net.sourceforge.czt."
+"tcoz.jaxb.gen.GuardProExprElementq\u0000~\u0000%sq\u0000~\u0000\u0000\u0000Q\r\u00e4pp\u0000sq\u0000~\u0000\f\u0000Q\r"
+"\u00d9ppsq\u0000~\u0000\u0014\u0000Q\r\u00ceq\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0000Q\r\u00cbq\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000-n"
+"et.sourceforge.czt.oz.jaxb.gen.DistSeqOpExprq\u0000~\u0000%sq\u0000~\u0000\u0000\u0000Q\r\u00e4p"
+"p\u0000sq\u0000~\u0000\f\u0000Q\r\u00d9ppsq\u0000~\u0000\u0014\u0000Q\r\u00ceq\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0000Q\r\u00cbq\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000"
+" sq\u0000~\u0000!t\u00001net.sourceforge.czt.tcoz.jaxb.gen.InChoiceProExprq"
+"\u0000~\u0000%sq\u0000~\u0000\u0000\u0000Q\r\u00e4pp\u0000sq\u0000~\u0000\f\u0000Q\r\u00d9ppsq\u0000~\u0000\u0014\u0000Q\r\u00ceq\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0000Q\r\u00cbq\u0000~\u0000\u0010"
+"pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u00002net.sourceforge.czt.tcoz.jaxb.gen.I"
+"nterruptProExprq\u0000~\u0000%sq\u0000~\u0000\u0000\u0000Q\r\u00e4pp\u0000sq\u0000~\u0000\f\u0000Q\r\u00d9ppsq\u0000~\u0000\u0014\u0000Q\r\u00ceq\u0000~\u0000\u0010"
+"psq\u0000~\u0000\u0017\u0000Q\r\u00cbq\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u00002net.sourceforge.czt"
+".oz.jaxb.gen.AssoParallelOpExprq\u0000~\u0000%sq\u0000~\u0000\u0000\u0000Q\r\u00e4pp\u0000sq\u0000~\u0000\f\u0000Q\r\u00d9p"
+"psq\u0000~\u0000\u0014\u0000Q\r\u00ceq\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0000Q\r\u00cbq\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u00003net"
+".sourceforge.czt.oz.jaxb.gen.OperationBoxElementq\u0000~\u0000%sq\u0000~\u0000\u0000\u0000"
+"Q\r\u00e4pp\u0000sq\u0000~\u0000\f\u0000Q\r\u00d9ppsq\u0000~\u0000\u0014\u0000Q\r\u00ceq\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0000Q\r\u00cbq\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001e"
+"q\u0000~\u0000 sq\u0000~\u0000!t\u0000-net.sourceforge.czt.tcoz.jaxb.gen.SkipProExprq"
+"\u0000~\u0000%sq\u0000~\u0000\u0000\u0000Q\r\u00e4pp\u0000sq\u0000~\u0000\f\u0000Q\r\u00d9ppsq\u0000~\u0000\u0014\u0000Q\r\u00ceq\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0000Q\r\u00cbq\u0000~\u0000\u0010"
+"pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u00006net.sourceforge.czt.tcoz.jaxb.gen.S"
+"ynPllProExprElementq\u0000~\u0000%sq\u0000~\u0000\u0000\u0000Q\r\u00e4pp\u0000sq\u0000~\u0000\f\u0000Q\r\u00d9ppsq\u0000~\u0000\u0014\u0000Q\r\u00ceq"
+"\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0000Q\r\u00cbq\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u00001net.sourceforge"
+".czt.oz.jaxb.gen.HideOpExprElementq\u0000~\u0000%sq\u0000~\u0000\u0000\u0000Q\r\u00e4pp\u0000sq\u0000~\u0000\f\u0000Q"
+"\r\u00d9ppsq\u0000~\u0000\u0014\u0000Q\r\u00ceq\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0000Q\r\u00cbq\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u00008"
+"net.sourceforge.czt.tcoz.jaxb.gen.DeadlineProExprElementq\u0000~\u0000"
+"%sq\u0000~\u0000\u0000\u0000Q\r\u00e4pp\u0000sq\u0000~\u0000\f\u0000Q\r\u00d9ppsq\u0000~\u0000\u0014\u0000Q\r\u00ceq\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0000Q\r\u00cbq\u0000~\u0000\u0010pq\u0000"
+"~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u00004net.sourceforge.czt.oz.jaxb.gen.Operat"
+"ionExprElementq\u0000~\u0000%sq\u0000~\u0000\u0000\u0000Q\r\u00e4pp\u0000sq\u0000~\u0000\f\u0000Q\r\u00d9ppsq\u0000~\u0000\u0014\u0000Q\r\u00ceq\u0000~\u0000\u0010p"
+"sq\u0000~\u0000\u0017\u0000Q\r\u00cbq\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000.net.sourceforge.czt."
+"oz.jaxb.gen.ExChoiceOpExprq\u0000~\u0000%sq\u0000~\u0000\u0000\u0000Q\r\u00e4pp\u0000sq\u0000~\u0000\f\u0000Q\r\u00d9ppsq\u0000~"
+"\u0000\u0014\u0000Q\r\u00ceq\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0000Q\r\u00cbq\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u00000net.sour"
+"ceforge.czt.tcoz.jaxb.gen.DivergeProExprq\u0000~\u0000%sq\u0000~\u0000\u0000\u0000Q\r\u00e4pp\u0000sq"
+"\u0000~\u0000\f\u0000Q\r\u00d9ppsq\u0000~\u0000\u0014\u0000Q\r\u00ceq\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0000Q\r\u00cbq\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000"
+"~\u0000!t\u00005net.sourceforge.czt.oz.jaxb.gen.OperationExpr2Elementq"
+"\u0000~\u0000%sq\u0000~\u0000\u0000\u0000Q\r\u00e4pp\u0000sq\u0000~\u0000\f\u0000Q\r\u00d9ppsq\u0000~\u0000\u0014\u0000Q\r\u00ceq\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0000Q\r\u00cbq\u0000~\u0000\u0010"
+"pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000+net.sourceforge.czt.oz.jaxb.gen.Par"
+"enOpExprq\u0000~\u0000%sq\u0000~\u0000\u0000\u0000Q\r\u00e4pp\u0000sq\u0000~\u0000\f\u0000Q\r\u00d9ppsq\u0000~\u0000\u0014\u0000Q\r\u00ceq\u0000~\u0000\u0010psq\u0000~\u0000\u0017"
+"\u0000Q\r\u00cbq\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u00006net.sourceforge.czt.oz.jax"
+"b.gen.OpPromotionExprElementq\u0000~\u0000%sq\u0000~\u0000\u0000\u0000Q\r\u00e4pp\u0000sq\u0000~\u0000\f\u0000Q\r\u00d9ppsq"
+"\u0000~\u0000\u0014\u0000Q\r\u00ceq\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0000Q\r\u00cbq\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u00001net.so"
+"urceforge.czt.oz.jaxb.gen.DistOpExprElementq\u0000~\u0000%sq\u0000~\u0000\u0000\u0000Q\r\u00e4pp"
+"\u0000sq\u0000~\u0000\f\u0000Q\r\u00d9ppsq\u0000~\u0000\u0014\u0000Q\r\u00ceq\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0000Q\r\u00cbq\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 "
+"sq\u0000~\u0000!t\u00002net.sourceforge.czt.oz.jaxb.gen.BasicOpExprElementq"
+"\u0000~\u0000%sq\u0000~\u0000\u0000\u0000Q\r\u00e4pp\u0000sq\u0000~\u0000\f\u0000Q\r\u00d9ppsq\u0000~\u0000\u0014\u0000Q\r\u00ceq\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0000Q\r\u00cbq\u0000~\u0000\u0010"
+"pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u00009net.sourceforge.czt.tcoz.jaxb.gen.W"
+"aitUntilProExprElementq\u0000~\u0000%sq\u0000~\u0000\u0000\u0000Q\r\u00e4pp\u0000sq\u0000~\u0000\f\u0000Q\r\u00d9ppsq\u0000~\u0000\u0014\u0000Q"
+"\r\u00ceq\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0000Q\r\u00cbq\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u00004net.sourcefo"
+"rge.czt.tcoz.jaxb.gen.WaitProExprElementq\u0000~\u0000%sq\u0000~\u0000\u0000\u0000Q\r\u00e4pp\u0000sq"
+"\u0000~\u0000\f\u0000Q\r\u00d9ppsq\u0000~\u0000\u0014\u0000Q\r\u00ceq\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0000Q\r\u00cbq\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000"
+"~\u0000!t\u0000.net.sourceforge.czt.oz.jaxb.gen.ParallelOpExprq\u0000~\u0000%sq\u0000"
+"~\u0000\u0000\u0000Q\r\u00e4pp\u0000sq\u0000~\u0000\f\u0000Q\r\u00d9ppsq\u0000~\u0000\u0014\u0000Q\r\u00ceq\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0000Q\r\u00cbq\u0000~\u0000\u0010pq\u0000~\u0000\u001aq"
+"\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u00008net.sourceforge.czt.tcoz.jaxb.gen.Topology"
+"ProExprElementq\u0000~\u0000%sq\u0000~\u0000\u0000\u0000Q\r\u00e4pp\u0000sq\u0000~\u0000\f\u0000Q\r\u00d9ppsq\u0000~\u0000\u0014\u0000Q\r\u00ceq\u0000~\u0000\u0010p"
+"sq\u0000~\u0000\u0017\u0000Q\r\u00cbq\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u00003net.sourceforge.czt."
+"oz.jaxb.gen.RenameOpExprElementq\u0000~\u0000%sq\u0000~\u0000\u0000\u0000Q\r\u00e4pp\u0000sq\u0000~\u0000\f\u0000Q\r\u00d9p"
+"psq\u0000~\u0000\u0014\u0000Q\r\u00ceq\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0000Q\r\u00cbq\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u00001net"
+".sourceforge.czt.oz.jaxb.gen.ScopeEnrichOpExprq\u0000~\u0000%sq\u0000~\u0000\u0000\u0000Q\r"
+"\u00e4pp\u0000sq\u0000~\u0000\f\u0000Q\r\u00d9ppsq\u0000~\u0000\u0014\u0000Q\r\u00ceq\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0000Q\r\u00cbq\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000"
+"~\u0000 sq\u0000~\u0000!t\u00005net.sourceforge.czt.tcoz.jaxb.gen.TimeoutStartPr"
+"oExprq\u0000~\u0000%sq\u0000~\u0000\u0000\u0000Q\r\u00e4pp\u0000sq\u0000~\u0000\f\u0000Q\r\u00d9ppsq\u0000~\u0000\u0014\u0000Q\r\u00ceq\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0000Q\r"
+"\u00cbq\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000-net.sourceforge.czt.tcoz.jaxb"
+".gen.StopProExprq\u0000~\u0000%sq\u0000~\u0000\u0000\u0000Q\r\u00e4pp\u0000sq\u0000~\u0000\f\u0000Q\r\u00d9ppsq\u0000~\u0000\u0014\u0000Q\r\u00ceq\u0000~\u0000"
+"\u0010psq\u0000~\u0000\u0017\u0000Q\r\u00cbq\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u00005net.sourceforge.cz"
+"t.tcoz.jaxb.gen.DistInChoiceProExprq\u0000~\u0000%sq\u0000~\u0000\f\u0001I\u00c9\u0003ppsq\u0000~\u0000\u0017\u0001I"
+"\u00c8\u00f8q\u0000~\u0000\u0010pq\u0000~\u0000+sq\u0000~\u0000!q\u0000~\u0000<q\u0000~\u0000=q\u0000~\u0000 sq\u0000~\u0000!t\u0000\tOperationq\u0000~\u0000Nsr\u0000"
+"\"com.sun.msv.grammar.ExpressionPool\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\bexpTablet\u0000/"
+"Lcom/sun/msv/grammar/ExpressionPool$ClosedHash;xpsr\u0000-com.sun"
+".msv.grammar.ExpressionPool$ClosedHash\u00d7j\u00d0N\u00ef\u00e8\u00ed\u001c\u0002\u0000\u0004I\u0000\u0005countI\u0000\t"
+"thresholdL\u0000\u0006parentq\u0000~\u0001P[\u0000\u0005tablet\u0000![Lcom/sun/msv/grammar/Expr"
+"ession;xp\u0000\u0000\u0000x\u0000\u0000\u0000\u00e6pur\u0000![Lcom.sun.msv.grammar.Expression;\u00d68D\u00c3]"
+"\u00ad\u00a7\n\u0002\u0000\u0000xp\u0000\u0000\u0002\u00ffpppppppq\u0000~\u0000_pppppppppppppppppppppppppppppppppppp"
+"q\u0000~\u0000bppppppppppppppppppppppppppppppppppppq\u0000~\u0000eppppppppq\u0000~\u0000Qp"
+"ppppppppppppppppppppppppppq\u0000~\u0000hppppppppq\u0000~\u0000Tpppppppppppppppp"
+"pppppppppq\u0000~\u0000\tpq\u0000~\u0000kppppppppq\u0000~\u0000Wq\u0000~\u0000Ipppppppppppppppppppppp"
+"ppppq\u0000~\u0000nppppppppq\u0000~\u0000Zpppppppppppppppppppppppppppq\u0000~\u0000qpppppp"
+"ppq\u0000~\u0000]ppppppppppppppppppppppppppppppppppppq\u0000~\u0000`pq\u0000~\u0001Jpppppp"
+"ppppppppppppppppppppppppppppq\u0000~\u0000\u000bq\u0000~\u0000cpppppppq\u0000~\u0000Opppppppppp"
+"pppppppppppppppppq\u0000~\u0000fppppppppq\u0000~\u0000Rppppppppppppppppq\u0000~\u0000\u0011pppp"
+"ppppppq\u0000~\u0000ippppppppq\u0000~\u0000Upq\u0000~\u0000\rpppppppppppppppppppppppppq\u0000~\u0000l"
+"ppppppppq\u0000~\u0000Xpppppppppppppppppppppppppppq\u0000~\u0000oppppppppq\u0000~\u0000[pp"
+"pppq\u0000~\u0001@q\u0000~\u0001:q\u0000~\u00014q\u0000~\u0001.q\u0000~\u0001(q\u0000~\u0001\"q\u0000~\u0001\u001cq\u0000~\u0001\u0016q\u0000~\u0001\u0010q\u0000~\u0001\nq\u0000~\u0001\u0004q\u0000"
+"~\u0001?q\u0000~\u00019q\u0000~\u00013q\u0000~\u0001-q\u0000~\u0001\'q\u0000~\u0001!q\u0000~\u0001\u001bq\u0000~\u0001\u0015q\u0000~\u0001\u000fq\u0000~\u0001\tq\u0000~\u0001\u0003q\u0000~\u0000\u00fdq\u0000"
+"~\u0000\u00feq\u0000~\u0000\u00f7q\u0000~\u0000\u00f8q\u0000~\u0000\u00f1q\u0000~\u0000\u00f2q\u0000~\u0000\u00ebq\u0000~\u0000\u00ecq\u0000~\u0000\u00e5q\u0000~\u0000\u00e6q\u0000~\u0000\u00dfq\u0000~\u0000\u00e0q\u0000~\u0000\u00d9q\u0000"
+"~\u0000\u00daq\u0000~\u0000\u00d3q\u0000~\u0000\u00d4q\u0000~\u0000\u0016q\u0000~\u0000Eq\u0000~\u0000tq\u0000~\u0000zq\u0000~\u0000\u0080q\u0000~\u0000\u0086q\u0000~\u0000\u008cq\u0000~\u0000\u0013q\u0000~\u0000Dq\u0000"
+"~\u0000sq\u0000~\u0000yq\u0000~\u0000\u007fq\u0000~\u0000\u0085q\u0000~\u0000\u008bq\u0000~\u0000\u0091q\u0000~\u0000\u0097q\u0000~\u0000\u009dq\u0000~\u0000\u00a3q\u0000~\u0000\u00a9q\u0000~\u0000\u00afq\u0000~\u0000\u00b5q\u0000"
+"~\u0000\u00bbq\u0000~\u0000\u00c1q\u0000~\u0000\u00c7q\u0000~\u0000\u00cdq\u0000~\u0000\u0092q\u0000~\u0000\u0098q\u0000~\u0000\u009eq\u0000~\u0000\u00a4q\u0000~\u0000\u00aaq\u0000~\u0000aq\u0000~\u0000\u00b0q\u0000~\u0000\u00b6q\u0000"
+"~\u0000\u00bcq\u0000~\u0000\u00c2q\u0000~\u0000\u00c8q\u0000~\u0000\u00ceq\u0000~\u0000^q\u0000~\u0001Fq\u0000~\u0001Eppppppppppppppppppppppppppp"
+"q\u0000~\u0000dppppppppq\u0000~\u0000Ppppppppppppppppppppppppppppq\u0000~\u0000gppppppppq\u0000"
+"~\u0000Spppppppppppq\u0000~\u0000\npq\u0000~\u0000&pppppppppppppq\u0000~\u0000jppppppppq\u0000~\u0000Vppq\u0000"
+"~\u0000Bppppppppppppppppppppppppq\u0000~\u0000mppppppppq\u0000~\u0000Yppppppppppppppp"
+"ppppppppppppq\u0000~\u0000pppppppppq\u0000~\u0000\\ppppppppppppppppppppppppppppp"));
        }
        return new com.sun.msv.verifier.regexp.REDocumentDeclaration(schemaFragment);
    }

    public class Unmarshaller
        extends net.sourceforge.czt.oz.jaxb.gen.impl.runtime.AbstractUnmarshallingEventHandlerImpl
    {


        public Unmarshaller(net.sourceforge.czt.oz.jaxb.gen.impl.runtime.UnmarshallingContext context) {
            super(context, "----");
        }

        protected Unmarshaller(net.sourceforge.czt.oz.jaxb.gen.impl.runtime.UnmarshallingContext context, int startState) {
            this(context);
            state = startState;
        }

        public java.lang.Object owner() {
            return net.sourceforge.czt.oz.jaxb.gen.impl.OperationElementImpl.this;
        }

        public void enterElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname, org.xml.sax.Attributes __atts)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  3 :
                        revertToParentFromEnterElement(___uri, ___local, ___qname, __atts);
                        return ;
                    case  0 :
                        if (("Operation" == ___local)&&("http://czt.sourceforge.net/object-z" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 1;
                            return ;
                        }
                        break;
                    case  1 :
                        if (("Anns" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.oz.jaxb.gen.impl.OperationImpl)net.sourceforge.czt.oz.jaxb.gen.impl.OperationElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("Name" == ___local)&&("http://czt.sourceforge.net/object-z" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.oz.jaxb.gen.impl.OperationImpl)net.sourceforge.czt.oz.jaxb.gen.impl.OperationElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        spawnHandlerFromEnterElement((((net.sourceforge.czt.oz.jaxb.gen.impl.OperationImpl)net.sourceforge.czt.oz.jaxb.gen.impl.OperationElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                        return ;
                }
                super.enterElement(___uri, ___local, ___qname, __atts);
                break;
            }
        }

        public void leaveElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  3 :
                        revertToParentFromLeaveElement(___uri, ___local, ___qname);
                        return ;
                    case  2 :
                        if (("Operation" == ___local)&&("http://czt.sourceforge.net/object-z" == ___uri)) {
                            context.popAttributes();
                            state = 3;
                            return ;
                        }
                        break;
                    case  1 :
                        spawnHandlerFromLeaveElement((((net.sourceforge.czt.oz.jaxb.gen.impl.OperationImpl)net.sourceforge.czt.oz.jaxb.gen.impl.OperationElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
                        return ;
                }
                super.leaveElement(___uri, ___local, ___qname);
                break;
            }
        }

        public void enterAttribute(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  3 :
                        revertToParentFromEnterAttribute(___uri, ___local, ___qname);
                        return ;
                    case  1 :
                        spawnHandlerFromEnterAttribute((((net.sourceforge.czt.oz.jaxb.gen.impl.OperationImpl)net.sourceforge.czt.oz.jaxb.gen.impl.OperationElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
                        return ;
                }
                super.enterAttribute(___uri, ___local, ___qname);
                break;
            }
        }

        public void leaveAttribute(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  3 :
                        revertToParentFromLeaveAttribute(___uri, ___local, ___qname);
                        return ;
                    case  1 :
                        spawnHandlerFromLeaveAttribute((((net.sourceforge.czt.oz.jaxb.gen.impl.OperationImpl)net.sourceforge.czt.oz.jaxb.gen.impl.OperationElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
                        return ;
                }
                super.leaveAttribute(___uri, ___local, ___qname);
                break;
            }
        }

        public void handleText(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                try {
                    switch (state) {
                        case  3 :
                            revertToParentFromText(value);
                            return ;
                        case  1 :
                            spawnHandlerFromText((((net.sourceforge.czt.oz.jaxb.gen.impl.OperationImpl)net.sourceforge.czt.oz.jaxb.gen.impl.OperationElementImpl.this).new Unmarshaller(context)), 2, value);
                            return ;
                    }
                } catch (java.lang.RuntimeException e) {
                    handleUnexpectedTextException(value, e);
                }
                break;
            }
        }

    }

}
