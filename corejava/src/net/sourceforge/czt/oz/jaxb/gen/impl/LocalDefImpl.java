//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.2-b15-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2004.05.14 at 01:55:34 NZST 
//


package net.sourceforge.czt.oz.jaxb.gen.impl;

public class LocalDefImpl
    extends net.sourceforge.czt.z.jaxb.gen.impl.TermAImpl
    implements net.sourceforge.czt.oz.jaxb.gen.LocalDef, com.sun.xml.bind.JAXBObject, net.sourceforge.czt.oz.jaxb.gen.impl.runtime.UnmarshallableObject, net.sourceforge.czt.oz.jaxb.gen.impl.runtime.XMLSerializable, net.sourceforge.czt.oz.jaxb.gen.impl.runtime.ValidatableObject
{

    protected com.sun.xml.bind.util.ListImpl _FreePara = new com.sun.xml.bind.util.ListImpl(new java.util.ArrayList());
    protected com.sun.xml.bind.util.ListImpl _AxPara = new com.sun.xml.bind.util.ListImpl(new java.util.ArrayList());
    protected com.sun.xml.bind.util.ListImpl _GivenPara = new com.sun.xml.bind.util.ListImpl(new java.util.ArrayList());
    public final static java.lang.Class version = (net.sourceforge.czt.oz.jaxb.gen.impl.JAXBVersion.class);
    private static com.sun.msv.grammar.Grammar schemaFragment;

    private final static java.lang.Class PRIMARY_INTERFACE_CLASS() {
        return (net.sourceforge.czt.oz.jaxb.gen.LocalDef.class);
    }

    public java.util.List getFreePara() {
        return _FreePara;
    }

    public java.util.List getAxPara() {
        return _AxPara;
    }

    public java.util.List getGivenPara() {
        return _GivenPara;
    }

    public net.sourceforge.czt.oz.jaxb.gen.impl.runtime.UnmarshallingEventHandler createUnmarshaller(net.sourceforge.czt.oz.jaxb.gen.impl.runtime.UnmarshallingContext context) {
        return new net.sourceforge.czt.oz.jaxb.gen.impl.LocalDefImpl.Unmarshaller(context);
    }

    public void serializeBody(net.sourceforge.czt.oz.jaxb.gen.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        int idx1 = 0;
        final int len1 = _FreePara.size();
        int idx2 = 0;
        final int len2 = _AxPara.size();
        int idx3 = 0;
        final int len3 = _GivenPara.size();
        super.serializeBody(context);
        while (idx3 != len3) {
            if (_GivenPara.get(idx3) instanceof javax.xml.bind.Element) {
                context.childAsBody(((com.sun.xml.bind.JAXBObject) _GivenPara.get(idx3 ++)), "GivenPara");
            } else {
                context.startElement("http://czt.sourceforge.net/zml", "GivenPara");
                int idx_0 = idx3;
                context.childAsURIs(((com.sun.xml.bind.JAXBObject) _GivenPara.get(idx_0 ++)), "GivenPara");
                context.endNamespaceDecls();
                int idx_1 = idx3;
                context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _GivenPara.get(idx_1 ++)), "GivenPara");
                context.endAttributes();
                context.childAsBody(((com.sun.xml.bind.JAXBObject) _GivenPara.get(idx3 ++)), "GivenPara");
                context.endElement();
            }
        }
        while (idx2 != len2) {
            if (_AxPara.get(idx2) instanceof javax.xml.bind.Element) {
                context.childAsBody(((com.sun.xml.bind.JAXBObject) _AxPara.get(idx2 ++)), "AxPara");
            } else {
                context.startElement("http://czt.sourceforge.net/zml", "AxPara");
                int idx_2 = idx2;
                context.childAsURIs(((com.sun.xml.bind.JAXBObject) _AxPara.get(idx_2 ++)), "AxPara");
                context.endNamespaceDecls();
                int idx_3 = idx2;
                context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _AxPara.get(idx_3 ++)), "AxPara");
                context.endAttributes();
                context.childAsBody(((com.sun.xml.bind.JAXBObject) _AxPara.get(idx2 ++)), "AxPara");
                context.endElement();
            }
        }
        while (idx1 != len1) {
            if (_FreePara.get(idx1) instanceof javax.xml.bind.Element) {
                context.childAsBody(((com.sun.xml.bind.JAXBObject) _FreePara.get(idx1 ++)), "FreePara");
            } else {
                context.startElement("http://czt.sourceforge.net/zml", "FreePara");
                int idx_4 = idx1;
                context.childAsURIs(((com.sun.xml.bind.JAXBObject) _FreePara.get(idx_4 ++)), "FreePara");
                context.endNamespaceDecls();
                int idx_5 = idx1;
                context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _FreePara.get(idx_5 ++)), "FreePara");
                context.endAttributes();
                context.childAsBody(((com.sun.xml.bind.JAXBObject) _FreePara.get(idx1 ++)), "FreePara");
                context.endElement();
            }
        }
    }

    public void serializeAttributes(net.sourceforge.czt.oz.jaxb.gen.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        int idx1 = 0;
        final int len1 = _FreePara.size();
        int idx2 = 0;
        final int len2 = _AxPara.size();
        int idx3 = 0;
        final int len3 = _GivenPara.size();
        super.serializeAttributes(context);
        while (idx3 != len3) {
            if (_GivenPara.get(idx3) instanceof javax.xml.bind.Element) {
                context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _GivenPara.get(idx3 ++)), "GivenPara");
            } else {
                idx3 += 1;
            }
        }
        while (idx2 != len2) {
            if (_AxPara.get(idx2) instanceof javax.xml.bind.Element) {
                context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _AxPara.get(idx2 ++)), "AxPara");
            } else {
                idx2 += 1;
            }
        }
        while (idx1 != len1) {
            if (_FreePara.get(idx1) instanceof javax.xml.bind.Element) {
                context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _FreePara.get(idx1 ++)), "FreePara");
            } else {
                idx1 += 1;
            }
        }
    }

    public void serializeURIs(net.sourceforge.czt.oz.jaxb.gen.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        int idx1 = 0;
        final int len1 = _FreePara.size();
        int idx2 = 0;
        final int len2 = _AxPara.size();
        int idx3 = 0;
        final int len3 = _GivenPara.size();
        super.serializeURIs(context);
        while (idx3 != len3) {
            if (_GivenPara.get(idx3) instanceof javax.xml.bind.Element) {
                context.childAsURIs(((com.sun.xml.bind.JAXBObject) _GivenPara.get(idx3 ++)), "GivenPara");
            } else {
                idx3 += 1;
            }
        }
        while (idx2 != len2) {
            if (_AxPara.get(idx2) instanceof javax.xml.bind.Element) {
                context.childAsURIs(((com.sun.xml.bind.JAXBObject) _AxPara.get(idx2 ++)), "AxPara");
            } else {
                idx2 += 1;
            }
        }
        while (idx1 != len1) {
            if (_FreePara.get(idx1) instanceof javax.xml.bind.Element) {
                context.childAsURIs(((com.sun.xml.bind.JAXBObject) _FreePara.get(idx1 ++)), "FreePara");
            } else {
                idx1 += 1;
            }
        }
    }

    public java.lang.Class getPrimaryInterface() {
        return (net.sourceforge.czt.oz.jaxb.gen.LocalDef.class);
    }

    public com.sun.msv.verifier.DocumentDeclaration createRawValidator() {
        if (schemaFragment == null) {
            schemaFragment = com.sun.xml.bind.validator.SchemaDeserializer.deserialize((
 "\u00ac\u00ed\u0000\u0005sr\u0000\u001fcom.sun.msv.grammar.SequenceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.su"
+"n.msv.grammar.BinaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0004exp1t\u0000 Lcom/sun/msv/gra"
+"mmar/Expression;L\u0000\u0004exp2q\u0000~\u0000\u0002xr\u0000\u001ecom.sun.msv.grammar.Expressi"
+"on\u00f8\u0018\u0082\u00e8N5~O\u0002\u0000\u0003I\u0000\u000ecachedHashCodeL\u0000\u0013epsilonReducibilityt\u0000\u0013Ljava"
+"/lang/Boolean;L\u0000\u000bexpandedExpq\u0000~\u0000\u0002xp\u0014\u0090\u00f2\u00eappsq\u0000~\u0000\u0000\u000e\u00adGzppsq\u0000~\u0000\u0000\b"
+"\u00cc\bGppsr\u0000\u001dcom.sun.msv.grammar.ChoiceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0001\u0003?B\u00b9p"
+"psr\u0000\'com.sun.msv.grammar.trex.ElementPattern\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\tna"
+"meClasst\u0000\u001fLcom/sun/msv/grammar/NameClass;xr\u0000\u001ecom.sun.msv.gra"
+"mmar.ElementExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002Z\u0000\u001aignoreUndeclaredAttributesL\u0000\fco"
+"ntentModelq\u0000~\u0000\u0002xq\u0000~\u0000\u0003\u0003?B\u00aesr\u0000\u0011java.lang.Boolean\u00cd r\u0080\u00d5\u009c\u00fa\u00ee\u0002\u0000\u0001Z\u0000\u0005"
+"valuexp\u0000p\u0000sq\u0000~\u0000\u0000\u0003?B\u00a3ppsq\u0000~\u0000\n\u0001\u00f6\u00ef#pp\u0000sq\u0000~\u0000\b\u0001\u00f6\u00ef\u0018ppsr\u0000 com.sun.m"
+"sv.grammar.OneOrMoreExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001ccom.sun.msv.grammar.Un"
+"aryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\u0003expq\u0000~\u0000\u0002xq\u0000~\u0000\u0003\u0001\u00f6\u00ef\rq\u0000~\u0000\u000fpsr\u0000 com.sun.msv."
+"grammar.AttributeExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003expq\u0000~\u0000\u0002L\u0000\tnameClassq\u0000~\u0000\u000bx"
+"q\u0000~\u0000\u0003\u0001\u00f6\u00ef\nq\u0000~\u0000\u000fpsr\u00002com.sun.msv.grammar.Expression$AnyStringE"
+"xpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003\u0000\u0000\u0000\bsq\u0000~\u0000\u000e\u0001q\u0000~\u0000\u0019sr\u0000 com.sun.msv.gr"
+"ammar.AnyNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun.msv.grammar.NameCla"
+"ss\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com.sun.msv.grammar.Expression$EpsilonExp"
+"ression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003\u0000\u0000\u0000\tq\u0000~\u0000\u001aq\u0000~\u0000\u001fsr\u0000#com.sun.msv.gramma"
+"r.SimpleNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\tlocalNamet\u0000\u0012Ljava/lang/String"
+";L\u0000\fnamespaceURIq\u0000~\u0000!xq\u0000~\u0000\u001ct\u0000-net.sourceforge.czt.z.jaxb.gen"
+".TermA.AnnsTypet\u0000+http://java.sun.com/jaxb/xjc/dummy-element"
+"ssq\u0000~\u0000\b\u0001HS{ppsq\u0000~\u0000\u0016\u0001HSpq\u0000~\u0000\u000fpsr\u0000\u001bcom.sun.msv.grammar.DataExp"
+"\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\u0002dtt\u0000\u001fLorg/relaxng/datatype/Datatype;L\u0000\u0006exceptq"
+"\u0000~\u0000\u0002L\u0000\u0004namet\u0000\u001dLcom/sun/msv/util/StringPair;xq\u0000~\u0000\u0003\u0000O;\u00b2ppsr\u0000\"c"
+"om.sun.msv.datatype.xsd.QnameType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000*com.sun.msv."
+"datatype.xsd.BuiltinAtomicType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000%com.sun.msv.dat"
+"atype.xsd.ConcreteType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\'com.sun.msv.datatype.xs"
+"d.XSDatatypeImpl\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\fnamespaceUriq\u0000~\u0000!L\u0000\btypeNameq\u0000"
+"~\u0000!L\u0000\nwhiteSpacet\u0000.Lcom/sun/msv/datatype/xsd/WhiteSpaceProce"
+"ssor;xpt\u0000 http://www.w3.org/2001/XMLSchemat\u0000\u0005QNamesr\u00005com.su"
+"n.msv.datatype.xsd.WhiteSpaceProcessor$Collapse\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr"
+"\u0000,com.sun.msv.datatype.xsd.WhiteSpaceProcessor\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xps"
+"r\u00000com.sun.msv.grammar.Expression$NullSetExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002"
+"\u0000\u0000xq\u0000~\u0000\u0003\u0000\u0000\u0000\nq\u0000~\u0000\u000fpsr\u0000\u001bcom.sun.msv.util.StringPair\u00d0t\u001ejB\u008f\u008d\u00a0\u0002\u0000\u0002"
+"L\u0000\tlocalNameq\u0000~\u0000!L\u0000\fnamespaceURIq\u0000~\u0000!xpq\u0000~\u00002q\u0000~\u00001sq\u0000~\u0000 t\u0000\u0004ty"
+"pet\u0000)http://www.w3.org/2001/XMLSchema-instanceq\u0000~\u0000\u001fsq\u0000~\u0000 t\u0000\u0004"
+"Annst\u0000\u001ehttp://czt.sourceforge.net/zmlq\u0000~\u0000\u001fsq\u0000~\u0000\b\u0005\u008c\u00c5\u0089ppsq\u0000~\u0000\u0013"
+"\u0005\u008c\u00c5~q\u0000~\u0000\u000fpsq\u0000~\u0000\b\u0005\u008c\u00c5{q\u0000~\u0000\u000fpsq\u0000~\u0000\n\u0001\u00f6\u00ef#q\u0000~\u0000\u000fp\u0000sq\u0000~\u0000\b\u0001\u00f6\u00ef\u0018ppsq\u0000~\u0000"
+"\u0013\u0001\u00f6\u00ef\rq\u0000~\u0000\u000fpsq\u0000~\u0000\u0016\u0001\u00f6\u00ef\nq\u0000~\u0000\u000fpq\u0000~\u0000\u0019q\u0000~\u0000\u001dq\u0000~\u0000\u001fsq\u0000~\u0000 t\u0000/net.sourc"
+"eforge.czt.z.jaxb.gen.GivenParaElementq\u0000~\u0000$sq\u0000~\u0000\n\u0003\u0095\u00d6Vq\u0000~\u0000\u000fp\u0000"
+"sq\u0000~\u0000\u0000\u0003\u0095\u00d6Kppsq\u0000~\u0000\n\u0001\u00f6\u00ef#pp\u0000sq\u0000~\u0000\b\u0001\u00f6\u00ef\u0018ppsq\u0000~\u0000\u0013\u0001\u00f6\u00ef\rq\u0000~\u0000\u000fpsq\u0000~\u0000\u0016\u0001"
+"\u00f6\u00ef\nq\u0000~\u0000\u000fpq\u0000~\u0000\u0019q\u0000~\u0000\u001dq\u0000~\u0000\u001fsq\u0000~\u0000 t\u0000(net.sourceforge.czt.z.jaxb."
+"gen.GivenParaq\u0000~\u0000$sq\u0000~\u0000\b\u0001\u009e\u00e7#ppsq\u0000~\u0000\u0016\u0001\u009e\u00e7\u0018q\u0000~\u0000\u000fpq\u0000~\u0000*sq\u0000~\u0000 q\u0000~"
+"\u0000;q\u0000~\u0000<q\u0000~\u0000\u001fsq\u0000~\u0000 t\u0000\tGivenParaq\u0000~\u0000?q\u0000~\u0000\u001fsq\u0000~\u0000\b\u0005\u00e1?.ppsq\u0000~\u0000\u0013\u0005\u00e1"
+"?#q\u0000~\u0000\u000fpsq\u0000~\u0000\b\u0005\u00e1? q\u0000~\u0000\u000fpsq\u0000~\u0000\n\u0001\u00f6\u00ef#q\u0000~\u0000\u000fp\u0000sq\u0000~\u0000\b\u0001\u00f6\u00ef\u0018ppsq\u0000~\u0000\u0013\u0001"
+"\u00f6\u00ef\rq\u0000~\u0000\u000fpsq\u0000~\u0000\u0016\u0001\u00f6\u00ef\nq\u0000~\u0000\u000fpq\u0000~\u0000\u0019q\u0000~\u0000\u001dq\u0000~\u0000\u001fsq\u0000~\u0000 t\u0000,net.sourcef"
+"orge.czt.z.jaxb.gen.AxParaElementq\u0000~\u0000$sq\u0000~\u0000\n\u0003\u00eaO\u00fbq\u0000~\u0000\u000fp\u0000sq\u0000~\u0000"
+"\u0000\u0003\u00eaO\u00f0ppsq\u0000~\u0000\n\u0001\u00f6\u00ef#pp\u0000sq\u0000~\u0000\b\u0001\u00f6\u00ef\u0018ppsq\u0000~\u0000\u0013\u0001\u00f6\u00ef\rq\u0000~\u0000\u000fpsq\u0000~\u0000\u0016\u0001\u00f6\u00ef\nq\u0000"
+"~\u0000\u000fpq\u0000~\u0000\u0019q\u0000~\u0000\u001dq\u0000~\u0000\u001fsq\u0000~\u0000 t\u0000%net.sourceforge.czt.z.jaxb.gen.A"
+"xParaq\u0000~\u0000$sq\u0000~\u0000\b\u0001\u00f3`\u00c8ppsq\u0000~\u0000\u0016\u0001\u00f3`\u00bdq\u0000~\u0000\u000fpq\u0000~\u0000*sq\u0000~\u0000 q\u0000~\u0000;q\u0000~\u0000<q"
+"\u0000~\u0000\u001fsq\u0000~\u0000 t\u0000\u0006AxParaq\u0000~\u0000?q\u0000~\u0000\u001fsq\u0000~\u0000\b\u0005\u00e3\u00abkppsq\u0000~\u0000\u0013\u0005\u00e3\u00ab`q\u0000~\u0000\u000fpsq\u0000"
+"~\u0000\b\u0005\u00e3\u00ab]q\u0000~\u0000\u000fpsq\u0000~\u0000\n\u0001\u00f6\u00ef#q\u0000~\u0000\u000fp\u0000sq\u0000~\u0000\b\u0001\u00f6\u00ef\u0018ppsq\u0000~\u0000\u0013\u0001\u00f6\u00ef\rq\u0000~\u0000\u000fpsq"
+"\u0000~\u0000\u0016\u0001\u00f6\u00ef\nq\u0000~\u0000\u000fpq\u0000~\u0000\u0019q\u0000~\u0000\u001dq\u0000~\u0000\u001fsq\u0000~\u0000 t\u0000.net.sourceforge.czt.z."
+"jaxb.gen.FreeParaElementq\u0000~\u0000$sq\u0000~\u0000\n\u0003\u00ec\u00bc8q\u0000~\u0000\u000fp\u0000sq\u0000~\u0000\u0000\u0003\u00ec\u00bc-ppsq"
+"\u0000~\u0000\n\u0001\u00f6\u00ef#pp\u0000sq\u0000~\u0000\b\u0001\u00f6\u00ef\u0018ppsq\u0000~\u0000\u0013\u0001\u00f6\u00ef\rq\u0000~\u0000\u000fpsq\u0000~\u0000\u0016\u0001\u00f6\u00ef\nq\u0000~\u0000\u000fpq\u0000~\u0000\u0019"
+"q\u0000~\u0000\u001dq\u0000~\u0000\u001fsq\u0000~\u0000 t\u0000\'net.sourceforge.czt.z.jaxb.gen.FreeParaq\u0000"
+"~\u0000$sq\u0000~\u0000\b\u0001\u00f5\u00cd\u0005ppsq\u0000~\u0000\u0016\u0001\u00f5\u00cc\u00faq\u0000~\u0000\u000fpq\u0000~\u0000*sq\u0000~\u0000 q\u0000~\u0000;q\u0000~\u0000<q\u0000~\u0000\u001fsq\u0000"
+"~\u0000 t\u0000\bFreeParaq\u0000~\u0000?q\u0000~\u0000\u001fsr\u0000\"com.sun.msv.grammar.ExpressionPo"
+"ol\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\bexpTablet\u0000/Lcom/sun/msv/grammar/ExpressionPo"
+"ol$ClosedHash;xpsr\u0000-com.sun.msv.grammar.ExpressionPool$Close"
+"dHash\u00d7j\u00d0N\u00ef\u00e8\u00ed\u001c\u0002\u0000\u0004I\u0000\u0005countI\u0000\tthresholdL\u0000\u0006parentq\u0000~\u0000\u0083[\u0000\u0005tablet\u0000"
+"![Lcom/sun/msv/grammar/Expression;xp\u0000\u0000\u0000#\u0000\u0000\u00009pur\u0000![Lcom.sun.m"
+"sv.grammar.Expression;\u00d68D\u00c3]\u00ad\u00a7\n\u0002\u0000\u0000xp\u0000\u0000\u0000\u00bfppppppppppppppppppppp"
+"pq\u0000~\u0000vq\u0000~\u0000}pppppq\u0000~\u0000nppq\u0000~\u0000mppppppppq\u0000~\u0000\u0006pq\u0000~\u0000lpppppppppq\u0000~\u0000"
+"\u0007pppppppppppppppppppq\u0000~\u0000\u0010q\u0000~\u0000%ppppppppppppppq\u0000~\u0000\u0005pppppq\u0000~\u0000\tp"
+"ppppppppppppppppppppppppppq\u0000~\u0000Jq\u0000~\u0000Qpppppq\u0000~\u0000Bppq\u0000~\u0000Appppppp"
+"pppq\u0000~\u0000@ppppppppq\u0000~\u0000`q\u0000~\u0000gpppppq\u0000~\u0000Xppq\u0000~\u0000\u0015q\u0000~\u0000Eq\u0000~\u0000Mq\u0000~\u0000[q\u0000"
+"~\u0000cq\u0000~\u0000Wq\u0000~\u0000qq\u0000~\u0000ypppq\u0000~\u0000\u0012q\u0000~\u0000Dq\u0000~\u0000Lq\u0000~\u0000Zq\u0000~\u0000bq\u0000~\u0000Vq\u0000~\u0000pq\u0000~\u0000"
+"xppppppppp"));
        }
        return new com.sun.msv.verifier.regexp.REDocumentDeclaration(schemaFragment);
    }

    public class Unmarshaller
        extends net.sourceforge.czt.oz.jaxb.gen.impl.runtime.AbstractUnmarshallingEventHandlerImpl
    {


        public Unmarshaller(net.sourceforge.czt.oz.jaxb.gen.impl.runtime.UnmarshallingContext context) {
            super(context, "-----------");
        }

        protected Unmarshaller(net.sourceforge.czt.oz.jaxb.gen.impl.runtime.UnmarshallingContext context, int startState) {
            this(context);
            state = startState;
        }

        public java.lang.Object owner() {
            return net.sourceforge.czt.oz.jaxb.gen.impl.LocalDefImpl.this;
        }

        public void enterElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname, org.xml.sax.Attributes __atts)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  2 :
                        if (("Anns" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _GivenPara.add(((net.sourceforge.czt.z.jaxb.gen.impl.GivenParaImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.GivenParaImpl.class), 3, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("DeclName" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _GivenPara.add(((net.sourceforge.czt.z.jaxb.gen.impl.GivenParaImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.GivenParaImpl.class), 3, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("DeclName" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _GivenPara.add(((net.sourceforge.czt.z.jaxb.gen.impl.GivenParaImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.GivenParaImpl.class), 3, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        _GivenPara.add(((net.sourceforge.czt.z.jaxb.gen.impl.GivenParaImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.GivenParaImpl.class), 3, ___uri, ___local, ___qname, __atts)));
                        return ;
                    case  4 :
                        if (("GivenPara" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 2;
                            return ;
                        }
                        if (("GivenPara" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _GivenPara.add(((net.sourceforge.czt.z.jaxb.gen.impl.GivenParaElementImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.GivenParaElementImpl.class), 4, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("AxPara" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 9;
                            return ;
                        }
                        if (("AxPara" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _AxPara.add(((net.sourceforge.czt.z.jaxb.gen.impl.AxParaElementImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.AxParaElementImpl.class), 5, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        state = 5;
                        continue outer;
                    case  1 :
                        if (("GivenPara" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 2;
                            return ;
                        }
                        if (("GivenPara" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _GivenPara.add(((net.sourceforge.czt.z.jaxb.gen.impl.GivenParaElementImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.GivenParaElementImpl.class), 4, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        state = 4;
                        continue outer;
                    case  0 :
                        if (("Anns" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.z.jaxb.gen.impl.TermAImpl)net.sourceforge.czt.oz.jaxb.gen.impl.LocalDefImpl.this).new Unmarshaller(context)), 1, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        spawnHandlerFromEnterElement((((net.sourceforge.czt.z.jaxb.gen.impl.TermAImpl)net.sourceforge.czt.oz.jaxb.gen.impl.LocalDefImpl.this).new Unmarshaller(context)), 1, ___uri, ___local, ___qname, __atts);
                        return ;
                    case  9 :
                        attIdx = context.getAttribute("", "Box");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().enterElement(___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("Anns" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _AxPara.add(((net.sourceforge.czt.z.jaxb.gen.impl.AxParaImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.AxParaImpl.class), 10, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("DeclName" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _AxPara.add(((net.sourceforge.czt.z.jaxb.gen.impl.AxParaImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.AxParaImpl.class), 10, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("DeclName" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _AxPara.add(((net.sourceforge.czt.z.jaxb.gen.impl.AxParaImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.AxParaImpl.class), 10, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("SchText" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _AxPara.add(((net.sourceforge.czt.z.jaxb.gen.impl.AxParaImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.AxParaImpl.class), 10, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("SchText" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _AxPara.add(((net.sourceforge.czt.z.jaxb.gen.impl.AxParaImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.AxParaImpl.class), 10, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        _AxPara.add(((net.sourceforge.czt.z.jaxb.gen.impl.AxParaImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.AxParaImpl.class), 10, ___uri, ___local, ___qname, __atts)));
                        return ;
                    case  6 :
                        if (("FreePara" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 7;
                            return ;
                        }
                        if (("FreePara" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _FreePara.add(((net.sourceforge.czt.z.jaxb.gen.impl.FreeParaElementImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.FreeParaElementImpl.class), 6, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        revertToParentFromEnterElement(___uri, ___local, ___qname, __atts);
                        return ;
                    case  5 :
                        if (("AxPara" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 9;
                            return ;
                        }
                        if (("AxPara" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _AxPara.add(((net.sourceforge.czt.z.jaxb.gen.impl.AxParaElementImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.AxParaElementImpl.class), 5, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("FreePara" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 7;
                            return ;
                        }
                        if (("FreePara" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _FreePara.add(((net.sourceforge.czt.z.jaxb.gen.impl.FreeParaElementImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.FreeParaElementImpl.class), 6, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        state = 6;
                        continue outer;
                    case  7 :
                        if (("Anns" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _FreePara.add(((net.sourceforge.czt.z.jaxb.gen.impl.FreeParaImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.FreeParaImpl.class), 8, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("Freetype" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _FreePara.add(((net.sourceforge.czt.z.jaxb.gen.impl.FreeParaImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.FreeParaImpl.class), 8, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("Freetype" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _FreePara.add(((net.sourceforge.czt.z.jaxb.gen.impl.FreeParaImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.FreeParaImpl.class), 8, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        _FreePara.add(((net.sourceforge.czt.z.jaxb.gen.impl.FreeParaImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.FreeParaImpl.class), 8, ___uri, ___local, ___qname, __atts)));
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
                    case  10 :
                        if (("AxPara" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            context.popAttributes();
                            state = 5;
                            return ;
                        }
                        break;
                    case  2 :
                        _GivenPara.add(((net.sourceforge.czt.z.jaxb.gen.impl.GivenParaImpl) spawnChildFromLeaveElement((net.sourceforge.czt.z.jaxb.gen.impl.GivenParaImpl.class), 3, ___uri, ___local, ___qname)));
                        return ;
                    case  4 :
                        state = 5;
                        continue outer;
                    case  1 :
                        state = 4;
                        continue outer;
                    case  0 :
                        spawnHandlerFromLeaveElement((((net.sourceforge.czt.z.jaxb.gen.impl.TermAImpl)net.sourceforge.czt.oz.jaxb.gen.impl.LocalDefImpl.this).new Unmarshaller(context)), 1, ___uri, ___local, ___qname);
                        return ;
                    case  9 :
                        attIdx = context.getAttribute("", "Box");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveElement(___uri, ___local, ___qname);
                            return ;
                        }
                        _AxPara.add(((net.sourceforge.czt.z.jaxb.gen.impl.AxParaImpl) spawnChildFromLeaveElement((net.sourceforge.czt.z.jaxb.gen.impl.AxParaImpl.class), 10, ___uri, ___local, ___qname)));
                        return ;
                    case  6 :
                        revertToParentFromLeaveElement(___uri, ___local, ___qname);
                        return ;
                    case  5 :
                        state = 6;
                        continue outer;
                    case  8 :
                        if (("FreePara" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            context.popAttributes();
                            state = 6;
                            return ;
                        }
                        break;
                    case  7 :
                        _FreePara.add(((net.sourceforge.czt.z.jaxb.gen.impl.FreeParaImpl) spawnChildFromLeaveElement((net.sourceforge.czt.z.jaxb.gen.impl.FreeParaImpl.class), 8, ___uri, ___local, ___qname)));
                        return ;
                    case  3 :
                        if (("GivenPara" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            context.popAttributes();
                            state = 4;
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
                    case  2 :
                        _GivenPara.add(((net.sourceforge.czt.z.jaxb.gen.impl.GivenParaImpl) spawnChildFromEnterAttribute((net.sourceforge.czt.z.jaxb.gen.impl.GivenParaImpl.class), 3, ___uri, ___local, ___qname)));
                        return ;
                    case  4 :
                        state = 5;
                        continue outer;
                    case  1 :
                        state = 4;
                        continue outer;
                    case  0 :
                        spawnHandlerFromEnterAttribute((((net.sourceforge.czt.z.jaxb.gen.impl.TermAImpl)net.sourceforge.czt.oz.jaxb.gen.impl.LocalDefImpl.this).new Unmarshaller(context)), 1, ___uri, ___local, ___qname);
                        return ;
                    case  9 :
                        if (("Box" == ___local)&&("" == ___uri)) {
                            _AxPara.add(((net.sourceforge.czt.z.jaxb.gen.impl.AxParaImpl) spawnChildFromEnterAttribute((net.sourceforge.czt.z.jaxb.gen.impl.AxParaImpl.class), 10, ___uri, ___local, ___qname)));
                            return ;
                        }
                        _AxPara.add(((net.sourceforge.czt.z.jaxb.gen.impl.AxParaImpl) spawnChildFromEnterAttribute((net.sourceforge.czt.z.jaxb.gen.impl.AxParaImpl.class), 10, ___uri, ___local, ___qname)));
                        return ;
                    case  6 :
                        revertToParentFromEnterAttribute(___uri, ___local, ___qname);
                        return ;
                    case  5 :
                        state = 6;
                        continue outer;
                    case  7 :
                        _FreePara.add(((net.sourceforge.czt.z.jaxb.gen.impl.FreeParaImpl) spawnChildFromEnterAttribute((net.sourceforge.czt.z.jaxb.gen.impl.FreeParaImpl.class), 8, ___uri, ___local, ___qname)));
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
                        _GivenPara.add(((net.sourceforge.czt.z.jaxb.gen.impl.GivenParaImpl) spawnChildFromLeaveAttribute((net.sourceforge.czt.z.jaxb.gen.impl.GivenParaImpl.class), 3, ___uri, ___local, ___qname)));
                        return ;
                    case  4 :
                        state = 5;
                        continue outer;
                    case  1 :
                        state = 4;
                        continue outer;
                    case  0 :
                        spawnHandlerFromLeaveAttribute((((net.sourceforge.czt.z.jaxb.gen.impl.TermAImpl)net.sourceforge.czt.oz.jaxb.gen.impl.LocalDefImpl.this).new Unmarshaller(context)), 1, ___uri, ___local, ___qname);
                        return ;
                    case  9 :
                        attIdx = context.getAttribute("", "Box");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveAttribute(___uri, ___local, ___qname);
                            return ;
                        }
                        _AxPara.add(((net.sourceforge.czt.z.jaxb.gen.impl.AxParaImpl) spawnChildFromLeaveAttribute((net.sourceforge.czt.z.jaxb.gen.impl.AxParaImpl.class), 10, ___uri, ___local, ___qname)));
                        return ;
                    case  6 :
                        revertToParentFromLeaveAttribute(___uri, ___local, ___qname);
                        return ;
                    case  5 :
                        state = 6;
                        continue outer;
                    case  7 :
                        _FreePara.add(((net.sourceforge.czt.z.jaxb.gen.impl.FreeParaImpl) spawnChildFromLeaveAttribute((net.sourceforge.czt.z.jaxb.gen.impl.FreeParaImpl.class), 8, ___uri, ___local, ___qname)));
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
                            _GivenPara.add(((net.sourceforge.czt.z.jaxb.gen.impl.GivenParaImpl) spawnChildFromText((net.sourceforge.czt.z.jaxb.gen.impl.GivenParaImpl.class), 3, value)));
                            return ;
                        case  4 :
                            state = 5;
                            continue outer;
                        case  1 :
                            state = 4;
                            continue outer;
                        case  0 :
                            spawnHandlerFromText((((net.sourceforge.czt.z.jaxb.gen.impl.TermAImpl)net.sourceforge.czt.oz.jaxb.gen.impl.LocalDefImpl.this).new Unmarshaller(context)), 1, value);
                            return ;
                        case  9 :
                            attIdx = context.getAttribute("", "Box");
                            if (attIdx >= 0) {
                                context.consumeAttribute(attIdx);
                                context.getCurrentHandler().text(value);
                                return ;
                            }
                            _AxPara.add(((net.sourceforge.czt.z.jaxb.gen.impl.AxParaImpl) spawnChildFromText((net.sourceforge.czt.z.jaxb.gen.impl.AxParaImpl.class), 10, value)));
                            return ;
                        case  6 :
                            revertToParentFromText(value);
                            return ;
                        case  5 :
                            state = 6;
                            continue outer;
                        case  7 :
                            _FreePara.add(((net.sourceforge.czt.z.jaxb.gen.impl.FreeParaImpl) spawnChildFromText((net.sourceforge.czt.z.jaxb.gen.impl.FreeParaImpl.class), 8, value)));
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
