//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.2-b15-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2003.10.28 at 04:14:13 NZDT 
//


package net.sourceforge.czt.oz.jaxb.gen.impl;

public class LocalDefImpl
    extends net.sourceforge.czt.core.jaxb.gen.impl.TermAImpl
    implements net.sourceforge.czt.oz.jaxb.gen.LocalDef, com.sun.xml.bind.JAXBObject, net.sourceforge.czt.core.jaxb.gen.impl.runtime.UnmarshallableObject, net.sourceforge.czt.core.jaxb.gen.impl.runtime.XMLSerializable, net.sourceforge.czt.core.jaxb.gen.impl.runtime.ValidatableObject
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

    public net.sourceforge.czt.core.jaxb.gen.impl.runtime.UnmarshallingEventHandler createUnmarshaller(net.sourceforge.czt.core.jaxb.gen.impl.runtime.UnmarshallingContext context) {
        return new net.sourceforge.czt.oz.jaxb.gen.impl.LocalDefImpl.Unmarshaller(context);
    }

    public void serializeBody(net.sourceforge.czt.core.jaxb.gen.impl.runtime.XMLSerializer context)
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

    public void serializeAttributes(net.sourceforge.czt.core.jaxb.gen.impl.runtime.XMLSerializer context)
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

    public void serializeURIs(net.sourceforge.czt.core.jaxb.gen.impl.runtime.XMLSerializer context)
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
+"/lang/Boolean;L\u0000\u000bexpandedExpq\u0000~\u0000\u0002xp\f\u00f1\u00d7\u00afppsq\u0000~\u0000\u0000\n#\u00c3\u00b5ppsq\u0000~\u0000\u0000\u0007"
+"\u001e\u0080\u00d8ppsr\u0000\u001dcom.sun.msv.grammar.ChoiceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0001\u0003\u0013\u0007\u00bfp"
+"psr\u0000\'com.sun.msv.grammar.trex.ElementPattern\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\tna"
+"meClasst\u0000\u001fLcom/sun/msv/grammar/NameClass;xr\u0000\u001ecom.sun.msv.gra"
+"mmar.ElementExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002Z\u0000\u001aignoreUndeclaredAttributesL\u0000\fco"
+"ntentModelq\u0000~\u0000\u0002xq\u0000~\u0000\u0003\u0003\u0013\u0007\u00b4sr\u0000\u0011java.lang.Boolean\u00cd r\u0080\u00d5\u009c\u00fa\u00ee\u0002\u0000\u0001Z\u0000\u0005"
+"valuexp\u0000p\u0000sq\u0000~\u0000\u0000\u0003\u0013\u0007\u00a9ppsq\u0000~\u0000\n\u0000{G%pp\u0000sq\u0000~\u0000\b\u0000{G\u001appsr\u0000 com.sun.m"
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
+"entssq\u0000~\u0000\b\u0002\u0097\u00c0\u007fppsq\u0000~\u0000\u0016\u0002\u0097\u00c0tq\u0000~\u0000\u000fpsr\u0000\u001bcom.sun.msv.grammar.Data"
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
+"t\u0000\u0004Annst\u0000\u001ehttp://czt.sourceforge.net/zmlq\u0000~\u0000\u001fsq\u0000~\u0000\b\u0004\u000by\u0014ppsq\u0000"
+"~\u0000\u0013\u0004\u000by\tq\u0000~\u0000\u000fpsq\u0000~\u0000\b\u0004\u000by\u0006q\u0000~\u0000\u000fpsq\u0000~\u0000\n\u0000{G%q\u0000~\u0000\u000fp\u0000sq\u0000~\u0000\b\u0000{G\u001appsq"
+"\u0000~\u0000\u0013\u0000{G\u000fq\u0000~\u0000\u000fpsq\u0000~\u0000\u0016\u0000{G\fq\u0000~\u0000\u000fpq\u0000~\u0000\u0019q\u0000~\u0000\u001dq\u0000~\u0000\u001fsq\u0000~\u0000 t\u00002net.so"
+"urceforge.czt.core.jaxb.gen.GivenParaElementq\u0000~\u0000$sq\u0000~\u0000\n\u0003\u00901\u00dfq"
+"\u0000~\u0000\u000fp\u0000sq\u0000~\u0000\u0000\u0003\u00901\u00d4ppsq\u0000~\u0000\n\u0000{G%pp\u0000sq\u0000~\u0000\b\u0000{G\u001appsq\u0000~\u0000\u0013\u0000{G\u000fq\u0000~\u0000\u000fps"
+"q\u0000~\u0000\u0016\u0000{G\fq\u0000~\u0000\u000fpq\u0000~\u0000\u0019q\u0000~\u0000\u001dq\u0000~\u0000\u001fsq\u0000~\u0000 t\u0000+net.sourceforge.czt.c"
+"ore.jaxb.gen.GivenParaq\u0000~\u0000$sq\u0000~\u0000\b\u0003\u0014\u00ea\u00aappsq\u0000~\u0000\u0016\u0003\u0014\u00ea\u009fq\u0000~\u0000\u000fpq\u0000~\u0000*"
+"sq\u0000~\u0000 q\u0000~\u0000;q\u0000~\u0000<q\u0000~\u0000\u001fsq\u0000~\u0000 t\u0000\tGivenParaq\u0000~\u0000?q\u0000~\u0000\u001fsq\u0000~\u0000\b\u0003\u0005B\u00d8p"
+"psq\u0000~\u0000\u0013\u0003\u0005B\u00cdq\u0000~\u0000\u000fpsq\u0000~\u0000\b\u0003\u0005B\u00caq\u0000~\u0000\u000fpsq\u0000~\u0000\n\u0000{G%q\u0000~\u0000\u000fp\u0000sq\u0000~\u0000\b\u0000{G\u001a"
+"ppsq\u0000~\u0000\u0013\u0000{G\u000fq\u0000~\u0000\u000fpsq\u0000~\u0000\u0016\u0000{G\fq\u0000~\u0000\u000fpq\u0000~\u0000\u0019q\u0000~\u0000\u001dq\u0000~\u0000\u001fsq\u0000~\u0000 t\u0000/ne"
+"t.sourceforge.czt.core.jaxb.gen.AxParaElementq\u0000~\u0000$sq\u0000~\u0000\n\u0002\u0089\u00fb\u00a3"
+"q\u0000~\u0000\u000fp\u0000sq\u0000~\u0000\u0000\u0002\u0089\u00fb\u0098ppsq\u0000~\u0000\n\u0000{G%pp\u0000sq\u0000~\u0000\b\u0000{G\u001appsq\u0000~\u0000\u0013\u0000{G\u000fq\u0000~\u0000\u000fp"
+"sq\u0000~\u0000\u0016\u0000{G\fq\u0000~\u0000\u000fpq\u0000~\u0000\u0019q\u0000~\u0000\u001dq\u0000~\u0000\u001fsq\u0000~\u0000 t\u0000(net.sourceforge.czt."
+"core.jaxb.gen.AxParaq\u0000~\u0000$sq\u0000~\u0000\b\u0002\u000e\u00b4nppsq\u0000~\u0000\u0016\u0002\u000e\u00b4cq\u0000~\u0000\u000fpq\u0000~\u0000*sq"
+"\u0000~\u0000 q\u0000~\u0000;q\u0000~\u0000<q\u0000~\u0000\u001fsq\u0000~\u0000 t\u0000\u0006AxParaq\u0000~\u0000?q\u0000~\u0000\u001fsq\u0000~\u0000\b\u0002\u00ce\u0013\u00f5ppsq\u0000~"
+"\u0000\u0013\u0002\u00ce\u0013\u00eaq\u0000~\u0000\u000fpsq\u0000~\u0000\b\u0002\u00ce\u0013\u00e7q\u0000~\u0000\u000fpsq\u0000~\u0000\n\u0000{G%q\u0000~\u0000\u000fp\u0000sq\u0000~\u0000\b\u0000{G\u001appsq\u0000"
+"~\u0000\u0013\u0000{G\u000fq\u0000~\u0000\u000fpsq\u0000~\u0000\u0016\u0000{G\fq\u0000~\u0000\u000fpq\u0000~\u0000\u0019q\u0000~\u0000\u001dq\u0000~\u0000\u001fsq\u0000~\u0000 t\u00001net.sou"
+"rceforge.czt.core.jaxb.gen.FreeParaElementq\u0000~\u0000$sq\u0000~\u0000\n\u0002R\u00cc\u00c0q\u0000~"
+"\u0000\u000fp\u0000sq\u0000~\u0000\u0000\u0002R\u00cc\u00b5ppsq\u0000~\u0000\n\u0000{G%pp\u0000sq\u0000~\u0000\b\u0000{G\u001appsq\u0000~\u0000\u0013\u0000{G\u000fq\u0000~\u0000\u000fpsq\u0000"
+"~\u0000\u0016\u0000{G\fq\u0000~\u0000\u000fpq\u0000~\u0000\u0019q\u0000~\u0000\u001dq\u0000~\u0000\u001fsq\u0000~\u0000 t\u0000*net.sourceforge.czt.cor"
+"e.jaxb.gen.FreeParaq\u0000~\u0000$sq\u0000~\u0000\b\u0001\u00d7\u0085\u008bppsq\u0000~\u0000\u0016\u0001\u00d7\u0085\u0080q\u0000~\u0000\u000fpq\u0000~\u0000*sq\u0000"
+"~\u0000 q\u0000~\u0000;q\u0000~\u0000<q\u0000~\u0000\u001fsq\u0000~\u0000 t\u0000\bFreeParaq\u0000~\u0000?q\u0000~\u0000\u001fsr\u0000\"com.sun.msv"
+".grammar.ExpressionPool\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\bexpTablet\u0000/Lcom/sun/msv"
+"/grammar/ExpressionPool$ClosedHash;xpsr\u0000-com.sun.msv.grammar"
+".ExpressionPool$ClosedHash\u00d7j\u00d0N\u00ef\u00e8\u00ed\u001c\u0002\u0000\u0004I\u0000\u0005countI\u0000\tthresholdL\u0000\u0006"
+"parentq\u0000~\u0000\u0083[\u0000\u0005tablet\u0000![Lcom/sun/msv/grammar/Expression;xp\u0000\u0000\u0000"
+"#\u0000\u0000\u00009pur\u0000![Lcom.sun.msv.grammar.Expression;\u00d68D\u00c3]\u00ad\u00a7\n\u0002\u0000\u0000xp\u0000\u0000\u0000\u00bf"
+"ppppppq\u0000~\u0000\u0005q\u0000~\u0000\u0010ppq\u0000~\u0000\u0015q\u0000~\u0000Eq\u0000~\u0000Mq\u0000~\u0000[q\u0000~\u0000cq\u0000~\u0000qq\u0000~\u0000ypq\u0000~\u0000\u0007p"
+"pq\u0000~\u0000\u0012q\u0000~\u0000Dq\u0000~\u0000Lq\u0000~\u0000Zq\u0000~\u0000bq\u0000~\u0000pq\u0000~\u0000xq\u0000~\u0000nq\u0000~\u0000\tq\u0000~\u0000mppq\u0000~\u0000gpp"
+"ppppq\u0000~\u0000lpppppppppppppppppppppppppppppq\u0000~\u0000`ppppppppq\u0000~\u0000Qpppp"
+"pppppppppppppppppppppppppppppppq\u0000~\u0000Xq\u0000~\u0000Jpq\u0000~\u0000Wppppppppppq\u0000~"
+"\u0000Vpppppq\u0000~\u0000}ppppppppppppppppq\u0000~\u0000\u0006ppppppppq\u0000~\u0000%q\u0000~\u0000Bpq\u0000~\u0000Appp"
+"ppppq\u0000~\u0000vppq\u0000~\u0000@ppppppppppppppp"));
        }
        return new com.sun.msv.verifier.regexp.REDocumentDeclaration(schemaFragment);
    }

    public class Unmarshaller
        extends net.sourceforge.czt.core.jaxb.gen.impl.runtime.AbstractUnmarshallingEventHandlerImpl
    {


        public Unmarshaller(net.sourceforge.czt.core.jaxb.gen.impl.runtime.UnmarshallingContext context) {
            super(context, "-----------");
        }

        protected Unmarshaller(net.sourceforge.czt.core.jaxb.gen.impl.runtime.UnmarshallingContext context, int startState) {
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
                    case  9 :
                        attIdx = context.getAttribute("", "Box");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().enterElement(___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("Anns" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _AxPara.add(((net.sourceforge.czt.core.jaxb.gen.impl.AxParaImpl) spawnChildFromEnterElement((net.sourceforge.czt.core.jaxb.gen.impl.AxParaImpl.class), 10, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("DeclName" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _AxPara.add(((net.sourceforge.czt.core.jaxb.gen.impl.AxParaImpl) spawnChildFromEnterElement((net.sourceforge.czt.core.jaxb.gen.impl.AxParaImpl.class), 10, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("DeclName" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _AxPara.add(((net.sourceforge.czt.core.jaxb.gen.impl.AxParaImpl) spawnChildFromEnterElement((net.sourceforge.czt.core.jaxb.gen.impl.AxParaImpl.class), 10, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("SchText" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _AxPara.add(((net.sourceforge.czt.core.jaxb.gen.impl.AxParaImpl) spawnChildFromEnterElement((net.sourceforge.czt.core.jaxb.gen.impl.AxParaImpl.class), 10, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("SchText" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _AxPara.add(((net.sourceforge.czt.core.jaxb.gen.impl.AxParaImpl) spawnChildFromEnterElement((net.sourceforge.czt.core.jaxb.gen.impl.AxParaImpl.class), 10, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        _AxPara.add(((net.sourceforge.czt.core.jaxb.gen.impl.AxParaImpl) spawnChildFromEnterElement((net.sourceforge.czt.core.jaxb.gen.impl.AxParaImpl.class), 10, ___uri, ___local, ___qname, __atts)));
                        return ;
                    case  8 :
                        if (("FreePara" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 6;
                            return ;
                        }
                        if (("FreePara" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _FreePara.add(((net.sourceforge.czt.core.jaxb.gen.impl.FreeParaElementImpl) spawnChildFromEnterElement((net.sourceforge.czt.core.jaxb.gen.impl.FreeParaElementImpl.class), 8, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        revertToParentFromEnterElement(___uri, ___local, ___qname, __atts);
                        return ;
                    case  6 :
                        if (("Anns" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _FreePara.add(((net.sourceforge.czt.core.jaxb.gen.impl.FreeParaImpl) spawnChildFromEnterElement((net.sourceforge.czt.core.jaxb.gen.impl.FreeParaImpl.class), 7, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("Freetype" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _FreePara.add(((net.sourceforge.czt.core.jaxb.gen.impl.FreeParaImpl) spawnChildFromEnterElement((net.sourceforge.czt.core.jaxb.gen.impl.FreeParaImpl.class), 7, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("Freetype" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _FreePara.add(((net.sourceforge.czt.core.jaxb.gen.impl.FreeParaImpl) spawnChildFromEnterElement((net.sourceforge.czt.core.jaxb.gen.impl.FreeParaImpl.class), 7, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        _FreePara.add(((net.sourceforge.czt.core.jaxb.gen.impl.FreeParaImpl) spawnChildFromEnterElement((net.sourceforge.czt.core.jaxb.gen.impl.FreeParaImpl.class), 7, ___uri, ___local, ___qname, __atts)));
                        return ;
                    case  0 :
                        if (("Anns" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.core.jaxb.gen.impl.TermAImpl)net.sourceforge.czt.oz.jaxb.gen.impl.LocalDefImpl.this).new Unmarshaller(context)), 1, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        spawnHandlerFromEnterElement((((net.sourceforge.czt.core.jaxb.gen.impl.TermAImpl)net.sourceforge.czt.oz.jaxb.gen.impl.LocalDefImpl.this).new Unmarshaller(context)), 1, ___uri, ___local, ___qname, __atts);
                        return ;
                    case  1 :
                        if (("GivenPara" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 2;
                            return ;
                        }
                        if (("GivenPara" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _GivenPara.add(((net.sourceforge.czt.core.jaxb.gen.impl.GivenParaElementImpl) spawnChildFromEnterElement((net.sourceforge.czt.core.jaxb.gen.impl.GivenParaElementImpl.class), 4, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        state = 4;
                        continue outer;
                    case  5 :
                        if (("AxPara" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 9;
                            return ;
                        }
                        if (("AxPara" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _AxPara.add(((net.sourceforge.czt.core.jaxb.gen.impl.AxParaElementImpl) spawnChildFromEnterElement((net.sourceforge.czt.core.jaxb.gen.impl.AxParaElementImpl.class), 5, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("FreePara" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 6;
                            return ;
                        }
                        if (("FreePara" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _FreePara.add(((net.sourceforge.czt.core.jaxb.gen.impl.FreeParaElementImpl) spawnChildFromEnterElement((net.sourceforge.czt.core.jaxb.gen.impl.FreeParaElementImpl.class), 8, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        state = 8;
                        continue outer;
                    case  2 :
                        if (("Anns" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _GivenPara.add(((net.sourceforge.czt.core.jaxb.gen.impl.GivenParaImpl) spawnChildFromEnterElement((net.sourceforge.czt.core.jaxb.gen.impl.GivenParaImpl.class), 3, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("DeclName" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _GivenPara.add(((net.sourceforge.czt.core.jaxb.gen.impl.GivenParaImpl) spawnChildFromEnterElement((net.sourceforge.czt.core.jaxb.gen.impl.GivenParaImpl.class), 3, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("DeclName" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _GivenPara.add(((net.sourceforge.czt.core.jaxb.gen.impl.GivenParaImpl) spawnChildFromEnterElement((net.sourceforge.czt.core.jaxb.gen.impl.GivenParaImpl.class), 3, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        _GivenPara.add(((net.sourceforge.czt.core.jaxb.gen.impl.GivenParaImpl) spawnChildFromEnterElement((net.sourceforge.czt.core.jaxb.gen.impl.GivenParaImpl.class), 3, ___uri, ___local, ___qname, __atts)));
                        return ;
                    case  4 :
                        if (("GivenPara" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 2;
                            return ;
                        }
                        if (("GivenPara" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _GivenPara.add(((net.sourceforge.czt.core.jaxb.gen.impl.GivenParaElementImpl) spawnChildFromEnterElement((net.sourceforge.czt.core.jaxb.gen.impl.GivenParaElementImpl.class), 4, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("AxPara" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 9;
                            return ;
                        }
                        if (("AxPara" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _AxPara.add(((net.sourceforge.czt.core.jaxb.gen.impl.AxParaElementImpl) spawnChildFromEnterElement((net.sourceforge.czt.core.jaxb.gen.impl.AxParaElementImpl.class), 5, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        state = 5;
                        continue outer;
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
                    case  9 :
                        attIdx = context.getAttribute("", "Box");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveElement(___uri, ___local, ___qname);
                            return ;
                        }
                        _AxPara.add(((net.sourceforge.czt.core.jaxb.gen.impl.AxParaImpl) spawnChildFromLeaveElement((net.sourceforge.czt.core.jaxb.gen.impl.AxParaImpl.class), 10, ___uri, ___local, ___qname)));
                        return ;
                    case  8 :
                        revertToParentFromLeaveElement(___uri, ___local, ___qname);
                        return ;
                    case  6 :
                        _FreePara.add(((net.sourceforge.czt.core.jaxb.gen.impl.FreeParaImpl) spawnChildFromLeaveElement((net.sourceforge.czt.core.jaxb.gen.impl.FreeParaImpl.class), 7, ___uri, ___local, ___qname)));
                        return ;
                    case  3 :
                        if (("GivenPara" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            context.popAttributes();
                            state = 4;
                            return ;
                        }
                        break;
                    case  0 :
                        spawnHandlerFromLeaveElement((((net.sourceforge.czt.core.jaxb.gen.impl.TermAImpl)net.sourceforge.czt.oz.jaxb.gen.impl.LocalDefImpl.this).new Unmarshaller(context)), 1, ___uri, ___local, ___qname);
                        return ;
                    case  1 :
                        state = 4;
                        continue outer;
                    case  5 :
                        state = 8;
                        continue outer;
                    case  2 :
                        _GivenPara.add(((net.sourceforge.czt.core.jaxb.gen.impl.GivenParaImpl) spawnChildFromLeaveElement((net.sourceforge.czt.core.jaxb.gen.impl.GivenParaImpl.class), 3, ___uri, ___local, ___qname)));
                        return ;
                    case  7 :
                        if (("FreePara" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            context.popAttributes();
                            state = 8;
                            return ;
                        }
                        break;
                    case  4 :
                        state = 5;
                        continue outer;
                    case  10 :
                        if (("AxPara" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            context.popAttributes();
                            state = 5;
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
                    case  9 :
                        if (("Box" == ___local)&&("" == ___uri)) {
                            _AxPara.add(((net.sourceforge.czt.core.jaxb.gen.impl.AxParaImpl) spawnChildFromEnterAttribute((net.sourceforge.czt.core.jaxb.gen.impl.AxParaImpl.class), 10, ___uri, ___local, ___qname)));
                            return ;
                        }
                        _AxPara.add(((net.sourceforge.czt.core.jaxb.gen.impl.AxParaImpl) spawnChildFromEnterAttribute((net.sourceforge.czt.core.jaxb.gen.impl.AxParaImpl.class), 10, ___uri, ___local, ___qname)));
                        return ;
                    case  8 :
                        revertToParentFromEnterAttribute(___uri, ___local, ___qname);
                        return ;
                    case  6 :
                        _FreePara.add(((net.sourceforge.czt.core.jaxb.gen.impl.FreeParaImpl) spawnChildFromEnterAttribute((net.sourceforge.czt.core.jaxb.gen.impl.FreeParaImpl.class), 7, ___uri, ___local, ___qname)));
                        return ;
                    case  0 :
                        spawnHandlerFromEnterAttribute((((net.sourceforge.czt.core.jaxb.gen.impl.TermAImpl)net.sourceforge.czt.oz.jaxb.gen.impl.LocalDefImpl.this).new Unmarshaller(context)), 1, ___uri, ___local, ___qname);
                        return ;
                    case  1 :
                        state = 4;
                        continue outer;
                    case  5 :
                        state = 8;
                        continue outer;
                    case  2 :
                        _GivenPara.add(((net.sourceforge.czt.core.jaxb.gen.impl.GivenParaImpl) spawnChildFromEnterAttribute((net.sourceforge.czt.core.jaxb.gen.impl.GivenParaImpl.class), 3, ___uri, ___local, ___qname)));
                        return ;
                    case  4 :
                        state = 5;
                        continue outer;
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
                    case  9 :
                        attIdx = context.getAttribute("", "Box");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveAttribute(___uri, ___local, ___qname);
                            return ;
                        }
                        _AxPara.add(((net.sourceforge.czt.core.jaxb.gen.impl.AxParaImpl) spawnChildFromLeaveAttribute((net.sourceforge.czt.core.jaxb.gen.impl.AxParaImpl.class), 10, ___uri, ___local, ___qname)));
                        return ;
                    case  8 :
                        revertToParentFromLeaveAttribute(___uri, ___local, ___qname);
                        return ;
                    case  6 :
                        _FreePara.add(((net.sourceforge.czt.core.jaxb.gen.impl.FreeParaImpl) spawnChildFromLeaveAttribute((net.sourceforge.czt.core.jaxb.gen.impl.FreeParaImpl.class), 7, ___uri, ___local, ___qname)));
                        return ;
                    case  0 :
                        spawnHandlerFromLeaveAttribute((((net.sourceforge.czt.core.jaxb.gen.impl.TermAImpl)net.sourceforge.czt.oz.jaxb.gen.impl.LocalDefImpl.this).new Unmarshaller(context)), 1, ___uri, ___local, ___qname);
                        return ;
                    case  1 :
                        state = 4;
                        continue outer;
                    case  5 :
                        state = 8;
                        continue outer;
                    case  2 :
                        _GivenPara.add(((net.sourceforge.czt.core.jaxb.gen.impl.GivenParaImpl) spawnChildFromLeaveAttribute((net.sourceforge.czt.core.jaxb.gen.impl.GivenParaImpl.class), 3, ___uri, ___local, ___qname)));
                        return ;
                    case  4 :
                        state = 5;
                        continue outer;
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
                        case  9 :
                            attIdx = context.getAttribute("", "Box");
                            if (attIdx >= 0) {
                                context.consumeAttribute(attIdx);
                                context.getCurrentHandler().text(value);
                                return ;
                            }
                            _AxPara.add(((net.sourceforge.czt.core.jaxb.gen.impl.AxParaImpl) spawnChildFromText((net.sourceforge.czt.core.jaxb.gen.impl.AxParaImpl.class), 10, value)));
                            return ;
                        case  8 :
                            revertToParentFromText(value);
                            return ;
                        case  6 :
                            _FreePara.add(((net.sourceforge.czt.core.jaxb.gen.impl.FreeParaImpl) spawnChildFromText((net.sourceforge.czt.core.jaxb.gen.impl.FreeParaImpl.class), 7, value)));
                            return ;
                        case  0 :
                            spawnHandlerFromText((((net.sourceforge.czt.core.jaxb.gen.impl.TermAImpl)net.sourceforge.czt.oz.jaxb.gen.impl.LocalDefImpl.this).new Unmarshaller(context)), 1, value);
                            return ;
                        case  1 :
                            state = 4;
                            continue outer;
                        case  5 :
                            state = 8;
                            continue outer;
                        case  2 :
                            _GivenPara.add(((net.sourceforge.czt.core.jaxb.gen.impl.GivenParaImpl) spawnChildFromText((net.sourceforge.czt.core.jaxb.gen.impl.GivenParaImpl.class), 3, value)));
                            return ;
                        case  4 :
                            state = 5;
                            continue outer;
                    }
                } catch (java.lang.RuntimeException e) {
                    handleUnexpectedTextException(value, e);
                }
                break;
            }
        }

    }

}
