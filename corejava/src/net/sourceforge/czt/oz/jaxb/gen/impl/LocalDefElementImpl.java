//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.2-b15-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2003.12.09 at 10:30:14 NZDT 
//


package net.sourceforge.czt.oz.jaxb.gen.impl;

public class LocalDefElementImpl
    extends net.sourceforge.czt.oz.jaxb.gen.impl.LocalDefImpl
    implements net.sourceforge.czt.oz.jaxb.gen.LocalDefElement, com.sun.xml.bind.RIElement, com.sun.xml.bind.JAXBObject, net.sourceforge.czt.oz.jaxb.gen.impl.runtime.UnmarshallableObject, net.sourceforge.czt.oz.jaxb.gen.impl.runtime.XMLSerializable, net.sourceforge.czt.oz.jaxb.gen.impl.runtime.ValidatableObject
{

    public final static java.lang.Class version = (net.sourceforge.czt.oz.jaxb.gen.impl.JAXBVersion.class);
    private static com.sun.msv.grammar.Grammar schemaFragment;

    private final static java.lang.Class PRIMARY_INTERFACE_CLASS() {
        return (net.sourceforge.czt.oz.jaxb.gen.LocalDefElement.class);
    }

    public java.lang.String ____jaxb_ri____getNamespaceURI() {
        return "http://czt.sourceforge.net/object-z";
    }

    public java.lang.String ____jaxb_ri____getLocalName() {
        return "LocalDef";
    }

    public net.sourceforge.czt.oz.jaxb.gen.impl.runtime.UnmarshallingEventHandler createUnmarshaller(net.sourceforge.czt.oz.jaxb.gen.impl.runtime.UnmarshallingContext context) {
        return new net.sourceforge.czt.oz.jaxb.gen.impl.LocalDefElementImpl.Unmarshaller(context);
    }

    public void serializeBody(net.sourceforge.czt.oz.jaxb.gen.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        context.startElement("http://czt.sourceforge.net/object-z", "LocalDef");
        super.serializeURIs(context);
        context.endNamespaceDecls();
        super.serializeAttributes(context);
        context.endAttributes();
        super.serializeBody(context);
        context.endElement();
    }

    public void serializeAttributes(net.sourceforge.czt.oz.jaxb.gen.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
    }

    public void serializeURIs(net.sourceforge.czt.oz.jaxb.gen.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
    }

    public java.lang.Class getPrimaryInterface() {
        return (net.sourceforge.czt.oz.jaxb.gen.LocalDefElement.class);
    }

    public com.sun.msv.verifier.DocumentDeclaration createRawValidator() {
        if (schemaFragment == null) {
            schemaFragment = com.sun.xml.bind.validator.SchemaDeserializer.deserialize((
 "\u00ac\u00ed\u0000\u0005sr\u0000\'com.sun.msv.grammar.trex.ElementPattern\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000"
+"\tnameClasst\u0000\u001fLcom/sun/msv/grammar/NameClass;xr\u0000\u001ecom.sun.msv."
+"grammar.ElementExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002Z\u0000\u001aignoreUndeclaredAttributesL\u0000"
+"\fcontentModelt\u0000 Lcom/sun/msv/grammar/Expression;xr\u0000\u001ecom.sun."
+"msv.grammar.Expression\u00f8\u0018\u0082\u00e8N5~O\u0002\u0000\u0003I\u0000\u000ecachedHashCodeL\u0000\u0013epsilon"
+"Reducibilityt\u0000\u0013Ljava/lang/Boolean;L\u0000\u000bexpandedExpq\u0000~\u0000\u0003xp\u000fN\u00d0\u00a0p"
+"p\u0000sr\u0000\u001fcom.sun.msv.grammar.SequenceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun."
+"msv.grammar.BinaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0004exp1q\u0000~\u0000\u0003L\u0000\u0004exp2q\u0000~\u0000\u0003xq\u0000~"
+"\u0000\u0004\u000fN\u00d0\u0095ppsq\u0000~\u0000\u0007\f\u00c3\u0085~ppsq\u0000~\u0000\u0007\tLOjppsq\u0000~\u0000\u0007\u0006}\u00f4\u00feppsr\u0000\u001dcom.sun.msv."
+"grammar.ChoiceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\b\u0002\u00f9\u00ed\u008cppsq\u0000~\u0000\u0000\u0002\u00f9\u00ed\u0081sr\u0000\u0011java.l"
+"ang.Boolean\u00cd r\u0080\u00d5\u009c\u00fa\u00ee\u0002\u0000\u0001Z\u0000\u0005valuexp\u0000p\u0000sq\u0000~\u0000\u0007\u0002\u00f9\u00edvppsq\u0000~\u0000\u0000\u0000\u008d\u00cd\u007fpp\u0000"
+"sq\u0000~\u0000\r\u0000\u008d\u00cdtppsr\u0000 com.sun.msv.grammar.OneOrMoreExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000x"
+"r\u0000\u001ccom.sun.msv.grammar.UnaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\u0003expq\u0000~\u0000\u0003xq\u0000~\u0000\u0004\u0000"
+"\u008d\u00cdiq\u0000~\u0000\u0011psr\u0000 com.sun.msv.grammar.AttributeExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003e"
+"xpq\u0000~\u0000\u0003L\u0000\tnameClassq\u0000~\u0000\u0001xq\u0000~\u0000\u0004\u0000\u008d\u00cdfq\u0000~\u0000\u0011psr\u00002com.sun.msv.gram"
+"mar.Expression$AnyStringExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004\u0000\u0000\u0000\bsq\u0000~\u0000"
+"\u0010\u0001q\u0000~\u0000\u001bsr\u0000 com.sun.msv.grammar.AnyNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dco"
+"m.sun.msv.grammar.NameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com.sun.msv.gram"
+"mar.Expression$EpsilonExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004\u0000\u0000\u0000\tq\u0000~\u0000\u001cq\u0000"
+"~\u0000!sr\u0000#com.sun.msv.grammar.SimpleNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\tloca"
+"lNamet\u0000\u0012Ljava/lang/String;L\u0000\fnamespaceURIq\u0000~\u0000#xq\u0000~\u0000\u001et\u0000-net.s"
+"ourceforge.czt.z.jaxb.gen.TermA.AnnsTypet\u0000+http://java.sun.c"
+"om/jaxb/xjc/dummy-elementssq\u0000~\u0000\r\u0002l\u001f\u00f2ppsq\u0000~\u0000\u0018\u0002l\u001f\u00e7q\u0000~\u0000\u0011psr\u0000\u001bco"
+"m.sun.msv.grammar.DataExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\u0002dtt\u0000\u001fLorg/relaxng/dat"
+"atype/Datatype;L\u0000\u0006exceptq\u0000~\u0000\u0003L\u0000\u0004namet\u0000\u001dLcom/sun/msv/util/Str"
+"ingPair;xq\u0000~\u0000\u0004\u0001s.\u00e2ppsr\u0000\"com.sun.msv.datatype.xsd.QnameType\u0000\u0000"
+"\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000*com.sun.msv.datatype.xsd.BuiltinAtomicType\u0000\u0000\u0000\u0000\u0000"
+"\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000%com.sun.msv.datatype.xsd.ConcreteType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr"
+"\u0000\'com.sun.msv.datatype.xsd.XSDatatypeImpl\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\fnames"
+"paceUriq\u0000~\u0000#L\u0000\btypeNameq\u0000~\u0000#L\u0000\nwhiteSpacet\u0000.Lcom/sun/msv/dat"
+"atype/xsd/WhiteSpaceProcessor;xpt\u0000 http://www.w3.org/2001/XM"
+"LSchemat\u0000\u0005QNamesr\u00005com.sun.msv.datatype.xsd.WhiteSpaceProces"
+"sor$Collapse\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000,com.sun.msv.datatype.xsd.WhiteSpa"
+"ceProcessor\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com.sun.msv.grammar.Expression$N"
+"ullSetExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004\u0000\u0000\u0000\nq\u0000~\u0000\u0011psr\u0000\u001bcom.sun.msv.u"
+"til.StringPair\u00d0t\u001ejB\u008f\u008d\u00a0\u0002\u0000\u0002L\u0000\tlocalNameq\u0000~\u0000#L\u0000\fnamespaceURIq\u0000~"
+"\u0000#xpq\u0000~\u00004q\u0000~\u00003sq\u0000~\u0000\"t\u0000\u0004typet\u0000)http://www.w3.org/2001/XMLSche"
+"ma-instanceq\u0000~\u0000!sq\u0000~\u0000\"t\u0000\u0004Annst\u0000\u001ehttp://czt.sourceforge.net/z"
+"mlq\u0000~\u0000!sq\u0000~\u0000\r\u0003\u0084\u0007mppsq\u0000~\u0000\u0015\u0003\u0084\u0007bq\u0000~\u0000\u0011psq\u0000~\u0000\r\u0003\u0084\u0007_q\u0000~\u0000\u0011psq\u0000~\u0000\u0000\u0000\u008d\u00cd"
+"\u007fq\u0000~\u0000\u0011p\u0000sq\u0000~\u0000\r\u0000\u008d\u00cdtppsq\u0000~\u0000\u0015\u0000\u008d\u00cdiq\u0000~\u0000\u0011psq\u0000~\u0000\u0018\u0000\u008d\u00cdfq\u0000~\u0000\u0011pq\u0000~\u0000\u001bq\u0000~"
+"\u0000\u001fq\u0000~\u0000!sq\u0000~\u0000\"t\u0000/net.sourceforge.czt.z.jaxb.gen.GivenParaElem"
+"entq\u0000~\u0000&sq\u0000~\u0000\u0000\u0002\u00f69\u00deq\u0000~\u0000\u0011p\u0000sq\u0000~\u0000\u0007\u0002\u00f69\u00d3ppsq\u0000~\u0000\u0000\u0000\u008d\u00cd\u007fpp\u0000sq\u0000~\u0000\r\u0000\u008d\u00cdt"
+"ppsq\u0000~\u0000\u0015\u0000\u008d\u00cdiq\u0000~\u0000\u0011psq\u0000~\u0000\u0018\u0000\u008d\u00cdfq\u0000~\u0000\u0011pq\u0000~\u0000\u001bq\u0000~\u0000\u001fq\u0000~\u0000!sq\u0000~\u0000\"t\u0000(ne"
+"t.sourceforge.czt.z.jaxb.gen.GivenParaq\u0000~\u0000&sq\u0000~\u0000\r\u0002hlOppsq\u0000~\u0000"
+"\u0018\u0002hlDq\u0000~\u0000\u0011pq\u0000~\u0000,sq\u0000~\u0000\"q\u0000~\u0000=q\u0000~\u0000>q\u0000~\u0000!sq\u0000~\u0000\"t\u0000\tGivenParaq\u0000~\u0000A"
+"q\u0000~\u0000!sq\u0000~\u0000\r\u0002\u00ceZgppsq\u0000~\u0000\u0015\u0002\u00ceZ\\q\u0000~\u0000\u0011psq\u0000~\u0000\r\u0002\u00ceZYq\u0000~\u0000\u0011psq\u0000~\u0000\u0000\u0000\u008d\u00cd\u007fq"
+"\u0000~\u0000\u0011p\u0000sq\u0000~\u0000\r\u0000\u008d\u00cdtppsq\u0000~\u0000\u0015\u0000\u008d\u00cdiq\u0000~\u0000\u0011psq\u0000~\u0000\u0018\u0000\u008d\u00cdfq\u0000~\u0000\u0011pq\u0000~\u0000\u001bq\u0000~\u0000\u001f"
+"q\u0000~\u0000!sq\u0000~\u0000\"t\u0000,net.sourceforge.czt.z.jaxb.gen.AxParaElementq\u0000"
+"~\u0000&sq\u0000~\u0000\u0000\u0002@\u008c\u00d8q\u0000~\u0000\u0011p\u0000sq\u0000~\u0000\u0007\u0002@\u008c\u00cdppsq\u0000~\u0000\u0000\u0000\u008d\u00cd\u007fpp\u0000sq\u0000~\u0000\r\u0000\u008d\u00cdtppsq\u0000"
+"~\u0000\u0015\u0000\u008d\u00cdiq\u0000~\u0000\u0011psq\u0000~\u0000\u0018\u0000\u008d\u00cdfq\u0000~\u0000\u0011pq\u0000~\u0000\u001bq\u0000~\u0000\u001fq\u0000~\u0000!sq\u0000~\u0000\"t\u0000%net.sou"
+"rceforge.czt.z.jaxb.gen.AxParaq\u0000~\u0000&sq\u0000~\u0000\r\u0001\u00b2\u00bfIppsq\u0000~\u0000\u0018\u0001\u00b2\u00bf>q\u0000~"
+"\u0000\u0011pq\u0000~\u0000,sq\u0000~\u0000\"q\u0000~\u0000=q\u0000~\u0000>q\u0000~\u0000!sq\u0000~\u0000\"t\u0000\u0006AxParaq\u0000~\u0000Aq\u0000~\u0000!sq\u0000~\u0000\r"
+"\u0003w6\u000fppsq\u0000~\u0000\u0015\u0003w6\u0004q\u0000~\u0000\u0011psq\u0000~\u0000\r\u0003w6\u0001q\u0000~\u0000\u0011psq\u0000~\u0000\u0000\u0000\u008d\u00cd\u007fq\u0000~\u0000\u0011p\u0000sq\u0000~\u0000"
+"\r\u0000\u008d\u00cdtppsq\u0000~\u0000\u0015\u0000\u008d\u00cdiq\u0000~\u0000\u0011psq\u0000~\u0000\u0018\u0000\u008d\u00cdfq\u0000~\u0000\u0011pq\u0000~\u0000\u001bq\u0000~\u0000\u001fq\u0000~\u0000!sq\u0000~\u0000\""
+"t\u0000.net.sourceforge.czt.z.jaxb.gen.FreeParaElementq\u0000~\u0000&sq\u0000~\u0000\u0000"
+"\u0002\u00e9h\u0080q\u0000~\u0000\u0011p\u0000sq\u0000~\u0000\u0007\u0002\u00e9huppsq\u0000~\u0000\u0000\u0000\u008d\u00cd\u007fpp\u0000sq\u0000~\u0000\r\u0000\u008d\u00cdtppsq\u0000~\u0000\u0015\u0000\u008d\u00cdiq\u0000"
+"~\u0000\u0011psq\u0000~\u0000\u0018\u0000\u008d\u00cdfq\u0000~\u0000\u0011pq\u0000~\u0000\u001bq\u0000~\u0000\u001fq\u0000~\u0000!sq\u0000~\u0000\"t\u0000\'net.sourceforge."
+"czt.z.jaxb.gen.FreeParaq\u0000~\u0000&sq\u0000~\u0000\r\u0002[\u009a\u00f1ppsq\u0000~\u0000\u0018\u0002[\u009a\u00e6q\u0000~\u0000\u0011pq\u0000~\u0000"
+",sq\u0000~\u0000\"q\u0000~\u0000=q\u0000~\u0000>q\u0000~\u0000!sq\u0000~\u0000\"t\u0000\bFreeParaq\u0000~\u0000Aq\u0000~\u0000!sq\u0000~\u0000\r\u0002\u008bK\u0012p"
+"psq\u0000~\u0000\u0018\u0002\u008bK\u0007q\u0000~\u0000\u0011pq\u0000~\u0000,sq\u0000~\u0000\"q\u0000~\u0000=q\u0000~\u0000>q\u0000~\u0000!sq\u0000~\u0000\"t\u0000\bLocalDef"
+"t\u0000#http://czt.sourceforge.net/object-zsr\u0000\"com.sun.msv.gramma"
+"r.ExpressionPool\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\bexpTablet\u0000/Lcom/sun/msv/gramma"
+"r/ExpressionPool$ClosedHash;xpsr\u0000-com.sun.msv.grammar.Expres"
+"sionPool$ClosedHash\u00d7j\u00d0N\u00ef\u00e8\u00ed\u001c\u0002\u0000\u0004I\u0000\u0005countI\u0000\tthresholdL\u0000\u0006parentq"
+"\u0000~\u0000\u008b[\u0000\u0005tablet\u0000![Lcom/sun/msv/grammar/Expression;xp\u0000\u0000\u0000%\u0000\u0000\u00009pu"
+"r\u0000![Lcom.sun.msv.grammar.Expression;\u00d68D\u00c3]\u00ad\u00a7\n\u0002\u0000\u0000xp\u0000\u0000\u0000\u00bfppq\u0000~\u0000\u0084"
+"ppq\u0000~\u0000\u000epq\u0000~\u0000\u000bpppppppq\u0000~\u0000bpppppppppppppppppppppq\u0000~\u0000pppq\u0000~\u0000opp"
+"ppppppq\u0000~\u0000Dpq\u0000~\u0000nq\u0000~\u0000Cpq\u0000~\u0000\u007fpq\u0000~\u0000\u0017q\u0000~\u0000Gq\u0000~\u0000Oq\u0000~\u0000]q\u0000~\u0000eq\u0000~\u0000sq"
+"\u0000~\u0000{q\u0000~\u0000Bq\u0000~\u0000\npq\u0000~\u0000Sq\u0000~\u0000\u0014q\u0000~\u0000Fq\u0000~\u0000Nq\u0000~\u0000\\q\u0000~\u0000dq\u0000~\u0000rq\u0000~\u0000\fq\u0000~\u0000z"
+"q\u0000~\u0000\tpppppppppppppppq\u0000~\u0000\'ppppppppppppppq\u0000~\u0000Zppq\u0000~\u0000Yppppppppp"
+"pq\u0000~\u0000Xppq\u0000~\u0000ipppppppppppppq\u0000~\u0000xpppppppppppq\u0000~\u0000Lppppppppppppp"
+"pppppppppppq\u0000~\u0000\u0012pppppppppppppppp"));
        }
        return new com.sun.msv.verifier.regexp.REDocumentDeclaration(schemaFragment);
    }

    public class Unmarshaller
        extends net.sourceforge.czt.oz.jaxb.gen.impl.runtime.AbstractUnmarshallingEventHandlerImpl
    {


        public Unmarshaller(net.sourceforge.czt.oz.jaxb.gen.impl.runtime.UnmarshallingContext context) {
            super(context, "----");
        }

        protected Unmarshaller(net.sourceforge.czt.oz.jaxb.gen.impl.runtime.UnmarshallingContext context, int startState) {
            this(context);
            state = startState;
        }

        public java.lang.Object owner() {
            return net.sourceforge.czt.oz.jaxb.gen.impl.LocalDefElementImpl.this;
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
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.oz.jaxb.gen.impl.LocalDefImpl)net.sourceforge.czt.oz.jaxb.gen.impl.LocalDefElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("GivenPara" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.oz.jaxb.gen.impl.LocalDefImpl)net.sourceforge.czt.oz.jaxb.gen.impl.LocalDefElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("GivenPara" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.oz.jaxb.gen.impl.LocalDefImpl)net.sourceforge.czt.oz.jaxb.gen.impl.LocalDefElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("AxPara" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.oz.jaxb.gen.impl.LocalDefImpl)net.sourceforge.czt.oz.jaxb.gen.impl.LocalDefElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("AxPara" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.oz.jaxb.gen.impl.LocalDefImpl)net.sourceforge.czt.oz.jaxb.gen.impl.LocalDefElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("FreePara" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.oz.jaxb.gen.impl.LocalDefImpl)net.sourceforge.czt.oz.jaxb.gen.impl.LocalDefElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("FreePara" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.oz.jaxb.gen.impl.LocalDefImpl)net.sourceforge.czt.oz.jaxb.gen.impl.LocalDefElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        spawnHandlerFromEnterElement((((net.sourceforge.czt.oz.jaxb.gen.impl.LocalDefImpl)net.sourceforge.czt.oz.jaxb.gen.impl.LocalDefElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                        return ;
                    case  0 :
                        if (("LocalDef" == ___local)&&("http://czt.sourceforge.net/object-z" == ___uri)) {
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
                    case  3 :
                        revertToParentFromLeaveElement(___uri, ___local, ___qname);
                        return ;
                    case  2 :
                        if (("LocalDef" == ___local)&&("http://czt.sourceforge.net/object-z" == ___uri)) {
                            context.popAttributes();
                            state = 3;
                            return ;
                        }
                        break;
                    case  1 :
                        spawnHandlerFromLeaveElement((((net.sourceforge.czt.oz.jaxb.gen.impl.LocalDefImpl)net.sourceforge.czt.oz.jaxb.gen.impl.LocalDefElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
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
                        spawnHandlerFromEnterAttribute((((net.sourceforge.czt.oz.jaxb.gen.impl.LocalDefImpl)net.sourceforge.czt.oz.jaxb.gen.impl.LocalDefElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
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
                        spawnHandlerFromLeaveAttribute((((net.sourceforge.czt.oz.jaxb.gen.impl.LocalDefImpl)net.sourceforge.czt.oz.jaxb.gen.impl.LocalDefElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
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
                            spawnHandlerFromText((((net.sourceforge.czt.oz.jaxb.gen.impl.LocalDefImpl)net.sourceforge.czt.oz.jaxb.gen.impl.LocalDefElementImpl.this).new Unmarshaller(context)), 2, value);
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
