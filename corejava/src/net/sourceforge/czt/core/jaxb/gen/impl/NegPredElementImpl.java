//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.2-b15-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2003.10.28 at 04:14:13 NZDT 
//


package net.sourceforge.czt.core.jaxb.gen.impl;

public class NegPredElementImpl
    extends net.sourceforge.czt.core.jaxb.gen.impl.NegPredImpl
    implements net.sourceforge.czt.core.jaxb.gen.NegPredElement, com.sun.xml.bind.RIElement, com.sun.xml.bind.JAXBObject, net.sourceforge.czt.core.jaxb.gen.impl.runtime.UnmarshallableObject, net.sourceforge.czt.core.jaxb.gen.impl.runtime.XMLSerializable, net.sourceforge.czt.core.jaxb.gen.impl.runtime.ValidatableObject
{

    public final static java.lang.Class version = (net.sourceforge.czt.core.jaxb.gen.impl.JAXBVersion.class);
    private static com.sun.msv.grammar.Grammar schemaFragment;

    private final static java.lang.Class PRIMARY_INTERFACE_CLASS() {
        return (net.sourceforge.czt.core.jaxb.gen.NegPredElement.class);
    }

    public java.lang.String ____jaxb_ri____getNamespaceURI() {
        return "http://czt.sourceforge.net/zml";
    }

    public java.lang.String ____jaxb_ri____getLocalName() {
        return "NegPred";
    }

    public net.sourceforge.czt.core.jaxb.gen.impl.runtime.UnmarshallingEventHandler createUnmarshaller(net.sourceforge.czt.core.jaxb.gen.impl.runtime.UnmarshallingContext context) {
        return new net.sourceforge.czt.core.jaxb.gen.impl.NegPredElementImpl.Unmarshaller(context);
    }

    public void serializeBody(net.sourceforge.czt.core.jaxb.gen.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        context.startElement("http://czt.sourceforge.net/zml", "NegPred");
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
        return (net.sourceforge.czt.core.jaxb.gen.NegPredElement.class);
    }

    public com.sun.msv.verifier.DocumentDeclaration createRawValidator() {
        if (schemaFragment == null) {
            schemaFragment = com.sun.xml.bind.validator.SchemaDeserializer.deserialize((
 "\u00ac\u00ed\u0000\u0005sr\u0000\'com.sun.msv.grammar.trex.ElementPattern\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000"
+"\tnameClasst\u0000\u001fLcom/sun/msv/grammar/NameClass;xr\u0000\u001ecom.sun.msv."
+"grammar.ElementExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002Z\u0000\u001aignoreUndeclaredAttributesL\u0000"
+"\fcontentModelt\u0000 Lcom/sun/msv/grammar/Expression;xr\u0000\u001ecom.sun."
+"msv.grammar.Expression\u00f8\u0018\u0082\u00e8N5~O\u0002\u0000\u0003I\u0000\u000ecachedHashCodeL\u0000\u0013epsilon"
+"Reducibilityt\u0000\u0013Ljava/lang/Boolean;L\u0000\u000bexpandedExpq\u0000~\u0000\u0003xp\r$m\u00fbp"
+"p\u0000sr\u0000\u001fcom.sun.msv.grammar.SequenceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun."
+"msv.grammar.BinaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0004exp1q\u0000~\u0000\u0003L\u0000\u0004exp2q\u0000~\u0000\u0003xq\u0000~"
+"\u0000\u0004\r$m\u00f0ppsq\u0000~\u0000\u0007\u000b*-\u008dppsr\u0000\u001dcom.sun.msv.grammar.ChoiceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000"
+"\u0001\u0002\u0000\u0000xq\u0000~\u0000\b\u0003u\u00bb\u001appsq\u0000~\u0000\u0000\u0003u\u00bb\u000fsr\u0000\u0011java.lang.Boolean\u00cd r\u0080\u00d5\u009c\u00fa\u00ee\u0002\u0000\u0001Z\u0000"
+"\u0005valuexp\u0000p\u0000sq\u0000~\u0000\u0007\u0003u\u00bb\u0004ppsq\u0000~\u0000\u0000\u0000{G%pp\u0000sq\u0000~\u0000\u000b\u0000{G\u001appsr\u0000 com.sun."
+"msv.grammar.OneOrMoreExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001ccom.sun.msv.grammar.U"
+"naryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\u0003expq\u0000~\u0000\u0003xq\u0000~\u0000\u0004\u0000{G\u000fq\u0000~\u0000\u000fpsr\u0000 com.sun.msv"
+".grammar.AttributeExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003expq\u0000~\u0000\u0003L\u0000\tnameClassq\u0000~\u0000\u0001"
+"xq\u0000~\u0000\u0004\u0000{G\fq\u0000~\u0000\u000fpsr\u00002com.sun.msv.grammar.Expression$AnyString"
+"Expression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004\u0000\u0000\u0000\bsq\u0000~\u0000\u000e\u0001q\u0000~\u0000\u0019sr\u0000 com.sun.msv.g"
+"rammar.AnyNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun.msv.grammar.NameCl"
+"ass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com.sun.msv.grammar.Expression$EpsilonEx"
+"pression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004\u0000\u0000\u0000\tq\u0000~\u0000\u001aq\u0000~\u0000\u001fsr\u0000#com.sun.msv.gramm"
+"ar.SimpleNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\tlocalNamet\u0000\u0012Ljava/lang/Strin"
+"g;L\u0000\fnamespaceURIq\u0000~\u0000!xq\u0000~\u0000\u001ct\u00000net.sourceforge.czt.core.jaxb"
+".gen.TermA.AnnsTypet\u0000+http://java.sun.com/jaxb/xjc/dummy-ele"
+"mentssq\u0000~\u0000\u000b\u0002\u00fas\u00dappsq\u0000~\u0000\u0016\u0002\u00fas\u00cfq\u0000~\u0000\u000fpsr\u0000\u001bcom.sun.msv.grammar.Dat"
+"aExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\u0002dtt\u0000\u001fLorg/relaxng/datatype/Datatype;L\u0000\u0006exc"
+"eptq\u0000~\u0000\u0003L\u0000\u0004namet\u0000\u001dLcom/sun/msv/util/StringPair;xq\u0000~\u0000\u0004\u0001d\u00b9\u00c6pps"
+"r\u0000\"com.sun.msv.datatype.xsd.QnameType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000*com.sun."
+"msv.datatype.xsd.BuiltinAtomicType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000%com.sun.msv"
+".datatype.xsd.ConcreteType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\'com.sun.msv.datatyp"
+"e.xsd.XSDatatypeImpl\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\fnamespaceUriq\u0000~\u0000!L\u0000\btypeNa"
+"meq\u0000~\u0000!L\u0000\nwhiteSpacet\u0000.Lcom/sun/msv/datatype/xsd/WhiteSpaceP"
+"rocessor;xpt\u0000 http://www.w3.org/2001/XMLSchemat\u0000\u0005QNamesr\u00005co"
+"m.sun.msv.datatype.xsd.WhiteSpaceProcessor$Collapse\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002"
+"\u0000\u0000xr\u0000,com.sun.msv.datatype.xsd.WhiteSpaceProcessor\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000"
+"\u0000xpsr\u00000com.sun.msv.grammar.Expression$NullSetExpression\u0000\u0000\u0000\u0000\u0000"
+"\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004\u0000\u0000\u0000\nq\u0000~\u0000\u000fpsr\u0000\u001bcom.sun.msv.util.StringPair\u00d0t\u001ejB\u008f\u008d"
+"\u00a0\u0002\u0000\u0002L\u0000\tlocalNameq\u0000~\u0000!L\u0000\fnamespaceURIq\u0000~\u0000!xpq\u0000~\u00002q\u0000~\u00001sq\u0000~\u0000 t"
+"\u0000\u0004typet\u0000)http://www.w3.org/2001/XMLSchema-instanceq\u0000~\u0000\u001fsq\u0000~\u0000"
+" t\u0000\u0004Annst\u0000\u001ehttp://czt.sourceforge.net/zmlq\u0000~\u0000\u001fsq\u0000~\u0000\u000b\u0007\u00b4rnppsq"
+"\u0000~\u0000\u000b\u00079+Gppsq\u0000~\u0000\u000b\u0006\u00bd\u00e4 ppsq\u0000~\u0000\u000b\u0006B\u009c\u00f9ppsq\u0000~\u0000\u000b\u0005\u00c7U\u00d2ppsq\u0000~\u0000\u000b\u0005L\u000e\u00abppsq"
+"\u0000~\u0000\u000b\u0004\u00d0\u00c7\u0084ppsq\u0000~\u0000\u000b\u0004U\u0080]ppsq\u0000~\u0000\u000b\u0003\u00da96ppsq\u0000~\u0000\u000b\u0003^\u00f2\u000fppsq\u0000~\u0000\u000b\u0002\u00e3\u00aa\u00e8ppsq"
+"\u0000~\u0000\u000b\u0002hc\u00c1ppsq\u0000~\u0000\u000b\u0001\u00ed\u001c\u009appsq\u0000~\u0000\u000b\u0001q\u00d5sppsq\u0000~\u0000\u000b\u0000\u00f6\u008eLppsq\u0000~\u0000\u0000\u0000{G%pp\u0000s"
+"q\u0000~\u0000\u000b\u0000{G\u001appsq\u0000~\u0000\u0013\u0000{G\u000fq\u0000~\u0000\u000fpsq\u0000~\u0000\u0016\u0000{G\fq\u0000~\u0000\u000fpq\u0000~\u0000\u0019q\u0000~\u0000\u001dq\u0000~\u0000\u001fsq"
+"\u0000~\u0000 t\u0000,net.sourceforge.czt.core.jaxb.gen.ExistsPredq\u0000~\u0000$sq\u0000~"
+"\u0000\u0000\u0000{G%pp\u0000sq\u0000~\u0000\u000b\u0000{G\u001appsq\u0000~\u0000\u0013\u0000{G\u000fq\u0000~\u0000\u000fpsq\u0000~\u0000\u0016\u0000{G\fq\u0000~\u0000\u000fpq\u0000~\u0000\u0019q\u0000"
+"~\u0000\u001dq\u0000~\u0000\u001fsq\u0000~\u0000 t\u0000,net.sourceforge.czt.core.jaxb.gen.ForallPre"
+"dq\u0000~\u0000$sq\u0000~\u0000\u0000\u0000{G%pp\u0000sq\u0000~\u0000\u000b\u0000{G\u001appsq\u0000~\u0000\u0013\u0000{G\u000fq\u0000~\u0000\u000fpsq\u0000~\u0000\u0016\u0000{G\fq\u0000~"
+"\u0000\u000fpq\u0000~\u0000\u0019q\u0000~\u0000\u001dq\u0000~\u0000\u001fsq\u0000~\u0000 t\u00000net.sourceforge.czt.core.jaxb.gen"
+".MemPredElementq\u0000~\u0000$sq\u0000~\u0000\u0000\u0000{G%pp\u0000sq\u0000~\u0000\u000b\u0000{G\u001appsq\u0000~\u0000\u0013\u0000{G\u000fq\u0000~\u0000\u000f"
+"psq\u0000~\u0000\u0016\u0000{G\fq\u0000~\u0000\u000fpq\u0000~\u0000\u0019q\u0000~\u0000\u001dq\u0000~\u0000\u001fsq\u0000~\u0000 t\u0000*net.sourceforge.czt"
+".core.jaxb.gen.TruePredq\u0000~\u0000$sq\u0000~\u0000\u0000\u0000{G%pp\u0000sq\u0000~\u0000\u000b\u0000{G\u001appsq\u0000~\u0000\u0013\u0000"
+"{G\u000fq\u0000~\u0000\u000fpsq\u0000~\u0000\u0016\u0000{G\fq\u0000~\u0000\u000fpq\u0000~\u0000\u0019q\u0000~\u0000\u001dq\u0000~\u0000\u001fsq\u0000~\u0000 t\u00003net.sourcef"
+"orge.czt.zpatt.jaxb.gen.JokerPredElementq\u0000~\u0000$sq\u0000~\u0000\u0000\u0000{G%pp\u0000sq"
+"\u0000~\u0000\u000b\u0000{G\u001appsq\u0000~\u0000\u0013\u0000{G\u000fq\u0000~\u0000\u000fpsq\u0000~\u0000\u0016\u0000{G\fq\u0000~\u0000\u000fpq\u0000~\u0000\u0019q\u0000~\u0000\u001dq\u0000~\u0000\u001fsq\u0000"
+"~\u0000 t\u0000)net.sourceforge.czt.core.jaxb.gen.IffPredq\u0000~\u0000$sq\u0000~\u0000\u0000\u0000{"
+"G%pp\u0000sq\u0000~\u0000\u000b\u0000{G\u001appsq\u0000~\u0000\u0013\u0000{G\u000fq\u0000~\u0000\u000fpsq\u0000~\u0000\u0016\u0000{G\fq\u0000~\u0000\u000fpq\u0000~\u0000\u0019q\u0000~\u0000\u001dq"
+"\u0000~\u0000\u001fsq\u0000~\u0000 t\u0000-net.sourceforge.czt.core.jaxb.gen.ImpliesPredq\u0000"
+"~\u0000$sq\u0000~\u0000\u0000\u0000{G%pp\u0000sq\u0000~\u0000\u000b\u0000{G\u001appsq\u0000~\u0000\u0013\u0000{G\u000fq\u0000~\u0000\u000fpsq\u0000~\u0000\u0016\u0000{G\fq\u0000~\u0000\u000fp"
+"q\u0000~\u0000\u0019q\u0000~\u0000\u001dq\u0000~\u0000\u001fsq\u0000~\u0000 t\u00000net.sourceforge.czt.core.jaxb.gen.Qn"
+"tPredElementq\u0000~\u0000$sq\u0000~\u0000\u0000\u0000{G%pp\u0000sq\u0000~\u0000\u000b\u0000{G\u001appsq\u0000~\u0000\u0013\u0000{G\u000fq\u0000~\u0000\u000fpsq"
+"\u0000~\u0000\u0016\u0000{G\fq\u0000~\u0000\u000fpq\u0000~\u0000\u0019q\u0000~\u0000\u001dq\u0000~\u0000\u001fsq\u0000~\u0000 t\u0000-net.sourceforge.czt.co"
+"re.jaxb.gen.FactElementq\u0000~\u0000$sq\u0000~\u0000\u0000\u0000{G%pp\u0000sq\u0000~\u0000\u000b\u0000{G\u001appsq\u0000~\u0000\u0013\u0000"
+"{G\u000fq\u0000~\u0000\u000fpsq\u0000~\u0000\u0016\u0000{G\fq\u0000~\u0000\u000fpq\u0000~\u0000\u0019q\u0000~\u0000\u001dq\u0000~\u0000\u001fsq\u0000~\u0000 t\u0000-net.sourcef"
+"orge.czt.core.jaxb.gen.Exists1Predq\u0000~\u0000$sq\u0000~\u0000\u0000\u0000{G%pp\u0000sq\u0000~\u0000\u000b\u0000{"
+"G\u001appsq\u0000~\u0000\u0013\u0000{G\u000fq\u0000~\u0000\u000fpsq\u0000~\u0000\u0016\u0000{G\fq\u0000~\u0000\u000fpq\u0000~\u0000\u0019q\u0000~\u0000\u001dq\u0000~\u0000\u001fsq\u0000~\u0000 t\u0000("
+"net.sourceforge.czt.core.jaxb.gen.OrPredq\u0000~\u0000$sq\u0000~\u0000\u0000\u0000{G%pp\u0000sq"
+"\u0000~\u0000\u000b\u0000{G\u001appsq\u0000~\u0000\u0013\u0000{G\u000fq\u0000~\u0000\u000fpsq\u0000~\u0000\u0016\u0000{G\fq\u0000~\u0000\u000fpq\u0000~\u0000\u0019q\u0000~\u0000\u001dq\u0000~\u0000\u001fsq\u0000"
+"~\u0000 t\u00000net.sourceforge.czt.core.jaxb.gen.AndPredElementq\u0000~\u0000$s"
+"q\u0000~\u0000\u0000\u0000{G%pp\u0000sq\u0000~\u0000\u000b\u0000{G\u001appsq\u0000~\u0000\u0013\u0000{G\u000fq\u0000~\u0000\u000fpsq\u0000~\u0000\u0016\u0000{G\fq\u0000~\u0000\u000fpq\u0000~\u0000"
+"\u0019q\u0000~\u0000\u001dq\u0000~\u0000\u001fsq\u0000~\u0000 t\u00000net.sourceforge.czt.core.jaxb.gen.NegPre"
+"dElementq\u0000~\u0000$sq\u0000~\u0000\u0000\u0000{G%pp\u0000sq\u0000~\u0000\u000b\u0000{G\u001appsq\u0000~\u0000\u0013\u0000{G\u000fq\u0000~\u0000\u000fpsq\u0000~\u0000\u0016"
+"\u0000{G\fq\u0000~\u0000\u000fpq\u0000~\u0000\u0019q\u0000~\u0000\u001dq\u0000~\u0000\u001fsq\u0000~\u0000 t\u0000.net.sourceforge.czt.core.j"
+"axb.gen.Pred2Elementq\u0000~\u0000$sq\u0000~\u0000\u0000\u0000{G%pp\u0000sq\u0000~\u0000\u000b\u0000{G\u001appsq\u0000~\u0000\u0013\u0000{G\u000f"
+"q\u0000~\u0000\u000fpsq\u0000~\u0000\u0016\u0000{G\fq\u0000~\u0000\u000fpq\u0000~\u0000\u0019q\u0000~\u0000\u001dq\u0000~\u0000\u001fsq\u0000~\u0000 t\u0000+net.sourceforg"
+"e.czt.core.jaxb.gen.FalsePredq\u0000~\u0000$sq\u0000~\u0000\u0000\u0000{G%pp\u0000sq\u0000~\u0000\u000b\u0000{G\u001apps"
+"q\u0000~\u0000\u0013\u0000{G\u000fq\u0000~\u0000\u000fpsq\u0000~\u0000\u0016\u0000{G\fq\u0000~\u0000\u000fpq\u0000~\u0000\u0019q\u0000~\u0000\u001dq\u0000~\u0000\u001fsq\u0000~\u0000 t\u00001net.s"
+"ourceforge.czt.core.jaxb.gen.ExprPredElementq\u0000~\u0000$sq\u0000~\u0000\u000b\u0001\u00fa@^p"
+"psq\u0000~\u0000\u0016\u0001\u00fa@Sq\u0000~\u0000\u000fpq\u0000~\u0000*sq\u0000~\u0000 q\u0000~\u0000;q\u0000~\u0000<q\u0000~\u0000\u001fsq\u0000~\u0000 t\u0000\u0007NegPredq"
+"\u0000~\u0000?sr\u0000\"com.sun.msv.grammar.ExpressionPool\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\bexpT"
+"ablet\u0000/Lcom/sun/msv/grammar/ExpressionPool$ClosedHash;xpsr\u0000-"
+"com.sun.msv.grammar.ExpressionPool$ClosedHash\u00d7j\u00d0N\u00ef\u00e8\u00ed\u001c\u0002\u0000\u0004I\u0000\u0005c"
+"ountI\u0000\tthresholdL\u0000\u0006parentq\u0000~\u0000\u00b5[\u0000\u0005tablet\u0000![Lcom/sun/msv/gramm"
+"ar/Expression;xp\u0000\u0000\u00007\u0000\u0000\u00009pur\u0000![Lcom.sun.msv.grammar.Expressio"
+"n;\u00d68D\u00c3]\u00ad\u00a7\n\u0002\u0000\u0000xp\u0000\u0000\u0000\u00bfpppppppq\u0000~\u0000%ppq\u0000~\u0000\u0015q\u0000~\u0000Qq\u0000~\u0000Wq\u0000~\u0000]q\u0000~\u0000cq\u0000"
+"~\u0000iq\u0000~\u0000oq\u0000~\u0000Jq\u0000~\u0000uq\u0000~\u0000{q\u0000~\u0000\u0081q\u0000~\u0000\u0012q\u0000~\u0000Pq\u0000~\u0000Vq\u0000~\u0000\\q\u0000~\u0000bq\u0000~\u0000hq\u0000"
+"~\u0000nq\u0000~\u0000tq\u0000~\u0000zq\u0000~\u0000\u0080q\u0000~\u0000\u0087q\u0000~\u0000\u0086q\u0000~\u0000\u008dq\u0000~\u0000\u008cq\u0000~\u0000\u0093q\u0000~\u0000\u0092q\u0000~\u0000Dq\u0000~\u0000\u0099q\u0000"
+"~\u0000\u0098q\u0000~\u0000\u009fq\u0000~\u0000\u009eq\u0000~\u0000\u00a5q\u0000~\u0000\u00a4q\u0000~\u0000\u0010q\u0000~\u0000Iq\u0000~\u0000\u00abq\u0000~\u0000\u00aaq\u0000~\u0000\nq\u0000~\u0000\u00afppppppp"
+"pq\u0000~\u0000Cpppppppq\u0000~\u0000\fq\u0000~\u0000Npppppppppppq\u0000~\u0000Hppppq\u0000~\u0000\tpppppppq\u0000~\u0000B"
+"pppppppq\u0000~\u0000Mppppppppppppq\u0000~\u0000Gppppppppppppq\u0000~\u0000Apppppppq\u0000~\u0000Lpp"
+"ppppppppppq\u0000~\u0000Fppppppppppppq\u0000~\u0000@pppppppq\u0000~\u0000Kppppppppppppq\u0000~\u0000"
+"Eppppppppp"));
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
            return net.sourceforge.czt.core.jaxb.gen.impl.NegPredElementImpl.this;
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
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.core.jaxb.gen.impl.NegPredImpl)net.sourceforge.czt.core.jaxb.gen.impl.NegPredElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("ExistsPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.core.jaxb.gen.impl.NegPredImpl)net.sourceforge.czt.core.jaxb.gen.impl.NegPredElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("ForallPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.core.jaxb.gen.impl.NegPredImpl)net.sourceforge.czt.core.jaxb.gen.impl.NegPredElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("MemPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.core.jaxb.gen.impl.NegPredImpl)net.sourceforge.czt.core.jaxb.gen.impl.NegPredElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("TruePred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.core.jaxb.gen.impl.NegPredImpl)net.sourceforge.czt.core.jaxb.gen.impl.NegPredElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("JokerPred" == ___local)&&("http://czt.sourceforge.net/zpatt" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.core.jaxb.gen.impl.NegPredImpl)net.sourceforge.czt.core.jaxb.gen.impl.NegPredElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("IffPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.core.jaxb.gen.impl.NegPredImpl)net.sourceforge.czt.core.jaxb.gen.impl.NegPredElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("ImpliesPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.core.jaxb.gen.impl.NegPredImpl)net.sourceforge.czt.core.jaxb.gen.impl.NegPredElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("QntPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.core.jaxb.gen.impl.NegPredImpl)net.sourceforge.czt.core.jaxb.gen.impl.NegPredElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("Fact" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.core.jaxb.gen.impl.NegPredImpl)net.sourceforge.czt.core.jaxb.gen.impl.NegPredElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("Exists1Pred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.core.jaxb.gen.impl.NegPredImpl)net.sourceforge.czt.core.jaxb.gen.impl.NegPredElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("OrPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.core.jaxb.gen.impl.NegPredImpl)net.sourceforge.czt.core.jaxb.gen.impl.NegPredElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("AndPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.core.jaxb.gen.impl.NegPredImpl)net.sourceforge.czt.core.jaxb.gen.impl.NegPredElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("NegPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.core.jaxb.gen.impl.NegPredImpl)net.sourceforge.czt.core.jaxb.gen.impl.NegPredElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("Pred2" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.core.jaxb.gen.impl.NegPredImpl)net.sourceforge.czt.core.jaxb.gen.impl.NegPredElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("FalsePred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.core.jaxb.gen.impl.NegPredImpl)net.sourceforge.czt.core.jaxb.gen.impl.NegPredElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("ExprPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.core.jaxb.gen.impl.NegPredImpl)net.sourceforge.czt.core.jaxb.gen.impl.NegPredElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("Pred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.core.jaxb.gen.impl.NegPredImpl)net.sourceforge.czt.core.jaxb.gen.impl.NegPredElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("Pred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.core.jaxb.gen.impl.NegPredImpl)net.sourceforge.czt.core.jaxb.gen.impl.NegPredElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        spawnHandlerFromEnterElement((((net.sourceforge.czt.core.jaxb.gen.impl.NegPredImpl)net.sourceforge.czt.core.jaxb.gen.impl.NegPredElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                        return ;
                    case  3 :
                        revertToParentFromEnterElement(___uri, ___local, ___qname, __atts);
                        return ;
                    case  0 :
                        if (("NegPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
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
                        spawnHandlerFromLeaveElement((((net.sourceforge.czt.core.jaxb.gen.impl.NegPredImpl)net.sourceforge.czt.core.jaxb.gen.impl.NegPredElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
                        return ;
                    case  3 :
                        revertToParentFromLeaveElement(___uri, ___local, ___qname);
                        return ;
                    case  2 :
                        if (("NegPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
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
                        spawnHandlerFromEnterAttribute((((net.sourceforge.czt.core.jaxb.gen.impl.NegPredImpl)net.sourceforge.czt.core.jaxb.gen.impl.NegPredElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
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
                        spawnHandlerFromLeaveAttribute((((net.sourceforge.czt.core.jaxb.gen.impl.NegPredImpl)net.sourceforge.czt.core.jaxb.gen.impl.NegPredElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
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
                            spawnHandlerFromText((((net.sourceforge.czt.core.jaxb.gen.impl.NegPredImpl)net.sourceforge.czt.core.jaxb.gen.impl.NegPredElementImpl.this).new Unmarshaller(context)), 2, value);
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
