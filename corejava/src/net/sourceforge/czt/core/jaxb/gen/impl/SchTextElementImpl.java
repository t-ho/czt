//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.1-05/30/2003 05:06 AM(java_re)-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2003.10.08 at 02:45:10 NZDT 
//


package net.sourceforge.czt.core.jaxb.gen.impl;

public class SchTextElementImpl
    extends net.sourceforge.czt.core.jaxb.gen.impl.SchTextImpl
    implements net.sourceforge.czt.core.jaxb.gen.SchTextElement, com.sun.xml.bind.JAXBObject, com.sun.xml.bind.RIElement, net.sourceforge.czt.zpatt.jaxb.gen.impl.runtime.UnmarshallableObject, net.sourceforge.czt.zpatt.jaxb.gen.impl.runtime.XMLSerializable, net.sourceforge.czt.zpatt.jaxb.gen.impl.runtime.ValidatableObject
{

    public final static java.lang.Class version = (net.sourceforge.czt.core.jaxb.gen.impl.JAXBVersion.class);
    private static com.sun.msv.grammar.Grammar schemaFragment;

    public java.lang.String ____jaxb_ri____getNamespaceURI() {
        return "http://czt.sourceforge.net/zml";
    }

    public java.lang.String ____jaxb_ri____getLocalName() {
        return "SchText";
    }

    private final static java.lang.Class PRIMARY_INTERFACE_CLASS() {
        return (net.sourceforge.czt.core.jaxb.gen.SchTextElement.class);
    }

    public net.sourceforge.czt.zpatt.jaxb.gen.impl.runtime.UnmarshallingEventHandler createUnmarshaller(net.sourceforge.czt.zpatt.jaxb.gen.impl.runtime.UnmarshallingContext context) {
        return new net.sourceforge.czt.core.jaxb.gen.impl.SchTextElementImpl.Unmarshaller(context);
    }

    public void serializeElementBody(net.sourceforge.czt.zpatt.jaxb.gen.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        context.startElement("http://czt.sourceforge.net/zml", "SchText");
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
        context.startElement("http://czt.sourceforge.net/zml", "SchText");
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
        return (net.sourceforge.czt.core.jaxb.gen.SchTextElement.class);
    }

    public com.sun.msv.verifier.DocumentDeclaration createRawValidator() {
        if (schemaFragment == null) {
            schemaFragment = com.sun.xml.bind.validator.SchemaDeserializer.deserialize((
 "\u00ac\u00ed\u0000\u0005sr\u0000\'com.sun.msv.grammar.trex.ElementPattern\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000"
+"\tnameClasst\u0000\u001fLcom/sun/msv/grammar/NameClass;xr\u0000\u001ecom.sun.msv."
+"grammar.ElementExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002Z\u0000\u001aignoreUndeclaredAttributesL\u0000"
+"\fcontentModelt\u0000 Lcom/sun/msv/grammar/Expression;xr\u0000\u001ecom.sun."
+"msv.grammar.Expression\u00f8\u0018\u0082\u00e8N5~O\u0002\u0000\u0003I\u0000\u000ecachedHashCodeL\u0000\u0013epsilon"
+"Reducibilityt\u0000\u0013Ljava/lang/Boolean;L\u0000\u000bexpandedExpq\u0000~\u0000\u0003xp\u001d\u00c3IFp"
+"p\u0000sr\u0000\u001fcom.sun.msv.grammar.SequenceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun."
+"msv.grammar.BinaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0004exp1q\u0000~\u0000\u0003L\u0000\u0004exp2q\u0000~\u0000\u0003xq\u0000~"
+"\u0000\u0004\u001d\u00c3I;ppsq\u0000~\u0000\u0007\u0005\u00f3\u00db\u008dppsr\u0000\u001dcom.sun.msv.grammar.ChoiceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000"
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
+"\u0000\u0004Annst\u0000\u001ehttp://czt.sourceforge.net/zmlq\u0000~\u0000\u001esq\u0000~\u0000\u000b\u0004v\u00e4\u009appsq\u0000~"
+"\u0000\u0012\u0004v\u00e4\u008fq\u0000~\u0000\u000fpsq\u0000~\u0000\u000b\u0004v\u00e4\u008cq\u0000~\u0000\u000fpsq\u0000~\u0000\u000b\u0002\u00f9\u00ed\u00b2q\u0000~\u0000\u000fpsq\u0000~\u0000\u0000\u0001|\u00f6\u00d8q\u0000~\u0000\u000fp"
+"\u0000sq\u0000~\u0000\u000b\u0001|\u00f6\u00cdppsq\u0000~\u0000\u0012\u0001|\u00f6\u00c2q\u0000~\u0000\u000fpsq\u0000~\u0000\u0015\u0001|\u00f6\u00bfq\u0000~\u0000\u000fpq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001e"
+"sq\u0000~\u0000\u001ft\u00001net.sourceforge.czt.core.jaxb.gen.InclDeclElementq\u0000"
+"~\u0000#sq\u0000~\u0000\u0000\u0001|\u00f6\u00d8q\u0000~\u0000\u000fp\u0000sq\u0000~\u0000\u000b\u0001|\u00f6\u00cdppsq\u0000~\u0000\u0012\u0001|\u00f6\u00c2q\u0000~\u0000\u000fpsq\u0000~\u0000\u0015\u0001|\u00f6\u00bfq\u0000"
+"~\u0000\u000fpq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u00000net.sourceforge.czt.core.jaxb.ge"
+"n.VarDeclElementq\u0000~\u0000#sq\u0000~\u0000\u0000\u0001|\u00f6\u00d8q\u0000~\u0000\u000fp\u0000sq\u0000~\u0000\u000b\u0001|\u00f6\u00cdppsq\u0000~\u0000\u0012\u0001|\u00f6\u00c2"
+"q\u0000~\u0000\u000fpsq\u0000~\u0000\u0015\u0001|\u00f6\u00bfq\u0000~\u0000\u000fpq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u00002net.sourceforg"
+"e.czt.core.jaxb.gen.ConstDeclElementq\u0000~\u0000#q\u0000~\u0000\u001esq\u0000~\u0000\u000b\u0017\u00cfm\u00a9ppsq"
+"\u0000~\u0000\u000b\u0017\u00cfm\u009eq\u0000~\u0000\u000fpsq\u0000~\u0000\u000b\u0016Rv\u00c4q\u0000~\u0000\u000fpsq\u0000~\u0000\u000b\u0014\u00d5\u007f\u00eaq\u0000~\u0000\u000fpsq\u0000~\u0000\u000b\u0013X\u0089\u0010q\u0000~\u0000"
+"\u000fpsq\u0000~\u0000\u000b\u0011\u00db\u00926q\u0000~\u0000\u000fpsq\u0000~\u0000\u000b\u0010^\u009b\\q\u0000~\u0000\u000fpsq\u0000~\u0000\u000b\u000e\u00e1\u00a4\u0082q\u0000~\u0000\u000fpsq\u0000~\u0000\u000b\rd\u00ad\u00a8"
+"q\u0000~\u0000\u000fpsq\u0000~\u0000\u000b\u000b\u00e7\u00b6\u00ceq\u0000~\u0000\u000fpsq\u0000~\u0000\u000b\nj\u00bf\u00f4q\u0000~\u0000\u000fpsq\u0000~\u0000\u000b\b\u00ed\u00c9\u001aq\u0000~\u0000\u000fpsq\u0000~\u0000\u000b"
+"\u0007p\u00d2@q\u0000~\u0000\u000fpsq\u0000~\u0000\u000b\u0005\u00f3\u00dbfq\u0000~\u0000\u000fpsq\u0000~\u0000\u000b\u0004v\u00e4\u008cq\u0000~\u0000\u000fpsq\u0000~\u0000\u000b\u0002\u00f9\u00ed\u00b2q\u0000~\u0000\u000fpsq"
+"\u0000~\u0000\u0000\u0001|\u00f6\u00d8q\u0000~\u0000\u000fp\u0000sq\u0000~\u0000\u000b\u0001|\u00f6\u00cdppsq\u0000~\u0000\u0012\u0001|\u00f6\u00c2q\u0000~\u0000\u000fpsq\u0000~\u0000\u0015\u0001|\u00f6\u00bfq\u0000~\u0000\u000fpq"
+"\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000*net.sourceforge.czt.core.jaxb.gen.Tru"
+"ePredq\u0000~\u0000#sq\u0000~\u0000\u0000\u0001|\u00f6\u00d8q\u0000~\u0000\u000fp\u0000sq\u0000~\u0000\u000b\u0001|\u00f6\u00cdppsq\u0000~\u0000\u0012\u0001|\u00f6\u00c2q\u0000~\u0000\u000fpsq\u0000~\u0000"
+"\u0015\u0001|\u00f6\u00bfq\u0000~\u0000\u000fpq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000.net.sourceforge.czt.core."
+"jaxb.gen.Pred2Elementq\u0000~\u0000#sq\u0000~\u0000\u0000\u0001|\u00f6\u00d8q\u0000~\u0000\u000fp\u0000sq\u0000~\u0000\u000b\u0001|\u00f6\u00cdppsq\u0000~\u0000"
+"\u0012\u0001|\u00f6\u00c2q\u0000~\u0000\u000fpsq\u0000~\u0000\u0015\u0001|\u00f6\u00bfq\u0000~\u0000\u000fpq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u00000net.sourc"
+"eforge.czt.core.jaxb.gen.MemPredElementq\u0000~\u0000#sq\u0000~\u0000\u0000\u0001|\u00f6\u00d8q\u0000~\u0000\u000fp"
+"\u0000sq\u0000~\u0000\u000b\u0001|\u00f6\u00cdppsq\u0000~\u0000\u0012\u0001|\u00f6\u00c2q\u0000~\u0000\u000fpsq\u0000~\u0000\u0015\u0001|\u00f6\u00bfq\u0000~\u0000\u000fpq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001e"
+"sq\u0000~\u0000\u001ft\u0000-net.sourceforge.czt.core.jaxb.gen.Exists1Predq\u0000~\u0000#s"
+"q\u0000~\u0000\u0000\u0001|\u00f6\u00d8q\u0000~\u0000\u000fp\u0000sq\u0000~\u0000\u000b\u0001|\u00f6\u00cdppsq\u0000~\u0000\u0012\u0001|\u00f6\u00c2q\u0000~\u0000\u000fpsq\u0000~\u0000\u0015\u0001|\u00f6\u00bfq\u0000~\u0000\u000fp"
+"q\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000+net.sourceforge.czt.core.jaxb.gen.Fa"
+"lsePredq\u0000~\u0000#sq\u0000~\u0000\u0000\u0001|\u00f6\u00d8q\u0000~\u0000\u000fp\u0000sq\u0000~\u0000\u000b\u0001|\u00f6\u00cdppsq\u0000~\u0000\u0012\u0001|\u00f6\u00c2q\u0000~\u0000\u000fpsq\u0000"
+"~\u0000\u0015\u0001|\u00f6\u00bfq\u0000~\u0000\u000fpq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u00000net.sourceforge.czt.cor"
+"e.jaxb.gen.NegPredElementq\u0000~\u0000#sq\u0000~\u0000\u0000\u0001|\u00f6\u00d8q\u0000~\u0000\u000fp\u0000sq\u0000~\u0000\u000b\u0001|\u00f6\u00cdpps"
+"q\u0000~\u0000\u0012\u0001|\u00f6\u00c2q\u0000~\u0000\u000fpsq\u0000~\u0000\u0015\u0001|\u00f6\u00bfq\u0000~\u0000\u000fpq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000)net.s"
+"ourceforge.czt.core.jaxb.gen.IffPredq\u0000~\u0000#sq\u0000~\u0000\u0000\u0001|\u00f6\u00d8q\u0000~\u0000\u000fp\u0000sq"
+"\u0000~\u0000\u000b\u0001|\u00f6\u00cdppsq\u0000~\u0000\u0012\u0001|\u00f6\u00c2q\u0000~\u0000\u000fpsq\u0000~\u0000\u0015\u0001|\u00f6\u00bfq\u0000~\u0000\u000fpq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000"
+"~\u0000\u001ft\u0000,net.sourceforge.czt.core.jaxb.gen.ForallPredq\u0000~\u0000#sq\u0000~\u0000"
+"\u0000\u0001|\u00f6\u00d8q\u0000~\u0000\u000fp\u0000sq\u0000~\u0000\u000b\u0001|\u00f6\u00cdppsq\u0000~\u0000\u0012\u0001|\u00f6\u00c2q\u0000~\u0000\u000fpsq\u0000~\u0000\u0015\u0001|\u00f6\u00bfq\u0000~\u0000\u000fpq\u0000~\u0000"
+"\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u00003net.sourceforge.czt.zpatt.jaxb.gen.Joker"
+"PredElementq\u0000~\u0000#sq\u0000~\u0000\u0000\u0001|\u00f6\u00d8q\u0000~\u0000\u000fp\u0000sq\u0000~\u0000\u000b\u0001|\u00f6\u00cdppsq\u0000~\u0000\u0012\u0001|\u00f6\u00c2q\u0000~\u0000\u000f"
+"psq\u0000~\u0000\u0015\u0001|\u00f6\u00bfq\u0000~\u0000\u000fpq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000(net.sourceforge.czt"
+".core.jaxb.gen.OrPredq\u0000~\u0000#sq\u0000~\u0000\u0000\u0001|\u00f6\u00d8q\u0000~\u0000\u000fp\u0000sq\u0000~\u0000\u000b\u0001|\u00f6\u00cdppsq\u0000~\u0000"
+"\u0012\u0001|\u00f6\u00c2q\u0000~\u0000\u000fpsq\u0000~\u0000\u0015\u0001|\u00f6\u00bfq\u0000~\u0000\u000fpq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u00000net.sourc"
+"eforge.czt.core.jaxb.gen.QntPredElementq\u0000~\u0000#sq\u0000~\u0000\u0000\u0001|\u00f6\u00d8q\u0000~\u0000\u000fp"
+"\u0000sq\u0000~\u0000\u000b\u0001|\u00f6\u00cdppsq\u0000~\u0000\u0012\u0001|\u00f6\u00c2q\u0000~\u0000\u000fpsq\u0000~\u0000\u0015\u0001|\u00f6\u00bfq\u0000~\u0000\u000fpq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001e"
+"sq\u0000~\u0000\u001ft\u00001net.sourceforge.czt.core.jaxb.gen.ExprPredElementq\u0000"
+"~\u0000#sq\u0000~\u0000\u0000\u0001|\u00f6\u00d8q\u0000~\u0000\u000fp\u0000sq\u0000~\u0000\u000b\u0001|\u00f6\u00cdppsq\u0000~\u0000\u0012\u0001|\u00f6\u00c2q\u0000~\u0000\u000fpsq\u0000~\u0000\u0015\u0001|\u00f6\u00bfq\u0000"
+"~\u0000\u000fpq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000-net.sourceforge.czt.core.jaxb.ge"
+"n.ImpliesPredq\u0000~\u0000#sq\u0000~\u0000\u0000\u0001|\u00f6\u00d8q\u0000~\u0000\u000fp\u0000sq\u0000~\u0000\u000b\u0001|\u00f6\u00cdppsq\u0000~\u0000\u0012\u0001|\u00f6\u00c2q\u0000~"
+"\u0000\u000fpsq\u0000~\u0000\u0015\u0001|\u00f6\u00bfq\u0000~\u0000\u000fpq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000,net.sourceforge.c"
+"zt.core.jaxb.gen.ExistsPredq\u0000~\u0000#sq\u0000~\u0000\u0000\u0001|\u00f6\u00d8q\u0000~\u0000\u000fp\u0000sq\u0000~\u0000\u000b\u0001|\u00f6\u00cdp"
+"psq\u0000~\u0000\u0012\u0001|\u00f6\u00c2q\u0000~\u0000\u000fpsq\u0000~\u0000\u0015\u0001|\u00f6\u00bfq\u0000~\u0000\u000fpq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000-net"
+".sourceforge.czt.core.jaxb.gen.FactElementq\u0000~\u0000#sq\u0000~\u0000\u0000\u0001|\u00f6\u00d8q\u0000~"
+"\u0000\u000fp\u0000sq\u0000~\u0000\u000b\u0001|\u00f6\u00cdppsq\u0000~\u0000\u0012\u0001|\u00f6\u00c2q\u0000~\u0000\u000fpsq\u0000~\u0000\u0015\u0001|\u00f6\u00bfq\u0000~\u0000\u000fpq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000"
+"~\u0000\u001esq\u0000~\u0000\u001ft\u00000net.sourceforge.czt.core.jaxb.gen.AndPredElement"
+"q\u0000~\u0000#q\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000\u0007SchTextq\u0000~\u0000&sr\u0000\"com.sun.msv.grammar.Expre"
+"ssionPool\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\bexpTablet\u0000/Lcom/sun/msv/grammar/Expre"
+"ssionPool$ClosedHash;xpsr\u0000-com.sun.msv.grammar.ExpressionPoo"
+"l$ClosedHash\u00d7j\u00d0N\u00ef\u00e8\u00ed\u001c\u0002\u0000\u0004I\u0000\u0005countI\u0000\tthresholdL\u0000\u0006parentq\u0000~\u0000\u00b0[\u0000\u0005"
+"tablet\u0000![Lcom/sun/msv/grammar/Expression;xp\u0000\u0000\u0000?\u0000\u0000\u0000rpur\u0000![Lco"
+"m.sun.msv.grammar.Expression;\u00d68D\u00c3]\u00ad\u00a7\n\u0002\u0000\u0000xp\u0000\u0000\u0001\u007fpppppq\u0000~\u0000\'pppp"
+"pppppppppppppppppppppppppppppppppppppppppppppppppppppppppppp"
+"pppppppppppppppppppppppq\u0000~\u0000@ppppppq\u0000~\u0000Cppppppq\u0000~\u0000Fppppppq\u0000~\u0000"
+"Ippppppq\u0000~\u0000Lq\u0000~\u0000*pppppppppq\u0000~\u0000\tppppppppppppppppppppppppppppp"
+"ppppppppppppppppppppppppppppppppppppppppppppppppppppppq\u0000~\u0000>p"
+"pppppq\u0000~\u0000Apppq\u0000~\u0000=pq\u0000~\u0000\u00a3q\u0000~\u0000\u009dq\u0000~\u0000\u0097q\u0000~\u0000\u0091q\u0000~\u0000\u008bq\u0000~\u0000\u0085q\u0000~\u0000\u007fq\u0000~\u0000yq"
+"\u0000~\u0000sq\u0000~\u0000mq\u0000~\u0000gq\u0000~\u0000\u00a2q\u0000~\u0000\u009cq\u0000~\u0000\u0096q\u0000~\u0000\u0090q\u0000~\u0000\u008aq\u0000~\u0000\u0084q\u0000~\u0000~q\u0000~\u0000xq\u0000~\u0000rq"
+"\u0000~\u0000lq\u0000~\u0000fq\u0000~\u0000`q\u0000~\u0000Zq\u0000~\u0000Tq\u0000~\u0000Nq\u0000~\u00008q\u0000~\u00002q\u0000~\u0000,q\u0000~\u0000\u0011q\u0000~\u0000aq\u0000~\u0000[q"
+"\u0000~\u0000Uq\u0000~\u0000Oq\u0000~\u00009q\u0000~\u00003q\u0000~\u0000-q\u0000~\u0000\u0014q\u0000~\u0000Jq\u0000~\u0000Gq\u0000~\u0000Dq\u0000~\u0000\u00a9q\u0000~\u0000\u00a8pq\u0000~\u0000\f"
+"pppppppppq\u0000~\u0000\npppppppppppppppppppppppppppppppppppppppppppppp"
+"ppppppppppppppppq\u0000~\u0000?ppppppq\u0000~\u0000Bppppppq\u0000~\u0000Eppppppq\u0000~\u0000Hpppppp"
+"q\u0000~\u0000Kq\u0000~\u0000)pq\u0000~\u0000(ppppp"));
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
            return net.sourceforge.czt.core.jaxb.gen.impl.SchTextElementImpl.this;
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
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.core.jaxb.gen.impl.SchTextImpl)net.sourceforge.czt.core.jaxb.gen.impl.SchTextElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("Decl" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.core.jaxb.gen.impl.SchTextImpl)net.sourceforge.czt.core.jaxb.gen.impl.SchTextElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("InclDecl" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.core.jaxb.gen.impl.SchTextImpl)net.sourceforge.czt.core.jaxb.gen.impl.SchTextElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("VarDecl" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.core.jaxb.gen.impl.SchTextImpl)net.sourceforge.czt.core.jaxb.gen.impl.SchTextElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("ConstDecl" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.core.jaxb.gen.impl.SchTextImpl)net.sourceforge.czt.core.jaxb.gen.impl.SchTextElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("Pred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.core.jaxb.gen.impl.SchTextImpl)net.sourceforge.czt.core.jaxb.gen.impl.SchTextElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("TruePred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.core.jaxb.gen.impl.SchTextImpl)net.sourceforge.czt.core.jaxb.gen.impl.SchTextElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("Pred2" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.core.jaxb.gen.impl.SchTextImpl)net.sourceforge.czt.core.jaxb.gen.impl.SchTextElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("MemPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.core.jaxb.gen.impl.SchTextImpl)net.sourceforge.czt.core.jaxb.gen.impl.SchTextElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("Exists1Pred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.core.jaxb.gen.impl.SchTextImpl)net.sourceforge.czt.core.jaxb.gen.impl.SchTextElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("FalsePred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.core.jaxb.gen.impl.SchTextImpl)net.sourceforge.czt.core.jaxb.gen.impl.SchTextElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("NegPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.core.jaxb.gen.impl.SchTextImpl)net.sourceforge.czt.core.jaxb.gen.impl.SchTextElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("IffPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.core.jaxb.gen.impl.SchTextImpl)net.sourceforge.czt.core.jaxb.gen.impl.SchTextElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("ForallPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.core.jaxb.gen.impl.SchTextImpl)net.sourceforge.czt.core.jaxb.gen.impl.SchTextElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("JokerPred" == ___local)&&("http://czt.sourceforge.net/zpatt" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.core.jaxb.gen.impl.SchTextImpl)net.sourceforge.czt.core.jaxb.gen.impl.SchTextElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("OrPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.core.jaxb.gen.impl.SchTextImpl)net.sourceforge.czt.core.jaxb.gen.impl.SchTextElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("QntPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.core.jaxb.gen.impl.SchTextImpl)net.sourceforge.czt.core.jaxb.gen.impl.SchTextElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("ExprPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.core.jaxb.gen.impl.SchTextImpl)net.sourceforge.czt.core.jaxb.gen.impl.SchTextElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("ImpliesPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.core.jaxb.gen.impl.SchTextImpl)net.sourceforge.czt.core.jaxb.gen.impl.SchTextElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("ExistsPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.core.jaxb.gen.impl.SchTextImpl)net.sourceforge.czt.core.jaxb.gen.impl.SchTextElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("Fact" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.core.jaxb.gen.impl.SchTextImpl)net.sourceforge.czt.core.jaxb.gen.impl.SchTextElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("AndPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.core.jaxb.gen.impl.SchTextImpl)net.sourceforge.czt.core.jaxb.gen.impl.SchTextElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        spawnHandlerFromEnterElement((((net.sourceforge.czt.core.jaxb.gen.impl.SchTextImpl)net.sourceforge.czt.core.jaxb.gen.impl.SchTextElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                        return ;
                    case  0 :
                        if (("SchText" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
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
                    case  2 :
                        if (("SchText" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            context.popAttributes();
                            state = 3;
                            return ;
                        }
                        break;
                    case  3 :
                        revertToParentFromLeaveElement(___uri, ___local, ___qname);
                        return ;
                    case  1 :
                        spawnHandlerFromLeaveElement((((net.sourceforge.czt.core.jaxb.gen.impl.SchTextImpl)net.sourceforge.czt.core.jaxb.gen.impl.SchTextElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
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
                        spawnHandlerFromEnterAttribute((((net.sourceforge.czt.core.jaxb.gen.impl.SchTextImpl)net.sourceforge.czt.core.jaxb.gen.impl.SchTextElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
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
                        spawnHandlerFromLeaveAttribute((((net.sourceforge.czt.core.jaxb.gen.impl.SchTextImpl)net.sourceforge.czt.core.jaxb.gen.impl.SchTextElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
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
                            spawnHandlerFromText((((net.sourceforge.czt.core.jaxb.gen.impl.SchTextImpl)net.sourceforge.czt.core.jaxb.gen.impl.SchTextElementImpl.this).new Unmarshaller(context)), 2, value);
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
