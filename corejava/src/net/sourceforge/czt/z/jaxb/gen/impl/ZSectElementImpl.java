//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.2-b15-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2004.01.06 at 09:18:18 NZDT 
//


package net.sourceforge.czt.z.jaxb.gen.impl;

public class ZSectElementImpl
    extends net.sourceforge.czt.z.jaxb.gen.impl.ZSectImpl
    implements net.sourceforge.czt.z.jaxb.gen.ZSectElement, com.sun.xml.bind.RIElement, com.sun.xml.bind.JAXBObject, net.sourceforge.czt.oz.jaxb.gen.impl.runtime.UnmarshallableObject, net.sourceforge.czt.oz.jaxb.gen.impl.runtime.XMLSerializable, net.sourceforge.czt.oz.jaxb.gen.impl.runtime.ValidatableObject
{

    public final static java.lang.Class version = (net.sourceforge.czt.z.jaxb.gen.impl.JAXBVersion.class);
    private static com.sun.msv.grammar.Grammar schemaFragment;

    private final static java.lang.Class PRIMARY_INTERFACE_CLASS() {
        return (net.sourceforge.czt.z.jaxb.gen.ZSectElement.class);
    }

    public java.lang.String ____jaxb_ri____getNamespaceURI() {
        return "http://czt.sourceforge.net/zml";
    }

    public java.lang.String ____jaxb_ri____getLocalName() {
        return "ZSect";
    }

    public net.sourceforge.czt.oz.jaxb.gen.impl.runtime.UnmarshallingEventHandler createUnmarshaller(net.sourceforge.czt.oz.jaxb.gen.impl.runtime.UnmarshallingContext context) {
        return new net.sourceforge.czt.z.jaxb.gen.impl.ZSectElementImpl.Unmarshaller(context);
    }

    public void serializeBody(net.sourceforge.czt.oz.jaxb.gen.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        context.startElement("http://czt.sourceforge.net/zml", "ZSect");
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
        return (net.sourceforge.czt.z.jaxb.gen.ZSectElement.class);
    }

    public com.sun.msv.verifier.DocumentDeclaration createRawValidator() {
        if (schemaFragment == null) {
            schemaFragment = com.sun.xml.bind.validator.SchemaDeserializer.deserialize((
 "\u00ac\u00ed\u0000\u0005sr\u0000\'com.sun.msv.grammar.trex.ElementPattern\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000"
+"\tnameClasst\u0000\u001fLcom/sun/msv/grammar/NameClass;xr\u0000\u001ecom.sun.msv."
+"grammar.ElementExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002Z\u0000\u001aignoreUndeclaredAttributesL\u0000"
+"\fcontentModelt\u0000 Lcom/sun/msv/grammar/Expression;xr\u0000\u001ecom.sun."
+"msv.grammar.Expression\u00f8\u0018\u0082\u00e8N5~O\u0002\u0000\u0003I\u0000\u000ecachedHashCodeL\u0000\u0013epsilon"
+"Reducibilityt\u0000\u0013Ljava/lang/Boolean;L\u0000\u000bexpandedExpq\u0000~\u0000\u0003xp\u0013\u0099\u00ca\u00a5p"
+"p\u0000sr\u0000\u001fcom.sun.msv.grammar.SequenceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun."
+"msv.grammar.BinaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0004exp1q\u0000~\u0000\u0003L\u0000\u0004exp2q\u0000~\u0000\u0003xq\u0000~"
+"\u0000\u0004\u0013\u0099\u00ca\u009appsq\u0000~\u0000\u0007\u0012\u00b8\u00d6\u00f4ppsq\u0000~\u0000\u0007\u0007\u0095\u0016\u00fbppsq\u0000~\u0000\u0007\u0003{\u009c\u00d7ppsr\u0000\u001dcom.sun.msv."
+"grammar.ChoiceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\b\u0002#p\u00e9ppsq\u0000~\u0000\u0000\u0002#p\u00desr\u0000\u0011java.l"
+"ang.Boolean\u00cd r\u0080\u00d5\u009c\u00fa\u00ee\u0002\u0000\u0001Z\u0000\u0005valuexp\u0000p\u0000sq\u0000~\u0000\u0007\u0002#p\u00d3ppsq\u0000~\u0000\u0000\u0001dw\u00fbpp\u0000"
+"sq\u0000~\u0000\r\u0001dw\u00f0ppsr\u0000 com.sun.msv.grammar.OneOrMoreExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000x"
+"r\u0000\u001ccom.sun.msv.grammar.UnaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\u0003expq\u0000~\u0000\u0003xq\u0000~\u0000\u0004\u0001"
+"dw\u00e5q\u0000~\u0000\u0011psr\u0000 com.sun.msv.grammar.AttributeExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003e"
+"xpq\u0000~\u0000\u0003L\u0000\tnameClassq\u0000~\u0000\u0001xq\u0000~\u0000\u0004\u0001dw\u00e2q\u0000~\u0000\u0011psr\u00002com.sun.msv.gram"
+"mar.Expression$AnyStringExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004\u0000\u0000\u0000\bsq\u0000~\u0000"
+"\u0010\u0001q\u0000~\u0000\u001bsr\u0000 com.sun.msv.grammar.AnyNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dco"
+"m.sun.msv.grammar.NameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com.sun.msv.gram"
+"mar.Expression$EpsilonExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004\u0000\u0000\u0000\tq\u0000~\u0000\u001cq\u0000"
+"~\u0000!sr\u0000#com.sun.msv.grammar.SimpleNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\tloca"
+"lNamet\u0000\u0012Ljava/lang/String;L\u0000\fnamespaceURIq\u0000~\u0000#xq\u0000~\u0000\u001et\u0000-net.s"
+"ourceforge.czt.z.jaxb.gen.TermA.AnnsTypet\u0000+http://java.sun.c"
+"om/jaxb/xjc/dummy-elementssq\u0000~\u0000\r\u0000\u00be\u00f8\u00d3ppsq\u0000~\u0000\u0018\u0000\u00be\u00f8\u00c8q\u0000~\u0000\u0011psr\u0000\u001bco"
+"m.sun.msv.grammar.DataExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\u0002dtt\u0000\u001fLorg/relaxng/dat"
+"atype/Datatype;L\u0000\u0006exceptq\u0000~\u0000\u0003L\u0000\u0004namet\u0000\u001dLcom/sun/msv/util/Str"
+"ingPair;xq\u0000~\u0000\u0004\u00003\u00b11ppsr\u0000\"com.sun.msv.datatype.xsd.QnameType\u0000\u0000"
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
+"mlq\u0000~\u0000!sq\u0000~\u0000\u0000\u0001X+\u00e9pp\u0000sq\u0000~\u0000\u0007\u0001X+\u00deppsq\u0000~\u0000)\u0000L&\u0093q\u0000~\u0000\u0011psr\u0000#com.sun."
+"msv.datatype.xsd.StringType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001Z\u0000\risAlwaysValidxq\u0000~\u0000."
+"q\u0000~\u00003t\u0000\u0006stringsr\u00005com.sun.msv.datatype.xsd.WhiteSpaceProcess"
+"or$Preserve\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u00006\u0001q\u0000~\u00009sq\u0000~\u0000:q\u0000~\u0000Gq\u0000~\u00003sq\u0000~\u0000\r\u0001\f\u0005F"
+"ppsq\u0000~\u0000\u0018\u0001\f\u0005;q\u0000~\u0000\u0011pq\u0000~\u0000,sq\u0000~\u0000\"q\u0000~\u0000=q\u0000~\u0000>q\u0000~\u0000!sq\u0000~\u0000\"t\u0000\u0004Nameq\u0000~"
+"\u0000Asq\u0000~\u0000\r\u0004\u0019z\u001fppsq\u0000~\u0000\u0015\u0004\u0019z\u0014q\u0000~\u0000\u0011psq\u0000~\u0000\r\u0004\u0019z\u0011q\u0000~\u0000\u0011psq\u0000~\u0000\u0000\u0001dw\u00fbq\u0000~\u0000"
+"\u0011p\u0000sq\u0000~\u0000\r\u0001dw\u00f0ppsq\u0000~\u0000\u0015\u0001dw\u00e5q\u0000~\u0000\u0011psq\u0000~\u0000\u0018\u0001dw\u00e2q\u0000~\u0000\u0011pq\u0000~\u0000\u001bq\u0000~\u0000\u001fq\u0000~"
+"\u0000!sq\u0000~\u0000\"t\u0000,net.sourceforge.czt.z.jaxb.gen.ParentElementq\u0000~\u0000&"
+"sq\u0000~\u0000\u0000\u0002\u00b5\u0002\u0014q\u0000~\u0000\u0011p\u0000sq\u0000~\u0000\u0007\u0002\u00b5\u0002\tppsq\u0000~\u0000\u0000\u0001dw\u00fbpp\u0000sq\u0000~\u0000\r\u0001dw\u00f0ppsq\u0000~\u0000\u0015"
+"\u0001dw\u00e5q\u0000~\u0000\u0011psq\u0000~\u0000\u0018\u0001dw\u00e2q\u0000~\u0000\u0011pq\u0000~\u0000\u001bq\u0000~\u0000\u001fq\u0000~\u0000!sq\u0000~\u0000\"t\u0000%net.source"
+"forge.czt.z.jaxb.gen.Parentq\u0000~\u0000&sq\u0000~\u0000\r\u0001P\u008a\tppsq\u0000~\u0000\u0018\u0001P\u0089\u00feq\u0000~\u0000\u0011p"
+"q\u0000~\u0000,sq\u0000~\u0000\"q\u0000~\u0000=q\u0000~\u0000>q\u0000~\u0000!sq\u0000~\u0000\"t\u0000\u0006Parentq\u0000~\u0000Aq\u0000~\u0000!sq\u0000~\u0000\r\u000b#\u00bf"
+"\u00f4ppsq\u0000~\u0000\u0015\u000b#\u00bf\u00e9q\u0000~\u0000\u0011psq\u0000~\u0000\r\u000b#\u00bf\u00e6q\u0000~\u0000\u0011psq\u0000~\u0000\r\t\u00bfG\u00e9q\u0000~\u0000\u0011psq\u0000~\u0000\r\bZ\u00cf"
+"\u00ecq\u0000~\u0000\u0011psq\u0000~\u0000\r\u0006\u00f6W\u00efq\u0000~\u0000\u0011psq\u0000~\u0000\r\u0005\u0091\u00df\u00f2q\u0000~\u0000\u0011psq\u0000~\u0000\r\u0004-g\u00f5q\u0000~\u0000\u0011psq\u0000~\u0000"
+"\r\u0002\u00c8\u00ef\u00f8q\u0000~\u0000\u0011psq\u0000~\u0000\u0000\u0001dw\u00fbq\u0000~\u0000\u0011p\u0000sq\u0000~\u0000\r\u0001dw\u00f0ppsq\u0000~\u0000\u0015\u0001dw\u00e5q\u0000~\u0000\u0011psq\u0000~"
+"\u0000\u0018\u0001dw\u00e2q\u0000~\u0000\u0011pq\u0000~\u0000\u001bq\u0000~\u0000\u001fq\u0000~\u0000!sq\u0000~\u0000\"t\u0000.net.sourceforge.czt.z.ja"
+"xb.gen.NarrParaElementq\u0000~\u0000&sq\u0000~\u0000\u0000\u0001dw\u00fbq\u0000~\u0000\u0011p\u0000sq\u0000~\u0000\r\u0001dw\u00f0ppsq\u0000~"
+"\u0000\u0015\u0001dw\u00e5q\u0000~\u0000\u0011psq\u0000~\u0000\u0018\u0001dw\u00e2q\u0000~\u0000\u0011pq\u0000~\u0000\u001bq\u0000~\u0000\u001fq\u0000~\u0000!sq\u0000~\u0000\"t\u00002net.sour"
+"ceforge.czt.z.jaxb.gen.UnparsedParaElementq\u0000~\u0000&sq\u0000~\u0000\u0000\u0001dw\u00fbq\u0000~"
+"\u0000\u0011p\u0000sq\u0000~\u0000\r\u0001dw\u00f0ppsq\u0000~\u0000\u0015\u0001dw\u00e5q\u0000~\u0000\u0011psq\u0000~\u0000\u0018\u0001dw\u00e2q\u0000~\u0000\u0011pq\u0000~\u0000\u001bq\u0000~\u0000\u001fq\u0000"
+"~\u0000!sq\u0000~\u0000\"t\u00000net.sourceforge.czt.oz.jaxb.gen.ClassParaElement"
+"q\u0000~\u0000&sq\u0000~\u0000\u0000\u0001dw\u00fbq\u0000~\u0000\u0011p\u0000sq\u0000~\u0000\r\u0001dw\u00f0ppsq\u0000~\u0000\u0015\u0001dw\u00e5q\u0000~\u0000\u0011psq\u0000~\u0000\u0018\u0001dw\u00e2"
+"q\u0000~\u0000\u0011pq\u0000~\u0000\u001bq\u0000~\u0000\u001fq\u0000~\u0000!sq\u0000~\u0000\"t\u00000net.sourceforge.czt.z.jaxb.gen"
+".OptempParaElementq\u0000~\u0000&sq\u0000~\u0000\u0000\u0001dw\u00fbq\u0000~\u0000\u0011p\u0000sq\u0000~\u0000\r\u0001dw\u00f0ppsq\u0000~\u0000\u0015\u0001d"
+"w\u00e5q\u0000~\u0000\u0011psq\u0000~\u0000\u0018\u0001dw\u00e2q\u0000~\u0000\u0011pq\u0000~\u0000\u001bq\u0000~\u0000\u001fq\u0000~\u0000!sq\u0000~\u0000\"t\u0000.net.sourcefo"
+"rge.czt.z.jaxb.gen.ConjParaElementq\u0000~\u0000&sq\u0000~\u0000\u0000\u0001dw\u00fbq\u0000~\u0000\u0011p\u0000sq\u0000~"
+"\u0000\r\u0001dw\u00f0ppsq\u0000~\u0000\u0015\u0001dw\u00e5q\u0000~\u0000\u0011psq\u0000~\u0000\u0018\u0001dw\u00e2q\u0000~\u0000\u0011pq\u0000~\u0000\u001bq\u0000~\u0000\u001fq\u0000~\u0000!sq\u0000~\u0000"
+"\"t\u0000/net.sourceforge.czt.z.jaxb.gen.GivenParaElementq\u0000~\u0000&sq\u0000~"
+"\u0000\u0000\u0001dw\u00fbq\u0000~\u0000\u0011p\u0000sq\u0000~\u0000\r\u0001dw\u00f0ppsq\u0000~\u0000\u0015\u0001dw\u00e5q\u0000~\u0000\u0011psq\u0000~\u0000\u0018\u0001dw\u00e2q\u0000~\u0000\u0011pq\u0000~"
+"\u0000\u001bq\u0000~\u0000\u001fq\u0000~\u0000!sq\u0000~\u0000\"t\u0000,net.sourceforge.czt.z.jaxb.gen.AxParaEl"
+"ementq\u0000~\u0000&sq\u0000~\u0000\u0000\u0001dw\u00fbq\u0000~\u0000\u0011p\u0000sq\u0000~\u0000\r\u0001dw\u00f0ppsq\u0000~\u0000\u0015\u0001dw\u00e5q\u0000~\u0000\u0011psq\u0000~\u0000"
+"\u0018\u0001dw\u00e2q\u0000~\u0000\u0011pq\u0000~\u0000\u001bq\u0000~\u0000\u001fq\u0000~\u0000!sq\u0000~\u0000\"t\u0000.net.sourceforge.czt.z.jax"
+"b.gen.FreeParaElementq\u0000~\u0000&q\u0000~\u0000!sq\u0000~\u0000\r\u0000\u00e0\u00f3\u00a1ppsq\u0000~\u0000\u0018\u0000\u00e0\u00f3\u0096q\u0000~\u0000\u0011pq"
+"\u0000~\u0000,sq\u0000~\u0000\"q\u0000~\u0000=q\u0000~\u0000>q\u0000~\u0000!sq\u0000~\u0000\"t\u0000\u0005ZSectq\u0000~\u0000Asr\u0000\"com.sun.msv."
+"grammar.ExpressionPool\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\bexpTablet\u0000/Lcom/sun/msv/"
+"grammar/ExpressionPool$ClosedHash;xpsr\u0000-com.sun.msv.grammar."
+"ExpressionPool$ClosedHash\u00d7j\u00d0N\u00ef\u00e8\u00ed\u001c\u0002\u0000\u0004I\u0000\u0005countI\u0000\tthresholdL\u0000\u0006p"
+"arentq\u0000~\u0000\u00a5[\u0000\u0005tablet\u0000![Lcom/sun/msv/grammar/Expression;xp\u0000\u0000\u0000."
+"\u0000\u0000\u00009pur\u0000![Lcom.sun.msv.grammar.Expression;\u00d68D\u00c3]\u00ad\u00a7\n\u0002\u0000\u0000xp\u0000\u0000\u0000\u00bfq"
+"\u0000~\u0000Ppppppppppppq\u0000~\u0000mppppq\u0000~\u0000\u0012ppppppppq\u0000~\u0000jppq\u0000~\u0000\nppppq\u0000~\u0000Zpp"
+"ppq\u0000~\u0000\u000eppq\u0000~\u0000Cppppppppppppppppppppppq\u0000~\u0000Kpppppq\u0000~\u0000npq\u0000~\u0000\'ppp"
+"ppppppppq\u0000~\u0000kppppq\u0000~\u0000appppppq\u0000~\u0000\fq\u0000~\u0000\u009fq\u0000~\u0000hppq\u0000~\u0000\u000bq\u0000~\u0000gppppq"
+"\u0000~\u0000\u0017q\u0000~\u0000Uq\u0000~\u0000]q\u0000~\u0000qq\u0000~\u0000wq\u0000~\u0000}q\u0000~\u0000\u0083q\u0000~\u0000\u0089q\u0000~\u0000\u008fq\u0000~\u0000\u0095q\u0000~\u0000\u009bq\u0000~\u0000\u0014q"
+"\u0000~\u0000Tq\u0000~\u0000\\q\u0000~\u0000pq\u0000~\u0000vq\u0000~\u0000|q\u0000~\u0000\u0082q\u0000~\u0000\u0088q\u0000~\u0000\u008eq\u0000~\u0000\u0094q\u0000~\u0000\u009aq\u0000~\u0000fpq\u0000~\u0000\t"
+"pppppppppppq\u0000~\u0000lpppppppppppppq\u0000~\u0000ippppppppppppppppppq\u0000~\u0000Rppq"
+"\u0000~\u0000Qpppppppppp"));
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
            return net.sourceforge.czt.z.jaxb.gen.impl.ZSectElementImpl.this;
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
                    case  1 :
                        if (("Anns" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.z.jaxb.gen.impl.ZSectImpl)net.sourceforge.czt.z.jaxb.gen.impl.ZSectElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("Name" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.z.jaxb.gen.impl.ZSectImpl)net.sourceforge.czt.z.jaxb.gen.impl.ZSectElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        spawnHandlerFromEnterElement((((net.sourceforge.czt.z.jaxb.gen.impl.ZSectImpl)net.sourceforge.czt.z.jaxb.gen.impl.ZSectElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                        return ;
                    case  3 :
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
                    case  2 :
                        if (("ZSect" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            context.popAttributes();
                            state = 3;
                            return ;
                        }
                        break;
                    case  1 :
                        spawnHandlerFromLeaveElement((((net.sourceforge.czt.z.jaxb.gen.impl.ZSectImpl)net.sourceforge.czt.z.jaxb.gen.impl.ZSectElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
                        return ;
                    case  3 :
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
                    case  1 :
                        spawnHandlerFromEnterAttribute((((net.sourceforge.czt.z.jaxb.gen.impl.ZSectImpl)net.sourceforge.czt.z.jaxb.gen.impl.ZSectElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
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
                        spawnHandlerFromLeaveAttribute((((net.sourceforge.czt.z.jaxb.gen.impl.ZSectImpl)net.sourceforge.czt.z.jaxb.gen.impl.ZSectElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
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
                            spawnHandlerFromText((((net.sourceforge.czt.z.jaxb.gen.impl.ZSectImpl)net.sourceforge.czt.z.jaxb.gen.impl.ZSectElementImpl.this).new Unmarshaller(context)), 2, value);
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
