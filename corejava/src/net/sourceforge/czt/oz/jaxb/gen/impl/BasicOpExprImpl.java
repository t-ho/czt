//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.2-b15-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2004.05.14 at 01:55:34 NZST 
//


package net.sourceforge.czt.oz.jaxb.gen.impl;

public class BasicOpExprImpl
    extends net.sourceforge.czt.oz.jaxb.gen.impl.OperationExprImpl
    implements net.sourceforge.czt.oz.jaxb.gen.BasicOpExpr, com.sun.xml.bind.JAXBObject, net.sourceforge.czt.oz.jaxb.gen.impl.runtime.UnmarshallableObject, net.sourceforge.czt.oz.jaxb.gen.impl.runtime.XMLSerializable, net.sourceforge.czt.oz.jaxb.gen.impl.runtime.ValidatableObject
{

    protected net.sourceforge.czt.z.jaxb.gen.SchText _SchText;
    protected net.sourceforge.czt.oz.jaxb.gen.RefNameList _DeltaList;
    public final static java.lang.Class version = (net.sourceforge.czt.oz.jaxb.gen.impl.JAXBVersion.class);
    private static com.sun.msv.grammar.Grammar schemaFragment;

    private final static java.lang.Class PRIMARY_INTERFACE_CLASS() {
        return (net.sourceforge.czt.oz.jaxb.gen.BasicOpExpr.class);
    }

    public net.sourceforge.czt.z.jaxb.gen.SchText getSchText() {
        return _SchText;
    }

    public void setSchText(net.sourceforge.czt.z.jaxb.gen.SchText value) {
        _SchText = value;
    }

    public net.sourceforge.czt.oz.jaxb.gen.RefNameList getDeltaList() {
        return _DeltaList;
    }

    public void setDeltaList(net.sourceforge.czt.oz.jaxb.gen.RefNameList value) {
        _DeltaList = value;
    }

    public net.sourceforge.czt.oz.jaxb.gen.impl.runtime.UnmarshallingEventHandler createUnmarshaller(net.sourceforge.czt.oz.jaxb.gen.impl.runtime.UnmarshallingContext context) {
        return new net.sourceforge.czt.oz.jaxb.gen.impl.BasicOpExprImpl.Unmarshaller(context);
    }

    public void serializeBody(net.sourceforge.czt.oz.jaxb.gen.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        super.serializeBody(context);
        if (_DeltaList!= null) {
            context.startElement("http://czt.sourceforge.net/object-z", "DeltaList");
            context.childAsURIs(((com.sun.xml.bind.JAXBObject) _DeltaList), "DeltaList");
            context.endNamespaceDecls();
            context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _DeltaList), "DeltaList");
            context.endAttributes();
            context.childAsBody(((com.sun.xml.bind.JAXBObject) _DeltaList), "DeltaList");
            context.endElement();
        }
        if (_SchText!= null) {
            if (_SchText instanceof javax.xml.bind.Element) {
                context.childAsBody(((com.sun.xml.bind.JAXBObject) _SchText), "SchText");
            } else {
                context.startElement("http://czt.sourceforge.net/zml", "SchText");
                context.childAsURIs(((com.sun.xml.bind.JAXBObject) _SchText), "SchText");
                context.endNamespaceDecls();
                context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _SchText), "SchText");
                context.endAttributes();
                context.childAsBody(((com.sun.xml.bind.JAXBObject) _SchText), "SchText");
                context.endElement();
            }
        }
    }

    public void serializeAttributes(net.sourceforge.czt.oz.jaxb.gen.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        super.serializeAttributes(context);
        if (_SchText!= null) {
            if (_SchText instanceof javax.xml.bind.Element) {
                context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _SchText), "SchText");
            }
        }
    }

    public void serializeURIs(net.sourceforge.czt.oz.jaxb.gen.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        super.serializeURIs(context);
        if (_SchText!= null) {
            if (_SchText instanceof javax.xml.bind.Element) {
                context.childAsURIs(((com.sun.xml.bind.JAXBObject) _SchText), "SchText");
            }
        }
    }

    public java.lang.Class getPrimaryInterface() {
        return (net.sourceforge.czt.oz.jaxb.gen.BasicOpExpr.class);
    }

    public com.sun.msv.verifier.DocumentDeclaration createRawValidator() {
        if (schemaFragment == null) {
            schemaFragment = com.sun.xml.bind.validator.SchemaDeserializer.deserialize((
 "\u00ac\u00ed\u0000\u0005sr\u0000\u001fcom.sun.msv.grammar.SequenceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.su"
+"n.msv.grammar.BinaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0004exp1t\u0000 Lcom/sun/msv/gra"
+"mmar/Expression;L\u0000\u0004exp2q\u0000~\u0000\u0002xr\u0000\u001ecom.sun.msv.grammar.Expressi"
+"on\u00f8\u0018\u0082\u00e8N5~O\u0002\u0000\u0003I\u0000\u000ecachedHashCodeL\u0000\u0013epsilonReducibilityt\u0000\u0013Ljava"
+"/lang/Boolean;L\u0000\u000bexpandedExpq\u0000~\u0000\u0002xp\u000b\u00b6FSppsq\u0000~\u0000\u0000\u0006\u009c\u00f7\u009cppsr\u0000\u001dcom"
+".sun.msv.grammar.ChoiceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0001\u0004\u001d\u0005\u00d4ppsr\u0000\'com.sun"
+".msv.grammar.trex.ElementPattern\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\tnameClasst\u0000\u001fLc"
+"om/sun/msv/grammar/NameClass;xr\u0000\u001ecom.sun.msv.grammar.Element"
+"Exp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002Z\u0000\u001aignoreUndeclaredAttributesL\u0000\fcontentModelq\u0000"
+"~\u0000\u0002xq\u0000~\u0000\u0003\u0004\u001d\u0005\u00c9sr\u0000\u0011java.lang.Boolean\u00cd r\u0080\u00d5\u009c\u00fa\u00ee\u0002\u0000\u0001Z\u0000\u0005valuexp\u0000p\u0000sq"
+"\u0000~\u0000\u0000\u0004\u001d\u0005\u00beppsq\u0000~\u0000\t\u0001\u00f6\u00ef#pp\u0000sq\u0000~\u0000\u0007\u0001\u00f6\u00ef\u0018ppsr\u0000 com.sun.msv.grammar.O"
+"neOrMoreExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001ccom.sun.msv.grammar.UnaryExp\u0000\u0000\u0000\u0000\u0000\u0000"
+"\u0000\u0001\u0002\u0000\u0001L\u0000\u0003expq\u0000~\u0000\u0002xq\u0000~\u0000\u0003\u0001\u00f6\u00ef\rq\u0000~\u0000\u000epsr\u0000 com.sun.msv.grammar.Attr"
+"ibuteExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003expq\u0000~\u0000\u0002L\u0000\tnameClassq\u0000~\u0000\nxq\u0000~\u0000\u0003\u0001\u00f6\u00ef\nq\u0000~"
+"\u0000\u000epsr\u00002com.sun.msv.grammar.Expression$AnyStringExpression\u0000\u0000\u0000"
+"\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003\u0000\u0000\u0000\bsq\u0000~\u0000\r\u0001q\u0000~\u0000\u0018sr\u0000 com.sun.msv.grammar.AnyNam"
+"eClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun.msv.grammar.NameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000"
+"\u0000xpsr\u00000com.sun.msv.grammar.Expression$EpsilonExpression\u0000\u0000\u0000\u0000\u0000"
+"\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003\u0000\u0000\u0000\tq\u0000~\u0000\u0019q\u0000~\u0000\u001esr\u0000#com.sun.msv.grammar.SimpleName"
+"Class\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\tlocalNamet\u0000\u0012Ljava/lang/String;L\u0000\fnamespac"
+"eURIq\u0000~\u0000 xq\u0000~\u0000\u001bt\u0000-net.sourceforge.czt.z.jaxb.gen.TermA.AnnsT"
+"ypet\u0000+http://java.sun.com/jaxb/xjc/dummy-elementssq\u0000~\u0000\u0007\u0002&\u0016\u0096p"
+"psq\u0000~\u0000\u0015\u0002&\u0016\u008bq\u0000~\u0000\u000epsr\u0000\u001bcom.sun.msv.grammar.DataExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L"
+"\u0000\u0002dtt\u0000\u001fLorg/relaxng/datatype/Datatype;L\u0000\u0006exceptq\u0000~\u0000\u0002L\u0000\u0004namet"
+"\u0000\u001dLcom/sun/msv/util/StringPair;xq\u0000~\u0000\u0003\u0000O;\u00b2ppsr\u0000\"com.sun.msv.d"
+"atatype.xsd.QnameType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000*com.sun.msv.datatype.xsd"
+".BuiltinAtomicType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000%com.sun.msv.datatype.xsd.Co"
+"ncreteType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\'com.sun.msv.datatype.xsd.XSDatatype"
+"Impl\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\fnamespaceUriq\u0000~\u0000 L\u0000\btypeNameq\u0000~\u0000 L\u0000\nwhiteS"
+"pacet\u0000.Lcom/sun/msv/datatype/xsd/WhiteSpaceProcessor;xpt\u0000 ht"
+"tp://www.w3.org/2001/XMLSchemat\u0000\u0005QNamesr\u00005com.sun.msv.dataty"
+"pe.xsd.WhiteSpaceProcessor$Collapse\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000,com.sun.ms"
+"v.datatype.xsd.WhiteSpaceProcessor\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com.sun.m"
+"sv.grammar.Expression$NullSetExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003\u0000\u0000\u0000\n"
+"q\u0000~\u0000\u000epsr\u0000\u001bcom.sun.msv.util.StringPair\u00d0t\u001ejB\u008f\u008d\u00a0\u0002\u0000\u0002L\u0000\tlocalName"
+"q\u0000~\u0000 L\u0000\fnamespaceURIq\u0000~\u0000 xpq\u0000~\u00001q\u0000~\u00000sq\u0000~\u0000\u001ft\u0000\u0004typet\u0000)http://"
+"www.w3.org/2001/XMLSchema-instanceq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000\u0004Annst\u0000\u001ehttp:"
+"//czt.sourceforge.net/zmlq\u0000~\u0000\u001esq\u0000~\u0000\u0007\u0002\u007f\u00f1\u00c3ppsq\u0000~\u0000\t\u0002\u007f\u00f1\u00b8q\u0000~\u0000\u000ep\u0000s"
+"q\u0000~\u0000\u0000\u0002\u007f\u00f1\u00adppsq\u0000~\u0000\t\u0001\u00f6\u00ef#pp\u0000sq\u0000~\u0000\u0007\u0001\u00f6\u00ef\u0018ppsq\u0000~\u0000\u0012\u0001\u00f6\u00ef\rq\u0000~\u0000\u000epsq\u0000~\u0000\u0015\u0001\u00f6"
+"\u00ef\nq\u0000~\u0000\u000epq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000+net.sourceforge.czt.oz.jaxb."
+"gen.RefNameListq\u0000~\u0000#sq\u0000~\u0000\u0007\u0000\u0089\u0002\u0085ppsq\u0000~\u0000\u0015\u0000\u0089\u0002zq\u0000~\u0000\u000epq\u0000~\u0000)sq\u0000~\u0000\u001fq"
+"\u0000~\u0000:q\u0000~\u0000;q\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000\tDeltaListt\u0000#http://czt.sourceforge.ne"
+"t/object-zq\u0000~\u0000\u001esq\u0000~\u0000\u0007\u0005\u0019N\u00b2ppsq\u0000~\u0000\u0007\u0005\u0019N\u00a7q\u0000~\u0000\u000epsq\u0000~\u0000\t\u0001\u00f6\u00ef#q\u0000~\u0000\u000ep\u0000"
+"sq\u0000~\u0000\u0007\u0001\u00f6\u00ef\u0018ppsq\u0000~\u0000\u0012\u0001\u00f6\u00ef\rq\u0000~\u0000\u000epsq\u0000~\u0000\u0015\u0001\u00f6\u00ef\nq\u0000~\u0000\u000epq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001es"
+"q\u0000~\u0000\u001ft\u0000-net.sourceforge.czt.z.jaxb.gen.SchTextElementq\u0000~\u0000#sq"
+"\u0000~\u0000\t\u0003\"_\u0082q\u0000~\u0000\u000ep\u0000sq\u0000~\u0000\u0000\u0003\"_wppsq\u0000~\u0000\t\u0001\u00f6\u00ef#pp\u0000sq\u0000~\u0000\u0007\u0001\u00f6\u00ef\u0018ppsq\u0000~\u0000\u0012\u0001\u00f6"
+"\u00ef\rq\u0000~\u0000\u000epsq\u0000~\u0000\u0015\u0001\u00f6\u00ef\nq\u0000~\u0000\u000epq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000&net.sourcefo"
+"rge.czt.z.jaxb.gen.SchTextq\u0000~\u0000#sq\u0000~\u0000\u0007\u0001+pOppsq\u0000~\u0000\u0015\u0001+pDq\u0000~\u0000\u000epq"
+"\u0000~\u0000)sq\u0000~\u0000\u001fq\u0000~\u0000:q\u0000~\u0000;q\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000\u0007SchTextq\u0000~\u0000>q\u0000~\u0000\u001esr\u0000\"com.s"
+"un.msv.grammar.ExpressionPool\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\bexpTablet\u0000/Lcom/s"
+"un/msv/grammar/ExpressionPool$ClosedHash;xpsr\u0000-com.sun.msv.g"
+"rammar.ExpressionPool$ClosedHash\u00d7j\u00d0N\u00ef\u00e8\u00ed\u001c\u0002\u0000\u0004I\u0000\u0005countI\u0000\tthresh"
+"oldL\u0000\u0006parentq\u0000~\u0000d[\u0000\u0005tablet\u0000![Lcom/sun/msv/grammar/Expression"
+";xp\u0000\u0000\u0000\u0014\u0000\u0000\u00009pur\u0000![Lcom.sun.msv.grammar.Expression;\u00d68D\u00c3]\u00ad\u00a7\n\u0002\u0000\u0000"
+"xp\u0000\u0000\u0000\u00bfppppppppppppppppppppppppppppppppppppppppppppppppppppq\u0000"
+"~\u0000\u0005ppppppppppppppppppppppppppppppppppppppppppq\u0000~\u0000\u000fq\u0000~\u0000$ppppq"
+"\u0000~\u0000Wq\u0000~\u0000^pppppq\u0000~\u0000Oppppppppq\u0000~\u0000\bpq\u0000~\u0000\u0006q\u0000~\u0000Nppppppppppppppppp"
+"pppppppppppppppppppppppppq\u0000~\u0000\u0014q\u0000~\u0000Dq\u0000~\u0000Rq\u0000~\u0000Aq\u0000~\u0000Hq\u0000~\u0000Zppppp"
+"q\u0000~\u0000\u0011q\u0000~\u0000Cq\u0000~\u0000Qq\u0000~\u0000Yppppppppppq\u0000~\u0000?pp"));
        }
        return new com.sun.msv.verifier.regexp.REDocumentDeclaration(schemaFragment);
    }

    public class Unmarshaller
        extends net.sourceforge.czt.oz.jaxb.gen.impl.runtime.AbstractUnmarshallingEventHandlerImpl
    {


        public Unmarshaller(net.sourceforge.czt.oz.jaxb.gen.impl.runtime.UnmarshallingContext context) {
            super(context, "--------");
        }

        protected Unmarshaller(net.sourceforge.czt.oz.jaxb.gen.impl.runtime.UnmarshallingContext context, int startState) {
            this(context);
            state = startState;
        }

        public java.lang.Object owner() {
            return net.sourceforge.czt.oz.jaxb.gen.impl.BasicOpExprImpl.this;
        }

        public void enterElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname, org.xml.sax.Attributes __atts)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  5 :
                        if (("Anns" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _SchText = ((net.sourceforge.czt.z.jaxb.gen.impl.SchTextImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.SchTextImpl.class), 6, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("ConstDecl" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _SchText = ((net.sourceforge.czt.z.jaxb.gen.impl.SchTextImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.SchTextImpl.class), 6, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("InclDecl" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _SchText = ((net.sourceforge.czt.z.jaxb.gen.impl.SchTextImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.SchTextImpl.class), 6, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("VarDecl" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _SchText = ((net.sourceforge.czt.z.jaxb.gen.impl.SchTextImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.SchTextImpl.class), 6, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("Decl" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _SchText = ((net.sourceforge.czt.z.jaxb.gen.impl.SchTextImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.SchTextImpl.class), 6, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("Decl" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _SchText = ((net.sourceforge.czt.z.jaxb.gen.impl.SchTextImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.SchTextImpl.class), 6, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("Pred2" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _SchText = ((net.sourceforge.czt.z.jaxb.gen.impl.SchTextImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.SchTextImpl.class), 6, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("ImpliesPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _SchText = ((net.sourceforge.czt.z.jaxb.gen.impl.SchTextImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.SchTextImpl.class), 6, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("ExprPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _SchText = ((net.sourceforge.czt.z.jaxb.gen.impl.SchTextImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.SchTextImpl.class), 6, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("MemPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _SchText = ((net.sourceforge.czt.z.jaxb.gen.impl.SchTextImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.SchTextImpl.class), 6, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("NegPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _SchText = ((net.sourceforge.czt.z.jaxb.gen.impl.SchTextImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.SchTextImpl.class), 6, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("OrPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _SchText = ((net.sourceforge.czt.z.jaxb.gen.impl.SchTextImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.SchTextImpl.class), 6, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("ForallPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _SchText = ((net.sourceforge.czt.z.jaxb.gen.impl.SchTextImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.SchTextImpl.class), 6, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("Fact" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _SchText = ((net.sourceforge.czt.z.jaxb.gen.impl.SchTextImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.SchTextImpl.class), 6, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("QntPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _SchText = ((net.sourceforge.czt.z.jaxb.gen.impl.SchTextImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.SchTextImpl.class), 6, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("FalsePred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _SchText = ((net.sourceforge.czt.z.jaxb.gen.impl.SchTextImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.SchTextImpl.class), 6, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("IffPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _SchText = ((net.sourceforge.czt.z.jaxb.gen.impl.SchTextImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.SchTextImpl.class), 6, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("JokerPred" == ___local)&&("http://czt.sourceforge.net/zpatt" == ___uri)) {
                            _SchText = ((net.sourceforge.czt.z.jaxb.gen.impl.SchTextImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.SchTextImpl.class), 6, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("Exists1Pred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _SchText = ((net.sourceforge.czt.z.jaxb.gen.impl.SchTextImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.SchTextImpl.class), 6, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("PromotedInitPred" == ___local)&&("http://czt.sourceforge.net/object-z" == ___uri)) {
                            _SchText = ((net.sourceforge.czt.z.jaxb.gen.impl.SchTextImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.SchTextImpl.class), 6, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("AndPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _SchText = ((net.sourceforge.czt.z.jaxb.gen.impl.SchTextImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.SchTextImpl.class), 6, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("TruePred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _SchText = ((net.sourceforge.czt.z.jaxb.gen.impl.SchTextImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.SchTextImpl.class), 6, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("ExistsPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _SchText = ((net.sourceforge.czt.z.jaxb.gen.impl.SchTextImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.SchTextImpl.class), 6, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("Pred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _SchText = ((net.sourceforge.czt.z.jaxb.gen.impl.SchTextImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.SchTextImpl.class), 6, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("Pred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _SchText = ((net.sourceforge.czt.z.jaxb.gen.impl.SchTextImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.SchTextImpl.class), 6, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        _SchText = ((net.sourceforge.czt.z.jaxb.gen.impl.SchTextImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.SchTextImpl.class), 6, ___uri, ___local, ___qname, __atts));
                        return ;
                    case  4 :
                        if (("SchText" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 5;
                            return ;
                        }
                        if (("SchText" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _SchText = ((net.sourceforge.czt.z.jaxb.gen.impl.SchTextElementImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.SchTextElementImpl.class), 7, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        state = 7;
                        continue outer;
                    case  2 :
                        if (("Anns" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _DeltaList = ((net.sourceforge.czt.oz.jaxb.gen.impl.RefNameListImpl) spawnChildFromEnterElement((net.sourceforge.czt.oz.jaxb.gen.impl.RefNameListImpl.class), 3, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("Name" == ___local)&&("http://czt.sourceforge.net/object-z" == ___uri)) {
                            _DeltaList = ((net.sourceforge.czt.oz.jaxb.gen.impl.RefNameListImpl) spawnChildFromEnterElement((net.sourceforge.czt.oz.jaxb.gen.impl.RefNameListImpl.class), 3, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        _DeltaList = ((net.sourceforge.czt.oz.jaxb.gen.impl.RefNameListImpl) spawnChildFromEnterElement((net.sourceforge.czt.oz.jaxb.gen.impl.RefNameListImpl.class), 3, ___uri, ___local, ___qname, __atts));
                        return ;
                    case  1 :
                        if (("DeltaList" == ___local)&&("http://czt.sourceforge.net/object-z" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 2;
                            return ;
                        }
                        state = 4;
                        continue outer;
                    case  7 :
                        revertToParentFromEnterElement(___uri, ___local, ___qname, __atts);
                        return ;
                    case  0 :
                        if (("Anns" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.oz.jaxb.gen.impl.OperationExprImpl)net.sourceforge.czt.oz.jaxb.gen.impl.BasicOpExprImpl.this).new Unmarshaller(context)), 1, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        spawnHandlerFromEnterElement((((net.sourceforge.czt.oz.jaxb.gen.impl.OperationExprImpl)net.sourceforge.czt.oz.jaxb.gen.impl.BasicOpExprImpl.this).new Unmarshaller(context)), 1, ___uri, ___local, ___qname, __atts);
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
                    case  5 :
                        _SchText = ((net.sourceforge.czt.z.jaxb.gen.impl.SchTextImpl) spawnChildFromLeaveElement((net.sourceforge.czt.z.jaxb.gen.impl.SchTextImpl.class), 6, ___uri, ___local, ___qname));
                        return ;
                    case  4 :
                        state = 7;
                        continue outer;
                    case  2 :
                        _DeltaList = ((net.sourceforge.czt.oz.jaxb.gen.impl.RefNameListImpl) spawnChildFromLeaveElement((net.sourceforge.czt.oz.jaxb.gen.impl.RefNameListImpl.class), 3, ___uri, ___local, ___qname));
                        return ;
                    case  1 :
                        state = 4;
                        continue outer;
                    case  7 :
                        revertToParentFromLeaveElement(___uri, ___local, ___qname);
                        return ;
                    case  6 :
                        if (("SchText" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            context.popAttributes();
                            state = 7;
                            return ;
                        }
                        break;
                    case  3 :
                        if (("DeltaList" == ___local)&&("http://czt.sourceforge.net/object-z" == ___uri)) {
                            context.popAttributes();
                            state = 4;
                            return ;
                        }
                        break;
                    case  0 :
                        spawnHandlerFromLeaveElement((((net.sourceforge.czt.oz.jaxb.gen.impl.OperationExprImpl)net.sourceforge.czt.oz.jaxb.gen.impl.BasicOpExprImpl.this).new Unmarshaller(context)), 1, ___uri, ___local, ___qname);
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
                    case  5 :
                        _SchText = ((net.sourceforge.czt.z.jaxb.gen.impl.SchTextImpl) spawnChildFromEnterAttribute((net.sourceforge.czt.z.jaxb.gen.impl.SchTextImpl.class), 6, ___uri, ___local, ___qname));
                        return ;
                    case  4 :
                        state = 7;
                        continue outer;
                    case  2 :
                        _DeltaList = ((net.sourceforge.czt.oz.jaxb.gen.impl.RefNameListImpl) spawnChildFromEnterAttribute((net.sourceforge.czt.oz.jaxb.gen.impl.RefNameListImpl.class), 3, ___uri, ___local, ___qname));
                        return ;
                    case  1 :
                        state = 4;
                        continue outer;
                    case  7 :
                        revertToParentFromEnterAttribute(___uri, ___local, ___qname);
                        return ;
                    case  0 :
                        spawnHandlerFromEnterAttribute((((net.sourceforge.czt.oz.jaxb.gen.impl.OperationExprImpl)net.sourceforge.czt.oz.jaxb.gen.impl.BasicOpExprImpl.this).new Unmarshaller(context)), 1, ___uri, ___local, ___qname);
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
                    case  5 :
                        _SchText = ((net.sourceforge.czt.z.jaxb.gen.impl.SchTextImpl) spawnChildFromLeaveAttribute((net.sourceforge.czt.z.jaxb.gen.impl.SchTextImpl.class), 6, ___uri, ___local, ___qname));
                        return ;
                    case  4 :
                        state = 7;
                        continue outer;
                    case  2 :
                        _DeltaList = ((net.sourceforge.czt.oz.jaxb.gen.impl.RefNameListImpl) spawnChildFromLeaveAttribute((net.sourceforge.czt.oz.jaxb.gen.impl.RefNameListImpl.class), 3, ___uri, ___local, ___qname));
                        return ;
                    case  1 :
                        state = 4;
                        continue outer;
                    case  7 :
                        revertToParentFromLeaveAttribute(___uri, ___local, ___qname);
                        return ;
                    case  0 :
                        spawnHandlerFromLeaveAttribute((((net.sourceforge.czt.oz.jaxb.gen.impl.OperationExprImpl)net.sourceforge.czt.oz.jaxb.gen.impl.BasicOpExprImpl.this).new Unmarshaller(context)), 1, ___uri, ___local, ___qname);
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
                        case  5 :
                            _SchText = ((net.sourceforge.czt.z.jaxb.gen.impl.SchTextImpl) spawnChildFromText((net.sourceforge.czt.z.jaxb.gen.impl.SchTextImpl.class), 6, value));
                            return ;
                        case  4 :
                            state = 7;
                            continue outer;
                        case  2 :
                            _DeltaList = ((net.sourceforge.czt.oz.jaxb.gen.impl.RefNameListImpl) spawnChildFromText((net.sourceforge.czt.oz.jaxb.gen.impl.RefNameListImpl.class), 3, value));
                            return ;
                        case  1 :
                            state = 4;
                            continue outer;
                        case  7 :
                            revertToParentFromText(value);
                            return ;
                        case  0 :
                            spawnHandlerFromText((((net.sourceforge.czt.oz.jaxb.gen.impl.OperationExprImpl)net.sourceforge.czt.oz.jaxb.gen.impl.BasicOpExprImpl.this).new Unmarshaller(context)), 1, value);
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
