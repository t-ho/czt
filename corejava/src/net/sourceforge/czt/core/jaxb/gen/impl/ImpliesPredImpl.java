//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.2-b15-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2003.10.28 at 04:14:13 NZDT 
//


package net.sourceforge.czt.core.jaxb.gen.impl;

public class ImpliesPredImpl
    extends net.sourceforge.czt.core.jaxb.gen.impl.Pred2Impl
    implements net.sourceforge.czt.core.jaxb.gen.ImpliesPred, com.sun.xml.bind.RIElement, com.sun.xml.bind.JAXBObject, net.sourceforge.czt.core.jaxb.gen.impl.runtime.UnmarshallableObject, net.sourceforge.czt.core.jaxb.gen.impl.runtime.XMLSerializable, net.sourceforge.czt.core.jaxb.gen.impl.runtime.ValidatableObject
{

    public final static java.lang.Class version = (net.sourceforge.czt.core.jaxb.gen.impl.JAXBVersion.class);
    private static com.sun.msv.grammar.Grammar schemaFragment;

    private final static java.lang.Class PRIMARY_INTERFACE_CLASS() {
        return (net.sourceforge.czt.core.jaxb.gen.ImpliesPred.class);
    }

    public java.lang.String ____jaxb_ri____getNamespaceURI() {
        return "http://czt.sourceforge.net/zml";
    }

    public java.lang.String ____jaxb_ri____getLocalName() {
        return "ImpliesPred";
    }

    public net.sourceforge.czt.core.jaxb.gen.impl.runtime.UnmarshallingEventHandler createUnmarshaller(net.sourceforge.czt.core.jaxb.gen.impl.runtime.UnmarshallingContext context) {
        return new net.sourceforge.czt.core.jaxb.gen.impl.ImpliesPredImpl.Unmarshaller(context);
    }

    public void serializeBody(net.sourceforge.czt.core.jaxb.gen.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        context.startElement("http://czt.sourceforge.net/zml", "ImpliesPred");
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
        return (net.sourceforge.czt.core.jaxb.gen.ImpliesPred.class);
    }

    public com.sun.msv.verifier.DocumentDeclaration createRawValidator() {
        if (schemaFragment == null) {
            schemaFragment = com.sun.xml.bind.validator.SchemaDeserializer.deserialize((
 "\u00ac\u00ed\u0000\u0005sr\u0000\'com.sun.msv.grammar.trex.ElementPattern\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000"
+"\tnameClasst\u0000\u001fLcom/sun/msv/grammar/NameClass;xr\u0000\u001ecom.sun.msv."
+"grammar.ElementExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002Z\u0000\u001aignoreUndeclaredAttributesL\u0000"
+"\fcontentModelt\u0000 Lcom/sun/msv/grammar/Expression;xr\u0000\u001ecom.sun."
+"msv.grammar.Expression\u00f8\u0018\u0082\u00e8N5~O\u0002\u0000\u0003I\u0000\u000ecachedHashCodeL\u0000\u0013epsilon"
+"Reducibilityt\u0000\u0013Ljava/lang/Boolean;L\u0000\u000bexpandedExpq\u0000~\u0000\u0003xp\u0014`QTp"
+"p\u0000sr\u0000\u001fcom.sun.msv.grammar.SequenceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun."
+"msv.grammar.BinaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0004exp1q\u0000~\u0000\u0003L\u0000\u0004exp2q\u0000~\u0000\u0003xq\u0000~"
+"\u0000\u0004\u0014`QIppsq\u0000~\u0000\u0007\u0012Y\u00a8\u00e0ppsq\u0000~\u0000\u0007\n\u00a56mppsr\u0000\u001dcom.sun.msv.grammar.Choi"
+"ceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\b\u0002\u00f0\u00c3\u00fappsq\u0000~\u0000\u0000\u0002\u00f0\u00c3\u00efsr\u0000\u0011java.lang.Boolean\u00cd"
+" r\u0080\u00d5\u009c\u00fa\u00ee\u0002\u0000\u0001Z\u0000\u0005valuexp\u0000p\u0000sq\u0000~\u0000\u0007\u0002\u00f0\u00c3\u00e4ppsq\u0000~\u0000\u0000\u0000{G%pp\u0000sq\u0000~\u0000\f\u0000{G\u001app"
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
+"jc/dummy-elementssq\u0000~\u0000\f\u0002u|\u00bappsq\u0000~\u0000\u0017\u0002u|\u00afq\u0000~\u0000\u0010psr\u0000\u001bcom.sun.msv"
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
+"\u0000~\u0000\f\u0007\u00b4rnppsq\u0000~\u0000\f\u00079+Gppsq\u0000~\u0000\f\u0006\u00bd\u00e4 ppsq\u0000~\u0000\f\u0006B\u009c\u00f9ppsq\u0000~\u0000\f\u0005\u00c7U\u00d2ppsq"
+"\u0000~\u0000\f\u0005L\u000e\u00abppsq\u0000~\u0000\f\u0004\u00d0\u00c7\u0084ppsq\u0000~\u0000\f\u0004U\u0080]ppsq\u0000~\u0000\f\u0003\u00da96ppsq\u0000~\u0000\f\u0003^\u00f2\u000fppsq"
+"\u0000~\u0000\f\u0002\u00e3\u00aa\u00e8ppsq\u0000~\u0000\f\u0002hc\u00c1ppsq\u0000~\u0000\f\u0001\u00ed\u001c\u009appsq\u0000~\u0000\f\u0001q\u00d5sppsq\u0000~\u0000\f\u0000\u00f6\u008eLppsq"
+"\u0000~\u0000\u0000\u0000{G%pp\u0000sq\u0000~\u0000\f\u0000{G\u001appsq\u0000~\u0000\u0014\u0000{G\u000fq\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0000{G\fq\u0000~\u0000\u0010pq\u0000~\u0000\u001a"
+"q\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000,net.sourceforge.czt.core.jaxb.gen.ExistsP"
+"redq\u0000~\u0000%sq\u0000~\u0000\u0000\u0000{G%pp\u0000sq\u0000~\u0000\f\u0000{G\u001appsq\u0000~\u0000\u0014\u0000{G\u000fq\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0000{G\fq"
+"\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000,net.sourceforge.czt.core.jaxb.g"
+"en.ForallPredq\u0000~\u0000%sq\u0000~\u0000\u0000\u0000{G%pp\u0000sq\u0000~\u0000\f\u0000{G\u001appsq\u0000~\u0000\u0014\u0000{G\u000fq\u0000~\u0000\u0010ps"
+"q\u0000~\u0000\u0017\u0000{G\fq\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u00000net.sourceforge.czt.c"
+"ore.jaxb.gen.MemPredElementq\u0000~\u0000%sq\u0000~\u0000\u0000\u0000{G%pp\u0000sq\u0000~\u0000\f\u0000{G\u001appsq\u0000"
+"~\u0000\u0014\u0000{G\u000fq\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0000{G\fq\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000*net.sou"
+"rceforge.czt.core.jaxb.gen.TruePredq\u0000~\u0000%sq\u0000~\u0000\u0000\u0000{G%pp\u0000sq\u0000~\u0000\f\u0000"
+"{G\u001appsq\u0000~\u0000\u0014\u0000{G\u000fq\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0000{G\fq\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000"
+"3net.sourceforge.czt.zpatt.jaxb.gen.JokerPredElementq\u0000~\u0000%sq\u0000"
+"~\u0000\u0000\u0000{G%pp\u0000sq\u0000~\u0000\f\u0000{G\u001appsq\u0000~\u0000\u0014\u0000{G\u000fq\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0000{G\fq\u0000~\u0000\u0010pq\u0000~\u0000\u001aq"
+"\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000)net.sourceforge.czt.core.jaxb.gen.IffPredq"
+"\u0000~\u0000%sq\u0000~\u0000\u0000\u0000{G%pp\u0000sq\u0000~\u0000\f\u0000{G\u001appsq\u0000~\u0000\u0014\u0000{G\u000fq\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0000{G\fq\u0000~\u0000\u0010"
+"pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000-net.sourceforge.czt.core.jaxb.gen.I"
+"mpliesPredq\u0000~\u0000%sq\u0000~\u0000\u0000\u0000{G%pp\u0000sq\u0000~\u0000\f\u0000{G\u001appsq\u0000~\u0000\u0014\u0000{G\u000fq\u0000~\u0000\u0010psq\u0000~"
+"\u0000\u0017\u0000{G\fq\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u00000net.sourceforge.czt.core"
+".jaxb.gen.QntPredElementq\u0000~\u0000%sq\u0000~\u0000\u0000\u0000{G%pp\u0000sq\u0000~\u0000\f\u0000{G\u001appsq\u0000~\u0000\u0014"
+"\u0000{G\u000fq\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0000{G\fq\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000-net.source"
+"forge.czt.core.jaxb.gen.FactElementq\u0000~\u0000%sq\u0000~\u0000\u0000\u0000{G%pp\u0000sq\u0000~\u0000\f\u0000"
+"{G\u001appsq\u0000~\u0000\u0014\u0000{G\u000fq\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0000{G\fq\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000"
+"-net.sourceforge.czt.core.jaxb.gen.Exists1Predq\u0000~\u0000%sq\u0000~\u0000\u0000\u0000{G"
+"%pp\u0000sq\u0000~\u0000\f\u0000{G\u001appsq\u0000~\u0000\u0014\u0000{G\u000fq\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0000{G\fq\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000"
+"~\u0000 sq\u0000~\u0000!t\u0000(net.sourceforge.czt.core.jaxb.gen.OrPredq\u0000~\u0000%sq\u0000"
+"~\u0000\u0000\u0000{G%pp\u0000sq\u0000~\u0000\f\u0000{G\u001appsq\u0000~\u0000\u0014\u0000{G\u000fq\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0000{G\fq\u0000~\u0000\u0010pq\u0000~\u0000\u001aq"
+"\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u00000net.sourceforge.czt.core.jaxb.gen.AndPredE"
+"lementq\u0000~\u0000%sq\u0000~\u0000\u0000\u0000{G%pp\u0000sq\u0000~\u0000\f\u0000{G\u001appsq\u0000~\u0000\u0014\u0000{G\u000fq\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0000{"
+"G\fq\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u00000net.sourceforge.czt.core.jax"
+"b.gen.NegPredElementq\u0000~\u0000%sq\u0000~\u0000\u0000\u0000{G%pp\u0000sq\u0000~\u0000\f\u0000{G\u001appsq\u0000~\u0000\u0014\u0000{G\u000f"
+"q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0000{G\fq\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000.net.sourceforg"
+"e.czt.core.jaxb.gen.Pred2Elementq\u0000~\u0000%sq\u0000~\u0000\u0000\u0000{G%pp\u0000sq\u0000~\u0000\f\u0000{G\u001a"
+"ppsq\u0000~\u0000\u0014\u0000{G\u000fq\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0000{G\fq\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000+ne"
+"t.sourceforge.czt.core.jaxb.gen.FalsePredq\u0000~\u0000%sq\u0000~\u0000\u0000\u0000{G%pp\u0000s"
+"q\u0000~\u0000\f\u0000{G\u001appsq\u0000~\u0000\u0014\u0000{G\u000fq\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0000{G\fq\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq"
+"\u0000~\u0000!t\u00001net.sourceforge.czt.core.jaxb.gen.ExprPredElementq\u0000~\u0000"
+"%sq\u0000~\u0000\f\u0007\u00b4rnppsq\u0000~\u0000\f\u00079+Gppsq\u0000~\u0000\f\u0006\u00bd\u00e4 ppsq\u0000~\u0000\f\u0006B\u009c\u00f9ppsq\u0000~\u0000\f\u0005\u00c7U\u00d2p"
+"psq\u0000~\u0000\f\u0005L\u000e\u00abppsq\u0000~\u0000\f\u0004\u00d0\u00c7\u0084ppsq\u0000~\u0000\f\u0004U\u0080]ppsq\u0000~\u0000\f\u0003\u00da96ppsq\u0000~\u0000\f\u0003^\u00f2\u000fp"
+"psq\u0000~\u0000\f\u0002\u00e3\u00aa\u00e8ppsq\u0000~\u0000\f\u0002hc\u00c1ppsq\u0000~\u0000\f\u0001\u00ed\u001c\u009appsq\u0000~\u0000\f\u0001q\u00d5sppsq\u0000~\u0000\f\u0000\u00f6\u008eLp"
+"psq\u0000~\u0000\u0000\u0000{G%pp\u0000sq\u0000~\u0000\f\u0000{G\u001appsq\u0000~\u0000\u0014\u0000{G\u000fq\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0000{G\fq\u0000~\u0000\u0010pq\u0000"
+"~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!q\u0000~\u0000Uq\u0000~\u0000%sq\u0000~\u0000\u0000\u0000{G%pp\u0000sq\u0000~\u0000\f\u0000{G\u001appsq\u0000~\u0000\u0014"
+"\u0000{G\u000fq\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0000{G\fq\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!q\u0000~\u0000[q\u0000~\u0000%sq\u0000"
+"~\u0000\u0000\u0000{G%pp\u0000sq\u0000~\u0000\f\u0000{G\u001appsq\u0000~\u0000\u0014\u0000{G\u000fq\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0000{G\fq\u0000~\u0000\u0010pq\u0000~\u0000\u001aq"
+"\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!q\u0000~\u0000aq\u0000~\u0000%sq\u0000~\u0000\u0000\u0000{G%pp\u0000sq\u0000~\u0000\f\u0000{G\u001appsq\u0000~\u0000\u0014\u0000{G\u000f"
+"q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0000{G\fq\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!q\u0000~\u0000gq\u0000~\u0000%sq\u0000~\u0000\u0000\u0000"
+"{G%pp\u0000sq\u0000~\u0000\f\u0000{G\u001appsq\u0000~\u0000\u0014\u0000{G\u000fq\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0000{G\fq\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001e"
+"q\u0000~\u0000 sq\u0000~\u0000!q\u0000~\u0000mq\u0000~\u0000%sq\u0000~\u0000\u0000\u0000{G%pp\u0000sq\u0000~\u0000\f\u0000{G\u001appsq\u0000~\u0000\u0014\u0000{G\u000fq\u0000~\u0000"
+"\u0010psq\u0000~\u0000\u0017\u0000{G\fq\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!q\u0000~\u0000sq\u0000~\u0000%sq\u0000~\u0000\u0000\u0000{G%p"
+"p\u0000sq\u0000~\u0000\f\u0000{G\u001appsq\u0000~\u0000\u0014\u0000{G\u000fq\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0000{G\fq\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000"
+" sq\u0000~\u0000!q\u0000~\u0000yq\u0000~\u0000%sq\u0000~\u0000\u0000\u0000{G%pp\u0000sq\u0000~\u0000\f\u0000{G\u001appsq\u0000~\u0000\u0014\u0000{G\u000fq\u0000~\u0000\u0010psq"
+"\u0000~\u0000\u0017\u0000{G\fq\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!q\u0000~\u0000\u007fq\u0000~\u0000%sq\u0000~\u0000\u0000\u0000{G%pp\u0000sq"
+"\u0000~\u0000\f\u0000{G\u001appsq\u0000~\u0000\u0014\u0000{G\u000fq\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0000{G\fq\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000"
+"~\u0000!q\u0000~\u0000\u0085q\u0000~\u0000%sq\u0000~\u0000\u0000\u0000{G%pp\u0000sq\u0000~\u0000\f\u0000{G\u001appsq\u0000~\u0000\u0014\u0000{G\u000fq\u0000~\u0000\u0010psq\u0000~\u0000\u0017"
+"\u0000{G\fq\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!q\u0000~\u0000\u008bq\u0000~\u0000%sq\u0000~\u0000\u0000\u0000{G%pp\u0000sq\u0000~\u0000\f"
+"\u0000{G\u001appsq\u0000~\u0000\u0014\u0000{G\u000fq\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0000{G\fq\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!q"
+"\u0000~\u0000\u0091q\u0000~\u0000%sq\u0000~\u0000\u0000\u0000{G%pp\u0000sq\u0000~\u0000\f\u0000{G\u001appsq\u0000~\u0000\u0014\u0000{G\u000fq\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0000{G\f"
+"q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!q\u0000~\u0000\u0097q\u0000~\u0000%sq\u0000~\u0000\u0000\u0000{G%pp\u0000sq\u0000~\u0000\f\u0000{G\u001a"
+"ppsq\u0000~\u0000\u0014\u0000{G\u000fq\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0000{G\fq\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!q\u0000~\u0000\u009d"
+"q\u0000~\u0000%sq\u0000~\u0000\u0000\u0000{G%pp\u0000sq\u0000~\u0000\f\u0000{G\u001appsq\u0000~\u0000\u0014\u0000{G\u000fq\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0000{G\fq\u0000~\u0000"
+"\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!q\u0000~\u0000\u00a3q\u0000~\u0000%sq\u0000~\u0000\u0000\u0000{G%pp\u0000sq\u0000~\u0000\f\u0000{G\u001appsq"
+"\u0000~\u0000\u0014\u0000{G\u000fq\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0000{G\fq\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!q\u0000~\u0000\u00a9q\u0000~\u0000"
+"%sq\u0000~\u0000\u0000\u0000{G%pp\u0000sq\u0000~\u0000\f\u0000{G\u001appsq\u0000~\u0000\u0014\u0000{G\u000fq\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0000{G\fq\u0000~\u0000\u0010pq\u0000"
+"~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!q\u0000~\u0000\u00afq\u0000~\u0000%sq\u0000~\u0000\f\u0002\u0006\u00a8dppsq\u0000~\u0000\u0017\u0002\u0006\u00a8Yq\u0000~\u0000\u0010pq\u0000~"
+"\u0000+sq\u0000~\u0000!q\u0000~\u0000<q\u0000~\u0000=q\u0000~\u0000 sq\u0000~\u0000!t\u0000\u000bImpliesPredq\u0000~\u0000@sr\u0000\"com.sun."
+"msv.grammar.ExpressionPool\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\bexpTablet\u0000/Lcom/sun/"
+"msv/grammar/ExpressionPool$ClosedHash;xpsr\u0000-com.sun.msv.gram"
+"mar.ExpressionPool$ClosedHash\u00d7j\u00d0N\u00ef\u00e8\u00ed\u001c\u0002\u0000\u0004I\u0000\u0005countI\u0000\tthreshold"
+"L\u0000\u0006parentq\u0000~\u0001\u0015[\u0000\u0005tablet\u0000![Lcom/sun/msv/grammar/Expression;xp"
+"\u0000\u0000\u0000g\u0000\u0000\u0000rpur\u0000![Lcom.sun.msv.grammar.Expression;\u00d68D\u00c3]\u00ad\u00a7\n\u0002\u0000\u0000xp\u0000"
+"\u0000\u0001\u007fpppppppppppppppppq\u0000~\u0000Fq\u0000~\u0000\u00b5pppppppppppppppppppq\u0000~\u0000Nq\u0000~\u0000\u00bdp"
+"ppppppppppppppppq\u0000~\u0000Cq\u0000~\u0000\u00b2pppppppppppppppppppq\u0000~\u0000Kq\u0000~\u0000\u00bapppq\u0000"
+"~\u0000\npppppppppppppppppppppppppppppppppq\u0000~\u0000\u00c6q\u0000~\u0000Hq\u0000~\u0000\u00c1q\u0000~\u0000\u00acq\u0000~\u0000"
+"\u00a6q\u0000~\u0000\u000bq\u0000~\u0000\u00a0q\u0000~\u0000\u009aq\u0000~\u0000\u0094q\u0000~\u0000\u008eq\u0000~\u0000\u0088q\u0000~\u0000\u00c5q\u0000~\u0000\u00c0q\u0000~\u0000\u00abq\u0000~\u0000\u00a5q\u0000~\u0000\u009fq\u0000~\u0000"
+"\u0099q\u0000~\u0000\u0093q\u0000~\u0000\u008dq\u0000~\u0000\u0087q\u0000~\u0000\u0081q\u0000~\u0000{q\u0000~\u0000uq\u0000~\u0000oq\u0000~\u0000iq\u0000~\u0000cq\u0000~\u0000]q\u0000~\u0000Wq\u0000~\u0000"
+"Qq\u0000~\u0000\u0011q\u0000~\u0000\u0013q\u0000~\u0000\u0082q\u0000~\u0000|q\u0000~\u0000vq\u0000~\u0000pq\u0000~\u0000jq\u0000~\u0000dq\u0000~\u0000^q\u0000~\u0000Xq\u0000~\u0000Rq\u0000~\u0000"
+"\u0016q\u0000~\u0000Eq\u0000~\u0000\u00cbq\u0000~\u0000\u00caq\u0000~\u0000\rq\u0000~\u0000\u00d0q\u0000~\u0000\u00cfq\u0000~\u0000\u00d5q\u0000~\u0000\u00d4q\u0000~\u0000\u00daq\u0000~\u0000\u00d9q\u0000~\u0000\u00dfq\u0000~\u0000"
+"\u00deq\u0000~\u0000\u00e4q\u0000~\u0000\u00e3q\u0000~\u0000\u00e9q\u0000~\u0000\u00e8q\u0000~\u0000\u00b7q\u0000~\u0000\u00eeq\u0000~\u0000\u00edq\u0000~\u0000\u00f3q\u0000~\u0000\u00f2q\u0000~\u0000Mq\u0000~\u0000\u00bcq\u0000~\u0000"
+"\u00f8q\u0000~\u0000\u00f7q\u0000~\u0000\u00b4q\u0000~\u0000\u00fdq\u0000~\u0000\u00fcq\u0000~\u0001\u0002q\u0000~\u0001\u0001q\u0000~\u0001\u0007q\u0000~\u0001\u0006q\u0000~\u0001\fq\u0000~\u0001\u000bppppppq\u0000~"
+"\u0000Bq\u0000~\u0000\u00b1pppppppppppppppppppq\u0000~\u0000Jq\u0000~\u0000\u00b9pppppppppppppppppppppppp"
+"ppppppppppppppq\u0000~\u0000Gq\u0000~\u0000\u00b6pppppppppppq\u0000~\u0001\u000fpppppppq\u0000~\u0000Oq\u0000~\u0000\u00beppp"
+"ppppppppppppppq\u0000~\u0000Dq\u0000~\u0000\u00b3pppppppppppppppppppq\u0000~\u0000Lq\u0000~\u0000\u00bbppppppp"
+"ppppppppppq\u0000~\u0000Aq\u0000~\u0000\u00b0pppppppppppppppppppq\u0000~\u0000Iq\u0000~\u0000\u00b8q\u0000~\u0000\tpppppp"
+"pppppppppq\u0000~\u0000&pppp"));
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
            return net.sourceforge.czt.core.jaxb.gen.impl.ImpliesPredImpl.this;
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
                    case  1 :
                        if (("Anns" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.core.jaxb.gen.impl.Pred2Impl)net.sourceforge.czt.core.jaxb.gen.impl.ImpliesPredImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("ExistsPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.core.jaxb.gen.impl.Pred2Impl)net.sourceforge.czt.core.jaxb.gen.impl.ImpliesPredImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("ForallPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.core.jaxb.gen.impl.Pred2Impl)net.sourceforge.czt.core.jaxb.gen.impl.ImpliesPredImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("MemPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.core.jaxb.gen.impl.Pred2Impl)net.sourceforge.czt.core.jaxb.gen.impl.ImpliesPredImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("TruePred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.core.jaxb.gen.impl.Pred2Impl)net.sourceforge.czt.core.jaxb.gen.impl.ImpliesPredImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("JokerPred" == ___local)&&("http://czt.sourceforge.net/zpatt" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.core.jaxb.gen.impl.Pred2Impl)net.sourceforge.czt.core.jaxb.gen.impl.ImpliesPredImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("IffPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.core.jaxb.gen.impl.Pred2Impl)net.sourceforge.czt.core.jaxb.gen.impl.ImpliesPredImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("ImpliesPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.core.jaxb.gen.impl.Pred2Impl)net.sourceforge.czt.core.jaxb.gen.impl.ImpliesPredImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("QntPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.core.jaxb.gen.impl.Pred2Impl)net.sourceforge.czt.core.jaxb.gen.impl.ImpliesPredImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("Fact" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.core.jaxb.gen.impl.Pred2Impl)net.sourceforge.czt.core.jaxb.gen.impl.ImpliesPredImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("Exists1Pred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.core.jaxb.gen.impl.Pred2Impl)net.sourceforge.czt.core.jaxb.gen.impl.ImpliesPredImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("OrPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.core.jaxb.gen.impl.Pred2Impl)net.sourceforge.czt.core.jaxb.gen.impl.ImpliesPredImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("AndPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.core.jaxb.gen.impl.Pred2Impl)net.sourceforge.czt.core.jaxb.gen.impl.ImpliesPredImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("NegPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.core.jaxb.gen.impl.Pred2Impl)net.sourceforge.czt.core.jaxb.gen.impl.ImpliesPredImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("Pred2" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.core.jaxb.gen.impl.Pred2Impl)net.sourceforge.czt.core.jaxb.gen.impl.ImpliesPredImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("FalsePred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.core.jaxb.gen.impl.Pred2Impl)net.sourceforge.czt.core.jaxb.gen.impl.ImpliesPredImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("ExprPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.core.jaxb.gen.impl.Pred2Impl)net.sourceforge.czt.core.jaxb.gen.impl.ImpliesPredImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("Pred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.core.jaxb.gen.impl.Pred2Impl)net.sourceforge.czt.core.jaxb.gen.impl.ImpliesPredImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("Pred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.core.jaxb.gen.impl.Pred2Impl)net.sourceforge.czt.core.jaxb.gen.impl.ImpliesPredImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        spawnHandlerFromEnterElement((((net.sourceforge.czt.core.jaxb.gen.impl.Pred2Impl)net.sourceforge.czt.core.jaxb.gen.impl.ImpliesPredImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                        return ;
                    case  0 :
                        if (("ImpliesPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
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
                    case  3 :
                        revertToParentFromLeaveElement(___uri, ___local, ___qname);
                        return ;
                    case  2 :
                        if (("ImpliesPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            context.popAttributes();
                            state = 3;
                            return ;
                        }
                        break;
                    case  1 :
                        spawnHandlerFromLeaveElement((((net.sourceforge.czt.core.jaxb.gen.impl.Pred2Impl)net.sourceforge.czt.core.jaxb.gen.impl.ImpliesPredImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
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
                        spawnHandlerFromEnterAttribute((((net.sourceforge.czt.core.jaxb.gen.impl.Pred2Impl)net.sourceforge.czt.core.jaxb.gen.impl.ImpliesPredImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
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
                        spawnHandlerFromLeaveAttribute((((net.sourceforge.czt.core.jaxb.gen.impl.Pred2Impl)net.sourceforge.czt.core.jaxb.gen.impl.ImpliesPredImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
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
                            spawnHandlerFromText((((net.sourceforge.czt.core.jaxb.gen.impl.Pred2Impl)net.sourceforge.czt.core.jaxb.gen.impl.ImpliesPredImpl.this).new Unmarshaller(context)), 2, value);
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
