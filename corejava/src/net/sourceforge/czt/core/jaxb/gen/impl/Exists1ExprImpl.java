//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.1-05/30/2003 05:06 AM(java_re)-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2003.08.25 at 03:03:07 NZST 
//


package net.sourceforge.czt.core.jaxb.gen.impl;

public class Exists1ExprImpl
    extends net.sourceforge.czt.core.jaxb.gen.impl.Qnt1ExprImpl
    implements net.sourceforge.czt.core.jaxb.gen.Exists1Expr, com.sun.xml.bind.JAXBObject, com.sun.xml.bind.RIElement, net.sourceforge.czt.core.jaxb.gen.impl.runtime.UnmarshallableObject, net.sourceforge.czt.core.jaxb.gen.impl.runtime.XMLSerializable, net.sourceforge.czt.core.jaxb.gen.impl.runtime.ValidatableObject
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

    public net.sourceforge.czt.core.jaxb.gen.impl.runtime.UnmarshallingEventHandler createUnmarshaller(net.sourceforge.czt.core.jaxb.gen.impl.runtime.UnmarshallingContext context) {
        return new net.sourceforge.czt.core.jaxb.gen.impl.Exists1ExprImpl.Unmarshaller(context);
    }

    public void serializeElementBody(net.sourceforge.czt.core.jaxb.gen.impl.runtime.XMLSerializer context)
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

    public void serializeAttributes(net.sourceforge.czt.core.jaxb.gen.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
    }

    public void serializeAttributeBody(net.sourceforge.czt.core.jaxb.gen.impl.runtime.XMLSerializer context)
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

    public void serializeURIs(net.sourceforge.czt.core.jaxb.gen.impl.runtime.XMLSerializer context)
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
+"Reducibilityt\u0000\u0013Ljava/lang/Boolean;L\u0000\u000bexpandedExpq\u0000~\u0000\u0003xp+\u00c4\u0001\u009fp"
+"p\u0000sr\u0000\u001fcom.sun.msv.grammar.SequenceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun."
+"msv.grammar.BinaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0004exp1q\u0000~\u0000\u0003L\u0000\u0004exp2q\u0000~\u0000\u0003xq\u0000~"
+"\u0000\u0004+\u00c4\u0001\u0094ppsq\u0000~\u0000\u0007\u0003\u00c0X\u0006ppsr\u0000\u001dcom.sun.msv.grammar.ChoiceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000"
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
+"\u0000\u0004Annst\u0000\u001ehttp://czt.sourceforge.net/zmlq\u0000~\u0000\u001esq\u0000~\u0000\u000b\u0002\u0080:\u00a1ppsq\u0000~"
+"\u0000\u0000\u0001@\u001dUpp\u0000sq\u0000~\u0000\u0000\u0001@\u001dJpp\u0000sq\u0000~\u0000\u000b\u0001@\u001d?ppsq\u0000~\u0000\u0012\u0001@\u001d4q\u0000~\u0000\u000fpsq\u0000~\u0000\u0015\u0001@\u001d1"
+"q\u0000~\u0000\u000fpq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000)net.sourceforge.czt.core.jaxb."
+"gen.SchTextq\u0000~\u0000#sq\u0000~\u0000\u001ft\u0000\u0007SchTextq\u0000~\u0000&sq\u0000~\u0000\u0000\u0001@\u001dJpp\u0000sq\u0000~\u0000\u000b\u0001@\u001d?"
+"ppsq\u0000~\u0000\u0012\u0001@\u001d4q\u0000~\u0000\u000fpsq\u0000~\u0000\u0015\u0001@\u001d1q\u0000~\u0000\u000fpq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u00000ne"
+"t.sourceforge.czt.core.jaxb.gen.SchTextElementq\u0000~\u0000#sq\u0000~\u0000\u000b(\u0003\u00a9"
+"\u0089ppsq\u0000~\u0000\u000b(\u0003\u00a9~q\u0000~\u0000\u000fpsq\u0000~\u0000\u000b&\u00c3\u008c2q\u0000~\u0000\u000fpsq\u0000~\u0000\u000b%\u0083n\u00e6q\u0000~\u0000\u000fpsq\u0000~\u0000\u000b$CQ"
+"\u009aq\u0000~\u0000\u000fpsq\u0000~\u0000\u000b#\u00034Nq\u0000~\u0000\u000fpsq\u0000~\u0000\u000b!\u00c3\u0017\u0002q\u0000~\u0000\u000fpsq\u0000~\u0000\u000b \u0082\u00f9\u00b6q\u0000~\u0000\u000fpsq\u0000~\u0000"
+"\u000b\u001fB\u00dcjq\u0000~\u0000\u000fpsq\u0000~\u0000\u000b\u001e\u0002\u00bf\u001eq\u0000~\u0000\u000fpsq\u0000~\u0000\u000b\u001c\u00c2\u00a1\u00d2q\u0000~\u0000\u000fpsq\u0000~\u0000\u000b\u001b\u0082\u0084\u0086q\u0000~\u0000\u000fps"
+"q\u0000~\u0000\u000b\u001aBg:q\u0000~\u0000\u000fpsq\u0000~\u0000\u000b\u0019\u0002I\u00eeq\u0000~\u0000\u000fpsq\u0000~\u0000\u000b\u0017\u00c2,\u00a2q\u0000~\u0000\u000fpsq\u0000~\u0000\u000b\u0016\u0082\u000fVq\u0000~"
+"\u0000\u000fpsq\u0000~\u0000\u000b\u0015A\u00f2\nq\u0000~\u0000\u000fpsq\u0000~\u0000\u000b\u0014\u0001\u00d4\u00beq\u0000~\u0000\u000fpsq\u0000~\u0000\u000b\u0012\u00c1\u00b7rq\u0000~\u0000\u000fpsq\u0000~\u0000\u000b\u0011\u0081\u009a"
+"&q\u0000~\u0000\u000fpsq\u0000~\u0000\u000b\u0010A|\u00daq\u0000~\u0000\u000fpsq\u0000~\u0000\u000b\u000f\u0001_\u008eq\u0000~\u0000\u000fpsq\u0000~\u0000\u000b\r\u00c1BBq\u0000~\u0000\u000fpsq\u0000~\u0000"
+"\u000b\f\u0081$\u00f6q\u0000~\u0000\u000fpsq\u0000~\u0000\u000b\u000bA\u0007\u00aaq\u0000~\u0000\u000fpsq\u0000~\u0000\u000b\n\u0000\u00ea^q\u0000~\u0000\u000fpsq\u0000~\u0000\u000b\b\u00c0\u00cd\u0012q\u0000~\u0000\u000fps"
+"q\u0000~\u0000\u000b\u0007\u0080\u00af\u00c6q\u0000~\u0000\u000fpsq\u0000~\u0000\u000b\u0006@\u0092zq\u0000~\u0000\u000fpsq\u0000~\u0000\u000b\u0005\u0000u.q\u0000~\u0000\u000fpsq\u0000~\u0000\u000b\u0003\u00c0W\u00e2q\u0000~"
+"\u0000\u000fpsq\u0000~\u0000\u000b\u0002\u0080:\u0096q\u0000~\u0000\u000fpsq\u0000~\u0000\u0000\u0001@\u001dJq\u0000~\u0000\u000fp\u0000sq\u0000~\u0000\u000b\u0001@\u001d?ppsq\u0000~\u0000\u0012\u0001@\u001d4q\u0000"
+"~\u0000\u000fpsq\u0000~\u0000\u0015\u0001@\u001d1q\u0000~\u0000\u000fpq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u00004net.sourceforge."
+"czt.core.jaxb.gen.BindSelExprElementq\u0000~\u0000#sq\u0000~\u0000\u0000\u0001@\u001dJq\u0000~\u0000\u000fp\u0000sq"
+"\u0000~\u0000\u000b\u0001@\u001d?ppsq\u0000~\u0000\u0012\u0001@\u001d4q\u0000~\u0000\u000fpsq\u0000~\u0000\u0015\u0001@\u001d1q\u0000~\u0000\u000fpq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000"
+"~\u0000\u001ft\u00002net.sourceforge.czt.core.jaxb.gen.DecorExprElementq\u0000~\u0000"
+"#sq\u0000~\u0000\u0000\u0001@\u001dJq\u0000~\u0000\u000fp\u0000sq\u0000~\u0000\u000b\u0001@\u001d?ppsq\u0000~\u0000\u0012\u0001@\u001d4q\u0000~\u0000\u000fpsq\u0000~\u0000\u0015\u0001@\u001d1q\u0000~\u0000"
+"\u000fpq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u00001net.sourceforge.czt.core.jaxb.gen."
+"HideExprElementq\u0000~\u0000#sq\u0000~\u0000\u0000\u0001@\u001dJq\u0000~\u0000\u000fp\u0000sq\u0000~\u0000\u000b\u0001@\u001d?ppsq\u0000~\u0000\u0012\u0001@\u001d4q"
+"\u0000~\u0000\u000fpsq\u0000~\u0000\u0015\u0001@\u001d1q\u0000~\u0000\u000fpq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000)net.sourceforge"
+".czt.core.jaxb.gen.NegExprq\u0000~\u0000#sq\u0000~\u0000\u0000\u0001@\u001dJq\u0000~\u0000\u000fp\u0000sq\u0000~\u0000\u000b\u0001@\u001d?pp"
+"sq\u0000~\u0000\u0012\u0001@\u001d4q\u0000~\u0000\u000fpsq\u0000~\u0000\u0015\u0001@\u001d1q\u0000~\u0000\u000fpq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000+net."
+"sourceforge.czt.core.jaxb.gen.PowerExprq\u0000~\u0000#sq\u0000~\u0000\u0000\u0001@\u001dJq\u0000~\u0000\u000fp"
+"\u0000sq\u0000~\u0000\u000b\u0001@\u001d?ppsq\u0000~\u0000\u0012\u0001@\u001d4q\u0000~\u0000\u000fpsq\u0000~\u0000\u0015\u0001@\u001d1q\u0000~\u0000\u000fpq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001e"
+"sq\u0000~\u0000\u001ft\u0000)net.sourceforge.czt.core.jaxb.gen.PreExprq\u0000~\u0000#sq\u0000~\u0000"
+"\u0000\u0001@\u001dJq\u0000~\u0000\u000fp\u0000sq\u0000~\u0000\u000b\u0001@\u001d?ppsq\u0000~\u0000\u0012\u0001@\u001d4q\u0000~\u0000\u000fpsq\u0000~\u0000\u0015\u0001@\u001d1q\u0000~\u0000\u000fpq\u0000~\u0000"
+"\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u00003net.sourceforge.czt.core.jaxb.gen.Rename"
+"ExprElementq\u0000~\u0000#sq\u0000~\u0000\u0000\u0001@\u001dJq\u0000~\u0000\u000fp\u0000sq\u0000~\u0000\u000b\u0001@\u001d?ppsq\u0000~\u0000\u0012\u0001@\u001d4q\u0000~\u0000\u000f"
+"psq\u0000~\u0000\u0015\u0001@\u001d1q\u0000~\u0000\u000fpq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u00002net.sourceforge.czt"
+".core.jaxb.gen.ThetaExprElementq\u0000~\u0000#sq\u0000~\u0000\u0000\u0001@\u001dJq\u0000~\u0000\u000fp\u0000sq\u0000~\u0000\u000b\u0001"
+"@\u001d?ppsq\u0000~\u0000\u0012\u0001@\u001d4q\u0000~\u0000\u000fpsq\u0000~\u0000\u0015\u0001@\u001d1q\u0000~\u0000\u000fpq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000"
+"5net.sourceforge.czt.core.jaxb.gen.TupleSelExprElementq\u0000~\u0000#s"
+"q\u0000~\u0000\u0000\u0001@\u001dJq\u0000~\u0000\u000fp\u0000sq\u0000~\u0000\u000b\u0001@\u001d?ppsq\u0000~\u0000\u0012\u0001@\u001d4q\u0000~\u0000\u000fpsq\u0000~\u0000\u0015\u0001@\u001d1q\u0000~\u0000\u000fp"
+"q\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000*net.sourceforge.czt.core.jaxb.gen.Co"
+"mpExprq\u0000~\u0000#sq\u0000~\u0000\u0000\u0001@\u001dJq\u0000~\u0000\u000fp\u0000sq\u0000~\u0000\u000b\u0001@\u001d?ppsq\u0000~\u0000\u0012\u0001@\u001d4q\u0000~\u0000\u000fpsq\u0000~"
+"\u0000\u0015\u0001@\u001d1q\u0000~\u0000\u000fpq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000*net.sourceforge.czt.core"
+".jaxb.gen.PipeExprq\u0000~\u0000#sq\u0000~\u0000\u0000\u0001@\u001dJq\u0000~\u0000\u000fp\u0000sq\u0000~\u0000\u000b\u0001@\u001d?ppsq\u0000~\u0000\u0012\u0001@"
+"\u001d4q\u0000~\u0000\u000fpsq\u0000~\u0000\u0015\u0001@\u001d1q\u0000~\u0000\u000fpq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000*net.sourcefo"
+"rge.czt.core.jaxb.gen.ProjExprq\u0000~\u0000#sq\u0000~\u0000\u0000\u0001@\u001dJq\u0000~\u0000\u000fp\u0000sq\u0000~\u0000\u000b\u0001@"
+"\u001d?ppsq\u0000~\u0000\u0012\u0001@\u001d4q\u0000~\u0000\u000fpsq\u0000~\u0000\u0015\u0001@\u001d1q\u0000~\u0000\u000fpq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000)"
+"net.sourceforge.czt.core.jaxb.gen.AndExprq\u0000~\u0000#sq\u0000~\u0000\u0000\u0001@\u001dJq\u0000~\u0000"
+"\u000fp\u0000sq\u0000~\u0000\u000b\u0001@\u001d?ppsq\u0000~\u0000\u0012\u0001@\u001d4q\u0000~\u0000\u000fpsq\u0000~\u0000\u0015\u0001@\u001d1q\u0000~\u0000\u000fpq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~"
+"\u0000\u001esq\u0000~\u0000\u001ft\u0000(net.sourceforge.czt.core.jaxb.gen.OrExprq\u0000~\u0000#sq\u0000~"
+"\u0000\u0000\u0001@\u001dJq\u0000~\u0000\u000fp\u0000sq\u0000~\u0000\u000b\u0001@\u001d?ppsq\u0000~\u0000\u0012\u0001@\u001d4q\u0000~\u0000\u000fpsq\u0000~\u0000\u0015\u0001@\u001d1q\u0000~\u0000\u000fpq\u0000~"
+"\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000-net.sourceforge.czt.core.jaxb.gen.Impli"
+"esExprq\u0000~\u0000#sq\u0000~\u0000\u0000\u0001@\u001dJq\u0000~\u0000\u000fp\u0000sq\u0000~\u0000\u000b\u0001@\u001d?ppsq\u0000~\u0000\u0012\u0001@\u001d4q\u0000~\u0000\u000fpsq\u0000~"
+"\u0000\u0015\u0001@\u001d1q\u0000~\u0000\u000fpq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000)net.sourceforge.czt.core"
+".jaxb.gen.IffExprq\u0000~\u0000#sq\u0000~\u0000\u0000\u0001@\u001dJq\u0000~\u0000\u000fp\u0000sq\u0000~\u0000\u000b\u0001@\u001d?ppsq\u0000~\u0000\u0012\u0001@\u001d"
+"4q\u0000~\u0000\u000fpsq\u0000~\u0000\u0015\u0001@\u001d1q\u0000~\u0000\u000fpq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u00001net.sourcefor"
+"ge.czt.core.jaxb.gen.ApplExprElementq\u0000~\u0000#sq\u0000~\u0000\u0000\u0001@\u001dJq\u0000~\u0000\u000fp\u0000sq"
+"\u0000~\u0000\u000b\u0001@\u001d?ppsq\u0000~\u0000\u0012\u0001@\u001d4q\u0000~\u0000\u000fpsq\u0000~\u0000\u0015\u0001@\u001d1q\u0000~\u0000\u000fpq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000"
+"~\u0000\u001ft\u0000*net.sourceforge.czt.core.jaxb.gen.ProdExprq\u0000~\u0000#sq\u0000~\u0000\u0000\u0001"
+"@\u001dJq\u0000~\u0000\u000fp\u0000sq\u0000~\u0000\u000b\u0001@\u001d?ppsq\u0000~\u0000\u0012\u0001@\u001d4q\u0000~\u0000\u000fpsq\u0000~\u0000\u0015\u0001@\u001d1q\u0000~\u0000\u000fpq\u0000~\u0000\u0018q"
+"\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000+net.sourceforge.czt.core.jaxb.gen.TupleExp"
+"rq\u0000~\u0000#sq\u0000~\u0000\u0000\u0001@\u001dJq\u0000~\u0000\u000fp\u0000sq\u0000~\u0000\u000b\u0001@\u001d?ppsq\u0000~\u0000\u0012\u0001@\u001d4q\u0000~\u0000\u000fpsq\u0000~\u0000\u0015\u0001@\u001d"
+"1q\u0000~\u0000\u000fpq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000)net.sourceforge.czt.core.jaxb"
+".gen.SetExprq\u0000~\u0000#sq\u0000~\u0000\u0000\u0001@\u001dJq\u0000~\u0000\u000fp\u0000sq\u0000~\u0000\u000b\u0001@\u001d?ppsq\u0000~\u0000\u0012\u0001@\u001d4q\u0000~\u0000"
+"\u000fpsq\u0000~\u0000\u0015\u0001@\u001d1q\u0000~\u0000\u000fpq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000,net.sourceforge.cz"
+"t.core.jaxb.gen.ExistsExprq\u0000~\u0000#sq\u0000~\u0000\u0000\u0001@\u001dJq\u0000~\u0000\u000fp\u0000sq\u0000~\u0000\u000b\u0001@\u001d?pp"
+"sq\u0000~\u0000\u0012\u0001@\u001d4q\u0000~\u0000\u000fpsq\u0000~\u0000\u0015\u0001@\u001d1q\u0000~\u0000\u000fpq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000-net."
+"sourceforge.czt.core.jaxb.gen.Exists1Exprq\u0000~\u0000#sq\u0000~\u0000\u0000\u0001@\u001dJq\u0000~\u0000"
+"\u000fp\u0000sq\u0000~\u0000\u000b\u0001@\u001d?ppsq\u0000~\u0000\u0012\u0001@\u001d4q\u0000~\u0000\u000fpsq\u0000~\u0000\u0015\u0001@\u001d1q\u0000~\u0000\u000fpq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~"
+"\u0000\u001esq\u0000~\u0000\u001ft\u0000,net.sourceforge.czt.core.jaxb.gen.ForallExprq\u0000~\u0000#"
+"sq\u0000~\u0000\u0000\u0001@\u001dJq\u0000~\u0000\u000fp\u0000sq\u0000~\u0000\u000b\u0001@\u001d?ppsq\u0000~\u0000\u0012\u0001@\u001d4q\u0000~\u0000\u000fpsq\u0000~\u0000\u0015\u0001@\u001d1q\u0000~\u0000\u000f"
+"pq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000,net.sourceforge.czt.core.jaxb.gen.L"
+"ambdaExprq\u0000~\u0000#sq\u0000~\u0000\u0000\u0001@\u001dJq\u0000~\u0000\u000fp\u0000sq\u0000~\u0000\u000b\u0001@\u001d?ppsq\u0000~\u0000\u0012\u0001@\u001d4q\u0000~\u0000\u000fps"
+"q\u0000~\u0000\u0015\u0001@\u001d1q\u0000~\u0000\u000fpq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000)net.sourceforge.czt.c"
+"ore.jaxb.gen.LetExprq\u0000~\u0000#sq\u0000~\u0000\u0000\u0001@\u001dJq\u0000~\u0000\u000fp\u0000sq\u0000~\u0000\u000b\u0001@\u001d?ppsq\u0000~\u0000\u0012"
+"\u0001@\u001d4q\u0000~\u0000\u000fpsq\u0000~\u0000\u0015\u0001@\u001d1q\u0000~\u0000\u000fpq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000(net.source"
+"forge.czt.core.jaxb.gen.MuExprq\u0000~\u0000#sq\u0000~\u0000\u0000\u0001@\u001dJq\u0000~\u0000\u000fp\u0000sq\u0000~\u0000\u000b\u0001@"
+"\u001d?ppsq\u0000~\u0000\u0012\u0001@\u001d4q\u0000~\u0000\u000fpsq\u0000~\u0000\u0015\u0001@\u001d1q\u0000~\u0000\u000fpq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000-"
+"net.sourceforge.czt.core.jaxb.gen.SetCompExprq\u0000~\u0000#sq\u0000~\u0000\u0000\u0001@\u001dJ"
+"q\u0000~\u0000\u000fp\u0000sq\u0000~\u0000\u000b\u0001@\u001d?ppsq\u0000~\u0000\u0012\u0001@\u001d4q\u0000~\u0000\u000fpsq\u0000~\u0000\u0015\u0001@\u001d1q\u0000~\u0000\u000fpq\u0000~\u0000\u0018q\u0000~\u0000"
+"\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u00001net.sourceforge.czt.core.jaxb.gen.BindExprEle"
+"mentq\u0000~\u0000#sq\u0000~\u0000\u0000\u0001@\u001dJq\u0000~\u0000\u000fp\u0000sq\u0000~\u0000\u000b\u0001@\u001d?ppsq\u0000~\u0000\u0012\u0001@\u001d4q\u0000~\u0000\u000fpsq\u0000~\u0000\u0015"
+"\u0001@\u001d1q\u0000~\u0000\u000fpq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u00001net.sourceforge.czt.core.j"
+"axb.gen.CondExprElementq\u0000~\u0000#sq\u0000~\u0000\u0000\u0001@\u001dJq\u0000~\u0000\u000fp\u0000sq\u0000~\u0000\u000b\u0001@\u001d?ppsq\u0000"
+"~\u0000\u0012\u0001@\u001d4q\u0000~\u0000\u000fpsq\u0000~\u0000\u0015\u0001@\u001d1q\u0000~\u0000\u000fpq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u00000net.sou"
+"rceforge.czt.core.jaxb.gen.NumExprElementq\u0000~\u0000#sq\u0000~\u0000\u0000\u0001@\u001dJq\u0000~\u0000"
+"\u000fp\u0000sq\u0000~\u0000\u000b\u0001@\u001d?ppsq\u0000~\u0000\u0012\u0001@\u001d4q\u0000~\u0000\u000fpsq\u0000~\u0000\u0015\u0001@\u001d1q\u0000~\u0000\u000fpq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~"
+"\u0000\u001esq\u0000~\u0000\u001ft\u00000net.sourceforge.czt.core.jaxb.gen.RefExprElementq"
+"\u0000~\u0000#sq\u0000~\u0000\u0000\u0001@\u001dJq\u0000~\u0000\u000fp\u0000sq\u0000~\u0000\u000b\u0001@\u001d?ppsq\u0000~\u0000\u0012\u0001@\u001d4q\u0000~\u0000\u000fpsq\u0000~\u0000\u0015\u0001@\u001d1q"
+"\u0000~\u0000\u000fpq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u00000net.sourceforge.czt.core.jaxb.g"
+"en.SchExprElementq\u0000~\u0000#q\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000\u000bExists1Exprq\u0000~\u0000&sr\u0000\"com."
+"sun.msv.grammar.ExpressionPool\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\bexpTablet\u0000/Lcom/"
+"sun/msv/grammar/ExpressionPool$ClosedHash;xpsr\u0000-com.sun.msv."
+"grammar.ExpressionPool$ClosedHash\u00d7j\u00d0N\u00ef\u00e8\u00ed\u001c\u0002\u0000\u0004I\u0000\u0005countI\u0000\tthres"
+"holdL\u0000\u0006parentq\u0000~\u0001\u001a[\u0000\u0005tablet\u0000![Lcom/sun/msv/grammar/Expressio"
+"n;xp\u0000\u0000\u0000j\u0000\u0000\u0000rpur\u0000![Lcom.sun.msv.grammar.Expression;\u00d68D\u00c3]\u00ad\u00a7\n\u0002\u0000"
+"\u0000xp\u0000\u0000\u0001\u007fpppppq\u0000~\u0000Vppppppq\u0000~\u0000Tpppq\u0000~\u0000\'ppq\u0000~\u0000Rppppppq\u0000~\u0000Ppppppp"
+"q\u0000~\u0000Nppppppq\u0000~\u0000Lppppppq\u0000~\u0000Jppppppq\u0000~\u0000Hppppppq\u0000~\u0000Fppppppq\u0000~\u0000D"
+"ppppppq\u0000~\u0000Bppppppq\u0000~\u0000@ppppppq\u0000~\u0000>ppppppq\u0000~\u0000<ppppppq\u0000~\u0000:ppppp"
+"pq\u0000~\u00008ppppppppppq\u0000~\u00007ppppppppppppppppppppppppppppppppppppppp"
+"ppppppppppq\u0000~\u0000\u00b9q\u0000~\u0000\u00b3q\u0000~\u0000\u00adq\u0000~\u0000\u00a7q\u0000~\u0000\u00a1q\u0000~\u0000\u009bq\u0000~\u0000\u0095q\u0000~\u0000\u008fq\u0000~\u0000\u0089q\u0000~\u0000\u0083"
+"q\u0000~\u0000}q\u0000~\u0000\u00b2q\u0000~\u0000\u00acq\u0000~\u0000\u00a6q\u0000~\u0000\u00a0q\u0000~\u0000\u009aq\u0000~\u0000\u0094q\u0000~\u0000\u008eq\u0000~\u0000\u0088q\u0000~\u0000\u0082q\u0000~\u0000|q\u0000~\u0000v"
+"q\u0000~\u0000pq\u0000~\u0000jq\u0000~\u0000dq\u0000~\u0000^q\u0000~\u0000Xq\u0000~\u00002q\u0000~\u0000*q\u0000~\u0000\u0011q\u0000~\u0000wq\u0000~\u0000qq\u0000~\u0000kq\u0000~\u0000e"
+"q\u0000~\u0000_q\u0000~\u0000Yq\u0000~\u0000Sq\u0000~\u00003q\u0000~\u0000+q\u0000~\u0000\u0014q\u0000~\u0000Uq\u0000~\u0000\u00b8q\u0000~\u0000\u00bfq\u0000~\u0000Qq\u0000~\u0000\fq\u0000~\u0000\u00be"
+"q\u0000~\u0000\u00c5q\u0000~\u0000\u00c4q\u0000~\u0000\u00cbq\u0000~\u0000\u00caq\u0000~\u0000Oq\u0000~\u0000\u00d1q\u0000~\u0000\u00d0q\u0000~\u0000\u00d7q\u0000~\u0000\u00d6q\u0000~\u0000\u00ddq\u0000~\u0000\u00dcq\u0000~\u0000M"
+"q\u0000~\u0000\u00e3q\u0000~\u0000\u00e2q\u0000~\u0000\u00e9q\u0000~\u0000\u00e8q\u0000~\u0000\u00efq\u0000~\u0000\u00eeq\u0000~\u0000Kq\u0000~\u0000\nq\u0000~\u0000\u00f5q\u0000~\u0000\u00f4q\u0000~\u0000\u00fbq\u0000~\u0000\u00fa"
+"q\u0000~\u0001\u0001q\u0000~\u0000Iq\u0000~\u0001\u0000q\u0000~\u0001\u0007q\u0000~\u0001\u0006q\u0000~\u0001\rq\u0000~\u0001\fq\u0000~\u0001\u0013q\u0000~\u0000Gq\u0000~\u0001\u0012pppppq\u0000~\u0000E"
+"ppppppq\u0000~\u0000Cppppppq\u0000~\u0000Appppppq\u0000~\u0000?ppppppq\u0000~\u0000=ppppppq\u0000~\u0000;ppppp"
+"pq\u0000~\u00009pppppppppppppppppppppppppppppppppppppppppppppppppppppp"
+"pppppppppq\u0000~\u0000\tpppppppppppppppppppp"));
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
            return net.sourceforge.czt.core.jaxb.gen.impl.Exists1ExprImpl.this;
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
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.core.jaxb.gen.impl.Qnt1ExprImpl)net.sourceforge.czt.core.jaxb.gen.impl.Exists1ExprImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("SchText" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.core.jaxb.gen.impl.Qnt1ExprImpl)net.sourceforge.czt.core.jaxb.gen.impl.Exists1ExprImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        spawnHandlerFromEnterElement((((net.sourceforge.czt.core.jaxb.gen.impl.Qnt1ExprImpl)net.sourceforge.czt.core.jaxb.gen.impl.Exists1ExprImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                        return ;
                    case  0 :
                        if (("Exists1Expr" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
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
                        if (("Exists1Expr" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            context.popAttributes();
                            state = 3;
                            return ;
                        }
                        break;
                    case  1 :
                        spawnHandlerFromLeaveElement((((net.sourceforge.czt.core.jaxb.gen.impl.Qnt1ExprImpl)net.sourceforge.czt.core.jaxb.gen.impl.Exists1ExprImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
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
                        spawnHandlerFromEnterAttribute((((net.sourceforge.czt.core.jaxb.gen.impl.Qnt1ExprImpl)net.sourceforge.czt.core.jaxb.gen.impl.Exists1ExprImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
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
                        spawnHandlerFromLeaveAttribute((((net.sourceforge.czt.core.jaxb.gen.impl.Qnt1ExprImpl)net.sourceforge.czt.core.jaxb.gen.impl.Exists1ExprImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
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
                            spawnHandlerFromText((((net.sourceforge.czt.core.jaxb.gen.impl.Qnt1ExprImpl)net.sourceforge.czt.core.jaxb.gen.impl.Exists1ExprImpl.this).new Unmarshaller(context)), 2, value);
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
