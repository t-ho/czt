//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.1-05/30/2003 05:06 AM(java_re)-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2003.08.25 at 03:03:07 NZST 
//


package net.sourceforge.czt.core.jaxb.gen.impl;

public class ProdTypeImpl
    extends net.sourceforge.czt.core.jaxb.gen.impl.TypeImpl
    implements net.sourceforge.czt.core.jaxb.gen.ProdType, com.sun.xml.bind.JAXBObject, net.sourceforge.czt.core.jaxb.gen.impl.runtime.UnmarshallableObject, net.sourceforge.czt.core.jaxb.gen.impl.runtime.XMLSerializable, net.sourceforge.czt.core.jaxb.gen.impl.runtime.ValidatableObject
{

    protected com.sun.xml.bind.util.ListImpl _Type = new com.sun.xml.bind.util.ListImpl(new java.util.ArrayList());
    public final static java.lang.Class version = (net.sourceforge.czt.core.jaxb.gen.impl.JAXBVersion.class);
    private static com.sun.msv.grammar.Grammar schemaFragment;

    private final static java.lang.Class PRIMARY_INTERFACE_CLASS() {
        return (net.sourceforge.czt.core.jaxb.gen.ProdType.class);
    }

    public java.util.List getType() {
        return _Type;
    }

    public net.sourceforge.czt.core.jaxb.gen.impl.runtime.UnmarshallingEventHandler createUnmarshaller(net.sourceforge.czt.core.jaxb.gen.impl.runtime.UnmarshallingContext context) {
        return new net.sourceforge.czt.core.jaxb.gen.impl.ProdTypeImpl.Unmarshaller(context);
    }

    public void serializeElementBody(net.sourceforge.czt.core.jaxb.gen.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        int idx1 = 0;
        final int len1 = _Type.size();
        super.serializeElementBody(context);
        while (idx1 != len1) {
            context.childAsElementBody(((com.sun.xml.bind.JAXBObject) _Type.get(idx1 ++)));
        }
    }

    public void serializeAttributes(net.sourceforge.czt.core.jaxb.gen.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        int idx1 = 0;
        final int len1 = _Type.size();
        super.serializeAttributes(context);
        while (idx1 != len1) {
            context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _Type.get(idx1 ++)));
        }
    }

    public void serializeAttributeBody(net.sourceforge.czt.core.jaxb.gen.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        int idx1 = 0;
        final int len1 = _Type.size();
        super.serializeAttributeBody(context);
        while (idx1 != len1) {
            context.childAsAttributeBody(((com.sun.xml.bind.JAXBObject) _Type.get(idx1 ++)));
        }
    }

    public void serializeURIs(net.sourceforge.czt.core.jaxb.gen.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        int idx1 = 0;
        final int len1 = _Type.size();
        super.serializeURIs(context);
        while (idx1 != len1) {
            context.childAsURIs(((com.sun.xml.bind.JAXBObject) _Type.get(idx1 ++)));
        }
    }

    public java.lang.Class getPrimaryInterface() {
        return (net.sourceforge.czt.core.jaxb.gen.ProdType.class);
    }

    public com.sun.msv.verifier.DocumentDeclaration createRawValidator() {
        if (schemaFragment == null) {
            schemaFragment = com.sun.xml.bind.validator.SchemaDeserializer.deserialize((
 "\u00ac\u00ed\u0000\u0005sr\u0000\u001fcom.sun.msv.grammar.SequenceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.su"
+"n.msv.grammar.BinaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0004exp1t\u0000 Lcom/sun/msv/gra"
+"mmar/Expression;L\u0000\u0004exp2q\u0000~\u0000\u0002xr\u0000\u001ecom.sun.msv.grammar.Expressi"
+"on\u00f8\u0018\u0082\u00e8N5~O\u0002\u0000\u0003I\u0000\u000ecachedHashCodeL\u0000\u0013epsilonReducibilityt\u0000\u0013Ljava"
+"/lang/Boolean;L\u0000\u000bexpandedExpq\u0000~\u0000\u0002xp\u0014\u0001\u00d4\u00ebppsq\u0000~\u0000\u0000\r\u00c1B^ppsq\u0000~\u0000\u0000\u0007"
+"\u0080\u00af\u00dfppsr\u0000\u001dcom.sun.msv.grammar.ChoiceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0001\u0001@\u001d`p"
+"psr\u0000\'com.sun.msv.grammar.trex.ElementPattern\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\tna"
+"meClasst\u0000\u001fLcom/sun/msv/grammar/NameClass;xr\u0000\u001ecom.sun.msv.gra"
+"mmar.ElementExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002Z\u0000\u001aignoreUndeclaredAttributesL\u0000\fco"
+"ntentModelq\u0000~\u0000\u0002xq\u0000~\u0000\u0003\u0001@\u001dUsr\u0000\u0011java.lang.Boolean\u00cd r\u0080\u00d5\u009c\u00fa\u00ee\u0002\u0000\u0001Z\u0000\u0005"
+"valuexp\u0000p\u0000sq\u0000~\u0000\n\u0001@\u001dJpp\u0000sq\u0000~\u0000\b\u0001@\u001d?ppsr\u0000 com.sun.msv.grammar.O"
+"neOrMoreExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001ccom.sun.msv.grammar.UnaryExp\u0000\u0000\u0000\u0000\u0000\u0000"
+"\u0000\u0001\u0002\u0000\u0001L\u0000\u0003expq\u0000~\u0000\u0002xq\u0000~\u0000\u0003\u0001@\u001d4q\u0000~\u0000\u000fpsr\u0000 com.sun.msv.grammar.Attr"
+"ibuteExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003expq\u0000~\u0000\u0002L\u0000\tnameClassq\u0000~\u0000\u000bxq\u0000~\u0000\u0003\u0001@\u001d1q\u0000~"
+"\u0000\u000fpsr\u00002com.sun.msv.grammar.Expression$AnyStringExpression\u0000\u0000\u0000"
+"\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003\u0000\u0000\u0000\bsq\u0000~\u0000\u000e\u0001q\u0000~\u0000\u0018sr\u0000 com.sun.msv.grammar.AnyNam"
+"eClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun.msv.grammar.NameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000"
+"\u0000xpsr\u00000com.sun.msv.grammar.Expression$EpsilonExpression\u0000\u0000\u0000\u0000\u0000"
+"\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003\u0000\u0000\u0000\tq\u0000~\u0000\u0019q\u0000~\u0000\u001esr\u0000#com.sun.msv.grammar.SimpleName"
+"Class\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\tlocalNamet\u0000\u0012Ljava/lang/String;L\u0000\fnamespac"
+"eURIq\u0000~\u0000 xq\u0000~\u0000\u001bt\u00000net.sourceforge.czt.core.jaxb.gen.TermA.An"
+"nsTypet\u0000+http://java.sun.com/jaxb/xjc/dummy-elementssq\u0000~\u0000\u001ft\u0000"
+"\u0004Annst\u0000\u001ehttp://czt.sourceforge.net/zmlq\u0000~\u0000\u001esq\u0000~\u0000\b\u0006@\u0092zppsq\u0000~\u0000"
+"\b\u0005\u0000u.ppsq\u0000~\u0000\b\u0003\u00c0W\u00e2ppsq\u0000~\u0000\b\u0002\u0080:\u0096ppsq\u0000~\u0000\n\u0001@\u001dJpp\u0000sq\u0000~\u0000\b\u0001@\u001d?ppsq\u0000~"
+"\u0000\u0012\u0001@\u001d4q\u0000~\u0000\u000fpsq\u0000~\u0000\u0015\u0001@\u001d1q\u0000~\u0000\u000fpq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u00000net.sour"
+"ceforge.czt.core.jaxb.gen.GenTypeElementq\u0000~\u0000#sq\u0000~\u0000\n\u0001@\u001dJpp\u0000sq"
+"\u0000~\u0000\b\u0001@\u001d?ppsq\u0000~\u0000\u0012\u0001@\u001d4q\u0000~\u0000\u000fpsq\u0000~\u0000\u0015\u0001@\u001d1q\u0000~\u0000\u000fpq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000"
+"~\u0000\u001ft\u00002net.sourceforge.czt.core.jaxb.gen.GivenTypeElementq\u0000~\u0000"
+"#sq\u0000~\u0000\n\u0001@\u001dJpp\u0000sq\u0000~\u0000\b\u0001@\u001d?ppsq\u0000~\u0000\u0012\u0001@\u001d4q\u0000~\u0000\u000fpsq\u0000~\u0000\u0015\u0001@\u001d1q\u0000~\u0000\u000fpq\u0000"
+"~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u00002net.sourceforge.czt.core.jaxb.gen.Powe"
+"rTypeElementq\u0000~\u0000#sq\u0000~\u0000\n\u0001@\u001dJpp\u0000sq\u0000~\u0000\b\u0001@\u001d?ppsq\u0000~\u0000\u0012\u0001@\u001d4q\u0000~\u0000\u000fpsq"
+"\u0000~\u0000\u0015\u0001@\u001d1q\u0000~\u0000\u000fpq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u00001net.sourceforge.czt.co"
+"re.jaxb.gen.ProdTypeElementq\u0000~\u0000#sq\u0000~\u0000\n\u0001@\u001dJpp\u0000sq\u0000~\u0000\b\u0001@\u001d?ppsq\u0000"
+"~\u0000\u0012\u0001@\u001d4q\u0000~\u0000\u000fpsq\u0000~\u0000\u0015\u0001@\u001d1q\u0000~\u0000\u000fpq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u00003net.sou"
+"rceforge.czt.core.jaxb.gen.SchemaTypeElementq\u0000~\u0000#sq\u0000~\u0000\b\u0006@\u0092zp"
+"psq\u0000~\u0000\b\u0005\u0000u.ppsq\u0000~\u0000\b\u0003\u00c0W\u00e2ppsq\u0000~\u0000\b\u0002\u0080:\u0096ppsq\u0000~\u0000\n\u0001@\u001dJpp\u0000sq\u0000~\u0000\b\u0001@\u001d?"
+"ppsq\u0000~\u0000\u0012\u0001@\u001d4q\u0000~\u0000\u000fpsq\u0000~\u0000\u0015\u0001@\u001d1q\u0000~\u0000\u000fpq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001fq\u0000~\u00000"
+"q\u0000~\u0000#sq\u0000~\u0000\n\u0001@\u001dJpp\u0000sq\u0000~\u0000\b\u0001@\u001d?ppsq\u0000~\u0000\u0012\u0001@\u001d4q\u0000~\u0000\u000fpsq\u0000~\u0000\u0015\u0001@\u001d1q\u0000~\u0000"
+"\u000fpq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001fq\u0000~\u00006q\u0000~\u0000#sq\u0000~\u0000\n\u0001@\u001dJpp\u0000sq\u0000~\u0000\b\u0001@\u001d?ppsq"
+"\u0000~\u0000\u0012\u0001@\u001d4q\u0000~\u0000\u000fpsq\u0000~\u0000\u0015\u0001@\u001d1q\u0000~\u0000\u000fpq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001fq\u0000~\u0000<q\u0000~\u0000"
+"#sq\u0000~\u0000\n\u0001@\u001dJpp\u0000sq\u0000~\u0000\b\u0001@\u001d?ppsq\u0000~\u0000\u0012\u0001@\u001d4q\u0000~\u0000\u000fpsq\u0000~\u0000\u0015\u0001@\u001d1q\u0000~\u0000\u000fpq\u0000"
+"~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001fq\u0000~\u0000Bq\u0000~\u0000#sq\u0000~\u0000\n\u0001@\u001dJpp\u0000sq\u0000~\u0000\b\u0001@\u001d?ppsq\u0000~\u0000\u0012"
+"\u0001@\u001d4q\u0000~\u0000\u000fpsq\u0000~\u0000\u0015\u0001@\u001d1q\u0000~\u0000\u000fpq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001fq\u0000~\u0000Hq\u0000~\u0000#sq\u0000"
+"~\u0000\b\u0006@\u0092\u0088ppsq\u0000~\u0000\u0012\u0006@\u0092}q\u0000~\u0000\u000fpsq\u0000~\u0000\b\u0006@\u0092zq\u0000~\u0000\u000fpsq\u0000~\u0000\b\u0005\u0000u.q\u0000~\u0000\u000fpsq\u0000"
+"~\u0000\b\u0003\u00c0W\u00e2q\u0000~\u0000\u000fpsq\u0000~\u0000\b\u0002\u0080:\u0096q\u0000~\u0000\u000fpsq\u0000~\u0000\n\u0001@\u001dJq\u0000~\u0000\u000fp\u0000sq\u0000~\u0000\b\u0001@\u001d?ppsq"
+"\u0000~\u0000\u0012\u0001@\u001d4q\u0000~\u0000\u000fpsq\u0000~\u0000\u0015\u0001@\u001d1q\u0000~\u0000\u000fpq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001fq\u0000~\u00000q\u0000~\u0000"
+"#sq\u0000~\u0000\n\u0001@\u001dJq\u0000~\u0000\u000fp\u0000sq\u0000~\u0000\b\u0001@\u001d?ppsq\u0000~\u0000\u0012\u0001@\u001d4q\u0000~\u0000\u000fpsq\u0000~\u0000\u0015\u0001@\u001d1q\u0000~\u0000"
+"\u000fpq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001fq\u0000~\u00006q\u0000~\u0000#sq\u0000~\u0000\n\u0001@\u001dJq\u0000~\u0000\u000fp\u0000sq\u0000~\u0000\b\u0001@\u001d?"
+"ppsq\u0000~\u0000\u0012\u0001@\u001d4q\u0000~\u0000\u000fpsq\u0000~\u0000\u0015\u0001@\u001d1q\u0000~\u0000\u000fpq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001fq\u0000~\u0000<"
+"q\u0000~\u0000#sq\u0000~\u0000\n\u0001@\u001dJq\u0000~\u0000\u000fp\u0000sq\u0000~\u0000\b\u0001@\u001d?ppsq\u0000~\u0000\u0012\u0001@\u001d4q\u0000~\u0000\u000fpsq\u0000~\u0000\u0015\u0001@\u001d1"
+"q\u0000~\u0000\u000fpq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001fq\u0000~\u0000Bq\u0000~\u0000#sq\u0000~\u0000\n\u0001@\u001dJq\u0000~\u0000\u000fp\u0000sq\u0000~\u0000\b"
+"\u0001@\u001d?ppsq\u0000~\u0000\u0012\u0001@\u001d4q\u0000~\u0000\u000fpsq\u0000~\u0000\u0015\u0001@\u001d1q\u0000~\u0000\u000fpq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001fq"
+"\u0000~\u0000Hq\u0000~\u0000#q\u0000~\u0000\u001esr\u0000\"com.sun.msv.grammar.ExpressionPool\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001"
+"\u0002\u0000\u0001L\u0000\bexpTablet\u0000/Lcom/sun/msv/grammar/ExpressionPool$ClosedH"
+"ash;xpsr\u0000-com.sun.msv.grammar.ExpressionPool$ClosedHash\u00d7j\u00d0N\u00ef"
+"\u00e8\u00ed\u001c\u0002\u0000\u0004I\u0000\u0005countI\u0000\tthresholdL\u0000\u0006parentq\u0000~\u0000\u0086[\u0000\u0005tablet\u0000![Lcom/sun"
+"/msv/grammar/Expression;xp\u0000\u0000\u00002\u0000\u0000\u00009pur\u0000![Lcom.sun.msv.grammar"
+".Expression;\u00d68D\u00c3]\u00ad\u00a7\n\u0002\u0000\u0000xp\u0000\u0000\u0000\u00bfq\u0000~\u0000Iq\u0000~\u0000hq\u0000~\u0000gpppppq\u0000~\u0000\u0005ppppq\u0000"
+"~\u0000fpppppppppppppppppppppppq\u0000~\u0000(q\u0000~\u0000Jq\u0000~\u0000ippppppppppppppppppp"
+"ppppppppppppppppq\u0000~\u0000)q\u0000~\u0000Kq\u0000~\u0000jppppppppppppppppppppppppppppp"
+"ppppppq\u0000~\u0000*q\u0000~\u0000Lq\u0000~\u0000kpppppppppppppq\u0000~\u0000\u0014q\u0000~\u0000-q\u0000~\u00003q\u0000~\u00009q\u0000~\u0000?q"
+"\u0000~\u0000Eq\u0000~\u0000Oq\u0000~\u0000Tq\u0000~\u0000Yq\u0000~\u0000^q\u0000~\u0000cq\u0000~\u0000\u0011q\u0000~\u0000,q\u0000~\u00002q\u0000~\u00008q\u0000~\u0000>q\u0000~\u0000Dq"
+"\u0000~\u0000Nq\u0000~\u0000Sq\u0000~\u0000Xq\u0000~\u0000]q\u0000~\u0000bq\u0000~\u0000nq\u0000~\u0000mq\u0000~\u0000sq\u0000~\u0000rq\u0000~\u0000xq\u0000~\u0000wq\u0000~\u0000}q"
+"\u0000~\u0000|q\u0000~\u0000\u0082q\u0000~\u0000\u0081ppppppppppppq\u0000~\u0000\tpppq\u0000~\u0000\u0007pppq\u0000~\u0000\u0006ppppppppq\u0000~\u0000\'"));
        }
        return new com.sun.msv.verifier.regexp.REDocumentDeclaration(schemaFragment);
    }

    public class Unmarshaller
        extends net.sourceforge.czt.core.jaxb.gen.impl.runtime.AbstractUnmarshallingEventHandlerImpl
    {


        public Unmarshaller(net.sourceforge.czt.core.jaxb.gen.impl.runtime.UnmarshallingContext context) {
            super(context, "---");
        }

        protected Unmarshaller(net.sourceforge.czt.core.jaxb.gen.impl.runtime.UnmarshallingContext context, int startState) {
            this(context);
            state = startState;
        }

        public java.lang.Object owner() {
            return net.sourceforge.czt.core.jaxb.gen.impl.ProdTypeImpl.this;
        }

        public void enterElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname, org.xml.sax.Attributes __atts)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  1 :
                        if (("GenType" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Type.add(((net.sourceforge.czt.core.jaxb.gen.impl.GenTypeElementImpl) spawnChildFromEnterElement((net.sourceforge.czt.core.jaxb.gen.impl.GenTypeElementImpl.class), 2, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("GivenType" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Type.add(((net.sourceforge.czt.core.jaxb.gen.impl.GivenTypeElementImpl) spawnChildFromEnterElement((net.sourceforge.czt.core.jaxb.gen.impl.GivenTypeElementImpl.class), 2, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("PowerType" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Type.add(((net.sourceforge.czt.core.jaxb.gen.impl.PowerTypeElementImpl) spawnChildFromEnterElement((net.sourceforge.czt.core.jaxb.gen.impl.PowerTypeElementImpl.class), 2, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("ProdType" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Type.add(((net.sourceforge.czt.core.jaxb.gen.impl.ProdTypeElementImpl) spawnChildFromEnterElement((net.sourceforge.czt.core.jaxb.gen.impl.ProdTypeElementImpl.class), 2, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("SchemaType" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Type.add(((net.sourceforge.czt.core.jaxb.gen.impl.SchemaTypeElementImpl) spawnChildFromEnterElement((net.sourceforge.czt.core.jaxb.gen.impl.SchemaTypeElementImpl.class), 2, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        break;
                    case  2 :
                        if (("GenType" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Type.add(((net.sourceforge.czt.core.jaxb.gen.impl.GenTypeElementImpl) spawnChildFromEnterElement((net.sourceforge.czt.core.jaxb.gen.impl.GenTypeElementImpl.class), 2, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("GivenType" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Type.add(((net.sourceforge.czt.core.jaxb.gen.impl.GivenTypeElementImpl) spawnChildFromEnterElement((net.sourceforge.czt.core.jaxb.gen.impl.GivenTypeElementImpl.class), 2, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("PowerType" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Type.add(((net.sourceforge.czt.core.jaxb.gen.impl.PowerTypeElementImpl) spawnChildFromEnterElement((net.sourceforge.czt.core.jaxb.gen.impl.PowerTypeElementImpl.class), 2, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("ProdType" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Type.add(((net.sourceforge.czt.core.jaxb.gen.impl.ProdTypeElementImpl) spawnChildFromEnterElement((net.sourceforge.czt.core.jaxb.gen.impl.ProdTypeElementImpl.class), 2, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("SchemaType" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Type.add(((net.sourceforge.czt.core.jaxb.gen.impl.SchemaTypeElementImpl) spawnChildFromEnterElement((net.sourceforge.czt.core.jaxb.gen.impl.SchemaTypeElementImpl.class), 2, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        revertToParentFromEnterElement(___uri, ___local, ___qname, __atts);
                        return ;
                    case  0 :
                        if (("Anns" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.core.jaxb.gen.impl.TypeImpl)net.sourceforge.czt.core.jaxb.gen.impl.ProdTypeImpl.this).new Unmarshaller(context)), 1, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        spawnHandlerFromEnterElement((((net.sourceforge.czt.core.jaxb.gen.impl.TypeImpl)net.sourceforge.czt.core.jaxb.gen.impl.ProdTypeImpl.this).new Unmarshaller(context)), 1, ___uri, ___local, ___qname, __atts);
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
                        revertToParentFromLeaveElement(___uri, ___local, ___qname);
                        return ;
                    case  0 :
                        spawnHandlerFromLeaveElement((((net.sourceforge.czt.core.jaxb.gen.impl.TypeImpl)net.sourceforge.czt.core.jaxb.gen.impl.ProdTypeImpl.this).new Unmarshaller(context)), 1, ___uri, ___local, ___qname);
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
                    case  2 :
                        revertToParentFromEnterAttribute(___uri, ___local, ___qname);
                        return ;
                    case  0 :
                        spawnHandlerFromEnterAttribute((((net.sourceforge.czt.core.jaxb.gen.impl.TypeImpl)net.sourceforge.czt.core.jaxb.gen.impl.ProdTypeImpl.this).new Unmarshaller(context)), 1, ___uri, ___local, ___qname);
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
                    case  2 :
                        revertToParentFromLeaveAttribute(___uri, ___local, ___qname);
                        return ;
                    case  0 :
                        spawnHandlerFromLeaveAttribute((((net.sourceforge.czt.core.jaxb.gen.impl.TypeImpl)net.sourceforge.czt.core.jaxb.gen.impl.ProdTypeImpl.this).new Unmarshaller(context)), 1, ___uri, ___local, ___qname);
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
                        case  2 :
                            revertToParentFromText(value);
                            return ;
                        case  0 :
                            spawnHandlerFromText((((net.sourceforge.czt.core.jaxb.gen.impl.TypeImpl)net.sourceforge.czt.core.jaxb.gen.impl.ProdTypeImpl.this).new Unmarshaller(context)), 1, value);
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
