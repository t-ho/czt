//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.1-05/30/2003 05:06 AM(java_re)-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2003.10.08 at 02:45:10 NZDT 
//


package net.sourceforge.czt.core.jaxb.gen.impl;

public class Exists1ExprImpl
    extends net.sourceforge.czt.core.jaxb.gen.impl.Qnt1ExprImpl
    implements net.sourceforge.czt.core.jaxb.gen.Exists1Expr, com.sun.xml.bind.JAXBObject, com.sun.xml.bind.RIElement, net.sourceforge.czt.zpatt.jaxb.gen.impl.runtime.UnmarshallableObject, net.sourceforge.czt.zpatt.jaxb.gen.impl.runtime.XMLSerializable, net.sourceforge.czt.zpatt.jaxb.gen.impl.runtime.ValidatableObject
{

    public final static java.lang.Class version = (net.sourceforge.czt.core.jaxb.gen.impl.JAXBVersion.class);
    private static com.sun.msv.grammar.Grammar schemaFragment;

    public java.lang.String ____jaxb_ri____getNamespaceURI() {
        return "http://czt.sourceforge.net/zml";
    }

    public java.lang.String ____jaxb_ri____getLocalName() {
        return "Exists1Expr";
    }

    private final static java.lang.Class PRIMARY_INTERFACE_CLASS() {
        return (net.sourceforge.czt.core.jaxb.gen.Exists1Expr.class);
    }

    public net.sourceforge.czt.zpatt.jaxb.gen.impl.runtime.UnmarshallingEventHandler createUnmarshaller(net.sourceforge.czt.zpatt.jaxb.gen.impl.runtime.UnmarshallingContext context) {
        return new net.sourceforge.czt.core.jaxb.gen.impl.Exists1ExprImpl.Unmarshaller(context);
    }

    public void serializeElementBody(net.sourceforge.czt.zpatt.jaxb.gen.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        context.startElement("http://czt.sourceforge.net/zml", "Exists1Expr");
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
        context.startElement("http://czt.sourceforge.net/zml", "Exists1Expr");
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
        return (net.sourceforge.czt.core.jaxb.gen.Exists1Expr.class);
    }

    public com.sun.msv.verifier.DocumentDeclaration createRawValidator() {
        if (schemaFragment == null) {
            schemaFragment = com.sun.xml.bind.validator.SchemaDeserializer.deserialize((
 "\u00ac\u00ed\u0000\u0005sr\u0000\'com.sun.msv.grammar.trex.ElementPattern\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000"
+"\tnameClasst\u0000\u001fLcom/sun/msv/grammar/NameClass;xr\u0000\u001ecom.sun.msv."
+"grammar.ElementExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002Z\u0000\u001aignoreUndeclaredAttributesL\u0000"
+"\fcontentModelt\u0000 Lcom/sun/msv/grammar/Expression;xr\u0000\u001ecom.sun."
+"msv.grammar.Expression\u00f8\u0018\u0082\u00e8N5~O\u0002\u0000\u0003I\u0000\u000ecachedHashCodeL\u0000\u0013epsilon"
+"Reducibilityt\u0000\u0013Ljava/lang/Boolean;L\u0000\u000bexpandedExpq\u0000~\u0000\u0003xpAzm\u00b3p"
+"p\u0000sr\u0000\u001fcom.sun.msv.grammar.SequenceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun."
+"msv.grammar.BinaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0004exp1q\u0000~\u0000\u0003L\u0000\u0004exp2q\u0000~\u0000\u0003xq\u0000~"
+"\u0000\u0004Azm\u00a8ppsq\u0000~\u0000\u0007\u0004v\u00e4\u00b0ppsr\u0000\u001dcom.sun.msv.grammar.ChoiceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000"
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
+"\u0000\u0004Annst\u0000\u001ehttp://czt.sourceforge.net/zmlq\u0000~\u0000\u001esq\u0000~\u0000\u000b\u0002\u00f9\u00ed\u00bdppsq\u0000~"
+"\u0000\u0000\u0001|\u00f6\u00e3pp\u0000sq\u0000~\u0000\u0000\u0001|\u00f6\u00d8pp\u0000sq\u0000~\u0000\u000b\u0001|\u00f6\u00cdppsq\u0000~\u0000\u0012\u0001|\u00f6\u00c2q\u0000~\u0000\u000fpsq\u0000~\u0000\u0015\u0001|\u00f6\u00bf"
+"q\u0000~\u0000\u000fpq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000)net.sourceforge.czt.core.jaxb."
+"gen.SchTextq\u0000~\u0000#sq\u0000~\u0000\u001ft\u0000\u0007SchTextq\u0000~\u0000&sq\u0000~\u0000\u0000\u0001|\u00f6\u00d8pp\u0000sq\u0000~\u0000\u000b\u0001|\u00f6\u00cd"
+"ppsq\u0000~\u0000\u0012\u0001|\u00f6\u00c2q\u0000~\u0000\u000fpsq\u0000~\u0000\u0015\u0001|\u00f6\u00bfq\u0000~\u0000\u000fpq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u00000ne"
+"t.sourceforge.czt.core.jaxb.gen.SchTextElementq\u0000~\u0000#sq\u0000~\u0000\u000b=\u0003\u0088"
+"\u00f3ppsq\u0000~\u0000\u000b=\u0003\u0088\u00e8q\u0000~\u0000\u000fpsq\u0000~\u0000\u000b;\u0086\u0092\u000eq\u0000~\u0000\u000fpsq\u0000~\u0000\u000b:\t\u009b4q\u0000~\u0000\u000fpsq\u0000~\u0000\u000b8\u008c\u00a4"
+"Zq\u0000~\u0000\u000fpsq\u0000~\u0000\u000b7\u000f\u00ad\u0080q\u0000~\u0000\u000fpsq\u0000~\u0000\u000b5\u0092\u00b6\u00a6q\u0000~\u0000\u000fpsq\u0000~\u0000\u000b4\u0015\u00bf\u00ccq\u0000~\u0000\u000fpsq\u0000~\u0000"
+"\u000b2\u0098\u00c8\u00f2q\u0000~\u0000\u000fpsq\u0000~\u0000\u000b1\u001b\u00d2\u0018q\u0000~\u0000\u000fpsq\u0000~\u0000\u000b/\u009e\u00db>q\u0000~\u0000\u000fpsq\u0000~\u0000\u000b.!\u00e4dq\u0000~\u0000\u000fps"
+"q\u0000~\u0000\u000b,\u00a4\u00ed\u008aq\u0000~\u0000\u000fpsq\u0000~\u0000\u000b+\'\u00f6\u00b0q\u0000~\u0000\u000fpsq\u0000~\u0000\u000b)\u00aa\u00ff\u00d6q\u0000~\u0000\u000fpsq\u0000~\u0000\u000b(.\b\u00fcq\u0000~"
+"\u0000\u000fpsq\u0000~\u0000\u000b&\u00b1\u0012\"q\u0000~\u0000\u000fpsq\u0000~\u0000\u000b%4\u001bHq\u0000~\u0000\u000fpsq\u0000~\u0000\u000b#\u00b7$nq\u0000~\u0000\u000fpsq\u0000~\u0000\u000b\":-"
+"\u0094q\u0000~\u0000\u000fpsq\u0000~\u0000\u000b \u00bd6\u00baq\u0000~\u0000\u000fpsq\u0000~\u0000\u000b\u001f@?\u00e0q\u0000~\u0000\u000fpsq\u0000~\u0000\u000b\u001d\u00c3I\u0006q\u0000~\u0000\u000fpsq\u0000~\u0000"
+"\u000b\u001cFR,q\u0000~\u0000\u000fpsq\u0000~\u0000\u000b\u001a\u00c9[Rq\u0000~\u0000\u000fpsq\u0000~\u0000\u000b\u0019Ldxq\u0000~\u0000\u000fpsq\u0000~\u0000\u000b\u0017\u00cfm\u009eq\u0000~\u0000\u000fps"
+"q\u0000~\u0000\u000b\u0016Rv\u00c4q\u0000~\u0000\u000fpsq\u0000~\u0000\u000b\u0014\u00d5\u007f\u00eaq\u0000~\u0000\u000fpsq\u0000~\u0000\u000b\u0013X\u0089\u0010q\u0000~\u0000\u000fpsq\u0000~\u0000\u000b\u0011\u00db\u00926q\u0000~"
+"\u0000\u000fpsq\u0000~\u0000\u000b\u0010^\u009b\\q\u0000~\u0000\u000fpsq\u0000~\u0000\u000b\u000e\u00e1\u00a4\u0082q\u0000~\u0000\u000fpsq\u0000~\u0000\u000b\rd\u00ad\u00a8q\u0000~\u0000\u000fpsq\u0000~\u0000\u000b\u000b\u00e7\u00b6"
+"\u00ceq\u0000~\u0000\u000fpsq\u0000~\u0000\u000b\nj\u00bf\u00f4q\u0000~\u0000\u000fpsq\u0000~\u0000\u000b\b\u00ed\u00c9\u001aq\u0000~\u0000\u000fpsq\u0000~\u0000\u000b\u0007p\u00d2@q\u0000~\u0000\u000fpsq\u0000~\u0000"
+"\u000b\u0005\u00f3\u00dbfq\u0000~\u0000\u000fpsq\u0000~\u0000\u000b\u0004v\u00e4\u008cq\u0000~\u0000\u000fpsq\u0000~\u0000\u000b\u0002\u00f9\u00ed\u00b2q\u0000~\u0000\u000fpsq\u0000~\u0000\u0000\u0001|\u00f6\u00d8q\u0000~\u0000\u000fp\u0000"
+"sq\u0000~\u0000\u000b\u0001|\u00f6\u00cdppsq\u0000~\u0000\u0012\u0001|\u00f6\u00c2q\u0000~\u0000\u000fpsq\u0000~\u0000\u0015\u0001|\u00f6\u00bfq\u0000~\u0000\u000fpq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001es"
+"q\u0000~\u0000\u001ft\u00003net.sourceforge.czt.zpatt.jaxb.gen.JokerExprElementq"
+"\u0000~\u0000#sq\u0000~\u0000\u0000\u0001|\u00f6\u00d8q\u0000~\u0000\u000fp\u0000sq\u0000~\u0000\u000b\u0001|\u00f6\u00cdppsq\u0000~\u0000\u0012\u0001|\u00f6\u00c2q\u0000~\u0000\u000fpsq\u0000~\u0000\u0015\u0001|\u00f6\u00bfq"
+"\u0000~\u0000\u000fpq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000)net.sourceforge.czt.core.jaxb.g"
+"en.PreExprq\u0000~\u0000#sq\u0000~\u0000\u0000\u0001|\u00f6\u00d8q\u0000~\u0000\u000fp\u0000sq\u0000~\u0000\u000b\u0001|\u00f6\u00cdppsq\u0000~\u0000\u0012\u0001|\u00f6\u00c2q\u0000~\u0000\u000fp"
+"sq\u0000~\u0000\u0015\u0001|\u00f6\u00bfq\u0000~\u0000\u000fpq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000(net.sourceforge.czt."
+"core.jaxb.gen.OrExprq\u0000~\u0000#sq\u0000~\u0000\u0000\u0001|\u00f6\u00d8q\u0000~\u0000\u000fp\u0000sq\u0000~\u0000\u000b\u0001|\u00f6\u00cdppsq\u0000~\u0000\u0012"
+"\u0001|\u00f6\u00c2q\u0000~\u0000\u000fpsq\u0000~\u0000\u0015\u0001|\u00f6\u00bfq\u0000~\u0000\u000fpq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000)net.source"
+"forge.czt.core.jaxb.gen.IffExprq\u0000~\u0000#sq\u0000~\u0000\u0000\u0001|\u00f6\u00d8q\u0000~\u0000\u000fp\u0000sq\u0000~\u0000\u000b\u0001"
+"|\u00f6\u00cdppsq\u0000~\u0000\u0012\u0001|\u00f6\u00c2q\u0000~\u0000\u000fpsq\u0000~\u0000\u0015\u0001|\u00f6\u00bfq\u0000~\u0000\u000fpq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000"
+"1net.sourceforge.czt.core.jaxb.gen.Qnt1ExprElementq\u0000~\u0000#sq\u0000~\u0000"
+"\u0000\u0001|\u00f6\u00d8q\u0000~\u0000\u000fp\u0000sq\u0000~\u0000\u000b\u0001|\u00f6\u00cdppsq\u0000~\u0000\u0012\u0001|\u00f6\u00c2q\u0000~\u0000\u000fpsq\u0000~\u0000\u0015\u0001|\u00f6\u00bfq\u0000~\u0000\u000fpq\u0000~\u0000"
+"\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000)net.sourceforge.czt.core.jaxb.gen.LetExp"
+"rq\u0000~\u0000#sq\u0000~\u0000\u0000\u0001|\u00f6\u00d8q\u0000~\u0000\u000fp\u0000sq\u0000~\u0000\u000b\u0001|\u00f6\u00cdppsq\u0000~\u0000\u0012\u0001|\u00f6\u00c2q\u0000~\u0000\u000fpsq\u0000~\u0000\u0015\u0001|\u00f6"
+"\u00bfq\u0000~\u0000\u000fpq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000-net.sourceforge.czt.core.jaxb"
+".gen.Exists1Exprq\u0000~\u0000#sq\u0000~\u0000\u0000\u0001|\u00f6\u00d8q\u0000~\u0000\u000fp\u0000sq\u0000~\u0000\u000b\u0001|\u00f6\u00cdppsq\u0000~\u0000\u0012\u0001|\u00f6\u00c2"
+"q\u0000~\u0000\u000fpsq\u0000~\u0000\u0015\u0001|\u00f6\u00bfq\u0000~\u0000\u000fpq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u00000net.sourceforg"
+"e.czt.core.jaxb.gen.NumExprElementq\u0000~\u0000#sq\u0000~\u0000\u0000\u0001|\u00f6\u00d8q\u0000~\u0000\u000fp\u0000sq\u0000~"
+"\u0000\u000b\u0001|\u00f6\u00cdppsq\u0000~\u0000\u0012\u0001|\u00f6\u00c2q\u0000~\u0000\u000fpsq\u0000~\u0000\u0015\u0001|\u00f6\u00bfq\u0000~\u0000\u000fpq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000"
+"\u001ft\u00000net.sourceforge.czt.core.jaxb.gen.QntExprElementq\u0000~\u0000#sq\u0000"
+"~\u0000\u0000\u0001|\u00f6\u00d8q\u0000~\u0000\u000fp\u0000sq\u0000~\u0000\u000b\u0001|\u00f6\u00cdppsq\u0000~\u0000\u0012\u0001|\u00f6\u00c2q\u0000~\u0000\u000fpsq\u0000~\u0000\u0015\u0001|\u00f6\u00bfq\u0000~\u0000\u000fpq\u0000"
+"~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u00001net.sourceforge.czt.core.jaxb.gen.SchE"
+"xpr2Elementq\u0000~\u0000#sq\u0000~\u0000\u0000\u0001|\u00f6\u00d8q\u0000~\u0000\u000fp\u0000sq\u0000~\u0000\u000b\u0001|\u00f6\u00cdppsq\u0000~\u0000\u0012\u0001|\u00f6\u00c2q\u0000~\u0000\u000f"
+"psq\u0000~\u0000\u0015\u0001|\u00f6\u00bfq\u0000~\u0000\u000fpq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000,net.sourceforge.czt"
+".core.jaxb.gen.ExistsExprq\u0000~\u0000#sq\u0000~\u0000\u0000\u0001|\u00f6\u00d8q\u0000~\u0000\u000fp\u0000sq\u0000~\u0000\u000b\u0001|\u00f6\u00cdpps"
+"q\u0000~\u0000\u0012\u0001|\u00f6\u00c2q\u0000~\u0000\u000fpsq\u0000~\u0000\u0015\u0001|\u00f6\u00bfq\u0000~\u0000\u000fpq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u00001net.s"
+"ourceforge.czt.core.jaxb.gen.BindExprElementq\u0000~\u0000#sq\u0000~\u0000\u0000\u0001|\u00f6\u00d8q"
+"\u0000~\u0000\u000fp\u0000sq\u0000~\u0000\u000b\u0001|\u00f6\u00cdppsq\u0000~\u0000\u0012\u0001|\u00f6\u00c2q\u0000~\u0000\u000fpsq\u0000~\u0000\u0015\u0001|\u00f6\u00bfq\u0000~\u0000\u000fpq\u0000~\u0000\u0018q\u0000~\u0000\u001c"
+"q\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000.net.sourceforge.czt.core.jaxb.gen.Expr2Element"
+"q\u0000~\u0000#sq\u0000~\u0000\u0000\u0001|\u00f6\u00d8q\u0000~\u0000\u000fp\u0000sq\u0000~\u0000\u000b\u0001|\u00f6\u00cdppsq\u0000~\u0000\u0012\u0001|\u00f6\u00c2q\u0000~\u0000\u000fpsq\u0000~\u0000\u0015\u0001|\u00f6\u00bf"
+"q\u0000~\u0000\u000fpq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000/net.sourceforge.czt.core.jaxb."
+"gen.Expr0NElementq\u0000~\u0000#sq\u0000~\u0000\u0000\u0001|\u00f6\u00d8q\u0000~\u0000\u000fp\u0000sq\u0000~\u0000\u000b\u0001|\u00f6\u00cdppsq\u0000~\u0000\u0012\u0001|\u00f6"
+"\u00c2q\u0000~\u0000\u000fpsq\u0000~\u0000\u0015\u0001|\u00f6\u00bfq\u0000~\u0000\u000fpq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000+net.sourcefor"
+"ge.czt.core.jaxb.gen.PowerExprq\u0000~\u0000#sq\u0000~\u0000\u0000\u0001|\u00f6\u00d8q\u0000~\u0000\u000fp\u0000sq\u0000~\u0000\u000b\u0001|"
+"\u00f6\u00cdppsq\u0000~\u0000\u0012\u0001|\u00f6\u00c2q\u0000~\u0000\u000fpsq\u0000~\u0000\u0015\u0001|\u00f6\u00bfq\u0000~\u0000\u000fpq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000-"
+"net.sourceforge.czt.core.jaxb.gen.SetCompExprq\u0000~\u0000#sq\u0000~\u0000\u0000\u0001|\u00f6\u00d8"
+"q\u0000~\u0000\u000fp\u0000sq\u0000~\u0000\u000b\u0001|\u00f6\u00cdppsq\u0000~\u0000\u0012\u0001|\u00f6\u00c2q\u0000~\u0000\u000fpsq\u0000~\u0000\u0015\u0001|\u00f6\u00bfq\u0000~\u0000\u000fpq\u0000~\u0000\u0018q\u0000~\u0000"
+"\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u00004net.sourceforge.czt.core.jaxb.gen.BindSelExpr"
+"Elementq\u0000~\u0000#sq\u0000~\u0000\u0000\u0001|\u00f6\u00d8q\u0000~\u0000\u000fp\u0000sq\u0000~\u0000\u000b\u0001|\u00f6\u00cdppsq\u0000~\u0000\u0012\u0001|\u00f6\u00c2q\u0000~\u0000\u000fpsq\u0000"
+"~\u0000\u0015\u0001|\u00f6\u00bfq\u0000~\u0000\u000fpq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000/net.sourceforge.czt.cor"
+"e.jaxb.gen.Expr2NElementq\u0000~\u0000#sq\u0000~\u0000\u0000\u0001|\u00f6\u00d8q\u0000~\u0000\u000fp\u0000sq\u0000~\u0000\u000b\u0001|\u00f6\u00cdppsq"
+"\u0000~\u0000\u0012\u0001|\u00f6\u00c2q\u0000~\u0000\u000fpsq\u0000~\u0000\u0015\u0001|\u00f6\u00bfq\u0000~\u0000\u000fpq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u00002net.so"
+"urceforge.czt.core.jaxb.gen.DecorExprElementq\u0000~\u0000#sq\u0000~\u0000\u0000\u0001|\u00f6\u00d8q"
+"\u0000~\u0000\u000fp\u0000sq\u0000~\u0000\u000b\u0001|\u00f6\u00cdppsq\u0000~\u0000\u0012\u0001|\u00f6\u00c2q\u0000~\u0000\u000fpsq\u0000~\u0000\u0015\u0001|\u00f6\u00bfq\u0000~\u0000\u000fpq\u0000~\u0000\u0018q\u0000~\u0000\u001c"
+"q\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000-net.sourceforge.czt.core.jaxb.gen.ImpliesExprq"
+"\u0000~\u0000#sq\u0000~\u0000\u0000\u0001|\u00f6\u00d8q\u0000~\u0000\u000fp\u0000sq\u0000~\u0000\u000b\u0001|\u00f6\u00cdppsq\u0000~\u0000\u0012\u0001|\u00f6\u00c2q\u0000~\u0000\u000fpsq\u0000~\u0000\u0015\u0001|\u00f6\u00bfq"
+"\u0000~\u0000\u000fpq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000*net.sourceforge.czt.core.jaxb.g"
+"en.CompExprq\u0000~\u0000#sq\u0000~\u0000\u0000\u0001|\u00f6\u00d8q\u0000~\u0000\u000fp\u0000sq\u0000~\u0000\u000b\u0001|\u00f6\u00cdppsq\u0000~\u0000\u0012\u0001|\u00f6\u00c2q\u0000~\u0000\u000f"
+"psq\u0000~\u0000\u0015\u0001|\u00f6\u00bfq\u0000~\u0000\u000fpq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000,net.sourceforge.czt"
+".core.jaxb.gen.ForallExprq\u0000~\u0000#sq\u0000~\u0000\u0000\u0001|\u00f6\u00d8q\u0000~\u0000\u000fp\u0000sq\u0000~\u0000\u000b\u0001|\u00f6\u00cdpps"
+"q\u0000~\u0000\u0012\u0001|\u00f6\u00c2q\u0000~\u0000\u000fpsq\u0000~\u0000\u0015\u0001|\u00f6\u00bfq\u0000~\u0000\u000fpq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000*net.s"
+"ourceforge.czt.core.jaxb.gen.ProdExprq\u0000~\u0000#sq\u0000~\u0000\u0000\u0001|\u00f6\u00d8q\u0000~\u0000\u000fp\u0000s"
+"q\u0000~\u0000\u000b\u0001|\u00f6\u00cdppsq\u0000~\u0000\u0012\u0001|\u00f6\u00c2q\u0000~\u0000\u000fpsq\u0000~\u0000\u0015\u0001|\u00f6\u00bfq\u0000~\u0000\u000fpq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq"
+"\u0000~\u0000\u001ft\u0000*net.sourceforge.czt.core.jaxb.gen.ProjExprq\u0000~\u0000#sq\u0000~\u0000\u0000"
+"\u0001|\u00f6\u00d8q\u0000~\u0000\u000fp\u0000sq\u0000~\u0000\u000b\u0001|\u00f6\u00cdppsq\u0000~\u0000\u0012\u0001|\u00f6\u00c2q\u0000~\u0000\u000fpsq\u0000~\u0000\u0015\u0001|\u00f6\u00bfq\u0000~\u0000\u000fpq\u0000~\u0000\u0018"
+"q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000(net.sourceforge.czt.core.jaxb.gen.MuExprq"
+"\u0000~\u0000#sq\u0000~\u0000\u0000\u0001|\u00f6\u00d8q\u0000~\u0000\u000fp\u0000sq\u0000~\u0000\u000b\u0001|\u00f6\u00cdppsq\u0000~\u0000\u0012\u0001|\u00f6\u00c2q\u0000~\u0000\u000fpsq\u0000~\u0000\u0015\u0001|\u00f6\u00bfq"
+"\u0000~\u0000\u000fpq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000)net.sourceforge.czt.core.jaxb.g"
+"en.NegExprq\u0000~\u0000#sq\u0000~\u0000\u0000\u0001|\u00f6\u00d8q\u0000~\u0000\u000fp\u0000sq\u0000~\u0000\u000b\u0001|\u00f6\u00cdppsq\u0000~\u0000\u0012\u0001|\u00f6\u00c2q\u0000~\u0000\u000fp"
+"sq\u0000~\u0000\u0015\u0001|\u00f6\u00bfq\u0000~\u0000\u000fpq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000.net.sourceforge.czt."
+"core.jaxb.gen.Expr1Elementq\u0000~\u0000#sq\u0000~\u0000\u0000\u0001|\u00f6\u00d8q\u0000~\u0000\u000fp\u0000sq\u0000~\u0000\u000b\u0001|\u00f6\u00cdpp"
+"sq\u0000~\u0000\u0012\u0001|\u00f6\u00c2q\u0000~\u0000\u000fpsq\u0000~\u0000\u0015\u0001|\u00f6\u00bfq\u0000~\u0000\u000fpq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000*net."
+"sourceforge.czt.core.jaxb.gen.PipeExprq\u0000~\u0000#sq\u0000~\u0000\u0000\u0001|\u00f6\u00d8q\u0000~\u0000\u000fp\u0000"
+"sq\u0000~\u0000\u000b\u0001|\u00f6\u00cdppsq\u0000~\u0000\u0012\u0001|\u00f6\u00c2q\u0000~\u0000\u000fpsq\u0000~\u0000\u0015\u0001|\u00f6\u00bfq\u0000~\u0000\u000fpq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001es"
+"q\u0000~\u0000\u001ft\u00001net.sourceforge.czt.core.jaxb.gen.ApplExprElementq\u0000~"
+"\u0000#sq\u0000~\u0000\u0000\u0001|\u00f6\u00d8q\u0000~\u0000\u000fp\u0000sq\u0000~\u0000\u000b\u0001|\u00f6\u00cdppsq\u0000~\u0000\u0012\u0001|\u00f6\u00c2q\u0000~\u0000\u000fpsq\u0000~\u0000\u0015\u0001|\u00f6\u00bfq\u0000~"
+"\u0000\u000fpq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000)net.sourceforge.czt.core.jaxb.gen"
+".SetExprq\u0000~\u0000#sq\u0000~\u0000\u0000\u0001|\u00f6\u00d8q\u0000~\u0000\u000fp\u0000sq\u0000~\u0000\u000b\u0001|\u00f6\u00cdppsq\u0000~\u0000\u0012\u0001|\u00f6\u00c2q\u0000~\u0000\u000fpsq"
+"\u0000~\u0000\u0015\u0001|\u00f6\u00bfq\u0000~\u0000\u000fpq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000,net.sourceforge.czt.co"
+"re.jaxb.gen.LambdaExprq\u0000~\u0000#sq\u0000~\u0000\u0000\u0001|\u00f6\u00d8q\u0000~\u0000\u000fp\u0000sq\u0000~\u0000\u000b\u0001|\u00f6\u00cdppsq\u0000~"
+"\u0000\u0012\u0001|\u00f6\u00c2q\u0000~\u0000\u000fpsq\u0000~\u0000\u0015\u0001|\u00f6\u00bfq\u0000~\u0000\u000fpq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u00005net.sour"
+"ceforge.czt.core.jaxb.gen.TupleSelExprElementq\u0000~\u0000#sq\u0000~\u0000\u0000\u0001|\u00f6\u00d8"
+"q\u0000~\u0000\u000fp\u0000sq\u0000~\u0000\u000b\u0001|\u00f6\u00cdppsq\u0000~\u0000\u0012\u0001|\u00f6\u00c2q\u0000~\u0000\u000fpsq\u0000~\u0000\u0015\u0001|\u00f6\u00bfq\u0000~\u0000\u000fpq\u0000~\u0000\u0018q\u0000~\u0000"
+"\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000)net.sourceforge.czt.core.jaxb.gen.AndExprq\u0000~\u0000"
+"#sq\u0000~\u0000\u0000\u0001|\u00f6\u00d8q\u0000~\u0000\u000fp\u0000sq\u0000~\u0000\u000b\u0001|\u00f6\u00cdppsq\u0000~\u0000\u0012\u0001|\u00f6\u00c2q\u0000~\u0000\u000fpsq\u0000~\u0000\u0015\u0001|\u00f6\u00bfq\u0000~\u0000"
+"\u000fpq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u00003net.sourceforge.czt.core.jaxb.gen."
+"RenameExprElementq\u0000~\u0000#sq\u0000~\u0000\u0000\u0001|\u00f6\u00d8q\u0000~\u0000\u000fp\u0000sq\u0000~\u0000\u000b\u0001|\u00f6\u00cdppsq\u0000~\u0000\u0012\u0001|\u00f6"
+"\u00c2q\u0000~\u0000\u000fpsq\u0000~\u0000\u0015\u0001|\u00f6\u00bfq\u0000~\u0000\u000fpq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u00001net.sourcefor"
+"ge.czt.core.jaxb.gen.CondExprElementq\u0000~\u0000#sq\u0000~\u0000\u0000\u0001|\u00f6\u00d8q\u0000~\u0000\u000fp\u0000sq"
+"\u0000~\u0000\u000b\u0001|\u00f6\u00cdppsq\u0000~\u0000\u0012\u0001|\u00f6\u00c2q\u0000~\u0000\u000fpsq\u0000~\u0000\u0015\u0001|\u00f6\u00bfq\u0000~\u0000\u000fpq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000"
+"~\u0000\u001ft\u00000net.sourceforge.czt.core.jaxb.gen.SchExprElementq\u0000~\u0000#s"
+"q\u0000~\u0000\u0000\u0001|\u00f6\u00d8q\u0000~\u0000\u000fp\u0000sq\u0000~\u0000\u000b\u0001|\u00f6\u00cdppsq\u0000~\u0000\u0012\u0001|\u00f6\u00c2q\u0000~\u0000\u000fpsq\u0000~\u0000\u0015\u0001|\u00f6\u00bfq\u0000~\u0000\u000fp"
+"q\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u00002net.sourceforge.czt.core.jaxb.gen.Th"
+"etaExprElementq\u0000~\u0000#sq\u0000~\u0000\u0000\u0001|\u00f6\u00d8q\u0000~\u0000\u000fp\u0000sq\u0000~\u0000\u000b\u0001|\u00f6\u00cdppsq\u0000~\u0000\u0012\u0001|\u00f6\u00c2q\u0000"
+"~\u0000\u000fpsq\u0000~\u0000\u0015\u0001|\u00f6\u00bfq\u0000~\u0000\u000fpq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u00000net.sourceforge."
+"czt.core.jaxb.gen.RefExprElementq\u0000~\u0000#sq\u0000~\u0000\u0000\u0001|\u00f6\u00d8q\u0000~\u0000\u000fp\u0000sq\u0000~\u0000\u000b"
+"\u0001|\u00f6\u00cdppsq\u0000~\u0000\u0012\u0001|\u00f6\u00c2q\u0000~\u0000\u000fpsq\u0000~\u0000\u0015\u0001|\u00f6\u00bfq\u0000~\u0000\u000fpq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft"
+"\u00001net.sourceforge.czt.core.jaxb.gen.HideExprElementq\u0000~\u0000#sq\u0000~"
+"\u0000\u0000\u0001|\u00f6\u00d8q\u0000~\u0000\u000fp\u0000sq\u0000~\u0000\u000b\u0001|\u00f6\u00cdppsq\u0000~\u0000\u0012\u0001|\u00f6\u00c2q\u0000~\u0000\u000fpsq\u0000~\u0000\u0015\u0001|\u00f6\u00bfq\u0000~\u0000\u000fpq\u0000~"
+"\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u00004net.sourceforge.czt.tcoz.jaxb.gen.Chann"
+"elExprElementq\u0000~\u0000#sq\u0000~\u0000\u0000\u0001|\u00f6\u00d8q\u0000~\u0000\u000fp\u0000sq\u0000~\u0000\u000b\u0001|\u00f6\u00cdppsq\u0000~\u0000\u0012\u0001|\u00f6\u00c2q\u0000~"
+"\u0000\u000fpsq\u0000~\u0000\u0015\u0001|\u00f6\u00bfq\u0000~\u0000\u000fpq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000+net.sourceforge.c"
+"zt.core.jaxb.gen.TupleExprq\u0000~\u0000#q\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000\u000bExists1Exprq\u0000~\u0000"
+"&sr\u0000\"com.sun.msv.grammar.ExpressionPool\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\bexpTabl"
+"et\u0000/Lcom/sun/msv/grammar/ExpressionPool$ClosedHash;xpsr\u0000-com"
+".sun.msv.grammar.ExpressionPool$ClosedHash\u00d7j\u00d0N\u00ef\u00e8\u00ed\u001c\u0002\u0000\u0004I\u0000\u0005coun"
+"tI\u0000\tthresholdL\u0000\u0006parentq\u0000~\u0001Y[\u0000\u0005tablet\u0000![Lcom/sun/msv/grammar/"
+"Expression;xp\u0000\u0000\u0000\u0085\u0000\u0000\u0000\u00e6pur\u0000![Lcom.sun.msv.grammar.Expression;\u00d6"
+"8D\u00c3]\u00ad\u00a7\n\u0002\u0000\u0000xp\u0000\u0000\u0002\u00ffppq\u0000~\u0000^pppq\u0000~\u0000[pppq\u0000~\u0000Xpppq\u0000~\u0000Upppq\u0000~\u0000Rpppq\u0000"
+"~\u0000Opppq\u0000~\u0000Lpppq\u0000~\u0000Ipppq\u0000~\u0000Fpppq\u0000~\u0000Cq\u0000~\u0000\nppq\u0000~\u0000@pppq\u0000~\u0000=pppq\u0000"
+"~\u0000:ppppppppppppppppppppppppppppppppppppppppppppppppppppppppp"
+"pppppppppppppppppppppppppppppppppppppppppppppppppppppppppppp"
+"pppppppppppppppppppppppppppppppppppppppppppppppppppppppppppp"
+"pppppq\u0000~\u00014q\u0000~\u0001.q\u0000~\u0001(q\u0000~\u0001\"q\u0000~\u0001\u001cq\u0000~\u0001\u0016q\u0000~\u0001\u0010q\u0000~\u0001\nq\u0000~\u0001\u0004q\u0000~\u0000\u00feq\u0000~\u0000\u00f8"
+"q\u0000~\u0001-q\u0000~\u0001\'q\u0000~\u0001!q\u0000~\u0001\u001bq\u0000~\u0001\u0015q\u0000~\u0001\u000fq\u0000~\u0001\tq\u0000~\u0001\u0003q\u0000~\u0000\u00fdq\u0000~\u0000\u00f7q\u0000~\u0000\u00f1q\u0000~\u0000\u00f2"
+"q\u0000~\u0000\u00ebq\u0000~\u0000\u00ecq\u0000~\u0000\u00e5q\u0000~\u0000\u00e6q\u0000~\u0000\u00dfq\u0000~\u0000\u00e0q\u0000~\u0000\u00d9q\u0000~\u0000\u00daq\u0000~\u0000\u00d3q\u0000~\u0000\u00d4q\u0000~\u0000\u00cdq\u0000~\u0000\u00ce"
+"q\u0000~\u0000\u00c7q\u0000~\u0000\u00c8q\u0000~\u0000\u00c1q\u0000~\u0000Wq\u0000~\u0000Zq\u0000~\u0000]q\u0000~\u0000\u0014q\u0000~\u0000+q\u0000~\u00003q\u0000~\u0000\fq\u0000~\u0000bq\u0000~\u0000h"
+"q\u0000~\u0000nq\u0000~\u0000tq\u0000~\u0000zq\u0000~\u0000\u0080q\u0000~\u0000\u0011q\u0000~\u0000*q\u0000~\u00002q\u0000~\u0000aq\u0000~\u0000gq\u0000~\u0000mq\u0000~\u0000sq\u0000~\u0000y"
+"q\u0000~\u0000\u007fq\u0000~\u0000\u0085q\u0000~\u0000\u008bq\u0000~\u0000\u0091q\u0000~\u0000\u0097q\u0000~\u0000\u009dq\u0000~\u0000\u00a3q\u0000~\u0000\u00a9q\u0000~\u0000\u00afq\u0000~\u0000\u00b5q\u0000~\u0000\u00bbq\u0000~\u0000\u0086"
+"q\u0000~\u0000\u008cq\u0000~\u0000\u0092q\u0000~\u0000\u0098q\u0000~\u0000\u009eq\u0000~\u0000\u00a4q\u0000~\u0000\u00aaq\u0000~\u0000\u00b0q\u0000~\u0000\u00b6q\u0000~\u0000\u00bcq\u0000~\u0000\u00c2q\u0000~\u0000Tq\u0000~\u0000Q"
+"q\u0000~\u0000Nq\u0000~\u0000Kq\u0000~\u0000Hq\u0000~\u0000Eq\u0000~\u0000Bq\u0000~\u0000?q\u0000~\u00013q\u0000~\u0001:q\u0000~\u00019q\u0000~\u0000<q\u0000~\u0001@q\u0000~\u0001?"
+"q\u0000~\u0001Fq\u0000~\u0001Eq\u0000~\u0001Lq\u0000~\u0001Kq\u0000~\u00009q\u0000~\u0001Rq\u0000~\u0001Qppppppppppppppppppppppppp"
+"pppppppppppppppppppppppppppppppppppppppppppppppppppppppppppp"
+"pppppppppppppppppppppppppppppppppppppppppppppppppppppppppppp"
+"ppppppppppppppppppppppppppppppppq\u0000~\u0000_pppq\u0000~\u0000\\pppq\u0000~\u0000Yppq\u0000~\u0000\'"
+"q\u0000~\u0000Vpppq\u0000~\u0000Spppq\u0000~\u0000Ppppq\u0000~\u0000Mpppq\u0000~\u0000Jpppq\u0000~\u0000Gpppq\u0000~\u0000Dpppq\u0000~\u0000"
+"Apppq\u0000~\u0000>pppq\u0000~\u0000;pppq\u0000~\u00008ppppppppppq\u0000~\u00007pppppppppppppppppppp"
+"ppppppppppppppppppppppq\u0000~\u0000\tppppppppppppppppppppppppppppppppp"
+"pppppppppppppppppppppppppppppppppppppppppppppppppppppppppppp"
+"ppppppppppppppppppppppppppppppppppppppppppppppppppppppp"));
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
            return net.sourceforge.czt.core.jaxb.gen.impl.Exists1ExprImpl.this;
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
                    case  0 :
                        if (("Exists1Expr" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 1;
                            return ;
                        }
                        break;
                    case  1 :
                        if (("Anns" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.core.jaxb.gen.impl.Qnt1ExprImpl)net.sourceforge.czt.core.jaxb.gen.impl.Exists1ExprImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("SchText" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.core.jaxb.gen.impl.Qnt1ExprImpl)net.sourceforge.czt.core.jaxb.gen.impl.Exists1ExprImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        spawnHandlerFromEnterElement((((net.sourceforge.czt.core.jaxb.gen.impl.Qnt1ExprImpl)net.sourceforge.czt.core.jaxb.gen.impl.Exists1ExprImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
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
                    case  1 :
                        spawnHandlerFromLeaveElement((((net.sourceforge.czt.core.jaxb.gen.impl.Qnt1ExprImpl)net.sourceforge.czt.core.jaxb.gen.impl.Exists1ExprImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
                        return ;
                    case  2 :
                        if (("Exists1Expr" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
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
                    case  3 :
                        revertToParentFromEnterAttribute(___uri, ___local, ___qname);
                        return ;
                    case  1 :
                        spawnHandlerFromEnterAttribute((((net.sourceforge.czt.core.jaxb.gen.impl.Qnt1ExprImpl)net.sourceforge.czt.core.jaxb.gen.impl.Exists1ExprImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
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
                        spawnHandlerFromLeaveAttribute((((net.sourceforge.czt.core.jaxb.gen.impl.Qnt1ExprImpl)net.sourceforge.czt.core.jaxb.gen.impl.Exists1ExprImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
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
                            spawnHandlerFromText((((net.sourceforge.czt.core.jaxb.gen.impl.Qnt1ExprImpl)net.sourceforge.czt.core.jaxb.gen.impl.Exists1ExprImpl.this).new Unmarshaller(context)), 2, value);
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
