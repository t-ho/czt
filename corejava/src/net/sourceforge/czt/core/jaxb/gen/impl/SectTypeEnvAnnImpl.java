//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.1-05/30/2003 05:06 AM(java_re)-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2003.08.25 at 03:03:07 NZST 
//


package net.sourceforge.czt.core.jaxb.gen.impl;

public class SectTypeEnvAnnImpl
    extends net.sourceforge.czt.core.jaxb.gen.impl.AnnImpl
    implements net.sourceforge.czt.core.jaxb.gen.SectTypeEnvAnn, com.sun.xml.bind.JAXBObject, net.sourceforge.czt.core.jaxb.gen.impl.runtime.UnmarshallableObject, net.sourceforge.czt.core.jaxb.gen.impl.runtime.XMLSerializable, net.sourceforge.czt.core.jaxb.gen.impl.runtime.ValidatableObject
{

    protected com.sun.xml.bind.util.ListImpl _NameSectTypeTriple = new com.sun.xml.bind.util.ListImpl(new java.util.ArrayList());
    public final static java.lang.Class version = (net.sourceforge.czt.core.jaxb.gen.impl.JAXBVersion.class);
    private static com.sun.msv.grammar.Grammar schemaFragment;

    private final static java.lang.Class PRIMARY_INTERFACE_CLASS() {
        return (net.sourceforge.czt.core.jaxb.gen.SectTypeEnvAnn.class);
    }

    public java.util.List getNameSectTypeTriple() {
        return _NameSectTypeTriple;
    }

    public net.sourceforge.czt.core.jaxb.gen.impl.runtime.UnmarshallingEventHandler createUnmarshaller(net.sourceforge.czt.core.jaxb.gen.impl.runtime.UnmarshallingContext context) {
        return new net.sourceforge.czt.core.jaxb.gen.impl.SectTypeEnvAnnImpl.Unmarshaller(context);
    }

    public void serializeElementBody(net.sourceforge.czt.core.jaxb.gen.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        int idx1 = 0;
        final int len1 = _NameSectTypeTriple.size();
        super.serializeElementBody(context);
        while (idx1 != len1) {
            if (_NameSectTypeTriple.get(idx1) instanceof javax.xml.bind.Element) {
                context.childAsElementBody(((com.sun.xml.bind.JAXBObject) _NameSectTypeTriple.get(idx1 ++)));
            } else {
                context.startElement("http://czt.sourceforge.net/zml", "NameSectTypeTriple");
                int idx_0 = idx1;
                context.childAsURIs(((com.sun.xml.bind.JAXBObject) _NameSectTypeTriple.get(idx_0 ++)));
                context.endNamespaceDecls();
                int idx_1 = idx1;
                context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _NameSectTypeTriple.get(idx_1 ++)));
                context.endAttributes();
                context.childAsElementBody(((com.sun.xml.bind.JAXBObject) _NameSectTypeTriple.get(idx1 ++)));
                context.endElement();
            }
        }
    }

    public void serializeAttributes(net.sourceforge.czt.core.jaxb.gen.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        int idx1 = 0;
        final int len1 = _NameSectTypeTriple.size();
        super.serializeAttributes(context);
    }

    public void serializeAttributeBody(net.sourceforge.czt.core.jaxb.gen.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        int idx1 = 0;
        final int len1 = _NameSectTypeTriple.size();
        super.serializeAttributeBody(context);
        while (idx1 != len1) {
            if (_NameSectTypeTriple.get(idx1) instanceof javax.xml.bind.Element) {
                context.childAsAttributeBody(((com.sun.xml.bind.JAXBObject) _NameSectTypeTriple.get(idx1 ++)));
            } else {
                context.startElement("http://czt.sourceforge.net/zml", "NameSectTypeTriple");
                int idx_0 = idx1;
                context.childAsURIs(((com.sun.xml.bind.JAXBObject) _NameSectTypeTriple.get(idx_0 ++)));
                context.endNamespaceDecls();
                int idx_1 = idx1;
                context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _NameSectTypeTriple.get(idx_1 ++)));
                context.endAttributes();
                context.childAsElementBody(((com.sun.xml.bind.JAXBObject) _NameSectTypeTriple.get(idx1 ++)));
                context.endElement();
            }
        }
    }

    public void serializeURIs(net.sourceforge.czt.core.jaxb.gen.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        int idx1 = 0;
        final int len1 = _NameSectTypeTriple.size();
        super.serializeURIs(context);
    }

    public java.lang.Class getPrimaryInterface() {
        return (net.sourceforge.czt.core.jaxb.gen.SectTypeEnvAnn.class);
    }

    public com.sun.msv.verifier.DocumentDeclaration createRawValidator() {
        if (schemaFragment == null) {
            schemaFragment = com.sun.xml.bind.validator.SchemaDeserializer.deserialize((
 "\u00ac\u00ed\u0000\u0005sr\u0000\u001dcom.sun.msv.grammar.ChoiceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun."
+"msv.grammar.BinaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0004exp1t\u0000 Lcom/sun/msv/gramm"
+"ar/Expression;L\u0000\u0004exp2q\u0000~\u0000\u0002xr\u0000\u001ecom.sun.msv.grammar.Expression"
+"\u00f8\u0018\u0082\u00e8N5~O\u0002\u0000\u0003I\u0000\u000ecachedHashCodeL\u0000\u0013epsilonReducibilityt\u0000\u0013Ljava/l"
+"ang/Boolean;L\u0000\u000bexpandedExpq\u0000~\u0000\u0002xp\u0002\u0080:\u00afppsr\u0000 com.sun.msv.gramm"
+"ar.OneOrMoreExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001ccom.sun.msv.grammar.UnaryExp\u0000\u0000"
+"\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\u0003expq\u0000~\u0000\u0002xq\u0000~\u0000\u0003\u0002\u0080:\u00a4sr\u0000\u0011java.lang.Boolean\u00cd r\u0080\u00d5\u009c\u00fa\u00ee\u0002"
+"\u0000\u0001Z\u0000\u0005valuexp\u0000psq\u0000~\u0000\u0000\u0002\u0080:\u00a1q\u0000~\u0000\npsr\u0000\'com.sun.msv.grammar.trex.E"
+"lementPattern\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\tnameClasst\u0000\u001fLcom/sun/msv/grammar/"
+"NameClass;xr\u0000\u001ecom.sun.msv.grammar.ElementExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002Z\u0000\u001aig"
+"noreUndeclaredAttributesL\u0000\fcontentModelq\u0000~\u0000\u0002xq\u0000~\u0000\u0003\u0001@\u001dUq\u0000~\u0000\np"
+"\u0000sq\u0000~\u0000\f\u0001@\u001dJpp\u0000sq\u0000~\u0000\u0000\u0001@\u001d?ppsq\u0000~\u0000\u0006\u0001@\u001d4q\u0000~\u0000\npsr\u0000 com.sun.msv.gr"
+"ammar.AttributeExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003expq\u0000~\u0000\u0002L\u0000\tnameClassq\u0000~\u0000\rxq\u0000"
+"~\u0000\u0003\u0001@\u001d1q\u0000~\u0000\npsr\u00002com.sun.msv.grammar.Expression$AnyStringExp"
+"ression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003\u0000\u0000\u0000\bsq\u0000~\u0000\t\u0001q\u0000~\u0000\u0016sr\u0000 com.sun.msv.gram"
+"mar.AnyNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun.msv.grammar.NameClass"
+"\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com.sun.msv.grammar.Expression$EpsilonExpre"
+"ssion\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003\u0000\u0000\u0000\tq\u0000~\u0000\u0017q\u0000~\u0000\u001csr\u0000#com.sun.msv.grammar."
+"SimpleNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\tlocalNamet\u0000\u0012Ljava/lang/String;L"
+"\u0000\fnamespaceURIq\u0000~\u0000\u001exq\u0000~\u0000\u0019t\u00004net.sourceforge.czt.core.jaxb.ge"
+"n.NameSectTypeTriplet\u0000+http://java.sun.com/jaxb/xjc/dummy-el"
+"ementssq\u0000~\u0000\u001dt\u0000\u0012NameSectTypeTriplet\u0000\u001ehttp://czt.sourceforge.n"
+"et/zmlsq\u0000~\u0000\f\u0001@\u001dJq\u0000~\u0000\np\u0000sq\u0000~\u0000\u0000\u0001@\u001d?ppsq\u0000~\u0000\u0006\u0001@\u001d4q\u0000~\u0000\npsq\u0000~\u0000\u0013\u0001@\u001d"
+"1q\u0000~\u0000\npq\u0000~\u0000\u0016q\u0000~\u0000\u001aq\u0000~\u0000\u001csq\u0000~\u0000\u001dt\u0000;net.sourceforge.czt.core.jaxb"
+".gen.NameSectTypeTripleElementq\u0000~\u0000!q\u0000~\u0000\u001csr\u0000\"com.sun.msv.gram"
+"mar.ExpressionPool\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\bexpTablet\u0000/Lcom/sun/msv/gram"
+"mar/ExpressionPool$ClosedHash;xpsr\u0000-com.sun.msv.grammar.Expr"
+"essionPool$ClosedHash\u00d7j\u00d0N\u00ef\u00e8\u00ed\u001c\u0002\u0000\u0004I\u0000\u0005countI\u0000\tthresholdL\u0000\u0006paren"
+"tq\u0000~\u0000,[\u0000\u0005tablet\u0000![Lcom/sun/msv/grammar/Expression;xp\u0000\u0000\u0000\u0007\u0000\u0000\u00009"
+"pur\u0000![Lcom.sun.msv.grammar.Expression;\u00d68D\u00c3]\u00ad\u00a7\n\u0002\u0000\u0000xp\u0000\u0000\u0000\u00bfppppp"
+"pppppppppppppppppppppppppppppppppppppppppppppppppppppppppppp"
+"pppppppppppppppppppppppppppppppppppppppppppppppppppppppppppq"
+"\u0000~\u0000\u000bppq\u0000~\u0000\bpq\u0000~\u0000\u0012q\u0000~\u0000\'pppppppq\u0000~\u0000\u0005pq\u0000~\u0000\u0011q\u0000~\u0000&ppppppppppppppp"
+"pppppppppppppppppppppppppppppppppp"));
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
            return net.sourceforge.czt.core.jaxb.gen.impl.SectTypeEnvAnnImpl.this;
        }

        public void enterElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname, org.xml.sax.Attributes __atts)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  2 :
                        if (("Name" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _NameSectTypeTriple.add(((net.sourceforge.czt.core.jaxb.gen.impl.NameSectTypeTripleImpl) spawnChildFromEnterElement((net.sourceforge.czt.core.jaxb.gen.impl.NameSectTypeTripleImpl.class), 3, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        break;
                    case  0 :
                        spawnHandlerFromEnterElement((((net.sourceforge.czt.core.jaxb.gen.impl.AnnImpl)net.sourceforge.czt.core.jaxb.gen.impl.SectTypeEnvAnnImpl.this).new Unmarshaller(context)), 1, ___uri, ___local, ___qname, __atts);
                        return ;
                    case  4 :
                        if (("NameSectTypeTriple" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 2;
                            return ;
                        }
                        revertToParentFromEnterElement(___uri, ___local, ___qname, __atts);
                        return ;
                    case  1 :
                        if (("NameSectTypeTriple" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 2;
                            return ;
                        }
                        state = 4;
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
                    case  0 :
                        spawnHandlerFromLeaveElement((((net.sourceforge.czt.core.jaxb.gen.impl.AnnImpl)net.sourceforge.czt.core.jaxb.gen.impl.SectTypeEnvAnnImpl.this).new Unmarshaller(context)), 1, ___uri, ___local, ___qname);
                        return ;
                    case  4 :
                        revertToParentFromLeaveElement(___uri, ___local, ___qname);
                        return ;
                    case  1 :
                        state = 4;
                        continue outer;
                    case  3 :
                        if (("NameSectTypeTriple" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
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
                    case  0 :
                        spawnHandlerFromEnterAttribute((((net.sourceforge.czt.core.jaxb.gen.impl.AnnImpl)net.sourceforge.czt.core.jaxb.gen.impl.SectTypeEnvAnnImpl.this).new Unmarshaller(context)), 1, ___uri, ___local, ___qname);
                        return ;
                    case  4 :
                        revertToParentFromEnterAttribute(___uri, ___local, ___qname);
                        return ;
                    case  1 :
                        state = 4;
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
                    case  0 :
                        spawnHandlerFromLeaveAttribute((((net.sourceforge.czt.core.jaxb.gen.impl.AnnImpl)net.sourceforge.czt.core.jaxb.gen.impl.SectTypeEnvAnnImpl.this).new Unmarshaller(context)), 1, ___uri, ___local, ___qname);
                        return ;
                    case  4 :
                        revertToParentFromLeaveAttribute(___uri, ___local, ___qname);
                        return ;
                    case  1 :
                        state = 4;
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
                        case  0 :
                            spawnHandlerFromText((((net.sourceforge.czt.core.jaxb.gen.impl.AnnImpl)net.sourceforge.czt.core.jaxb.gen.impl.SectTypeEnvAnnImpl.this).new Unmarshaller(context)), 1, value);
                            return ;
                        case  4 :
                            revertToParentFromText(value);
                            return ;
                        case  1 :
                            state = 4;
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
