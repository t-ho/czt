//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.2-b15-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2004.01.06 at 09:18:18 NZDT 
//


package net.sourceforge.czt.oz.jaxb.gen.impl;

public class AssoParallelOpExprImpl
    extends net.sourceforge.czt.oz.jaxb.gen.impl.TwoOpExprImpl
    implements net.sourceforge.czt.oz.jaxb.gen.AssoParallelOpExpr, com.sun.xml.bind.RIElement, com.sun.xml.bind.JAXBObject, net.sourceforge.czt.oz.jaxb.gen.impl.runtime.UnmarshallableObject, net.sourceforge.czt.oz.jaxb.gen.impl.runtime.XMLSerializable, net.sourceforge.czt.oz.jaxb.gen.impl.runtime.ValidatableObject
{

    public final static java.lang.Class version = (net.sourceforge.czt.oz.jaxb.gen.impl.JAXBVersion.class);
    private static com.sun.msv.grammar.Grammar schemaFragment;

    private final static java.lang.Class PRIMARY_INTERFACE_CLASS() {
        return (net.sourceforge.czt.oz.jaxb.gen.AssoParallelOpExpr.class);
    }

    public java.lang.String ____jaxb_ri____getNamespaceURI() {
        return "http://czt.sourceforge.net/object-z";
    }

    public java.lang.String ____jaxb_ri____getLocalName() {
        return "AssoParallelOpExpr";
    }

    public net.sourceforge.czt.oz.jaxb.gen.impl.runtime.UnmarshallingEventHandler createUnmarshaller(net.sourceforge.czt.oz.jaxb.gen.impl.runtime.UnmarshallingContext context) {
        return new net.sourceforge.czt.oz.jaxb.gen.impl.AssoParallelOpExprImpl.Unmarshaller(context);
    }

    public void serializeBody(net.sourceforge.czt.oz.jaxb.gen.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        context.startElement("http://czt.sourceforge.net/object-z", "AssoParallelOpExpr");
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
        return (net.sourceforge.czt.oz.jaxb.gen.AssoParallelOpExpr.class);
    }

    public com.sun.msv.verifier.DocumentDeclaration createRawValidator() {
        if (schemaFragment == null) {
            schemaFragment = com.sun.xml.bind.validator.SchemaDeserializer.deserialize((
 "\u00ac\u00ed\u0000\u0005sr\u0000\'com.sun.msv.grammar.trex.ElementPattern\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000"
+"\tnameClasst\u0000\u001fLcom/sun/msv/grammar/NameClass;xr\u0000\u001ecom.sun.msv."
+"grammar.ElementExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002Z\u0000\u001aignoreUndeclaredAttributesL\u0000"
+"\fcontentModelt\u0000 Lcom/sun/msv/grammar/Expression;xr\u0000\u001ecom.sun."
+"msv.grammar.Expression\u00f8\u0018\u0082\u00e8N5~O\u0002\u0000\u0003I\u0000\u000ecachedHashCodeL\u0000\u0013epsilon"
+"Reducibilityt\u0000\u0013Ljava/lang/Boolean;L\u0000\u000bexpandedExpq\u0000~\u0000\u0003xp**W\u00dbp"
+"p\u0000sr\u0000\u001fcom.sun.msv.grammar.SequenceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun."
+"msv.grammar.BinaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0004exp1q\u0000~\u0000\u0003L\u0000\u0004exp2q\u0000~\u0000\u0003xq\u0000~"
+"\u0000\u0004**W\u00d0ppsq\u0000~\u0000\u0007(\u00d1\u00a1\u00aeppsq\u0000~\u0000\u0007\u0015S\u0011\u00d5ppsr\u0000\u001dcom.sun.msv.grammar.Choi"
+"ceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\b\u0001\u00d4\u0081\u00fcppsq\u0000~\u0000\u0000\u0001\u00d4\u0081\u00f1sr\u0000\u0011java.lang.Boolean\u00cd"
+" r\u0080\u00d5\u009c\u00fa\u00ee\u0002\u0000\u0001Z\u0000\u0005valuexp\u0000p\u0000sq\u0000~\u0000\u0007\u0001\u00d4\u0081\u00e6ppsq\u0000~\u0000\u0000\u0001dw\u00fbpp\u0000sq\u0000~\u0000\f\u0001dw\u00f0pp"
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
+"dummy-elementssq\u0000~\u0000\f\u0000p\t\u00e6ppsq\u0000~\u0000\u0017\u0000p\t\u00dbq\u0000~\u0000\u0010psr\u0000\u001bcom.sun.msv.gr"
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
+"\f\u0013~\u008f\u00d4ppsq\u0000~\u0000\f\u0012\u001a\u0017\u00d7ppsq\u0000~\u0000\f\u0010\u00b5\u009f\u00dappsq\u0000~\u0000\f\u000fQ\'\u00ddppsq\u0000~\u0000\f\r\u00ec\u00af\u00e0ppsq\u0000~\u0000"
+"\f\f\u00887\u00e3ppsq\u0000~\u0000\f\u000b#\u00bf\u00e6ppsq\u0000~\u0000\f\t\u00bfG\u00e9ppsq\u0000~\u0000\f\bZ\u00cf\u00ecppsq\u0000~\u0000\f\u0006\u00f6W\u00efppsq\u0000~\u0000"
+"\f\u0005\u0091\u00df\u00f2ppsq\u0000~\u0000\f\u0004-g\u00f5ppsq\u0000~\u0000\f\u0002\u00c8\u00ef\u00f8ppsq\u0000~\u0000\u0000\u0001dw\u00fbpp\u0000sq\u0000~\u0000\f\u0001dw\u00f0ppsq\u0000~"
+"\u0000\u0014\u0001dw\u00e5q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001dw\u00e2q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u00003net.sour"
+"ceforge.czt.oz.jaxb.gen.RenameOpExprElementq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001dw\u00fbpp"
+"\u0000sq\u0000~\u0000\f\u0001dw\u00f0ppsq\u0000~\u0000\u0014\u0001dw\u00e5q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001dw\u00e2q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 "
+"sq\u0000~\u0000!t\u00001net.sourceforge.czt.oz.jaxb.gen.ScopeEnrichOpExprq\u0000"
+"~\u0000%sq\u0000~\u0000\u0000\u0001dw\u00fbpp\u0000sq\u0000~\u0000\f\u0001dw\u00f0ppsq\u0000~\u0000\u0014\u0001dw\u00e5q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001dw\u00e2q\u0000~\u0000\u0010p"
+"q\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000)net.sourceforge.czt.oz.jaxb.gen.SeqO"
+"pExprq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001dw\u00fbpp\u0000sq\u0000~\u0000\f\u0001dw\u00f0ppsq\u0000~\u0000\u0014\u0001dw\u00e5q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001dw"
+"\u00e2q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u00002net.sourceforge.czt.oz.jaxb.g"
+"en.AssoParallelOpExprq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001dw\u00fbpp\u0000sq\u0000~\u0000\f\u0001dw\u00f0ppsq\u0000~\u0000\u0014\u0001dw"
+"\u00e5q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001dw\u00e2q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000.net.sourcefor"
+"ge.czt.oz.jaxb.gen.ParallelOpExprq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001dw\u00fbpp\u0000sq\u0000~\u0000\f\u0001dw"
+"\u00f0ppsq\u0000~\u0000\u0014\u0001dw\u00e5q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001dw\u00e2q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000.n"
+"et.sourceforge.czt.oz.jaxb.gen.DistConjOpExprq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001dw\u00fb"
+"pp\u0000sq\u0000~\u0000\f\u0001dw\u00f0ppsq\u0000~\u0000\u0014\u0001dw\u00e5q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001dw\u00e2q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~"
+"\u0000 sq\u0000~\u0000!t\u00006net.sourceforge.czt.oz.jaxb.gen.OpPromotionExprEl"
+"ementq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001dw\u00fbpp\u0000sq\u0000~\u0000\f\u0001dw\u00f0ppsq\u0000~\u0000\u0014\u0001dw\u00e5q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001dw"
+"\u00e2q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u00002net.sourceforge.czt.oz.jaxb.g"
+"en.BasicOpExprElementq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001dw\u00fbpp\u0000sq\u0000~\u0000\f\u0001dw\u00f0ppsq\u0000~\u0000\u0014\u0001dw"
+"\u00e5q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001dw\u00e2q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000-net.sourcefor"
+"ge.czt.oz.jaxb.gen.DistSeqOpExprq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001dw\u00fbpp\u0000sq\u0000~\u0000\f\u0001dw\u00f0"
+"ppsq\u0000~\u0000\u0014\u0001dw\u00e5q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001dw\u00e2q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u00001ne"
+"t.sourceforge.czt.oz.jaxb.gen.HideOpExprElementq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001d"
+"w\u00fbpp\u0000sq\u0000~\u0000\f\u0001dw\u00f0ppsq\u0000~\u0000\u0014\u0001dw\u00e5q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001dw\u00e2q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq"
+"\u0000~\u0000 sq\u0000~\u0000!t\u0000+net.sourceforge.czt.oz.jaxb.gen.ParenOpExprq\u0000~\u0000"
+"%sq\u0000~\u0000\u0000\u0001dw\u00fbpp\u0000sq\u0000~\u0000\f\u0001dw\u00f0ppsq\u0000~\u0000\u0014\u0001dw\u00e5q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001dw\u00e2q\u0000~\u0000\u0010pq\u0000"
+"~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u00000net.sourceforge.czt.oz.jaxb.gen.DistCh"
+"oiceOpExprq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001dw\u00fbpp\u0000sq\u0000~\u0000\f\u0001dw\u00f0ppsq\u0000~\u0000\u0014\u0001dw\u00e5q\u0000~\u0000\u0010psq\u0000~"
+"\u0000\u0017\u0001dw\u00e2q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000.net.sourceforge.czt.oz.j"
+"axb.gen.ExChoiceOpExprq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001dw\u00fbpp\u0000sq\u0000~\u0000\f\u0001dw\u00f0ppsq\u0000~\u0000\u0014\u0001d"
+"w\u00e5q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001dw\u00e2q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000*net.sourcefo"
+"rge.czt.oz.jaxb.gen.ConjOpExprq\u0000~\u0000%sq\u0000~\u0000\f\u0013~\u008f\u00d4ppsq\u0000~\u0000\f\u0012\u001a\u0017\u00d7pps"
+"q\u0000~\u0000\f\u0010\u00b5\u009f\u00dappsq\u0000~\u0000\f\u000fQ\'\u00ddppsq\u0000~\u0000\f\r\u00ec\u00af\u00e0ppsq\u0000~\u0000\f\f\u00887\u00e3ppsq\u0000~\u0000\f\u000b#\u00bf\u00e6pps"
+"q\u0000~\u0000\f\t\u00bfG\u00e9ppsq\u0000~\u0000\f\bZ\u00cf\u00ecppsq\u0000~\u0000\f\u0006\u00f6W\u00efppsq\u0000~\u0000\f\u0005\u0091\u00df\u00f2ppsq\u0000~\u0000\f\u0004-g\u00f5pps"
+"q\u0000~\u0000\f\u0002\u00c8\u00ef\u00f8ppsq\u0000~\u0000\u0000\u0001dw\u00fbpp\u0000sq\u0000~\u0000\f\u0001dw\u00f0ppsq\u0000~\u0000\u0014\u0001dw\u00e5q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001d"
+"w\u00e2q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!q\u0000~\u0000Sq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001dw\u00fbpp\u0000sq\u0000~\u0000\f\u0001d"
+"w\u00f0ppsq\u0000~\u0000\u0014\u0001dw\u00e5q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001dw\u00e2q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!q\u0000~"
+"\u0000Yq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001dw\u00fbpp\u0000sq\u0000~\u0000\f\u0001dw\u00f0ppsq\u0000~\u0000\u0014\u0001dw\u00e5q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001dw\u00e2q\u0000"
+"~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!q\u0000~\u0000_q\u0000~\u0000%sq\u0000~\u0000\u0000\u0001dw\u00fbpp\u0000sq\u0000~\u0000\f\u0001dw\u00f0pp"
+"sq\u0000~\u0000\u0014\u0001dw\u00e5q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001dw\u00e2q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!q\u0000~\u0000eq\u0000"
+"~\u0000%sq\u0000~\u0000\u0000\u0001dw\u00fbpp\u0000sq\u0000~\u0000\f\u0001dw\u00f0ppsq\u0000~\u0000\u0014\u0001dw\u00e5q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001dw\u00e2q\u0000~\u0000\u0010p"
+"q\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!q\u0000~\u0000kq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001dw\u00fbpp\u0000sq\u0000~\u0000\f\u0001dw\u00f0ppsq\u0000~"
+"\u0000\u0014\u0001dw\u00e5q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001dw\u00e2q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!q\u0000~\u0000qq\u0000~\u0000%s"
+"q\u0000~\u0000\u0000\u0001dw\u00fbpp\u0000sq\u0000~\u0000\f\u0001dw\u00f0ppsq\u0000~\u0000\u0014\u0001dw\u00e5q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001dw\u00e2q\u0000~\u0000\u0010pq\u0000~\u0000"
+"\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!q\u0000~\u0000wq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001dw\u00fbpp\u0000sq\u0000~\u0000\f\u0001dw\u00f0ppsq\u0000~\u0000\u0014\u0001d"
+"w\u00e5q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001dw\u00e2q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!q\u0000~\u0000}q\u0000~\u0000%sq\u0000~\u0000"
+"\u0000\u0001dw\u00fbpp\u0000sq\u0000~\u0000\f\u0001dw\u00f0ppsq\u0000~\u0000\u0014\u0001dw\u00e5q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001dw\u00e2q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~"
+"\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!q\u0000~\u0000\u0083q\u0000~\u0000%sq\u0000~\u0000\u0000\u0001dw\u00fbpp\u0000sq\u0000~\u0000\f\u0001dw\u00f0ppsq\u0000~\u0000\u0014\u0001dw\u00e5q\u0000"
+"~\u0000\u0010psq\u0000~\u0000\u0017\u0001dw\u00e2q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!q\u0000~\u0000\u0089q\u0000~\u0000%sq\u0000~\u0000\u0000\u0001dw"
+"\u00fbpp\u0000sq\u0000~\u0000\f\u0001dw\u00f0ppsq\u0000~\u0000\u0014\u0001dw\u00e5q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001dw\u00e2q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000"
+"~\u0000 sq\u0000~\u0000!q\u0000~\u0000\u008fq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001dw\u00fbpp\u0000sq\u0000~\u0000\f\u0001dw\u00f0ppsq\u0000~\u0000\u0014\u0001dw\u00e5q\u0000~\u0000\u0010p"
+"sq\u0000~\u0000\u0017\u0001dw\u00e2q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!q\u0000~\u0000\u0095q\u0000~\u0000%sq\u0000~\u0000\u0000\u0001dw\u00fbpp\u0000"
+"sq\u0000~\u0000\f\u0001dw\u00f0ppsq\u0000~\u0000\u0014\u0001dw\u00e5q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001dw\u00e2q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 s"
+"q\u0000~\u0000!q\u0000~\u0000\u009bq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001dw\u00fbpp\u0000sq\u0000~\u0000\f\u0001dw\u00f0ppsq\u0000~\u0000\u0014\u0001dw\u00e5q\u0000~\u0000\u0010psq\u0000~"
+"\u0000\u0017\u0001dw\u00e2q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!q\u0000~\u0000\u00a1q\u0000~\u0000%sq\u0000~\u0000\f\u0001X\u00b6\u001dppsq\u0000~\u0000"
+"\u0017\u0001X\u00b6\u0012q\u0000~\u0000\u0010pq\u0000~\u0000+sq\u0000~\u0000!q\u0000~\u0000<q\u0000~\u0000=q\u0000~\u0000 sq\u0000~\u0000!t\u0000\u0012AssoParallelOp"
+"Exprt\u0000#http://czt.sourceforge.net/object-zsr\u0000\"com.sun.msv.gr"
+"ammar.ExpressionPool\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\bexpTablet\u0000/Lcom/sun/msv/gr"
+"ammar/ExpressionPool$ClosedHash;xpsr\u0000-com.sun.msv.grammar.Ex"
+"pressionPool$ClosedHash\u00d7j\u00d0N\u00ef\u00e8\u00ed\u001c\u0002\u0000\u0004I\u0000\u0005countI\u0000\tthresholdL\u0000\u0006par"
+"entq\u0000~\u0000\u00fc[\u0000\u0005tablet\u0000![Lcom/sun/msv/grammar/Expression;xp\u0000\u0000\u0000[\u0000\u0000"
+"\u0000rpur\u0000![Lcom.sun.msv.grammar.Expression;\u00d68D\u00c3]\u00ad\u00a7\n\u0002\u0000\u0000xp\u0000\u0000\u0001\u007fppp"
+"ppq\u0000~\u0000Iq\u0000~\u0000\u00aapppppq\u0000~\u0000Cq\u0000~\u0000\u00a4pppppppppppppppppppppppppppq\u0000~\u0000\u00c0q"
+"\u0000~\u0000\u00bbq\u0000~\u0000\u00b6q\u0000~\u0000\u00b1q\u0000~\u0000\u009eq\u0000~\u0000\u0098q\u0000~\u0000\u0092q\u0000~\u0000\u008cq\u0000~\u0000\u0086q\u0000~\u0000\u0080q\u0000~\u0000zq\u0000~\u0000\u00bfq\u0000~\u0000\u00baq"
+"\u0000~\u0000\u00b5q\u0000~\u0000\u00b0q\u0000~\u0000\u009dq\u0000~\u0000\u0097q\u0000~\u0000\u0091q\u0000~\u0000\u008bq\u0000~\u0000\u0085q\u0000~\u0000\u007fq\u0000~\u0000yq\u0000~\u0000sq\u0000~\u0000mq\u0000~\u0000gq"
+"\u0000~\u0000aq\u0000~\u0000[q\u0000~\u0000Uq\u0000~\u0000Oq\u0000~\u0000Hq\u0000~\u0000\u0013q\u0000~\u0000tq\u0000~\u0000&q\u0000~\u0000nq\u0000~\u0000hq\u0000~\u0000bq\u0000~\u0000Bq"
+"\u0000~\u0000\\q\u0000~\u0000Vq\u0000~\u0000Pq\u0000~\u0000\u0016q\u0000~\u0000\u00c5q\u0000~\u0000\u00c4q\u0000~\u0000\u00caq\u0000~\u0000\u00c9q\u0000~\u0000\u00cfq\u0000~\u0000\u00ceq\u0000~\u0000\u00a9q\u0000~\u0000\u00d4q"
+"\u0000~\u0000\u00d3q\u0000~\u0000\u00d9q\u0000~\u0000\u00d8q\u0000~\u0000\u00deq\u0000~\u0000\u00ddq\u0000~\u0000\u00e3q\u0000~\u0000\u00e2q\u0000~\u0000\u00e8q\u0000~\u0000\u00e7q\u0000~\u0000\u00edq\u0000~\u0000\u00ecq\u0000~\u0000\u00a3q"
+"\u0000~\u0000\u00f2q\u0000~\u0000\u00f1q\u0000~\u0000\npppppppppppppppppppppppq\u0000~\u0000\u00aeq\u0000~\u0000Mpppq\u0000~\u0000\u00f5pq\u0000~\u0000"
+"Gq\u0000~\u0000\u00a8ppppq\u0000~\u0000\u0011q\u0000~\u0000Aq\u0000~\u0000\u00a2pppppppppppppppppppq\u0000~\u0000\rppppppppppp"
+"ppppppppppppppppppq\u0000~\u0000\u00adq\u0000~\u0000Lpppppq\u0000~\u0000Fq\u0000~\u0000\u00a7ppppppppppq\u0000~\u0000\tpp"
+"pppppppppppppppppppppppppppppppppppppppppppq\u0000~\u0000Kq\u0000~\u0000\u00acpppppq\u0000"
+"~\u0000Eq\u0000~\u0000\u00a6pppppppppppppppppppppppppppppppppppppppppppq\u0000~\u0000\u000bpppp"
+"ppppppppq\u0000~\u0000Jq\u0000~\u0000\u00abpppppq\u0000~\u0000Dq\u0000~\u0000\u00a5ppppppppppppppppppppppppppp"
+"pppppppppppppppppppppppp"));
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
            return net.sourceforge.czt.oz.jaxb.gen.impl.AssoParallelOpExprImpl.this;
        }

        public void enterElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname, org.xml.sax.Attributes __atts)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  0 :
                        if (("AssoParallelOpExpr" == ___local)&&("http://czt.sourceforge.net/object-z" == ___uri)) {
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
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.oz.jaxb.gen.impl.TwoOpExprImpl)net.sourceforge.czt.oz.jaxb.gen.impl.AssoParallelOpExprImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("RenameOpExpr" == ___local)&&("http://czt.sourceforge.net/object-z" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.oz.jaxb.gen.impl.TwoOpExprImpl)net.sourceforge.czt.oz.jaxb.gen.impl.AssoParallelOpExprImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("ScopeEnrichOpExpr" == ___local)&&("http://czt.sourceforge.net/object-z" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.oz.jaxb.gen.impl.TwoOpExprImpl)net.sourceforge.czt.oz.jaxb.gen.impl.AssoParallelOpExprImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("SeqOpExpr" == ___local)&&("http://czt.sourceforge.net/object-z" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.oz.jaxb.gen.impl.TwoOpExprImpl)net.sourceforge.czt.oz.jaxb.gen.impl.AssoParallelOpExprImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("AssoParallelOpExpr" == ___local)&&("http://czt.sourceforge.net/object-z" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.oz.jaxb.gen.impl.TwoOpExprImpl)net.sourceforge.czt.oz.jaxb.gen.impl.AssoParallelOpExprImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("ParallelOpExpr" == ___local)&&("http://czt.sourceforge.net/object-z" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.oz.jaxb.gen.impl.TwoOpExprImpl)net.sourceforge.czt.oz.jaxb.gen.impl.AssoParallelOpExprImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("DistConjOpExpr" == ___local)&&("http://czt.sourceforge.net/object-z" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.oz.jaxb.gen.impl.TwoOpExprImpl)net.sourceforge.czt.oz.jaxb.gen.impl.AssoParallelOpExprImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("OpPromotionExpr" == ___local)&&("http://czt.sourceforge.net/object-z" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.oz.jaxb.gen.impl.TwoOpExprImpl)net.sourceforge.czt.oz.jaxb.gen.impl.AssoParallelOpExprImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("BasicOpExpr" == ___local)&&("http://czt.sourceforge.net/object-z" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.oz.jaxb.gen.impl.TwoOpExprImpl)net.sourceforge.czt.oz.jaxb.gen.impl.AssoParallelOpExprImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("DistSeqOpExpr" == ___local)&&("http://czt.sourceforge.net/object-z" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.oz.jaxb.gen.impl.TwoOpExprImpl)net.sourceforge.czt.oz.jaxb.gen.impl.AssoParallelOpExprImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("HideOpExpr" == ___local)&&("http://czt.sourceforge.net/object-z" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.oz.jaxb.gen.impl.TwoOpExprImpl)net.sourceforge.czt.oz.jaxb.gen.impl.AssoParallelOpExprImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("ParenOpExpr" == ___local)&&("http://czt.sourceforge.net/object-z" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.oz.jaxb.gen.impl.TwoOpExprImpl)net.sourceforge.czt.oz.jaxb.gen.impl.AssoParallelOpExprImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("DistChoiceOpExpr" == ___local)&&("http://czt.sourceforge.net/object-z" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.oz.jaxb.gen.impl.TwoOpExprImpl)net.sourceforge.czt.oz.jaxb.gen.impl.AssoParallelOpExprImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("ExChoiceOpExpr" == ___local)&&("http://czt.sourceforge.net/object-z" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.oz.jaxb.gen.impl.TwoOpExprImpl)net.sourceforge.czt.oz.jaxb.gen.impl.AssoParallelOpExprImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("ConjOpExpr" == ___local)&&("http://czt.sourceforge.net/object-z" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.oz.jaxb.gen.impl.TwoOpExprImpl)net.sourceforge.czt.oz.jaxb.gen.impl.AssoParallelOpExprImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("OperationExpr" == ___local)&&("http://czt.sourceforge.net/object-z" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.oz.jaxb.gen.impl.TwoOpExprImpl)net.sourceforge.czt.oz.jaxb.gen.impl.AssoParallelOpExprImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("OperationExpr" == ___local)&&("http://czt.sourceforge.net/object-z" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.oz.jaxb.gen.impl.TwoOpExprImpl)net.sourceforge.czt.oz.jaxb.gen.impl.AssoParallelOpExprImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        spawnHandlerFromEnterElement((((net.sourceforge.czt.oz.jaxb.gen.impl.TwoOpExprImpl)net.sourceforge.czt.oz.jaxb.gen.impl.AssoParallelOpExprImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
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
                        if (("AssoParallelOpExpr" == ___local)&&("http://czt.sourceforge.net/object-z" == ___uri)) {
                            context.popAttributes();
                            state = 3;
                            return ;
                        }
                        break;
                    case  1 :
                        spawnHandlerFromLeaveElement((((net.sourceforge.czt.oz.jaxb.gen.impl.TwoOpExprImpl)net.sourceforge.czt.oz.jaxb.gen.impl.AssoParallelOpExprImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
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
                        spawnHandlerFromEnterAttribute((((net.sourceforge.czt.oz.jaxb.gen.impl.TwoOpExprImpl)net.sourceforge.czt.oz.jaxb.gen.impl.AssoParallelOpExprImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
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
                        spawnHandlerFromLeaveAttribute((((net.sourceforge.czt.oz.jaxb.gen.impl.TwoOpExprImpl)net.sourceforge.czt.oz.jaxb.gen.impl.AssoParallelOpExprImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
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
                            spawnHandlerFromText((((net.sourceforge.czt.oz.jaxb.gen.impl.TwoOpExprImpl)net.sourceforge.czt.oz.jaxb.gen.impl.AssoParallelOpExprImpl.this).new Unmarshaller(context)), 2, value);
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
