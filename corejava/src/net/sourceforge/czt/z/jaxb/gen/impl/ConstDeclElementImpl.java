//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.2-b15-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2004.01.29 at 12:59:34 NZDT 
//


package net.sourceforge.czt.z.jaxb.gen.impl;

public class ConstDeclElementImpl
    extends net.sourceforge.czt.z.jaxb.gen.impl.ConstDeclImpl
    implements net.sourceforge.czt.z.jaxb.gen.ConstDeclElement, com.sun.xml.bind.RIElement, com.sun.xml.bind.JAXBObject, net.sourceforge.czt.oz.jaxb.gen.impl.runtime.UnmarshallableObject, net.sourceforge.czt.oz.jaxb.gen.impl.runtime.XMLSerializable, net.sourceforge.czt.oz.jaxb.gen.impl.runtime.ValidatableObject
{

    public final static java.lang.Class version = (net.sourceforge.czt.z.jaxb.gen.impl.JAXBVersion.class);
    private static com.sun.msv.grammar.Grammar schemaFragment;

    private final static java.lang.Class PRIMARY_INTERFACE_CLASS() {
        return (net.sourceforge.czt.z.jaxb.gen.ConstDeclElement.class);
    }

    public java.lang.String ____jaxb_ri____getNamespaceURI() {
        return "http://czt.sourceforge.net/zml";
    }

    public java.lang.String ____jaxb_ri____getLocalName() {
        return "ConstDecl";
    }

    public net.sourceforge.czt.oz.jaxb.gen.impl.runtime.UnmarshallingEventHandler createUnmarshaller(net.sourceforge.czt.oz.jaxb.gen.impl.runtime.UnmarshallingContext context) {
        return new net.sourceforge.czt.z.jaxb.gen.impl.ConstDeclElementImpl.Unmarshaller(context);
    }

    public void serializeBody(net.sourceforge.czt.oz.jaxb.gen.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        context.startElement("http://czt.sourceforge.net/zml", "ConstDecl");
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
        return (net.sourceforge.czt.z.jaxb.gen.ConstDeclElement.class);
    }

    public com.sun.msv.verifier.DocumentDeclaration createRawValidator() {
        if (schemaFragment == null) {
            schemaFragment = com.sun.xml.bind.validator.SchemaDeserializer.deserialize((
 "\u00ac\u00ed\u0000\u0005sr\u0000\'com.sun.msv.grammar.trex.ElementPattern\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000"
+"\tnameClasst\u0000\u001fLcom/sun/msv/grammar/NameClass;xr\u0000\u001ecom.sun.msv."
+"grammar.ElementExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002Z\u0000\u001aignoreUndeclaredAttributesL\u0000"
+"\fcontentModelt\u0000 Lcom/sun/msv/grammar/Expression;xr\u0000\u001ecom.sun."
+"msv.grammar.Expression\u00f8\u0018\u0082\u00e8N5~O\u0002\u0000\u0003I\u0000\u000ecachedHashCodeL\u0000\u0013epsilon"
+"Reducibilityt\u0000\u0013Ljava/lang/Boolean;L\u0000\u000bexpandedExpq\u0000~\u0000\u0003xp_\u0007\u00d6\u00f3p"
+"p\u0000sr\u0000\u001fcom.sun.msv.grammar.SequenceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun."
+"msv.grammar.BinaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0004exp1q\u0000~\u0000\u0003L\u0000\u0004exp2q\u0000~\u0000\u0003xq\u0000~"
+"\u0000\u0004_\u0007\u00d6\u00e8ppsq\u0000~\u0000\u0007\\S2Bppsq\u0000~\u0000\u0007\ru\u00a2\u0097ppsr\u0000\u001dcom.sun.msv.grammar.Choi"
+"ceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\b\u0005\u00a2\u00ea\u00e9ppsq\u0000~\u0000\u0000\u0005\u00a2\u00ea\u00desr\u0000\u0011java.lang.Boolean\u00cd"
+" r\u0080\u00d5\u009c\u00fa\u00ee\u0002\u0000\u0001Z\u0000\u0005valuexp\u0000p\u0000sq\u0000~\u0000\u0007\u0005\u00a2\u00ea\u00d3ppsq\u0000~\u0000\u0000\u0001\u00f8\u00bd/pp\u0000sq\u0000~\u0000\f\u0001\u00f8\u00bd$pp"
+"sr\u0000 com.sun.msv.grammar.OneOrMoreExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001ccom.sun.m"
+"sv.grammar.UnaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\u0003expq\u0000~\u0000\u0003xq\u0000~\u0000\u0004\u0001\u00f8\u00bd\u0019q\u0000~\u0000\u0010psr\u0000"
+" com.sun.msv.grammar.AttributeExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003expq\u0000~\u0000\u0003L\u0000\tna"
+"meClassq\u0000~\u0000\u0001xq\u0000~\u0000\u0004\u0001\u00f8\u00bd\u0016q\u0000~\u0000\u0010psr\u00002com.sun.msv.grammar.Expressi"
+"on$AnyStringExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004\u0000\u0000\u0000\bsq\u0000~\u0000\u000f\u0001q\u0000~\u0000\u001asr\u0000 c"
+"om.sun.msv.grammar.AnyNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun.msv.gr"
+"ammar.NameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com.sun.msv.grammar.Expressi"
+"on$EpsilonExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004\u0000\u0000\u0000\tq\u0000~\u0000\u001bq\u0000~\u0000 sr\u0000#com.s"
+"un.msv.grammar.SimpleNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\tlocalNamet\u0000\u0012Ljav"
+"a/lang/String;L\u0000\fnamespaceURIq\u0000~\u0000\"xq\u0000~\u0000\u001dt\u0000-net.sourceforge.c"
+"zt.z.jaxb.gen.TermA.AnnsTypet\u0000+http://java.sun.com/jaxb/xjc/"
+"dummy-elementssq\u0000~\u0000\f\u0003\u00aa-\u009fppsq\u0000~\u0000\u0017\u0003\u00aa-\u0094q\u0000~\u0000\u0010psr\u0000\u001bcom.sun.msv.gr"
+"ammar.DataExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\u0002dtt\u0000\u001fLorg/relaxng/datatype/Dataty"
+"pe;L\u0000\u0006exceptq\u0000~\u0000\u0003L\u0000\u0004namet\u0000\u001dLcom/sun/msv/util/StringPair;xq\u0000~"
+"\u0000\u0004\u0001\u00eb\u0090]ppsr\u0000\"com.sun.msv.datatype.xsd.QnameType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000"
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
+"\f\u0007\u00d2\u00b7\u00a9ppsq\u0000~\u0000\u0000\u0001\u00f8\u00bd/pp\u0000sq\u0000~\u0000\f\u0001\u00f8\u00bd$ppsq\u0000~\u0000\u0014\u0001\u00f8\u00bd\u0019q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001\u00f8\u00bd\u0016q\u0000"
+"~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000.net.sourceforge.czt.z.jaxb.gen.D"
+"eclNameElementq\u0000~\u0000%sq\u0000~\u0000\u0000\u0005\u00d9\u00faxpp\u0000sq\u0000~\u0000\u0007\u0005\u00d9\u00famppsq\u0000~\u0000\u0000\u0001\u00f8\u00bd/pp\u0000sq\u0000"
+"~\u0000\f\u0001\u00f8\u00bd$ppsq\u0000~\u0000\u0014\u0001\u00f8\u00bd\u0019q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001\u00f8\u00bd\u0016q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~"
+"\u0000!t\u0000\'net.sourceforge.czt.z.jaxb.gen.DeclNameq\u0000~\u0000%sq\u0000~\u0000\f\u0003\u00e1=9p"
+"psq\u0000~\u0000\u0017\u0003\u00e1=.q\u0000~\u0000\u0010pq\u0000~\u0000+sq\u0000~\u0000!q\u0000~\u0000<q\u0000~\u0000=q\u0000~\u0000 sq\u0000~\u0000!t\u0000\bDeclName"
+"q\u0000~\u0000@sq\u0000~\u0000\fN\u00dd\u008f\u00a6ppsq\u0000~\u0000\fL\u00e4\u00d2uppsq\u0000~\u0000\fJ\u00ec\u0015Dppsq\u0000~\u0000\fH\u00f3X\u0013ppsq\u0000~\u0000\fF"
+"\u00fa\u009a\u00e2ppsq\u0000~\u0000\fE\u0001\u00dd\u00b1ppsq\u0000~\u0000\fC\t \u0080ppsq\u0000~\u0000\fA\u0010cOppsq\u0000~\u0000\f?\u0017\u00a6\u001eppsq\u0000~\u0000\f="
+"\u001e\u00e8\u00edppsq\u0000~\u0000\f;&+\u00bcppsq\u0000~\u0000\f9-n\u008bppsq\u0000~\u0000\f74\u00b1Zppsq\u0000~\u0000\f5;\u00f4)ppsq\u0000~\u0000\f3"
+"C6\u00f8ppsq\u0000~\u0000\f1Jy\u00c7ppsq\u0000~\u0000\f/Q\u00bc\u0096ppsq\u0000~\u0000\f-X\u00ffeppsq\u0000~\u0000\f+`B4ppsq\u0000~\u0000\f)"
+"g\u0085\u0003ppsq\u0000~\u0000\f\'n\u00c7\u00d2ppsq\u0000~\u0000\f%v\n\u00a1ppsq\u0000~\u0000\f#}Mpppsq\u0000~\u0000\f!\u0084\u0090?ppsq\u0000~\u0000\f\u001f"
+"\u008b\u00d3\u000eppsq\u0000~\u0000\f\u001d\u0093\u0015\u00ddppsq\u0000~\u0000\f\u001b\u009aX\u00acppsq\u0000~\u0000\f\u0019\u00a1\u009b{ppsq\u0000~\u0000\f\u0017\u00a8\u00deJppsq\u0000~\u0000\f\u0015"
+"\u00b0!\u0019ppsq\u0000~\u0000\f\u0013\u00b7c\u00e8ppsq\u0000~\u0000\f\u0011\u00be\u00a6\u00b7ppsq\u0000~\u0000\f\u000f\u00c5\u00e9\u0086ppsq\u0000~\u0000\f\r\u00cd,Uppsq\u0000~\u0000\f\u000b"
+"\u00d4o$ppsq\u0000~\u0000\f\t\u00db\u00b1\u00f3ppsq\u0000~\u0000\f\u0007\u00e2\u00f4\u00c2ppsq\u0000~\u0000\f\u0005\u00ea7\u0091ppsq\u0000~\u0000\f\u0003\u00f1z`ppsq\u0000~\u0000\u0000\u0001"
+"\u00f8\u00bd/pp\u0000sq\u0000~\u0000\f\u0001\u00f8\u00bd$ppsq\u0000~\u0000\u0014\u0001\u00f8\u00bd\u0019q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001\u00f8\u00bd\u0016q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001e"
+"q\u0000~\u0000 sq\u0000~\u0000!t\u0000/net.sourceforge.czt.z.jaxb.gen.DecorExprElemen"
+"tq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001\u00f8\u00bd/pp\u0000sq\u0000~\u0000\f\u0001\u00f8\u00bd$ppsq\u0000~\u0000\u0014\u0001\u00f8\u00bd\u0019q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001\u00f8\u00bd\u0016q\u0000~"
+"\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000\'net.sourceforge.czt.z.jaxb.gen.Pr"
+"odExprq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001\u00f8\u00bd/pp\u0000sq\u0000~\u0000\f\u0001\u00f8\u00bd$ppsq\u0000~\u0000\u0014\u0001\u00f8\u00bd\u0019q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001\u00f8"
+"\u00bd\u0016q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000.net.sourceforge.czt.z.jaxb.g"
+"en.BindExprElementq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001\u00f8\u00bd/pp\u0000sq\u0000~\u0000\f\u0001\u00f8\u00bd$ppsq\u0000~\u0000\u0014\u0001\u00f8\u00bd\u0019q\u0000"
+"~\u0000\u0010psq\u0000~\u0000\u0017\u0001\u00f8\u00bd\u0016q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000&net.sourceforge."
+"czt.z.jaxb.gen.LetExprq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001\u00f8\u00bd/pp\u0000sq\u0000~\u0000\f\u0001\u00f8\u00bd$ppsq\u0000~\u0000\u0014\u0001\u00f8"
+"\u00bd\u0019q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001\u00f8\u00bd\u0016q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000)net.sourcefo"
+"rge.czt.z.jaxb.gen.ExistsExprq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001\u00f8\u00bd/pp\u0000sq\u0000~\u0000\f\u0001\u00f8\u00bd$pps"
+"q\u0000~\u0000\u0014\u0001\u00f8\u00bd\u0019q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001\u00f8\u00bd\u0016q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000/net.s"
+"ourceforge.czt.z.jaxb.gen.ThetaExprElementq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001\u00f8\u00bd/pp\u0000"
+"sq\u0000~\u0000\f\u0001\u00f8\u00bd$ppsq\u0000~\u0000\u0014\u0001\u00f8\u00bd\u0019q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001\u00f8\u00bd\u0016q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 s"
+"q\u0000~\u0000!t\u00002net.sourceforge.czt.z.jaxb.gen.TupleSelExprElementq\u0000"
+"~\u0000%sq\u0000~\u0000\u0000\u0001\u00f8\u00bd/pp\u0000sq\u0000~\u0000\f\u0001\u00f8\u00bd$ppsq\u0000~\u0000\u0014\u0001\u00f8\u00bd\u0019q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001\u00f8\u00bd\u0016q\u0000~\u0000\u0010p"
+"q\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000)net.sourceforge.czt.z.jaxb.gen.Foral"
+"lExprq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001\u00f8\u00bd/pp\u0000sq\u0000~\u0000\f\u0001\u00f8\u00bd$ppsq\u0000~\u0000\u0014\u0001\u00f8\u00bd\u0019q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001\u00f8\u00bd"
+"\u0016q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000&net.sourceforge.czt.z.jaxb.ge"
+"n.SetExprq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001\u00f8\u00bd/pp\u0000sq\u0000~\u0000\f\u0001\u00f8\u00bd$ppsq\u0000~\u0000\u0014\u0001\u00f8\u00bd\u0019q\u0000~\u0000\u0010psq\u0000~\u0000"
+"\u0017\u0001\u00f8\u00bd\u0016q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000\'net.sourceforge.czt.z.jax"
+"b.gen.PipeExprq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001\u00f8\u00bd/pp\u0000sq\u0000~\u0000\f\u0001\u00f8\u00bd$ppsq\u0000~\u0000\u0014\u0001\u00f8\u00bd\u0019q\u0000~\u0000\u0010p"
+"sq\u0000~\u0000\u0017\u0001\u00f8\u00bd\u0016q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000*net.sourceforge.czt."
+"z.jaxb.gen.ImpliesExprq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001\u00f8\u00bd/pp\u0000sq\u0000~\u0000\f\u0001\u00f8\u00bd$ppsq\u0000~\u0000\u0014\u0001\u00f8"
+"\u00bd\u0019q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001\u00f8\u00bd\u0016q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000(net.sourcefo"
+"rge.czt.z.jaxb.gen.PowerExprq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001\u00f8\u00bd/pp\u0000sq\u0000~\u0000\f\u0001\u00f8\u00bd$ppsq"
+"\u0000~\u0000\u0014\u0001\u00f8\u00bd\u0019q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001\u00f8\u00bd\u0016q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000+net.so"
+"urceforge.czt.z.jaxb.gen.Expr1Elementq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001\u00f8\u00bd/pp\u0000sq\u0000~\u0000"
+"\f\u0001\u00f8\u00bd$ppsq\u0000~\u0000\u0014\u0001\u00f8\u00bd\u0019q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001\u00f8\u00bd\u0016q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!"
+"t\u00003net.sourceforge.czt.zpatt.jaxb.gen.JokerExprElementq\u0000~\u0000%s"
+"q\u0000~\u0000\u0000\u0001\u00f8\u00bd/pp\u0000sq\u0000~\u0000\f\u0001\u00f8\u00bd$ppsq\u0000~\u0000\u0014\u0001\u00f8\u00bd\u0019q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001\u00f8\u00bd\u0016q\u0000~\u0000\u0010pq\u0000~\u0000"
+"\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u00000net.sourceforge.czt.z.jaxb.gen.RenameExp"
+"rElementq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001\u00f8\u00bd/pp\u0000sq\u0000~\u0000\f\u0001\u00f8\u00bd$ppsq\u0000~\u0000\u0014\u0001\u00f8\u00bd\u0019q\u0000~\u0000\u0010psq\u0000~\u0000\u0017"
+"\u0001\u00f8\u00bd\u0016q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000*net.sourceforge.czt.z.jaxb"
+".gen.Exists1Exprq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001\u00f8\u00bd/pp\u0000sq\u0000~\u0000\f\u0001\u00f8\u00bd$ppsq\u0000~\u0000\u0014\u0001\u00f8\u00bd\u0019q\u0000~\u0000"
+"\u0010psq\u0000~\u0000\u0017\u0001\u00f8\u00bd\u0016q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000.net.sourceforge.cz"
+"t.z.jaxb.gen.ApplExprElementq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001\u00f8\u00bd/pp\u0000sq\u0000~\u0000\f\u0001\u00f8\u00bd$ppsq"
+"\u0000~\u0000\u0014\u0001\u00f8\u00bd\u0019q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001\u00f8\u00bd\u0016q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000)net.so"
+"urceforge.czt.z.jaxb.gen.LambdaExprq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001\u00f8\u00bd/pp\u0000sq\u0000~\u0000\f\u0001"
+"\u00f8\u00bd$ppsq\u0000~\u0000\u0014\u0001\u00f8\u00bd\u0019q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001\u00f8\u00bd\u0016q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000"
+".net.sourceforge.czt.z.jaxb.gen.SchExpr2Elementq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001\u00f8"
+"\u00bd/pp\u0000sq\u0000~\u0000\f\u0001\u00f8\u00bd$ppsq\u0000~\u0000\u0014\u0001\u00f8\u00bd\u0019q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001\u00f8\u00bd\u0016q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq"
+"\u0000~\u0000 sq\u0000~\u0000!t\u0000-net.sourceforge.czt.z.jaxb.gen.RefExprElementq\u0000"
+"~\u0000%sq\u0000~\u0000\u0000\u0001\u00f8\u00bd/pp\u0000sq\u0000~\u0000\f\u0001\u00f8\u00bd$ppsq\u0000~\u0000\u0014\u0001\u00f8\u00bd\u0019q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001\u00f8\u00bd\u0016q\u0000~\u0000\u0010p"
+"q\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000&net.sourceforge.czt.z.jaxb.gen.AndEx"
+"prq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001\u00f8\u00bd/pp\u0000sq\u0000~\u0000\f\u0001\u00f8\u00bd$ppsq\u0000~\u0000\u0014\u0001\u00f8\u00bd\u0019q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001\u00f8\u00bd\u0016q\u0000"
+"~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000-net.sourceforge.czt.z.jaxb.gen.Q"
+"ntExprElementq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001\u00f8\u00bd/pp\u0000sq\u0000~\u0000\f\u0001\u00f8\u00bd$ppsq\u0000~\u0000\u0014\u0001\u00f8\u00bd\u0019q\u0000~\u0000\u0010ps"
+"q\u0000~\u0000\u0017\u0001\u00f8\u00bd\u0016q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000&net.sourceforge.czt.z"
+".jaxb.gen.IffExprq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001\u00f8\u00bd/pp\u0000sq\u0000~\u0000\f\u0001\u00f8\u00bd$ppsq\u0000~\u0000\u0014\u0001\u00f8\u00bd\u0019q\u0000~"
+"\u0000\u0010psq\u0000~\u0000\u0017\u0001\u00f8\u00bd\u0016q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000(net.sourceforge.c"
+"zt.z.jaxb.gen.TupleExprq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001\u00f8\u00bd/pp\u0000sq\u0000~\u0000\f\u0001\u00f8\u00bd$ppsq\u0000~\u0000\u0014\u0001"
+"\u00f8\u00bd\u0019q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001\u00f8\u00bd\u0016q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000,net.sourcef"
+"orge.czt.z.jaxb.gen.Expr2NElementq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001\u00f8\u00bd/pp\u0000sq\u0000~\u0000\f\u0001\u00f8\u00bd"
+"$ppsq\u0000~\u0000\u0014\u0001\u00f8\u00bd\u0019q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001\u00f8\u00bd\u0016q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000,n"
+"et.sourceforge.czt.z.jaxb.gen.Expr0NElementq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001\u00f8\u00bd/pp"
+"\u0000sq\u0000~\u0000\f\u0001\u00f8\u00bd$ppsq\u0000~\u0000\u0014\u0001\u00f8\u00bd\u0019q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001\u00f8\u00bd\u0016q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 "
+"sq\u0000~\u0000!t\u0000.net.sourceforge.czt.z.jaxb.gen.HideExprElementq\u0000~\u0000%"
+"sq\u0000~\u0000\u0000\u0001\u00f8\u00bd/pp\u0000sq\u0000~\u0000\f\u0001\u00f8\u00bd$ppsq\u0000~\u0000\u0014\u0001\u00f8\u00bd\u0019q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001\u00f8\u00bd\u0016q\u0000~\u0000\u0010pq\u0000~"
+"\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000.net.sourceforge.czt.z.jaxb.gen.CondExpr"
+"Elementq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001\u00f8\u00bd/pp\u0000sq\u0000~\u0000\f\u0001\u00f8\u00bd$ppsq\u0000~\u0000\u0014\u0001\u00f8\u00bd\u0019q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001"
+"\u00f8\u00bd\u0016q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000*net.sourceforge.czt.z.jaxb."
+"gen.SetCompExprq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001\u00f8\u00bd/pp\u0000sq\u0000~\u0000\f\u0001\u00f8\u00bd$ppsq\u0000~\u0000\u0014\u0001\u00f8\u00bd\u0019q\u0000~\u0000\u0010"
+"psq\u0000~\u0000\u0017\u0001\u00f8\u00bd\u0016q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000&net.sourceforge.czt"
+".z.jaxb.gen.PreExprq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001\u00f8\u00bd/pp\u0000sq\u0000~\u0000\f\u0001\u00f8\u00bd$ppsq\u0000~\u0000\u0014\u0001\u00f8\u00bd\u0019q"
+"\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001\u00f8\u00bd\u0016q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u00001net.sourceforge"
+".czt.z.jaxb.gen.BindSelExprElementq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001\u00f8\u00bd/pp\u0000sq\u0000~\u0000\f\u0001\u00f8"
+"\u00bd$ppsq\u0000~\u0000\u0014\u0001\u00f8\u00bd\u0019q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001\u00f8\u00bd\u0016q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000\'"
+"net.sourceforge.czt.z.jaxb.gen.ProjExprq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001\u00f8\u00bd/pp\u0000sq\u0000"
+"~\u0000\f\u0001\u00f8\u00bd$ppsq\u0000~\u0000\u0014\u0001\u00f8\u00bd\u0019q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001\u00f8\u00bd\u0016q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~"
+"\u0000!t\u0000+net.sourceforge.czt.z.jaxb.gen.Expr2Elementq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001"
+"\u00f8\u00bd/pp\u0000sq\u0000~\u0000\f\u0001\u00f8\u00bd$ppsq\u0000~\u0000\u0014\u0001\u00f8\u00bd\u0019q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001\u00f8\u00bd\u0016q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001e"
+"q\u0000~\u0000 sq\u0000~\u0000!t\u0000.net.sourceforge.czt.z.jaxb.gen.Qnt1ExprElement"
+"q\u0000~\u0000%sq\u0000~\u0000\u0000\u0001\u00f8\u00bd/pp\u0000sq\u0000~\u0000\f\u0001\u00f8\u00bd$ppsq\u0000~\u0000\u0014\u0001\u00f8\u00bd\u0019q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001\u00f8\u00bd\u0016q\u0000~\u0000"
+"\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000-net.sourceforge.czt.z.jaxb.gen.Sch"
+"ExprElementq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001\u00f8\u00bd/pp\u0000sq\u0000~\u0000\f\u0001\u00f8\u00bd$ppsq\u0000~\u0000\u0014\u0001\u00f8\u00bd\u0019q\u0000~\u0000\u0010psq\u0000"
+"~\u0000\u0017\u0001\u00f8\u00bd\u0016q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000\'net.sourceforge.czt.z.j"
+"axb.gen.CompExprq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001\u00f8\u00bd/pp\u0000sq\u0000~\u0000\f\u0001\u00f8\u00bd$ppsq\u0000~\u0000\u0014\u0001\u00f8\u00bd\u0019q\u0000~\u0000"
+"\u0010psq\u0000~\u0000\u0017\u0001\u00f8\u00bd\u0016q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000-net.sourceforge.cz"
+"t.z.jaxb.gen.NumExprElementq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001\u00f8\u00bd/pp\u0000sq\u0000~\u0000\f\u0001\u00f8\u00bd$ppsq\u0000"
+"~\u0000\u0014\u0001\u00f8\u00bd\u0019q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001\u00f8\u00bd\u0016q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000%net.sou"
+"rceforge.czt.z.jaxb.gen.MuExprq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001\u00f8\u00bd/pp\u0000sq\u0000~\u0000\f\u0001\u00f8\u00bd$pp"
+"sq\u0000~\u0000\u0014\u0001\u00f8\u00bd\u0019q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001\u00f8\u00bd\u0016q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000%net."
+"sourceforge.czt.z.jaxb.gen.OrExprq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001\u00f8\u00bd/pp\u0000sq\u0000~\u0000\f\u0001\u00f8\u00bd"
+"$ppsq\u0000~\u0000\u0014\u0001\u00f8\u00bd\u0019q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001\u00f8\u00bd\u0016q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000&n"
+"et.sourceforge.czt.z.jaxb.gen.NegExprq\u0000~\u0000%sq\u0000~\u0000\f\u0002\u00b4\u00a4\u00a1ppsq\u0000~\u0000\u0017"
+"\u0002\u00b4\u00a4\u0096q\u0000~\u0000\u0010pq\u0000~\u0000+sq\u0000~\u0000!q\u0000~\u0000<q\u0000~\u0000=q\u0000~\u0000 sq\u0000~\u0000!t\u0000\tConstDeclq\u0000~\u0000@s"
+"r\u0000\"com.sun.msv.grammar.ExpressionPool\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\bexpTablet"
+"\u0000/Lcom/sun/msv/grammar/ExpressionPool$ClosedHash;xpsr\u0000-com.s"
+"un.msv.grammar.ExpressionPool$ClosedHash\u00d7j\u00d0N\u00ef\u00e8\u00ed\u001c\u0002\u0000\u0004I\u0000\u0005countI"
+"\u0000\tthresholdL\u0000\u0006parentq\u0000~\u0001r[\u0000\u0005tablet\u0000![Lcom/sun/msv/grammar/Ex"
+"pression;xp\u0000\u0000\u0000\u0087\u0000\u0000\u0000\u00e6pur\u0000![Lcom.sun.msv.grammar.Expression;\u00d68D"
+"\u00c3]\u00ad\u00a7\n\u0002\u0000\u0000xp\u0000\u0000\u0002\u00ffpppppq\u0000~\u0000]pppppppppppppppppppppq\u0000~\u0000fpppppppppp"
+"pppppppppppq\u0000~\u0000opppppppppppppppppppppq\u0000~\u0000xppppppq\u0000~\u0000Xppppppp"
+"ppppppppppppppq\u0000~\u0000appq\u0000~\u0000Ippppppppppppppppppq\u0000~\u0000jppppppppppp"
+"ppppppppppq\u0000~\u0000\u00a8q\u0000~\u0000\u00aeq\u0000~\u0000\u00b4q\u0000~\u0000\u00baq\u0000~\u0000\u00c0q\u0000~\u0000\u00c6q\u0000~\u0000\u00ccq\u0000~\u0000\u00d2q\u0000~\u0000sq\u0000~\u0001D"
+"q\u0000~\u0001>q\u0000~\u0001Cq\u0000~\u0001=q\u0000~\u00017q\u0000~\u00018q\u0000~\u00011q\u0000~\u00012q\u0000~\u0001+q\u0000~\u0001,q\u0000~\u0001%q\u0000~\u0001&q\u0000~\u0001\u001f"
+"q\u0000~\u0001 q\u0000~\u0001\u0019q\u0000~\u0001\u001aq\u0000~\u0001\u0013q\u0000~\u0001\u0014q\u0000~\u0001\rq\u0000~\u0001\u000eq\u0000~\u0000\\q\u0000~\u0001\u0007q\u0000~\u0001\bq\u0000~\u0001\u0001q\u0000~\u0001\u0002"
+"q\u0000~\u0000\u00fbq\u0000~\u0000\u00fcq\u0000~\u0000\u00f5q\u0000~\u0000\u00f6q\u0000~\u0000\u00efq\u0000~\u0000\u00f0q\u0000~\u0000\u00e9q\u0000~\u0000\u00eaq\u0000~\u0000\u00e3q\u0000~\u0000\u00e4q\u0000~\u0000\u00ddq\u0000~\u0000\u00de"
+"q\u0000~\u0000\u00d7q\u0000~\u0000\u00d8q\u0000~\u0000\u0016q\u0000~\u0000&q\u0000~\u0000Dq\u0000~\u0000eq\u0000~\u0000Lq\u0000~\u0000~q\u0000~\u0000\u0084q\u0000~\u0000\u008aq\u0000~\u0000\u0090q\u0000~\u0000\u0013"
+"q\u0000~\u0000Cq\u0000~\u0000Kq\u0000~\u0000}q\u0000~\u0000\u0083q\u0000~\u0000\u0089q\u0000~\u0000\u008fq\u0000~\u0000\u0095q\u0000~\u0000\u009bq\u0000~\u0000\u00a1q\u0000~\u0000\u00a7q\u0000~\u0000\u00adq\u0000~\u0000\u00b3"
+"q\u0000~\u0000\u00b9q\u0000~\u0000\u00bfq\u0000~\u0000\u00c5q\u0000~\u0000nq\u0000~\u0000\u00cbq\u0000~\u0000\u00d1q\u0000~\u0000\u0096q\u0000~\u0000\u009cq\u0000~\u0000\u00a2q\u0000~\u0001Jq\u0000~\u0001Iq\u0000~\u0001P"
+"q\u0000~\u0001Oq\u0000~\u0001Vq\u0000~\u0001Uq\u0000~\u0001\\q\u0000~\u0001[q\u0000~\u0001bq\u0000~\u0001aq\u0000~\u0001hq\u0000~\u0001gq\u0000~\u0000\tpppq\u0000~\u0000wpp"
+"ppppq\u0000~\u0000Wpppppppppppppppppppppq\u0000~\u0000`pppppppppppppq\u0000~\u0000Appppppp"
+"q\u0000~\u0000ipppppppppppppppppppppq\u0000~\u0000rpppppppppppppppppppppq\u0000~\u0000{ppp"
+"pppq\u0000~\u0000[pppppppppppppppppppppq\u0000~\u0000dq\u0000~\u0000\u0011ppppppppppppppppppppq"
+"\u0000~\u0000mq\u0000~\u0000\rppppppppppppppppppppq\u0000~\u0000vppppppq\u0000~\u0000Vppppppppppppppp"
+"ppppppq\u0000~\u0000_pppppppppppppppppppppq\u0000~\u0000hppppq\u0000~\u0001lpppppppppppppp"
+"ppq\u0000~\u0000qppppppppppppq\u0000~\u0000\nppppppppq\u0000~\u0000zppppppq\u0000~\u0000Zpppppppppppp"
+"pppppppppq\u0000~\u0000cpppppppppppppppppppppq\u0000~\u0000lpppppppppppppppppppp"
+"pq\u0000~\u0000uppppppq\u0000~\u0000Upppppppppppppppppppppq\u0000~\u0000^ppppppppppppppppp"
+"ppppq\u0000~\u0000gpppppppppppppppppppppq\u0000~\u0000ppppppppppppppppppppppq\u0000~\u0000"
+"yppq\u0000~\u0000\u000bpppq\u0000~\u0000Ypppppppppppppppppppppq\u0000~\u0000Pq\u0000~\u0000bppppppppppppp"
+"pppppppq\u0000~\u0000kpppppppppppppppppppppq\u0000~\u0000tpppppppppppppppppppppp"
+"p"));
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
            return net.sourceforge.czt.z.jaxb.gen.impl.ConstDeclElementImpl.this;
        }

        public void enterElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname, org.xml.sax.Attributes __atts)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  0 :
                        if (("ConstDecl" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
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
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.z.jaxb.gen.impl.ConstDeclImpl)net.sourceforge.czt.z.jaxb.gen.impl.ConstDeclElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("DeclName" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.z.jaxb.gen.impl.ConstDeclImpl)net.sourceforge.czt.z.jaxb.gen.impl.ConstDeclElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("DeclName" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.z.jaxb.gen.impl.ConstDeclImpl)net.sourceforge.czt.z.jaxb.gen.impl.ConstDeclElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        spawnHandlerFromEnterElement((((net.sourceforge.czt.z.jaxb.gen.impl.ConstDeclImpl)net.sourceforge.czt.z.jaxb.gen.impl.ConstDeclElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
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
                        if (("ConstDecl" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            context.popAttributes();
                            state = 3;
                            return ;
                        }
                        break;
                    case  3 :
                        revertToParentFromLeaveElement(___uri, ___local, ___qname);
                        return ;
                    case  1 :
                        spawnHandlerFromLeaveElement((((net.sourceforge.czt.z.jaxb.gen.impl.ConstDeclImpl)net.sourceforge.czt.z.jaxb.gen.impl.ConstDeclElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
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
                        spawnHandlerFromEnterAttribute((((net.sourceforge.czt.z.jaxb.gen.impl.ConstDeclImpl)net.sourceforge.czt.z.jaxb.gen.impl.ConstDeclElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
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
                        spawnHandlerFromLeaveAttribute((((net.sourceforge.czt.z.jaxb.gen.impl.ConstDeclImpl)net.sourceforge.czt.z.jaxb.gen.impl.ConstDeclElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
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
                            spawnHandlerFromText((((net.sourceforge.czt.z.jaxb.gen.impl.ConstDeclImpl)net.sourceforge.czt.z.jaxb.gen.impl.ConstDeclElementImpl.this).new Unmarshaller(context)), 2, value);
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
