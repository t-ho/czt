//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.1-05/30/2003 05:06 AM(java_re)-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2003.10.08 at 02:45:10 NZDT 
//


package net.sourceforge.czt.core.jaxb.gen.impl;

public class AndPredElementImpl
    extends net.sourceforge.czt.core.jaxb.gen.impl.AndPredImpl
    implements net.sourceforge.czt.core.jaxb.gen.AndPredElement, com.sun.xml.bind.JAXBObject, com.sun.xml.bind.RIElement, net.sourceforge.czt.zpatt.jaxb.gen.impl.runtime.UnmarshallableObject, net.sourceforge.czt.zpatt.jaxb.gen.impl.runtime.XMLSerializable, net.sourceforge.czt.zpatt.jaxb.gen.impl.runtime.ValidatableObject
{

    public final static java.lang.Class version = (net.sourceforge.czt.core.jaxb.gen.impl.JAXBVersion.class);
    private static com.sun.msv.grammar.Grammar schemaFragment;

    public java.lang.String ____jaxb_ri____getNamespaceURI() {
        return "http://czt.sourceforge.net/zml";
    }

    public java.lang.String ____jaxb_ri____getLocalName() {
        return "AndPred";
    }

    private final static java.lang.Class PRIMARY_INTERFACE_CLASS() {
        return (net.sourceforge.czt.core.jaxb.gen.AndPredElement.class);
    }

    public net.sourceforge.czt.zpatt.jaxb.gen.impl.runtime.UnmarshallingEventHandler createUnmarshaller(net.sourceforge.czt.zpatt.jaxb.gen.impl.runtime.UnmarshallingContext context) {
        return new net.sourceforge.czt.core.jaxb.gen.impl.AndPredElementImpl.Unmarshaller(context);
    }

    public void serializeElementBody(net.sourceforge.czt.zpatt.jaxb.gen.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        context.startElement("http://czt.sourceforge.net/zml", "AndPred");
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
        context.startElement("http://czt.sourceforge.net/zml", "AndPred");
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
        return (net.sourceforge.czt.core.jaxb.gen.AndPredElement.class);
    }

    public com.sun.msv.verifier.DocumentDeclaration createRawValidator() {
        if (schemaFragment == null) {
            schemaFragment = com.sun.xml.bind.validator.SchemaDeserializer.deserialize((
 "\u00ac\u00ed\u0000\u0005sr\u0000\'com.sun.msv.grammar.trex.ElementPattern\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000"
+"\tnameClasst\u0000\u001fLcom/sun/msv/grammar/NameClass;xr\u0000\u001ecom.sun.msv."
+"grammar.ElementExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002Z\u0000\u001aignoreUndeclaredAttributesL\u0000"
+"\fcontentModelt\u0000 Lcom/sun/msv/grammar/Expression;xr\u0000\u001ecom.sun."
+"msv.grammar.Expression\u00f8\u0018\u0082\u00e8N5~O\u0002\u0000\u0003I\u0000\u000ecachedHashCodeL\u0000\u0013epsilon"
+"Reducibilityt\u0000\u0013Ljava/lang/Boolean;L\u0000\u000bexpandedExpq\u0000~\u0000\u0003xp1\u00e5Jhp"
+"p\u0000sr\u0000\u001fcom.sun.msv.grammar.SequenceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun."
+"msv.grammar.BinaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0004exp1q\u0000~\u0000\u0003L\u0000\u0004exp2q\u0000~\u0000\u0003xq\u0000~"
+"\u0000\u00041\u00e5J]ppsq\u0000~\u0000\u00071\u001b\u00d24ppsq\u0000~\u0000\u0007\u0019Ld\u0091ppsr\u0000\u001dcom.sun.msv.grammar.Choi"
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
+"\u0000\f\u0017\u00cfm\u009eppsq\u0000~\u0000\f\u0016Rv\u00c4ppsq\u0000~\u0000\f\u0014\u00d5\u007f\u00eappsq\u0000~\u0000\f\u0013X\u0089\u0010ppsq\u0000~\u0000\f\u0011\u00db\u00926ppsq\u0000~"
+"\u0000\f\u0010^\u009b\\ppsq\u0000~\u0000\f\u000e\u00e1\u00a4\u0082ppsq\u0000~\u0000\f\rd\u00ad\u00a8ppsq\u0000~\u0000\f\u000b\u00e7\u00b6\u00ceppsq\u0000~\u0000\f\nj\u00bf\u00f4ppsq\u0000~"
+"\u0000\f\b\u00ed\u00c9\u001appsq\u0000~\u0000\f\u0007p\u00d2@ppsq\u0000~\u0000\f\u0005\u00f3\u00dbfppsq\u0000~\u0000\f\u0004v\u00e4\u008cppsq\u0000~\u0000\f\u0002\u00f9\u00ed\u00b2ppsq\u0000~"
+"\u0000\u0000\u0001|\u00f6\u00d8pp\u0000sq\u0000~\u0000\f\u0001|\u00f6\u00cdppsq\u0000~\u0000\u0013\u0001|\u00f6\u00c2q\u0000~\u0000\u0010psq\u0000~\u0000\u0016\u0001|\u00f6\u00bfq\u0000~\u0000\u0010pq\u0000~\u0000\u0019q\u0000"
+"~\u0000\u001dq\u0000~\u0000\u001fsq\u0000~\u0000 t\u0000*net.sourceforge.czt.core.jaxb.gen.TruePredq"
+"\u0000~\u0000$sq\u0000~\u0000\u0000\u0001|\u00f6\u00d8pp\u0000sq\u0000~\u0000\f\u0001|\u00f6\u00cdppsq\u0000~\u0000\u0013\u0001|\u00f6\u00c2q\u0000~\u0000\u0010psq\u0000~\u0000\u0016\u0001|\u00f6\u00bfq\u0000~\u0000\u0010"
+"pq\u0000~\u0000\u0019q\u0000~\u0000\u001dq\u0000~\u0000\u001fsq\u0000~\u0000 t\u0000.net.sourceforge.czt.core.jaxb.gen.P"
+"red2Elementq\u0000~\u0000$sq\u0000~\u0000\u0000\u0001|\u00f6\u00d8pp\u0000sq\u0000~\u0000\f\u0001|\u00f6\u00cdppsq\u0000~\u0000\u0013\u0001|\u00f6\u00c2q\u0000~\u0000\u0010psq\u0000"
+"~\u0000\u0016\u0001|\u00f6\u00bfq\u0000~\u0000\u0010pq\u0000~\u0000\u0019q\u0000~\u0000\u001dq\u0000~\u0000\u001fsq\u0000~\u0000 t\u00000net.sourceforge.czt.cor"
+"e.jaxb.gen.MemPredElementq\u0000~\u0000$sq\u0000~\u0000\u0000\u0001|\u00f6\u00d8pp\u0000sq\u0000~\u0000\f\u0001|\u00f6\u00cdppsq\u0000~\u0000"
+"\u0013\u0001|\u00f6\u00c2q\u0000~\u0000\u0010psq\u0000~\u0000\u0016\u0001|\u00f6\u00bfq\u0000~\u0000\u0010pq\u0000~\u0000\u0019q\u0000~\u0000\u001dq\u0000~\u0000\u001fsq\u0000~\u0000 t\u0000-net.sourc"
+"eforge.czt.core.jaxb.gen.Exists1Predq\u0000~\u0000$sq\u0000~\u0000\u0000\u0001|\u00f6\u00d8pp\u0000sq\u0000~\u0000\f"
+"\u0001|\u00f6\u00cdppsq\u0000~\u0000\u0013\u0001|\u00f6\u00c2q\u0000~\u0000\u0010psq\u0000~\u0000\u0016\u0001|\u00f6\u00bfq\u0000~\u0000\u0010pq\u0000~\u0000\u0019q\u0000~\u0000\u001dq\u0000~\u0000\u001fsq\u0000~\u0000 t"
+"\u0000+net.sourceforge.czt.core.jaxb.gen.FalsePredq\u0000~\u0000$sq\u0000~\u0000\u0000\u0001|\u00f6\u00d8"
+"pp\u0000sq\u0000~\u0000\f\u0001|\u00f6\u00cdppsq\u0000~\u0000\u0013\u0001|\u00f6\u00c2q\u0000~\u0000\u0010psq\u0000~\u0000\u0016\u0001|\u00f6\u00bfq\u0000~\u0000\u0010pq\u0000~\u0000\u0019q\u0000~\u0000\u001dq\u0000~"
+"\u0000\u001fsq\u0000~\u0000 t\u00000net.sourceforge.czt.core.jaxb.gen.NegPredElementq"
+"\u0000~\u0000$sq\u0000~\u0000\u0000\u0001|\u00f6\u00d8pp\u0000sq\u0000~\u0000\f\u0001|\u00f6\u00cdppsq\u0000~\u0000\u0013\u0001|\u00f6\u00c2q\u0000~\u0000\u0010psq\u0000~\u0000\u0016\u0001|\u00f6\u00bfq\u0000~\u0000\u0010"
+"pq\u0000~\u0000\u0019q\u0000~\u0000\u001dq\u0000~\u0000\u001fsq\u0000~\u0000 t\u0000)net.sourceforge.czt.core.jaxb.gen.I"
+"ffPredq\u0000~\u0000$sq\u0000~\u0000\u0000\u0001|\u00f6\u00d8pp\u0000sq\u0000~\u0000\f\u0001|\u00f6\u00cdppsq\u0000~\u0000\u0013\u0001|\u00f6\u00c2q\u0000~\u0000\u0010psq\u0000~\u0000\u0016\u0001|"
+"\u00f6\u00bfq\u0000~\u0000\u0010pq\u0000~\u0000\u0019q\u0000~\u0000\u001dq\u0000~\u0000\u001fsq\u0000~\u0000 t\u0000,net.sourceforge.czt.core.jax"
+"b.gen.ForallPredq\u0000~\u0000$sq\u0000~\u0000\u0000\u0001|\u00f6\u00d8pp\u0000sq\u0000~\u0000\f\u0001|\u00f6\u00cdppsq\u0000~\u0000\u0013\u0001|\u00f6\u00c2q\u0000~\u0000"
+"\u0010psq\u0000~\u0000\u0016\u0001|\u00f6\u00bfq\u0000~\u0000\u0010pq\u0000~\u0000\u0019q\u0000~\u0000\u001dq\u0000~\u0000\u001fsq\u0000~\u0000 t\u00003net.sourceforge.cz"
+"t.zpatt.jaxb.gen.JokerPredElementq\u0000~\u0000$sq\u0000~\u0000\u0000\u0001|\u00f6\u00d8pp\u0000sq\u0000~\u0000\f\u0001|\u00f6"
+"\u00cdppsq\u0000~\u0000\u0013\u0001|\u00f6\u00c2q\u0000~\u0000\u0010psq\u0000~\u0000\u0016\u0001|\u00f6\u00bfq\u0000~\u0000\u0010pq\u0000~\u0000\u0019q\u0000~\u0000\u001dq\u0000~\u0000\u001fsq\u0000~\u0000 t\u0000(n"
+"et.sourceforge.czt.core.jaxb.gen.OrPredq\u0000~\u0000$sq\u0000~\u0000\u0000\u0001|\u00f6\u00d8pp\u0000sq\u0000"
+"~\u0000\f\u0001|\u00f6\u00cdppsq\u0000~\u0000\u0013\u0001|\u00f6\u00c2q\u0000~\u0000\u0010psq\u0000~\u0000\u0016\u0001|\u00f6\u00bfq\u0000~\u0000\u0010pq\u0000~\u0000\u0019q\u0000~\u0000\u001dq\u0000~\u0000\u001fsq\u0000~"
+"\u0000 t\u00000net.sourceforge.czt.core.jaxb.gen.QntPredElementq\u0000~\u0000$sq"
+"\u0000~\u0000\u0000\u0001|\u00f6\u00d8pp\u0000sq\u0000~\u0000\f\u0001|\u00f6\u00cdppsq\u0000~\u0000\u0013\u0001|\u00f6\u00c2q\u0000~\u0000\u0010psq\u0000~\u0000\u0016\u0001|\u00f6\u00bfq\u0000~\u0000\u0010pq\u0000~\u0000\u0019"
+"q\u0000~\u0000\u001dq\u0000~\u0000\u001fsq\u0000~\u0000 t\u00001net.sourceforge.czt.core.jaxb.gen.ExprPre"
+"dElementq\u0000~\u0000$sq\u0000~\u0000\u0000\u0001|\u00f6\u00d8pp\u0000sq\u0000~\u0000\f\u0001|\u00f6\u00cdppsq\u0000~\u0000\u0013\u0001|\u00f6\u00c2q\u0000~\u0000\u0010psq\u0000~\u0000\u0016"
+"\u0001|\u00f6\u00bfq\u0000~\u0000\u0010pq\u0000~\u0000\u0019q\u0000~\u0000\u001dq\u0000~\u0000\u001fsq\u0000~\u0000 t\u0000-net.sourceforge.czt.core.j"
+"axb.gen.ImpliesPredq\u0000~\u0000$sq\u0000~\u0000\u0000\u0001|\u00f6\u00d8pp\u0000sq\u0000~\u0000\f\u0001|\u00f6\u00cdppsq\u0000~\u0000\u0013\u0001|\u00f6\u00c2q"
+"\u0000~\u0000\u0010psq\u0000~\u0000\u0016\u0001|\u00f6\u00bfq\u0000~\u0000\u0010pq\u0000~\u0000\u0019q\u0000~\u0000\u001dq\u0000~\u0000\u001fsq\u0000~\u0000 t\u0000,net.sourceforge"
+".czt.core.jaxb.gen.ExistsPredq\u0000~\u0000$sq\u0000~\u0000\u0000\u0001|\u00f6\u00d8pp\u0000sq\u0000~\u0000\f\u0001|\u00f6\u00cdpps"
+"q\u0000~\u0000\u0013\u0001|\u00f6\u00c2q\u0000~\u0000\u0010psq\u0000~\u0000\u0016\u0001|\u00f6\u00bfq\u0000~\u0000\u0010pq\u0000~\u0000\u0019q\u0000~\u0000\u001dq\u0000~\u0000\u001fsq\u0000~\u0000 t\u0000-net.s"
+"ourceforge.czt.core.jaxb.gen.FactElementq\u0000~\u0000$sq\u0000~\u0000\u0000\u0001|\u00f6\u00d8pp\u0000sq"
+"\u0000~\u0000\f\u0001|\u00f6\u00cdppsq\u0000~\u0000\u0013\u0001|\u00f6\u00c2q\u0000~\u0000\u0010psq\u0000~\u0000\u0016\u0001|\u00f6\u00bfq\u0000~\u0000\u0010pq\u0000~\u0000\u0019q\u0000~\u0000\u001dq\u0000~\u0000\u001fsq\u0000"
+"~\u0000 t\u00000net.sourceforge.czt.core.jaxb.gen.AndPredElementq\u0000~\u0000$s"
+"q\u0000~\u0000\f\u0017\u00cfm\u009eppsq\u0000~\u0000\f\u0016Rv\u00c4ppsq\u0000~\u0000\f\u0014\u00d5\u007f\u00eappsq\u0000~\u0000\f\u0013X\u0089\u0010ppsq\u0000~\u0000\f\u0011\u00db\u00926pps"
+"q\u0000~\u0000\f\u0010^\u009b\\ppsq\u0000~\u0000\f\u000e\u00e1\u00a4\u0082ppsq\u0000~\u0000\f\rd\u00ad\u00a8ppsq\u0000~\u0000\f\u000b\u00e7\u00b6\u00ceppsq\u0000~\u0000\f\nj\u00bf\u00f4pps"
+"q\u0000~\u0000\f\b\u00ed\u00c9\u001appsq\u0000~\u0000\f\u0007p\u00d2@ppsq\u0000~\u0000\f\u0005\u00f3\u00dbfppsq\u0000~\u0000\f\u0004v\u00e4\u008cppsq\u0000~\u0000\f\u0002\u00f9\u00ed\u00b2pps"
+"q\u0000~\u0000\u0000\u0001|\u00f6\u00d8pp\u0000sq\u0000~\u0000\f\u0001|\u00f6\u00cdppsq\u0000~\u0000\u0013\u0001|\u00f6\u00c2q\u0000~\u0000\u0010psq\u0000~\u0000\u0016\u0001|\u00f6\u00bfq\u0000~\u0000\u0010pq\u0000~\u0000"
+"\u0019q\u0000~\u0000\u001dq\u0000~\u0000\u001fsq\u0000~\u0000 q\u0000~\u0000<q\u0000~\u0000$sq\u0000~\u0000\u0000\u0001|\u00f6\u00d8pp\u0000sq\u0000~\u0000\f\u0001|\u00f6\u00cdppsq\u0000~\u0000\u0013\u0001|"
+"\u00f6\u00c2q\u0000~\u0000\u0010psq\u0000~\u0000\u0016\u0001|\u00f6\u00bfq\u0000~\u0000\u0010pq\u0000~\u0000\u0019q\u0000~\u0000\u001dq\u0000~\u0000\u001fsq\u0000~\u0000 q\u0000~\u0000Bq\u0000~\u0000$sq\u0000~\u0000"
+"\u0000\u0001|\u00f6\u00d8pp\u0000sq\u0000~\u0000\f\u0001|\u00f6\u00cdppsq\u0000~\u0000\u0013\u0001|\u00f6\u00c2q\u0000~\u0000\u0010psq\u0000~\u0000\u0016\u0001|\u00f6\u00bfq\u0000~\u0000\u0010pq\u0000~\u0000\u0019q\u0000~"
+"\u0000\u001dq\u0000~\u0000\u001fsq\u0000~\u0000 q\u0000~\u0000Hq\u0000~\u0000$sq\u0000~\u0000\u0000\u0001|\u00f6\u00d8pp\u0000sq\u0000~\u0000\f\u0001|\u00f6\u00cdppsq\u0000~\u0000\u0013\u0001|\u00f6\u00c2q\u0000"
+"~\u0000\u0010psq\u0000~\u0000\u0016\u0001|\u00f6\u00bfq\u0000~\u0000\u0010pq\u0000~\u0000\u0019q\u0000~\u0000\u001dq\u0000~\u0000\u001fsq\u0000~\u0000 q\u0000~\u0000Nq\u0000~\u0000$sq\u0000~\u0000\u0000\u0001|\u00f6"
+"\u00d8pp\u0000sq\u0000~\u0000\f\u0001|\u00f6\u00cdppsq\u0000~\u0000\u0013\u0001|\u00f6\u00c2q\u0000~\u0000\u0010psq\u0000~\u0000\u0016\u0001|\u00f6\u00bfq\u0000~\u0000\u0010pq\u0000~\u0000\u0019q\u0000~\u0000\u001dq\u0000"
+"~\u0000\u001fsq\u0000~\u0000 q\u0000~\u0000Tq\u0000~\u0000$sq\u0000~\u0000\u0000\u0001|\u00f6\u00d8pp\u0000sq\u0000~\u0000\f\u0001|\u00f6\u00cdppsq\u0000~\u0000\u0013\u0001|\u00f6\u00c2q\u0000~\u0000\u0010p"
+"sq\u0000~\u0000\u0016\u0001|\u00f6\u00bfq\u0000~\u0000\u0010pq\u0000~\u0000\u0019q\u0000~\u0000\u001dq\u0000~\u0000\u001fsq\u0000~\u0000 q\u0000~\u0000Zq\u0000~\u0000$sq\u0000~\u0000\u0000\u0001|\u00f6\u00d8pp\u0000"
+"sq\u0000~\u0000\f\u0001|\u00f6\u00cdppsq\u0000~\u0000\u0013\u0001|\u00f6\u00c2q\u0000~\u0000\u0010psq\u0000~\u0000\u0016\u0001|\u00f6\u00bfq\u0000~\u0000\u0010pq\u0000~\u0000\u0019q\u0000~\u0000\u001dq\u0000~\u0000\u001fs"
+"q\u0000~\u0000 q\u0000~\u0000`q\u0000~\u0000$sq\u0000~\u0000\u0000\u0001|\u00f6\u00d8pp\u0000sq\u0000~\u0000\f\u0001|\u00f6\u00cdppsq\u0000~\u0000\u0013\u0001|\u00f6\u00c2q\u0000~\u0000\u0010psq\u0000~"
+"\u0000\u0016\u0001|\u00f6\u00bfq\u0000~\u0000\u0010pq\u0000~\u0000\u0019q\u0000~\u0000\u001dq\u0000~\u0000\u001fsq\u0000~\u0000 q\u0000~\u0000fq\u0000~\u0000$sq\u0000~\u0000\u0000\u0001|\u00f6\u00d8pp\u0000sq\u0000~"
+"\u0000\f\u0001|\u00f6\u00cdppsq\u0000~\u0000\u0013\u0001|\u00f6\u00c2q\u0000~\u0000\u0010psq\u0000~\u0000\u0016\u0001|\u00f6\u00bfq\u0000~\u0000\u0010pq\u0000~\u0000\u0019q\u0000~\u0000\u001dq\u0000~\u0000\u001fsq\u0000~\u0000"
+" q\u0000~\u0000lq\u0000~\u0000$sq\u0000~\u0000\u0000\u0001|\u00f6\u00d8pp\u0000sq\u0000~\u0000\f\u0001|\u00f6\u00cdppsq\u0000~\u0000\u0013\u0001|\u00f6\u00c2q\u0000~\u0000\u0010psq\u0000~\u0000\u0016\u0001|"
+"\u00f6\u00bfq\u0000~\u0000\u0010pq\u0000~\u0000\u0019q\u0000~\u0000\u001dq\u0000~\u0000\u001fsq\u0000~\u0000 q\u0000~\u0000rq\u0000~\u0000$sq\u0000~\u0000\u0000\u0001|\u00f6\u00d8pp\u0000sq\u0000~\u0000\f\u0001|"
+"\u00f6\u00cdppsq\u0000~\u0000\u0013\u0001|\u00f6\u00c2q\u0000~\u0000\u0010psq\u0000~\u0000\u0016\u0001|\u00f6\u00bfq\u0000~\u0000\u0010pq\u0000~\u0000\u0019q\u0000~\u0000\u001dq\u0000~\u0000\u001fsq\u0000~\u0000 q\u0000~"
+"\u0000xq\u0000~\u0000$sq\u0000~\u0000\u0000\u0001|\u00f6\u00d8pp\u0000sq\u0000~\u0000\f\u0001|\u00f6\u00cdppsq\u0000~\u0000\u0013\u0001|\u00f6\u00c2q\u0000~\u0000\u0010psq\u0000~\u0000\u0016\u0001|\u00f6\u00bfq\u0000"
+"~\u0000\u0010pq\u0000~\u0000\u0019q\u0000~\u0000\u001dq\u0000~\u0000\u001fsq\u0000~\u0000 q\u0000~\u0000~q\u0000~\u0000$sq\u0000~\u0000\u0000\u0001|\u00f6\u00d8pp\u0000sq\u0000~\u0000\f\u0001|\u00f6\u00cdpp"
+"sq\u0000~\u0000\u0013\u0001|\u00f6\u00c2q\u0000~\u0000\u0010psq\u0000~\u0000\u0016\u0001|\u00f6\u00bfq\u0000~\u0000\u0010pq\u0000~\u0000\u0019q\u0000~\u0000\u001dq\u0000~\u0000\u001fsq\u0000~\u0000 q\u0000~\u0000\u0084q\u0000"
+"~\u0000$sq\u0000~\u0000\u0000\u0001|\u00f6\u00d8pp\u0000sq\u0000~\u0000\f\u0001|\u00f6\u00cdppsq\u0000~\u0000\u0013\u0001|\u00f6\u00c2q\u0000~\u0000\u0010psq\u0000~\u0000\u0016\u0001|\u00f6\u00bfq\u0000~\u0000\u0010p"
+"q\u0000~\u0000\u0019q\u0000~\u0000\u001dq\u0000~\u0000\u001fsq\u0000~\u0000 q\u0000~\u0000\u008aq\u0000~\u0000$sq\u0000~\u0000\u0000\u0001|\u00f6\u00d8pp\u0000sq\u0000~\u0000\f\u0001|\u00f6\u00cdppsq\u0000~"
+"\u0000\u0013\u0001|\u00f6\u00c2q\u0000~\u0000\u0010psq\u0000~\u0000\u0016\u0001|\u00f6\u00bfq\u0000~\u0000\u0010pq\u0000~\u0000\u0019q\u0000~\u0000\u001dq\u0000~\u0000\u001fsq\u0000~\u0000 q\u0000~\u0000\u0090q\u0000~\u0000$s"
+"q\u0000~\u0000\u0000\u0001|\u00f6\u00d8pp\u0000sq\u0000~\u0000\f\u0001|\u00f6\u00cdppsq\u0000~\u0000\u0013\u0001|\u00f6\u00c2q\u0000~\u0000\u0010psq\u0000~\u0000\u0016\u0001|\u00f6\u00bfq\u0000~\u0000\u0010pq\u0000~\u0000"
+"\u0019q\u0000~\u0000\u001dq\u0000~\u0000\u001fsq\u0000~\u0000 q\u0000~\u0000\u0096q\u0000~\u0000$sq\u0000~\u0000\f\u0000\u00c9x$ppsq\u0000~\u0000\u0016\u0000\u00c9x\u0019q\u0000~\u0000\u0010psr\u0000\u001bc"
+"om.sun.msv.grammar.DataExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\u0002dtt\u0000\u001fLorg/relaxng/da"
+"tatype/Datatype;L\u0000\u0006exceptq\u0000~\u0000\u0003L\u0000\u0004namet\u0000\u001dLcom/sun/msv/util/St"
+"ringPair;xq\u0000~\u0000\u0004\u0000)\u00d5\u001dppsr\u0000)com.sun.msv.datatype.xsd.Enumeratio"
+"nFacet\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\u0006valuest\u0000\u000fLjava/util/Set;xr\u00009com.sun.msv."
+"datatype.xsd.DataTypeWithValueConstraintFacet\"\u00a7Ro\u00ca\u00c7\u008aT\u0002\u0000\u0000xr\u0000*"
+"com.sun.msv.datatype.xsd.DataTypeWithFacet\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0005Z\u0000\fisFa"
+"cetFixedZ\u0000\u0012needValueCheckFlagL\u0000\bbaseTypet\u0000)Lcom/sun/msv/data"
+"type/xsd/XSDatatypeImpl;L\u0000\fconcreteTypet\u0000\'Lcom/sun/msv/datat"
+"ype/xsd/ConcreteType;L\u0000\tfacetNameq\u0000~\u0000!xr\u0000\'com.sun.msv.dataty"
+"pe.xsd.XSDatatypeImpl\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\fnamespaceUriq\u0000~\u0000!L\u0000\btypeN"
+"ameq\u0000~\u0000!L\u0000\nwhiteSpacet\u0000.Lcom/sun/msv/datatype/xsd/WhiteSpace"
+"Processor;xpq\u0000~\u0000\'t\u0000\u0002Opsr\u00005com.sun.msv.datatype.xsd.WhiteSpac"
+"eProcessor$Preserve\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000,com.sun.msv.datatype.xsd.W"
+"hiteSpaceProcessor\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xp\u0000\u0000sr\u0000#com.sun.msv.datatype.xs"
+"d.StringType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001Z\u0000\risAlwaysValidxr\u0000*com.sun.msv.datat"
+"ype.xsd.BuiltinAtomicType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000%com.sun.msv.datatype"
+".xsd.ConcreteType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0001\u0002t\u0000 http://www.w3.org/2001/"
+"XMLSchemat\u0000\u0006stringq\u0000~\u0001\b\u0001q\u0000~\u0001\ft\u0000\u000benumerationsr\u0000\u0011java.util.Has"
+"hSet\u00baD\u0085\u0095\u0096\u00b8\u00b74\u0003\u0000\u0000xpw\f\u0000\u0000\u0000\u0010?@\u0000\u0000\u0000\u0000\u0000\u0004t\u0000\u0002NLt\u0000\u0003Andt\u0000\u0004Semit\u0000\u0005Chainxsr"
+"\u00000com.sun.msv.grammar.Expression$NullSetExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000"
+"\u0000xq\u0000~\u0000\u0004\u0000\u0000\u0000\nq\u0000~\u0000\u0010psr\u0000\u001bcom.sun.msv.util.StringPair\u00d0t\u001ejB\u008f\u008d\u00a0\u0002\u0000\u0002L"
+"\u0000\tlocalNameq\u0000~\u0000!L\u0000\fnamespaceURIq\u0000~\u0000!xpq\u0000~\u0001\u0005q\u0000~\u0000\'sq\u0000~\u0000 t\u0000\u0002Opt"
+"\u0000\u0000q\u0000~\u0000\u001fsq\u0000~\u0000 t\u0000\u0007AndPredq\u0000~\u0000\'sr\u0000\"com.sun.msv.grammar.Expressi"
+"onPool\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\bexpTablet\u0000/Lcom/sun/msv/grammar/Expressi"
+"onPool$ClosedHash;xpsr\u0000-com.sun.msv.grammar.ExpressionPool$C"
+"losedHash\u00d7j\u00d0N\u00ef\u00e8\u00ed\u001c\u0002\u0000\u0004I\u0000\u0005countI\u0000\tthresholdL\u0000\u0006parentq\u0000~\u0001 [\u0000\u0005tab"
+"let\u0000![Lcom/sun/msv/grammar/Expression;xp\u0000\u0000\u0000e\u0000\u0000\u0000rpur\u0000![Lcom.s"
+"un.msv.grammar.Expression;\u00d68D\u00c3]\u00ad\u00a7\n\u0002\u0000\u0000xp\u0000\u0000\u0001\u007fppppppppppppppppp"
+"pppppppppppppppppppppppppppppppppppppppppppppppppppppppppppp"
+"ppppppppppppppppq\u0000~\u0000*q\u0000~\u0000\u0099pppppq\u0000~\u0000-q\u0000~\u0000\u009cpppppq\u0000~\u00000q\u0000~\u0000\u009fppq\u0000"
+"~\u0000\u000bppq\u0000~\u00003q\u0000~\u0000\u00a2pppppq\u0000~\u0000\u00a5q\u0000~\u00006pppppppppppppppppppppppppppppp"
+"pppppppppppppppppppppppppppppppppppppppppppppppppppppppppppp"
+"pppq\u0000~\u0000(q\u0000~\u0000\u0097pppppq\u0000~\u0000+q\u0000~\u0000\u009appppq\u0000~\u0000\u00b2q\u0000~\u0000\u00adq\u0000~\u0000\u00a8q\u0000~\u0000\u0093q\u0000~\u0000\u008dq\u0000~"
+"\u0000\u0087q\u0000~\u0000\u0081q\u0000~\u0000{q\u0000~\u0000uq\u0000~\u0000oq\u0000~\u0000iq\u0000~\u0000\u00acq\u0000~\u0000\u00a7q\u0000~\u0000\u0092q\u0000~\u0000\u008cq\u0000~\u0000\u0086q\u0000~\u0000\u0080q\u0000~"
+"\u0000zq\u0000~\u0000tq\u0000~\u0000nq\u0000~\u0000hq\u0000~\u0000bq\u0000~\u0000\\q\u0000~\u0000Vq\u0000~\u0000Pq\u0000~\u0000Jq\u0000~\u0000Dq\u0000~\u0000>q\u0000~\u00008q\u0000~"
+"\u0000\u0012q\u0000~\u0000cq\u0000~\u0000]q\u0000~\u0000Wq\u0000~\u0000Qq\u0000~\u0000Kq\u0000~\u0000Eq\u0000~\u0000?q\u0000~\u00009q\u0000~\u0000\u0015q\u0000~\u00004q\u0000~\u00001q\u0000~"
+"\u0000.q\u0000~\u0000\u00b1q\u0000~\u0000\u00b7q\u0000~\u0000\rq\u0000~\u0000\u00b6q\u0000~\u0000\u00a3q\u0000~\u0000\u00bcq\u0000~\u0000\u00bbq\u0000~\u0000\u00c1q\u0000~\u0000\u00c0q\u0000~\u0000\u00c6q\u0000~\u0000\u00c5q\u0000~"
+"\u0000\u00a0q\u0000~\u0000\u00cbq\u0000~\u0000\u00caq\u0000~\u0000\u00d0q\u0000~\u0000\u00cfq\u0000~\u0000\u00d5q\u0000~\u0000\u00d4q\u0000~\u0000\u009dq\u0000~\u0000\u00daq\u0000~\u0000\u00d9q\u0000~\u0000\u00dfq\u0000~\u0000\u00deq\u0000~"
+"\u0000\u00e4q\u0000~\u0000\u00e3q\u0000~\u0000\u00e9q\u0000~\u0000\u00e8q\u0000~\u0000\u00eeq\u0000~\u0000\u00edq\u0000~\u0000\u00f3q\u0000~\u0000\u00f2q\u0000~\u0000\tpppppppppppppppppp"
+"pppppppppppq\u0000~\u0000\nq\u0000~\u0000\u00f6ppppppppppppq\u0000~\u0000)q\u0000~\u0000\u0098pppppq\u0000~\u0000,q\u0000~\u0000\u009bpp"
+"pppq\u0000~\u0000/q\u0000~\u0000\u009epppppq\u0000~\u00002q\u0000~\u0000\u00a1pppppq\u0000~\u00005q\u0000~\u0000\u00a4ppppppp"));
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
            return net.sourceforge.czt.core.jaxb.gen.impl.AndPredElementImpl.this;
        }

        public void enterElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname, org.xml.sax.Attributes __atts)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  1 :
                        attIdx = context.getAttribute("", "Op");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().enterElement(___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("Anns" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.core.jaxb.gen.impl.AndPredImpl)net.sourceforge.czt.core.jaxb.gen.impl.AndPredElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("Pred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.core.jaxb.gen.impl.AndPredImpl)net.sourceforge.czt.core.jaxb.gen.impl.AndPredElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("TruePred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.core.jaxb.gen.impl.AndPredImpl)net.sourceforge.czt.core.jaxb.gen.impl.AndPredElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("Pred2" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.core.jaxb.gen.impl.AndPredImpl)net.sourceforge.czt.core.jaxb.gen.impl.AndPredElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("MemPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.core.jaxb.gen.impl.AndPredImpl)net.sourceforge.czt.core.jaxb.gen.impl.AndPredElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("Exists1Pred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.core.jaxb.gen.impl.AndPredImpl)net.sourceforge.czt.core.jaxb.gen.impl.AndPredElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("FalsePred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.core.jaxb.gen.impl.AndPredImpl)net.sourceforge.czt.core.jaxb.gen.impl.AndPredElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("NegPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.core.jaxb.gen.impl.AndPredImpl)net.sourceforge.czt.core.jaxb.gen.impl.AndPredElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("IffPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.core.jaxb.gen.impl.AndPredImpl)net.sourceforge.czt.core.jaxb.gen.impl.AndPredElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("ForallPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.core.jaxb.gen.impl.AndPredImpl)net.sourceforge.czt.core.jaxb.gen.impl.AndPredElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("JokerPred" == ___local)&&("http://czt.sourceforge.net/zpatt" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.core.jaxb.gen.impl.AndPredImpl)net.sourceforge.czt.core.jaxb.gen.impl.AndPredElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("OrPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.core.jaxb.gen.impl.AndPredImpl)net.sourceforge.czt.core.jaxb.gen.impl.AndPredElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("QntPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.core.jaxb.gen.impl.AndPredImpl)net.sourceforge.czt.core.jaxb.gen.impl.AndPredElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("ExprPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.core.jaxb.gen.impl.AndPredImpl)net.sourceforge.czt.core.jaxb.gen.impl.AndPredElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("ImpliesPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.core.jaxb.gen.impl.AndPredImpl)net.sourceforge.czt.core.jaxb.gen.impl.AndPredElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("ExistsPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.core.jaxb.gen.impl.AndPredImpl)net.sourceforge.czt.core.jaxb.gen.impl.AndPredElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("Fact" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.core.jaxb.gen.impl.AndPredImpl)net.sourceforge.czt.core.jaxb.gen.impl.AndPredElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("AndPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.core.jaxb.gen.impl.AndPredImpl)net.sourceforge.czt.core.jaxb.gen.impl.AndPredElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        spawnHandlerFromEnterElement((((net.sourceforge.czt.core.jaxb.gen.impl.AndPredImpl)net.sourceforge.czt.core.jaxb.gen.impl.AndPredElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                        return ;
                    case  3 :
                        revertToParentFromEnterElement(___uri, ___local, ___qname, __atts);
                        return ;
                    case  0 :
                        if (("AndPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
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
                        attIdx = context.getAttribute("", "Op");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveElement(___uri, ___local, ___qname);
                            return ;
                        }
                        spawnHandlerFromLeaveElement((((net.sourceforge.czt.core.jaxb.gen.impl.AndPredImpl)net.sourceforge.czt.core.jaxb.gen.impl.AndPredElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
                        return ;
                    case  3 :
                        revertToParentFromLeaveElement(___uri, ___local, ___qname);
                        return ;
                    case  2 :
                        if (("AndPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
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
                        if (("Op" == ___local)&&("" == ___uri)) {
                            spawnHandlerFromEnterAttribute((((net.sourceforge.czt.core.jaxb.gen.impl.AndPredImpl)net.sourceforge.czt.core.jaxb.gen.impl.AndPredElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
                            return ;
                        }
                        spawnHandlerFromEnterAttribute((((net.sourceforge.czt.core.jaxb.gen.impl.AndPredImpl)net.sourceforge.czt.core.jaxb.gen.impl.AndPredElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
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
                        attIdx = context.getAttribute("", "Op");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveAttribute(___uri, ___local, ___qname);
                            return ;
                        }
                        spawnHandlerFromLeaveAttribute((((net.sourceforge.czt.core.jaxb.gen.impl.AndPredImpl)net.sourceforge.czt.core.jaxb.gen.impl.AndPredElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
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
                            attIdx = context.getAttribute("", "Op");
                            if (attIdx >= 0) {
                                context.consumeAttribute(attIdx);
                                context.getCurrentHandler().text(value);
                                return ;
                            }
                            spawnHandlerFromText((((net.sourceforge.czt.core.jaxb.gen.impl.AndPredImpl)net.sourceforge.czt.core.jaxb.gen.impl.AndPredElementImpl.this).new Unmarshaller(context)), 2, value);
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
