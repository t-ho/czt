//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.1-05/30/2003 05:06 AM(java_re)-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2003.08.20 at 09:36:24 NZST 
//


package net.sourceforge.czt.core.jaxb.gen.impl;

public class AxParaImpl
    extends net.sourceforge.czt.core.jaxb.gen.impl.ParaImpl
    implements net.sourceforge.czt.core.jaxb.gen.AxPara, com.sun.xml.bind.JAXBObject, net.sourceforge.czt.core.jaxb.gen.impl.runtime.UnmarshallableObject, net.sourceforge.czt.core.jaxb.gen.impl.runtime.XMLSerializable, net.sourceforge.czt.core.jaxb.gen.impl.runtime.ValidatableObject
{

    protected net.sourceforge.czt.core.jaxb.gen.SchText _SchText;
    protected java.lang.String _Box;
    protected com.sun.xml.bind.util.ListImpl _DeclName = new com.sun.xml.bind.util.ListImpl(new java.util.ArrayList());
    public final static java.lang.Class version = (net.sourceforge.czt.core.jaxb.gen.impl.JAXBVersion.class);
    private static com.sun.msv.grammar.Grammar schemaFragment;

    private final static java.lang.Class PRIMARY_INTERFACE_CLASS() {
        return (net.sourceforge.czt.core.jaxb.gen.AxPara.class);
    }

    public net.sourceforge.czt.core.jaxb.gen.SchText getSchText() {
        return _SchText;
    }

    public void setSchText(net.sourceforge.czt.core.jaxb.gen.SchText value) {
        _SchText = value;
    }

    public java.lang.String getBox() {
        if (_Box == null) {
            return "AxBox";
        } else {
            return _Box;
        }
    }

    public void setBox(java.lang.String value) {
        _Box = value;
    }

    public java.util.List getDeclName() {
        return _DeclName;
    }

    public net.sourceforge.czt.core.jaxb.gen.impl.runtime.UnmarshallingEventHandler createUnmarshaller(net.sourceforge.czt.core.jaxb.gen.impl.runtime.UnmarshallingContext context) {
        return new net.sourceforge.czt.core.jaxb.gen.impl.AxParaImpl.Unmarshaller(context);
    }

    public void serializeElementBody(net.sourceforge.czt.core.jaxb.gen.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        int idx3 = 0;
        final int len3 = _DeclName.size();
        super.serializeElementBody(context);
        while (idx3 != len3) {
            if (_DeclName.get(idx3) instanceof javax.xml.bind.Element) {
                context.childAsElementBody(((com.sun.xml.bind.JAXBObject) _DeclName.get(idx3 ++)));
            } else {
                context.startElement("http://czt.sourceforge.net/zml", "DeclName");
                int idx_0 = idx3;
                context.childAsURIs(((com.sun.xml.bind.JAXBObject) _DeclName.get(idx_0 ++)));
                context.endNamespaceDecls();
                int idx_1 = idx3;
                context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _DeclName.get(idx_1 ++)));
                context.endAttributes();
                context.childAsElementBody(((com.sun.xml.bind.JAXBObject) _DeclName.get(idx3 ++)));
                context.endElement();
            }
        }
        if (_SchText instanceof javax.xml.bind.Element) {
            context.childAsElementBody(((com.sun.xml.bind.JAXBObject) _SchText));
        } else {
            context.startElement("http://czt.sourceforge.net/zml", "SchText");
            context.childAsURIs(((com.sun.xml.bind.JAXBObject) _SchText));
            context.endNamespaceDecls();
            context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _SchText));
            context.endAttributes();
            context.childAsElementBody(((com.sun.xml.bind.JAXBObject) _SchText));
            context.endElement();
        }
    }

    public void serializeAttributes(net.sourceforge.czt.core.jaxb.gen.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        int idx3 = 0;
        final int len3 = _DeclName.size();
        if (_Box!= null) {
            context.startAttribute("", "Box");
            try {
                context.text(((java.lang.String) _Box));
            } catch (java.lang.Exception e) {
                net.sourceforge.czt.core.jaxb.gen.impl.runtime.Util.handlePrintConversionException(this, e, context);
            }
            context.endAttribute();
        }
        super.serializeAttributes(context);
    }

    public void serializeAttributeBody(net.sourceforge.czt.core.jaxb.gen.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        int idx3 = 0;
        final int len3 = _DeclName.size();
        super.serializeAttributeBody(context);
        while (idx3 != len3) {
            if (_DeclName.get(idx3) instanceof javax.xml.bind.Element) {
                context.childAsAttributeBody(((com.sun.xml.bind.JAXBObject) _DeclName.get(idx3 ++)));
            } else {
                context.startElement("http://czt.sourceforge.net/zml", "DeclName");
                int idx_0 = idx3;
                context.childAsURIs(((com.sun.xml.bind.JAXBObject) _DeclName.get(idx_0 ++)));
                context.endNamespaceDecls();
                int idx_1 = idx3;
                context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _DeclName.get(idx_1 ++)));
                context.endAttributes();
                context.childAsElementBody(((com.sun.xml.bind.JAXBObject) _DeclName.get(idx3 ++)));
                context.endElement();
            }
        }
        if (_SchText instanceof javax.xml.bind.Element) {
            context.childAsAttributeBody(((com.sun.xml.bind.JAXBObject) _SchText));
        } else {
            context.startElement("http://czt.sourceforge.net/zml", "SchText");
            context.childAsURIs(((com.sun.xml.bind.JAXBObject) _SchText));
            context.endNamespaceDecls();
            context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _SchText));
            context.endAttributes();
            context.childAsElementBody(((com.sun.xml.bind.JAXBObject) _SchText));
            context.endElement();
        }
    }

    public void serializeURIs(net.sourceforge.czt.core.jaxb.gen.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        int idx3 = 0;
        final int len3 = _DeclName.size();
        super.serializeURIs(context);
    }

    public java.lang.Class getPrimaryInterface() {
        return (net.sourceforge.czt.core.jaxb.gen.AxPara.class);
    }

    public com.sun.msv.verifier.DocumentDeclaration createRawValidator() {
        if (schemaFragment == null) {
            schemaFragment = com.sun.xml.bind.validator.SchemaDeserializer.deserialize((
 "\u00ac\u00ed\u0000\u0005sr\u0000\u001fcom.sun.msv.grammar.SequenceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.su"
+"n.msv.grammar.BinaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0004exp1t\u0000 Lcom/sun/msv/gra"
+"mmar/Expression;L\u0000\u0004exp2q\u0000~\u0000\u0002xr\u0000\u001ecom.sun.msv.grammar.Expressi"
+"on\u00f8\u0018\u0082\u00e8N5~O\u0002\u0000\u0003I\u0000\u000ecachedHashCodeL\u0000\u0013epsilonReducibilityt\u0000\u0013Ljava"
+"/lang/Boolean;L\u0000\u000bexpandedExpq\u0000~\u0000\u0002xp\u0005\u00c0\u00b92ppsq\u0000~\u0000\u0000\u0003\u00c1\u00ec\u00aappsq\u0000~\u0000\u0000\u0002"
+"A\'\u00a4ppsr\u0000\u001dcom.sun.msv.grammar.ChoiceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0001\u0000\u00c0b\u0090p"
+"psr\u0000\'com.sun.msv.grammar.trex.ElementPattern\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\tna"
+"meClasst\u0000\u001fLcom/sun/msv/grammar/NameClass;xr\u0000\u001ecom.sun.msv.gra"
+"mmar.ElementExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002Z\u0000\u001aignoreUndeclaredAttributesL\u0000\fco"
+"ntentModelq\u0000~\u0000\u0002xq\u0000~\u0000\u0003\u0000\u00c0b\u0085sr\u0000\u0011java.lang.Boolean\u00cd r\u0080\u00d5\u009c\u00fa\u00ee\u0002\u0000\u0001Z\u0000\u0005"
+"valuexp\u0000p\u0000sq\u0000~\u0000\n\u0000\u00c0bzpp\u0000sq\u0000~\u0000\b\u0000\u00c0boppsr\u0000 com.sun.msv.grammar.O"
+"neOrMoreExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001ccom.sun.msv.grammar.UnaryExp\u0000\u0000\u0000\u0000\u0000\u0000"
+"\u0000\u0001\u0002\u0000\u0001L\u0000\u0003expq\u0000~\u0000\u0002xq\u0000~\u0000\u0003\u0000\u00c0bdq\u0000~\u0000\u000fpsr\u0000 com.sun.msv.grammar.Attr"
+"ibuteExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003expq\u0000~\u0000\u0002L\u0000\tnameClassq\u0000~\u0000\u000bxq\u0000~\u0000\u0003\u0000\u00c0baq\u0000~"
+"\u0000\u000fpsr\u00002com.sun.msv.grammar.Expression$AnyStringExpression\u0000\u0000\u0000"
+"\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003\u0000\u0000\u0000\bsq\u0000~\u0000\u000e\u0001q\u0000~\u0000\u0018sr\u0000 com.sun.msv.grammar.AnyNam"
+"eClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun.msv.grammar.NameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000"
+"\u0000xpsr\u00000com.sun.msv.grammar.Expression$EpsilonExpression\u0000\u0000\u0000\u0000\u0000"
+"\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003\u0000\u0000\u0000\tq\u0000~\u0000\u0019q\u0000~\u0000\u001esr\u0000#com.sun.msv.grammar.SimpleName"
+"Class\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\tlocalNamet\u0000\u0012Ljava/lang/String;L\u0000\fnamespac"
+"eURIq\u0000~\u0000 xq\u0000~\u0000\u001bt\u00000net.sourceforge.czt.core.jaxb.gen.TermA.An"
+"nsTypet\u0000+http://java.sun.com/jaxb/xjc/dummy-elementssq\u0000~\u0000\u001ft\u0000"
+"\u0004Annst\u0000\u001ehttp://czt.sourceforge.net/zmlq\u0000~\u0000\u001esq\u0000~\u0000\b\u0001\u0080\u00c5\u000fppsq\u0000~\u0000"
+"\u0012\u0001\u0080\u00c5\u0004q\u0000~\u0000\u000fpsq\u0000~\u0000\b\u0001\u0080\u00c5\u0001q\u0000~\u0000\u000fpsq\u0000~\u0000\n\u0000\u00c0b\u0085q\u0000~\u0000\u000fp\u0000sq\u0000~\u0000\n\u0000\u00c0bzpp\u0000sq\u0000"
+"~\u0000\b\u0000\u00c0boppsq\u0000~\u0000\u0012\u0000\u00c0bdq\u0000~\u0000\u000fpsq\u0000~\u0000\u0015\u0000\u00c0baq\u0000~\u0000\u000fpq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~"
+"\u0000\u001ft\u0000*net.sourceforge.czt.core.jaxb.gen.DeclNameq\u0000~\u0000#sq\u0000~\u0000\u001ft\u0000"
+"\bDeclNameq\u0000~\u0000&sq\u0000~\u0000\n\u0000\u00c0bzq\u0000~\u0000\u000fp\u0000sq\u0000~\u0000\b\u0000\u00c0boppsq\u0000~\u0000\u0012\u0000\u00c0bdq\u0000~\u0000\u000fps"
+"q\u0000~\u0000\u0015\u0000\u00c0baq\u0000~\u0000\u000fpq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u00001net.sourceforge.czt.c"
+"ore.jaxb.gen.DeclNameElementq\u0000~\u0000#q\u0000~\u0000\u001esq\u0000~\u0000\b\u0001\u0080\u00c5\u0001ppsq\u0000~\u0000\n\u0000\u00c0b\u0085"
+"pp\u0000sq\u0000~\u0000\n\u0000\u00c0bzpp\u0000sq\u0000~\u0000\b\u0000\u00c0boppsq\u0000~\u0000\u0012\u0000\u00c0bdq\u0000~\u0000\u000fpsq\u0000~\u0000\u0015\u0000\u00c0baq\u0000~\u0000\u000fp"
+"q\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000)net.sourceforge.czt.core.jaxb.gen.Sc"
+"hTextq\u0000~\u0000#sq\u0000~\u0000\u001ft\u0000\u0007SchTextq\u0000~\u0000&sq\u0000~\u0000\n\u0000\u00c0bzpp\u0000sq\u0000~\u0000\b\u0000\u00c0boppsq\u0000~"
+"\u0000\u0012\u0000\u00c0bdq\u0000~\u0000\u000fpsq\u0000~\u0000\u0015\u0000\u00c0baq\u0000~\u0000\u000fpq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u00000net.sour"
+"ceforge.czt.core.jaxb.gen.SchTextElementq\u0000~\u0000#sq\u0000~\u0000\b\u0001\u00fe\u00cc\u0083ppsq\u0000"
+"~\u0000\u0015\u0001\u00fe\u00ccxq\u0000~\u0000\u000fpsr\u0000\u001bcom.sun.msv.grammar.DataExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\u0002dt"
+"t\u0000\u001fLorg/relaxng/datatype/Datatype;L\u0000\u0006exceptq\u0000~\u0000\u0002L\u0000\u0004namet\u0000\u001dLc"
+"om/sun/msv/util/StringPair;xq\u0000~\u0000\u0003\u0001\u00f5\u0091\u001eppsr\u0000)com.sun.msv.datat"
+"ype.xsd.EnumerationFacet\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\u0006valuest\u0000\u000fLjava/util/Se"
+"t;xr\u00009com.sun.msv.datatype.xsd.DataTypeWithValueConstraintFa"
+"cet\"\u00a7Ro\u00ca\u00c7\u008aT\u0002\u0000\u0000xr\u0000*com.sun.msv.datatype.xsd.DataTypeWithFacet"
+"\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0005Z\u0000\fisFacetFixedZ\u0000\u0012needValueCheckFlagL\u0000\bbaseTypet\u0000"
+")Lcom/sun/msv/datatype/xsd/XSDatatypeImpl;L\u0000\fconcreteTypet\u0000\'"
+"Lcom/sun/msv/datatype/xsd/ConcreteType;L\u0000\tfacetNameq\u0000~\u0000 xr\u0000\'"
+"com.sun.msv.datatype.xsd.XSDatatypeImpl\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\fnamespa"
+"ceUriq\u0000~\u0000 L\u0000\btypeNameq\u0000~\u0000 L\u0000\nwhiteSpacet\u0000.Lcom/sun/msv/datat"
+"ype/xsd/WhiteSpaceProcessor;xpq\u0000~\u0000&psr\u00005com.sun.msv.datatype"
+".xsd.WhiteSpaceProcessor$Preserve\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000,com.sun.msv."
+"datatype.xsd.WhiteSpaceProcessor\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xp\u0000\u0000sr\u0000#com.sun.m"
+"sv.datatype.xsd.StringType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001Z\u0000\risAlwaysValidxr\u0000*com"
+".sun.msv.datatype.xsd.BuiltinAtomicType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000%com.su"
+"n.msv.datatype.xsd.ConcreteType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000Ut\u0000 http://ww"
+"w.w3.org/2001/XMLSchemat\u0000\u0006stringq\u0000~\u0000Z\u0001q\u0000~\u0000^t\u0000\u000benumerationsr\u0000"
+"\u0011java.util.HashSet\u00baD\u0085\u0095\u0096\u00b8\u00b74\u0003\u0000\u0000xpw\f\u0000\u0000\u0000\u0010?@\u0000\u0000\u0000\u0000\u0000\u0003t\u0000\u0005AxBoxt\u0000\u0006SchB"
+"oxt\u0000\u0007OmitBoxxsr\u00000com.sun.msv.grammar.Expression$NullSetExpre"
+"ssion\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003\u0000\u0000\u0000\nq\u0000~\u0000\u000fpsr\u0000\u001bcom.sun.msv.util.StringP"
+"air\u00d0t\u001ejB\u008f\u008d\u00a0\u0002\u0000\u0002L\u0000\tlocalNameq\u0000~\u0000 L\u0000\fnamespaceURIq\u0000~\u0000 xpt\u0000\u000estri"
+"ng-derivedq\u0000~\u0000&sq\u0000~\u0000\u001ft\u0000\u0003Boxt\u0000\u0000q\u0000~\u0000\u001esr\u0000\"com.sun.msv.grammar.E"
+"xpressionPool\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\bexpTablet\u0000/Lcom/sun/msv/grammar/E"
+"xpressionPool$ClosedHash;xpsr\u0000-com.sun.msv.grammar.Expressio"
+"nPool$ClosedHash\u00d7j\u00d0N\u00ef\u00e8\u00ed\u001c\u0002\u0000\u0004I\u0000\u0005countI\u0000\tthresholdL\u0000\u0006parentq\u0000~\u0000"
+"p[\u0000\u0005tablet\u0000![Lcom/sun/msv/grammar/Expression;xp\u0000\u0000\u0000\u0013\u0000\u0000\u00009pur\u0000!"
+"[Lcom.sun.msv.grammar.Expression;\u00d68D\u00c3]\u00ad\u00a7\n\u0002\u0000\u0000xp\u0000\u0000\u0000\u00bfq\u0000~\u0000-q\u0000~\u00005"
+"q\u0000~\u0000=q\u0000~\u0000Eppppppq\u0000~\u0000\u0011q\u0000~\u0000,q\u0000~\u00004q\u0000~\u0000<q\u0000~\u0000Dppppppppppppppppppp"
+"pppppppppq\u0000~\u0000\tpppppppppppq\u0000~\u0000)q\u0000~\u00009pq\u0000~\u0000(ppppppppppq\u0000~\u0000\'pppp"
+"pppppppppppppppppq\u0000~\u0000\u0005ppppppppq\u0000~\u0000Ippppppppppppppppq\u0000~\u0000\u0007pppp"
+"pppppppppppppppppppppppppppppppppppppppppppppppppppppppq\u0000~\u0000\u0006"
+"ppppppppppppq\u0000~\u0000\u0014"));
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
            return net.sourceforge.czt.core.jaxb.gen.impl.AxParaImpl.this;
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
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.core.jaxb.gen.impl.ParaImpl)net.sourceforge.czt.core.jaxb.gen.impl.AxParaImpl.this).new Unmarshaller(context)), 4, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        spawnHandlerFromEnterElement((((net.sourceforge.czt.core.jaxb.gen.impl.ParaImpl)net.sourceforge.czt.core.jaxb.gen.impl.AxParaImpl.this).new Unmarshaller(context)), 4, ___uri, ___local, ___qname, __atts);
                        return ;
                    case  10 :
                        revertToParentFromEnterElement(___uri, ___local, ___qname, __atts);
                        return ;
                    case  4 :
                        if (("DeclName" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 5;
                            return ;
                        }
                        state = 7;
                        continue outer;
                    case  0 :
                        attIdx = context.getAttribute("", "Box");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            eatText0(v);
                            state = 3;
                            continue outer;
                        }
                        state = 3;
                        continue outer;
                    case  7 :
                        if (("DeclName" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 5;
                            return ;
                        }
                        if (("SchText" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 8;
                            return ;
                        }
                        break;
                    case  5 :
                        attIdx = context.getAttribute("", "Id");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().enterElement(___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("Anns" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _DeclName.add(((net.sourceforge.czt.core.jaxb.gen.impl.DeclNameImpl) spawnChildFromEnterElement((net.sourceforge.czt.core.jaxb.gen.impl.DeclNameImpl.class), 6, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("Word" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _DeclName.add(((net.sourceforge.czt.core.jaxb.gen.impl.DeclNameImpl) spawnChildFromEnterElement((net.sourceforge.czt.core.jaxb.gen.impl.DeclNameImpl.class), 6, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        _DeclName.add(((net.sourceforge.czt.core.jaxb.gen.impl.DeclNameImpl) spawnChildFromEnterElement((net.sourceforge.czt.core.jaxb.gen.impl.DeclNameImpl.class), 6, ___uri, ___local, ___qname, __atts)));
                        return ;
                    case  8 :
                        if (("Anns" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _SchText = ((net.sourceforge.czt.core.jaxb.gen.impl.SchTextImpl) spawnChildFromEnterElement((net.sourceforge.czt.core.jaxb.gen.impl.SchTextImpl.class), 9, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("ConstDecl" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _SchText = ((net.sourceforge.czt.core.jaxb.gen.impl.SchTextImpl) spawnChildFromEnterElement((net.sourceforge.czt.core.jaxb.gen.impl.SchTextImpl.class), 9, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("InclDecl" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _SchText = ((net.sourceforge.czt.core.jaxb.gen.impl.SchTextImpl) spawnChildFromEnterElement((net.sourceforge.czt.core.jaxb.gen.impl.SchTextImpl.class), 9, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("VarDecl" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _SchText = ((net.sourceforge.czt.core.jaxb.gen.impl.SchTextImpl) spawnChildFromEnterElement((net.sourceforge.czt.core.jaxb.gen.impl.SchTextImpl.class), 9, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("FalsePred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _SchText = ((net.sourceforge.czt.core.jaxb.gen.impl.SchTextImpl) spawnChildFromEnterElement((net.sourceforge.czt.core.jaxb.gen.impl.SchTextImpl.class), 9, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("TruePred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _SchText = ((net.sourceforge.czt.core.jaxb.gen.impl.SchTextImpl) spawnChildFromEnterElement((net.sourceforge.czt.core.jaxb.gen.impl.SchTextImpl.class), 9, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("AndPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _SchText = ((net.sourceforge.czt.core.jaxb.gen.impl.SchTextImpl) spawnChildFromEnterElement((net.sourceforge.czt.core.jaxb.gen.impl.SchTextImpl.class), 9, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("ImpliesPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _SchText = ((net.sourceforge.czt.core.jaxb.gen.impl.SchTextImpl) spawnChildFromEnterElement((net.sourceforge.czt.core.jaxb.gen.impl.SchTextImpl.class), 9, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("IffPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _SchText = ((net.sourceforge.czt.core.jaxb.gen.impl.SchTextImpl) spawnChildFromEnterElement((net.sourceforge.czt.core.jaxb.gen.impl.SchTextImpl.class), 9, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("OrPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _SchText = ((net.sourceforge.czt.core.jaxb.gen.impl.SchTextImpl) spawnChildFromEnterElement((net.sourceforge.czt.core.jaxb.gen.impl.SchTextImpl.class), 9, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("ExistsPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _SchText = ((net.sourceforge.czt.core.jaxb.gen.impl.SchTextImpl) spawnChildFromEnterElement((net.sourceforge.czt.core.jaxb.gen.impl.SchTextImpl.class), 9, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("Exists1Pred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _SchText = ((net.sourceforge.czt.core.jaxb.gen.impl.SchTextImpl) spawnChildFromEnterElement((net.sourceforge.czt.core.jaxb.gen.impl.SchTextImpl.class), 9, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("ForallPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _SchText = ((net.sourceforge.czt.core.jaxb.gen.impl.SchTextImpl) spawnChildFromEnterElement((net.sourceforge.czt.core.jaxb.gen.impl.SchTextImpl.class), 9, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("ExprPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _SchText = ((net.sourceforge.czt.core.jaxb.gen.impl.SchTextImpl) spawnChildFromEnterElement((net.sourceforge.czt.core.jaxb.gen.impl.SchTextImpl.class), 9, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("MemPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _SchText = ((net.sourceforge.czt.core.jaxb.gen.impl.SchTextImpl) spawnChildFromEnterElement((net.sourceforge.czt.core.jaxb.gen.impl.SchTextImpl.class), 9, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("NegPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _SchText = ((net.sourceforge.czt.core.jaxb.gen.impl.SchTextImpl) spawnChildFromEnterElement((net.sourceforge.czt.core.jaxb.gen.impl.SchTextImpl.class), 9, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        _SchText = ((net.sourceforge.czt.core.jaxb.gen.impl.SchTextImpl) spawnChildFromEnterElement((net.sourceforge.czt.core.jaxb.gen.impl.SchTextImpl.class), 9, ___uri, ___local, ___qname, __atts));
                        return ;
                }
                super.enterElement(___uri, ___local, ___qname, __atts);
                break;
            }
        }

        private void eatText0(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            try {
                _Box = value;
            } catch (java.lang.Exception e) {
                handleParseConversionException(e);
            }
        }

        public void leaveElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  6 :
                        if (("DeclName" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            context.popAttributes();
                            state = 7;
                            return ;
                        }
                        break;
                    case  9 :
                        if (("SchText" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            context.popAttributes();
                            state = 10;
                            return ;
                        }
                        break;
                    case  3 :
                        spawnHandlerFromLeaveElement((((net.sourceforge.czt.core.jaxb.gen.impl.ParaImpl)net.sourceforge.czt.core.jaxb.gen.impl.AxParaImpl.this).new Unmarshaller(context)), 4, ___uri, ___local, ___qname);
                        return ;
                    case  10 :
                        revertToParentFromLeaveElement(___uri, ___local, ___qname);
                        return ;
                    case  4 :
                        state = 7;
                        continue outer;
                    case  0 :
                        attIdx = context.getAttribute("", "Box");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            eatText0(v);
                            state = 3;
                            continue outer;
                        }
                        state = 3;
                        continue outer;
                    case  5 :
                        attIdx = context.getAttribute("", "Id");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveElement(___uri, ___local, ___qname);
                            return ;
                        }
                        _DeclName.add(((net.sourceforge.czt.core.jaxb.gen.impl.DeclNameImpl) spawnChildFromLeaveElement((net.sourceforge.czt.core.jaxb.gen.impl.DeclNameImpl.class), 6, ___uri, ___local, ___qname)));
                        return ;
                    case  8 :
                        _SchText = ((net.sourceforge.czt.core.jaxb.gen.impl.SchTextImpl) spawnChildFromLeaveElement((net.sourceforge.czt.core.jaxb.gen.impl.SchTextImpl.class), 9, ___uri, ___local, ___qname));
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
                        spawnHandlerFromEnterAttribute((((net.sourceforge.czt.core.jaxb.gen.impl.ParaImpl)net.sourceforge.czt.core.jaxb.gen.impl.AxParaImpl.this).new Unmarshaller(context)), 4, ___uri, ___local, ___qname);
                        return ;
                    case  10 :
                        revertToParentFromEnterAttribute(___uri, ___local, ___qname);
                        return ;
                    case  4 :
                        state = 7;
                        continue outer;
                    case  0 :
                        if (("Box" == ___local)&&("" == ___uri)) {
                            state = 1;
                            return ;
                        }
                        state = 3;
                        continue outer;
                    case  5 :
                        if (("Id" == ___local)&&("" == ___uri)) {
                            _DeclName.add(((net.sourceforge.czt.core.jaxb.gen.impl.DeclNameImpl) spawnChildFromEnterAttribute((net.sourceforge.czt.core.jaxb.gen.impl.DeclNameImpl.class), 6, ___uri, ___local, ___qname)));
                            return ;
                        }
                        _DeclName.add(((net.sourceforge.czt.core.jaxb.gen.impl.DeclNameImpl) spawnChildFromEnterAttribute((net.sourceforge.czt.core.jaxb.gen.impl.DeclNameImpl.class), 6, ___uri, ___local, ___qname)));
                        return ;
                    case  8 :
                        _SchText = ((net.sourceforge.czt.core.jaxb.gen.impl.SchTextImpl) spawnChildFromEnterAttribute((net.sourceforge.czt.core.jaxb.gen.impl.SchTextImpl.class), 9, ___uri, ___local, ___qname));
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
                        spawnHandlerFromLeaveAttribute((((net.sourceforge.czt.core.jaxb.gen.impl.ParaImpl)net.sourceforge.czt.core.jaxb.gen.impl.AxParaImpl.this).new Unmarshaller(context)), 4, ___uri, ___local, ___qname);
                        return ;
                    case  10 :
                        revertToParentFromLeaveAttribute(___uri, ___local, ___qname);
                        return ;
                    case  4 :
                        state = 7;
                        continue outer;
                    case  0 :
                        attIdx = context.getAttribute("", "Box");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            eatText0(v);
                            state = 3;
                            continue outer;
                        }
                        state = 3;
                        continue outer;
                    case  2 :
                        if (("Box" == ___local)&&("" == ___uri)) {
                            state = 3;
                            return ;
                        }
                        break;
                    case  5 :
                        attIdx = context.getAttribute("", "Id");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveAttribute(___uri, ___local, ___qname);
                            return ;
                        }
                        _DeclName.add(((net.sourceforge.czt.core.jaxb.gen.impl.DeclNameImpl) spawnChildFromLeaveAttribute((net.sourceforge.czt.core.jaxb.gen.impl.DeclNameImpl.class), 6, ___uri, ___local, ___qname)));
                        return ;
                    case  8 :
                        _SchText = ((net.sourceforge.czt.core.jaxb.gen.impl.SchTextImpl) spawnChildFromLeaveAttribute((net.sourceforge.czt.core.jaxb.gen.impl.SchTextImpl.class), 9, ___uri, ___local, ___qname));
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
                            spawnHandlerFromText((((net.sourceforge.czt.core.jaxb.gen.impl.ParaImpl)net.sourceforge.czt.core.jaxb.gen.impl.AxParaImpl.this).new Unmarshaller(context)), 4, value);
                            return ;
                        case  1 :
                            eatText0(value);
                            state = 2;
                            return ;
                        case  10 :
                            revertToParentFromText(value);
                            return ;
                        case  4 :
                            state = 7;
                            continue outer;
                        case  0 :
                            attIdx = context.getAttribute("", "Box");
                            if (attIdx >= 0) {
                                final java.lang.String v = context.eatAttribute(attIdx);
                                eatText0(v);
                                state = 3;
                                continue outer;
                            }
                            state = 3;
                            continue outer;
                        case  5 :
                            attIdx = context.getAttribute("", "Id");
                            if (attIdx >= 0) {
                                context.consumeAttribute(attIdx);
                                context.getCurrentHandler().text(value);
                                return ;
                            }
                            _DeclName.add(((net.sourceforge.czt.core.jaxb.gen.impl.DeclNameImpl) spawnChildFromText((net.sourceforge.czt.core.jaxb.gen.impl.DeclNameImpl.class), 6, value)));
                            return ;
                        case  8 :
                            _SchText = ((net.sourceforge.czt.core.jaxb.gen.impl.SchTextImpl) spawnChildFromText((net.sourceforge.czt.core.jaxb.gen.impl.SchTextImpl.class), 9, value));
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
