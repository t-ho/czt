//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.2-b15-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2003.10.28 at 04:14:13 NZDT 
//


package net.sourceforge.czt.oz.jaxb.gen.impl;

public class LocalDefElementImpl
    extends net.sourceforge.czt.oz.jaxb.gen.impl.LocalDefImpl
    implements net.sourceforge.czt.oz.jaxb.gen.LocalDefElement, com.sun.xml.bind.RIElement, com.sun.xml.bind.JAXBObject, net.sourceforge.czt.core.jaxb.gen.impl.runtime.UnmarshallableObject, net.sourceforge.czt.core.jaxb.gen.impl.runtime.XMLSerializable, net.sourceforge.czt.core.jaxb.gen.impl.runtime.ValidatableObject
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

    public net.sourceforge.czt.core.jaxb.gen.impl.runtime.UnmarshallingEventHandler createUnmarshaller(net.sourceforge.czt.core.jaxb.gen.impl.runtime.UnmarshallingContext context) {
        return new net.sourceforge.czt.oz.jaxb.gen.impl.LocalDefElementImpl.Unmarshaller(context);
    }

    public void serializeBody(net.sourceforge.czt.core.jaxb.gen.impl.runtime.XMLSerializer context)
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

    public void serializeAttributes(net.sourceforge.czt.core.jaxb.gen.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
    }

    public void serializeURIs(net.sourceforge.czt.core.jaxb.gen.impl.runtime.XMLSerializer context)
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
+"Reducibilityt\u0000\u0013Ljava/lang/Boolean;L\u0000\u000bexpandedExpq\u0000~\u0000\u0003xp\u000e\u009d[\u00f6p"
+"p\u0000sr\u0000\u001fcom.sun.msv.grammar.SequenceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun."
+"msv.grammar.BinaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0004exp1q\u0000~\u0000\u0003L\u0000\u0004exp2q\u0000~\u0000\u0003xq\u0000~"
+"\u0000\u0004\u000e\u009d[\u00ebppsq\u0000~\u0000\u0007\f\u00f1\u00d7\u00afppsq\u0000~\u0000\u0007\n#\u00c3\u00b5ppsq\u0000~\u0000\u0007\u0007\u001e\u0080\u00d8ppsr\u0000\u001dcom.sun.msv."
+"grammar.ChoiceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\b\u0003\u0013\u0007\u00bfppsq\u0000~\u0000\u0000\u0003\u0013\u0007\u00b4sr\u0000\u0011java.l"
+"ang.Boolean\u00cd r\u0080\u00d5\u009c\u00fa\u00ee\u0002\u0000\u0001Z\u0000\u0005valuexp\u0000p\u0000sq\u0000~\u0000\u0007\u0003\u0013\u0007\u00a9ppsq\u0000~\u0000\u0000\u0000{G%pp\u0000"
+"sq\u0000~\u0000\r\u0000{G\u001appsr\u0000 com.sun.msv.grammar.OneOrMoreExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000x"
+"r\u0000\u001ccom.sun.msv.grammar.UnaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\u0003expq\u0000~\u0000\u0003xq\u0000~\u0000\u0004\u0000"
+"{G\u000fq\u0000~\u0000\u0011psr\u0000 com.sun.msv.grammar.AttributeExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003e"
+"xpq\u0000~\u0000\u0003L\u0000\tnameClassq\u0000~\u0000\u0001xq\u0000~\u0000\u0004\u0000{G\fq\u0000~\u0000\u0011psr\u00002com.sun.msv.gram"
+"mar.Expression$AnyStringExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004\u0000\u0000\u0000\bsq\u0000~\u0000"
+"\u0010\u0001q\u0000~\u0000\u001bsr\u0000 com.sun.msv.grammar.AnyNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dco"
+"m.sun.msv.grammar.NameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com.sun.msv.gram"
+"mar.Expression$EpsilonExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004\u0000\u0000\u0000\tq\u0000~\u0000\u001cq\u0000"
+"~\u0000!sr\u0000#com.sun.msv.grammar.SimpleNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\tloca"
+"lNamet\u0000\u0012Ljava/lang/String;L\u0000\fnamespaceURIq\u0000~\u0000#xq\u0000~\u0000\u001et\u00000net.s"
+"ourceforge.czt.core.jaxb.gen.TermA.AnnsTypet\u0000+http://java.su"
+"n.com/jaxb/xjc/dummy-elementssq\u0000~\u0000\r\u0002\u0097\u00c0\u007fppsq\u0000~\u0000\u0018\u0002\u0097\u00c0tq\u0000~\u0000\u0011psr\u0000"
+"\u001bcom.sun.msv.grammar.DataExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\u0002dtt\u0000\u001fLorg/relaxng/"
+"datatype/Datatype;L\u0000\u0006exceptq\u0000~\u0000\u0003L\u0000\u0004namet\u0000\u001dLcom/sun/msv/util/"
+"StringPair;xq\u0000~\u0000\u0004\u0001d\u00b9\u00c6ppsr\u0000\"com.sun.msv.datatype.xsd.QnameTyp"
+"e\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000*com.sun.msv.datatype.xsd.BuiltinAtomicType\u0000\u0000"
+"\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000%com.sun.msv.datatype.xsd.ConcreteType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000"
+"\u0000xr\u0000\'com.sun.msv.datatype.xsd.XSDatatypeImpl\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\fna"
+"mespaceUriq\u0000~\u0000#L\u0000\btypeNameq\u0000~\u0000#L\u0000\nwhiteSpacet\u0000.Lcom/sun/msv/"
+"datatype/xsd/WhiteSpaceProcessor;xpt\u0000 http://www.w3.org/2001"
+"/XMLSchemat\u0000\u0005QNamesr\u00005com.sun.msv.datatype.xsd.WhiteSpacePro"
+"cessor$Collapse\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000,com.sun.msv.datatype.xsd.White"
+"SpaceProcessor\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com.sun.msv.grammar.Expressio"
+"n$NullSetExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004\u0000\u0000\u0000\nq\u0000~\u0000\u0011psr\u0000\u001bcom.sun.ms"
+"v.util.StringPair\u00d0t\u001ejB\u008f\u008d\u00a0\u0002\u0000\u0002L\u0000\tlocalNameq\u0000~\u0000#L\u0000\fnamespaceURI"
+"q\u0000~\u0000#xpq\u0000~\u00004q\u0000~\u00003sq\u0000~\u0000\"t\u0000\u0004typet\u0000)http://www.w3.org/2001/XMLS"
+"chema-instanceq\u0000~\u0000!sq\u0000~\u0000\"t\u0000\u0004Annst\u0000\u001ehttp://czt.sourceforge.ne"
+"t/zmlq\u0000~\u0000!sq\u0000~\u0000\r\u0004\u000by\u0014ppsq\u0000~\u0000\u0015\u0004\u000by\tq\u0000~\u0000\u0011psq\u0000~\u0000\r\u0004\u000by\u0006q\u0000~\u0000\u0011psq\u0000~\u0000\u0000"
+"\u0000{G%q\u0000~\u0000\u0011p\u0000sq\u0000~\u0000\r\u0000{G\u001appsq\u0000~\u0000\u0015\u0000{G\u000fq\u0000~\u0000\u0011psq\u0000~\u0000\u0018\u0000{G\fq\u0000~\u0000\u0011pq\u0000~\u0000\u001b"
+"q\u0000~\u0000\u001fq\u0000~\u0000!sq\u0000~\u0000\"t\u00002net.sourceforge.czt.core.jaxb.gen.GivenPa"
+"raElementq\u0000~\u0000&sq\u0000~\u0000\u0000\u0003\u00901\u00dfq\u0000~\u0000\u0011p\u0000sq\u0000~\u0000\u0007\u0003\u00901\u00d4ppsq\u0000~\u0000\u0000\u0000{G%pp\u0000sq\u0000~"
+"\u0000\r\u0000{G\u001appsq\u0000~\u0000\u0015\u0000{G\u000fq\u0000~\u0000\u0011psq\u0000~\u0000\u0018\u0000{G\fq\u0000~\u0000\u0011pq\u0000~\u0000\u001bq\u0000~\u0000\u001fq\u0000~\u0000!sq\u0000~\u0000"
+"\"t\u0000+net.sourceforge.czt.core.jaxb.gen.GivenParaq\u0000~\u0000&sq\u0000~\u0000\r\u0003\u0014"
+"\u00ea\u00aappsq\u0000~\u0000\u0018\u0003\u0014\u00ea\u009fq\u0000~\u0000\u0011pq\u0000~\u0000,sq\u0000~\u0000\"q\u0000~\u0000=q\u0000~\u0000>q\u0000~\u0000!sq\u0000~\u0000\"t\u0000\tGiven"
+"Paraq\u0000~\u0000Aq\u0000~\u0000!sq\u0000~\u0000\r\u0003\u0005B\u00d8ppsq\u0000~\u0000\u0015\u0003\u0005B\u00cdq\u0000~\u0000\u0011psq\u0000~\u0000\r\u0003\u0005B\u00caq\u0000~\u0000\u0011psq"
+"\u0000~\u0000\u0000\u0000{G%q\u0000~\u0000\u0011p\u0000sq\u0000~\u0000\r\u0000{G\u001appsq\u0000~\u0000\u0015\u0000{G\u000fq\u0000~\u0000\u0011psq\u0000~\u0000\u0018\u0000{G\fq\u0000~\u0000\u0011pq"
+"\u0000~\u0000\u001bq\u0000~\u0000\u001fq\u0000~\u0000!sq\u0000~\u0000\"t\u0000/net.sourceforge.czt.core.jaxb.gen.AxP"
+"araElementq\u0000~\u0000&sq\u0000~\u0000\u0000\u0002\u0089\u00fb\u00a3q\u0000~\u0000\u0011p\u0000sq\u0000~\u0000\u0007\u0002\u0089\u00fb\u0098ppsq\u0000~\u0000\u0000\u0000{G%pp\u0000sq\u0000"
+"~\u0000\r\u0000{G\u001appsq\u0000~\u0000\u0015\u0000{G\u000fq\u0000~\u0000\u0011psq\u0000~\u0000\u0018\u0000{G\fq\u0000~\u0000\u0011pq\u0000~\u0000\u001bq\u0000~\u0000\u001fq\u0000~\u0000!sq\u0000~"
+"\u0000\"t\u0000(net.sourceforge.czt.core.jaxb.gen.AxParaq\u0000~\u0000&sq\u0000~\u0000\r\u0002\u000e\u00b4n"
+"ppsq\u0000~\u0000\u0018\u0002\u000e\u00b4cq\u0000~\u0000\u0011pq\u0000~\u0000,sq\u0000~\u0000\"q\u0000~\u0000=q\u0000~\u0000>q\u0000~\u0000!sq\u0000~\u0000\"t\u0000\u0006AxParaq"
+"\u0000~\u0000Aq\u0000~\u0000!sq\u0000~\u0000\r\u0002\u00ce\u0013\u00f5ppsq\u0000~\u0000\u0015\u0002\u00ce\u0013\u00eaq\u0000~\u0000\u0011psq\u0000~\u0000\r\u0002\u00ce\u0013\u00e7q\u0000~\u0000\u0011psq\u0000~\u0000\u0000\u0000"
+"{G%q\u0000~\u0000\u0011p\u0000sq\u0000~\u0000\r\u0000{G\u001appsq\u0000~\u0000\u0015\u0000{G\u000fq\u0000~\u0000\u0011psq\u0000~\u0000\u0018\u0000{G\fq\u0000~\u0000\u0011pq\u0000~\u0000\u001bq"
+"\u0000~\u0000\u001fq\u0000~\u0000!sq\u0000~\u0000\"t\u00001net.sourceforge.czt.core.jaxb.gen.FreePara"
+"Elementq\u0000~\u0000&sq\u0000~\u0000\u0000\u0002R\u00cc\u00c0q\u0000~\u0000\u0011p\u0000sq\u0000~\u0000\u0007\u0002R\u00cc\u00b5ppsq\u0000~\u0000\u0000\u0000{G%pp\u0000sq\u0000~\u0000\r"
+"\u0000{G\u001appsq\u0000~\u0000\u0015\u0000{G\u000fq\u0000~\u0000\u0011psq\u0000~\u0000\u0018\u0000{G\fq\u0000~\u0000\u0011pq\u0000~\u0000\u001bq\u0000~\u0000\u001fq\u0000~\u0000!sq\u0000~\u0000\"t"
+"\u0000*net.sourceforge.czt.core.jaxb.gen.FreeParaq\u0000~\u0000&sq\u0000~\u0000\r\u0001\u00d7\u0085\u008bp"
+"psq\u0000~\u0000\u0018\u0001\u00d7\u0085\u0080q\u0000~\u0000\u0011pq\u0000~\u0000,sq\u0000~\u0000\"q\u0000~\u0000=q\u0000~\u0000>q\u0000~\u0000!sq\u0000~\u0000\"t\u0000\bFreePara"
+"q\u0000~\u0000Aq\u0000~\u0000!sq\u0000~\u0000\r\u0001\u00ab\u00847ppsq\u0000~\u0000\u0018\u0001\u00ab\u0084,q\u0000~\u0000\u0011pq\u0000~\u0000,sq\u0000~\u0000\"q\u0000~\u0000=q\u0000~\u0000>q"
+"\u0000~\u0000!sq\u0000~\u0000\"t\u0000\bLocalDeft\u0000#http://czt.sourceforge.net/object-zs"
+"r\u0000\"com.sun.msv.grammar.ExpressionPool\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\bexpTablet"
+"\u0000/Lcom/sun/msv/grammar/ExpressionPool$ClosedHash;xpsr\u0000-com.s"
+"un.msv.grammar.ExpressionPool$ClosedHash\u00d7j\u00d0N\u00ef\u00e8\u00ed\u001c\u0002\u0000\u0004I\u0000\u0005countI"
+"\u0000\tthresholdL\u0000\u0006parentq\u0000~\u0000\u008b[\u0000\u0005tablet\u0000![Lcom/sun/msv/grammar/Ex"
+"pression;xp\u0000\u0000\u0000%\u0000\u0000\u00009pur\u0000![Lcom.sun.msv.grammar.Expression;\u00d68D"
+"\u00c3]\u00ad\u00a7\n\u0002\u0000\u0000xp\u0000\u0000\u0000\u00bfppppppq\u0000~\u0000\nq\u0000~\u0000\u0012ppq\u0000~\u0000\u0017q\u0000~\u0000Gq\u0000~\u0000Oq\u0000~\u0000]q\u0000~\u0000eq\u0000~"
+"\u0000sq\u0000~\u0000{pq\u0000~\u0000\fppq\u0000~\u0000\u0014q\u0000~\u0000Fq\u0000~\u0000Nq\u0000~\u0000\\q\u0000~\u0000dq\u0000~\u0000rq\u0000~\u0000zq\u0000~\u0000pq\u0000~\u0000\u000e"
+"q\u0000~\u0000oppq\u0000~\u0000ippppppq\u0000~\u0000npppppppppppppppppppppppppppppq\u0000~\u0000bppp"
+"pppppq\u0000~\u0000Spppppppppppppppppppppppppppppppppppq\u0000~\u0000Zq\u0000~\u0000Lpq\u0000~\u0000"
+"Ypq\u0000~\u0000\u0084ppppppppq\u0000~\u0000Xpq\u0000~\u0000\tpppq\u0000~\u0000\u007fppppppppppppppppq\u0000~\u0000\u000bppppp"
+"pppq\u0000~\u0000\'q\u0000~\u0000Dpq\u0000~\u0000Cpppppppq\u0000~\u0000xppq\u0000~\u0000Bppppppppppppppp"));
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
            return net.sourceforge.czt.oz.jaxb.gen.impl.LocalDefElementImpl.this;
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
                    case  3 :
                        revertToParentFromEnterElement(___uri, ___local, ___qname, __atts);
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
                    case  1 :
                        spawnHandlerFromLeaveElement((((net.sourceforge.czt.oz.jaxb.gen.impl.LocalDefImpl)net.sourceforge.czt.oz.jaxb.gen.impl.LocalDefElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
                        return ;
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
                        spawnHandlerFromEnterAttribute((((net.sourceforge.czt.oz.jaxb.gen.impl.LocalDefImpl)net.sourceforge.czt.oz.jaxb.gen.impl.LocalDefElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
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
                        spawnHandlerFromLeaveAttribute((((net.sourceforge.czt.oz.jaxb.gen.impl.LocalDefImpl)net.sourceforge.czt.oz.jaxb.gen.impl.LocalDefElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
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
                            spawnHandlerFromText((((net.sourceforge.czt.oz.jaxb.gen.impl.LocalDefImpl)net.sourceforge.czt.oz.jaxb.gen.impl.LocalDefElementImpl.this).new Unmarshaller(context)), 2, value);
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
