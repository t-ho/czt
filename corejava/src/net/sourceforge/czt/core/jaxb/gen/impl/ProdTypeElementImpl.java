//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.1-05/30/2003 05:06 AM(java_re)-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2003.10.08 at 02:45:10 NZDT 
//


package net.sourceforge.czt.core.jaxb.gen.impl;

public class ProdTypeElementImpl
    extends net.sourceforge.czt.core.jaxb.gen.impl.ProdTypeImpl
    implements net.sourceforge.czt.core.jaxb.gen.ProdTypeElement, com.sun.xml.bind.JAXBObject, com.sun.xml.bind.RIElement, net.sourceforge.czt.zpatt.jaxb.gen.impl.runtime.UnmarshallableObject, net.sourceforge.czt.zpatt.jaxb.gen.impl.runtime.XMLSerializable, net.sourceforge.czt.zpatt.jaxb.gen.impl.runtime.ValidatableObject
{

    public final static java.lang.Class version = (net.sourceforge.czt.core.jaxb.gen.impl.JAXBVersion.class);
    private static com.sun.msv.grammar.Grammar schemaFragment;

    public java.lang.String ____jaxb_ri____getNamespaceURI() {
        return "http://czt.sourceforge.net/zml";
    }

    public java.lang.String ____jaxb_ri____getLocalName() {
        return "ProdType";
    }

    private final static java.lang.Class PRIMARY_INTERFACE_CLASS() {
        return (net.sourceforge.czt.core.jaxb.gen.ProdTypeElement.class);
    }

    public net.sourceforge.czt.zpatt.jaxb.gen.impl.runtime.UnmarshallingEventHandler createUnmarshaller(net.sourceforge.czt.zpatt.jaxb.gen.impl.runtime.UnmarshallingContext context) {
        return new net.sourceforge.czt.core.jaxb.gen.impl.ProdTypeElementImpl.Unmarshaller(context);
    }

    public void serializeElementBody(net.sourceforge.czt.zpatt.jaxb.gen.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        context.startElement("http://czt.sourceforge.net/zml", "ProdType");
        super.serializeURIs(context);
        context.endNamespaceDecls();
        super.serializeAttributes(context);
        context.endAttributes();
        super.serializeElementBody(context);
        context.endElement();
    }

    public void serializeAttributes(net.sourceforge.czt.zpatt.jaxb.gen.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
    }

    public void serializeAttributeBody(net.sourceforge.czt.zpatt.jaxb.gen.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        context.startElement("http://czt.sourceforge.net/zml", "ProdType");
        super.serializeURIs(context);
        context.endNamespaceDecls();
        super.serializeAttributes(context);
        context.endAttributes();
        super.serializeElementBody(context);
        context.endElement();
    }

    public void serializeURIs(net.sourceforge.czt.zpatt.jaxb.gen.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
    }

    public java.lang.Class getPrimaryInterface() {
        return (net.sourceforge.czt.core.jaxb.gen.ProdTypeElement.class);
    }

    public com.sun.msv.verifier.DocumentDeclaration createRawValidator() {
        if (schemaFragment == null) {
            schemaFragment = com.sun.xml.bind.validator.SchemaDeserializer.deserialize((
 "\u00ac\u00ed\u0000\u0005sr\u0000\'com.sun.msv.grammar.trex.ElementPattern\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000"
+"\tnameClasst\u0000\u001fLcom/sun/msv/grammar/NameClass;xr\u0000\u001ecom.sun.msv."
+"grammar.ElementExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002Z\u0000\u001aignoreUndeclaredAttributesL\u0000"
+"\fcontentModelt\u0000 Lcom/sun/msv/grammar/Expression;xr\u0000\u001ecom.sun."
+"msv.grammar.Expression\u00f8\u0018\u0082\u00e8N5~O\u0002\u0000\u0003I\u0000\u000ecachedHashCodeL\u0000\u0013epsilon"
+"Reducibilityt\u0000\u0013Ljava/lang/Boolean;L\u0000\u000bexpandedExpq\u0000~\u0000\u0003xp\u0017\u00cfm\u00d6p"
+"p\u0000sr\u0000\u001fcom.sun.msv.grammar.SequenceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun."
+"msv.grammar.BinaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0004exp1q\u0000~\u0000\u0003L\u0000\u0004exp2q\u0000~\u0000\u0003xq\u0000~"
+"\u0000\u0004\u0017\u00cfm\u00cbppsq\u0000~\u0000\u0007\u0010^\u009bxppsq\u0000~\u0000\u0007\b\u00ed\u00c93ppsr\u0000\u001dcom.sun.msv.grammar.Choi"
+"ceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\b\u0001|\u00f6\u00eeppsq\u0000~\u0000\u0000\u0001|\u00f6\u00e3sr\u0000\u0011java.lang.Boolean\u00cd"
+" r\u0080\u00d5\u009c\u00fa\u00ee\u0002\u0000\u0001Z\u0000\u0005valuexp\u0000p\u0000sq\u0000~\u0000\u0000\u0001|\u00f6\u00d8pp\u0000sq\u0000~\u0000\f\u0001|\u00f6\u00cdppsr\u0000 com.sun."
+"msv.grammar.OneOrMoreExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001ccom.sun.msv.grammar.U"
+"naryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\u0003expq\u0000~\u0000\u0003xq\u0000~\u0000\u0004\u0001|\u00f6\u00c2q\u0000~\u0000\u0010psr\u0000 com.sun.msv"
+".grammar.AttributeExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003expq\u0000~\u0000\u0003L\u0000\tnameClassq\u0000~\u0000\u0001"
+"xq\u0000~\u0000\u0004\u0001|\u00f6\u00bfq\u0000~\u0000\u0010psr\u00002com.sun.msv.grammar.Expression$AnyString"
+"Expression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004\u0000\u0000\u0000\bsq\u0000~\u0000\u000f\u0001q\u0000~\u0000\u0019sr\u0000 com.sun.msv.g"
+"rammar.AnyNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun.msv.grammar.NameCl"
+"ass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com.sun.msv.grammar.Expression$EpsilonEx"
+"pression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004\u0000\u0000\u0000\tq\u0000~\u0000\u001aq\u0000~\u0000\u001fsr\u0000#com.sun.msv.gramm"
+"ar.SimpleNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\tlocalNamet\u0000\u0012Ljava/lang/Strin"
+"g;L\u0000\fnamespaceURIq\u0000~\u0000!xq\u0000~\u0000\u001ct\u00000net.sourceforge.czt.core.jaxb"
+".gen.TermA.AnnsTypet\u0000+http://java.sun.com/jaxb/xjc/dummy-ele"
+"mentssq\u0000~\u0000 t\u0000\u0004Annst\u0000\u001ehttp://czt.sourceforge.net/zmlq\u0000~\u0000\u001fsq\u0000~"
+"\u0000\f\u0007p\u00d2@ppsq\u0000~\u0000\f\u0005\u00f3\u00dbfppsq\u0000~\u0000\f\u0004v\u00e4\u008cppsq\u0000~\u0000\f\u0002\u00f9\u00ed\u00b2ppsq\u0000~\u0000\u0000\u0001|\u00f6\u00d8pp\u0000sq\u0000"
+"~\u0000\f\u0001|\u00f6\u00cdppsq\u0000~\u0000\u0013\u0001|\u00f6\u00c2q\u0000~\u0000\u0010psq\u0000~\u0000\u0016\u0001|\u00f6\u00bfq\u0000~\u0000\u0010pq\u0000~\u0000\u0019q\u0000~\u0000\u001dq\u0000~\u0000\u001fsq\u0000~"
+"\u0000 t\u00000net.sourceforge.czt.core.jaxb.gen.GenTypeElementq\u0000~\u0000$sq"
+"\u0000~\u0000\u0000\u0001|\u00f6\u00d8pp\u0000sq\u0000~\u0000\f\u0001|\u00f6\u00cdppsq\u0000~\u0000\u0013\u0001|\u00f6\u00c2q\u0000~\u0000\u0010psq\u0000~\u0000\u0016\u0001|\u00f6\u00bfq\u0000~\u0000\u0010pq\u0000~\u0000\u0019"
+"q\u0000~\u0000\u001dq\u0000~\u0000\u001fsq\u0000~\u0000 t\u00001net.sourceforge.czt.core.jaxb.gen.ProdTyp"
+"eElementq\u0000~\u0000$sq\u0000~\u0000\u0000\u0001|\u00f6\u00d8pp\u0000sq\u0000~\u0000\f\u0001|\u00f6\u00cdppsq\u0000~\u0000\u0013\u0001|\u00f6\u00c2q\u0000~\u0000\u0010psq\u0000~\u0000\u0016"
+"\u0001|\u00f6\u00bfq\u0000~\u0000\u0010pq\u0000~\u0000\u0019q\u0000~\u0000\u001dq\u0000~\u0000\u001fsq\u0000~\u0000 t\u00002net.sourceforge.czt.core.j"
+"axb.gen.PowerTypeElementq\u0000~\u0000$sq\u0000~\u0000\u0000\u0001|\u00f6\u00d8pp\u0000sq\u0000~\u0000\f\u0001|\u00f6\u00cdppsq\u0000~\u0000\u0013"
+"\u0001|\u00f6\u00c2q\u0000~\u0000\u0010psq\u0000~\u0000\u0016\u0001|\u00f6\u00bfq\u0000~\u0000\u0010pq\u0000~\u0000\u0019q\u0000~\u0000\u001dq\u0000~\u0000\u001fsq\u0000~\u0000 t\u00003net.source"
+"forge.czt.core.jaxb.gen.SchemaTypeElementq\u0000~\u0000$sq\u0000~\u0000\u0000\u0001|\u00f6\u00d8pp\u0000s"
+"q\u0000~\u0000\f\u0001|\u00f6\u00cdppsq\u0000~\u0000\u0013\u0001|\u00f6\u00c2q\u0000~\u0000\u0010psq\u0000~\u0000\u0016\u0001|\u00f6\u00bfq\u0000~\u0000\u0010pq\u0000~\u0000\u0019q\u0000~\u0000\u001dq\u0000~\u0000\u001fsq"
+"\u0000~\u0000 t\u00002net.sourceforge.czt.core.jaxb.gen.GivenTypeElementq\u0000~"
+"\u0000$sq\u0000~\u0000\f\u0007p\u00d2@ppsq\u0000~\u0000\f\u0005\u00f3\u00dbfppsq\u0000~\u0000\f\u0004v\u00e4\u008cppsq\u0000~\u0000\f\u0002\u00f9\u00ed\u00b2ppsq\u0000~\u0000\u0000\u0001|\u00f6\u00d8"
+"pp\u0000sq\u0000~\u0000\f\u0001|\u00f6\u00cdppsq\u0000~\u0000\u0013\u0001|\u00f6\u00c2q\u0000~\u0000\u0010psq\u0000~\u0000\u0016\u0001|\u00f6\u00bfq\u0000~\u0000\u0010pq\u0000~\u0000\u0019q\u0000~\u0000\u001dq\u0000~"
+"\u0000\u001fsq\u0000~\u0000 q\u0000~\u00001q\u0000~\u0000$sq\u0000~\u0000\u0000\u0001|\u00f6\u00d8pp\u0000sq\u0000~\u0000\f\u0001|\u00f6\u00cdppsq\u0000~\u0000\u0013\u0001|\u00f6\u00c2q\u0000~\u0000\u0010ps"
+"q\u0000~\u0000\u0016\u0001|\u00f6\u00bfq\u0000~\u0000\u0010pq\u0000~\u0000\u0019q\u0000~\u0000\u001dq\u0000~\u0000\u001fsq\u0000~\u0000 q\u0000~\u00007q\u0000~\u0000$sq\u0000~\u0000\u0000\u0001|\u00f6\u00d8pp\u0000s"
+"q\u0000~\u0000\f\u0001|\u00f6\u00cdppsq\u0000~\u0000\u0013\u0001|\u00f6\u00c2q\u0000~\u0000\u0010psq\u0000~\u0000\u0016\u0001|\u00f6\u00bfq\u0000~\u0000\u0010pq\u0000~\u0000\u0019q\u0000~\u0000\u001dq\u0000~\u0000\u001fsq"
+"\u0000~\u0000 q\u0000~\u0000=q\u0000~\u0000$sq\u0000~\u0000\u0000\u0001|\u00f6\u00d8pp\u0000sq\u0000~\u0000\f\u0001|\u00f6\u00cdppsq\u0000~\u0000\u0013\u0001|\u00f6\u00c2q\u0000~\u0000\u0010psq\u0000~\u0000"
+"\u0016\u0001|\u00f6\u00bfq\u0000~\u0000\u0010pq\u0000~\u0000\u0019q\u0000~\u0000\u001dq\u0000~\u0000\u001fsq\u0000~\u0000 q\u0000~\u0000Cq\u0000~\u0000$sq\u0000~\u0000\u0000\u0001|\u00f6\u00d8pp\u0000sq\u0000~\u0000"
+"\f\u0001|\u00f6\u00cdppsq\u0000~\u0000\u0013\u0001|\u00f6\u00c2q\u0000~\u0000\u0010psq\u0000~\u0000\u0016\u0001|\u00f6\u00bfq\u0000~\u0000\u0010pq\u0000~\u0000\u0019q\u0000~\u0000\u001dq\u0000~\u0000\u001fsq\u0000~\u0000 "
+"q\u0000~\u0000Iq\u0000~\u0000$sq\u0000~\u0000\f\u0007p\u00d2Nppsq\u0000~\u0000\u0013\u0007p\u00d2Cq\u0000~\u0000\u0010psq\u0000~\u0000\f\u0007p\u00d2@q\u0000~\u0000\u0010psq\u0000~\u0000\f"
+"\u0005\u00f3\u00dbfq\u0000~\u0000\u0010psq\u0000~\u0000\f\u0004v\u00e4\u008cq\u0000~\u0000\u0010psq\u0000~\u0000\f\u0002\u00f9\u00ed\u00b2q\u0000~\u0000\u0010psq\u0000~\u0000\u0000\u0001|\u00f6\u00d8q\u0000~\u0000\u0010p\u0000s"
+"q\u0000~\u0000\f\u0001|\u00f6\u00cdppsq\u0000~\u0000\u0013\u0001|\u00f6\u00c2q\u0000~\u0000\u0010psq\u0000~\u0000\u0016\u0001|\u00f6\u00bfq\u0000~\u0000\u0010pq\u0000~\u0000\u0019q\u0000~\u0000\u001dq\u0000~\u0000\u001fsq"
+"\u0000~\u0000 q\u0000~\u00001q\u0000~\u0000$sq\u0000~\u0000\u0000\u0001|\u00f6\u00d8q\u0000~\u0000\u0010p\u0000sq\u0000~\u0000\f\u0001|\u00f6\u00cdppsq\u0000~\u0000\u0013\u0001|\u00f6\u00c2q\u0000~\u0000\u0010ps"
+"q\u0000~\u0000\u0016\u0001|\u00f6\u00bfq\u0000~\u0000\u0010pq\u0000~\u0000\u0019q\u0000~\u0000\u001dq\u0000~\u0000\u001fsq\u0000~\u0000 q\u0000~\u00007q\u0000~\u0000$sq\u0000~\u0000\u0000\u0001|\u00f6\u00d8q\u0000~\u0000"
+"\u0010p\u0000sq\u0000~\u0000\f\u0001|\u00f6\u00cdppsq\u0000~\u0000\u0013\u0001|\u00f6\u00c2q\u0000~\u0000\u0010psq\u0000~\u0000\u0016\u0001|\u00f6\u00bfq\u0000~\u0000\u0010pq\u0000~\u0000\u0019q\u0000~\u0000\u001dq\u0000~"
+"\u0000\u001fsq\u0000~\u0000 q\u0000~\u0000=q\u0000~\u0000$sq\u0000~\u0000\u0000\u0001|\u00f6\u00d8q\u0000~\u0000\u0010p\u0000sq\u0000~\u0000\f\u0001|\u00f6\u00cdppsq\u0000~\u0000\u0013\u0001|\u00f6\u00c2q\u0000~"
+"\u0000\u0010psq\u0000~\u0000\u0016\u0001|\u00f6\u00bfq\u0000~\u0000\u0010pq\u0000~\u0000\u0019q\u0000~\u0000\u001dq\u0000~\u0000\u001fsq\u0000~\u0000 q\u0000~\u0000Cq\u0000~\u0000$sq\u0000~\u0000\u0000\u0001|\u00f6\u00d8"
+"q\u0000~\u0000\u0010p\u0000sq\u0000~\u0000\f\u0001|\u00f6\u00cdppsq\u0000~\u0000\u0013\u0001|\u00f6\u00c2q\u0000~\u0000\u0010psq\u0000~\u0000\u0016\u0001|\u00f6\u00bfq\u0000~\u0000\u0010pq\u0000~\u0000\u0019q\u0000~\u0000"
+"\u001dq\u0000~\u0000\u001fsq\u0000~\u0000 q\u0000~\u0000Iq\u0000~\u0000$q\u0000~\u0000\u001fsq\u0000~\u0000 t\u0000\bProdTypeq\u0000~\u0000\'sr\u0000\"com.sun"
+".msv.grammar.ExpressionPool\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\bexpTablet\u0000/Lcom/sun"
+"/msv/grammar/ExpressionPool$ClosedHash;xpsr\u0000-com.sun.msv.gra"
+"mmar.ExpressionPool$ClosedHash\u00d7j\u00d0N\u00ef\u00e8\u00ed\u001c\u0002\u0000\u0004I\u0000\u0005countI\u0000\tthreshol"
+"dL\u0000\u0006parentq\u0000~\u0000\u0089[\u0000\u0005tablet\u0000![Lcom/sun/msv/grammar/Expression;x"
+"p\u0000\u0000\u00002\u0000\u0000\u00009pur\u0000![Lcom.sun.msv.grammar.Expression;\u00d68D\u00c3]\u00ad\u00a7\n\u0002\u0000\u0000xp"
+"\u0000\u0000\u0000\u00bfpppppppppppppppq\u0000~\u0000(q\u0000~\u0000Jq\u0000~\u0000iq\u0000~\u0000hppq\u0000~\u0000\tpppppppq\u0000~\u0000gpp"
+"pppppppppppq\u0000~\u0000+q\u0000~\u0000Mq\u0000~\u0000lpppppppppppppppppppppppppppppppppp"
+"ppppppppq\u0000~\u0000)q\u0000~\u0000Kq\u0000~\u0000jpppq\u0000~\u0000\u0015q\u0000~\u0000.q\u0000~\u00004q\u0000~\u0000:q\u0000~\u0000@q\u0000~\u0000Fq\u0000~\u0000"
+"Pq\u0000~\u0000Uq\u0000~\u0000Zq\u0000~\u0000_q\u0000~\u0000dq\u0000~\u0000\u0012q\u0000~\u0000-q\u0000~\u00003q\u0000~\u00009q\u0000~\u0000?q\u0000~\u0000Eq\u0000~\u0000Oq\u0000~\u0000"
+"Tq\u0000~\u0000Yq\u0000~\u0000^q\u0000~\u0000cq\u0000~\u0000oq\u0000~\u0000nq\u0000~\u0000tq\u0000~\u0000sq\u0000~\u0000yq\u0000~\u0000xq\u0000~\u0000~q\u0000~\u0000}q\u0000~\u0000"
+"\u0083q\u0000~\u0000\u0082ppppppppppppq\u0000~\u0000\rpppppppppppppppppppq\u0000~\u0000\u000bppq\u0000~\u0000*q\u0000~\u0000Lq"
+"\u0000~\u0000kppppppppppppppq\u0000~\u0000\npppppppppppp"));
        }
        return new com.sun.msv.verifier.regexp.REDocumentDeclaration(schemaFragment);
    }

    public class Unmarshaller
        extends net.sourceforge.czt.zpatt.jaxb.gen.impl.runtime.AbstractUnmarshallingEventHandlerImpl
    {


        public Unmarshaller(net.sourceforge.czt.zpatt.jaxb.gen.impl.runtime.UnmarshallingContext context) {
            super(context, "----");
        }

        protected Unmarshaller(net.sourceforge.czt.zpatt.jaxb.gen.impl.runtime.UnmarshallingContext context, int startState) {
            this(context);
            state = startState;
        }

        public java.lang.Object owner() {
            return net.sourceforge.czt.core.jaxb.gen.impl.ProdTypeElementImpl.this;
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
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.core.jaxb.gen.impl.ProdTypeImpl)net.sourceforge.czt.core.jaxb.gen.impl.ProdTypeElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("Type" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.core.jaxb.gen.impl.ProdTypeImpl)net.sourceforge.czt.core.jaxb.gen.impl.ProdTypeElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("GenType" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.core.jaxb.gen.impl.ProdTypeImpl)net.sourceforge.czt.core.jaxb.gen.impl.ProdTypeElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("ProdType" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.core.jaxb.gen.impl.ProdTypeImpl)net.sourceforge.czt.core.jaxb.gen.impl.ProdTypeElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("PowerType" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.core.jaxb.gen.impl.ProdTypeImpl)net.sourceforge.czt.core.jaxb.gen.impl.ProdTypeElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("SchemaType" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.core.jaxb.gen.impl.ProdTypeImpl)net.sourceforge.czt.core.jaxb.gen.impl.ProdTypeElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("GivenType" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.core.jaxb.gen.impl.ProdTypeImpl)net.sourceforge.czt.core.jaxb.gen.impl.ProdTypeElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        spawnHandlerFromEnterElement((((net.sourceforge.czt.core.jaxb.gen.impl.ProdTypeImpl)net.sourceforge.czt.core.jaxb.gen.impl.ProdTypeElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                        return ;
                    case  3 :
                        revertToParentFromEnterElement(___uri, ___local, ___qname, __atts);
                        return ;
                    case  0 :
                        if (("ProdType" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
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
                        spawnHandlerFromLeaveElement((((net.sourceforge.czt.core.jaxb.gen.impl.ProdTypeImpl)net.sourceforge.czt.core.jaxb.gen.impl.ProdTypeElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
                        return ;
                    case  3 :
                        revertToParentFromLeaveElement(___uri, ___local, ___qname);
                        return ;
                    case  2 :
                        if (("ProdType" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
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
                        spawnHandlerFromEnterAttribute((((net.sourceforge.czt.core.jaxb.gen.impl.ProdTypeImpl)net.sourceforge.czt.core.jaxb.gen.impl.ProdTypeElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
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
                        spawnHandlerFromLeaveAttribute((((net.sourceforge.czt.core.jaxb.gen.impl.ProdTypeImpl)net.sourceforge.czt.core.jaxb.gen.impl.ProdTypeElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
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
                            spawnHandlerFromText((((net.sourceforge.czt.core.jaxb.gen.impl.ProdTypeImpl)net.sourceforge.czt.core.jaxb.gen.impl.ProdTypeElementImpl.this).new Unmarshaller(context)), 2, value);
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
