//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.2-b15-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2003.10.28 at 04:14:13 NZDT 
//


package net.sourceforge.czt.core.jaxb.gen.impl;

public class ExistsPredImpl
    extends net.sourceforge.czt.core.jaxb.gen.impl.QntPredImpl
    implements net.sourceforge.czt.core.jaxb.gen.ExistsPred, com.sun.xml.bind.RIElement, com.sun.xml.bind.JAXBObject, net.sourceforge.czt.core.jaxb.gen.impl.runtime.UnmarshallableObject, net.sourceforge.czt.core.jaxb.gen.impl.runtime.XMLSerializable, net.sourceforge.czt.core.jaxb.gen.impl.runtime.ValidatableObject
{

    public final static java.lang.Class version = (net.sourceforge.czt.core.jaxb.gen.impl.JAXBVersion.class);
    private static com.sun.msv.grammar.Grammar schemaFragment;

    private final static java.lang.Class PRIMARY_INTERFACE_CLASS() {
        return (net.sourceforge.czt.core.jaxb.gen.ExistsPred.class);
    }

    public java.lang.String ____jaxb_ri____getNamespaceURI() {
        return "http://czt.sourceforge.net/zml";
    }

    public java.lang.String ____jaxb_ri____getLocalName() {
        return "ExistsPred";
    }

    public net.sourceforge.czt.core.jaxb.gen.impl.runtime.UnmarshallingEventHandler createUnmarshaller(net.sourceforge.czt.core.jaxb.gen.impl.runtime.UnmarshallingContext context) {
        return new net.sourceforge.czt.core.jaxb.gen.impl.ExistsPredImpl.Unmarshaller(context);
    }

    public void serializeBody(net.sourceforge.czt.core.jaxb.gen.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        context.startElement("http://czt.sourceforge.net/zml", "ExistsPred");
        super.serializeURIs(context);
        context.endNamespaceDecls();
        super.serializeAttributes(context);
        context.endAttributes();
        super.serializeBody(context);
        context.endElement();
    }

    public void serializeAttributes(net.sourceforge.czt.core.jaxb.gen.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
    }

    public void serializeURIs(net.sourceforge.czt.core.jaxb.gen.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
    }

    public java.lang.Class getPrimaryInterface() {
        return (net.sourceforge.czt.core.jaxb.gen.ExistsPred.class);
    }

    public com.sun.msv.verifier.DocumentDeclaration createRawValidator() {
        if (schemaFragment == null) {
            schemaFragment = com.sun.xml.bind.validator.SchemaDeserializer.deserialize((
 "\u00ac\u00ed\u0000\u0005sr\u0000\'com.sun.msv.grammar.trex.ElementPattern\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000"
+"\tnameClasst\u0000\u001fLcom/sun/msv/grammar/NameClass;xr\u0000\u001ecom.sun.msv."
+"grammar.ElementExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002Z\u0000\u001aignoreUndeclaredAttributesL\u0000"
+"\fcontentModelt\u0000 Lcom/sun/msv/grammar/Expression;xr\u0000\u001ecom.sun."
+"msv.grammar.Expression\u00f8\u0018\u0082\u00e8N5~O\u0002\u0000\u0003I\u0000\u000ecachedHashCodeL\u0000\u0013epsilon"
+"Reducibilityt\u0000\u0013Ljava/lang/Boolean;L\u0000\u000bexpandedExpq\u0000~\u0000\u0003xp\u000f\u0007\u00d9Jp"
+"p\u0000sr\u0000\u001fcom.sun.msv.grammar.SequenceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun."
+"msv.grammar.BinaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0004exp1q\u0000~\u0000\u0003L\u0000\u0004exp2q\u0000~\u0000\u0003xq\u0000~"
+"\u0000\u0004\u000f\u0007\u00d9?ppsq\u0000~\u0000\u0007\fM\u00e2Pppsq\u0000~\u0000\u0007\u0004\u0099o\u00ddppsr\u0000\u001dcom.sun.msv.grammar.Choi"
+"ceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\b\u0002$\u00c5\u00b6ppsq\u0000~\u0000\u0000\u0002$\u00c5\u00absr\u0000\u0011java.lang.Boolean\u00cd"
+" r\u0080\u00d5\u009c\u00fa\u00ee\u0002\u0000\u0001Z\u0000\u0005valuexp\u0000p\u0000sq\u0000~\u0000\u0007\u0002$\u00c5\u00a0ppsq\u0000~\u0000\u0000\u0000{G%pp\u0000sq\u0000~\u0000\f\u0000{G\u001app"
+"sr\u0000 com.sun.msv.grammar.OneOrMoreExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001ccom.sun.m"
+"sv.grammar.UnaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\u0003expq\u0000~\u0000\u0003xq\u0000~\u0000\u0004\u0000{G\u000fq\u0000~\u0000\u0010psr\u0000"
+" com.sun.msv.grammar.AttributeExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003expq\u0000~\u0000\u0003L\u0000\tna"
+"meClassq\u0000~\u0000\u0001xq\u0000~\u0000\u0004\u0000{G\fq\u0000~\u0000\u0010psr\u00002com.sun.msv.grammar.Expressi"
+"on$AnyStringExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004\u0000\u0000\u0000\bsq\u0000~\u0000\u000f\u0001q\u0000~\u0000\u001asr\u0000 c"
+"om.sun.msv.grammar.AnyNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun.msv.gr"
+"ammar.NameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com.sun.msv.grammar.Expressi"
+"on$EpsilonExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004\u0000\u0000\u0000\tq\u0000~\u0000\u001bq\u0000~\u0000 sr\u0000#com.s"
+"un.msv.grammar.SimpleNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\tlocalNamet\u0000\u0012Ljav"
+"a/lang/String;L\u0000\fnamespaceURIq\u0000~\u0000\"xq\u0000~\u0000\u001dt\u00000net.sourceforge.c"
+"zt.core.jaxb.gen.TermA.AnnsTypet\u0000+http://java.sun.com/jaxb/x"
+"jc/dummy-elementssq\u0000~\u0000\f\u0001\u00a9~vppsq\u0000~\u0000\u0017\u0001\u00a9~kq\u0000~\u0000\u0010psr\u0000\u001bcom.sun.msv"
+".grammar.DataExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\u0002dtt\u0000\u001fLorg/relaxng/datatype/Dat"
+"atype;L\u0000\u0006exceptq\u0000~\u0000\u0003L\u0000\u0004namet\u0000\u001dLcom/sun/msv/util/StringPair;x"
+"q\u0000~\u0000\u0004\u0001d\u00b9\u00c6ppsr\u0000\"com.sun.msv.datatype.xsd.QnameType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000"
+"xr\u0000*com.sun.msv.datatype.xsd.BuiltinAtomicType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000"
+"%com.sun.msv.datatype.xsd.ConcreteType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\'com.sun"
+".msv.datatype.xsd.XSDatatypeImpl\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\fnamespaceUriq\u0000"
+"~\u0000\"L\u0000\btypeNameq\u0000~\u0000\"L\u0000\nwhiteSpacet\u0000.Lcom/sun/msv/datatype/xsd"
+"/WhiteSpaceProcessor;xpt\u0000 http://www.w3.org/2001/XMLSchemat\u0000"
+"\u0005QNamesr\u00005com.sun.msv.datatype.xsd.WhiteSpaceProcessor$Colla"
+"pse\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000,com.sun.msv.datatype.xsd.WhiteSpaceProcess"
+"or\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com.sun.msv.grammar.Expression$NullSetExp"
+"ression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004\u0000\u0000\u0000\nq\u0000~\u0000\u0010psr\u0000\u001bcom.sun.msv.util.Strin"
+"gPair\u00d0t\u001ejB\u008f\u008d\u00a0\u0002\u0000\u0002L\u0000\tlocalNameq\u0000~\u0000\"L\u0000\fnamespaceURIq\u0000~\u0000\"xpq\u0000~\u00003"
+"q\u0000~\u00002sq\u0000~\u0000!t\u0000\u0004typet\u0000)http://www.w3.org/2001/XMLSchema-instan"
+"ceq\u0000~\u0000 sq\u0000~\u0000!t\u0000\u0004Annst\u0000\u001ehttp://czt.sourceforge.net/zmlq\u0000~\u0000 sq"
+"\u0000~\u0000\f\u0002t\u00aa\"ppsq\u0000~\u0000\u0000\u0000{G%pp\u0000sq\u0000~\u0000\f\u0000{G\u001appsq\u0000~\u0000\u0014\u0000{G\u000fq\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0000{G"
+"\fq\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u00000net.sourceforge.czt.core.jaxb"
+".gen.SchTextElementq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001\u00f9b\u00fbpp\u0000sq\u0000~\u0000\u0007\u0001\u00f9b\u00f0ppsq\u0000~\u0000\u0000\u0000{G%p"
+"p\u0000sq\u0000~\u0000\f\u0000{G\u001appsq\u0000~\u0000\u0014\u0000{G\u000fq\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0000{G\fq\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000"
+" sq\u0000~\u0000!t\u0000)net.sourceforge.czt.core.jaxb.gen.SchTextq\u0000~\u0000%sq\u0000~"
+"\u0000\f\u0001~\u001b\u00c6ppsq\u0000~\u0000\u0017\u0001~\u001b\u00bbq\u0000~\u0000\u0010pq\u0000~\u0000+sq\u0000~\u0000!q\u0000~\u0000<q\u0000~\u0000=q\u0000~\u0000 sq\u0000~\u0000!t\u0000\u0007S"
+"chTextq\u0000~\u0000@sq\u0000~\u0000\f\u0007\u00b4rnppsq\u0000~\u0000\f\u00079+Gppsq\u0000~\u0000\f\u0006\u00bd\u00e4 ppsq\u0000~\u0000\f\u0006B\u009c\u00f9pps"
+"q\u0000~\u0000\f\u0005\u00c7U\u00d2ppsq\u0000~\u0000\f\u0005L\u000e\u00abppsq\u0000~\u0000\f\u0004\u00d0\u00c7\u0084ppsq\u0000~\u0000\f\u0004U\u0080]ppsq\u0000~\u0000\f\u0003\u00da96pps"
+"q\u0000~\u0000\f\u0003^\u00f2\u000fppsq\u0000~\u0000\f\u0002\u00e3\u00aa\u00e8ppsq\u0000~\u0000\f\u0002hc\u00c1ppsq\u0000~\u0000\f\u0001\u00ed\u001c\u009appsq\u0000~\u0000\f\u0001q\u00d5spps"
+"q\u0000~\u0000\f\u0000\u00f6\u008eLppsq\u0000~\u0000\u0000\u0000{G%pp\u0000sq\u0000~\u0000\f\u0000{G\u001appsq\u0000~\u0000\u0014\u0000{G\u000fq\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0000{"
+"G\fq\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000,net.sourceforge.czt.core.jax"
+"b.gen.ExistsPredq\u0000~\u0000%sq\u0000~\u0000\u0000\u0000{G%pp\u0000sq\u0000~\u0000\f\u0000{G\u001appsq\u0000~\u0000\u0014\u0000{G\u000fq\u0000~\u0000"
+"\u0010psq\u0000~\u0000\u0017\u0000{G\fq\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000,net.sourceforge.cz"
+"t.core.jaxb.gen.ForallPredq\u0000~\u0000%sq\u0000~\u0000\u0000\u0000{G%pp\u0000sq\u0000~\u0000\f\u0000{G\u001appsq\u0000~"
+"\u0000\u0014\u0000{G\u000fq\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0000{G\fq\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u00000net.sour"
+"ceforge.czt.core.jaxb.gen.MemPredElementq\u0000~\u0000%sq\u0000~\u0000\u0000\u0000{G%pp\u0000sq"
+"\u0000~\u0000\f\u0000{G\u001appsq\u0000~\u0000\u0014\u0000{G\u000fq\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0000{G\fq\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000"
+"~\u0000!t\u0000*net.sourceforge.czt.core.jaxb.gen.TruePredq\u0000~\u0000%sq\u0000~\u0000\u0000\u0000"
+"{G%pp\u0000sq\u0000~\u0000\f\u0000{G\u001appsq\u0000~\u0000\u0014\u0000{G\u000fq\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0000{G\fq\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001e"
+"q\u0000~\u0000 sq\u0000~\u0000!t\u00003net.sourceforge.czt.zpatt.jaxb.gen.JokerPredEl"
+"ementq\u0000~\u0000%sq\u0000~\u0000\u0000\u0000{G%pp\u0000sq\u0000~\u0000\f\u0000{G\u001appsq\u0000~\u0000\u0014\u0000{G\u000fq\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0000{G"
+"\fq\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000)net.sourceforge.czt.core.jaxb"
+".gen.IffPredq\u0000~\u0000%sq\u0000~\u0000\u0000\u0000{G%pp\u0000sq\u0000~\u0000\f\u0000{G\u001appsq\u0000~\u0000\u0014\u0000{G\u000fq\u0000~\u0000\u0010psq"
+"\u0000~\u0000\u0017\u0000{G\fq\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000-net.sourceforge.czt.co"
+"re.jaxb.gen.ImpliesPredq\u0000~\u0000%sq\u0000~\u0000\u0000\u0000{G%pp\u0000sq\u0000~\u0000\f\u0000{G\u001appsq\u0000~\u0000\u0014\u0000"
+"{G\u000fq\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0000{G\fq\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u00000net.sourcef"
+"orge.czt.core.jaxb.gen.QntPredElementq\u0000~\u0000%sq\u0000~\u0000\u0000\u0000{G%pp\u0000sq\u0000~\u0000"
+"\f\u0000{G\u001appsq\u0000~\u0000\u0014\u0000{G\u000fq\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0000{G\fq\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!"
+"t\u0000-net.sourceforge.czt.core.jaxb.gen.FactElementq\u0000~\u0000%sq\u0000~\u0000\u0000\u0000"
+"{G%pp\u0000sq\u0000~\u0000\f\u0000{G\u001appsq\u0000~\u0000\u0014\u0000{G\u000fq\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0000{G\fq\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001e"
+"q\u0000~\u0000 sq\u0000~\u0000!t\u0000-net.sourceforge.czt.core.jaxb.gen.Exists1Predq"
+"\u0000~\u0000%sq\u0000~\u0000\u0000\u0000{G%pp\u0000sq\u0000~\u0000\f\u0000{G\u001appsq\u0000~\u0000\u0014\u0000{G\u000fq\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0000{G\fq\u0000~\u0000\u0010"
+"pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000(net.sourceforge.czt.core.jaxb.gen.O"
+"rPredq\u0000~\u0000%sq\u0000~\u0000\u0000\u0000{G%pp\u0000sq\u0000~\u0000\f\u0000{G\u001appsq\u0000~\u0000\u0014\u0000{G\u000fq\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0000{G"
+"\fq\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u00000net.sourceforge.czt.core.jaxb"
+".gen.AndPredElementq\u0000~\u0000%sq\u0000~\u0000\u0000\u0000{G%pp\u0000sq\u0000~\u0000\f\u0000{G\u001appsq\u0000~\u0000\u0014\u0000{G\u000fq"
+"\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0000{G\fq\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u00000net.sourceforge"
+".czt.core.jaxb.gen.NegPredElementq\u0000~\u0000%sq\u0000~\u0000\u0000\u0000{G%pp\u0000sq\u0000~\u0000\f\u0000{G"
+"\u001appsq\u0000~\u0000\u0014\u0000{G\u000fq\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0000{G\fq\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000.n"
+"et.sourceforge.czt.core.jaxb.gen.Pred2Elementq\u0000~\u0000%sq\u0000~\u0000\u0000\u0000{G%"
+"pp\u0000sq\u0000~\u0000\f\u0000{G\u001appsq\u0000~\u0000\u0014\u0000{G\u000fq\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0000{G\fq\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~"
+"\u0000 sq\u0000~\u0000!t\u0000+net.sourceforge.czt.core.jaxb.gen.FalsePredq\u0000~\u0000%s"
+"q\u0000~\u0000\u0000\u0000{G%pp\u0000sq\u0000~\u0000\f\u0000{G\u001appsq\u0000~\u0000\u0014\u0000{G\u000fq\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0000{G\fq\u0000~\u0000\u0010pq\u0000~\u0000"
+"\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u00001net.sourceforge.czt.core.jaxb.gen.ExprPr"
+"edElementq\u0000~\u0000%sq\u0000~\u0000\f\u0002\u00b9\u00f6\u00eappsq\u0000~\u0000\u0017\u0002\u00b9\u00f6\u00dfq\u0000~\u0000\u0010pq\u0000~\u0000+sq\u0000~\u0000!q\u0000~\u0000<q\u0000"
+"~\u0000=q\u0000~\u0000 sq\u0000~\u0000!t\u0000\nExistsPredq\u0000~\u0000@sr\u0000\"com.sun.msv.grammar.Expr"
+"essionPool\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\bexpTablet\u0000/Lcom/sun/msv/grammar/Expr"
+"essionPool$ClosedHash;xpsr\u0000-com.sun.msv.grammar.ExpressionPo"
+"ol$ClosedHash\u00d7j\u00d0N\u00ef\u00e8\u00ed\u001c\u0002\u0000\u0004I\u0000\u0005countI\u0000\tthresholdL\u0000\u0006parentq\u0000~\u0000\u00ca[\u0000"
+"\u0005tablet\u0000![Lcom/sun/msv/grammar/Expression;xp\u0000\u0000\u0000?\u0000\u0000\u0000rpur\u0000![Lc"
+"om.sun.msv.grammar.Expression;\u00d68D\u00c3]\u00ad\u00a7\n\u0002\u0000\u0000xp\u0000\u0000\u0001\u007fppppppppppppp"
+"ppppq\u0000~\u0000Zppppppppppppppppppppq\u0000~\u0000bppppppq\u0000~\u0000\tpppppppppppq\u0000~\u0000"
+"Wppppppppppppppppppppq\u0000~\u0000_pppppppq\u0000~\u0000Appppppq\u0000~\u0000&ppppppppppp"
+"pppppppq\u0000~\u0000\u00c4ppppq\u0000~\u0000\u00baq\u0000~\u0000\\q\u0000~\u0000\u00b4q\u0000~\u0000\u00aeq\u0000~\u0000\u00a8q\u0000~\u0000\u00a2q\u0000~\u0000\u009cq\u0000~\u0000\u0096q\u0000~\u0000"
+"\u0090q\u0000~\u0000\u008aq\u0000~\u0000\u0084q\u0000~\u0000\u00b9q\u0000~\u0000\u00b3q\u0000~\u0000\u00adq\u0000~\u0000\u00a7q\u0000~\u0000\u00a1q\u0000~\u0000\u009bq\u0000~\u0000\u0095q\u0000~\u0000\u008fq\u0000~\u0000\u0089q\u0000~\u0000"
+"\u0083q\u0000~\u0000}q\u0000~\u0000wq\u0000~\u0000qq\u0000~\u0000kq\u0000~\u0000eq\u0000~\u0000Kq\u0000~\u0000Cq\u0000~\u0000\u0013q\u0000~\u0000~q\u0000~\u0000xq\u0000~\u0000rq\u0000~\u0000"
+"lq\u0000~\u0000fq\u0000~\u0000Lq\u0000~\u0000Dq\u0000~\u0000\u0016q\u0000~\u0000\u00c0q\u0000~\u0000\u00bfppq\u0000~\u0000Yppppppppppppppq\u0000~\u0000Pppp"
+"ppq\u0000~\u0000appppppppppppppppppq\u0000~\u0000Vppppppppppppppppppppq\u0000~\u0000^ppppp"
+"ppppppppppppq\u0000~\u0000\u0011pppppppppppppppppppppq\u0000~\u0000\rq\u0000~\u0000[pppppppppppp"
+"pppppppq\u0000~\u0000cppppppppppppppppppq\u0000~\u0000Xpppppppppppq\u0000~\u0000\npppppq\u0000~\u0000"
+"Ippq\u0000~\u0000`ppppppppppppppppppq\u0000~\u0000Uppppppppppq\u0000~\u0000\u000bpppppppppq\u0000~\u0000]"
+"pppppppppppppppppppppp"));
        }
        return new com.sun.msv.verifier.regexp.REDocumentDeclaration(schemaFragment);
    }

    public class Unmarshaller
        extends net.sourceforge.czt.core.jaxb.gen.impl.runtime.AbstractUnmarshallingEventHandlerImpl
    {


        public Unmarshaller(net.sourceforge.czt.core.jaxb.gen.impl.runtime.UnmarshallingContext context) {
            super(context, "----");
        }

        protected Unmarshaller(net.sourceforge.czt.core.jaxb.gen.impl.runtime.UnmarshallingContext context, int startState) {
            this(context);
            state = startState;
        }

        public java.lang.Object owner() {
            return net.sourceforge.czt.core.jaxb.gen.impl.ExistsPredImpl.this;
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
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.core.jaxb.gen.impl.QntPredImpl)net.sourceforge.czt.core.jaxb.gen.impl.ExistsPredImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("SchText" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.core.jaxb.gen.impl.QntPredImpl)net.sourceforge.czt.core.jaxb.gen.impl.ExistsPredImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("SchText" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.core.jaxb.gen.impl.QntPredImpl)net.sourceforge.czt.core.jaxb.gen.impl.ExistsPredImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        spawnHandlerFromEnterElement((((net.sourceforge.czt.core.jaxb.gen.impl.QntPredImpl)net.sourceforge.czt.core.jaxb.gen.impl.ExistsPredImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                        return ;
                    case  3 :
                        revertToParentFromEnterElement(___uri, ___local, ___qname, __atts);
                        return ;
                    case  0 :
                        if (("ExistsPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 1;
                            return ;
                        }
                        break;
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
                    case  1 :
                        spawnHandlerFromLeaveElement((((net.sourceforge.czt.core.jaxb.gen.impl.QntPredImpl)net.sourceforge.czt.core.jaxb.gen.impl.ExistsPredImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
                        return ;
                    case  3 :
                        revertToParentFromLeaveElement(___uri, ___local, ___qname);
                        return ;
                    case  2 :
                        if (("ExistsPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            context.popAttributes();
                            state = 3;
                            return ;
                        }
                        break;
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
                        spawnHandlerFromEnterAttribute((((net.sourceforge.czt.core.jaxb.gen.impl.QntPredImpl)net.sourceforge.czt.core.jaxb.gen.impl.ExistsPredImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
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
                        spawnHandlerFromLeaveAttribute((((net.sourceforge.czt.core.jaxb.gen.impl.QntPredImpl)net.sourceforge.czt.core.jaxb.gen.impl.ExistsPredImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
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
                            spawnHandlerFromText((((net.sourceforge.czt.core.jaxb.gen.impl.QntPredImpl)net.sourceforge.czt.core.jaxb.gen.impl.ExistsPredImpl.this).new Unmarshaller(context)), 2, value);
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
