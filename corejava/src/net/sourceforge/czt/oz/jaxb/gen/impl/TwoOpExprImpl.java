//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.2-b15-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2003.10.28 at 04:14:13 NZDT 
//


package net.sourceforge.czt.oz.jaxb.gen.impl;

public class TwoOpExprImpl
    extends net.sourceforge.czt.oz.jaxb.gen.impl.OperationExprImpl
    implements net.sourceforge.czt.oz.jaxb.gen.TwoOpExpr, com.sun.xml.bind.JAXBObject, net.sourceforge.czt.core.jaxb.gen.impl.runtime.UnmarshallableObject, net.sourceforge.czt.core.jaxb.gen.impl.runtime.XMLSerializable, net.sourceforge.czt.core.jaxb.gen.impl.runtime.ValidatableObject
{

    protected net.sourceforge.czt.oz.jaxb.gen.OperationExpr _LeftOpExpr;
    protected net.sourceforge.czt.oz.jaxb.gen.OperationExpr _RightOpExpr;
    public final static java.lang.Class version = (net.sourceforge.czt.oz.jaxb.gen.impl.JAXBVersion.class);
    private static com.sun.msv.grammar.Grammar schemaFragment;

    private final static java.lang.Class PRIMARY_INTERFACE_CLASS() {
        return (net.sourceforge.czt.oz.jaxb.gen.TwoOpExpr.class);
    }

    public net.sourceforge.czt.oz.jaxb.gen.OperationExpr getLeftOpExpr() {
        return _LeftOpExpr;
    }

    public void setLeftOpExpr(net.sourceforge.czt.oz.jaxb.gen.OperationExpr value) {
        _LeftOpExpr = value;
    }

    public net.sourceforge.czt.oz.jaxb.gen.OperationExpr getRightOpExpr() {
        return _RightOpExpr;
    }

    public void setRightOpExpr(net.sourceforge.czt.oz.jaxb.gen.OperationExpr value) {
        _RightOpExpr = value;
    }

    public net.sourceforge.czt.core.jaxb.gen.impl.runtime.UnmarshallingEventHandler createUnmarshaller(net.sourceforge.czt.core.jaxb.gen.impl.runtime.UnmarshallingContext context) {
        return new net.sourceforge.czt.oz.jaxb.gen.impl.TwoOpExprImpl.Unmarshaller(context);
    }

    public void serializeBody(net.sourceforge.czt.core.jaxb.gen.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        super.serializeBody(context);
        context.startElement("http://czt.sourceforge.net/object-z", "LeftOpExpr");
        context.childAsURIs(((com.sun.xml.bind.JAXBObject) _LeftOpExpr), "LeftOpExpr");
        context.endNamespaceDecls();
        context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _LeftOpExpr), "LeftOpExpr");
        context.endAttributes();
        context.childAsBody(((com.sun.xml.bind.JAXBObject) _LeftOpExpr), "LeftOpExpr");
        context.endElement();
        context.startElement("http://czt.sourceforge.net/object-z", "RightOpExpr");
        context.childAsURIs(((com.sun.xml.bind.JAXBObject) _RightOpExpr), "RightOpExpr");
        context.endNamespaceDecls();
        context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _RightOpExpr), "RightOpExpr");
        context.endAttributes();
        context.childAsBody(((com.sun.xml.bind.JAXBObject) _RightOpExpr), "RightOpExpr");
        context.endElement();
    }

    public void serializeAttributes(net.sourceforge.czt.core.jaxb.gen.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        super.serializeAttributes(context);
    }

    public void serializeURIs(net.sourceforge.czt.core.jaxb.gen.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        super.serializeURIs(context);
    }

    public java.lang.Class getPrimaryInterface() {
        return (net.sourceforge.czt.oz.jaxb.gen.TwoOpExpr.class);
    }

    public com.sun.msv.verifier.DocumentDeclaration createRawValidator() {
        if (schemaFragment == null) {
            schemaFragment = com.sun.xml.bind.validator.SchemaDeserializer.deserialize((
 "\u00ac\u00ed\u0000\u0005sr\u0000\u001fcom.sun.msv.grammar.SequenceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.su"
+"n.msv.grammar.BinaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0004exp1t\u0000 Lcom/sun/msv/gra"
+"mmar/Expression;L\u0000\u0004exp2q\u0000~\u0000\u0002xr\u0000\u001ecom.sun.msv.grammar.Expressi"
+"on\u00f8\u0018\u0082\u00e8N5~O\u0002\u0000\u0003I\u0000\u000ecachedHashCodeL\u0000\u0013epsilonReducibilityt\u0000\u0013Ljava"
+"/lang/Boolean;L\u0000\u000bexpandedExpq\u0000~\u0000\u0002xp\tM\u00a3\u00dbppsq\u0000~\u0000\u0000\u0005n\u00bf\u00f4ppsr\u0000\u001dcom"
+".sun.msv.grammar.ChoiceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0001\u0001\u00ef`\u00a9ppsr\u0000\'com.sun"
+".msv.grammar.trex.ElementPattern\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\tnameClasst\u0000\u001fLc"
+"om/sun/msv/grammar/NameClass;xr\u0000\u001ecom.sun.msv.grammar.Element"
+"Exp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002Z\u0000\u001aignoreUndeclaredAttributesL\u0000\fcontentModelq\u0000"
+"~\u0000\u0002xq\u0000~\u0000\u0003\u0001\u00ef`\u009esr\u0000\u0011java.lang.Boolean\u00cd r\u0080\u00d5\u009c\u00fa\u00ee\u0002\u0000\u0001Z\u0000\u0005valuexp\u0000p\u0000sq"
+"\u0000~\u0000\u0000\u0001\u00ef`\u0093ppsq\u0000~\u0000\t\u0000{G%pp\u0000sq\u0000~\u0000\u0007\u0000{G\u001appsr\u0000 com.sun.msv.grammar.O"
+"neOrMoreExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001ccom.sun.msv.grammar.UnaryExp\u0000\u0000\u0000\u0000\u0000\u0000"
+"\u0000\u0001\u0002\u0000\u0001L\u0000\u0003expq\u0000~\u0000\u0002xq\u0000~\u0000\u0003\u0000{G\u000fq\u0000~\u0000\u000epsr\u0000 com.sun.msv.grammar.Attr"
+"ibuteExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003expq\u0000~\u0000\u0002L\u0000\tnameClassq\u0000~\u0000\nxq\u0000~\u0000\u0003\u0000{G\fq\u0000~"
+"\u0000\u000epsr\u00002com.sun.msv.grammar.Expression$AnyStringExpression\u0000\u0000\u0000"
+"\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003\u0000\u0000\u0000\bsq\u0000~\u0000\r\u0001q\u0000~\u0000\u0018sr\u0000 com.sun.msv.grammar.AnyNam"
+"eClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun.msv.grammar.NameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000"
+"\u0000xpsr\u00000com.sun.msv.grammar.Expression$EpsilonExpression\u0000\u0000\u0000\u0000\u0000"
+"\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003\u0000\u0000\u0000\tq\u0000~\u0000\u0019q\u0000~\u0000\u001esr\u0000#com.sun.msv.grammar.SimpleName"
+"Class\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\tlocalNamet\u0000\u0012Ljava/lang/String;L\u0000\fnamespac"
+"eURIq\u0000~\u0000 xq\u0000~\u0000\u001bt\u00000net.sourceforge.czt.core.jaxb.gen.TermA.An"
+"nsTypet\u0000+http://java.sun.com/jaxb/xjc/dummy-elementssq\u0000~\u0000\u0007\u0001t"
+"\u0019ippsq\u0000~\u0000\u0015\u0001t\u0019^q\u0000~\u0000\u000epsr\u0000\u001bcom.sun.msv.grammar.DataExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002"
+"\u0000\u0003L\u0000\u0002dtt\u0000\u001fLorg/relaxng/datatype/Datatype;L\u0000\u0006exceptq\u0000~\u0000\u0002L\u0000\u0004na"
+"met\u0000\u001dLcom/sun/msv/util/StringPair;xq\u0000~\u0000\u0003\u0001d\u00b9\u00c6ppsr\u0000\"com.sun.ms"
+"v.datatype.xsd.QnameType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000*com.sun.msv.datatype."
+"xsd.BuiltinAtomicType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000%com.sun.msv.datatype.xsd"
+".ConcreteType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\'com.sun.msv.datatype.xsd.XSDatat"
+"ypeImpl\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\fnamespaceUriq\u0000~\u0000 L\u0000\btypeNameq\u0000~\u0000 L\u0000\nwhi"
+"teSpacet\u0000.Lcom/sun/msv/datatype/xsd/WhiteSpaceProcessor;xpt\u0000"
+" http://www.w3.org/2001/XMLSchemat\u0000\u0005QNamesr\u00005com.sun.msv.dat"
+"atype.xsd.WhiteSpaceProcessor$Collapse\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000,com.sun"
+".msv.datatype.xsd.WhiteSpaceProcessor\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com.su"
+"n.msv.grammar.Expression$NullSetExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003\u0000"
+"\u0000\u0000\nq\u0000~\u0000\u000epsr\u0000\u001bcom.sun.msv.util.StringPair\u00d0t\u001ejB\u008f\u008d\u00a0\u0002\u0000\u0002L\u0000\tlocalN"
+"ameq\u0000~\u0000 L\u0000\fnamespaceURIq\u0000~\u0000 xpq\u0000~\u00001q\u0000~\u00000sq\u0000~\u0000\u001ft\u0000\u0004typet\u0000)http"
+"://www.w3.org/2001/XMLSchema-instanceq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000\u0004Annst\u0000\u001eht"
+"tp://czt.sourceforge.net/zmlq\u0000~\u0000\u001esq\u0000~\u0000\t\u0003\u007f_Fpp\u0000sq\u0000~\u0000\u0000\u0003\u007f_;ppsq"
+"\u0000~\u0000\t\u0000{G%pp\u0000sq\u0000~\u0000\u0007\u0000{G\u001appsq\u0000~\u0000\u0012\u0000{G\u000fq\u0000~\u0000\u000epsq\u0000~\u0000\u0015\u0000{G\fq\u0000~\u0000\u000epq\u0000~\u0000\u0018"
+"q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000-net.sourceforge.czt.oz.jaxb.gen.Operation"
+"Exprq\u0000~\u0000#sq\u0000~\u0000\u0007\u0003\u0004\u0018\u0011ppsq\u0000~\u0000\u0015\u0003\u0004\u0018\u0006q\u0000~\u0000\u000epq\u0000~\u0000)sq\u0000~\u0000\u001fq\u0000~\u0000:q\u0000~\u0000;q\u0000"
+"~\u0000\u001esq\u0000~\u0000\u001ft\u0000\nLeftOpExprt\u0000#http://czt.sourceforge.net/object-z"
+"sq\u0000~\u0000\t\u0003\u00de\u00e3\u00e2pp\u0000sq\u0000~\u0000\u0000\u0003\u00de\u00e3\u00d7ppsq\u0000~\u0000\t\u0000{G%pp\u0000sq\u0000~\u0000\u0007\u0000{G\u001appsq\u0000~\u0000\u0012\u0000{G\u000f"
+"q\u0000~\u0000\u000epsq\u0000~\u0000\u0015\u0000{G\fq\u0000~\u0000\u000epq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001fq\u0000~\u0000Fq\u0000~\u0000#sq\u0000~\u0000\u0007\u0003"
+"c\u009c\u00adppsq\u0000~\u0000\u0015\u0003c\u009c\u00a2q\u0000~\u0000\u000epq\u0000~\u0000)sq\u0000~\u0000\u001fq\u0000~\u0000:q\u0000~\u0000;q\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000\u000bRigh"
+"tOpExprq\u0000~\u0000Lsr\u0000\"com.sun.msv.grammar.ExpressionPool\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000"
+"\u0001L\u0000\bexpTablet\u0000/Lcom/sun/msv/grammar/ExpressionPool$ClosedHas"
+"h;xpsr\u0000-com.sun.msv.grammar.ExpressionPool$ClosedHash\u00d7j\u00d0N\u00ef\u00e8\u00ed"
+"\u001c\u0002\u0000\u0004I\u0000\u0005countI\u0000\tthresholdL\u0000\u0006parentq\u0000~\u0000Z[\u0000\u0005tablet\u0000![Lcom/sun/m"
+"sv/grammar/Expression;xp\u0000\u0000\u0000\u000f\u0000\u0000\u00009pur\u0000![Lcom.sun.msv.grammar.E"
+"xpression;\u00d68D\u00c3]\u00ad\u00a7\n\u0002\u0000\u0000xp\u0000\u0000\u0000\u00bfpppppppppq\u0000~\u0000\u000fq\u0000~\u0000\u0014q\u0000~\u0000Cq\u0000~\u0000Qpppp"
+"ppppq\u0000~\u0000\u0011q\u0000~\u0000Bq\u0000~\u0000Ppppppppq\u0000~\u0000\bppppppppppq\u0000~\u0000Gpppppppppppppp"
+"pppppppq\u0000~\u0000\u0005pppppppppppq\u0000~\u0000Tppq\u0000~\u0000@ppppppppppppppppppppppppp"
+"ppppppppq\u0000~\u0000Nppppppppppppq\u0000~\u0000\u0006pppppppppppppppppppppppppppppp"
+"ppppppq\u0000~\u0000$ppppppppppppppppppppppppppp"));
        }
        return new com.sun.msv.verifier.regexp.REDocumentDeclaration(schemaFragment);
    }

    public class Unmarshaller
        extends net.sourceforge.czt.core.jaxb.gen.impl.runtime.AbstractUnmarshallingEventHandlerImpl
    {


        public Unmarshaller(net.sourceforge.czt.core.jaxb.gen.impl.runtime.UnmarshallingContext context) {
            super(context, "--------");
        }

        protected Unmarshaller(net.sourceforge.czt.core.jaxb.gen.impl.runtime.UnmarshallingContext context, int startState) {
            this(context);
            state = startState;
        }

        public java.lang.Object owner() {
            return net.sourceforge.czt.oz.jaxb.gen.impl.TwoOpExprImpl.this;
        }

        public void enterElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname, org.xml.sax.Attributes __atts)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  4 :
                        if (("RightOpExpr" == ___local)&&("http://czt.sourceforge.net/object-z" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 5;
                            return ;
                        }
                        break;
                    case  0 :
                        if (("Anns" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.oz.jaxb.gen.impl.OperationExprImpl)net.sourceforge.czt.oz.jaxb.gen.impl.TwoOpExprImpl.this).new Unmarshaller(context)), 1, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        spawnHandlerFromEnterElement((((net.sourceforge.czt.oz.jaxb.gen.impl.OperationExprImpl)net.sourceforge.czt.oz.jaxb.gen.impl.TwoOpExprImpl.this).new Unmarshaller(context)), 1, ___uri, ___local, ___qname, __atts);
                        return ;
                    case  7 :
                        revertToParentFromEnterElement(___uri, ___local, ___qname, __atts);
                        return ;
                    case  1 :
                        if (("LeftOpExpr" == ___local)&&("http://czt.sourceforge.net/object-z" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 2;
                            return ;
                        }
                        break;
                    case  5 :
                        if (("Anns" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _RightOpExpr = ((net.sourceforge.czt.oz.jaxb.gen.impl.OperationExprImpl) spawnChildFromEnterElement((net.sourceforge.czt.oz.jaxb.gen.impl.OperationExprImpl.class), 6, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        _RightOpExpr = ((net.sourceforge.czt.oz.jaxb.gen.impl.OperationExprImpl) spawnChildFromEnterElement((net.sourceforge.czt.oz.jaxb.gen.impl.OperationExprImpl.class), 6, ___uri, ___local, ___qname, __atts));
                        return ;
                    case  2 :
                        if (("Anns" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _LeftOpExpr = ((net.sourceforge.czt.oz.jaxb.gen.impl.OperationExprImpl) spawnChildFromEnterElement((net.sourceforge.czt.oz.jaxb.gen.impl.OperationExprImpl.class), 3, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        _LeftOpExpr = ((net.sourceforge.czt.oz.jaxb.gen.impl.OperationExprImpl) spawnChildFromEnterElement((net.sourceforge.czt.oz.jaxb.gen.impl.OperationExprImpl.class), 3, ___uri, ___local, ___qname, __atts));
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
                        if (("LeftOpExpr" == ___local)&&("http://czt.sourceforge.net/object-z" == ___uri)) {
                            context.popAttributes();
                            state = 4;
                            return ;
                        }
                        break;
                    case  0 :
                        spawnHandlerFromLeaveElement((((net.sourceforge.czt.oz.jaxb.gen.impl.OperationExprImpl)net.sourceforge.czt.oz.jaxb.gen.impl.TwoOpExprImpl.this).new Unmarshaller(context)), 1, ___uri, ___local, ___qname);
                        return ;
                    case  7 :
                        revertToParentFromLeaveElement(___uri, ___local, ___qname);
                        return ;
                    case  6 :
                        if (("RightOpExpr" == ___local)&&("http://czt.sourceforge.net/object-z" == ___uri)) {
                            context.popAttributes();
                            state = 7;
                            return ;
                        }
                        break;
                    case  5 :
                        _RightOpExpr = ((net.sourceforge.czt.oz.jaxb.gen.impl.OperationExprImpl) spawnChildFromLeaveElement((net.sourceforge.czt.oz.jaxb.gen.impl.OperationExprImpl.class), 6, ___uri, ___local, ___qname));
                        return ;
                    case  2 :
                        _LeftOpExpr = ((net.sourceforge.czt.oz.jaxb.gen.impl.OperationExprImpl) spawnChildFromLeaveElement((net.sourceforge.czt.oz.jaxb.gen.impl.OperationExprImpl.class), 3, ___uri, ___local, ___qname));
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
                    case  0 :
                        spawnHandlerFromEnterAttribute((((net.sourceforge.czt.oz.jaxb.gen.impl.OperationExprImpl)net.sourceforge.czt.oz.jaxb.gen.impl.TwoOpExprImpl.this).new Unmarshaller(context)), 1, ___uri, ___local, ___qname);
                        return ;
                    case  7 :
                        revertToParentFromEnterAttribute(___uri, ___local, ___qname);
                        return ;
                    case  5 :
                        _RightOpExpr = ((net.sourceforge.czt.oz.jaxb.gen.impl.OperationExprImpl) spawnChildFromEnterAttribute((net.sourceforge.czt.oz.jaxb.gen.impl.OperationExprImpl.class), 6, ___uri, ___local, ___qname));
                        return ;
                    case  2 :
                        _LeftOpExpr = ((net.sourceforge.czt.oz.jaxb.gen.impl.OperationExprImpl) spawnChildFromEnterAttribute((net.sourceforge.czt.oz.jaxb.gen.impl.OperationExprImpl.class), 3, ___uri, ___local, ___qname));
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
                    case  0 :
                        spawnHandlerFromLeaveAttribute((((net.sourceforge.czt.oz.jaxb.gen.impl.OperationExprImpl)net.sourceforge.czt.oz.jaxb.gen.impl.TwoOpExprImpl.this).new Unmarshaller(context)), 1, ___uri, ___local, ___qname);
                        return ;
                    case  7 :
                        revertToParentFromLeaveAttribute(___uri, ___local, ___qname);
                        return ;
                    case  5 :
                        _RightOpExpr = ((net.sourceforge.czt.oz.jaxb.gen.impl.OperationExprImpl) spawnChildFromLeaveAttribute((net.sourceforge.czt.oz.jaxb.gen.impl.OperationExprImpl.class), 6, ___uri, ___local, ___qname));
                        return ;
                    case  2 :
                        _LeftOpExpr = ((net.sourceforge.czt.oz.jaxb.gen.impl.OperationExprImpl) spawnChildFromLeaveAttribute((net.sourceforge.czt.oz.jaxb.gen.impl.OperationExprImpl.class), 3, ___uri, ___local, ___qname));
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
                        case  0 :
                            spawnHandlerFromText((((net.sourceforge.czt.oz.jaxb.gen.impl.OperationExprImpl)net.sourceforge.czt.oz.jaxb.gen.impl.TwoOpExprImpl.this).new Unmarshaller(context)), 1, value);
                            return ;
                        case  7 :
                            revertToParentFromText(value);
                            return ;
                        case  5 :
                            _RightOpExpr = ((net.sourceforge.czt.oz.jaxb.gen.impl.OperationExprImpl) spawnChildFromText((net.sourceforge.czt.oz.jaxb.gen.impl.OperationExprImpl.class), 6, value));
                            return ;
                        case  2 :
                            _LeftOpExpr = ((net.sourceforge.czt.oz.jaxb.gen.impl.OperationExprImpl) spawnChildFromText((net.sourceforge.czt.oz.jaxb.gen.impl.OperationExprImpl.class), 3, value));
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
