//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.2-b15-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2004.01.06 at 09:18:18 NZDT 
//


package net.sourceforge.czt.z.jaxb.gen.impl;

public class BranchElementImpl
    extends net.sourceforge.czt.z.jaxb.gen.impl.BranchImpl
    implements net.sourceforge.czt.z.jaxb.gen.BranchElement, com.sun.xml.bind.RIElement, com.sun.xml.bind.JAXBObject, net.sourceforge.czt.oz.jaxb.gen.impl.runtime.UnmarshallableObject, net.sourceforge.czt.oz.jaxb.gen.impl.runtime.XMLSerializable, net.sourceforge.czt.oz.jaxb.gen.impl.runtime.ValidatableObject
{

    public final static java.lang.Class version = (net.sourceforge.czt.z.jaxb.gen.impl.JAXBVersion.class);
    private static com.sun.msv.grammar.Grammar schemaFragment;

    private final static java.lang.Class PRIMARY_INTERFACE_CLASS() {
        return (net.sourceforge.czt.z.jaxb.gen.BranchElement.class);
    }

    public java.lang.String ____jaxb_ri____getNamespaceURI() {
        return "http://czt.sourceforge.net/zml";
    }

    public java.lang.String ____jaxb_ri____getLocalName() {
        return "Branch";
    }

    public net.sourceforge.czt.oz.jaxb.gen.impl.runtime.UnmarshallingEventHandler createUnmarshaller(net.sourceforge.czt.oz.jaxb.gen.impl.runtime.UnmarshallingContext context) {
        return new net.sourceforge.czt.z.jaxb.gen.impl.BranchElementImpl.Unmarshaller(context);
    }

    public void serializeBody(net.sourceforge.czt.oz.jaxb.gen.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        context.startElement("http://czt.sourceforge.net/zml", "Branch");
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
        return (net.sourceforge.czt.z.jaxb.gen.BranchElement.class);
    }

    public com.sun.msv.verifier.DocumentDeclaration createRawValidator() {
        if (schemaFragment == null) {
            schemaFragment = com.sun.xml.bind.validator.SchemaDeserializer.deserialize((
 "\u00ac\u00ed\u0000\u0005sr\u0000\'com.sun.msv.grammar.trex.ElementPattern\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000"
+"\tnameClasst\u0000\u001fLcom/sun/msv/grammar/NameClass;xr\u0000\u001ecom.sun.msv."
+"grammar.ElementExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002Z\u0000\u001aignoreUndeclaredAttributesL\u0000"
+"\fcontentModelt\u0000 Lcom/sun/msv/grammar/Expression;xr\u0000\u001ecom.sun."
+"msv.grammar.Expression\u00f8\u0018\u0082\u00e8N5~O\u0002\u0000\u0003I\u0000\u000ecachedHashCodeL\u0000\u0013epsilon"
+"Reducibilityt\u0000\u0013Ljava/lang/Boolean;L\u0000\u000bexpandedExpq\u0000~\u0000\u0003xp>:v\u00fdp"
+"p\u0000sr\u0000\u001fcom.sun.msv.grammar.SequenceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun."
+"msv.grammar.BinaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0004exp1q\u0000~\u0000\u0003L\u0000\u0004exp2q\u0000~\u0000\u0003xq\u0000~"
+"\u0000\u0004>:v\u00f2ppsq\u0000~\u0000\u0007=\u00cd\u001dIppsq\u0000~\u0000\u0007\u0006\u001a]\u00b3ppsr\u0000\u001dcom.sun.msv.grammar.Choi"
+"ceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\b\u00027\u00ccNppsq\u0000~\u0000\u0000\u00027\u00ccCsr\u0000\u0011java.lang.Boolean\u00cd"
+" r\u0080\u00d5\u009c\u00fa\u00ee\u0002\u0000\u0001Z\u0000\u0005valuexp\u0000p\u0000sq\u0000~\u0000\u0007\u00027\u00cc8ppsq\u0000~\u0000\u0000\u0001dw\u00fbpp\u0000sq\u0000~\u0000\f\u0001dw\u00f0pp"
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
+"dummy-elementssq\u0000~\u0000\f\u0000\u00d3T8ppsq\u0000~\u0000\u0017\u0000\u00d3T-q\u0000~\u0000\u0010psr\u0000\u001bcom.sun.msv.gr"
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
+"\f\u0003\u00e2\u0091`ppsq\u0000~\u0000\u0000\u0001dw\u00fbpp\u0000sq\u0000~\u0000\f\u0001dw\u00f0ppsq\u0000~\u0000\u0014\u0001dw\u00e5q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001dw\u00e2q\u0000"
+"~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000.net.sourceforge.czt.z.jaxb.gen.D"
+"eclNameElementq\u0000~\u0000%sq\u0000~\u0000\u0000\u0002~\u0019cpp\u0000sq\u0000~\u0000\u0007\u0002~\u0019Xppsq\u0000~\u0000\u0000\u0001dw\u00fbpp\u0000sq\u0000"
+"~\u0000\f\u0001dw\u00f0ppsq\u0000~\u0000\u0014\u0001dw\u00e5q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001dw\u00e2q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~"
+"\u0000!t\u0000\'net.sourceforge.czt.z.jaxb.gen.DeclNameq\u0000~\u0000%sq\u0000~\u0000\f\u0001\u0019\u00a1Xp"
+"psq\u0000~\u0000\u0017\u0001\u0019\u00a1Mq\u0000~\u0000\u0010pq\u0000~\u0000+sq\u0000~\u0000!q\u0000~\u0000<q\u0000~\u0000=q\u0000~\u0000 sq\u0000~\u0000!t\u0000\bDeclName"
+"q\u0000~\u0000@sq\u0000~\u0000\f7\u00b2\u00bf\u0091ppsq\u0000~\u0000\f7\u00b2\u00bf\u0086q\u0000~\u0000\u0010psq\u0000~\u0000\f6NG\u0089q\u0000~\u0000\u0010psq\u0000~\u0000\f4\u00e9\u00cf\u008cq"
+"\u0000~\u0000\u0010psq\u0000~\u0000\f3\u0085W\u008fq\u0000~\u0000\u0010psq\u0000~\u0000\f2 \u00df\u0092q\u0000~\u0000\u0010psq\u0000~\u0000\f0\u00bcg\u0095q\u0000~\u0000\u0010psq\u0000~\u0000\f/"
+"W\u00ef\u0098q\u0000~\u0000\u0010psq\u0000~\u0000\f-\u00f3w\u009bq\u0000~\u0000\u0010psq\u0000~\u0000\f,\u008e\u00ff\u009eq\u0000~\u0000\u0010psq\u0000~\u0000\f+*\u0087\u00a1q\u0000~\u0000\u0010psq\u0000"
+"~\u0000\f)\u00c6\u000f\u00a4q\u0000~\u0000\u0010psq\u0000~\u0000\f(a\u0097\u00a7q\u0000~\u0000\u0010psq\u0000~\u0000\f&\u00fd\u001f\u00aaq\u0000~\u0000\u0010psq\u0000~\u0000\f%\u0098\u00a7\u00adq\u0000~\u0000\u0010"
+"psq\u0000~\u0000\f$4/\u00b0q\u0000~\u0000\u0010psq\u0000~\u0000\f\"\u00cf\u00b7\u00b3q\u0000~\u0000\u0010psq\u0000~\u0000\f!k?\u00b6q\u0000~\u0000\u0010psq\u0000~\u0000\f \u0006\u00c7\u00b9q"
+"\u0000~\u0000\u0010psq\u0000~\u0000\f\u001e\u00a2O\u00bcq\u0000~\u0000\u0010psq\u0000~\u0000\f\u001d=\u00d7\u00bfq\u0000~\u0000\u0010psq\u0000~\u0000\f\u001b\u00d9_\u00c2q\u0000~\u0000\u0010psq\u0000~\u0000\f\u001a"
+"t\u00e7\u00c5q\u0000~\u0000\u0010psq\u0000~\u0000\f\u0019\u0010o\u00c8q\u0000~\u0000\u0010psq\u0000~\u0000\f\u0017\u00ab\u00f7\u00cbq\u0000~\u0000\u0010psq\u0000~\u0000\f\u0016G\u007f\u00ceq\u0000~\u0000\u0010psq\u0000"
+"~\u0000\f\u0014\u00e3\u0007\u00d1q\u0000~\u0000\u0010psq\u0000~\u0000\f\u0013~\u008f\u00d4q\u0000~\u0000\u0010psq\u0000~\u0000\f\u0012\u001a\u0017\u00d7q\u0000~\u0000\u0010psq\u0000~\u0000\f\u0010\u00b5\u009f\u00daq\u0000~\u0000\u0010"
+"psq\u0000~\u0000\f\u000fQ\'\u00ddq\u0000~\u0000\u0010psq\u0000~\u0000\f\r\u00ec\u00af\u00e0q\u0000~\u0000\u0010psq\u0000~\u0000\f\f\u00887\u00e3q\u0000~\u0000\u0010psq\u0000~\u0000\f\u000b#\u00bf\u00e6q"
+"\u0000~\u0000\u0010psq\u0000~\u0000\f\t\u00bfG\u00e9q\u0000~\u0000\u0010psq\u0000~\u0000\f\bZ\u00cf\u00ecq\u0000~\u0000\u0010psq\u0000~\u0000\f\u0006\u00f6W\u00efq\u0000~\u0000\u0010psq\u0000~\u0000\f\u0005"
+"\u0091\u00df\u00f2q\u0000~\u0000\u0010psq\u0000~\u0000\f\u0004-g\u00f5q\u0000~\u0000\u0010psq\u0000~\u0000\f\u0002\u00c8\u00ef\u00f8q\u0000~\u0000\u0010psq\u0000~\u0000\u0000\u0001dw\u00fbq\u0000~\u0000\u0010p\u0000sq"
+"\u0000~\u0000\f\u0001dw\u00f0ppsq\u0000~\u0000\u0014\u0001dw\u00e5q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001dw\u00e2q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000"
+"~\u0000!t\u0000(net.sourceforge.czt.z.jaxb.gen.TupleExprq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001dw"
+"\u00fbq\u0000~\u0000\u0010p\u0000sq\u0000~\u0000\f\u0001dw\u00f0ppsq\u0000~\u0000\u0014\u0001dw\u00e5q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001dw\u00e2q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~"
+"\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000,net.sourceforge.czt.z.jaxb.gen.Expr2NElement"
+"q\u0000~\u0000%sq\u0000~\u0000\u0000\u0001dw\u00fbq\u0000~\u0000\u0010p\u0000sq\u0000~\u0000\f\u0001dw\u00f0ppsq\u0000~\u0000\u0014\u0001dw\u00e5q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001dw\u00e2"
+"q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000\'net.sourceforge.czt.z.jaxb.gen"
+".PipeExprq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001dw\u00fbq\u0000~\u0000\u0010p\u0000sq\u0000~\u0000\f\u0001dw\u00f0ppsq\u0000~\u0000\u0014\u0001dw\u00e5q\u0000~\u0000\u0010ps"
+"q\u0000~\u0000\u0017\u0001dw\u00e2q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000*net.sourceforge.czt.z"
+".jaxb.gen.Exists1Exprq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001dw\u00fbq\u0000~\u0000\u0010p\u0000sq\u0000~\u0000\f\u0001dw\u00f0ppsq\u0000~\u0000"
+"\u0014\u0001dw\u00e5q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001dw\u00e2q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000&net.sourc"
+"eforge.czt.z.jaxb.gen.PreExprq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001dw\u00fbq\u0000~\u0000\u0010p\u0000sq\u0000~\u0000\f\u0001dw"
+"\u00f0ppsq\u0000~\u0000\u0014\u0001dw\u00e5q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001dw\u00e2q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000&n"
+"et.sourceforge.czt.z.jaxb.gen.SetExprq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001dw\u00fbq\u0000~\u0000\u0010p\u0000s"
+"q\u0000~\u0000\f\u0001dw\u00f0ppsq\u0000~\u0000\u0014\u0001dw\u00e5q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001dw\u00e2q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq"
+"\u0000~\u0000!t\u0000\'net.sourceforge.czt.z.jaxb.gen.ProdExprq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001dw"
+"\u00fbq\u0000~\u0000\u0010p\u0000sq\u0000~\u0000\f\u0001dw\u00f0ppsq\u0000~\u0000\u0014\u0001dw\u00e5q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001dw\u00e2q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~"
+"\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000.net.sourceforge.czt.z.jaxb.gen.SchExpr2Eleme"
+"ntq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001dw\u00fbq\u0000~\u0000\u0010p\u0000sq\u0000~\u0000\f\u0001dw\u00f0ppsq\u0000~\u0000\u0014\u0001dw\u00e5q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001d"
+"w\u00e2q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000*net.sourceforge.czt.z.jaxb.g"
+"en.ImpliesExprq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001dw\u00fbq\u0000~\u0000\u0010p\u0000sq\u0000~\u0000\f\u0001dw\u00f0ppsq\u0000~\u0000\u0014\u0001dw\u00e5q\u0000"
+"~\u0000\u0010psq\u0000~\u0000\u0017\u0001dw\u00e2q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000(net.sourceforge."
+"czt.z.jaxb.gen.PowerExprq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001dw\u00fbq\u0000~\u0000\u0010p\u0000sq\u0000~\u0000\f\u0001dw\u00f0ppsq"
+"\u0000~\u0000\u0014\u0001dw\u00e5q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001dw\u00e2q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000-net.so"
+"urceforge.czt.z.jaxb.gen.SchExprElementq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001dw\u00fbq\u0000~\u0000\u0010p"
+"\u0000sq\u0000~\u0000\f\u0001dw\u00f0ppsq\u0000~\u0000\u0014\u0001dw\u00e5q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001dw\u00e2q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 "
+"sq\u0000~\u0000!t\u0000.net.sourceforge.czt.z.jaxb.gen.HideExprElementq\u0000~\u0000%"
+"sq\u0000~\u0000\u0000\u0001dw\u00fbq\u0000~\u0000\u0010p\u0000sq\u0000~\u0000\f\u0001dw\u00f0ppsq\u0000~\u0000\u0014\u0001dw\u00e5q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001dw\u00e2q\u0000~\u0000\u0010"
+"pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u00001net.sourceforge.czt.z.jaxb.gen.Bind"
+"SelExprElementq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001dw\u00fbq\u0000~\u0000\u0010p\u0000sq\u0000~\u0000\f\u0001dw\u00f0ppsq\u0000~\u0000\u0014\u0001dw\u00e5q\u0000"
+"~\u0000\u0010psq\u0000~\u0000\u0017\u0001dw\u00e2q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000.net.sourceforge."
+"czt.z.jaxb.gen.ApplExprElementq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001dw\u00fbq\u0000~\u0000\u0010p\u0000sq\u0000~\u0000\f\u0001d"
+"w\u00f0ppsq\u0000~\u0000\u0014\u0001dw\u00e5q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001dw\u00e2q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000&"
+"net.sourceforge.czt.z.jaxb.gen.NegExprq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001dw\u00fbq\u0000~\u0000\u0010p\u0000"
+"sq\u0000~\u0000\f\u0001dw\u00f0ppsq\u0000~\u0000\u0014\u0001dw\u00e5q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001dw\u00e2q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 s"
+"q\u0000~\u0000!t\u0000)net.sourceforge.czt.z.jaxb.gen.ForallExprq\u0000~\u0000%sq\u0000~\u0000\u0000"
+"\u0001dw\u00fbq\u0000~\u0000\u0010p\u0000sq\u0000~\u0000\f\u0001dw\u00f0ppsq\u0000~\u0000\u0014\u0001dw\u00e5q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001dw\u00e2q\u0000~\u0000\u0010pq\u0000~\u0000\u001a"
+"q\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000*net.sourceforge.czt.z.jaxb.gen.SetCompExp"
+"rq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001dw\u00fbq\u0000~\u0000\u0010p\u0000sq\u0000~\u0000\f\u0001dw\u00f0ppsq\u0000~\u0000\u0014\u0001dw\u00e5q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001dw"
+"\u00e2q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u00002net.sourceforge.czt.z.jaxb.ge"
+"n.TupleSelExprElementq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001dw\u00fbq\u0000~\u0000\u0010p\u0000sq\u0000~\u0000\f\u0001dw\u00f0ppsq\u0000~\u0000"
+"\u0014\u0001dw\u00e5q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001dw\u00e2q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000-net.sourc"
+"eforge.czt.z.jaxb.gen.NumExprElementq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001dw\u00fbq\u0000~\u0000\u0010p\u0000sq"
+"\u0000~\u0000\f\u0001dw\u00f0ppsq\u0000~\u0000\u0014\u0001dw\u00e5q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001dw\u00e2q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000"
+"~\u0000!t\u0000.net.sourceforge.czt.z.jaxb.gen.Qnt1ExprElementq\u0000~\u0000%sq\u0000"
+"~\u0000\u0000\u0001dw\u00fbq\u0000~\u0000\u0010p\u0000sq\u0000~\u0000\f\u0001dw\u00f0ppsq\u0000~\u0000\u0014\u0001dw\u00e5q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001dw\u00e2q\u0000~\u0000\u0010pq\u0000"
+"~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000&net.sourceforge.czt.z.jaxb.gen.IffExpr"
+"q\u0000~\u0000%sq\u0000~\u0000\u0000\u0001dw\u00fbq\u0000~\u0000\u0010p\u0000sq\u0000~\u0000\f\u0001dw\u00f0ppsq\u0000~\u0000\u0014\u0001dw\u00e5q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001dw\u00e2"
+"q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000%net.sourceforge.czt.z.jaxb.gen"
+".OrExprq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001dw\u00fbq\u0000~\u0000\u0010p\u0000sq\u0000~\u0000\f\u0001dw\u00f0ppsq\u0000~\u0000\u0014\u0001dw\u00e5q\u0000~\u0000\u0010psq\u0000"
+"~\u0000\u0017\u0001dw\u00e2q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000.net.sourceforge.czt.z.j"
+"axb.gen.CondExprElementq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001dw\u00fbq\u0000~\u0000\u0010p\u0000sq\u0000~\u0000\f\u0001dw\u00f0ppsq\u0000"
+"~\u0000\u0014\u0001dw\u00e5q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001dw\u00e2q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000\'net.sou"
+"rceforge.czt.z.jaxb.gen.CompExprq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001dw\u00fbq\u0000~\u0000\u0010p\u0000sq\u0000~\u0000\f"
+"\u0001dw\u00f0ppsq\u0000~\u0000\u0014\u0001dw\u00e5q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001dw\u00e2q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t"
+"\u0000)net.sourceforge.czt.z.jaxb.gen.ExistsExprq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001dw\u00fbq\u0000"
+"~\u0000\u0010p\u0000sq\u0000~\u0000\f\u0001dw\u00f0ppsq\u0000~\u0000\u0014\u0001dw\u00e5q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001dw\u00e2q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq"
+"\u0000~\u0000 sq\u0000~\u0000!t\u0000)net.sourceforge.czt.z.jaxb.gen.LambdaExprq\u0000~\u0000%s"
+"q\u0000~\u0000\u0000\u0001dw\u00fbq\u0000~\u0000\u0010p\u0000sq\u0000~\u0000\f\u0001dw\u00f0ppsq\u0000~\u0000\u0014\u0001dw\u00e5q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001dw\u00e2q\u0000~\u0000\u0010p"
+"q\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u00000net.sourceforge.czt.z.jaxb.gen.Renam"
+"eExprElementq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001dw\u00fbq\u0000~\u0000\u0010p\u0000sq\u0000~\u0000\f\u0001dw\u00f0ppsq\u0000~\u0000\u0014\u0001dw\u00e5q\u0000~\u0000"
+"\u0010psq\u0000~\u0000\u0017\u0001dw\u00e2q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000/net.sourceforge.cz"
+"t.z.jaxb.gen.DecorExprElementq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001dw\u00fbq\u0000~\u0000\u0010p\u0000sq\u0000~\u0000\f\u0001dw"
+"\u00f0ppsq\u0000~\u0000\u0014\u0001dw\u00e5q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001dw\u00e2q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000,n"
+"et.sourceforge.czt.z.jaxb.gen.Expr0NElementq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001dw\u00fbq\u0000"
+"~\u0000\u0010p\u0000sq\u0000~\u0000\f\u0001dw\u00f0ppsq\u0000~\u0000\u0014\u0001dw\u00e5q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001dw\u00e2q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq"
+"\u0000~\u0000 sq\u0000~\u0000!t\u0000&net.sourceforge.czt.z.jaxb.gen.AndExprq\u0000~\u0000%sq\u0000~"
+"\u0000\u0000\u0001dw\u00fbq\u0000~\u0000\u0010p\u0000sq\u0000~\u0000\f\u0001dw\u00f0ppsq\u0000~\u0000\u0014\u0001dw\u00e5q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001dw\u00e2q\u0000~\u0000\u0010pq\u0000~"
+"\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000\'net.sourceforge.czt.z.jaxb.gen.ProjExpr"
+"q\u0000~\u0000%sq\u0000~\u0000\u0000\u0001dw\u00fbq\u0000~\u0000\u0010p\u0000sq\u0000~\u0000\f\u0001dw\u00f0ppsq\u0000~\u0000\u0014\u0001dw\u00e5q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001dw\u00e2"
+"q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u00003net.sourceforge.czt.zpatt.jaxb"
+".gen.JokerExprElementq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001dw\u00fbq\u0000~\u0000\u0010p\u0000sq\u0000~\u0000\f\u0001dw\u00f0ppsq\u0000~\u0000"
+"\u0014\u0001dw\u00e5q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001dw\u00e2q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000/net.sourc"
+"eforge.czt.z.jaxb.gen.ThetaExprElementq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001dw\u00fbq\u0000~\u0000\u0010p\u0000"
+"sq\u0000~\u0000\f\u0001dw\u00f0ppsq\u0000~\u0000\u0014\u0001dw\u00e5q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001dw\u00e2q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 s"
+"q\u0000~\u0000!t\u0000.net.sourceforge.czt.z.jaxb.gen.BindExprElementq\u0000~\u0000%s"
+"q\u0000~\u0000\u0000\u0001dw\u00fbq\u0000~\u0000\u0010p\u0000sq\u0000~\u0000\f\u0001dw\u00f0ppsq\u0000~\u0000\u0014\u0001dw\u00e5q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001dw\u00e2q\u0000~\u0000\u0010p"
+"q\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000-net.sourceforge.czt.z.jaxb.gen.RefEx"
+"prElementq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001dw\u00fbq\u0000~\u0000\u0010p\u0000sq\u0000~\u0000\f\u0001dw\u00f0ppsq\u0000~\u0000\u0014\u0001dw\u00e5q\u0000~\u0000\u0010ps"
+"q\u0000~\u0000\u0017\u0001dw\u00e2q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000%net.sourceforge.czt.z"
+".jaxb.gen.MuExprq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001dw\u00fbq\u0000~\u0000\u0010p\u0000sq\u0000~\u0000\f\u0001dw\u00f0ppsq\u0000~\u0000\u0014\u0001dw\u00e5"
+"q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001dw\u00e2q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000-net.sourceforg"
+"e.czt.z.jaxb.gen.QntExprElementq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001dw\u00fbq\u0000~\u0000\u0010p\u0000sq\u0000~\u0000\f\u0001"
+"dw\u00f0ppsq\u0000~\u0000\u0014\u0001dw\u00e5q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001dw\u00e2q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000"
+"&net.sourceforge.czt.z.jaxb.gen.LetExprq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001dw\u00fbq\u0000~\u0000\u0010p"
+"\u0000sq\u0000~\u0000\f\u0001dw\u00f0ppsq\u0000~\u0000\u0014\u0001dw\u00e5q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001dw\u00e2q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 "
+"sq\u0000~\u0000!t\u0000+net.sourceforge.czt.z.jaxb.gen.Expr2Elementq\u0000~\u0000%sq\u0000"
+"~\u0000\u0000\u0001dw\u00fbq\u0000~\u0000\u0010p\u0000sq\u0000~\u0000\f\u0001dw\u00f0ppsq\u0000~\u0000\u0014\u0001dw\u00e5q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001dw\u00e2q\u0000~\u0000\u0010pq\u0000"
+"~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000+net.sourceforge.czt.z.jaxb.gen.Expr1El"
+"ementq\u0000~\u0000%q\u0000~\u0000 sq\u0000~\u0000\f\u0000mY\u00a4ppsq\u0000~\u0000\u0017\u0000mY\u0099q\u0000~\u0000\u0010pq\u0000~\u0000+sq\u0000~\u0000!q\u0000~\u0000<q"
+"\u0000~\u0000=q\u0000~\u0000 sq\u0000~\u0000!t\u0000\u0006Branchq\u0000~\u0000@sr\u0000\"com.sun.msv.grammar.Express"
+"ionPool\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\bexpTablet\u0000/Lcom/sun/msv/grammar/Express"
+"ionPool$ClosedHash;xpsr\u0000-com.sun.msv.grammar.ExpressionPool$"
+"ClosedHash\u00d7j\u00d0N\u00ef\u00e8\u00ed\u001c\u0002\u0000\u0004I\u0000\u0005countI\u0000\tthresholdL\u0000\u0006parentq\u0000~\u0001s[\u0000\u0005ta"
+"blet\u0000![Lcom/sun/msv/grammar/Expression;xp\u0000\u0000\u0000\u0088\u0000\u0000\u0000\u00e6pur\u0000![Lcom."
+"sun.msv.grammar.Expression;\u00d68D\u00c3]\u00ad\u00a7\n\u0002\u0000\u0000xp\u0000\u0000\u0002\u00ffppppppq\u0000~\u0000\tppppq"
+"\u0000~\u0000bpppppppppppppppppppppppppq\u0000~\u0000epppppppppppppppppppppppppq"
+"\u0000~\u0000hppppppppppppppppppq\u0000~\u0000Ippppppq\u0000~\u0000kpppppppppppppppppppppp"
+"pppq\u0000~\u0000npppppppppppppppppppppppppq\u0000~\u0000qpppppppppppppppppppppp"
+"pppq\u0000~\u0000tppppppppppppq\u0000~\u0000Xppppppq\u0000~\u0000\u0011pppppq\u0000~\u0000wppppppppppppq\u0000"
+"~\u0000[ppq\u0000~\u0000\rpppppppppq\u0000~\u0000zpppq\u0000~\u0001Eq\u0000~\u0001?q\u0000~\u00019q\u0000~\u00013q\u0000~\u0001-q\u0000~\u0001\'q\u0000~"
+"\u0001!q\u0000~\u0001\u001bq\u0000~\u0001\u0015q\u0000~\u0000^q\u0000~\u0001\u000fq\u0000~\u0001Dq\u0000~\u0001>q\u0000~\u00018q\u0000~\u00012q\u0000~\u0001,q\u0000~\u0001&q\u0000~\u0001 q\u0000~"
+"\u0001\u001aq\u0000~\u0001\u0014q\u0000~\u0001\u000eq\u0000~\u0001\bq\u0000~\u0001\tq\u0000~\u0001\u0002q\u0000~\u0001\u0003q\u0000~\u0000\u00fcq\u0000~\u0000\u00fdq\u0000~\u0000\u00f6q\u0000~\u0000\u00f7q\u0000~\u0000\u00f0q\u0000~"
+"\u0000\u00f1q\u0000~\u0000\u00eaq\u0000~\u0000\u00ebq\u0000~\u0000\u00e4q\u0000~\u0000\u00e5q\u0000~\u0000aq\u0000~\u0000\u00deq\u0000~\u0000\u00dfq\u0000~\u0000\u00d8q\u0000~\u0000\u00d9q\u0000~\u0000\u0016q\u0000~\u0000Dq\u0000~"
+"\u0000Lq\u0000~\u0000\u007fq\u0000~\u0000\u0085q\u0000~\u0000\u008bq\u0000~\u0000\u0091q\u0000~\u0000\u0013q\u0000~\u0000Cq\u0000~\u0000Kq\u0000~\u0000~q\u0000~\u0000\u0084q\u0000~\u0000\u008aq\u0000~\u0000\u0090q\u0000~"
+"\u0000\u0096q\u0000~\u0000\u009cq\u0000~\u0000\u00a2q\u0000~\u0000\u00a8q\u0000~\u0000\u00aeq\u0000~\u0000\u00b4q\u0000~\u0000\u00baq\u0000~\u0000dq\u0000~\u0000\u00c0q\u0000~\u0000\u00c6q\u0000~\u0000\u00ccq\u0000~\u0000\u00d2q\u0000~"
+"\u0000\u0097q\u0000~\u0000\u009dq\u0000~\u0000\u00a3q\u0000~\u0000\u00a9q\u0000~\u0000\u00afq\u0000~\u0000\u00b5q\u0000~\u0000\u00bbq\u0000~\u0000\u00c1q\u0000~\u0000\u00c7q\u0000~\u0000\u00cdq\u0000~\u0000\u00d3q\u0000~\u0001Kq\u0000~"
+"\u0001Jq\u0000~\u0001Qq\u0000~\u0001Pq\u0000~\u0001Wq\u0000~\u0001Vq\u0000~\u0001]q\u0000~\u0001\\q\u0000~\u0001cq\u0000~\u0001bq\u0000~\u0000gq\u0000~\u0001iq\u0000~\u0001hq\u0000~"
+"\u0001mppppppppppppppppppppppq\u0000~\u0000jpppq\u0000~\u0000Apppppppppppppppppppppq\u0000"
+"~\u0000mpppppppppppppppppppppppppq\u0000~\u0000ppppppppppppppppppppppppppq\u0000"
+"~\u0000sppppppppppppq\u0000~\u0000Wppppppppppppq\u0000~\u0000vppppppppppppq\u0000~\u0000Zpppppp"
+"ppppppq\u0000~\u0000yppppppppppq\u0000~\u0000\npq\u0000~\u0000]ppppppppppppq\u0000~\u0000|ppppppppppp"
+"pq\u0000~\u0000`pppppppppppppppppppppppppq\u0000~\u0000cppppppppppppppppppppppq\u0000"
+"~\u0000\u000bppq\u0000~\u0000fpppppppppppppppppppppppppq\u0000~\u0000ipppppppppppppppq\u0000~\u0000P"
+"pppppppppq\u0000~\u0000lpppppppppppppppppppppppppq\u0000~\u0000opppppppppppppppp"
+"pppppppppq\u0000~\u0000rppppppppppppq\u0000~\u0000Vppppppppppq\u0000~\u0000Upq\u0000~\u0000upppppppp"
+"ppppq\u0000~\u0000Ypppq\u0000~\u0000&ppppppppq\u0000~\u0000xppppppppppppq\u0000~\u0000\\ppppppppppppq"
+"\u0000~\u0000{ppppppppppppq\u0000~\u0000_pppppppppppppp"));
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
            return net.sourceforge.czt.z.jaxb.gen.impl.BranchElementImpl.this;
        }

        public void enterElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname, org.xml.sax.Attributes __atts)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  1 :
                        if (("Anns" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.z.jaxb.gen.impl.BranchImpl)net.sourceforge.czt.z.jaxb.gen.impl.BranchElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("DeclName" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.z.jaxb.gen.impl.BranchImpl)net.sourceforge.czt.z.jaxb.gen.impl.BranchElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("DeclName" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.z.jaxb.gen.impl.BranchImpl)net.sourceforge.czt.z.jaxb.gen.impl.BranchElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        spawnHandlerFromEnterElement((((net.sourceforge.czt.z.jaxb.gen.impl.BranchImpl)net.sourceforge.czt.z.jaxb.gen.impl.BranchElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                        return ;
                    case  0 :
                        if (("Branch" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 1;
                            return ;
                        }
                        break;
                    case  3 :
                        revertToParentFromEnterElement(___uri, ___local, ___qname, __atts);
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
                        if (("Branch" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            context.popAttributes();
                            state = 3;
                            return ;
                        }
                        break;
                    case  1 :
                        spawnHandlerFromLeaveElement((((net.sourceforge.czt.z.jaxb.gen.impl.BranchImpl)net.sourceforge.czt.z.jaxb.gen.impl.BranchElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
                        return ;
                    case  3 :
                        revertToParentFromLeaveElement(___uri, ___local, ___qname);
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
                    case  1 :
                        spawnHandlerFromEnterAttribute((((net.sourceforge.czt.z.jaxb.gen.impl.BranchImpl)net.sourceforge.czt.z.jaxb.gen.impl.BranchElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
                        return ;
                    case  3 :
                        revertToParentFromEnterAttribute(___uri, ___local, ___qname);
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
                    case  1 :
                        spawnHandlerFromLeaveAttribute((((net.sourceforge.czt.z.jaxb.gen.impl.BranchImpl)net.sourceforge.czt.z.jaxb.gen.impl.BranchElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
                        return ;
                    case  3 :
                        revertToParentFromLeaveAttribute(___uri, ___local, ___qname);
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
                        case  1 :
                            spawnHandlerFromText((((net.sourceforge.czt.z.jaxb.gen.impl.BranchImpl)net.sourceforge.czt.z.jaxb.gen.impl.BranchElementImpl.this).new Unmarshaller(context)), 2, value);
                            return ;
                        case  3 :
                            revertToParentFromText(value);
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
