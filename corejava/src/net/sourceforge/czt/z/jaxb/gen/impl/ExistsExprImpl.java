//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.2-b15-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2004.01.06 at 09:18:18 NZDT 
//


package net.sourceforge.czt.z.jaxb.gen.impl;

public class ExistsExprImpl
    extends net.sourceforge.czt.z.jaxb.gen.impl.Qnt1ExprImpl
    implements net.sourceforge.czt.z.jaxb.gen.ExistsExpr, com.sun.xml.bind.RIElement, com.sun.xml.bind.JAXBObject, net.sourceforge.czt.oz.jaxb.gen.impl.runtime.UnmarshallableObject, net.sourceforge.czt.oz.jaxb.gen.impl.runtime.XMLSerializable, net.sourceforge.czt.oz.jaxb.gen.impl.runtime.ValidatableObject
{

    public final static java.lang.Class version = (net.sourceforge.czt.z.jaxb.gen.impl.JAXBVersion.class);
    private static com.sun.msv.grammar.Grammar schemaFragment;

    private final static java.lang.Class PRIMARY_INTERFACE_CLASS() {
        return (net.sourceforge.czt.z.jaxb.gen.ExistsExpr.class);
    }

    public java.lang.String ____jaxb_ri____getNamespaceURI() {
        return "http://czt.sourceforge.net/zml";
    }

    public java.lang.String ____jaxb_ri____getLocalName() {
        return "ExistsExpr";
    }

    public net.sourceforge.czt.oz.jaxb.gen.impl.runtime.UnmarshallingEventHandler createUnmarshaller(net.sourceforge.czt.oz.jaxb.gen.impl.runtime.UnmarshallingContext context) {
        return new net.sourceforge.czt.z.jaxb.gen.impl.ExistsExprImpl.Unmarshaller(context);
    }

    public void serializeBody(net.sourceforge.czt.oz.jaxb.gen.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        context.startElement("http://czt.sourceforge.net/zml", "ExistsExpr");
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
        return (net.sourceforge.czt.z.jaxb.gen.ExistsExpr.class);
    }

    public com.sun.msv.verifier.DocumentDeclaration createRawValidator() {
        if (schemaFragment == null) {
            schemaFragment = com.sun.xml.bind.validator.SchemaDeserializer.deserialize((
 "\u00ac\u00ed\u0000\u0005sr\u0000\'com.sun.msv.grammar.trex.ElementPattern\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000"
+"\tnameClasst\u0000\u001fLcom/sun/msv/grammar/NameClass;xr\u0000\u001ecom.sun.msv."
+"grammar.ElementExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002Z\u0000\u001aignoreUndeclaredAttributesL\u0000"
+"\fcontentModelt\u0000 Lcom/sun/msv/grammar/Expression;xr\u0000\u001ecom.sun."
+"msv.grammar.Expression\u00f8\u0018\u0082\u00e8N5~O\u0002\u0000\u0003I\u0000\u000ecachedHashCodeL\u0000\u0013epsilon"
+"Reducibilityt\u0000\u0013Ljava/lang/Boolean;L\u0000\u000bexpandedExpq\u0000~\u0000\u0003xp>\u00ae[\u00bep"
+"p\u0000sr\u0000\u001fcom.sun.msv.grammar.SequenceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun."
+"msv.grammar.BinaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0004exp1q\u0000~\u0000\u0003L\u0000\u0004exp2q\u0000~\u0000\u0003xq\u0000~"
+"\u0000\u0004>\u00ae[\u00b3ppsq\u0000~\u0000\u0007=1\u0019\u001dppsq\u0000~\u0000\u0007\u0005~Y\u0087ppsr\u0000\u001dcom.sun.msv.grammar.Choi"
+"ceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\b\u0002*\u00a2(ppsq\u0000~\u0000\u0000\u0002*\u00a2\u001dsr\u0000\u0011java.lang.Boolean\u00cd"
+" r\u0080\u00d5\u009c\u00fa\u00ee\u0002\u0000\u0001Z\u0000\u0005valuexp\u0000p\u0000sq\u0000~\u0000\u0007\u0002*\u00a2\u0012ppsq\u0000~\u0000\u0000\u0001dw\u00fbpp\u0000sq\u0000~\u0000\f\u0001dw\u00f0pp"
+"sr\u0000 com.sun.msv.grammar.OneOrMoreExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001ccom.sun.m"
+"sv.grammar.UnaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\u0003expq\u0000~\u0000\u0003xq\u0000~\u0000\u0004\u0001dw\u00e5q\u0000~\u0000\u0010psr\u0000"
+" com.sun.msv.grammar.AttributeExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003expq\u0000~\u0000\u0003L\u0000\tna"
+"meClassq\u0000~\u0000\u0001xq\u0000~\u0000\u0004\u0001dw\u00e2q\u0000~\u0000\u0010psr\u00002com.sun.msv.grammar.Expressi"
+"on$AnyStringExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004\u0000\u0000\u0000\bsq\u0000~\u0000\u000f\u0001q\u0000~\u0000\u001asr\u0000 c"
+"om.sun.msv.grammar.AnyNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun.msv.gr"
+"ammar.NameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com.sun.msv.grammar.Expressi"
+"on$EpsilonExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004\u0000\u0000\u0000\tq\u0000~\u0000\u001bq\u0000~\u0000 sr\u0000#com.s"
+"un.msv.grammar.SimpleNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\tlocalNamet\u0000\u0012Ljav"
+"a/lang/String;L\u0000\fnamespaceURIq\u0000~\u0000\"xq\u0000~\u0000\u001dt\u0000-net.sourceforge.c"
+"zt.z.jaxb.gen.TermA.AnnsTypet\u0000+http://java.sun.com/jaxb/xjc/"
+"dummy-elementssq\u0000~\u0000\f\u0000\u00c6*\u0012ppsq\u0000~\u0000\u0017\u0000\u00c6*\u0007q\u0000~\u0000\u0010psr\u0000\u001bcom.sun.msv.gr"
+"ammar.DataExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\u0002dtt\u0000\u001fLorg/relaxng/datatype/Dataty"
+"pe;L\u0000\u0006exceptq\u0000~\u0000\u0003L\u0000\u0004namet\u0000\u001dLcom/sun/msv/util/StringPair;xq\u0000~"
+"\u0000\u0004\u00003\u00b11ppsr\u0000\"com.sun.msv.datatype.xsd.QnameType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000"
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
+"\f\u0003S\u00b7Zppsq\u0000~\u0000\u0000\u0001dw\u00fbpp\u0000sq\u0000~\u0000\f\u0001dw\u00f0ppsq\u0000~\u0000\u0014\u0001dw\u00e5q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001dw\u00e2q\u0000"
+"~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000-net.sourceforge.czt.z.jaxb.gen.S"
+"chTextElementq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001\u00ef?]pp\u0000sq\u0000~\u0000\u0007\u0001\u00ef?Rppsq\u0000~\u0000\u0000\u0001dw\u00fbpp\u0000sq\u0000~"
+"\u0000\f\u0001dw\u00f0ppsq\u0000~\u0000\u0014\u0001dw\u00e5q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001dw\u00e2q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000"
+"!t\u0000&net.sourceforge.czt.z.jaxb.gen.SchTextq\u0000~\u0000%sq\u0000~\u0000\f\u0000\u008a\u00c7Rpps"
+"q\u0000~\u0000\u0017\u0000\u008a\u00c7Gq\u0000~\u0000\u0010pq\u0000~\u0000+sq\u0000~\u0000!q\u0000~\u0000<q\u0000~\u0000=q\u0000~\u0000 sq\u0000~\u0000!t\u0000\u0007SchTextq\u0000~"
+"\u0000@sq\u0000~\u0000\f7\u00b2\u00bf\u0091ppsq\u0000~\u0000\f7\u00b2\u00bf\u0086q\u0000~\u0000\u0010psq\u0000~\u0000\f6NG\u0089q\u0000~\u0000\u0010psq\u0000~\u0000\f4\u00e9\u00cf\u008cq\u0000~\u0000"
+"\u0010psq\u0000~\u0000\f3\u0085W\u008fq\u0000~\u0000\u0010psq\u0000~\u0000\f2 \u00df\u0092q\u0000~\u0000\u0010psq\u0000~\u0000\f0\u00bcg\u0095q\u0000~\u0000\u0010psq\u0000~\u0000\f/W\u00ef\u0098"
+"q\u0000~\u0000\u0010psq\u0000~\u0000\f-\u00f3w\u009bq\u0000~\u0000\u0010psq\u0000~\u0000\f,\u008e\u00ff\u009eq\u0000~\u0000\u0010psq\u0000~\u0000\f+*\u0087\u00a1q\u0000~\u0000\u0010psq\u0000~\u0000\f"
+")\u00c6\u000f\u00a4q\u0000~\u0000\u0010psq\u0000~\u0000\f(a\u0097\u00a7q\u0000~\u0000\u0010psq\u0000~\u0000\f&\u00fd\u001f\u00aaq\u0000~\u0000\u0010psq\u0000~\u0000\f%\u0098\u00a7\u00adq\u0000~\u0000\u0010psq"
+"\u0000~\u0000\f$4/\u00b0q\u0000~\u0000\u0010psq\u0000~\u0000\f\"\u00cf\u00b7\u00b3q\u0000~\u0000\u0010psq\u0000~\u0000\f!k?\u00b6q\u0000~\u0000\u0010psq\u0000~\u0000\f \u0006\u00c7\u00b9q\u0000~\u0000"
+"\u0010psq\u0000~\u0000\f\u001e\u00a2O\u00bcq\u0000~\u0000\u0010psq\u0000~\u0000\f\u001d=\u00d7\u00bfq\u0000~\u0000\u0010psq\u0000~\u0000\f\u001b\u00d9_\u00c2q\u0000~\u0000\u0010psq\u0000~\u0000\f\u001at\u00e7\u00c5"
+"q\u0000~\u0000\u0010psq\u0000~\u0000\f\u0019\u0010o\u00c8q\u0000~\u0000\u0010psq\u0000~\u0000\f\u0017\u00ab\u00f7\u00cbq\u0000~\u0000\u0010psq\u0000~\u0000\f\u0016G\u007f\u00ceq\u0000~\u0000\u0010psq\u0000~\u0000\f"
+"\u0014\u00e3\u0007\u00d1q\u0000~\u0000\u0010psq\u0000~\u0000\f\u0013~\u008f\u00d4q\u0000~\u0000\u0010psq\u0000~\u0000\f\u0012\u001a\u0017\u00d7q\u0000~\u0000\u0010psq\u0000~\u0000\f\u0010\u00b5\u009f\u00daq\u0000~\u0000\u0010psq"
+"\u0000~\u0000\f\u000fQ\'\u00ddq\u0000~\u0000\u0010psq\u0000~\u0000\f\r\u00ec\u00af\u00e0q\u0000~\u0000\u0010psq\u0000~\u0000\f\f\u00887\u00e3q\u0000~\u0000\u0010psq\u0000~\u0000\f\u000b#\u00bf\u00e6q\u0000~\u0000"
+"\u0010psq\u0000~\u0000\f\t\u00bfG\u00e9q\u0000~\u0000\u0010psq\u0000~\u0000\f\bZ\u00cf\u00ecq\u0000~\u0000\u0010psq\u0000~\u0000\f\u0006\u00f6W\u00efq\u0000~\u0000\u0010psq\u0000~\u0000\f\u0005\u0091\u00df\u00f2"
+"q\u0000~\u0000\u0010psq\u0000~\u0000\f\u0004-g\u00f5q\u0000~\u0000\u0010psq\u0000~\u0000\f\u0002\u00c8\u00ef\u00f8q\u0000~\u0000\u0010psq\u0000~\u0000\u0000\u0001dw\u00fbq\u0000~\u0000\u0010p\u0000sq\u0000~\u0000"
+"\f\u0001dw\u00f0ppsq\u0000~\u0000\u0014\u0001dw\u00e5q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001dw\u00e2q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!"
+"t\u0000(net.sourceforge.czt.z.jaxb.gen.TupleExprq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001dw\u00fbq\u0000"
+"~\u0000\u0010p\u0000sq\u0000~\u0000\f\u0001dw\u00f0ppsq\u0000~\u0000\u0014\u0001dw\u00e5q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001dw\u00e2q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq"
+"\u0000~\u0000 sq\u0000~\u0000!t\u0000,net.sourceforge.czt.z.jaxb.gen.Expr2NElementq\u0000~"
+"\u0000%sq\u0000~\u0000\u0000\u0001dw\u00fbq\u0000~\u0000\u0010p\u0000sq\u0000~\u0000\f\u0001dw\u00f0ppsq\u0000~\u0000\u0014\u0001dw\u00e5q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001dw\u00e2q\u0000~"
+"\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000\'net.sourceforge.czt.z.jaxb.gen.Pi"
+"peExprq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001dw\u00fbq\u0000~\u0000\u0010p\u0000sq\u0000~\u0000\f\u0001dw\u00f0ppsq\u0000~\u0000\u0014\u0001dw\u00e5q\u0000~\u0000\u0010psq\u0000~"
+"\u0000\u0017\u0001dw\u00e2q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000*net.sourceforge.czt.z.ja"
+"xb.gen.Exists1Exprq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001dw\u00fbq\u0000~\u0000\u0010p\u0000sq\u0000~\u0000\f\u0001dw\u00f0ppsq\u0000~\u0000\u0014\u0001d"
+"w\u00e5q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001dw\u00e2q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000&net.sourcefo"
+"rge.czt.z.jaxb.gen.PreExprq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001dw\u00fbq\u0000~\u0000\u0010p\u0000sq\u0000~\u0000\f\u0001dw\u00f0pp"
+"sq\u0000~\u0000\u0014\u0001dw\u00e5q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001dw\u00e2q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000&net."
+"sourceforge.czt.z.jaxb.gen.SetExprq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001dw\u00fbq\u0000~\u0000\u0010p\u0000sq\u0000~"
+"\u0000\f\u0001dw\u00f0ppsq\u0000~\u0000\u0014\u0001dw\u00e5q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001dw\u00e2q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000"
+"!t\u0000\'net.sourceforge.czt.z.jaxb.gen.ProdExprq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001dw\u00fbq\u0000"
+"~\u0000\u0010p\u0000sq\u0000~\u0000\f\u0001dw\u00f0ppsq\u0000~\u0000\u0014\u0001dw\u00e5q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001dw\u00e2q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq"
+"\u0000~\u0000 sq\u0000~\u0000!t\u0000.net.sourceforge.czt.z.jaxb.gen.SchExpr2Elementq"
+"\u0000~\u0000%sq\u0000~\u0000\u0000\u0001dw\u00fbq\u0000~\u0000\u0010p\u0000sq\u0000~\u0000\f\u0001dw\u00f0ppsq\u0000~\u0000\u0014\u0001dw\u00e5q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001dw\u00e2q"
+"\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000*net.sourceforge.czt.z.jaxb.gen."
+"ImpliesExprq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001dw\u00fbq\u0000~\u0000\u0010p\u0000sq\u0000~\u0000\f\u0001dw\u00f0ppsq\u0000~\u0000\u0014\u0001dw\u00e5q\u0000~\u0000\u0010"
+"psq\u0000~\u0000\u0017\u0001dw\u00e2q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000(net.sourceforge.czt"
+".z.jaxb.gen.PowerExprq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001dw\u00fbq\u0000~\u0000\u0010p\u0000sq\u0000~\u0000\f\u0001dw\u00f0ppsq\u0000~\u0000"
+"\u0014\u0001dw\u00e5q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001dw\u00e2q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000-net.sourc"
+"eforge.czt.z.jaxb.gen.SchExprElementq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001dw\u00fbq\u0000~\u0000\u0010p\u0000sq"
+"\u0000~\u0000\f\u0001dw\u00f0ppsq\u0000~\u0000\u0014\u0001dw\u00e5q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001dw\u00e2q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000"
+"~\u0000!t\u0000.net.sourceforge.czt.z.jaxb.gen.HideExprElementq\u0000~\u0000%sq\u0000"
+"~\u0000\u0000\u0001dw\u00fbq\u0000~\u0000\u0010p\u0000sq\u0000~\u0000\f\u0001dw\u00f0ppsq\u0000~\u0000\u0014\u0001dw\u00e5q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001dw\u00e2q\u0000~\u0000\u0010pq\u0000"
+"~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u00001net.sourceforge.czt.z.jaxb.gen.BindSel"
+"ExprElementq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001dw\u00fbq\u0000~\u0000\u0010p\u0000sq\u0000~\u0000\f\u0001dw\u00f0ppsq\u0000~\u0000\u0014\u0001dw\u00e5q\u0000~\u0000\u0010"
+"psq\u0000~\u0000\u0017\u0001dw\u00e2q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000.net.sourceforge.czt"
+".z.jaxb.gen.ApplExprElementq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001dw\u00fbq\u0000~\u0000\u0010p\u0000sq\u0000~\u0000\f\u0001dw\u00f0p"
+"psq\u0000~\u0000\u0014\u0001dw\u00e5q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001dw\u00e2q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000&net"
+".sourceforge.czt.z.jaxb.gen.NegExprq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001dw\u00fbq\u0000~\u0000\u0010p\u0000sq\u0000"
+"~\u0000\f\u0001dw\u00f0ppsq\u0000~\u0000\u0014\u0001dw\u00e5q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001dw\u00e2q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~"
+"\u0000!t\u0000)net.sourceforge.czt.z.jaxb.gen.ForallExprq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001dw"
+"\u00fbq\u0000~\u0000\u0010p\u0000sq\u0000~\u0000\f\u0001dw\u00f0ppsq\u0000~\u0000\u0014\u0001dw\u00e5q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001dw\u00e2q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~"
+"\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000*net.sourceforge.czt.z.jaxb.gen.SetCompExprq\u0000"
+"~\u0000%sq\u0000~\u0000\u0000\u0001dw\u00fbq\u0000~\u0000\u0010p\u0000sq\u0000~\u0000\f\u0001dw\u00f0ppsq\u0000~\u0000\u0014\u0001dw\u00e5q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001dw\u00e2q\u0000"
+"~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u00002net.sourceforge.czt.z.jaxb.gen.T"
+"upleSelExprElementq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001dw\u00fbq\u0000~\u0000\u0010p\u0000sq\u0000~\u0000\f\u0001dw\u00f0ppsq\u0000~\u0000\u0014\u0001d"
+"w\u00e5q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001dw\u00e2q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000-net.sourcefo"
+"rge.czt.z.jaxb.gen.NumExprElementq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001dw\u00fbq\u0000~\u0000\u0010p\u0000sq\u0000~\u0000"
+"\f\u0001dw\u00f0ppsq\u0000~\u0000\u0014\u0001dw\u00e5q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001dw\u00e2q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!"
+"t\u0000.net.sourceforge.czt.z.jaxb.gen.Qnt1ExprElementq\u0000~\u0000%sq\u0000~\u0000\u0000"
+"\u0001dw\u00fbq\u0000~\u0000\u0010p\u0000sq\u0000~\u0000\f\u0001dw\u00f0ppsq\u0000~\u0000\u0014\u0001dw\u00e5q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001dw\u00e2q\u0000~\u0000\u0010pq\u0000~\u0000\u001a"
+"q\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000&net.sourceforge.czt.z.jaxb.gen.IffExprq\u0000~"
+"\u0000%sq\u0000~\u0000\u0000\u0001dw\u00fbq\u0000~\u0000\u0010p\u0000sq\u0000~\u0000\f\u0001dw\u00f0ppsq\u0000~\u0000\u0014\u0001dw\u00e5q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001dw\u00e2q\u0000~"
+"\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000%net.sourceforge.czt.z.jaxb.gen.Or"
+"Exprq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001dw\u00fbq\u0000~\u0000\u0010p\u0000sq\u0000~\u0000\f\u0001dw\u00f0ppsq\u0000~\u0000\u0014\u0001dw\u00e5q\u0000~\u0000\u0010psq\u0000~\u0000\u0017"
+"\u0001dw\u00e2q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000.net.sourceforge.czt.z.jaxb"
+".gen.CondExprElementq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001dw\u00fbq\u0000~\u0000\u0010p\u0000sq\u0000~\u0000\f\u0001dw\u00f0ppsq\u0000~\u0000\u0014"
+"\u0001dw\u00e5q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001dw\u00e2q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000\'net.source"
+"forge.czt.z.jaxb.gen.CompExprq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001dw\u00fbq\u0000~\u0000\u0010p\u0000sq\u0000~\u0000\f\u0001dw"
+"\u00f0ppsq\u0000~\u0000\u0014\u0001dw\u00e5q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001dw\u00e2q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000)n"
+"et.sourceforge.czt.z.jaxb.gen.ExistsExprq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001dw\u00fbq\u0000~\u0000\u0010"
+"p\u0000sq\u0000~\u0000\f\u0001dw\u00f0ppsq\u0000~\u0000\u0014\u0001dw\u00e5q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001dw\u00e2q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000"
+" sq\u0000~\u0000!t\u0000)net.sourceforge.czt.z.jaxb.gen.LambdaExprq\u0000~\u0000%sq\u0000~"
+"\u0000\u0000\u0001dw\u00fbq\u0000~\u0000\u0010p\u0000sq\u0000~\u0000\f\u0001dw\u00f0ppsq\u0000~\u0000\u0014\u0001dw\u00e5q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001dw\u00e2q\u0000~\u0000\u0010pq\u0000~"
+"\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u00000net.sourceforge.czt.z.jaxb.gen.RenameEx"
+"prElementq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001dw\u00fbq\u0000~\u0000\u0010p\u0000sq\u0000~\u0000\f\u0001dw\u00f0ppsq\u0000~\u0000\u0014\u0001dw\u00e5q\u0000~\u0000\u0010ps"
+"q\u0000~\u0000\u0017\u0001dw\u00e2q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000/net.sourceforge.czt.z"
+".jaxb.gen.DecorExprElementq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001dw\u00fbq\u0000~\u0000\u0010p\u0000sq\u0000~\u0000\f\u0001dw\u00f0pp"
+"sq\u0000~\u0000\u0014\u0001dw\u00e5q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001dw\u00e2q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000,net."
+"sourceforge.czt.z.jaxb.gen.Expr0NElementq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001dw\u00fbq\u0000~\u0000\u0010"
+"p\u0000sq\u0000~\u0000\f\u0001dw\u00f0ppsq\u0000~\u0000\u0014\u0001dw\u00e5q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001dw\u00e2q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000"
+" sq\u0000~\u0000!t\u0000&net.sourceforge.czt.z.jaxb.gen.AndExprq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001"
+"dw\u00fbq\u0000~\u0000\u0010p\u0000sq\u0000~\u0000\f\u0001dw\u00f0ppsq\u0000~\u0000\u0014\u0001dw\u00e5q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001dw\u00e2q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq"
+"\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000\'net.sourceforge.czt.z.jaxb.gen.ProjExprq\u0000~"
+"\u0000%sq\u0000~\u0000\u0000\u0001dw\u00fbq\u0000~\u0000\u0010p\u0000sq\u0000~\u0000\f\u0001dw\u00f0ppsq\u0000~\u0000\u0014\u0001dw\u00e5q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001dw\u00e2q\u0000~"
+"\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u00003net.sourceforge.czt.zpatt.jaxb.ge"
+"n.JokerExprElementq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001dw\u00fbq\u0000~\u0000\u0010p\u0000sq\u0000~\u0000\f\u0001dw\u00f0ppsq\u0000~\u0000\u0014\u0001d"
+"w\u00e5q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001dw\u00e2q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000/net.sourcefo"
+"rge.czt.z.jaxb.gen.ThetaExprElementq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001dw\u00fbq\u0000~\u0000\u0010p\u0000sq\u0000"
+"~\u0000\f\u0001dw\u00f0ppsq\u0000~\u0000\u0014\u0001dw\u00e5q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001dw\u00e2q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~"
+"\u0000!t\u0000.net.sourceforge.czt.z.jaxb.gen.BindExprElementq\u0000~\u0000%sq\u0000~"
+"\u0000\u0000\u0001dw\u00fbq\u0000~\u0000\u0010p\u0000sq\u0000~\u0000\f\u0001dw\u00f0ppsq\u0000~\u0000\u0014\u0001dw\u00e5q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001dw\u00e2q\u0000~\u0000\u0010pq\u0000~"
+"\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000-net.sourceforge.czt.z.jaxb.gen.RefExprE"
+"lementq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001dw\u00fbq\u0000~\u0000\u0010p\u0000sq\u0000~\u0000\f\u0001dw\u00f0ppsq\u0000~\u0000\u0014\u0001dw\u00e5q\u0000~\u0000\u0010psq\u0000~"
+"\u0000\u0017\u0001dw\u00e2q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000%net.sourceforge.czt.z.ja"
+"xb.gen.MuExprq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001dw\u00fbq\u0000~\u0000\u0010p\u0000sq\u0000~\u0000\f\u0001dw\u00f0ppsq\u0000~\u0000\u0014\u0001dw\u00e5q\u0000~"
+"\u0000\u0010psq\u0000~\u0000\u0017\u0001dw\u00e2q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000-net.sourceforge.c"
+"zt.z.jaxb.gen.QntExprElementq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001dw\u00fbq\u0000~\u0000\u0010p\u0000sq\u0000~\u0000\f\u0001dw\u00f0"
+"ppsq\u0000~\u0000\u0014\u0001dw\u00e5q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001dw\u00e2q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000&ne"
+"t.sourceforge.czt.z.jaxb.gen.LetExprq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001dw\u00fbq\u0000~\u0000\u0010p\u0000sq"
+"\u0000~\u0000\f\u0001dw\u00f0ppsq\u0000~\u0000\u0014\u0001dw\u00e5q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001dw\u00e2q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000"
+"~\u0000!t\u0000+net.sourceforge.czt.z.jaxb.gen.Expr2Elementq\u0000~\u0000%sq\u0000~\u0000\u0000"
+"\u0001dw\u00fbq\u0000~\u0000\u0010p\u0000sq\u0000~\u0000\f\u0001dw\u00f0ppsq\u0000~\u0000\u0014\u0001dw\u00e5q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001dw\u00e2q\u0000~\u0000\u0010pq\u0000~\u0000\u001a"
+"q\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000+net.sourceforge.czt.z.jaxb.gen.Expr1Eleme"
+"ntq\u0000~\u0000%q\u0000~\u0000 sq\u0000~\u0000\f\u0001}B\u0091ppsq\u0000~\u0000\u0017\u0001}B\u0086q\u0000~\u0000\u0010pq\u0000~\u0000+sq\u0000~\u0000!q\u0000~\u0000<q\u0000~\u0000"
+"=q\u0000~\u0000 sq\u0000~\u0000!t\u0000\nExistsExprq\u0000~\u0000@sr\u0000\"com.sun.msv.grammar.Expres"
+"sionPool\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\bexpTablet\u0000/Lcom/sun/msv/grammar/Expres"
+"sionPool$ClosedHash;xpsr\u0000-com.sun.msv.grammar.ExpressionPool"
+"$ClosedHash\u00d7j\u00d0N\u00ef\u00e8\u00ed\u001c\u0002\u0000\u0004I\u0000\u0005countI\u0000\tthresholdL\u0000\u0006parentq\u0000~\u0001s[\u0000\u0005t"
+"ablet\u0000![Lcom/sun/msv/grammar/Expression;xp\u0000\u0000\u0000\u0088\u0000\u0000\u0000\u00e6pur\u0000![Lcom"
+".sun.msv.grammar.Expression;\u00d68D\u00c3]\u00ad\u00a7\n\u0002\u0000\u0000xp\u0000\u0000\u0002\u00ffpppppppppppq\u0000~\u0000"
+"bpppppppppppppppppppppppppq\u0000~\u0000eppppppppppppppppq\u0000~\u0000&pppppppp"
+"q\u0000~\u0000hpppppppppppppppppppppppppq\u0000~\u0000kppppppppppppppppppppppppp"
+"q\u0000~\u0000npppppppppppppppppppppppppq\u0000~\u0000qppppppppppppppppq\u0000~\u0000Ipppp"
+"ppppq\u0000~\u0000tppppppppppppq\u0000~\u0000Xppppppppppppq\u0000~\u0000wppppppppppppq\u0000~\u0000["
+"ppppppppppppq\u0000~\u0000zpppq\u0000~\u0001Eq\u0000~\u0001?q\u0000~\u00019q\u0000~\u00013q\u0000~\u0001-q\u0000~\u0001\'q\u0000~\u0001!q\u0000~\u0001\u001b"
+"q\u0000~\u0001\u0015q\u0000~\u0000^q\u0000~\u0001\u000fq\u0000~\u0001Dq\u0000~\u0001>q\u0000~\u00018q\u0000~\u00012q\u0000~\u0001,q\u0000~\u0001&q\u0000~\u0001 q\u0000~\u0001\u001aq\u0000~\u0001\u0014"
+"q\u0000~\u0001\u000eq\u0000~\u0001\bq\u0000~\u0001\tq\u0000~\u0001\u0002q\u0000~\u0001\u0003q\u0000~\u0000\u00fcq\u0000~\u0000\u00fdq\u0000~\u0000\u00f6q\u0000~\u0000\u00f7q\u0000~\u0000\u00f0q\u0000~\u0000\u00f1q\u0000~\u0000\u00ea"
+"q\u0000~\u0000\u00ebq\u0000~\u0000\u00e4q\u0000~\u0000\u00e5q\u0000~\u0000aq\u0000~\u0000\u00deq\u0000~\u0000\u00dfq\u0000~\u0000\u00d8q\u0000~\u0000\u00d9q\u0000~\u0000\u0016q\u0000~\u0000Dq\u0000~\u0000Lq\u0000~\u0000\u007f"
+"q\u0000~\u0000\u0085q\u0000~\u0000\u008bq\u0000~\u0000\u0091q\u0000~\u0000\u0013q\u0000~\u0000Cq\u0000~\u0000Kq\u0000~\u0000~q\u0000~\u0000\u0084q\u0000~\u0000\u008aq\u0000~\u0000\u0090q\u0000~\u0000\u0096q\u0000~\u0000\u009c"
+"q\u0000~\u0000\u00a2q\u0000~\u0000\u00a8q\u0000~\u0000\u00aeq\u0000~\u0000\u00b4q\u0000~\u0000\u00baq\u0000~\u0000dq\u0000~\u0000\u00c0q\u0000~\u0000\u00c6q\u0000~\u0000\u00ccq\u0000~\u0000\u00d2q\u0000~\u0000\u0097q\u0000~\u0000\u009d"
+"q\u0000~\u0000\u00a3q\u0000~\u0000\u00a9q\u0000~\u0000\u00afq\u0000~\u0000\u00b5q\u0000~\u0000\u00bbq\u0000~\u0000\u00c1q\u0000~\u0000\u00c7q\u0000~\u0000\u00cdq\u0000~\u0000\u00d3q\u0000~\u0001Kq\u0000~\u0001Jq\u0000~\u0001Q"
+"q\u0000~\u0001Pq\u0000~\u0000\u0011q\u0000~\u0001Wq\u0000~\u0001Vq\u0000~\u0001]q\u0000~\u0001\\q\u0000~\u0001cq\u0000~\u0000gq\u0000~\u0001bq\u0000~\u0001iq\u0000~\u0001hppppp"
+"pppppppq\u0000~\u0000\rpppppppppq\u0000~\u0000jpppppppppppppppppppppppppq\u0000~\u0000mpppp"
+"ppppppq\u0000~\u0000\tppppppppppppppq\u0000~\u0000ppppppppppppppppppppppppppq\u0000~\u0000s"
+"pq\u0000~\u0000Appppppppppq\u0000~\u0000Wppppppppppppq\u0000~\u0000vppppppppppppq\u0000~\u0000Zppppp"
+"ppppppq\u0000~\u0001mq\u0000~\u0000yppppppppppppq\u0000~\u0000]ppppppppppppq\u0000~\u0000|pppppppppp"
+"ppq\u0000~\u0000`pppppppppppppppppppppppppq\u0000~\u0000cppppppppppppppppppppppp"
+"ppq\u0000~\u0000fpppppppppppppppppppppppppq\u0000~\u0000ippppppppppppppppppppppp"
+"ppq\u0000~\u0000lpppppppppppppppppppppppppq\u0000~\u0000oppppppppppppppppppppppp"
+"ppq\u0000~\u0000rppppppppq\u0000~\u0000\npppq\u0000~\u0000Vq\u0000~\u0000Ppppppppppq\u0000~\u0000Upq\u0000~\u0000uppppppp"
+"pppppq\u0000~\u0000Yppppppppppppq\u0000~\u0000xppppppppppppq\u0000~\u0000\\ppppppppppppq\u0000~\u0000"
+"{pppppppq\u0000~\u0000\u000bppppq\u0000~\u0000_pppppppppppppp"));
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
            return net.sourceforge.czt.z.jaxb.gen.impl.ExistsExprImpl.this;
        }

        public void enterElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname, org.xml.sax.Attributes __atts)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  0 :
                        if (("ExistsExpr" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 1;
                            return ;
                        }
                        break;
                    case  3 :
                        revertToParentFromEnterElement(___uri, ___local, ___qname, __atts);
                        return ;
                    case  1 :
                        if (("Anns" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.z.jaxb.gen.impl.Qnt1ExprImpl)net.sourceforge.czt.z.jaxb.gen.impl.ExistsExprImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("SchText" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.z.jaxb.gen.impl.Qnt1ExprImpl)net.sourceforge.czt.z.jaxb.gen.impl.ExistsExprImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("SchText" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.z.jaxb.gen.impl.Qnt1ExprImpl)net.sourceforge.czt.z.jaxb.gen.impl.ExistsExprImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        spawnHandlerFromEnterElement((((net.sourceforge.czt.z.jaxb.gen.impl.Qnt1ExprImpl)net.sourceforge.czt.z.jaxb.gen.impl.ExistsExprImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
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
                    case  2 :
                        if (("ExistsExpr" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            context.popAttributes();
                            state = 3;
                            return ;
                        }
                        break;
                    case  3 :
                        revertToParentFromLeaveElement(___uri, ___local, ___qname);
                        return ;
                    case  1 :
                        spawnHandlerFromLeaveElement((((net.sourceforge.czt.z.jaxb.gen.impl.Qnt1ExprImpl)net.sourceforge.czt.z.jaxb.gen.impl.ExistsExprImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
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
                        spawnHandlerFromEnterAttribute((((net.sourceforge.czt.z.jaxb.gen.impl.Qnt1ExprImpl)net.sourceforge.czt.z.jaxb.gen.impl.ExistsExprImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
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
                        spawnHandlerFromLeaveAttribute((((net.sourceforge.czt.z.jaxb.gen.impl.Qnt1ExprImpl)net.sourceforge.czt.z.jaxb.gen.impl.ExistsExprImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
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
                            spawnHandlerFromText((((net.sourceforge.czt.z.jaxb.gen.impl.Qnt1ExprImpl)net.sourceforge.czt.z.jaxb.gen.impl.ExistsExprImpl.this).new Unmarshaller(context)), 2, value);
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
