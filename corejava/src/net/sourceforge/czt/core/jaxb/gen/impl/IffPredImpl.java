//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.1-05/30/2003 05:06 AM(java_re)-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2003.10.08 at 02:45:10 NZDT 
//


package net.sourceforge.czt.core.jaxb.gen.impl;

public class IffPredImpl
    extends net.sourceforge.czt.core.jaxb.gen.impl.Pred2Impl
    implements net.sourceforge.czt.core.jaxb.gen.IffPred, com.sun.xml.bind.JAXBObject, com.sun.xml.bind.RIElement, net.sourceforge.czt.zpatt.jaxb.gen.impl.runtime.UnmarshallableObject, net.sourceforge.czt.zpatt.jaxb.gen.impl.runtime.XMLSerializable, net.sourceforge.czt.zpatt.jaxb.gen.impl.runtime.ValidatableObject
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

    public net.sourceforge.czt.zpatt.jaxb.gen.impl.runtime.UnmarshallingEventHandler createUnmarshaller(net.sourceforge.czt.zpatt.jaxb.gen.impl.runtime.UnmarshallingContext context) {
        return new net.sourceforge.czt.core.jaxb.gen.impl.IffPredImpl.Unmarshaller(context);
    }

    public void serializeElementBody(net.sourceforge.czt.zpatt.jaxb.gen.impl.runtime.XMLSerializer context)
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

    public void serializeAttributes(net.sourceforge.czt.zpatt.jaxb.gen.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
    }

    public void serializeAttributeBody(net.sourceforge.czt.zpatt.jaxb.gen.impl.runtime.XMLSerializer context)
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

    public void serializeURIs(net.sourceforge.czt.zpatt.jaxb.gen.impl.runtime.XMLSerializer context)
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
+"Reducibilityt\u0000\u0013Ljava/lang/Boolean;L\u0000\u000bexpandedExpq\u0000~\u0000\u0003xp1\u001b\u00d2?p"
+"p\u0000sr\u0000\u001fcom.sun.msv.grammar.SequenceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun."
+"msv.grammar.BinaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0004exp1q\u0000~\u0000\u0003L\u0000\u0004exp2q\u0000~\u0000\u0003xq\u0000~"
+"\u0000\u00041\u001b\u00d24ppsq\u0000~\u0000\u0007\u0019Ld\u0091ppsr\u0000\u001dcom.sun.msv.grammar.ChoiceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000"
+"\u0001\u0002\u0000\u0000xq\u0000~\u0000\b\u0001|\u00f6\u00eeppsq\u0000~\u0000\u0000\u0001|\u00f6\u00e3sr\u0000\u0011java.lang.Boolean\u00cd r\u0080\u00d5\u009c\u00fa\u00ee\u0002\u0000\u0001Z\u0000"
+"\u0005valuexp\u0000p\u0000sq\u0000~\u0000\u0000\u0001|\u00f6\u00d8pp\u0000sq\u0000~\u0000\u000b\u0001|\u00f6\u00cdppsr\u0000 com.sun.msv.grammar."
+"OneOrMoreExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001ccom.sun.msv.grammar.UnaryExp\u0000\u0000\u0000\u0000\u0000"
+"\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\u0003expq\u0000~\u0000\u0003xq\u0000~\u0000\u0004\u0001|\u00f6\u00c2q\u0000~\u0000\u000fpsr\u0000 com.sun.msv.grammar.Att"
+"ributeExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003expq\u0000~\u0000\u0003L\u0000\tnameClassq\u0000~\u0000\u0001xq\u0000~\u0000\u0004\u0001|\u00f6\u00bfq\u0000"
+"~\u0000\u000fpsr\u00002com.sun.msv.grammar.Expression$AnyStringExpression\u0000\u0000"
+"\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004\u0000\u0000\u0000\bsq\u0000~\u0000\u000e\u0001q\u0000~\u0000\u0018sr\u0000 com.sun.msv.grammar.AnyNa"
+"meClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun.msv.grammar.NameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002"
+"\u0000\u0000xpsr\u00000com.sun.msv.grammar.Expression$EpsilonExpression\u0000\u0000\u0000\u0000"
+"\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004\u0000\u0000\u0000\tq\u0000~\u0000\u0019q\u0000~\u0000\u001esr\u0000#com.sun.msv.grammar.SimpleNam"
+"eClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\tlocalNamet\u0000\u0012Ljava/lang/String;L\u0000\fnamespa"
+"ceURIq\u0000~\u0000 xq\u0000~\u0000\u001bt\u00000net.sourceforge.czt.core.jaxb.gen.TermA.A"
+"nnsTypet\u0000+http://java.sun.com/jaxb/xjc/dummy-elementssq\u0000~\u0000\u001ft"
+"\u0000\u0004Annst\u0000\u001ehttp://czt.sourceforge.net/zmlq\u0000~\u0000\u001esq\u0000~\u0000\u000b\u0017\u00cfm\u009eppsq\u0000~"
+"\u0000\u000b\u0016Rv\u00c4ppsq\u0000~\u0000\u000b\u0014\u00d5\u007f\u00eappsq\u0000~\u0000\u000b\u0013X\u0089\u0010ppsq\u0000~\u0000\u000b\u0011\u00db\u00926ppsq\u0000~\u0000\u000b\u0010^\u009b\\ppsq\u0000~"
+"\u0000\u000b\u000e\u00e1\u00a4\u0082ppsq\u0000~\u0000\u000b\rd\u00ad\u00a8ppsq\u0000~\u0000\u000b\u000b\u00e7\u00b6\u00ceppsq\u0000~\u0000\u000b\nj\u00bf\u00f4ppsq\u0000~\u0000\u000b\b\u00ed\u00c9\u001appsq\u0000~"
+"\u0000\u000b\u0007p\u00d2@ppsq\u0000~\u0000\u000b\u0005\u00f3\u00dbfppsq\u0000~\u0000\u000b\u0004v\u00e4\u008cppsq\u0000~\u0000\u000b\u0002\u00f9\u00ed\u00b2ppsq\u0000~\u0000\u0000\u0001|\u00f6\u00d8pp\u0000sq\u0000"
+"~\u0000\u000b\u0001|\u00f6\u00cdppsq\u0000~\u0000\u0012\u0001|\u00f6\u00c2q\u0000~\u0000\u000fpsq\u0000~\u0000\u0015\u0001|\u00f6\u00bfq\u0000~\u0000\u000fpq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~"
+"\u0000\u001ft\u0000*net.sourceforge.czt.core.jaxb.gen.TruePredq\u0000~\u0000#sq\u0000~\u0000\u0000\u0001|"
+"\u00f6\u00d8pp\u0000sq\u0000~\u0000\u000b\u0001|\u00f6\u00cdppsq\u0000~\u0000\u0012\u0001|\u00f6\u00c2q\u0000~\u0000\u000fpsq\u0000~\u0000\u0015\u0001|\u00f6\u00bfq\u0000~\u0000\u000fpq\u0000~\u0000\u0018q\u0000~\u0000\u001cq"
+"\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000.net.sourceforge.czt.core.jaxb.gen.Pred2Elementq"
+"\u0000~\u0000#sq\u0000~\u0000\u0000\u0001|\u00f6\u00d8pp\u0000sq\u0000~\u0000\u000b\u0001|\u00f6\u00cdppsq\u0000~\u0000\u0012\u0001|\u00f6\u00c2q\u0000~\u0000\u000fpsq\u0000~\u0000\u0015\u0001|\u00f6\u00bfq\u0000~\u0000\u000f"
+"pq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u00000net.sourceforge.czt.core.jaxb.gen.M"
+"emPredElementq\u0000~\u0000#sq\u0000~\u0000\u0000\u0001|\u00f6\u00d8pp\u0000sq\u0000~\u0000\u000b\u0001|\u00f6\u00cdppsq\u0000~\u0000\u0012\u0001|\u00f6\u00c2q\u0000~\u0000\u000fps"
+"q\u0000~\u0000\u0015\u0001|\u00f6\u00bfq\u0000~\u0000\u000fpq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000-net.sourceforge.czt.c"
+"ore.jaxb.gen.Exists1Predq\u0000~\u0000#sq\u0000~\u0000\u0000\u0001|\u00f6\u00d8pp\u0000sq\u0000~\u0000\u000b\u0001|\u00f6\u00cdppsq\u0000~\u0000\u0012"
+"\u0001|\u00f6\u00c2q\u0000~\u0000\u000fpsq\u0000~\u0000\u0015\u0001|\u00f6\u00bfq\u0000~\u0000\u000fpq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000+net.source"
+"forge.czt.core.jaxb.gen.FalsePredq\u0000~\u0000#sq\u0000~\u0000\u0000\u0001|\u00f6\u00d8pp\u0000sq\u0000~\u0000\u000b\u0001|\u00f6"
+"\u00cdppsq\u0000~\u0000\u0012\u0001|\u00f6\u00c2q\u0000~\u0000\u000fpsq\u0000~\u0000\u0015\u0001|\u00f6\u00bfq\u0000~\u0000\u000fpq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u00000n"
+"et.sourceforge.czt.core.jaxb.gen.NegPredElementq\u0000~\u0000#sq\u0000~\u0000\u0000\u0001|"
+"\u00f6\u00d8pp\u0000sq\u0000~\u0000\u000b\u0001|\u00f6\u00cdppsq\u0000~\u0000\u0012\u0001|\u00f6\u00c2q\u0000~\u0000\u000fpsq\u0000~\u0000\u0015\u0001|\u00f6\u00bfq\u0000~\u0000\u000fpq\u0000~\u0000\u0018q\u0000~\u0000\u001cq"
+"\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000)net.sourceforge.czt.core.jaxb.gen.IffPredq\u0000~\u0000#s"
+"q\u0000~\u0000\u0000\u0001|\u00f6\u00d8pp\u0000sq\u0000~\u0000\u000b\u0001|\u00f6\u00cdppsq\u0000~\u0000\u0012\u0001|\u00f6\u00c2q\u0000~\u0000\u000fpsq\u0000~\u0000\u0015\u0001|\u00f6\u00bfq\u0000~\u0000\u000fpq\u0000~\u0000"
+"\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000,net.sourceforge.czt.core.jaxb.gen.Forall"
+"Predq\u0000~\u0000#sq\u0000~\u0000\u0000\u0001|\u00f6\u00d8pp\u0000sq\u0000~\u0000\u000b\u0001|\u00f6\u00cdppsq\u0000~\u0000\u0012\u0001|\u00f6\u00c2q\u0000~\u0000\u000fpsq\u0000~\u0000\u0015\u0001|\u00f6\u00bf"
+"q\u0000~\u0000\u000fpq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u00003net.sourceforge.czt.zpatt.jaxb"
+".gen.JokerPredElementq\u0000~\u0000#sq\u0000~\u0000\u0000\u0001|\u00f6\u00d8pp\u0000sq\u0000~\u0000\u000b\u0001|\u00f6\u00cdppsq\u0000~\u0000\u0012\u0001|\u00f6"
+"\u00c2q\u0000~\u0000\u000fpsq\u0000~\u0000\u0015\u0001|\u00f6\u00bfq\u0000~\u0000\u000fpq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000(net.sourcefor"
+"ge.czt.core.jaxb.gen.OrPredq\u0000~\u0000#sq\u0000~\u0000\u0000\u0001|\u00f6\u00d8pp\u0000sq\u0000~\u0000\u000b\u0001|\u00f6\u00cdppsq\u0000"
+"~\u0000\u0012\u0001|\u00f6\u00c2q\u0000~\u0000\u000fpsq\u0000~\u0000\u0015\u0001|\u00f6\u00bfq\u0000~\u0000\u000fpq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u00000net.sou"
+"rceforge.czt.core.jaxb.gen.QntPredElementq\u0000~\u0000#sq\u0000~\u0000\u0000\u0001|\u00f6\u00d8pp\u0000s"
+"q\u0000~\u0000\u000b\u0001|\u00f6\u00cdppsq\u0000~\u0000\u0012\u0001|\u00f6\u00c2q\u0000~\u0000\u000fpsq\u0000~\u0000\u0015\u0001|\u00f6\u00bfq\u0000~\u0000\u000fpq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq"
+"\u0000~\u0000\u001ft\u00001net.sourceforge.czt.core.jaxb.gen.ExprPredElementq\u0000~\u0000"
+"#sq\u0000~\u0000\u0000\u0001|\u00f6\u00d8pp\u0000sq\u0000~\u0000\u000b\u0001|\u00f6\u00cdppsq\u0000~\u0000\u0012\u0001|\u00f6\u00c2q\u0000~\u0000\u000fpsq\u0000~\u0000\u0015\u0001|\u00f6\u00bfq\u0000~\u0000\u000fpq\u0000"
+"~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000-net.sourceforge.czt.core.jaxb.gen.Impl"
+"iesPredq\u0000~\u0000#sq\u0000~\u0000\u0000\u0001|\u00f6\u00d8pp\u0000sq\u0000~\u0000\u000b\u0001|\u00f6\u00cdppsq\u0000~\u0000\u0012\u0001|\u00f6\u00c2q\u0000~\u0000\u000fpsq\u0000~\u0000\u0015\u0001"
+"|\u00f6\u00bfq\u0000~\u0000\u000fpq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000,net.sourceforge.czt.core.ja"
+"xb.gen.ExistsPredq\u0000~\u0000#sq\u0000~\u0000\u0000\u0001|\u00f6\u00d8pp\u0000sq\u0000~\u0000\u000b\u0001|\u00f6\u00cdppsq\u0000~\u0000\u0012\u0001|\u00f6\u00c2q\u0000~"
+"\u0000\u000fpsq\u0000~\u0000\u0015\u0001|\u00f6\u00bfq\u0000~\u0000\u000fpq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000-net.sourceforge.c"
+"zt.core.jaxb.gen.FactElementq\u0000~\u0000#sq\u0000~\u0000\u0000\u0001|\u00f6\u00d8pp\u0000sq\u0000~\u0000\u000b\u0001|\u00f6\u00cdppsq"
+"\u0000~\u0000\u0012\u0001|\u00f6\u00c2q\u0000~\u0000\u000fpsq\u0000~\u0000\u0015\u0001|\u00f6\u00bfq\u0000~\u0000\u000fpq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u00000net.so"
+"urceforge.czt.core.jaxb.gen.AndPredElementq\u0000~\u0000#sq\u0000~\u0000\u000b\u0017\u00cfm\u009epps"
+"q\u0000~\u0000\u000b\u0016Rv\u00c4ppsq\u0000~\u0000\u000b\u0014\u00d5\u007f\u00eappsq\u0000~\u0000\u000b\u0013X\u0089\u0010ppsq\u0000~\u0000\u000b\u0011\u00db\u00926ppsq\u0000~\u0000\u000b\u0010^\u009b\\pps"
+"q\u0000~\u0000\u000b\u000e\u00e1\u00a4\u0082ppsq\u0000~\u0000\u000b\rd\u00ad\u00a8ppsq\u0000~\u0000\u000b\u000b\u00e7\u00b6\u00ceppsq\u0000~\u0000\u000b\nj\u00bf\u00f4ppsq\u0000~\u0000\u000b\b\u00ed\u00c9\u001apps"
+"q\u0000~\u0000\u000b\u0007p\u00d2@ppsq\u0000~\u0000\u000b\u0005\u00f3\u00dbfppsq\u0000~\u0000\u000b\u0004v\u00e4\u008cppsq\u0000~\u0000\u000b\u0002\u00f9\u00ed\u00b2ppsq\u0000~\u0000\u0000\u0001|\u00f6\u00d8pp\u0000"
+"sq\u0000~\u0000\u000b\u0001|\u00f6\u00cdppsq\u0000~\u0000\u0012\u0001|\u00f6\u00c2q\u0000~\u0000\u000fpsq\u0000~\u0000\u0015\u0001|\u00f6\u00bfq\u0000~\u0000\u000fpq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001es"
+"q\u0000~\u0000\u001fq\u0000~\u0000;q\u0000~\u0000#sq\u0000~\u0000\u0000\u0001|\u00f6\u00d8pp\u0000sq\u0000~\u0000\u000b\u0001|\u00f6\u00cdppsq\u0000~\u0000\u0012\u0001|\u00f6\u00c2q\u0000~\u0000\u000fpsq\u0000~"
+"\u0000\u0015\u0001|\u00f6\u00bfq\u0000~\u0000\u000fpq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001fq\u0000~\u0000Aq\u0000~\u0000#sq\u0000~\u0000\u0000\u0001|\u00f6\u00d8pp\u0000sq\u0000~"
+"\u0000\u000b\u0001|\u00f6\u00cdppsq\u0000~\u0000\u0012\u0001|\u00f6\u00c2q\u0000~\u0000\u000fpsq\u0000~\u0000\u0015\u0001|\u00f6\u00bfq\u0000~\u0000\u000fpq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000"
+"\u001fq\u0000~\u0000Gq\u0000~\u0000#sq\u0000~\u0000\u0000\u0001|\u00f6\u00d8pp\u0000sq\u0000~\u0000\u000b\u0001|\u00f6\u00cdppsq\u0000~\u0000\u0012\u0001|\u00f6\u00c2q\u0000~\u0000\u000fpsq\u0000~\u0000\u0015\u0001|"
+"\u00f6\u00bfq\u0000~\u0000\u000fpq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001fq\u0000~\u0000Mq\u0000~\u0000#sq\u0000~\u0000\u0000\u0001|\u00f6\u00d8pp\u0000sq\u0000~\u0000\u000b\u0001|"
+"\u00f6\u00cdppsq\u0000~\u0000\u0012\u0001|\u00f6\u00c2q\u0000~\u0000\u000fpsq\u0000~\u0000\u0015\u0001|\u00f6\u00bfq\u0000~\u0000\u000fpq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001fq\u0000~"
+"\u0000Sq\u0000~\u0000#sq\u0000~\u0000\u0000\u0001|\u00f6\u00d8pp\u0000sq\u0000~\u0000\u000b\u0001|\u00f6\u00cdppsq\u0000~\u0000\u0012\u0001|\u00f6\u00c2q\u0000~\u0000\u000fpsq\u0000~\u0000\u0015\u0001|\u00f6\u00bfq\u0000"
+"~\u0000\u000fpq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001fq\u0000~\u0000Yq\u0000~\u0000#sq\u0000~\u0000\u0000\u0001|\u00f6\u00d8pp\u0000sq\u0000~\u0000\u000b\u0001|\u00f6\u00cdpp"
+"sq\u0000~\u0000\u0012\u0001|\u00f6\u00c2q\u0000~\u0000\u000fpsq\u0000~\u0000\u0015\u0001|\u00f6\u00bfq\u0000~\u0000\u000fpq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001fq\u0000~\u0000_q\u0000"
+"~\u0000#sq\u0000~\u0000\u0000\u0001|\u00f6\u00d8pp\u0000sq\u0000~\u0000\u000b\u0001|\u00f6\u00cdppsq\u0000~\u0000\u0012\u0001|\u00f6\u00c2q\u0000~\u0000\u000fpsq\u0000~\u0000\u0015\u0001|\u00f6\u00bfq\u0000~\u0000\u000fp"
+"q\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001fq\u0000~\u0000eq\u0000~\u0000#sq\u0000~\u0000\u0000\u0001|\u00f6\u00d8pp\u0000sq\u0000~\u0000\u000b\u0001|\u00f6\u00cdppsq\u0000~"
+"\u0000\u0012\u0001|\u00f6\u00c2q\u0000~\u0000\u000fpsq\u0000~\u0000\u0015\u0001|\u00f6\u00bfq\u0000~\u0000\u000fpq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001fq\u0000~\u0000kq\u0000~\u0000#s"
+"q\u0000~\u0000\u0000\u0001|\u00f6\u00d8pp\u0000sq\u0000~\u0000\u000b\u0001|\u00f6\u00cdppsq\u0000~\u0000\u0012\u0001|\u00f6\u00c2q\u0000~\u0000\u000fpsq\u0000~\u0000\u0015\u0001|\u00f6\u00bfq\u0000~\u0000\u000fpq\u0000~\u0000"
+"\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001fq\u0000~\u0000qq\u0000~\u0000#sq\u0000~\u0000\u0000\u0001|\u00f6\u00d8pp\u0000sq\u0000~\u0000\u000b\u0001|\u00f6\u00cdppsq\u0000~\u0000\u0012\u0001|"
+"\u00f6\u00c2q\u0000~\u0000\u000fpsq\u0000~\u0000\u0015\u0001|\u00f6\u00bfq\u0000~\u0000\u000fpq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001fq\u0000~\u0000wq\u0000~\u0000#sq\u0000~\u0000"
+"\u0000\u0001|\u00f6\u00d8pp\u0000sq\u0000~\u0000\u000b\u0001|\u00f6\u00cdppsq\u0000~\u0000\u0012\u0001|\u00f6\u00c2q\u0000~\u0000\u000fpsq\u0000~\u0000\u0015\u0001|\u00f6\u00bfq\u0000~\u0000\u000fpq\u0000~\u0000\u0018q\u0000~"
+"\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001fq\u0000~\u0000}q\u0000~\u0000#sq\u0000~\u0000\u0000\u0001|\u00f6\u00d8pp\u0000sq\u0000~\u0000\u000b\u0001|\u00f6\u00cdppsq\u0000~\u0000\u0012\u0001|\u00f6\u00c2q\u0000"
+"~\u0000\u000fpsq\u0000~\u0000\u0015\u0001|\u00f6\u00bfq\u0000~\u0000\u000fpq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001fq\u0000~\u0000\u0083q\u0000~\u0000#sq\u0000~\u0000\u0000\u0001|\u00f6"
+"\u00d8pp\u0000sq\u0000~\u0000\u000b\u0001|\u00f6\u00cdppsq\u0000~\u0000\u0012\u0001|\u00f6\u00c2q\u0000~\u0000\u000fpsq\u0000~\u0000\u0015\u0001|\u00f6\u00bfq\u0000~\u0000\u000fpq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000"
+"~\u0000\u001esq\u0000~\u0000\u001fq\u0000~\u0000\u0089q\u0000~\u0000#sq\u0000~\u0000\u0000\u0001|\u00f6\u00d8pp\u0000sq\u0000~\u0000\u000b\u0001|\u00f6\u00cdppsq\u0000~\u0000\u0012\u0001|\u00f6\u00c2q\u0000~\u0000\u000fp"
+"sq\u0000~\u0000\u0015\u0001|\u00f6\u00bfq\u0000~\u0000\u000fpq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001fq\u0000~\u0000\u008fq\u0000~\u0000#sq\u0000~\u0000\u0000\u0001|\u00f6\u00d8pp\u0000"
+"sq\u0000~\u0000\u000b\u0001|\u00f6\u00cdppsq\u0000~\u0000\u0012\u0001|\u00f6\u00c2q\u0000~\u0000\u000fpsq\u0000~\u0000\u0015\u0001|\u00f6\u00bfq\u0000~\u0000\u000fpq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001es"
+"q\u0000~\u0000\u001fq\u0000~\u0000\u0095q\u0000~\u0000#sq\u0000~\u0000\u001ft\u0000\u0007IffPredq\u0000~\u0000&sr\u0000\"com.sun.msv.grammar."
+"ExpressionPool\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\bexpTablet\u0000/Lcom/sun/msv/grammar/"
+"ExpressionPool$ClosedHash;xpsr\u0000-com.sun.msv.grammar.Expressi"
+"onPool$ClosedHash\u00d7j\u00d0N\u00ef\u00e8\u00ed\u001c\u0002\u0000\u0004I\u0000\u0005countI\u0000\tthresholdL\u0000\u0006parentq\u0000~"
+"\u0000\u00f8[\u0000\u0005tablet\u0000![Lcom/sun/msv/grammar/Expression;xp\u0000\u0000\u0000c\u0000\u0000\u0000rpur\u0000"
+"![Lcom.sun.msv.grammar.Expression;\u00d68D\u00c3]\u00ad\u00a7\n\u0002\u0000\u0000xp\u0000\u0000\u0001\u007fppppppppp"
+"pppppppppppppppppppppppppppppppppppppppppppppppppppppppppppp"
+"ppppppppppppppppppppppppq\u0000~\u0000)q\u0000~\u0000\u0098pppppq\u0000~\u0000,q\u0000~\u0000\u009bpppppq\u0000~\u0000/q"
+"\u0000~\u0000\u009eppq\u0000~\u0000\nppq\u0000~\u00002q\u0000~\u0000\u00a1pppppq\u0000~\u0000\u00a4q\u0000~\u00005pppppppppppppppppppppp"
+"pppppppppppppppppppppppppppppppppppppppppppppppppppppppppppp"
+"pppppppppppq\u0000~\u0000\'q\u0000~\u0000\u0096pppppq\u0000~\u0000*q\u0000~\u0000\u0099ppppq\u0000~\u0000\u00b1q\u0000~\u0000\u00acq\u0000~\u0000\u00a7q\u0000~\u0000\u0092"
+"q\u0000~\u0000\u008cq\u0000~\u0000\u0086q\u0000~\u0000\u0080q\u0000~\u0000zq\u0000~\u0000tq\u0000~\u0000nq\u0000~\u0000hq\u0000~\u0000\u00abq\u0000~\u0000\u00a6q\u0000~\u0000\u0091q\u0000~\u0000\u008bq\u0000~\u0000\u0085"
+"q\u0000~\u0000\u007fq\u0000~\u0000yq\u0000~\u0000sq\u0000~\u0000mq\u0000~\u0000gq\u0000~\u0000aq\u0000~\u0000[q\u0000~\u0000Uq\u0000~\u0000Oq\u0000~\u0000Iq\u0000~\u0000Cq\u0000~\u0000="
+"q\u0000~\u00007q\u0000~\u0000\u0011q\u0000~\u0000bq\u0000~\u0000\\q\u0000~\u0000Vq\u0000~\u0000Pq\u0000~\u0000Jq\u0000~\u0000Dq\u0000~\u0000>q\u0000~\u00008q\u0000~\u0000\u0014q\u0000~\u00003"
+"q\u0000~\u00000q\u0000~\u0000-q\u0000~\u0000\u00b0q\u0000~\u0000\u00b6q\u0000~\u0000\fq\u0000~\u0000\u00b5q\u0000~\u0000\u00a2q\u0000~\u0000\u00bbq\u0000~\u0000\u00baq\u0000~\u0000\u00c0q\u0000~\u0000\u00bfq\u0000~\u0000\u00c5"
+"q\u0000~\u0000\u00c4q\u0000~\u0000\u009fq\u0000~\u0000\u00caq\u0000~\u0000\u00c9q\u0000~\u0000\u00cfq\u0000~\u0000\u00ceq\u0000~\u0000\u00d4q\u0000~\u0000\u00d3q\u0000~\u0000\u009cq\u0000~\u0000\u00d9q\u0000~\u0000\u00d8q\u0000~\u0000\u00de"
+"q\u0000~\u0000\u00ddq\u0000~\u0000\u00e3q\u0000~\u0000\u00e2q\u0000~\u0000\u00e8q\u0000~\u0000\u00e7q\u0000~\u0000\u00edq\u0000~\u0000\u00ecq\u0000~\u0000\u00f2q\u0000~\u0000\u00f1ppppppppppppppp"
+"pppppppppppppppq\u0000~\u0000\tpppppppppppppq\u0000~\u0000(q\u0000~\u0000\u0097pppppq\u0000~\u0000+q\u0000~\u0000\u009app"
+"pppq\u0000~\u0000.q\u0000~\u0000\u009dpppppq\u0000~\u00001q\u0000~\u0000\u00a0pppppq\u0000~\u00004q\u0000~\u0000\u00a3ppppppp"));
        }
        return new com.sun.msv.verifier.regexp.REDocumentDeclaration(schemaFragment);
    }

    public class Unmarshaller
        extends net.sourceforge.czt.zpatt.jaxb.gen.impl.runtime.AbstractUnmarshallingEventHandlerImpl
    {


        public Unmarshaller(net.sourceforge.czt.zpatt.jaxb.gen.impl.runtime.UnmarshallingContext context) {
            super(context, "----");
        }

        protected Unmarshaller(net.sourceforge.czt.zpatt.jaxb.gen.impl.runtime.UnmarshallingContext context, int startState) {
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
                        if (("Pred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.core.jaxb.gen.impl.Pred2Impl)net.sourceforge.czt.core.jaxb.gen.impl.IffPredImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("TruePred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.core.jaxb.gen.impl.Pred2Impl)net.sourceforge.czt.core.jaxb.gen.impl.IffPredImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("Pred2" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.core.jaxb.gen.impl.Pred2Impl)net.sourceforge.czt.core.jaxb.gen.impl.IffPredImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("MemPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.core.jaxb.gen.impl.Pred2Impl)net.sourceforge.czt.core.jaxb.gen.impl.IffPredImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("Exists1Pred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.core.jaxb.gen.impl.Pred2Impl)net.sourceforge.czt.core.jaxb.gen.impl.IffPredImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("FalsePred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.core.jaxb.gen.impl.Pred2Impl)net.sourceforge.czt.core.jaxb.gen.impl.IffPredImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("NegPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.core.jaxb.gen.impl.Pred2Impl)net.sourceforge.czt.core.jaxb.gen.impl.IffPredImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("IffPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.core.jaxb.gen.impl.Pred2Impl)net.sourceforge.czt.core.jaxb.gen.impl.IffPredImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("ForallPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.core.jaxb.gen.impl.Pred2Impl)net.sourceforge.czt.core.jaxb.gen.impl.IffPredImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("JokerPred" == ___local)&&("http://czt.sourceforge.net/zpatt" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.core.jaxb.gen.impl.Pred2Impl)net.sourceforge.czt.core.jaxb.gen.impl.IffPredImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("OrPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.core.jaxb.gen.impl.Pred2Impl)net.sourceforge.czt.core.jaxb.gen.impl.IffPredImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("QntPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.core.jaxb.gen.impl.Pred2Impl)net.sourceforge.czt.core.jaxb.gen.impl.IffPredImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("ExprPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.core.jaxb.gen.impl.Pred2Impl)net.sourceforge.czt.core.jaxb.gen.impl.IffPredImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("ImpliesPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.core.jaxb.gen.impl.Pred2Impl)net.sourceforge.czt.core.jaxb.gen.impl.IffPredImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("ExistsPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.core.jaxb.gen.impl.Pred2Impl)net.sourceforge.czt.core.jaxb.gen.impl.IffPredImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("Fact" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.core.jaxb.gen.impl.Pred2Impl)net.sourceforge.czt.core.jaxb.gen.impl.IffPredImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("AndPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.core.jaxb.gen.impl.Pred2Impl)net.sourceforge.czt.core.jaxb.gen.impl.IffPredImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        spawnHandlerFromEnterElement((((net.sourceforge.czt.core.jaxb.gen.impl.Pred2Impl)net.sourceforge.czt.core.jaxb.gen.impl.IffPredImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                        return ;
                    case  0 :
                        if (("IffPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
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
