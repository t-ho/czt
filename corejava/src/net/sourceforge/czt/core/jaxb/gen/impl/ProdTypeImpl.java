//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.2-b15-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2003.10.28 at 04:14:13 NZDT 
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

    public void serializeBody(net.sourceforge.czt.core.jaxb.gen.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        int idx1 = 0;
        final int len1 = _Type.size();
        super.serializeBody(context);
        while (idx1 != len1) {
            if (_Type.get(idx1) instanceof javax.xml.bind.Element) {
                context.childAsBody(((com.sun.xml.bind.JAXBObject) _Type.get(idx1 ++)), "Type");
            } else {
                context.startElement("http://czt.sourceforge.net/zml", "Type");
                int idx_0 = idx1;
                context.childAsURIs(((com.sun.xml.bind.JAXBObject) _Type.get(idx_0 ++)), "Type");
                context.endNamespaceDecls();
                int idx_1 = idx1;
                context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _Type.get(idx_1 ++)), "Type");
                context.endAttributes();
                context.childAsBody(((com.sun.xml.bind.JAXBObject) _Type.get(idx1 ++)), "Type");
                context.endElement();
            }
        }
    }

    public void serializeAttributes(net.sourceforge.czt.core.jaxb.gen.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        int idx1 = 0;
        final int len1 = _Type.size();
        super.serializeAttributes(context);
        while (idx1 != len1) {
            if (_Type.get(idx1) instanceof javax.xml.bind.Element) {
                context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _Type.get(idx1 ++)), "Type");
            } else {
                idx1 += 1;
            }
        }
    }

    public void serializeURIs(net.sourceforge.czt.core.jaxb.gen.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        int idx1 = 0;
        final int len1 = _Type.size();
        super.serializeURIs(context);
        while (idx1 != len1) {
            if (_Type.get(idx1) instanceof javax.xml.bind.Element) {
                context.childAsURIs(((com.sun.xml.bind.JAXBObject) _Type.get(idx1 ++)), "Type");
            } else {
                idx1 += 1;
            }
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
+"/lang/Boolean;L\u0000\u000bexpandedExpq\u0000~\u0000\u0002xp\n\u0093\u0000\u00f1ppsq\u0000~\u0000\u0000\b*\u009d\u001dppsq\u0000~\u0000\u0000\u0005"
+"\u00c29Wppsr\u0000\u001dcom.sun.msv.grammar.ChoiceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0001\u0003Y\u00d5\u0091p"
+"psr\u0000\'com.sun.msv.grammar.trex.ElementPattern\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\tna"
+"meClasst\u0000\u001fLcom/sun/msv/grammar/NameClass;xr\u0000\u001ecom.sun.msv.gra"
+"mmar.ElementExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002Z\u0000\u001aignoreUndeclaredAttributesL\u0000\fco"
+"ntentModelq\u0000~\u0000\u0002xq\u0000~\u0000\u0003\u0003Y\u00d5\u0086sr\u0000\u0011java.lang.Boolean\u00cd r\u0080\u00d5\u009c\u00fa\u00ee\u0002\u0000\u0001Z\u0000\u0005"
+"valuexp\u0000p\u0000sq\u0000~\u0000\u0000\u0003Y\u00d5{ppsq\u0000~\u0000\n\u0000{G%pp\u0000sq\u0000~\u0000\b\u0000{G\u001appsr\u0000 com.sun.m"
+"sv.grammar.OneOrMoreExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001ccom.sun.msv.grammar.Un"
+"aryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\u0003expq\u0000~\u0000\u0002xq\u0000~\u0000\u0003\u0000{G\u000fq\u0000~\u0000\u000fpsr\u0000 com.sun.msv."
+"grammar.AttributeExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003expq\u0000~\u0000\u0002L\u0000\tnameClassq\u0000~\u0000\u000bx"
+"q\u0000~\u0000\u0003\u0000{G\fq\u0000~\u0000\u000fpsr\u00002com.sun.msv.grammar.Expression$AnyStringE"
+"xpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003\u0000\u0000\u0000\bsq\u0000~\u0000\u000e\u0001q\u0000~\u0000\u0019sr\u0000 com.sun.msv.gr"
+"ammar.AnyNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun.msv.grammar.NameCla"
+"ss\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com.sun.msv.grammar.Expression$EpsilonExp"
+"ression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003\u0000\u0000\u0000\tq\u0000~\u0000\u001aq\u0000~\u0000\u001fsr\u0000#com.sun.msv.gramma"
+"r.SimpleNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\tlocalNamet\u0000\u0012Ljava/lang/String"
+";L\u0000\fnamespaceURIq\u0000~\u0000!xq\u0000~\u0000\u001ct\u00000net.sourceforge.czt.core.jaxb."
+"gen.TermA.AnnsTypet\u0000+http://java.sun.com/jaxb/xjc/dummy-elem"
+"entssq\u0000~\u0000\b\u0002\u00de\u008eQppsq\u0000~\u0000\u0016\u0002\u00de\u008eFq\u0000~\u0000\u000fpsr\u0000\u001bcom.sun.msv.grammar.Data"
+"Exp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\u0002dtt\u0000\u001fLorg/relaxng/datatype/Datatype;L\u0000\u0006exce"
+"ptq\u0000~\u0000\u0002L\u0000\u0004namet\u0000\u001dLcom/sun/msv/util/StringPair;xq\u0000~\u0000\u0003\u0001d\u00b9\u00c6ppsr"
+"\u0000\"com.sun.msv.datatype.xsd.QnameType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000*com.sun.m"
+"sv.datatype.xsd.BuiltinAtomicType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000%com.sun.msv."
+"datatype.xsd.ConcreteType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\'com.sun.msv.datatype"
+".xsd.XSDatatypeImpl\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\fnamespaceUriq\u0000~\u0000!L\u0000\btypeNam"
+"eq\u0000~\u0000!L\u0000\nwhiteSpacet\u0000.Lcom/sun/msv/datatype/xsd/WhiteSpacePr"
+"ocessor;xpt\u0000 http://www.w3.org/2001/XMLSchemat\u0000\u0005QNamesr\u00005com"
+".sun.msv.datatype.xsd.WhiteSpaceProcessor$Collapse\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000"
+"\u0000xr\u0000,com.sun.msv.datatype.xsd.WhiteSpaceProcessor\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000"
+"xpsr\u00000com.sun.msv.grammar.Expression$NullSetExpression\u0000\u0000\u0000\u0000\u0000\u0000"
+"\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003\u0000\u0000\u0000\nq\u0000~\u0000\u000fpsr\u0000\u001bcom.sun.msv.util.StringPair\u00d0t\u001ejB\u008f\u008d\u00a0"
+"\u0002\u0000\u0002L\u0000\tlocalNameq\u0000~\u0000!L\u0000\fnamespaceURIq\u0000~\u0000!xpq\u0000~\u00002q\u0000~\u00001sq\u0000~\u0000 t\u0000"
+"\u0004typet\u0000)http://www.w3.org/2001/XMLSchema-instanceq\u0000~\u0000\u001fsq\u0000~\u0000 "
+"t\u0000\u0004Annst\u0000\u001ehttp://czt.sourceforge.net/zmlq\u0000~\u0000\u001fsq\u0000~\u0000\b\u0002hc\u00c1ppsq\u0000"
+"~\u0000\b\u0001\u00ed\u001c\u009appsq\u0000~\u0000\b\u0001q\u00d5sppsq\u0000~\u0000\b\u0000\u00f6\u008eLppsq\u0000~\u0000\n\u0000{G%pp\u0000sq\u0000~\u0000\b\u0000{G\u001appsq"
+"\u0000~\u0000\u0013\u0000{G\u000fq\u0000~\u0000\u000fpsq\u0000~\u0000\u0016\u0000{G\fq\u0000~\u0000\u000fpq\u0000~\u0000\u0019q\u0000~\u0000\u001dq\u0000~\u0000\u001fsq\u0000~\u0000 t\u00003net.so"
+"urceforge.czt.core.jaxb.gen.SchemaTypeElementq\u0000~\u0000$sq\u0000~\u0000\n\u0000{G%"
+"pp\u0000sq\u0000~\u0000\b\u0000{G\u001appsq\u0000~\u0000\u0013\u0000{G\u000fq\u0000~\u0000\u000fpsq\u0000~\u0000\u0016\u0000{G\fq\u0000~\u0000\u000fpq\u0000~\u0000\u0019q\u0000~\u0000\u001dq\u0000~"
+"\u0000\u001fsq\u0000~\u0000 t\u00001net.sourceforge.czt.core.jaxb.gen.ProdTypeElement"
+"q\u0000~\u0000$sq\u0000~\u0000\n\u0000{G%pp\u0000sq\u0000~\u0000\b\u0000{G\u001appsq\u0000~\u0000\u0013\u0000{G\u000fq\u0000~\u0000\u000fpsq\u0000~\u0000\u0016\u0000{G\fq\u0000~\u0000"
+"\u000fpq\u0000~\u0000\u0019q\u0000~\u0000\u001dq\u0000~\u0000\u001fsq\u0000~\u0000 t\u00002net.sourceforge.czt.core.jaxb.gen."
+"GivenTypeElementq\u0000~\u0000$sq\u0000~\u0000\n\u0000{G%pp\u0000sq\u0000~\u0000\b\u0000{G\u001appsq\u0000~\u0000\u0013\u0000{G\u000fq\u0000~\u0000"
+"\u000fpsq\u0000~\u0000\u0016\u0000{G\fq\u0000~\u0000\u000fpq\u0000~\u0000\u0019q\u0000~\u0000\u001dq\u0000~\u0000\u001fsq\u0000~\u0000 t\u00000net.sourceforge.cz"
+"t.core.jaxb.gen.GenTypeElementq\u0000~\u0000$sq\u0000~\u0000\n\u0000{G%pp\u0000sq\u0000~\u0000\b\u0000{G\u001app"
+"sq\u0000~\u0000\u0013\u0000{G\u000fq\u0000~\u0000\u000fpsq\u0000~\u0000\u0016\u0000{G\fq\u0000~\u0000\u000fpq\u0000~\u0000\u0019q\u0000~\u0000\u001dq\u0000~\u0000\u001fsq\u0000~\u0000 t\u00002net."
+"sourceforge.czt.core.jaxb.gen.PowerTypeElementq\u0000~\u0000$sq\u0000~\u0000\b\u0002hc"
+"\u00c1ppsq\u0000~\u0000\b\u0001\u00ed\u001c\u009appsq\u0000~\u0000\b\u0001q\u00d5sppsq\u0000~\u0000\b\u0000\u00f6\u008eLppsq\u0000~\u0000\n\u0000{G%pp\u0000sq\u0000~\u0000\b\u0000{"
+"G\u001appsq\u0000~\u0000\u0013\u0000{G\u000fq\u0000~\u0000\u000fpsq\u0000~\u0000\u0016\u0000{G\fq\u0000~\u0000\u000fpq\u0000~\u0000\u0019q\u0000~\u0000\u001dq\u0000~\u0000\u001fsq\u0000~\u0000 q\u0000~"
+"\u0000Iq\u0000~\u0000$sq\u0000~\u0000\n\u0000{G%pp\u0000sq\u0000~\u0000\b\u0000{G\u001appsq\u0000~\u0000\u0013\u0000{G\u000fq\u0000~\u0000\u000fpsq\u0000~\u0000\u0016\u0000{G\fq\u0000"
+"~\u0000\u000fpq\u0000~\u0000\u0019q\u0000~\u0000\u001dq\u0000~\u0000\u001fsq\u0000~\u0000 q\u0000~\u0000Oq\u0000~\u0000$sq\u0000~\u0000\n\u0000{G%pp\u0000sq\u0000~\u0000\b\u0000{G\u001app"
+"sq\u0000~\u0000\u0013\u0000{G\u000fq\u0000~\u0000\u000fpsq\u0000~\u0000\u0016\u0000{G\fq\u0000~\u0000\u000fpq\u0000~\u0000\u0019q\u0000~\u0000\u001dq\u0000~\u0000\u001fsq\u0000~\u0000 q\u0000~\u0000Uq\u0000"
+"~\u0000$sq\u0000~\u0000\n\u0000{G%pp\u0000sq\u0000~\u0000\b\u0000{G\u001appsq\u0000~\u0000\u0013\u0000{G\u000fq\u0000~\u0000\u000fpsq\u0000~\u0000\u0016\u0000{G\fq\u0000~\u0000\u000fp"
+"q\u0000~\u0000\u0019q\u0000~\u0000\u001dq\u0000~\u0000\u001fsq\u0000~\u0000 q\u0000~\u0000[q\u0000~\u0000$sq\u0000~\u0000\n\u0000{G%pp\u0000sq\u0000~\u0000\b\u0000{G\u001appsq\u0000~"
+"\u0000\u0013\u0000{G\u000fq\u0000~\u0000\u000fpsq\u0000~\u0000\u0016\u0000{G\fq\u0000~\u0000\u000fpq\u0000~\u0000\u0019q\u0000~\u0000\u001dq\u0000~\u0000\u001fsq\u0000~\u0000 q\u0000~\u0000aq\u0000~\u0000$s"
+"q\u0000~\u0000\b\u0002hc\u00cfppsq\u0000~\u0000\u0013\u0002hc\u00c4q\u0000~\u0000\u000fpsq\u0000~\u0000\b\u0002hc\u00c1q\u0000~\u0000\u000fpsq\u0000~\u0000\b\u0001\u00ed\u001c\u009aq\u0000~\u0000\u000fps"
+"q\u0000~\u0000\b\u0001q\u00d5sq\u0000~\u0000\u000fpsq\u0000~\u0000\b\u0000\u00f6\u008eLq\u0000~\u0000\u000fpsq\u0000~\u0000\n\u0000{G%q\u0000~\u0000\u000fp\u0000sq\u0000~\u0000\b\u0000{G\u001app"
+"sq\u0000~\u0000\u0013\u0000{G\u000fq\u0000~\u0000\u000fpsq\u0000~\u0000\u0016\u0000{G\fq\u0000~\u0000\u000fpq\u0000~\u0000\u0019q\u0000~\u0000\u001dq\u0000~\u0000\u001fsq\u0000~\u0000 q\u0000~\u0000Iq\u0000"
+"~\u0000$sq\u0000~\u0000\n\u0000{G%q\u0000~\u0000\u000fp\u0000sq\u0000~\u0000\b\u0000{G\u001appsq\u0000~\u0000\u0013\u0000{G\u000fq\u0000~\u0000\u000fpsq\u0000~\u0000\u0016\u0000{G\fq\u0000"
+"~\u0000\u000fpq\u0000~\u0000\u0019q\u0000~\u0000\u001dq\u0000~\u0000\u001fsq\u0000~\u0000 q\u0000~\u0000Oq\u0000~\u0000$sq\u0000~\u0000\n\u0000{G%q\u0000~\u0000\u000fp\u0000sq\u0000~\u0000\b\u0000{"
+"G\u001appsq\u0000~\u0000\u0013\u0000{G\u000fq\u0000~\u0000\u000fpsq\u0000~\u0000\u0016\u0000{G\fq\u0000~\u0000\u000fpq\u0000~\u0000\u0019q\u0000~\u0000\u001dq\u0000~\u0000\u001fsq\u0000~\u0000 q\u0000~"
+"\u0000Uq\u0000~\u0000$sq\u0000~\u0000\n\u0000{G%q\u0000~\u0000\u000fp\u0000sq\u0000~\u0000\b\u0000{G\u001appsq\u0000~\u0000\u0013\u0000{G\u000fq\u0000~\u0000\u000fpsq\u0000~\u0000\u0016\u0000{"
+"G\fq\u0000~\u0000\u000fpq\u0000~\u0000\u0019q\u0000~\u0000\u001dq\u0000~\u0000\u001fsq\u0000~\u0000 q\u0000~\u0000[q\u0000~\u0000$sq\u0000~\u0000\n\u0000{G%q\u0000~\u0000\u000fp\u0000sq\u0000~"
+"\u0000\b\u0000{G\u001appsq\u0000~\u0000\u0013\u0000{G\u000fq\u0000~\u0000\u000fpsq\u0000~\u0000\u0016\u0000{G\fq\u0000~\u0000\u000fpq\u0000~\u0000\u0019q\u0000~\u0000\u001dq\u0000~\u0000\u001fsq\u0000~\u0000"
+" q\u0000~\u0000aq\u0000~\u0000$q\u0000~\u0000\u001fsr\u0000\"com.sun.msv.grammar.ExpressionPool\u0000\u0000\u0000\u0000\u0000\u0000"
+"\u0000\u0001\u0002\u0000\u0001L\u0000\bexpTablet\u0000/Lcom/sun/msv/grammar/ExpressionPool$Close"
+"dHash;xpsr\u0000-com.sun.msv.grammar.ExpressionPool$ClosedHash\u00d7j\u00d0"
+"N\u00ef\u00e8\u00ed\u001c\u0002\u0000\u0004I\u0000\u0005countI\u0000\tthresholdL\u0000\u0006parentq\u0000~\u0000\u009f[\u0000\u0005tablet\u0000![Lcom/s"
+"un/msv/grammar/Expression;xp\u0000\u0000\u00004\u0000\u0000\u00009pur\u0000![Lcom.sun.msv.gramm"
+"ar.Expression;\u00d68D\u00c3]\u00ad\u00a7\n\u0002\u0000\u0000xp\u0000\u0000\u0000\u00bfppppppppppq\u0000~\u0000\u0015q\u0000~\u0000Fq\u0000~\u0000Lq\u0000~\u0000"
+"Rq\u0000~\u0000Xq\u0000~\u0000^q\u0000~\u0000hq\u0000~\u0000mq\u0000~\u0000rq\u0000~\u0000wq\u0000~\u0000|q\u0000~\u0000\u0012q\u0000~\u0000Eq\u0000~\u0000Kq\u0000~\u0000Qq\u0000~\u0000"
+"Wq\u0000~\u0000%q\u0000~\u0000]q\u0000~\u0000gq\u0000~\u0000lq\u0000~\u0000qq\u0000~\u0000vq\u0000~\u0000{q\u0000~\u0000\u0087q\u0000~\u0000\u0086q\u0000~\u0000\u008cq\u0000~\u0000\u008bq\u0000~\u0000"
+"\u0091q\u0000~\u0000\u0090q\u0000~\u0000\u0096q\u0000~\u0000\u0095q\u0000~\u0000\u009bq\u0000~\u0000\u009appq\u0000~\u0000\u0005pppq\u0000~\u0000\u0006pppppppppppppq\u0000~\u0000\u0010p"
+"pq\u0000~\u0000Cq\u0000~\u0000\u0007q\u0000~\u0000eq\u0000~\u0000\u0084pppppppppppppppq\u0000~\u0000\tppppppppppppppq\u0000~\u0000B"
+"q\u0000~\u0000dq\u0000~\u0000\u0083pppppppppppppppppppppppppppppppq\u0000~\u0000Aq\u0000~\u0000cq\u0000~\u0000\u0082pppp"
+"pppppppppppppppppppppppppppq\u0000~\u0000@q\u0000~\u0000bq\u0000~\u0000\u0081q\u0000~\u0000\u0080ppppppppppq\u0000~"
+"\u0000\u007fpppppppp"));
        }
        return new com.sun.msv.verifier.regexp.REDocumentDeclaration(schemaFragment);
    }

    public class Unmarshaller
        extends net.sourceforge.czt.core.jaxb.gen.impl.runtime.AbstractUnmarshallingEventHandlerImpl
    {


        public Unmarshaller(net.sourceforge.czt.core.jaxb.gen.impl.runtime.UnmarshallingContext context) {
            super(context, "-----");
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
                    case  3 :
                        if (("Anns" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Type.add(((net.sourceforge.czt.core.jaxb.gen.impl.TypeImpl) spawnChildFromEnterElement((net.sourceforge.czt.core.jaxb.gen.impl.TypeImpl.class), 4, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        _Type.add(((net.sourceforge.czt.core.jaxb.gen.impl.TypeImpl) spawnChildFromEnterElement((net.sourceforge.czt.core.jaxb.gen.impl.TypeImpl.class), 4, ___uri, ___local, ___qname, __atts)));
                        return ;
                    case  1 :
                        if (("SchemaType" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Type.add(((net.sourceforge.czt.core.jaxb.gen.impl.SchemaTypeElementImpl) spawnChildFromEnterElement((net.sourceforge.czt.core.jaxb.gen.impl.SchemaTypeElementImpl.class), 2, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("ProdType" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Type.add(((net.sourceforge.czt.core.jaxb.gen.impl.ProdTypeElementImpl) spawnChildFromEnterElement((net.sourceforge.czt.core.jaxb.gen.impl.ProdTypeElementImpl.class), 2, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("GivenType" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Type.add(((net.sourceforge.czt.core.jaxb.gen.impl.GivenTypeElementImpl) spawnChildFromEnterElement((net.sourceforge.czt.core.jaxb.gen.impl.GivenTypeElementImpl.class), 2, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("GenType" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Type.add(((net.sourceforge.czt.core.jaxb.gen.impl.GenTypeElementImpl) spawnChildFromEnterElement((net.sourceforge.czt.core.jaxb.gen.impl.GenTypeElementImpl.class), 2, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("PowerType" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Type.add(((net.sourceforge.czt.core.jaxb.gen.impl.PowerTypeElementImpl) spawnChildFromEnterElement((net.sourceforge.czt.core.jaxb.gen.impl.PowerTypeElementImpl.class), 2, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("Type" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 3;
                            return ;
                        }
                        if (("Type" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Type.add(((net.sourceforge.czt.core.jaxb.gen.impl.TypeElementImpl) spawnChildFromEnterElement((net.sourceforge.czt.core.jaxb.gen.impl.TypeElementImpl.class), 2, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        break;
                    case  2 :
                        if (("SchemaType" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Type.add(((net.sourceforge.czt.core.jaxb.gen.impl.SchemaTypeElementImpl) spawnChildFromEnterElement((net.sourceforge.czt.core.jaxb.gen.impl.SchemaTypeElementImpl.class), 2, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("ProdType" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Type.add(((net.sourceforge.czt.core.jaxb.gen.impl.ProdTypeElementImpl) spawnChildFromEnterElement((net.sourceforge.czt.core.jaxb.gen.impl.ProdTypeElementImpl.class), 2, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("GivenType" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Type.add(((net.sourceforge.czt.core.jaxb.gen.impl.GivenTypeElementImpl) spawnChildFromEnterElement((net.sourceforge.czt.core.jaxb.gen.impl.GivenTypeElementImpl.class), 2, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("GenType" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Type.add(((net.sourceforge.czt.core.jaxb.gen.impl.GenTypeElementImpl) spawnChildFromEnterElement((net.sourceforge.czt.core.jaxb.gen.impl.GenTypeElementImpl.class), 2, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("PowerType" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Type.add(((net.sourceforge.czt.core.jaxb.gen.impl.PowerTypeElementImpl) spawnChildFromEnterElement((net.sourceforge.czt.core.jaxb.gen.impl.PowerTypeElementImpl.class), 2, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("Type" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 3;
                            return ;
                        }
                        if (("Type" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Type.add(((net.sourceforge.czt.core.jaxb.gen.impl.TypeElementImpl) spawnChildFromEnterElement((net.sourceforge.czt.core.jaxb.gen.impl.TypeElementImpl.class), 2, ___uri, ___local, ___qname, __atts)));
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
                    case  4 :
                        if (("Type" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            context.popAttributes();
                            state = 2;
                            return ;
                        }
                        break;
                    case  3 :
                        _Type.add(((net.sourceforge.czt.core.jaxb.gen.impl.TypeImpl) spawnChildFromLeaveElement((net.sourceforge.czt.core.jaxb.gen.impl.TypeImpl.class), 4, ___uri, ___local, ___qname)));
                        return ;
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
                    case  3 :
                        _Type.add(((net.sourceforge.czt.core.jaxb.gen.impl.TypeImpl) spawnChildFromEnterAttribute((net.sourceforge.czt.core.jaxb.gen.impl.TypeImpl.class), 4, ___uri, ___local, ___qname)));
                        return ;
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
                    case  3 :
                        _Type.add(((net.sourceforge.czt.core.jaxb.gen.impl.TypeImpl) spawnChildFromLeaveAttribute((net.sourceforge.czt.core.jaxb.gen.impl.TypeImpl.class), 4, ___uri, ___local, ___qname)));
                        return ;
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
                        case  3 :
                            _Type.add(((net.sourceforge.czt.core.jaxb.gen.impl.TypeImpl) spawnChildFromText((net.sourceforge.czt.core.jaxb.gen.impl.TypeImpl.class), 4, value)));
                            return ;
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
