//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.1-05/30/2003 05:06 AM(java_re)-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2003.08.20 at 09:36:24 NZST 
//


package net.sourceforge.czt.core.jaxb.gen.impl;

public class UnparsedParaImpl
    extends net.sourceforge.czt.core.jaxb.gen.impl.ParaImpl
    implements net.sourceforge.czt.core.jaxb.gen.UnparsedPara, com.sun.xml.bind.JAXBObject, net.sourceforge.czt.core.jaxb.gen.impl.runtime.UnmarshallableObject, net.sourceforge.czt.core.jaxb.gen.impl.runtime.XMLSerializable, net.sourceforge.czt.core.jaxb.gen.impl.runtime.ValidatableObject
{

    protected org.w3._2001.xmlschema.AnyType _Content;
    public final static java.lang.Class version = (net.sourceforge.czt.core.jaxb.gen.impl.JAXBVersion.class);
    private static com.sun.msv.grammar.Grammar schemaFragment;

    private final static java.lang.Class PRIMARY_INTERFACE_CLASS() {
        return (net.sourceforge.czt.core.jaxb.gen.UnparsedPara.class);
    }

    public org.w3._2001.xmlschema.AnyType getContent() {
        return _Content;
    }

    public void setContent(org.w3._2001.xmlschema.AnyType value) {
        _Content = value;
    }

    public net.sourceforge.czt.core.jaxb.gen.impl.runtime.UnmarshallingEventHandler createUnmarshaller(net.sourceforge.czt.core.jaxb.gen.impl.runtime.UnmarshallingContext context) {
        return new net.sourceforge.czt.core.jaxb.gen.impl.UnparsedParaImpl.Unmarshaller(context);
    }

    public void serializeElementBody(net.sourceforge.czt.core.jaxb.gen.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        super.serializeElementBody(context);
        context.startElement("http://czt.sourceforge.net/zml", "Content");
        context.childAsURIs(((com.sun.xml.bind.JAXBObject) _Content));
        context.endNamespaceDecls();
        context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _Content));
        context.endAttributes();
        context.childAsElementBody(((com.sun.xml.bind.JAXBObject) _Content));
        context.endElement();
    }

    public void serializeAttributes(net.sourceforge.czt.core.jaxb.gen.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        super.serializeAttributes(context);
    }

    public void serializeAttributeBody(net.sourceforge.czt.core.jaxb.gen.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        super.serializeAttributeBody(context);
        context.startElement("http://czt.sourceforge.net/zml", "Content");
        context.childAsURIs(((com.sun.xml.bind.JAXBObject) _Content));
        context.endNamespaceDecls();
        context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _Content));
        context.endAttributes();
        context.childAsElementBody(((com.sun.xml.bind.JAXBObject) _Content));
        context.endElement();
    }

    public void serializeURIs(net.sourceforge.czt.core.jaxb.gen.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        super.serializeURIs(context);
    }

    public java.lang.Class getPrimaryInterface() {
        return (net.sourceforge.czt.core.jaxb.gen.UnparsedPara.class);
    }

    public com.sun.msv.verifier.DocumentDeclaration createRawValidator() {
        if (schemaFragment == null) {
            schemaFragment = com.sun.xml.bind.validator.SchemaDeserializer.deserialize((
 "\u00ac\u00ed\u0000\u0005sr\u0000\u001fcom.sun.msv.grammar.SequenceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.su"
+"n.msv.grammar.BinaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0004exp1t\u0000 Lcom/sun/msv/gra"
+"mmar/Expression;L\u0000\u0004exp2q\u0000~\u0000\u0002xr\u0000\u001ecom.sun.msv.grammar.Expressi"
+"on\u00f8\u0018\u0082\u00e8N5~O\u0002\u0000\u0003I\u0000\u000ecachedHashCodeL\u0000\u0013epsilonReducibilityt\u0000\u0013Ljava"
+"/lang/Boolean;L\u0000\u000bexpandedExpq\u0000~\u0000\u0002xp\u0001\u0080\u00c5\u001appsr\u0000\u001dcom.sun.msv.gra"
+"mmar.ChoiceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0001\u0000\u00c0b\u0090ppsr\u0000\'com.sun.msv.grammar"
+".trex.ElementPattern\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\tnameClasst\u0000\u001fLcom/sun/msv/g"
+"rammar/NameClass;xr\u0000\u001ecom.sun.msv.grammar.ElementExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002"
+"\u0000\u0002Z\u0000\u001aignoreUndeclaredAttributesL\u0000\fcontentModelq\u0000~\u0000\u0002xq\u0000~\u0000\u0003\u0000\u00c0b"
+"\u0085sr\u0000\u0011java.lang.Boolean\u00cd r\u0080\u00d5\u009c\u00fa\u00ee\u0002\u0000\u0001Z\u0000\u0005valuexp\u0000p\u0000sq\u0000~\u0000\b\u0000\u00c0bzpp\u0000s"
+"q\u0000~\u0000\u0006\u0000\u00c0boppsr\u0000 com.sun.msv.grammar.OneOrMoreExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr"
+"\u0000\u001ccom.sun.msv.grammar.UnaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\u0003expq\u0000~\u0000\u0002xq\u0000~\u0000\u0003\u0000\u00c0"
+"bdq\u0000~\u0000\rpsr\u0000 com.sun.msv.grammar.AttributeExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003ex"
+"pq\u0000~\u0000\u0002L\u0000\tnameClassq\u0000~\u0000\txq\u0000~\u0000\u0003\u0000\u00c0baq\u0000~\u0000\rpsr\u00002com.sun.msv.gramm"
+"ar.Expression$AnyStringExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003\u0000\u0000\u0000\bsq\u0000~\u0000\f"
+"\u0001q\u0000~\u0000\u0016sr\u0000 com.sun.msv.grammar.AnyNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom"
+".sun.msv.grammar.NameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com.sun.msv.gramm"
+"ar.Expression$EpsilonExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003\u0000\u0000\u0000\tq\u0000~\u0000\u0017q\u0000~"
+"\u0000\u001csr\u0000#com.sun.msv.grammar.SimpleNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\tlocal"
+"Namet\u0000\u0012Ljava/lang/String;L\u0000\fnamespaceURIq\u0000~\u0000\u001exq\u0000~\u0000\u0019t\u00000net.so"
+"urceforge.czt.core.jaxb.gen.TermA.AnnsTypet\u0000+http://java.sun"
+".com/jaxb/xjc/dummy-elementssq\u0000~\u0000\u001dt\u0000\u0004Annst\u0000\u001ehttp://czt.sourc"
+"eforge.net/zmlq\u0000~\u0000\u001csq\u0000~\u0000\b\u0000\u00c0b\u0085pp\u0000sq\u0000~\u0000\b\u0000\u00c0bzpp\u0000sq\u0000~\u0000\u0006\u0000\u00c0boppsq\u0000"
+"~\u0000\u0010\u0000\u00c0bdq\u0000~\u0000\rpsq\u0000~\u0000\u0013\u0000\u00c0baq\u0000~\u0000\rpq\u0000~\u0000\u0016q\u0000~\u0000\u001aq\u0000~\u0000\u001csq\u0000~\u0000\u001dt\u0000\u001eorg.w3."
+"_2001.xmlschema.AnyTypeq\u0000~\u0000!sq\u0000~\u0000\u001dt\u0000\u0007Contentq\u0000~\u0000$sr\u0000\"com.sun"
+".msv.grammar.ExpressionPool\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\bexpTablet\u0000/Lcom/sun"
+"/msv/grammar/ExpressionPool$ClosedHash;xpsr\u0000-com.sun.msv.gra"
+"mmar.ExpressionPool$ClosedHash\u00d7j\u00d0N\u00ef\u00e8\u00ed\u001c\u0002\u0000\u0004I\u0000\u0005countI\u0000\tthreshol"
+"dL\u0000\u0006parentq\u0000~\u0000/[\u0000\u0005tablet\u0000![Lcom/sun/msv/grammar/Expression;x"
+"p\u0000\u0000\u0000\u0006\u0000\u0000\u00009pur\u0000![Lcom.sun.msv.grammar.Expression;\u00d68D\u00c3]\u00ad\u00a7\n\u0002\u0000\u0000xp"
+"\u0000\u0000\u0000\u00bfq\u0000~\u0000(pppppppppq\u0000~\u0000\u000fq\u0000~\u0000\'pppppppppppppppppppppppppppppppq"
+"\u0000~\u0000\u0007ppppppppppppppppppppppppppppppppppppq\u0000~\u0000\u0005ppppppppppppppp"
+"pppppppppppppppppppppppppppppppppppppppppppppppppppppppppppp"
+"ppppppppppppppppppppppppppppppppppq\u0000~\u0000\u0012"));
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
            return net.sourceforge.czt.core.jaxb.gen.impl.UnparsedParaImpl.this;
        }

        public void enterElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname, org.xml.sax.Attributes __atts)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  1 :
                        if (("Content" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            context.pushAttributes(__atts, true);
                            state = 2;
                            return ;
                        }
                        break;
                    case  0 :
                        if (("Anns" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.core.jaxb.gen.impl.ParaImpl)net.sourceforge.czt.core.jaxb.gen.impl.UnparsedParaImpl.this).new Unmarshaller(context)), 1, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        spawnHandlerFromEnterElement((((net.sourceforge.czt.core.jaxb.gen.impl.ParaImpl)net.sourceforge.czt.core.jaxb.gen.impl.UnparsedParaImpl.this).new Unmarshaller(context)), 1, ___uri, ___local, ___qname, __atts);
                        return ;
                    case  2 :
                        if (true) {
                            _Content = ((org.w3._2001.xmlschema.impl.AnyTypeImpl) spawnChildFromEnterElement((org.w3._2001.xmlschema.impl.AnyTypeImpl.class), 3, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        _Content = ((org.w3._2001.xmlschema.impl.AnyTypeImpl) spawnChildFromEnterElement((org.w3._2001.xmlschema.impl.AnyTypeImpl.class), 3, ___uri, ___local, ___qname, __atts));
                        return ;
                    case  4 :
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
                    case  0 :
                        spawnHandlerFromLeaveElement((((net.sourceforge.czt.core.jaxb.gen.impl.ParaImpl)net.sourceforge.czt.core.jaxb.gen.impl.UnparsedParaImpl.this).new Unmarshaller(context)), 1, ___uri, ___local, ___qname);
                        return ;
                    case  3 :
                        if (("Content" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            context.popAttributes();
                            state = 4;
                            return ;
                        }
                        break;
                    case  2 :
                        _Content = ((org.w3._2001.xmlschema.impl.AnyTypeImpl) spawnChildFromLeaveElement((org.w3._2001.xmlschema.impl.AnyTypeImpl.class), 3, ___uri, ___local, ___qname));
                        return ;
                    case  4 :
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
                    case  0 :
                        spawnHandlerFromEnterAttribute((((net.sourceforge.czt.core.jaxb.gen.impl.ParaImpl)net.sourceforge.czt.core.jaxb.gen.impl.UnparsedParaImpl.this).new Unmarshaller(context)), 1, ___uri, ___local, ___qname);
                        return ;
                    case  2 :
                        _Content = ((org.w3._2001.xmlschema.impl.AnyTypeImpl) spawnChildFromEnterAttribute((org.w3._2001.xmlschema.impl.AnyTypeImpl.class), 3, ___uri, ___local, ___qname));
                        return ;
                    case  4 :
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
                    case  0 :
                        spawnHandlerFromLeaveAttribute((((net.sourceforge.czt.core.jaxb.gen.impl.ParaImpl)net.sourceforge.czt.core.jaxb.gen.impl.UnparsedParaImpl.this).new Unmarshaller(context)), 1, ___uri, ___local, ___qname);
                        return ;
                    case  2 :
                        _Content = ((org.w3._2001.xmlschema.impl.AnyTypeImpl) spawnChildFromLeaveAttribute((org.w3._2001.xmlschema.impl.AnyTypeImpl.class), 3, ___uri, ___local, ___qname));
                        return ;
                    case  4 :
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
                        case  0 :
                            spawnHandlerFromText((((net.sourceforge.czt.core.jaxb.gen.impl.ParaImpl)net.sourceforge.czt.core.jaxb.gen.impl.UnparsedParaImpl.this).new Unmarshaller(context)), 1, value);
                            return ;
                        case  2 :
                            _Content = ((org.w3._2001.xmlschema.impl.AnyTypeImpl) spawnChildFromText((org.w3._2001.xmlschema.impl.AnyTypeImpl.class), 3, value));
                            return ;
                        case  4 :
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
