//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.1-05/30/2003 05:06 AM(java_re)-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2003.08.25 at 03:03:07 NZST 
//


package net.sourceforge.czt.core.jaxb.gen.impl;

public class ZSectElementImpl
    extends net.sourceforge.czt.core.jaxb.gen.impl.ZSectImpl
    implements net.sourceforge.czt.core.jaxb.gen.ZSectElement, com.sun.xml.bind.JAXBObject, com.sun.xml.bind.RIElement, net.sourceforge.czt.core.jaxb.gen.impl.runtime.UnmarshallableObject, net.sourceforge.czt.core.jaxb.gen.impl.runtime.XMLSerializable, net.sourceforge.czt.core.jaxb.gen.impl.runtime.ValidatableObject
{

    public final static java.lang.Class version = (net.sourceforge.czt.core.jaxb.gen.impl.JAXBVersion.class);
    private static com.sun.msv.grammar.Grammar schemaFragment;

    public java.lang.String ____jaxb_ri____getNamespaceURI() {
        return "http://czt.sourceforge.net/zml";
    }

    public java.lang.String ____jaxb_ri____getLocalName() {
        return "ZSect";
    }

    private final static java.lang.Class PRIMARY_INTERFACE_CLASS() {
        return (net.sourceforge.czt.core.jaxb.gen.ZSectElement.class);
    }

    public net.sourceforge.czt.core.jaxb.gen.impl.runtime.UnmarshallingEventHandler createUnmarshaller(net.sourceforge.czt.core.jaxb.gen.impl.runtime.UnmarshallingContext context) {
        return new net.sourceforge.czt.core.jaxb.gen.impl.ZSectElementImpl.Unmarshaller(context);
    }

    public void serializeElementBody(net.sourceforge.czt.core.jaxb.gen.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        context.startElement("http://czt.sourceforge.net/zml", "ZSect");
        super.serializeURIs(context);
        context.endNamespaceDecls();
        super.serializeAttributes(context);
        context.endAttributes();
        super.serializeElementBody(context);
        context.endElement();
    }

    public void serializeAttributes(net.sourceforge.czt.core.jaxb.gen.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
    }

    public void serializeAttributeBody(net.sourceforge.czt.core.jaxb.gen.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        context.startElement("http://czt.sourceforge.net/zml", "ZSect");
        super.serializeURIs(context);
        context.endNamespaceDecls();
        super.serializeAttributes(context);
        context.endAttributes();
        super.serializeElementBody(context);
        context.endElement();
    }

    public void serializeURIs(net.sourceforge.czt.core.jaxb.gen.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
    }

    public java.lang.Class getPrimaryInterface() {
        return (net.sourceforge.czt.core.jaxb.gen.ZSectElement.class);
    }

    public com.sun.msv.verifier.DocumentDeclaration createRawValidator() {
        if (schemaFragment == null) {
            schemaFragment = com.sun.xml.bind.validator.SchemaDeserializer.deserialize((
 "\u00ac\u00ed\u0000\u0005sr\u0000\'com.sun.msv.grammar.trex.ElementPattern\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000"
+"\tnameClasst\u0000\u001fLcom/sun/msv/grammar/NameClass;xr\u0000\u001ecom.sun.msv."
+"grammar.ElementExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002Z\u0000\u001aignoreUndeclaredAttributesL\u0000"
+"\fcontentModelt\u0000 Lcom/sun/msv/grammar/Expression;xr\u0000\u001ecom.sun."
+"msv.grammar.Expression\u00f8\u0018\u0082\u00e8N5~O\u0002\u0000\u0003I\u0000\u000ecachedHashCodeL\u0000\u0013epsilon"
+"Reducibilityt\u0000\u0013Ljava/lang/Boolean;L\u0000\u000bexpandedExpq\u0000~\u0000\u0003xp\r:\u0097\u00d2p"
+"p\u0000sr\u0000\u001fcom.sun.msv.grammar.SequenceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun."
+"msv.grammar.BinaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0004exp1q\u0000~\u0000\u0003L\u0000\u0004exp2q\u0000~\u0000\u0003xq\u0000~"
+"\u0000\u0004\r:\u0097\u00c7ppsq\u0000~\u0000\u0007\u0004y\u00ca\u00a2ppsq\u0000~\u0000\u0007\u0001\u00f9\u008f\u00eeppsr\u0000\u001dcom.sun.msv.grammar.Choi"
+"ceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\b\u0001@\u001d`ppsq\u0000~\u0000\u0000\u0001@\u001dUsr\u0000\u0011java.lang.Boolean\u00cd"
+" r\u0080\u00d5\u009c\u00fa\u00ee\u0002\u0000\u0001Z\u0000\u0005valuexp\u0000p\u0000sq\u0000~\u0000\u0000\u0001@\u001dJpp\u0000sq\u0000~\u0000\f\u0001@\u001d?ppsr\u0000 com.sun."
+"msv.grammar.OneOrMoreExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001ccom.sun.msv.grammar.U"
+"naryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\u0003expq\u0000~\u0000\u0003xq\u0000~\u0000\u0004\u0001@\u001d4q\u0000~\u0000\u0010psr\u0000 com.sun.msv"
+".grammar.AttributeExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003expq\u0000~\u0000\u0003L\u0000\tnameClassq\u0000~\u0000\u0001"
+"xq\u0000~\u0000\u0004\u0001@\u001d1q\u0000~\u0000\u0010psr\u00002com.sun.msv.grammar.Expression$AnyString"
+"Expression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004\u0000\u0000\u0000\bsq\u0000~\u0000\u000f\u0001q\u0000~\u0000\u0019sr\u0000 com.sun.msv.g"
+"rammar.AnyNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun.msv.grammar.NameCl"
+"ass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com.sun.msv.grammar.Expression$EpsilonEx"
+"pression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004\u0000\u0000\u0000\tq\u0000~\u0000\u001aq\u0000~\u0000\u001fsr\u0000#com.sun.msv.gramm"
+"ar.SimpleNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\tlocalNamet\u0000\u0012Ljava/lang/Strin"
+"g;L\u0000\fnamespaceURIq\u0000~\u0000!xq\u0000~\u0000\u001ct\u00000net.sourceforge.czt.core.jaxb"
+".gen.TermA.AnnsTypet\u0000+http://java.sun.com/jaxb/xjc/dummy-ele"
+"mentssq\u0000~\u0000 t\u0000\u0004Annst\u0000\u001ehttp://czt.sourceforge.net/zmlq\u0000~\u0000\u001fsq\u0000~"
+"\u0000\u0000\u0000\u00b9r\u0089pp\u0000sr\u0000\u001bcom.sun.msv.grammar.DataExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\u0002dtt\u0000\u001fL"
+"org/relaxng/datatype/Datatype;L\u0000\u0006exceptq\u0000~\u0000\u0003L\u0000\u0004namet\u0000\u001dLcom/s"
+"un/msv/util/StringPair;xq\u0000~\u0000\u0004\u0000\u00b9r~q\u0000~\u0000\u0010psr\u0000#com.sun.msv.datat"
+"ype.xsd.StringType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001Z\u0000\risAlwaysValidxr\u0000*com.sun.msv"
+".datatype.xsd.BuiltinAtomicType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000%com.sun.msv.da"
+"tatype.xsd.ConcreteType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\'com.sun.msv.datatype.x"
+"sd.XSDatatypeImpl\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\fnamespaceUriq\u0000~\u0000!L\u0000\btypeNameq"
+"\u0000~\u0000!L\u0000\nwhiteSpacet\u0000.Lcom/sun/msv/datatype/xsd/WhiteSpaceProc"
+"essor;xpt\u0000 http://www.w3.org/2001/XMLSchemat\u0000\u0006stringsr\u00005com."
+"sun.msv.datatype.xsd.WhiteSpaceProcessor$Preserve\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000"
+"xr\u0000,com.sun.msv.datatype.xsd.WhiteSpaceProcessor\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000x"
+"p\u0001sr\u00000com.sun.msv.grammar.Expression$NullSetExpression\u0000\u0000\u0000\u0000\u0000\u0000"
+"\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004\u0000\u0000\u0000\nq\u0000~\u0000\u0010psr\u0000\u001bcom.sun.msv.util.StringPair\u00d0t\u001ejB\u008f\u008d\u00a0"
+"\u0002\u0000\u0002L\u0000\tlocalNameq\u0000~\u0000!L\u0000\fnamespaceURIq\u0000~\u0000!xpq\u0000~\u00004q\u0000~\u00003sq\u0000~\u0000 t\u0000"
+"\u0004Nameq\u0000~\u0000\'sq\u0000~\u0000\f\u0002\u0080:\u00afppsq\u0000~\u0000\u0013\u0002\u0080:\u00a4q\u0000~\u0000\u0010psq\u0000~\u0000\f\u0002\u0080:\u00a1q\u0000~\u0000\u0010psq\u0000~\u0000\u0000"
+"\u0001@\u001dUq\u0000~\u0000\u0010p\u0000sq\u0000~\u0000\u0000\u0001@\u001dJpp\u0000sq\u0000~\u0000\f\u0001@\u001d?ppsq\u0000~\u0000\u0013\u0001@\u001d4q\u0000~\u0000\u0010psq\u0000~\u0000\u0016\u0001@"
+"\u001d1q\u0000~\u0000\u0010pq\u0000~\u0000\u0019q\u0000~\u0000\u001dq\u0000~\u0000\u001fsq\u0000~\u0000 t\u0000(net.sourceforge.czt.core.jax"
+"b.gen.Parentq\u0000~\u0000$sq\u0000~\u0000 t\u0000\u0006Parentq\u0000~\u0000\'sq\u0000~\u0000\u0000\u0001@\u001dJq\u0000~\u0000\u0010p\u0000sq\u0000~\u0000\f"
+"\u0001@\u001d?ppsq\u0000~\u0000\u0013\u0001@\u001d4q\u0000~\u0000\u0010psq\u0000~\u0000\u0016\u0001@\u001d1q\u0000~\u0000\u0010pq\u0000~\u0000\u0019q\u0000~\u0000\u001dq\u0000~\u0000\u001fsq\u0000~\u0000 t"
+"\u0000/net.sourceforge.czt.core.jaxb.gen.ParentElementq\u0000~\u0000$q\u0000~\u0000\u001fs"
+"q\u0000~\u0000\f\b\u00c0\u00cd ppsq\u0000~\u0000\u0013\b\u00c0\u00cd\u0015q\u0000~\u0000\u0010psq\u0000~\u0000\f\b\u00c0\u00cd\u0012q\u0000~\u0000\u0010psq\u0000~\u0000\f\u0007\u0080\u00af\u00c6q\u0000~\u0000\u0010ps"
+"q\u0000~\u0000\f\u0006@\u0092zq\u0000~\u0000\u0010psq\u0000~\u0000\f\u0005\u0000u.q\u0000~\u0000\u0010psq\u0000~\u0000\f\u0003\u00c0W\u00e2q\u0000~\u0000\u0010psq\u0000~\u0000\f\u0002\u0080:\u0096q\u0000~"
+"\u0000\u0010psq\u0000~\u0000\u0000\u0001@\u001dJq\u0000~\u0000\u0010p\u0000sq\u0000~\u0000\f\u0001@\u001d?ppsq\u0000~\u0000\u0013\u0001@\u001d4q\u0000~\u0000\u0010psq\u0000~\u0000\u0016\u0001@\u001d1q\u0000"
+"~\u0000\u0010pq\u0000~\u0000\u0019q\u0000~\u0000\u001dq\u0000~\u0000\u001fsq\u0000~\u0000 t\u0000/net.sourceforge.czt.core.jaxb.ge"
+"n.AxParaElementq\u0000~\u0000$sq\u0000~\u0000\u0000\u0001@\u001dJq\u0000~\u0000\u0010p\u0000sq\u0000~\u0000\f\u0001@\u001d?ppsq\u0000~\u0000\u0013\u0001@\u001d4q"
+"\u0000~\u0000\u0010psq\u0000~\u0000\u0016\u0001@\u001d1q\u0000~\u0000\u0010pq\u0000~\u0000\u0019q\u0000~\u0000\u001dq\u0000~\u0000\u001fsq\u0000~\u0000 t\u00001net.sourceforge"
+".czt.core.jaxb.gen.ConjParaElementq\u0000~\u0000$sq\u0000~\u0000\u0000\u0001@\u001dJq\u0000~\u0000\u0010p\u0000sq\u0000~"
+"\u0000\f\u0001@\u001d?ppsq\u0000~\u0000\u0013\u0001@\u001d4q\u0000~\u0000\u0010psq\u0000~\u0000\u0016\u0001@\u001d1q\u0000~\u0000\u0010pq\u0000~\u0000\u0019q\u0000~\u0000\u001dq\u0000~\u0000\u001fsq\u0000~\u0000"
+" t\u00001net.sourceforge.czt.core.jaxb.gen.FreeParaElementq\u0000~\u0000$sq"
+"\u0000~\u0000\u0000\u0001@\u001dJq\u0000~\u0000\u0010p\u0000sq\u0000~\u0000\f\u0001@\u001d?ppsq\u0000~\u0000\u0013\u0001@\u001d4q\u0000~\u0000\u0010psq\u0000~\u0000\u0016\u0001@\u001d1q\u0000~\u0000\u0010pq"
+"\u0000~\u0000\u0019q\u0000~\u0000\u001dq\u0000~\u0000\u001fsq\u0000~\u0000 t\u00002net.sourceforge.czt.core.jaxb.gen.Giv"
+"enParaElementq\u0000~\u0000$sq\u0000~\u0000\u0000\u0001@\u001dJq\u0000~\u0000\u0010p\u0000sq\u0000~\u0000\f\u0001@\u001d?ppsq\u0000~\u0000\u0013\u0001@\u001d4q\u0000~"
+"\u0000\u0010psq\u0000~\u0000\u0016\u0001@\u001d1q\u0000~\u0000\u0010pq\u0000~\u0000\u0019q\u0000~\u0000\u001dq\u0000~\u0000\u001fsq\u0000~\u0000 t\u00001net.sourceforge.c"
+"zt.core.jaxb.gen.NarrParaElementq\u0000~\u0000$sq\u0000~\u0000\u0000\u0001@\u001dJq\u0000~\u0000\u0010p\u0000sq\u0000~\u0000\f"
+"\u0001@\u001d?ppsq\u0000~\u0000\u0013\u0001@\u001d4q\u0000~\u0000\u0010psq\u0000~\u0000\u0016\u0001@\u001d1q\u0000~\u0000\u0010pq\u0000~\u0000\u0019q\u0000~\u0000\u001dq\u0000~\u0000\u001fsq\u0000~\u0000 t"
+"\u00003net.sourceforge.czt.core.jaxb.gen.OptempParaElementq\u0000~\u0000$sq"
+"\u0000~\u0000\u0000\u0001@\u001dJq\u0000~\u0000\u0010p\u0000sq\u0000~\u0000\f\u0001@\u001d?ppsq\u0000~\u0000\u0013\u0001@\u001d4q\u0000~\u0000\u0010psq\u0000~\u0000\u0016\u0001@\u001d1q\u0000~\u0000\u0010pq"
+"\u0000~\u0000\u0019q\u0000~\u0000\u001dq\u0000~\u0000\u001fsq\u0000~\u0000 t\u00005net.sourceforge.czt.core.jaxb.gen.Unp"
+"arsedParaElementq\u0000~\u0000$q\u0000~\u0000\u001fsq\u0000~\u0000 t\u0000\u0005ZSectq\u0000~\u0000\'sr\u0000\"com.sun.msv"
+".grammar.ExpressionPool\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\bexpTablet\u0000/Lcom/sun/msv"
+"/grammar/ExpressionPool$ClosedHash;xpsr\u0000-com.sun.msv.grammar"
+".ExpressionPool$ClosedHash\u00d7j\u00d0N\u00ef\u00e8\u00ed\u001c\u0002\u0000\u0004I\u0000\u0005countI\u0000\tthresholdL\u0000\u0006"
+"parentq\u0000~\u0000\u0085[\u0000\u0005tablet\u0000![Lcom/sun/msv/grammar/Expression;xp\u0000\u0000\u0000"
+"#\u0000\u0000\u00009pur\u0000![Lcom.sun.msv.grammar.Expression;\u00d68D\u00c3]\u00ad\u00a7\n\u0002\u0000\u0000xp\u0000\u0000\u0000\u00bf"
+"ppppppppppppppppppppppppppppppppq\u0000~\u0000\tppppq\u0000~\u0000Upppppppppppppp"
+"pppppppppppppppppppppppq\u0000~\u0000Vppppppppppppppq\u0000~\u0000\nppppppppppppp"
+"pppppppppq\u0000~\u0000Wq\u0000~\u0000Rppq\u0000~\u0000Qppppppq\u0000~\u0000@ppq\u0000~\u0000?q\u0000~\u0000Pq\u0000~\u0000\u0015q\u0000~\u0000Dq"
+"\u0000~\u0000Lq\u0000~\u0000Zq\u0000~\u0000`q\u0000~\u0000fq\u0000~\u0000lq\u0000~\u0000rq\u0000~\u0000xq\u0000~\u0000\u000bq\u0000~\u0000>q\u0000~\u0000\u0012q\u0000~\u0000Cq\u0000~\u0000Kq"
+"\u0000~\u0000Yq\u0000~\u0000_q\u0000~\u0000eq\u0000~\u0000kq\u0000~\u0000qq\u0000~\u0000wq\u0000~\u0000~q\u0000~\u0000}pq\u0000~\u0000Sppppppppppppppp"
+"pppppq\u0000~\u0000\rppppppppppppppppq\u0000~\u0000T"));
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
            return net.sourceforge.czt.core.jaxb.gen.impl.ZSectElementImpl.this;
        }

        public void enterElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname, org.xml.sax.Attributes __atts)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  0 :
                        if (("ZSect" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 1;
                            return ;
                        }
                        break;
                    case  3 :
                        revertToParentFromEnterElement(___uri, ___local, ___qname, __atts);
                        return ;
                    case  1 :
                        if (("Anns" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.core.jaxb.gen.impl.ZSectImpl)net.sourceforge.czt.core.jaxb.gen.impl.ZSectElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("Name" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.core.jaxb.gen.impl.ZSectImpl)net.sourceforge.czt.core.jaxb.gen.impl.ZSectElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        spawnHandlerFromEnterElement((((net.sourceforge.czt.core.jaxb.gen.impl.ZSectImpl)net.sourceforge.czt.core.jaxb.gen.impl.ZSectElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
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
                        revertToParentFromLeaveElement(___uri, ___local, ___qname);
                        return ;
                    case  1 :
                        spawnHandlerFromLeaveElement((((net.sourceforge.czt.core.jaxb.gen.impl.ZSectImpl)net.sourceforge.czt.core.jaxb.gen.impl.ZSectElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
                        return ;
                    case  2 :
                        if (("ZSect" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
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
                    case  3 :
                        revertToParentFromEnterAttribute(___uri, ___local, ___qname);
                        return ;
                    case  1 :
                        spawnHandlerFromEnterAttribute((((net.sourceforge.czt.core.jaxb.gen.impl.ZSectImpl)net.sourceforge.czt.core.jaxb.gen.impl.ZSectElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
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
                        spawnHandlerFromLeaveAttribute((((net.sourceforge.czt.core.jaxb.gen.impl.ZSectImpl)net.sourceforge.czt.core.jaxb.gen.impl.ZSectElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
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
                            spawnHandlerFromText((((net.sourceforge.czt.core.jaxb.gen.impl.ZSectImpl)net.sourceforge.czt.core.jaxb.gen.impl.ZSectElementImpl.this).new Unmarshaller(context)), 2, value);
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
