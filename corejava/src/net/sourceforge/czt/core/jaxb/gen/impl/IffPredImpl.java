//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.1-05/30/2003 05:06 AM(java_re)-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2003.08.25 at 03:03:07 NZST 
//


package net.sourceforge.czt.core.jaxb.gen.impl;

public class IffPredImpl
    extends net.sourceforge.czt.core.jaxb.gen.impl.Pred2Impl
    implements net.sourceforge.czt.core.jaxb.gen.IffPred, com.sun.xml.bind.JAXBObject, com.sun.xml.bind.RIElement, net.sourceforge.czt.core.jaxb.gen.impl.runtime.UnmarshallableObject, net.sourceforge.czt.core.jaxb.gen.impl.runtime.XMLSerializable, net.sourceforge.czt.core.jaxb.gen.impl.runtime.ValidatableObject
{

    public final static java.lang.Class version = (net.sourceforge.czt.core.jaxb.gen.impl.JAXBVersion.class);
    private static com.sun.msv.grammar.Grammar schemaFragment;

    public java.lang.String ____jaxb_ri____getNamespaceURI() {
        return "http://czt.sourceforge.net/zml";
    }

    public java.lang.String ____jaxb_ri____getLocalName() {
        return "IffPred";
    }

    private final static java.lang.Class PRIMARY_INTERFACE_CLASS() {
        return (net.sourceforge.czt.core.jaxb.gen.IffPred.class);
    }

    public net.sourceforge.czt.core.jaxb.gen.impl.runtime.UnmarshallingEventHandler createUnmarshaller(net.sourceforge.czt.core.jaxb.gen.impl.runtime.UnmarshallingContext context) {
        return new net.sourceforge.czt.core.jaxb.gen.impl.IffPredImpl.Unmarshaller(context);
    }

    public void serializeElementBody(net.sourceforge.czt.core.jaxb.gen.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        context.startElement("http://czt.sourceforge.net/zml", "IffPred");
        super.serializeURIs(context);
        context.endNamespaceDecls();
        super.serializeAttributes(context);
        context.endAttributes();
        super.serializeElementBody(context);
        context.endElement();
    }

    public void serializeAttributes(net.sourceforge.czt.core.jaxb.gen.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
    }

    public void serializeAttributeBody(net.sourceforge.czt.core.jaxb.gen.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        context.startElement("http://czt.sourceforge.net/zml", "IffPred");
        super.serializeURIs(context);
        context.endNamespaceDecls();
        super.serializeAttributes(context);
        context.endAttributes();
        super.serializeElementBody(context);
        context.endElement();
    }

    public void serializeURIs(net.sourceforge.czt.core.jaxb.gen.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
    }

    public java.lang.Class getPrimaryInterface() {
        return (net.sourceforge.czt.core.jaxb.gen.IffPred.class);
    }

    public com.sun.msv.verifier.DocumentDeclaration createRawValidator() {
        if (schemaFragment == null) {
            schemaFragment = com.sun.xml.bind.validator.SchemaDeserializer.deserialize((
 "\u00ac\u00ed\u0000\u0005sr\u0000\'com.sun.msv.grammar.trex.ElementPattern\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000"
+"\tnameClasst\u0000\u001fLcom/sun/msv/grammar/NameClass;xr\u0000\u001ecom.sun.msv."
+"grammar.ElementExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002Z\u0000\u001aignoreUndeclaredAttributesL\u0000"
+"\fcontentModelt\u0000 Lcom/sun/msv/grammar/Expression;xr\u0000\u001ecom.sun."
+"msv.grammar.Expression\u00f8\u0018\u0082\u00e8N5~O\u0002\u0000\u0003I\u0000\u000ecachedHashCodeL\u0000\u0013epsilon"
+"Reducibilityt\u0000\u0013Ljava/lang/Boolean;L\u0000\u000bexpandedExpq\u0000~\u0000\u0003xp\u001fB\u00dc\u0091p"
+"p\u0000sr\u0000\u001fcom.sun.msv.grammar.SequenceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun."
+"msv.grammar.BinaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0004exp1q\u0000~\u0000\u0003L\u0000\u0004exp2q\u0000~\u0000\u0003xq\u0000~"
+"\u0000\u0004\u001fB\u00dc\u0086ppsq\u0000~\u0000\u0007\u0010A|\u00f3ppsr\u0000\u001dcom.sun.msv.grammar.ChoiceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000"
+"\u0001\u0002\u0000\u0000xq\u0000~\u0000\b\u0001@\u001d`ppsq\u0000~\u0000\u0000\u0001@\u001dUsr\u0000\u0011java.lang.Boolean\u00cd r\u0080\u00d5\u009c\u00fa\u00ee\u0002\u0000\u0001Z\u0000"
+"\u0005valuexp\u0000p\u0000sq\u0000~\u0000\u0000\u0001@\u001dJpp\u0000sq\u0000~\u0000\u000b\u0001@\u001d?ppsr\u0000 com.sun.msv.grammar."
+"OneOrMoreExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001ccom.sun.msv.grammar.UnaryExp\u0000\u0000\u0000\u0000\u0000"
+"\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\u0003expq\u0000~\u0000\u0003xq\u0000~\u0000\u0004\u0001@\u001d4q\u0000~\u0000\u000fpsr\u0000 com.sun.msv.grammar.Att"
+"ributeExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003expq\u0000~\u0000\u0003L\u0000\tnameClassq\u0000~\u0000\u0001xq\u0000~\u0000\u0004\u0001@\u001d1q\u0000"
+"~\u0000\u000fpsr\u00002com.sun.msv.grammar.Expression$AnyStringExpression\u0000\u0000"
+"\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004\u0000\u0000\u0000\bsq\u0000~\u0000\u000e\u0001q\u0000~\u0000\u0018sr\u0000 com.sun.msv.grammar.AnyNa"
+"meClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun.msv.grammar.NameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002"
+"\u0000\u0000xpsr\u00000com.sun.msv.grammar.Expression$EpsilonExpression\u0000\u0000\u0000\u0000"
+"\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004\u0000\u0000\u0000\tq\u0000~\u0000\u0019q\u0000~\u0000\u001esr\u0000#com.sun.msv.grammar.SimpleNam"
+"eClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\tlocalNamet\u0000\u0012Ljava/lang/String;L\u0000\fnamespa"
+"ceURIq\u0000~\u0000 xq\u0000~\u0000\u001bt\u00000net.sourceforge.czt.core.jaxb.gen.TermA.A"
+"nnsTypet\u0000+http://java.sun.com/jaxb/xjc/dummy-elementssq\u0000~\u0000\u001ft"
+"\u0000\u0004Annst\u0000\u001ehttp://czt.sourceforge.net/zmlq\u0000~\u0000\u001esq\u0000~\u0000\u000b\u000f\u0001_\u008eppsq\u0000~"
+"\u0000\u000b\r\u00c1BBppsq\u0000~\u0000\u000b\f\u0081$\u00f6ppsq\u0000~\u0000\u000b\u000bA\u0007\u00aappsq\u0000~\u0000\u000b\n\u0000\u00ea^ppsq\u0000~\u0000\u000b\b\u00c0\u00cd\u0012ppsq\u0000~"
+"\u0000\u000b\u0007\u0080\u00af\u00c6ppsq\u0000~\u0000\u000b\u0006@\u0092zppsq\u0000~\u0000\u000b\u0005\u0000u.ppsq\u0000~\u0000\u000b\u0003\u00c0W\u00e2ppsq\u0000~\u0000\u000b\u0002\u0080:\u0096ppsq\u0000~"
+"\u0000\u0000\u0001@\u001dJpp\u0000sq\u0000~\u0000\u000b\u0001@\u001d?ppsq\u0000~\u0000\u0012\u0001@\u001d4q\u0000~\u0000\u000fpsq\u0000~\u0000\u0015\u0001@\u001d1q\u0000~\u0000\u000fpq\u0000~\u0000\u0018q\u0000"
+"~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000+net.sourceforge.czt.core.jaxb.gen.FalsePred"
+"q\u0000~\u0000#sq\u0000~\u0000\u0000\u0001@\u001dJpp\u0000sq\u0000~\u0000\u000b\u0001@\u001d?ppsq\u0000~\u0000\u0012\u0001@\u001d4q\u0000~\u0000\u000fpsq\u0000~\u0000\u0015\u0001@\u001d1q\u0000~\u0000"
+"\u000fpq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000*net.sourceforge.czt.core.jaxb.gen."
+"TruePredq\u0000~\u0000#sq\u0000~\u0000\u0000\u0001@\u001dJpp\u0000sq\u0000~\u0000\u000b\u0001@\u001d?ppsq\u0000~\u0000\u0012\u0001@\u001d4q\u0000~\u0000\u000fpsq\u0000~\u0000\u0015"
+"\u0001@\u001d1q\u0000~\u0000\u000fpq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u00000net.sourceforge.czt.core.j"
+"axb.gen.AndPredElementq\u0000~\u0000#sq\u0000~\u0000\u0000\u0001@\u001dJpp\u0000sq\u0000~\u0000\u000b\u0001@\u001d?ppsq\u0000~\u0000\u0012\u0001@"
+"\u001d4q\u0000~\u0000\u000fpsq\u0000~\u0000\u0015\u0001@\u001d1q\u0000~\u0000\u000fpq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000-net.sourcefo"
+"rge.czt.core.jaxb.gen.ImpliesPredq\u0000~\u0000#sq\u0000~\u0000\u0000\u0001@\u001dJpp\u0000sq\u0000~\u0000\u000b\u0001@\u001d"
+"?ppsq\u0000~\u0000\u0012\u0001@\u001d4q\u0000~\u0000\u000fpsq\u0000~\u0000\u0015\u0001@\u001d1q\u0000~\u0000\u000fpq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000)n"
+"et.sourceforge.czt.core.jaxb.gen.IffPredq\u0000~\u0000#sq\u0000~\u0000\u0000\u0001@\u001dJpp\u0000sq"
+"\u0000~\u0000\u000b\u0001@\u001d?ppsq\u0000~\u0000\u0012\u0001@\u001d4q\u0000~\u0000\u000fpsq\u0000~\u0000\u0015\u0001@\u001d1q\u0000~\u0000\u000fpq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000"
+"~\u0000\u001ft\u0000(net.sourceforge.czt.core.jaxb.gen.OrPredq\u0000~\u0000#sq\u0000~\u0000\u0000\u0001@\u001d"
+"Jpp\u0000sq\u0000~\u0000\u000b\u0001@\u001d?ppsq\u0000~\u0000\u0012\u0001@\u001d4q\u0000~\u0000\u000fpsq\u0000~\u0000\u0015\u0001@\u001d1q\u0000~\u0000\u000fpq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000"
+"~\u0000\u001esq\u0000~\u0000\u001ft\u0000,net.sourceforge.czt.core.jaxb.gen.ExistsPredq\u0000~\u0000"
+"#sq\u0000~\u0000\u0000\u0001@\u001dJpp\u0000sq\u0000~\u0000\u000b\u0001@\u001d?ppsq\u0000~\u0000\u0012\u0001@\u001d4q\u0000~\u0000\u000fpsq\u0000~\u0000\u0015\u0001@\u001d1q\u0000~\u0000\u000fpq\u0000"
+"~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000-net.sourceforge.czt.core.jaxb.gen.Exis"
+"ts1Predq\u0000~\u0000#sq\u0000~\u0000\u0000\u0001@\u001dJpp\u0000sq\u0000~\u0000\u000b\u0001@\u001d?ppsq\u0000~\u0000\u0012\u0001@\u001d4q\u0000~\u0000\u000fpsq\u0000~\u0000\u0015\u0001"
+"@\u001d1q\u0000~\u0000\u000fpq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000,net.sourceforge.czt.core.ja"
+"xb.gen.ForallPredq\u0000~\u0000#sq\u0000~\u0000\u0000\u0001@\u001dJpp\u0000sq\u0000~\u0000\u000b\u0001@\u001d?ppsq\u0000~\u0000\u0012\u0001@\u001d4q\u0000~"
+"\u0000\u000fpsq\u0000~\u0000\u0015\u0001@\u001d1q\u0000~\u0000\u000fpq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u00001net.sourceforge.c"
+"zt.core.jaxb.gen.ExprPredElementq\u0000~\u0000#sq\u0000~\u0000\u0000\u0001@\u001dJpp\u0000sq\u0000~\u0000\u000b\u0001@\u001d?"
+"ppsq\u0000~\u0000\u0012\u0001@\u001d4q\u0000~\u0000\u000fpsq\u0000~\u0000\u0015\u0001@\u001d1q\u0000~\u0000\u000fpq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u00000ne"
+"t.sourceforge.czt.core.jaxb.gen.MemPredElementq\u0000~\u0000#sq\u0000~\u0000\u0000\u0001@\u001d"
+"Jpp\u0000sq\u0000~\u0000\u000b\u0001@\u001d?ppsq\u0000~\u0000\u0012\u0001@\u001d4q\u0000~\u0000\u000fpsq\u0000~\u0000\u0015\u0001@\u001d1q\u0000~\u0000\u000fpq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000"
+"~\u0000\u001esq\u0000~\u0000\u001ft\u00000net.sourceforge.czt.core.jaxb.gen.NegPredElement"
+"q\u0000~\u0000#sq\u0000~\u0000\u000b\u000f\u0001_\u008eppsq\u0000~\u0000\u000b\r\u00c1BBppsq\u0000~\u0000\u000b\f\u0081$\u00f6ppsq\u0000~\u0000\u000b\u000bA\u0007\u00aappsq\u0000~\u0000\u000b\n"
+"\u0000\u00ea^ppsq\u0000~\u0000\u000b\b\u00c0\u00cd\u0012ppsq\u0000~\u0000\u000b\u0007\u0080\u00af\u00c6ppsq\u0000~\u0000\u000b\u0006@\u0092zppsq\u0000~\u0000\u000b\u0005\u0000u.ppsq\u0000~\u0000\u000b\u0003"
+"\u00c0W\u00e2ppsq\u0000~\u0000\u000b\u0002\u0080:\u0096ppsq\u0000~\u0000\u0000\u0001@\u001dJpp\u0000sq\u0000~\u0000\u000b\u0001@\u001d?ppsq\u0000~\u0000\u0012\u0001@\u001d4q\u0000~\u0000\u000fpsq"
+"\u0000~\u0000\u0015\u0001@\u001d1q\u0000~\u0000\u000fpq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001fq\u0000~\u00007q\u0000~\u0000#sq\u0000~\u0000\u0000\u0001@\u001dJpp\u0000sq"
+"\u0000~\u0000\u000b\u0001@\u001d?ppsq\u0000~\u0000\u0012\u0001@\u001d4q\u0000~\u0000\u000fpsq\u0000~\u0000\u0015\u0001@\u001d1q\u0000~\u0000\u000fpq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000"
+"~\u0000\u001fq\u0000~\u0000=q\u0000~\u0000#sq\u0000~\u0000\u0000\u0001@\u001dJpp\u0000sq\u0000~\u0000\u000b\u0001@\u001d?ppsq\u0000~\u0000\u0012\u0001@\u001d4q\u0000~\u0000\u000fpsq\u0000~\u0000\u0015"
+"\u0001@\u001d1q\u0000~\u0000\u000fpq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001fq\u0000~\u0000Cq\u0000~\u0000#sq\u0000~\u0000\u0000\u0001@\u001dJpp\u0000sq\u0000~\u0000\u000b"
+"\u0001@\u001d?ppsq\u0000~\u0000\u0012\u0001@\u001d4q\u0000~\u0000\u000fpsq\u0000~\u0000\u0015\u0001@\u001d1q\u0000~\u0000\u000fpq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001fq"
+"\u0000~\u0000Iq\u0000~\u0000#sq\u0000~\u0000\u0000\u0001@\u001dJpp\u0000sq\u0000~\u0000\u000b\u0001@\u001d?ppsq\u0000~\u0000\u0012\u0001@\u001d4q\u0000~\u0000\u000fpsq\u0000~\u0000\u0015\u0001@\u001d1"
+"q\u0000~\u0000\u000fpq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001fq\u0000~\u0000Oq\u0000~\u0000#sq\u0000~\u0000\u0000\u0001@\u001dJpp\u0000sq\u0000~\u0000\u000b\u0001@\u001d?"
+"ppsq\u0000~\u0000\u0012\u0001@\u001d4q\u0000~\u0000\u000fpsq\u0000~\u0000\u0015\u0001@\u001d1q\u0000~\u0000\u000fpq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001fq\u0000~\u0000U"
+"q\u0000~\u0000#sq\u0000~\u0000\u0000\u0001@\u001dJpp\u0000sq\u0000~\u0000\u000b\u0001@\u001d?ppsq\u0000~\u0000\u0012\u0001@\u001d4q\u0000~\u0000\u000fpsq\u0000~\u0000\u0015\u0001@\u001d1q\u0000~\u0000"
+"\u000fpq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001fq\u0000~\u0000[q\u0000~\u0000#sq\u0000~\u0000\u0000\u0001@\u001dJpp\u0000sq\u0000~\u0000\u000b\u0001@\u001d?ppsq"
+"\u0000~\u0000\u0012\u0001@\u001d4q\u0000~\u0000\u000fpsq\u0000~\u0000\u0015\u0001@\u001d1q\u0000~\u0000\u000fpq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001fq\u0000~\u0000aq\u0000~\u0000"
+"#sq\u0000~\u0000\u0000\u0001@\u001dJpp\u0000sq\u0000~\u0000\u000b\u0001@\u001d?ppsq\u0000~\u0000\u0012\u0001@\u001d4q\u0000~\u0000\u000fpsq\u0000~\u0000\u0015\u0001@\u001d1q\u0000~\u0000\u000fpq\u0000"
+"~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001fq\u0000~\u0000gq\u0000~\u0000#sq\u0000~\u0000\u0000\u0001@\u001dJpp\u0000sq\u0000~\u0000\u000b\u0001@\u001d?ppsq\u0000~\u0000\u0012"
+"\u0001@\u001d4q\u0000~\u0000\u000fpsq\u0000~\u0000\u0015\u0001@\u001d1q\u0000~\u0000\u000fpq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001fq\u0000~\u0000mq\u0000~\u0000#sq\u0000"
+"~\u0000\u0000\u0001@\u001dJpp\u0000sq\u0000~\u0000\u000b\u0001@\u001d?ppsq\u0000~\u0000\u0012\u0001@\u001d4q\u0000~\u0000\u000fpsq\u0000~\u0000\u0015\u0001@\u001d1q\u0000~\u0000\u000fpq\u0000~\u0000\u0018q"
+"\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001fq\u0000~\u0000sq\u0000~\u0000#sq\u0000~\u0000\u0000\u0001@\u001dJpp\u0000sq\u0000~\u0000\u000b\u0001@\u001d?ppsq\u0000~\u0000\u0012\u0001@\u001d4"
+"q\u0000~\u0000\u000fpsq\u0000~\u0000\u0015\u0001@\u001d1q\u0000~\u0000\u000fpq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001fq\u0000~\u0000yq\u0000~\u0000#sq\u0000~\u0000\u001ft"
+"\u0000\u0007IffPredq\u0000~\u0000&sr\u0000\"com.sun.msv.grammar.ExpressionPool\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001"
+"\u0002\u0000\u0001L\u0000\bexpTablet\u0000/Lcom/sun/msv/grammar/ExpressionPool$ClosedH"
+"ash;xpsr\u0000-com.sun.msv.grammar.ExpressionPool$ClosedHash\u00d7j\u00d0N\u00ef"
+"\u00e8\u00ed\u001c\u0002\u0000\u0004I\u0000\u0005countI\u0000\tthresholdL\u0000\u0006parentq\u0000~\u0000\u00c4[\u0000\u0005tablet\u0000![Lcom/sun"
+"/msv/grammar/Expression;xp\u0000\u0000\u0000K\u0000\u0000\u0000rpur\u0000![Lcom.sun.msv.grammar"
+".Expression;\u00d68D\u00c3]\u00ad\u00a7\n\u0002\u0000\u0000xp\u0000\u0000\u0001\u007fpppppq\u0000~\u0000\u0084q\u0000~\u00001pppppq\u0000~\u0000\u0082q\u0000~\u0000/p"
+"ppppq\u0000~\u0000\u0080q\u0000~\u0000-pppppq\u0000~\u0000+q\u0000~\u0000~pppppq\u0000~\u0000)q\u0000~\u0000|pppppq\u0000~\u0000\'q\u0000~\u0000zp"
+"pppppppppppppppppppppppppppppppppppppppppppppppppppppppppppp"
+"pppppppppppppppppppppppppppppppppppppppppppppppppppppppppppp"
+"ppppppppq\u0000~\u0000\u00a5q\u0000~\u0000\u00a0q\u0000~\u0000\u009bq\u0000~\u0000\u0096q\u0000~\u0000\u0091q\u0000~\u0000\u008cq\u0000~\u0000\u0087q\u0000~\u0000vq\u0000~\u0000pq\u0000~\u0000jq\u0000"
+"~\u0000dq\u0000~\u0000\u009fq\u0000~\u0000\u009aq\u0000~\u0000\u0095q\u0000~\u0000\u0090q\u0000~\u0000\u008bq\u0000~\u0000\u0086q\u0000~\u0000uq\u0000~\u0000oq\u0000~\u0000iq\u0000~\u0000cq\u0000~\u0000]q\u0000"
+"~\u0000Wq\u0000~\u0000Qq\u0000~\u0000Kq\u0000~\u0000Eq\u0000~\u0000?q\u0000~\u00009q\u0000~\u00003q\u0000~\u0000\u0011q\u0000~\u0000^q\u0000~\u0000Xq\u0000~\u0000Rq\u0000~\u0000Lq\u0000"
+"~\u0000Fq\u0000~\u0000@q\u0000~\u0000.q\u0000~\u0000:q\u0000~\u00004q\u0000~\u0000\u0014q\u0000~\u0000\u0083q\u0000~\u00000q\u0000~\u0000\u0081q\u0000~\u0000,q\u0000~\u0000\fq\u0000~\u0000\u00a4q\u0000"
+"~\u0000\u007fq\u0000~\u0000\u00aaq\u0000~\u0000\u00a9q\u0000~\u0000\u00afq\u0000~\u0000*q\u0000~\u0000\u00aeq\u0000~\u0000}q\u0000~\u0000\u00b4q\u0000~\u0000\u00b3q\u0000~\u0000\u00b9q\u0000~\u0000\u00b8q\u0000~\u0000(q\u0000"
+"~\u0000{q\u0000~\u0000\u00beq\u0000~\u0000\u00bdppppppppppppppppppppppppppppq\u0000~\u0000\npppppppppppppp"
+"ppppppppppppppppppppppppppppppq\u0000~\u0000\tppppppppppppppppppppppppp"
+"pppppppppppppppppppppppppppppppppppppppppppppppppppp"));
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
            return net.sourceforge.czt.core.jaxb.gen.impl.IffPredImpl.this;
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
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.core.jaxb.gen.impl.Pred2Impl)net.sourceforge.czt.core.jaxb.gen.impl.IffPredImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("FalsePred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.core.jaxb.gen.impl.Pred2Impl)net.sourceforge.czt.core.jaxb.gen.impl.IffPredImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("TruePred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.core.jaxb.gen.impl.Pred2Impl)net.sourceforge.czt.core.jaxb.gen.impl.IffPredImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("AndPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.core.jaxb.gen.impl.Pred2Impl)net.sourceforge.czt.core.jaxb.gen.impl.IffPredImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("ImpliesPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.core.jaxb.gen.impl.Pred2Impl)net.sourceforge.czt.core.jaxb.gen.impl.IffPredImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("IffPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.core.jaxb.gen.impl.Pred2Impl)net.sourceforge.czt.core.jaxb.gen.impl.IffPredImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("OrPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.core.jaxb.gen.impl.Pred2Impl)net.sourceforge.czt.core.jaxb.gen.impl.IffPredImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("ExistsPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.core.jaxb.gen.impl.Pred2Impl)net.sourceforge.czt.core.jaxb.gen.impl.IffPredImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("Exists1Pred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.core.jaxb.gen.impl.Pred2Impl)net.sourceforge.czt.core.jaxb.gen.impl.IffPredImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("ForallPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.core.jaxb.gen.impl.Pred2Impl)net.sourceforge.czt.core.jaxb.gen.impl.IffPredImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("ExprPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.core.jaxb.gen.impl.Pred2Impl)net.sourceforge.czt.core.jaxb.gen.impl.IffPredImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("MemPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.core.jaxb.gen.impl.Pred2Impl)net.sourceforge.czt.core.jaxb.gen.impl.IffPredImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("NegPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.core.jaxb.gen.impl.Pred2Impl)net.sourceforge.czt.core.jaxb.gen.impl.IffPredImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        spawnHandlerFromEnterElement((((net.sourceforge.czt.core.jaxb.gen.impl.Pred2Impl)net.sourceforge.czt.core.jaxb.gen.impl.IffPredImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                        return ;
                    case  3 :
                        revertToParentFromEnterElement(___uri, ___local, ___qname, __atts);
                        return ;
                    case  0 :
                        if (("IffPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
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
                        spawnHandlerFromLeaveElement((((net.sourceforge.czt.core.jaxb.gen.impl.Pred2Impl)net.sourceforge.czt.core.jaxb.gen.impl.IffPredImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
                        return ;
                    case  3 :
                        revertToParentFromLeaveElement(___uri, ___local, ___qname);
                        return ;
                    case  2 :
                        if (("IffPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
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
                        spawnHandlerFromEnterAttribute((((net.sourceforge.czt.core.jaxb.gen.impl.Pred2Impl)net.sourceforge.czt.core.jaxb.gen.impl.IffPredImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
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
                        spawnHandlerFromLeaveAttribute((((net.sourceforge.czt.core.jaxb.gen.impl.Pred2Impl)net.sourceforge.czt.core.jaxb.gen.impl.IffPredImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
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
                            spawnHandlerFromText((((net.sourceforge.czt.core.jaxb.gen.impl.Pred2Impl)net.sourceforge.czt.core.jaxb.gen.impl.IffPredImpl.this).new Unmarshaller(context)), 2, value);
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
