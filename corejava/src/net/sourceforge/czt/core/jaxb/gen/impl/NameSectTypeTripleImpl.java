//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.2-b15-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2003.10.28 at 04:14:13 NZDT 
//


package net.sourceforge.czt.core.jaxb.gen.impl;

public class NameSectTypeTripleImpl implements net.sourceforge.czt.core.jaxb.gen.NameSectTypeTriple, com.sun.xml.bind.JAXBObject, net.sourceforge.czt.core.jaxb.gen.impl.runtime.UnmarshallableObject, net.sourceforge.czt.core.jaxb.gen.impl.runtime.XMLSerializable, net.sourceforge.czt.core.jaxb.gen.impl.runtime.ValidatableObject
{

    protected net.sourceforge.czt.core.jaxb.gen.Type _Type;
    protected net.sourceforge.czt.core.jaxb.gen.DeclName _Name;
    protected java.lang.String _Sect;
    public final static java.lang.Class version = (net.sourceforge.czt.core.jaxb.gen.impl.JAXBVersion.class);
    private static com.sun.msv.grammar.Grammar schemaFragment;

    private final static java.lang.Class PRIMARY_INTERFACE_CLASS() {
        return (net.sourceforge.czt.core.jaxb.gen.NameSectTypeTriple.class);
    }

    public net.sourceforge.czt.core.jaxb.gen.Type getType() {
        return _Type;
    }

    public void setType(net.sourceforge.czt.core.jaxb.gen.Type value) {
        _Type = value;
    }

    public net.sourceforge.czt.core.jaxb.gen.DeclName getName() {
        return _Name;
    }

    public void setName(net.sourceforge.czt.core.jaxb.gen.DeclName value) {
        _Name = value;
    }

    public java.lang.String getSect() {
        return _Sect;
    }

    public void setSect(java.lang.String value) {
        _Sect = value;
    }

    public net.sourceforge.czt.core.jaxb.gen.impl.runtime.UnmarshallingEventHandler createUnmarshaller(net.sourceforge.czt.core.jaxb.gen.impl.runtime.UnmarshallingContext context) {
        return new net.sourceforge.czt.core.jaxb.gen.impl.NameSectTypeTripleImpl.Unmarshaller(context);
    }

    public void serializeBody(net.sourceforge.czt.core.jaxb.gen.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        context.startElement("http://czt.sourceforge.net/zml", "Name");
        context.childAsURIs(((com.sun.xml.bind.JAXBObject) _Name), "Name");
        context.endNamespaceDecls();
        context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _Name), "Name");
        context.endAttributes();
        context.childAsBody(((com.sun.xml.bind.JAXBObject) _Name), "Name");
        context.endElement();
        context.startElement("http://czt.sourceforge.net/zml", "Sect");
        context.endNamespaceDecls();
        context.endAttributes();
        try {
            context.text(((java.lang.String) _Sect), "Sect");
        } catch (java.lang.Exception e) {
            net.sourceforge.czt.core.jaxb.gen.impl.runtime.Util.handlePrintConversionException(this, e, context);
        }
        context.endElement();
        if (_Type instanceof javax.xml.bind.Element) {
            context.childAsBody(((com.sun.xml.bind.JAXBObject) _Type), "Type");
        } else {
            context.startElement("http://czt.sourceforge.net/zml", "Type");
            context.childAsURIs(((com.sun.xml.bind.JAXBObject) _Type), "Type");
            context.endNamespaceDecls();
            context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _Type), "Type");
            context.endAttributes();
            context.childAsBody(((com.sun.xml.bind.JAXBObject) _Type), "Type");
            context.endElement();
        }
    }

    public void serializeAttributes(net.sourceforge.czt.core.jaxb.gen.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        if (_Type instanceof javax.xml.bind.Element) {
            context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _Type), "Type");
        }
    }

    public void serializeURIs(net.sourceforge.czt.core.jaxb.gen.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        if (_Type instanceof javax.xml.bind.Element) {
            context.childAsURIs(((com.sun.xml.bind.JAXBObject) _Type), "Type");
        }
    }

    public java.lang.Class getPrimaryInterface() {
        return (net.sourceforge.czt.core.jaxb.gen.NameSectTypeTriple.class);
    }

    public com.sun.msv.verifier.DocumentDeclaration createRawValidator() {
        if (schemaFragment == null) {
            schemaFragment = com.sun.xml.bind.validator.SchemaDeserializer.deserialize((
 "\u00ac\u00ed\u0000\u0005sr\u0000\u001fcom.sun.msv.grammar.SequenceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.su"
+"n.msv.grammar.BinaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0004exp1t\u0000 Lcom/sun/msv/gra"
+"mmar/Expression;L\u0000\u0004exp2q\u0000~\u0000\u0002xr\u0000\u001ecom.sun.msv.grammar.Expressi"
+"on\u00f8\u0018\u0082\u00e8N5~O\u0002\u0000\u0003I\u0000\u000ecachedHashCodeL\u0000\u0013epsilonReducibilityt\u0000\u0013Ljava"
+"/lang/Boolean;L\u0000\u000bexpandedExpq\u0000~\u0000\u0002xp\b\u00d3\"sppsq\u0000~\u0000\u0000\u0006j\u00be\u00adppsr\u0000\'com"
+".sun.msv.grammar.trex.ElementPattern\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\tnameClasst"
+"\u0000\u001fLcom/sun/msv/grammar/NameClass;xr\u0000\u001ecom.sun.msv.grammar.Ele"
+"mentExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002Z\u0000\u001aignoreUndeclaredAttributesL\u0000\fcontentMod"
+"elq\u0000~\u0000\u0002xq\u0000~\u0000\u0003\u0002g\u00c9\bpp\u0000sq\u0000~\u0000\u0000\u0002g\u00c8\u00fdppsq\u0000~\u0000\u0007\u0000{G%pp\u0000sr\u0000\u001dcom.sun.msv"
+".grammar.ChoiceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0001\u0000{G\u001appsr\u0000 com.sun.msv.gra"
+"mmar.OneOrMoreExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001ccom.sun.msv.grammar.UnaryExp"
+"\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\u0003expq\u0000~\u0000\u0002xq\u0000~\u0000\u0003\u0000{G\u000fsr\u0000\u0011java.lang.Boolean\u00cd r\u0080\u00d5\u009c\u00fa"
+"\u00ee\u0002\u0000\u0001Z\u0000\u0005valuexp\u0000psr\u0000 com.sun.msv.grammar.AttributeExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001"
+"\u0002\u0000\u0002L\u0000\u0003expq\u0000~\u0000\u0002L\u0000\tnameClassq\u0000~\u0000\bxq\u0000~\u0000\u0003\u0000{G\fq\u0000~\u0000\u0013psr\u00002com.sun.m"
+"sv.grammar.Expression$AnyStringExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003\u0000\u0000"
+"\u0000\bsq\u0000~\u0000\u0012\u0001q\u0000~\u0000\u0017sr\u0000 com.sun.msv.grammar.AnyNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000"
+"\u0000xr\u0000\u001dcom.sun.msv.grammar.NameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com.sun.m"
+"sv.grammar.Expression$EpsilonExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003\u0000\u0000\u0000\t"
+"q\u0000~\u0000\u0018q\u0000~\u0000\u001dsr\u0000#com.sun.msv.grammar.SimpleNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002"
+"L\u0000\tlocalNamet\u0000\u0012Ljava/lang/String;L\u0000\fnamespaceURIq\u0000~\u0000\u001fxq\u0000~\u0000\u001at"
+"\u0000*net.sourceforge.czt.core.jaxb.gen.DeclNamet\u0000+http://java.s"
+"un.com/jaxb/xjc/dummy-elementssq\u0000~\u0000\r\u0001\u00ec\u0081\u00d3ppsq\u0000~\u0000\u0014\u0001\u00ec\u0081\u00c8q\u0000~\u0000\u0013psr"
+"\u0000\u001bcom.sun.msv.grammar.DataExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\u0002dtt\u0000\u001fLorg/relaxng"
+"/datatype/Datatype;L\u0000\u0006exceptq\u0000~\u0000\u0002L\u0000\u0004namet\u0000\u001dLcom/sun/msv/util"
+"/StringPair;xq\u0000~\u0000\u0003\u0001d\u00b9\u00c6ppsr\u0000\"com.sun.msv.datatype.xsd.QnameTy"
+"pe\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000*com.sun.msv.datatype.xsd.BuiltinAtomicType\u0000"
+"\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000%com.sun.msv.datatype.xsd.ConcreteType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002"
+"\u0000\u0000xr\u0000\'com.sun.msv.datatype.xsd.XSDatatypeImpl\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\fn"
+"amespaceUriq\u0000~\u0000\u001fL\u0000\btypeNameq\u0000~\u0000\u001fL\u0000\nwhiteSpacet\u0000.Lcom/sun/msv"
+"/datatype/xsd/WhiteSpaceProcessor;xpt\u0000 http://www.w3.org/200"
+"1/XMLSchemat\u0000\u0005QNamesr\u00005com.sun.msv.datatype.xsd.WhiteSpacePr"
+"ocessor$Collapse\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000,com.sun.msv.datatype.xsd.Whit"
+"eSpaceProcessor\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com.sun.msv.grammar.Expressi"
+"on$NullSetExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003\u0000\u0000\u0000\nq\u0000~\u0000\u0013psr\u0000\u001bcom.sun.m"
+"sv.util.StringPair\u00d0t\u001ejB\u008f\u008d\u00a0\u0002\u0000\u0002L\u0000\tlocalNameq\u0000~\u0000\u001fL\u0000\fnamespaceUR"
+"Iq\u0000~\u0000\u001fxpq\u0000~\u00000q\u0000~\u0000/sq\u0000~\u0000\u001et\u0000\u0004typet\u0000)http://www.w3.org/2001/XML"
+"Schema-instanceq\u0000~\u0000\u001dsq\u0000~\u0000\u001et\u0000\u0004Namet\u0000\u001ehttp://czt.sourceforge.n"
+"et/zmlsq\u0000~\u0000\u0007\u0004\u0002\u00f5\u00a0pp\u0000sq\u0000~\u0000\u0000\u0004\u0002\u00f5\u0095ppsq\u0000~\u0000%\u0001\u00e3\u00d8\u001cq\u0000~\u0000\u0013psr\u0000#com.sun.m"
+"sv.datatype.xsd.StringType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001Z\u0000\risAlwaysValidxq\u0000~\u0000*q"
+"\u0000~\u0000/t\u0000\u0006stringsr\u00005com.sun.msv.datatype.xsd.WhiteSpaceProcesso"
+"r$Preserve\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u00002\u0001q\u0000~\u00005sq\u0000~\u00006q\u0000~\u0000Cq\u0000~\u0000/sq\u0000~\u0000\r\u0002\u001f\u001dtp"
+"psq\u0000~\u0000\u0014\u0002\u001f\u001diq\u0000~\u0000\u0013pq\u0000~\u0000(sq\u0000~\u0000\u001eq\u0000~\u00009q\u0000~\u0000:q\u0000~\u0000\u001dsq\u0000~\u0000\u001et\u0000\u0004Sectq\u0000~\u0000"
+"=sq\u0000~\u0000\r\u0002hc\u00c1ppsq\u0000~\u0000\r\u0001\u00ed\u001c\u009appsq\u0000~\u0000\r\u0001q\u00d5sppsq\u0000~\u0000\r\u0000\u00f6\u008eLppsq\u0000~\u0000\u0007\u0000{G%p"
+"p\u0000sq\u0000~\u0000\r\u0000{G\u001appsq\u0000~\u0000\u000f\u0000{G\u000fq\u0000~\u0000\u0013psq\u0000~\u0000\u0014\u0000{G\fq\u0000~\u0000\u0013pq\u0000~\u0000\u0017q\u0000~\u0000\u001bq\u0000~\u0000"
+"\u001dsq\u0000~\u0000\u001et\u00003net.sourceforge.czt.core.jaxb.gen.SchemaTypeElemen"
+"tq\u0000~\u0000\"sq\u0000~\u0000\u0007\u0000{G%pp\u0000sq\u0000~\u0000\r\u0000{G\u001appsq\u0000~\u0000\u000f\u0000{G\u000fq\u0000~\u0000\u0013psq\u0000~\u0000\u0014\u0000{G\fq\u0000~"
+"\u0000\u0013pq\u0000~\u0000\u0017q\u0000~\u0000\u001bq\u0000~\u0000\u001dsq\u0000~\u0000\u001et\u00001net.sourceforge.czt.core.jaxb.gen"
+".ProdTypeElementq\u0000~\u0000\"sq\u0000~\u0000\u0007\u0000{G%pp\u0000sq\u0000~\u0000\r\u0000{G\u001appsq\u0000~\u0000\u000f\u0000{G\u000fq\u0000~\u0000"
+"\u0013psq\u0000~\u0000\u0014\u0000{G\fq\u0000~\u0000\u0013pq\u0000~\u0000\u0017q\u0000~\u0000\u001bq\u0000~\u0000\u001dsq\u0000~\u0000\u001et\u00002net.sourceforge.cz"
+"t.core.jaxb.gen.GivenTypeElementq\u0000~\u0000\"sq\u0000~\u0000\u0007\u0000{G%pp\u0000sq\u0000~\u0000\r\u0000{G\u001a"
+"ppsq\u0000~\u0000\u000f\u0000{G\u000fq\u0000~\u0000\u0013psq\u0000~\u0000\u0014\u0000{G\fq\u0000~\u0000\u0013pq\u0000~\u0000\u0017q\u0000~\u0000\u001bq\u0000~\u0000\u001dsq\u0000~\u0000\u001et\u00000ne"
+"t.sourceforge.czt.core.jaxb.gen.GenTypeElementq\u0000~\u0000\"sq\u0000~\u0000\u0007\u0000{G"
+"%pp\u0000sq\u0000~\u0000\r\u0000{G\u001appsq\u0000~\u0000\u000f\u0000{G\u000fq\u0000~\u0000\u0013psq\u0000~\u0000\u0014\u0000{G\fq\u0000~\u0000\u0013pq\u0000~\u0000\u0017q\u0000~\u0000\u001bq\u0000"
+"~\u0000\u001dsq\u0000~\u0000\u001et\u00002net.sourceforge.czt.core.jaxb.gen.PowerTypeEleme"
+"ntq\u0000~\u0000\"sr\u0000\"com.sun.msv.grammar.ExpressionPool\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\be"
+"xpTablet\u0000/Lcom/sun/msv/grammar/ExpressionPool$ClosedHash;xps"
+"r\u0000-com.sun.msv.grammar.ExpressionPool$ClosedHash\u00d7j\u00d0N\u00ef\u00e8\u00ed\u001c\u0002\u0000\u0004I"
+"\u0000\u0005countI\u0000\tthresholdL\u0000\u0006parentq\u0000~\u0000o[\u0000\u0005tablet\u0000![Lcom/sun/msv/gr"
+"ammar/Expression;xp\u0000\u0000\u0000\u0016\u0000\u0000\u00009pur\u0000![Lcom.sun.msv.grammar.Expres"
+"sion;\u00d68D\u00c3]\u00ad\u00a7\n\u0002\u0000\u0000xp\u0000\u0000\u0000\u00bfppppppppppq\u0000~\u0000\u0011q\u0000~\u0000Rq\u0000~\u0000Xq\u0000~\u0000^q\u0000~\u0000dq\u0000~"
+"\u0000jpppppq\u0000~\u0000\u000eq\u0000~\u0000Qq\u0000~\u0000Wq\u0000~\u0000]q\u0000~\u0000cq\u0000~\u0000ipppppppppppq\u0000~\u0000\u0005ppppppp"
+"ppq\u0000~\u0000#pppppppq\u0000~\u0000\u0006pppppppppq\u0000~\u0000Oppppppppppppppppppq\u0000~\u0000\u000bpppp"
+"ppppppppppq\u0000~\u0000Npppppppppppppppppppppppppppppppppq\u0000~\u0000Mq\u0000~\u0000?pp"
+"pppppppppppppppppppppppppppq\u0000~\u0000Gppq\u0000~\u0000Lppppppppppppppppppppp"
+"p"));
        }
        return new com.sun.msv.verifier.regexp.REDocumentDeclaration(schemaFragment);
    }

    public class Unmarshaller
        extends net.sourceforge.czt.core.jaxb.gen.impl.runtime.AbstractUnmarshallingEventHandlerImpl
    {


        public Unmarshaller(net.sourceforge.czt.core.jaxb.gen.impl.runtime.UnmarshallingContext context) {
            super(context, "----------");
        }

        protected Unmarshaller(net.sourceforge.czt.core.jaxb.gen.impl.runtime.UnmarshallingContext context, int startState) {
            this(context);
            state = startState;
        }

        public java.lang.Object owner() {
            return net.sourceforge.czt.core.jaxb.gen.impl.NameSectTypeTripleImpl.this;
        }

        public void enterElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname, org.xml.sax.Attributes __atts)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  7 :
                        if (("Anns" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Type = ((net.sourceforge.czt.core.jaxb.gen.impl.TypeImpl) spawnChildFromEnterElement((net.sourceforge.czt.core.jaxb.gen.impl.TypeImpl.class), 8, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        _Type = ((net.sourceforge.czt.core.jaxb.gen.impl.TypeImpl) spawnChildFromEnterElement((net.sourceforge.czt.core.jaxb.gen.impl.TypeImpl.class), 8, ___uri, ___local, ___qname, __atts));
                        return ;
                    case  0 :
                        if (("Name" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 1;
                            return ;
                        }
                        break;
                    case  9 :
                        revertToParentFromEnterElement(___uri, ___local, ___qname, __atts);
                        return ;
                    case  3 :
                        if (("Sect" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            context.pushAttributes(__atts, true);
                            state = 4;
                            return ;
                        }
                        break;
                    case  1 :
                        attIdx = context.getAttribute("", "Id");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().enterElement(___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("Anns" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Name = ((net.sourceforge.czt.core.jaxb.gen.impl.DeclNameImpl) spawnChildFromEnterElement((net.sourceforge.czt.core.jaxb.gen.impl.DeclNameImpl.class), 2, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("Word" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Name = ((net.sourceforge.czt.core.jaxb.gen.impl.DeclNameImpl) spawnChildFromEnterElement((net.sourceforge.czt.core.jaxb.gen.impl.DeclNameImpl.class), 2, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        _Name = ((net.sourceforge.czt.core.jaxb.gen.impl.DeclNameImpl) spawnChildFromEnterElement((net.sourceforge.czt.core.jaxb.gen.impl.DeclNameImpl.class), 2, ___uri, ___local, ___qname, __atts));
                        return ;
                    case  6 :
                        if (("SchemaType" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Type = ((net.sourceforge.czt.core.jaxb.gen.impl.SchemaTypeElementImpl) spawnChildFromEnterElement((net.sourceforge.czt.core.jaxb.gen.impl.SchemaTypeElementImpl.class), 9, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("ProdType" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Type = ((net.sourceforge.czt.core.jaxb.gen.impl.ProdTypeElementImpl) spawnChildFromEnterElement((net.sourceforge.czt.core.jaxb.gen.impl.ProdTypeElementImpl.class), 9, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("GivenType" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Type = ((net.sourceforge.czt.core.jaxb.gen.impl.GivenTypeElementImpl) spawnChildFromEnterElement((net.sourceforge.czt.core.jaxb.gen.impl.GivenTypeElementImpl.class), 9, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("GenType" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Type = ((net.sourceforge.czt.core.jaxb.gen.impl.GenTypeElementImpl) spawnChildFromEnterElement((net.sourceforge.czt.core.jaxb.gen.impl.GenTypeElementImpl.class), 9, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("PowerType" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Type = ((net.sourceforge.czt.core.jaxb.gen.impl.PowerTypeElementImpl) spawnChildFromEnterElement((net.sourceforge.czt.core.jaxb.gen.impl.PowerTypeElementImpl.class), 9, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("Type" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 7;
                            return ;
                        }
                        if (("Type" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Type = ((net.sourceforge.czt.core.jaxb.gen.impl.TypeElementImpl) spawnChildFromEnterElement((net.sourceforge.czt.core.jaxb.gen.impl.TypeElementImpl.class), 9, ___uri, ___local, ___qname, __atts));
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
                    case  7 :
                        _Type = ((net.sourceforge.czt.core.jaxb.gen.impl.TypeImpl) spawnChildFromLeaveElement((net.sourceforge.czt.core.jaxb.gen.impl.TypeImpl.class), 8, ___uri, ___local, ___qname));
                        return ;
                    case  9 :
                        revertToParentFromLeaveElement(___uri, ___local, ___qname);
                        return ;
                    case  8 :
                        if (("Type" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            context.popAttributes();
                            state = 9;
                            return ;
                        }
                        break;
                    case  1 :
                        attIdx = context.getAttribute("", "Id");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveElement(___uri, ___local, ___qname);
                            return ;
                        }
                        _Name = ((net.sourceforge.czt.core.jaxb.gen.impl.DeclNameImpl) spawnChildFromLeaveElement((net.sourceforge.czt.core.jaxb.gen.impl.DeclNameImpl.class), 2, ___uri, ___local, ___qname));
                        return ;
                    case  5 :
                        if (("Sect" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            context.popAttributes();
                            state = 6;
                            return ;
                        }
                        break;
                    case  2 :
                        if (("Name" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
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
                    case  7 :
                        _Type = ((net.sourceforge.czt.core.jaxb.gen.impl.TypeImpl) spawnChildFromEnterAttribute((net.sourceforge.czt.core.jaxb.gen.impl.TypeImpl.class), 8, ___uri, ___local, ___qname));
                        return ;
                    case  9 :
                        revertToParentFromEnterAttribute(___uri, ___local, ___qname);
                        return ;
                    case  1 :
                        if (("Id" == ___local)&&("" == ___uri)) {
                            _Name = ((net.sourceforge.czt.core.jaxb.gen.impl.DeclNameImpl) spawnChildFromEnterAttribute((net.sourceforge.czt.core.jaxb.gen.impl.DeclNameImpl.class), 2, ___uri, ___local, ___qname));
                            return ;
                        }
                        _Name = ((net.sourceforge.czt.core.jaxb.gen.impl.DeclNameImpl) spawnChildFromEnterAttribute((net.sourceforge.czt.core.jaxb.gen.impl.DeclNameImpl.class), 2, ___uri, ___local, ___qname));
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
                    case  7 :
                        _Type = ((net.sourceforge.czt.core.jaxb.gen.impl.TypeImpl) spawnChildFromLeaveAttribute((net.sourceforge.czt.core.jaxb.gen.impl.TypeImpl.class), 8, ___uri, ___local, ___qname));
                        return ;
                    case  9 :
                        revertToParentFromLeaveAttribute(___uri, ___local, ___qname);
                        return ;
                    case  1 :
                        attIdx = context.getAttribute("", "Id");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveAttribute(___uri, ___local, ___qname);
                            return ;
                        }
                        _Name = ((net.sourceforge.czt.core.jaxb.gen.impl.DeclNameImpl) spawnChildFromLeaveAttribute((net.sourceforge.czt.core.jaxb.gen.impl.DeclNameImpl.class), 2, ___uri, ___local, ___qname));
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
                        case  7 :
                            _Type = ((net.sourceforge.czt.core.jaxb.gen.impl.TypeImpl) spawnChildFromText((net.sourceforge.czt.core.jaxb.gen.impl.TypeImpl.class), 8, value));
                            return ;
                        case  9 :
                            revertToParentFromText(value);
                            return ;
                        case  1 :
                            attIdx = context.getAttribute("", "Id");
                            if (attIdx >= 0) {
                                context.consumeAttribute(attIdx);
                                context.getCurrentHandler().text(value);
                                return ;
                            }
                            _Name = ((net.sourceforge.czt.core.jaxb.gen.impl.DeclNameImpl) spawnChildFromText((net.sourceforge.czt.core.jaxb.gen.impl.DeclNameImpl.class), 2, value));
                            return ;
                        case  4 :
                            eatText1(value);
                            state = 5;
                            return ;
                    }
                } catch (java.lang.RuntimeException e) {
                    handleUnexpectedTextException(value, e);
                }
                break;
            }
        }

        private void eatText1(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            try {
                _Sect = value;
            } catch (java.lang.Exception e) {
                handleParseConversionException(e);
            }
        }

    }

}
