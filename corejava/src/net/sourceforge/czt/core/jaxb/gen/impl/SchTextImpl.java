//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.1-05/30/2003 05:06 AM(java_re)-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2003.08.20 at 09:36:24 NZST 
//


package net.sourceforge.czt.core.jaxb.gen.impl;

public class SchTextImpl
    extends net.sourceforge.czt.core.jaxb.gen.impl.TermAImpl
    implements net.sourceforge.czt.core.jaxb.gen.SchText, com.sun.xml.bind.JAXBObject, net.sourceforge.czt.core.jaxb.gen.impl.runtime.UnmarshallableObject, net.sourceforge.czt.core.jaxb.gen.impl.runtime.XMLSerializable, net.sourceforge.czt.core.jaxb.gen.impl.runtime.ValidatableObject
{

    protected com.sun.xml.bind.util.ListImpl _Decl = new com.sun.xml.bind.util.ListImpl(new java.util.ArrayList());
    protected net.sourceforge.czt.core.jaxb.gen.Pred _Pred;
    public final static java.lang.Class version = (net.sourceforge.czt.core.jaxb.gen.impl.JAXBVersion.class);
    private static com.sun.msv.grammar.Grammar schemaFragment;

    private final static java.lang.Class PRIMARY_INTERFACE_CLASS() {
        return (net.sourceforge.czt.core.jaxb.gen.SchText.class);
    }

    public java.util.List getDecl() {
        return _Decl;
    }

    public net.sourceforge.czt.core.jaxb.gen.Pred getPred() {
        return _Pred;
    }

    public void setPred(net.sourceforge.czt.core.jaxb.gen.Pred value) {
        _Pred = value;
    }

    public net.sourceforge.czt.core.jaxb.gen.impl.runtime.UnmarshallingEventHandler createUnmarshaller(net.sourceforge.czt.core.jaxb.gen.impl.runtime.UnmarshallingContext context) {
        return new net.sourceforge.czt.core.jaxb.gen.impl.SchTextImpl.Unmarshaller(context);
    }

    public void serializeElementBody(net.sourceforge.czt.core.jaxb.gen.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        int idx1 = 0;
        final int len1 = _Decl.size();
        super.serializeElementBody(context);
        while (idx1 != len1) {
            context.childAsElementBody(((com.sun.xml.bind.JAXBObject) _Decl.get(idx1 ++)));
        }
        if (_Pred!= null) {
            context.childAsElementBody(((com.sun.xml.bind.JAXBObject) _Pred));
        }
    }

    public void serializeAttributes(net.sourceforge.czt.core.jaxb.gen.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        int idx1 = 0;
        final int len1 = _Decl.size();
        super.serializeAttributes(context);
        while (idx1 != len1) {
            context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _Decl.get(idx1 ++)));
        }
        if (_Pred!= null) {
            context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _Pred));
        }
    }

    public void serializeAttributeBody(net.sourceforge.czt.core.jaxb.gen.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        int idx1 = 0;
        final int len1 = _Decl.size();
        super.serializeAttributeBody(context);
        while (idx1 != len1) {
            context.childAsAttributeBody(((com.sun.xml.bind.JAXBObject) _Decl.get(idx1 ++)));
        }
        if (_Pred!= null) {
            context.childAsAttributeBody(((com.sun.xml.bind.JAXBObject) _Pred));
        }
    }

    public void serializeURIs(net.sourceforge.czt.core.jaxb.gen.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        int idx1 = 0;
        final int len1 = _Decl.size();
        super.serializeURIs(context);
        while (idx1 != len1) {
            context.childAsURIs(((com.sun.xml.bind.JAXBObject) _Decl.get(idx1 ++)));
        }
        if (_Pred!= null) {
            context.childAsURIs(((com.sun.xml.bind.JAXBObject) _Pred));
        }
    }

    public java.lang.Class getPrimaryInterface() {
        return (net.sourceforge.czt.core.jaxb.gen.SchText.class);
    }

    public com.sun.msv.verifier.DocumentDeclaration createRawValidator() {
        if (schemaFragment == null) {
            schemaFragment = com.sun.xml.bind.validator.SchemaDeserializer.deserialize((
 "\u00ac\u00ed\u0000\u0005sr\u0000\u001fcom.sun.msv.grammar.SequenceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.su"
+"n.msv.grammar.BinaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0004exp1t\u0000 Lcom/sun/msv/gra"
+"mmar/Expression;L\u0000\u0004exp2q\u0000~\u0000\u0002xr\u0000\u001ecom.sun.msv.grammar.Expressi"
+"on\u00f8\u0018\u0082\u00e8N5~O\u0002\u0000\u0003I\u0000\u000ecachedHashCodeL\u0000\u0013epsilonReducibilityt\u0000\u0013Ljava"
+"/lang/Boolean;L\u0000\u000bexpandedExpq\u0000~\u0000\u0002xp\f\u0006\'\u00f3ppsq\u0000~\u0000\u0000\u0003\u0001\u008a\u0015ppsr\u0000\u001dcom"
+".sun.msv.grammar.ChoiceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0001\u0000\u00c0b\u0090ppsr\u0000\'com.sun"
+".msv.grammar.trex.ElementPattern\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\tnameClasst\u0000\u001fLc"
+"om/sun/msv/grammar/NameClass;xr\u0000\u001ecom.sun.msv.grammar.Element"
+"Exp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002Z\u0000\u001aignoreUndeclaredAttributesL\u0000\fcontentModelq\u0000"
+"~\u0000\u0002xq\u0000~\u0000\u0003\u0000\u00c0b\u0085sr\u0000\u0011java.lang.Boolean\u00cd r\u0080\u00d5\u009c\u00fa\u00ee\u0002\u0000\u0001Z\u0000\u0005valuexp\u0000p\u0000sq"
+"\u0000~\u0000\t\u0000\u00c0bzpp\u0000sq\u0000~\u0000\u0007\u0000\u00c0boppsr\u0000 com.sun.msv.grammar.OneOrMoreExp\u0000"
+"\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001ccom.sun.msv.grammar.UnaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\u0003expq"
+"\u0000~\u0000\u0002xq\u0000~\u0000\u0003\u0000\u00c0bdq\u0000~\u0000\u000epsr\u0000 com.sun.msv.grammar.AttributeExp\u0000\u0000\u0000\u0000"
+"\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003expq\u0000~\u0000\u0002L\u0000\tnameClassq\u0000~\u0000\nxq\u0000~\u0000\u0003\u0000\u00c0baq\u0000~\u0000\u000epsr\u00002com.s"
+"un.msv.grammar.Expression$AnyStringExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~"
+"\u0000\u0003\u0000\u0000\u0000\bsq\u0000~\u0000\r\u0001q\u0000~\u0000\u0017sr\u0000 com.sun.msv.grammar.AnyNameClass\u0000\u0000\u0000\u0000\u0000\u0000"
+"\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun.msv.grammar.NameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com.s"
+"un.msv.grammar.Expression$EpsilonExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003"
+"\u0000\u0000\u0000\tq\u0000~\u0000\u0018q\u0000~\u0000\u001dsr\u0000#com.sun.msv.grammar.SimpleNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000"
+"\u0001\u0002\u0000\u0002L\u0000\tlocalNamet\u0000\u0012Ljava/lang/String;L\u0000\fnamespaceURIq\u0000~\u0000\u001fxq\u0000"
+"~\u0000\u001at\u00000net.sourceforge.czt.core.jaxb.gen.TermA.AnnsTypet\u0000+htt"
+"p://java.sun.com/jaxb/xjc/dummy-elementssq\u0000~\u0000\u001et\u0000\u0004Annst\u0000\u001ehttp"
+"://czt.sourceforge.net/zmlq\u0000~\u0000\u001dsq\u0000~\u0000\u0007\u0002A\'\u0080ppsq\u0000~\u0000\u0011\u0002A\'uq\u0000~\u0000\u000eps"
+"q\u0000~\u0000\u0007\u0002A\'rq\u0000~\u0000\u000epsq\u0000~\u0000\u0007\u0001\u0080\u00c4\u00f6q\u0000~\u0000\u000epsq\u0000~\u0000\t\u0000\u00c0bzq\u0000~\u0000\u000ep\u0000sq\u0000~\u0000\u0007\u0000\u00c0bopp"
+"sq\u0000~\u0000\u0011\u0000\u00c0bdq\u0000~\u0000\u000epsq\u0000~\u0000\u0014\u0000\u00c0baq\u0000~\u0000\u000epq\u0000~\u0000\u0017q\u0000~\u0000\u001bq\u0000~\u0000\u001dsq\u0000~\u0000\u001et\u00002net."
+"sourceforge.czt.core.jaxb.gen.ConstDeclElementq\u0000~\u0000\"sq\u0000~\u0000\t\u0000\u00c0b"
+"zq\u0000~\u0000\u000ep\u0000sq\u0000~\u0000\u0007\u0000\u00c0boppsq\u0000~\u0000\u0011\u0000\u00c0bdq\u0000~\u0000\u000epsq\u0000~\u0000\u0014\u0000\u00c0baq\u0000~\u0000\u000epq\u0000~\u0000\u0017q\u0000~"
+"\u0000\u001bq\u0000~\u0000\u001dsq\u0000~\u0000\u001et\u00001net.sourceforge.czt.core.jaxb.gen.InclDeclEl"
+"ementq\u0000~\u0000\"sq\u0000~\u0000\t\u0000\u00c0bzq\u0000~\u0000\u000ep\u0000sq\u0000~\u0000\u0007\u0000\u00c0boppsq\u0000~\u0000\u0011\u0000\u00c0bdq\u0000~\u0000\u000epsq\u0000~\u0000"
+"\u0014\u0000\u00c0baq\u0000~\u0000\u000epq\u0000~\u0000\u0017q\u0000~\u0000\u001bq\u0000~\u0000\u001dsq\u0000~\u0000\u001et\u00000net.sourceforge.czt.core."
+"jaxb.gen.VarDeclElementq\u0000~\u0000\"q\u0000~\u0000\u001dsq\u0000~\u0000\u0007\t\u0004\u009d\u00d9ppsq\u0000~\u0000\u0007\t\u0004\u009d\u00ceq\u0000~\u0000\u000e"
+"psq\u0000~\u0000\u0007\bD;Rq\u0000~\u0000\u000epsq\u0000~\u0000\u0007\u0007\u0083\u00d8\u00d6q\u0000~\u0000\u000epsq\u0000~\u0000\u0007\u0006\u00c3vZq\u0000~\u0000\u000epsq\u0000~\u0000\u0007\u0006\u0003\u0013\u00deq"
+"\u0000~\u0000\u000epsq\u0000~\u0000\u0007\u0005B\u00b1bq\u0000~\u0000\u000epsq\u0000~\u0000\u0007\u0004\u0082N\u00e6q\u0000~\u0000\u000epsq\u0000~\u0000\u0007\u0003\u00c1\u00ecjq\u0000~\u0000\u000epsq\u0000~\u0000\u0007\u0003"
+"\u0001\u0089\u00eeq\u0000~\u0000\u000epsq\u0000~\u0000\u0007\u0002A\'rq\u0000~\u0000\u000epsq\u0000~\u0000\u0007\u0001\u0080\u00c4\u00f6q\u0000~\u0000\u000epsq\u0000~\u0000\t\u0000\u00c0bzq\u0000~\u0000\u000ep\u0000sq"
+"\u0000~\u0000\u0007\u0000\u00c0boppsq\u0000~\u0000\u0011\u0000\u00c0bdq\u0000~\u0000\u000epsq\u0000~\u0000\u0014\u0000\u00c0baq\u0000~\u0000\u000epq\u0000~\u0000\u0017q\u0000~\u0000\u001bq\u0000~\u0000\u001dsq\u0000"
+"~\u0000\u001et\u0000+net.sourceforge.czt.core.jaxb.gen.FalsePredq\u0000~\u0000\"sq\u0000~\u0000\t"
+"\u0000\u00c0bzq\u0000~\u0000\u000ep\u0000sq\u0000~\u0000\u0007\u0000\u00c0boppsq\u0000~\u0000\u0011\u0000\u00c0bdq\u0000~\u0000\u000epsq\u0000~\u0000\u0014\u0000\u00c0baq\u0000~\u0000\u000epq\u0000~\u0000\u0017"
+"q\u0000~\u0000\u001bq\u0000~\u0000\u001dsq\u0000~\u0000\u001et\u0000*net.sourceforge.czt.core.jaxb.gen.TruePre"
+"dq\u0000~\u0000\"sq\u0000~\u0000\t\u0000\u00c0bzq\u0000~\u0000\u000ep\u0000sq\u0000~\u0000\u0007\u0000\u00c0boppsq\u0000~\u0000\u0011\u0000\u00c0bdq\u0000~\u0000\u000epsq\u0000~\u0000\u0014\u0000\u00c0b"
+"aq\u0000~\u0000\u000epq\u0000~\u0000\u0017q\u0000~\u0000\u001bq\u0000~\u0000\u001dsq\u0000~\u0000\u001et\u00000net.sourceforge.czt.core.jaxb"
+".gen.AndPredElementq\u0000~\u0000\"sq\u0000~\u0000\t\u0000\u00c0bzq\u0000~\u0000\u000ep\u0000sq\u0000~\u0000\u0007\u0000\u00c0boppsq\u0000~\u0000\u0011\u0000"
+"\u00c0bdq\u0000~\u0000\u000epsq\u0000~\u0000\u0014\u0000\u00c0baq\u0000~\u0000\u000epq\u0000~\u0000\u0017q\u0000~\u0000\u001bq\u0000~\u0000\u001dsq\u0000~\u0000\u001et\u0000-net.sourcef"
+"orge.czt.core.jaxb.gen.ImpliesPredq\u0000~\u0000\"sq\u0000~\u0000\t\u0000\u00c0bzq\u0000~\u0000\u000ep\u0000sq\u0000~"
+"\u0000\u0007\u0000\u00c0boppsq\u0000~\u0000\u0011\u0000\u00c0bdq\u0000~\u0000\u000epsq\u0000~\u0000\u0014\u0000\u00c0baq\u0000~\u0000\u000epq\u0000~\u0000\u0017q\u0000~\u0000\u001bq\u0000~\u0000\u001dsq\u0000~\u0000"
+"\u001et\u0000)net.sourceforge.czt.core.jaxb.gen.IffPredq\u0000~\u0000\"sq\u0000~\u0000\t\u0000\u00c0bz"
+"q\u0000~\u0000\u000ep\u0000sq\u0000~\u0000\u0007\u0000\u00c0boppsq\u0000~\u0000\u0011\u0000\u00c0bdq\u0000~\u0000\u000epsq\u0000~\u0000\u0014\u0000\u00c0baq\u0000~\u0000\u000epq\u0000~\u0000\u0017q\u0000~\u0000"
+"\u001bq\u0000~\u0000\u001dsq\u0000~\u0000\u001et\u0000(net.sourceforge.czt.core.jaxb.gen.OrPredq\u0000~\u0000\""
+"sq\u0000~\u0000\t\u0000\u00c0bzq\u0000~\u0000\u000ep\u0000sq\u0000~\u0000\u0007\u0000\u00c0boppsq\u0000~\u0000\u0011\u0000\u00c0bdq\u0000~\u0000\u000epsq\u0000~\u0000\u0014\u0000\u00c0baq\u0000~\u0000\u000e"
+"pq\u0000~\u0000\u0017q\u0000~\u0000\u001bq\u0000~\u0000\u001dsq\u0000~\u0000\u001et\u0000,net.sourceforge.czt.core.jaxb.gen.E"
+"xistsPredq\u0000~\u0000\"sq\u0000~\u0000\t\u0000\u00c0bzq\u0000~\u0000\u000ep\u0000sq\u0000~\u0000\u0007\u0000\u00c0boppsq\u0000~\u0000\u0011\u0000\u00c0bdq\u0000~\u0000\u000eps"
+"q\u0000~\u0000\u0014\u0000\u00c0baq\u0000~\u0000\u000epq\u0000~\u0000\u0017q\u0000~\u0000\u001bq\u0000~\u0000\u001dsq\u0000~\u0000\u001et\u0000-net.sourceforge.czt.c"
+"ore.jaxb.gen.Exists1Predq\u0000~\u0000\"sq\u0000~\u0000\t\u0000\u00c0bzq\u0000~\u0000\u000ep\u0000sq\u0000~\u0000\u0007\u0000\u00c0boppsq"
+"\u0000~\u0000\u0011\u0000\u00c0bdq\u0000~\u0000\u000epsq\u0000~\u0000\u0014\u0000\u00c0baq\u0000~\u0000\u000epq\u0000~\u0000\u0017q\u0000~\u0000\u001bq\u0000~\u0000\u001dsq\u0000~\u0000\u001et\u0000,net.so"
+"urceforge.czt.core.jaxb.gen.ForallPredq\u0000~\u0000\"sq\u0000~\u0000\t\u0000\u00c0bzq\u0000~\u0000\u000ep\u0000"
+"sq\u0000~\u0000\u0007\u0000\u00c0boppsq\u0000~\u0000\u0011\u0000\u00c0bdq\u0000~\u0000\u000epsq\u0000~\u0000\u0014\u0000\u00c0baq\u0000~\u0000\u000epq\u0000~\u0000\u0017q\u0000~\u0000\u001bq\u0000~\u0000\u001ds"
+"q\u0000~\u0000\u001et\u00001net.sourceforge.czt.core.jaxb.gen.ExprPredElementq\u0000~"
+"\u0000\"sq\u0000~\u0000\t\u0000\u00c0bzq\u0000~\u0000\u000ep\u0000sq\u0000~\u0000\u0007\u0000\u00c0boppsq\u0000~\u0000\u0011\u0000\u00c0bdq\u0000~\u0000\u000epsq\u0000~\u0000\u0014\u0000\u00c0baq\u0000~"
+"\u0000\u000epq\u0000~\u0000\u0017q\u0000~\u0000\u001bq\u0000~\u0000\u001dsq\u0000~\u0000\u001et\u00000net.sourceforge.czt.core.jaxb.gen"
+".MemPredElementq\u0000~\u0000\"sq\u0000~\u0000\t\u0000\u00c0bzq\u0000~\u0000\u000ep\u0000sq\u0000~\u0000\u0007\u0000\u00c0boppsq\u0000~\u0000\u0011\u0000\u00c0bdq"
+"\u0000~\u0000\u000epsq\u0000~\u0000\u0014\u0000\u00c0baq\u0000~\u0000\u000epq\u0000~\u0000\u0017q\u0000~\u0000\u001bq\u0000~\u0000\u001dsq\u0000~\u0000\u001et\u00000net.sourceforge"
+".czt.core.jaxb.gen.NegPredElementq\u0000~\u0000\"q\u0000~\u0000\u001dsr\u0000\"com.sun.msv.g"
+"rammar.ExpressionPool\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\bexpTablet\u0000/Lcom/sun/msv/g"
+"rammar/ExpressionPool$ClosedHash;xpsr\u0000-com.sun.msv.grammar.E"
+"xpressionPool$ClosedHash\u00d7j\u00d0N\u00ef\u00e8\u00ed\u001c\u0002\u0000\u0004I\u0000\u0005countI\u0000\tthresholdL\u0000\u0006pa"
+"rentq\u0000~\u0000\u0091[\u0000\u0005tablet\u0000![Lcom/sun/msv/grammar/Expression;xp\u0000\u0000\u00003\u0000"
+"\u0000\u00009pur\u0000![Lcom.sun.msv.grammar.Expression;\u00d68D\u00c3]\u00ad\u00a7\n\u0002\u0000\u0000xp\u0000\u0000\u0000\u00bfq\u0000"
+"~\u0000,q\u0000~\u00002q\u0000~\u00008q\u0000~\u0000Jq\u0000~\u0000Pq\u0000~\u0000Vq\u0000~\u0000\\q\u0000~\u0000bq\u0000~\u0000hq\u0000~\u0000nq\u0000~\u0000\u0010q\u0000~\u0000+q\u0000"
+"~\u00001q\u0000~\u00007q\u0000~\u0000Iq\u0000~\u0000Oq\u0000~\u0000Uq\u0000~\u0000[q\u0000~\u0000aq\u0000~\u0000gq\u0000~\u0000mq\u0000~\u0000tq\u0000~\u0000sq\u0000~\u0000zq\u0000"
+"~\u0000yq\u0000~\u0000@q\u0000~\u0000\u0080q\u0000~\u0000\u007fq\u0000~\u0000\u0086q\u0000~\u0000\u0085q\u0000~\u0000\u008cq\u0000~\u0000\u008bpppppq\u0000~\u0000?q\u0000~\u0000\u0005ppppq\u0000~"
+"\u0000\bq\u0000~\u0000)q\u0000~\u0000Gppppppppppppppq\u0000~\u0000>ppppppq\u0000~\u0000(q\u0000~\u0000Fpq\u0000~\u0000\'ppppppp"
+"pppq\u0000~\u0000&pq\u0000~\u0000=ppppppq\u0000~\u0000Epppq\u0000~\u0000<ppppppppppppppppppq\u0000~\u0000Dpppp"
+"pppppppppppq\u0000~\u0000\u0006ppppppq\u0000~\u0000Cppppppppppppppppppppppq\u0000~\u0000Bpppppp"
+"ppppppppppppppppq\u0000~\u0000Apppppppq\u0000~\u0000\u0013"));
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
            return net.sourceforge.czt.core.jaxb.gen.impl.SchTextImpl.this;
        }

        public void enterElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname, org.xml.sax.Attributes __atts)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  1 :
                        if (("ConstDecl" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Decl.add(((net.sourceforge.czt.core.jaxb.gen.impl.ConstDeclElementImpl) spawnChildFromEnterElement((net.sourceforge.czt.core.jaxb.gen.impl.ConstDeclElementImpl.class), 2, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("InclDecl" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Decl.add(((net.sourceforge.czt.core.jaxb.gen.impl.InclDeclElementImpl) spawnChildFromEnterElement((net.sourceforge.czt.core.jaxb.gen.impl.InclDeclElementImpl.class), 2, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("VarDecl" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Decl.add(((net.sourceforge.czt.core.jaxb.gen.impl.VarDeclElementImpl) spawnChildFromEnterElement((net.sourceforge.czt.core.jaxb.gen.impl.VarDeclElementImpl.class), 2, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        state = 2;
                        continue outer;
                    case  3 :
                        revertToParentFromEnterElement(___uri, ___local, ___qname, __atts);
                        return ;
                    case  2 :
                        if (("ConstDecl" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Decl.add(((net.sourceforge.czt.core.jaxb.gen.impl.ConstDeclElementImpl) spawnChildFromEnterElement((net.sourceforge.czt.core.jaxb.gen.impl.ConstDeclElementImpl.class), 2, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("InclDecl" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Decl.add(((net.sourceforge.czt.core.jaxb.gen.impl.InclDeclElementImpl) spawnChildFromEnterElement((net.sourceforge.czt.core.jaxb.gen.impl.InclDeclElementImpl.class), 2, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("VarDecl" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Decl.add(((net.sourceforge.czt.core.jaxb.gen.impl.VarDeclElementImpl) spawnChildFromEnterElement((net.sourceforge.czt.core.jaxb.gen.impl.VarDeclElementImpl.class), 2, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("FalsePred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Pred = ((net.sourceforge.czt.core.jaxb.gen.impl.FalsePredImpl) spawnChildFromEnterElement((net.sourceforge.czt.core.jaxb.gen.impl.FalsePredImpl.class), 3, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("TruePred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Pred = ((net.sourceforge.czt.core.jaxb.gen.impl.TruePredImpl) spawnChildFromEnterElement((net.sourceforge.czt.core.jaxb.gen.impl.TruePredImpl.class), 3, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("AndPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Pred = ((net.sourceforge.czt.core.jaxb.gen.impl.AndPredElementImpl) spawnChildFromEnterElement((net.sourceforge.czt.core.jaxb.gen.impl.AndPredElementImpl.class), 3, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("ImpliesPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Pred = ((net.sourceforge.czt.core.jaxb.gen.impl.ImpliesPredImpl) spawnChildFromEnterElement((net.sourceforge.czt.core.jaxb.gen.impl.ImpliesPredImpl.class), 3, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("IffPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Pred = ((net.sourceforge.czt.core.jaxb.gen.impl.IffPredImpl) spawnChildFromEnterElement((net.sourceforge.czt.core.jaxb.gen.impl.IffPredImpl.class), 3, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("OrPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Pred = ((net.sourceforge.czt.core.jaxb.gen.impl.OrPredImpl) spawnChildFromEnterElement((net.sourceforge.czt.core.jaxb.gen.impl.OrPredImpl.class), 3, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("ExistsPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Pred = ((net.sourceforge.czt.core.jaxb.gen.impl.ExistsPredImpl) spawnChildFromEnterElement((net.sourceforge.czt.core.jaxb.gen.impl.ExistsPredImpl.class), 3, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("Exists1Pred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Pred = ((net.sourceforge.czt.core.jaxb.gen.impl.Exists1PredImpl) spawnChildFromEnterElement((net.sourceforge.czt.core.jaxb.gen.impl.Exists1PredImpl.class), 3, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("ForallPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Pred = ((net.sourceforge.czt.core.jaxb.gen.impl.ForallPredImpl) spawnChildFromEnterElement((net.sourceforge.czt.core.jaxb.gen.impl.ForallPredImpl.class), 3, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("ExprPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Pred = ((net.sourceforge.czt.core.jaxb.gen.impl.ExprPredElementImpl) spawnChildFromEnterElement((net.sourceforge.czt.core.jaxb.gen.impl.ExprPredElementImpl.class), 3, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("MemPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Pred = ((net.sourceforge.czt.core.jaxb.gen.impl.MemPredElementImpl) spawnChildFromEnterElement((net.sourceforge.czt.core.jaxb.gen.impl.MemPredElementImpl.class), 3, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("NegPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Pred = ((net.sourceforge.czt.core.jaxb.gen.impl.NegPredElementImpl) spawnChildFromEnterElement((net.sourceforge.czt.core.jaxb.gen.impl.NegPredElementImpl.class), 3, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        state = 3;
                        continue outer;
                    case  0 :
                        if (("Anns" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.core.jaxb.gen.impl.TermAImpl)net.sourceforge.czt.core.jaxb.gen.impl.SchTextImpl.this).new Unmarshaller(context)), 1, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        spawnHandlerFromEnterElement((((net.sourceforge.czt.core.jaxb.gen.impl.TermAImpl)net.sourceforge.czt.core.jaxb.gen.impl.SchTextImpl.this).new Unmarshaller(context)), 1, ___uri, ___local, ___qname, __atts);
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
                        state = 2;
                        continue outer;
                    case  3 :
                        revertToParentFromLeaveElement(___uri, ___local, ___qname);
                        return ;
                    case  2 :
                        state = 3;
                        continue outer;
                    case  0 :
                        spawnHandlerFromLeaveElement((((net.sourceforge.czt.core.jaxb.gen.impl.TermAImpl)net.sourceforge.czt.core.jaxb.gen.impl.SchTextImpl.this).new Unmarshaller(context)), 1, ___uri, ___local, ___qname);
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
                        state = 2;
                        continue outer;
                    case  3 :
                        revertToParentFromEnterAttribute(___uri, ___local, ___qname);
                        return ;
                    case  2 :
                        state = 3;
                        continue outer;
                    case  0 :
                        spawnHandlerFromEnterAttribute((((net.sourceforge.czt.core.jaxb.gen.impl.TermAImpl)net.sourceforge.czt.core.jaxb.gen.impl.SchTextImpl.this).new Unmarshaller(context)), 1, ___uri, ___local, ___qname);
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
                        state = 2;
                        continue outer;
                    case  3 :
                        revertToParentFromLeaveAttribute(___uri, ___local, ___qname);
                        return ;
                    case  2 :
                        state = 3;
                        continue outer;
                    case  0 :
                        spawnHandlerFromLeaveAttribute((((net.sourceforge.czt.core.jaxb.gen.impl.TermAImpl)net.sourceforge.czt.core.jaxb.gen.impl.SchTextImpl.this).new Unmarshaller(context)), 1, ___uri, ___local, ___qname);
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
                            state = 2;
                            continue outer;
                        case  3 :
                            revertToParentFromText(value);
                            return ;
                        case  2 :
                            state = 3;
                            continue outer;
                        case  0 :
                            spawnHandlerFromText((((net.sourceforge.czt.core.jaxb.gen.impl.TermAImpl)net.sourceforge.czt.core.jaxb.gen.impl.SchTextImpl.this).new Unmarshaller(context)), 1, value);
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
