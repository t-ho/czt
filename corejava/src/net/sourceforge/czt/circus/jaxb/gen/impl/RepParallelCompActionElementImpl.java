//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.4-b18-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2005.02.23 at 12:42:00 GMT 
//


package net.sourceforge.czt.circus.jaxb.gen.impl;

public class RepParallelCompActionElementImpl
    extends net.sourceforge.czt.circus.jaxb.gen.impl.RepParallelCompActionImpl
    implements net.sourceforge.czt.circus.jaxb.gen.RepParallelCompActionElement, com.sun.xml.bind.RIElement, com.sun.xml.bind.JAXBObject, net.sourceforge.czt.circus.jaxb.gen.impl.runtime.UnmarshallableObject, net.sourceforge.czt.circus.jaxb.gen.impl.runtime.XMLSerializable, net.sourceforge.czt.circus.jaxb.gen.impl.runtime.ValidatableObject
{

    public final static java.lang.Class version = (net.sourceforge.czt.circus.jaxb.gen.impl.JAXBVersion.class);
    private static com.sun.msv.grammar.Grammar schemaFragment;

    private final static java.lang.Class PRIMARY_INTERFACE_CLASS() {
        return (net.sourceforge.czt.circus.jaxb.gen.RepParallelCompActionElement.class);
    }

    public java.lang.String ____jaxb_ri____getNamespaceURI() {
        return "http://czt.sourceforge.net/circus";
    }

    public java.lang.String ____jaxb_ri____getLocalName() {
        return "RepParallelCompAction";
    }

    public net.sourceforge.czt.circus.jaxb.gen.impl.runtime.UnmarshallingEventHandler createUnmarshaller(net.sourceforge.czt.circus.jaxb.gen.impl.runtime.UnmarshallingContext context) {
        return new net.sourceforge.czt.circus.jaxb.gen.impl.RepParallelCompActionElementImpl.Unmarshaller(context);
    }

    public void serializeBody(net.sourceforge.czt.circus.jaxb.gen.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        context.startElement("http://czt.sourceforge.net/circus", "RepParallelCompAction");
        super.serializeURIs(context);
        context.endNamespaceDecls();
        super.serializeAttributes(context);
        context.endAttributes();
        super.serializeBody(context);
        context.endElement();
    }

    public void serializeAttributes(net.sourceforge.czt.circus.jaxb.gen.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
    }

    public void serializeURIs(net.sourceforge.czt.circus.jaxb.gen.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
    }

    public java.lang.Class getPrimaryInterface() {
        return (net.sourceforge.czt.circus.jaxb.gen.RepParallelCompActionElement.class);
    }

    public com.sun.msv.verifier.DocumentDeclaration createRawValidator() {
        if (schemaFragment == null) {
            schemaFragment = com.sun.xml.bind.validator.SchemaDeserializer.deserialize((
 "\u00ac\u00ed\u0000\u0005sr\u0000\'com.sun.msv.grammar.trex.ElementPattern\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000"
+"\tnameClasst\u0000\u001fLcom/sun/msv/grammar/NameClass;xr\u0000\u001ecom.sun.msv."
+"grammar.ElementExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002Z\u0000\u001aignoreUndeclaredAttributesL\u0000"
+"\fcontentModelt\u0000 Lcom/sun/msv/grammar/Expression;xr\u0000\u001ecom.sun."
+"msv.grammar.Expression\u00f8\u0018\u0082\u00e8N5~O\u0002\u0000\u0002L\u0000\u0013epsilonReducibilityt\u0000\u0013Lj"
+"ava/lang/Boolean;L\u0000\u000bexpandedExpq\u0000~\u0000\u0003xppp\u0000sr\u0000\u001fcom.sun.msv.gra"
+"mmar.SequenceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun.msv.grammar.BinaryExp"
+"\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0004exp1q\u0000~\u0000\u0003L\u0000\u0004exp2q\u0000~\u0000\u0003xq\u0000~\u0000\u0004ppsq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0007pps"
+"q\u0000~\u0000\u0007ppsq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0007ppsr\u0000\u001dcom.sun.msv.grammar.ChoiceExp\u0000\u0000\u0000\u0000"
+"\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\bppsq\u0000~\u0000\u0000sr\u0000\u0011java.lang.Boolean\u00cd r\u0080\u00d5\u009c\u00fa\u00ee\u0002\u0000\u0001Z\u0000\u0005valu"
+"exp\u0000p\u0000sq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u000fppsr\u0000 com.sun.msv.grammar.OneOr"
+"MoreExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001ccom.sun.msv.grammar.UnaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000"
+"\u0001L\u0000\u0003expq\u0000~\u0000\u0003xq\u0000~\u0000\u0004q\u0000~\u0000\u0013psr\u0000 com.sun.msv.grammar.AttributeExp"
+"\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003expq\u0000~\u0000\u0003L\u0000\tnameClassq\u0000~\u0000\u0001xq\u0000~\u0000\u0004q\u0000~\u0000\u0013psr\u00002com.s"
+"un.msv.grammar.Expression$AnyStringExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~"
+"\u0000\u0004sq\u0000~\u0000\u0012\u0001q\u0000~\u0000\u001dsr\u0000 com.sun.msv.grammar.AnyNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000"
+"\u0000xr\u0000\u001dcom.sun.msv.grammar.NameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com.sun.m"
+"sv.grammar.Expression$EpsilonExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004q\u0000~\u0000"
+"\u001eq\u0000~\u0000#sr\u0000#com.sun.msv.grammar.SimpleNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\tl"
+"ocalNamet\u0000\u0012Ljava/lang/String;L\u0000\fnamespaceURIq\u0000~\u0000%xq\u0000~\u0000 t\u0000-ne"
+"t.sourceforge.czt.z.jaxb.gen.TermA.AnnsTypet\u0000+http://java.su"
+"n.com/jaxb/xjc/dummy-elementssq\u0000~\u0000\u000fppsq\u0000~\u0000\u001aq\u0000~\u0000\u0013psr\u0000\u001bcom.sun"
+".msv.grammar.DataExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\u0002dtt\u0000\u001fLorg/relaxng/datatype"
+"/Datatype;L\u0000\u0006exceptq\u0000~\u0000\u0003L\u0000\u0004namet\u0000\u001dLcom/sun/msv/util/StringPa"
+"ir;xq\u0000~\u0000\u0004ppsr\u0000\"com.sun.msv.datatype.xsd.QnameType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000"
+"xr\u0000*com.sun.msv.datatype.xsd.BuiltinAtomicType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000"
+"%com.sun.msv.datatype.xsd.ConcreteType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\'com.sun"
+".msv.datatype.xsd.XSDatatypeImpl\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\fnamespaceUriq\u0000"
+"~\u0000%L\u0000\btypeNameq\u0000~\u0000%L\u0000\nwhiteSpacet\u0000.Lcom/sun/msv/datatype/xsd"
+"/WhiteSpaceProcessor;xpt\u0000 http://www.w3.org/2001/XMLSchemat\u0000"
+"\u0005QNamesr\u00005com.sun.msv.datatype.xsd.WhiteSpaceProcessor$Colla"
+"pse\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000,com.sun.msv.datatype.xsd.WhiteSpaceProcess"
+"or\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com.sun.msv.grammar.Expression$NullSetExp"
+"ression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004q\u0000~\u0000\u0013psr\u0000\u001bcom.sun.msv.util.StringPai"
+"r\u00d0t\u001ejB\u008f\u008d\u00a0\u0002\u0000\u0002L\u0000\tlocalNameq\u0000~\u0000%L\u0000\fnamespaceURIq\u0000~\u0000%xpq\u0000~\u00006q\u0000~\u0000"
+"5sq\u0000~\u0000$t\u0000\u0004typet\u0000)http://www.w3.org/2001/XMLSchema-instanceq\u0000"
+"~\u0000#sq\u0000~\u0000$t\u0000\u0004Annst\u0000\u001ehttp://czt.sourceforge.net/zmlq\u0000~\u0000#sq\u0000~\u0000\u000f"
+"ppsq\u0000~\u0000\u000fppsq\u0000~\u0000\u000fppsq\u0000~\u0000\u000fppsq\u0000~\u0000\u000fppsq\u0000~\u0000\u000fppsq\u0000~\u0000\u000fppsq\u0000~\u0000\u000fppsq"
+"\u0000~\u0000\u000fppsq\u0000~\u0000\u000fppsq\u0000~\u0000\u000fppsq\u0000~\u0000\u000fppsq\u0000~\u0000\u000fppsq\u0000~\u0000\u000fppsq\u0000~\u0000\u000fppsq\u0000~\u0000\u000f"
+"ppsq\u0000~\u0000\u000fppsq\u0000~\u0000\u000fppsq\u0000~\u0000\u000fppsq\u0000~\u0000\u000fppsq\u0000~\u0000\u000fppsq\u0000~\u0000\u000fppsq\u0000~\u0000\u000fppsq"
+"\u0000~\u0000\u000fppsq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u000fppsq\u0000~\u0000\u0017q\u0000~\u0000\u0013psq\u0000~\u0000\u001aq\u0000~\u0000\u0013pq\u0000~\u0000\u001dq\u0000~\u0000!q\u0000~"
+"\u0000#sq\u0000~\u0000$t\u00002net.sourceforge.czt.circus.jaxb.gen.RepExtChActio"
+"nq\u0000~\u0000(sq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u000fppsq\u0000~\u0000\u0017q\u0000~\u0000\u0013psq\u0000~\u0000\u001aq\u0000~\u0000\u0013pq\u0000~\u0000\u001dq\u0000~\u0000!q\u0000~"
+"\u0000#sq\u0000~\u0000$t\u0000.net.sourceforge.czt.circus.jaxb.gen.StopActionq\u0000~"
+"\u0000(sq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u000fppsq\u0000~\u0000\u0017q\u0000~\u0000\u0013psq\u0000~\u0000\u001aq\u0000~\u0000\u0013pq\u0000~\u0000\u001dq\u0000~\u0000!q\u0000~\u0000#sq"
+"\u0000~\u0000$t\u0000:net.sourceforge.czt.circus.jaxb.gen.PrefixingActionEl"
+"ementq\u0000~\u0000(sq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u000fppsq\u0000~\u0000\u0017q\u0000~\u0000\u0013psq\u0000~\u0000\u001aq\u0000~\u0000\u0013pq\u0000~\u0000\u001dq\u0000~\u0000"
+"!q\u0000~\u0000#sq\u0000~\u0000$t\u00004net.sourceforge.czt.circus.jaxb.gen.Interleav"
+"eActionq\u0000~\u0000(sq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u000fppsq\u0000~\u0000\u0017q\u0000~\u0000\u0013psq\u0000~\u0000\u001aq\u0000~\u0000\u0013pq\u0000~\u0000\u001dq\u0000"
+"~\u0000!q\u0000~\u0000#sq\u0000~\u0000$t\u0000.net.sourceforge.czt.circus.jaxb.gen.SkipAct"
+"ionq\u0000~\u0000(sq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u000fppsq\u0000~\u0000\u0017q\u0000~\u0000\u0013psq\u0000~\u0000\u001aq\u0000~\u0000\u0013pq\u0000~\u0000\u001dq\u0000~\u0000!q"
+"\u0000~\u0000#sq\u0000~\u0000$t\u0000<net.sourceforge.czt.circus.jaxb.gen.ActualParam"
+"ActionElementq\u0000~\u0000(sq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u000fppsq\u0000~\u0000\u0017q\u0000~\u0000\u0013psq\u0000~\u0000\u001aq\u0000~\u0000\u0013pq"
+"\u0000~\u0000\u001dq\u0000~\u0000!q\u0000~\u0000#sq\u0000~\u0000$t\u00008net.sourceforge.czt.circus.jaxb.gen.A"
+"ssignmentCmdElementq\u0000~\u0000(sq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u000fppsq\u0000~\u0000\u0017q\u0000~\u0000\u0013psq\u0000~\u0000\u001aq"
+"\u0000~\u0000\u0013pq\u0000~\u0000\u001dq\u0000~\u0000!q\u0000~\u0000#sq\u0000~\u0000$t\u0000=net.sourceforge.czt.circus.jaxb"
+".gen.ParallelCompActionElementq\u0000~\u0000(sq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u000fppsq\u0000~\u0000\u0017q\u0000"
+"~\u0000\u0013psq\u0000~\u0000\u001aq\u0000~\u0000\u0013pq\u0000~\u0000\u001dq\u0000~\u0000!q\u0000~\u0000#sq\u0000~\u0000$t\u00005net.sourceforge.czt."
+"circus.jaxb.gen.HideActionElementq\u0000~\u0000(sq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u000fppsq\u0000~\u0000"
+"\u0017q\u0000~\u0000\u0013psq\u0000~\u0000\u001aq\u0000~\u0000\u0013pq\u0000~\u0000\u001dq\u0000~\u0000!q\u0000~\u0000#sq\u0000~\u0000$t\u0000@net.sourceforge.c"
+"zt.circus.jaxb.gen.RepParallelCompActionElementq\u0000~\u0000(sq\u0000~\u0000\u0000pp"
+"\u0000sq\u0000~\u0000\u000fppsq\u0000~\u0000\u0017q\u0000~\u0000\u0013psq\u0000~\u0000\u001aq\u0000~\u0000\u0013pq\u0000~\u0000\u001dq\u0000~\u0000!q\u0000~\u0000#sq\u0000~\u0000$t\u00003net"
+".sourceforge.czt.circus.jaxb.gen.MuActionElementq\u0000~\u0000(sq\u0000~\u0000\u0000p"
+"p\u0000sq\u0000~\u0000\u000fppsq\u0000~\u0000\u0017q\u0000~\u0000\u0013psq\u0000~\u0000\u001aq\u0000~\u0000\u0013pq\u0000~\u0000\u001dq\u0000~\u0000!q\u0000~\u0000#sq\u0000~\u0000$t\u00008ne"
+"t.sourceforge.czt.circus.jaxb.gen.GuardedActionElementq\u0000~\u0000(s"
+"q\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u000fppsq\u0000~\u0000\u0017q\u0000~\u0000\u0013psq\u0000~\u0000\u001aq\u0000~\u0000\u0013pq\u0000~\u0000\u001dq\u0000~\u0000!q\u0000~\u0000#sq\u0000~\u0000"
+"$t\u00003net.sourceforge.czt.circus.jaxb.gen.IntChoiceActionq\u0000~\u0000("
+"sq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u000fppsq\u0000~\u0000\u0017q\u0000~\u0000\u0013psq\u0000~\u0000\u001aq\u0000~\u0000\u0013pq\u0000~\u0000\u001dq\u0000~\u0000!q\u0000~\u0000#sq\u0000~"
+"\u0000$t\u00005net.sourceforge.czt.circus.jaxb.gen.VarDeclCmdElementq\u0000"
+"~\u0000(sq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u000fppsq\u0000~\u0000\u0017q\u0000~\u0000\u0013psq\u0000~\u0000\u001aq\u0000~\u0000\u0013pq\u0000~\u0000\u001dq\u0000~\u0000!q\u0000~\u0000#s"
+"q\u0000~\u0000$t\u00007net.sourceforge.czt.circus.jaxb.gen.RepInterleaveAct"
+"ionq\u0000~\u0000(sq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u000fppsq\u0000~\u0000\u0017q\u0000~\u0000\u0013psq\u0000~\u0000\u001aq\u0000~\u0000\u0013pq\u0000~\u0000\u001dq\u0000~\u0000!q"
+"\u0000~\u0000#sq\u0000~\u0000$t\u00001net.sourceforge.czt.circus.jaxb.gen.SeqCompActi"
+"onq\u0000~\u0000(sq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u000fppsq\u0000~\u0000\u0017q\u0000~\u0000\u0013psq\u0000~\u0000\u001aq\u0000~\u0000\u0013pq\u0000~\u0000\u001dq\u0000~\u0000!q\u0000"
+"~\u0000#sq\u0000~\u0000$t\u00003net.sourceforge.czt.circus.jaxb.gen.ExtChoiceAct"
+"ionq\u0000~\u0000(sq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u000fppsq\u0000~\u0000\u0017q\u0000~\u0000\u0013psq\u0000~\u0000\u001aq\u0000~\u0000\u0013pq\u0000~\u0000\u001dq\u0000~\u0000!q"
+"\u0000~\u0000#sq\u0000~\u0000$t\u00007net.sourceforge.czt.circus.jaxb.gen.IfGuardedCm"
+"dElementq\u0000~\u0000(sq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u000fppsq\u0000~\u0000\u0017q\u0000~\u0000\u0013psq\u0000~\u0000\u001aq\u0000~\u0000\u0013pq\u0000~\u0000\u001dq"
+"\u0000~\u0000!q\u0000~\u0000#sq\u0000~\u0000$t\u00007net.sourceforge.czt.circus.jaxb.gen.Schema"
+"ActionElementq\u0000~\u0000(sq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u000fppsq\u0000~\u0000\u0017q\u0000~\u0000\u0013psq\u0000~\u0000\u001aq\u0000~\u0000\u0013pq"
+"\u0000~\u0000\u001dq\u0000~\u0000!q\u0000~\u0000#sq\u0000~\u0000$t\u00004net.sourceforge.czt.circus.jaxb.gen.R"
+"epSeqCompActionq\u0000~\u0000(sq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u000fppsq\u0000~\u0000\u0017q\u0000~\u0000\u0013psq\u0000~\u0000\u001aq\u0000~\u0000\u0013"
+"pq\u0000~\u0000\u001dq\u0000~\u0000!q\u0000~\u0000#sq\u0000~\u0000$t\u00006net.sourceforge.czt.circus.jaxb.gen"
+".SpecStmtCmdElementq\u0000~\u0000(sq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u000fppsq\u0000~\u0000\u0017q\u0000~\u0000\u0013psq\u0000~\u0000\u001aq"
+"\u0000~\u0000\u0013pq\u0000~\u0000\u001dq\u0000~\u0000!q\u0000~\u0000#sq\u0000~\u0000$t\u00005net.sourceforge.czt.circus.jaxb"
+".gen.CallActionElementq\u0000~\u0000(sq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u000fppsq\u0000~\u0000\u0017q\u0000~\u0000\u0013psq\u0000~"
+"\u0000\u001aq\u0000~\u0000\u0013pq\u0000~\u0000\u001dq\u0000~\u0000!q\u0000~\u0000#sq\u0000~\u0000$t\u00005net.sourceforge.czt.circus.j"
+"axb.gen.FormalParamActionq\u0000~\u0000(sq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u000fppsq\u0000~\u0000\u0017q\u0000~\u0000\u0013ps"
+"q\u0000~\u0000\u001aq\u0000~\u0000\u0013pq\u0000~\u0000\u001dq\u0000~\u0000!q\u0000~\u0000#sq\u0000~\u0000$t\u0000/net.sourceforge.czt.circu"
+"s.jaxb.gen.ChaosActionq\u0000~\u0000(sq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u000fppsq\u0000~\u0000\u0017q\u0000~\u0000\u0013psq\u0000~"
+"\u0000\u001aq\u0000~\u0000\u0013pq\u0000~\u0000\u001dq\u0000~\u0000!q\u0000~\u0000#sq\u0000~\u0000$t\u00002net.sourceforge.czt.circus.j"
+"axb.gen.RepIntChActionq\u0000~\u0000(sq\u0000~\u0000\u000fppsq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u000fppsq\u0000~\u0000\u0017q\u0000"
+"~\u0000\u0013psq\u0000~\u0000\u001aq\u0000~\u0000\u0013pq\u0000~\u0000\u001dq\u0000~\u0000!q\u0000~\u0000#sq\u0000~\u0000$t\u0000-net.sourceforge.czt."
+"z.jaxb.gen.VarDeclElementq\u0000~\u0000(sq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0000pp\u0000sq\u0000~"
+"\u0000\u000fppsq\u0000~\u0000\u0017q\u0000~\u0000\u0013psq\u0000~\u0000\u001aq\u0000~\u0000\u0013pq\u0000~\u0000\u001dq\u0000~\u0000!q\u0000~\u0000#sq\u0000~\u0000$t\u0000&net.sour"
+"ceforge.czt.z.jaxb.gen.VarDeclq\u0000~\u0000(sq\u0000~\u0000\u000fppsq\u0000~\u0000\u001aq\u0000~\u0000\u0013pq\u0000~\u0000."
+"q\u0000~\u0000>q\u0000~\u0000#sq\u0000~\u0000$t\u0000\u0007VarDeclq\u0000~\u0000Csq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0000pp\u0000sq\u0000"
+"~\u0000\u000fppsq\u0000~\u0000\u0017q\u0000~\u0000\u0013psq\u0000~\u0000\u001aq\u0000~\u0000\u0013pq\u0000~\u0000\u001dq\u0000~\u0000!q\u0000~\u0000#sq\u0000~\u0000$t\u0000*net.sou"
+"rceforge.czt.circus.jaxb.gen.NSExprq\u0000~\u0000(sq\u0000~\u0000\u000fppsq\u0000~\u0000\u001aq\u0000~\u0000\u0013p"
+"q\u0000~\u0000.q\u0000~\u0000>q\u0000~\u0000#sq\u0000~\u0000$t\u0000\u0006LeftNSt\u0000!http://czt.sourceforge.net/"
+"circussq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u000fppsq\u0000~\u0000\u0017q\u0000~\u0000\u0013psq\u0000~\u0000\u001aq\u0000"
+"~\u0000\u0013pq\u0000~\u0000\u001dq\u0000~\u0000!q\u0000~\u0000#sq\u0000~\u0000$q\u0000~\u0001\fq\u0000~\u0000(sq\u0000~\u0000\u000fppsq\u0000~\u0000\u001aq\u0000~\u0000\u0013pq\u0000~\u0000."
+"q\u0000~\u0000>q\u0000~\u0000#sq\u0000~\u0000$t\u0000\u0007RightNSq\u0000~\u0001\u0011sq\u0000~\u0000\u000fppsq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u000fppsq\u0000~"
+"\u0000\u0017q\u0000~\u0000\u0013psq\u0000~\u0000\u001aq\u0000~\u0000\u0013pq\u0000~\u0000\u001dq\u0000~\u0000!q\u0000~\u0000#sq\u0000~\u0000$t\u00004net.sourceforge."
+"czt.circus.jaxb.gen.CSExprRefElementq\u0000~\u0000(sq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u000fppsq"
+"\u0000~\u0000\u0017q\u0000~\u0000\u0013psq\u0000~\u0000\u001aq\u0000~\u0000\u0013pq\u0000~\u0000\u001dq\u0000~\u0000!q\u0000~\u0000#sq\u0000~\u0000$t\u00004net.sourceforg"
+"e.czt.circus.jaxb.gen.CSExprSetElementq\u0000~\u0000(sq\u0000~\u0000\u000fppsq\u0000~\u0000\u001aq\u0000~"
+"\u0000\u0013pq\u0000~\u0000.q\u0000~\u0000>q\u0000~\u0000#sq\u0000~\u0000$t\u0000\u0015RepParallelCompActionq\u0000~\u0001\u0011sr\u0000\"com"
+".sun.msv.grammar.ExpressionPool\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\bexpTablet\u0000/Lcom"
+"/sun/msv/grammar/ExpressionPool$ClosedHash;xpsr\u0000-com.sun.msv"
+".grammar.ExpressionPool$ClosedHash\u00d7j\u00d0N\u00ef\u00e8\u00ed\u001c\u0003\u0000\u0003I\u0000\u0005countB\u0000\rstre"
+"amVersionL\u0000\u0006parentt\u0000$Lcom/sun/msv/grammar/ExpressionPool;xp\u0000"
+"\u0000\u0000j\u0001pq\u0000~\u0000Dq\u0000~\u0000Hq\u0000~\u0000Kq\u0000~\u0000\u00c4q\u0000~\u0000\u00beq\u0000~\u0000\u00b8q\u0000~\u0000\u00b2q\u0000~\u0000[q\u0000~\u0000\u00acq\u0000~\u0000\u00a6q\u0000~\u0000\u00a0"
+"q\u0000~\u0000\u009aq\u0000~\u0000\u0094q\u0000~\u0000\u008eq\u0000~\u0000\u0088q\u0000~\u0000\u0082q\u0000~\u0000|q\u0000~\u0000vq\u0000~\u0000pq\u0000~\u0000jq\u0000~\u0000dq\u0000~\u0000^q\u0000~\u0000\u0019"
+"q\u0000~\u0000\u00caq\u0000~\u0000\u00d0q\u0000~\u0000Iq\u0000~\u0000\u00d6q\u0000~\u0000\u00dcq\u0000~\u0000\u00e2q\u0000~\u0000Rq\u0000~\u0000\u00c3q\u0000~\u0000\u00bdq\u0000~\u0000\u00b7q\u0000~\u0000\u00b1q\u0000~\u0000\u00ab"
+"q\u0000~\u0000\u00a5q\u0000~\u0000\u009fq\u0000~\u0000\u0099q\u0000~\u0000\u0093q\u0000~\u0000\u008dq\u0000~\u0000\u0087q\u0000~\u0000\u0081q\u0000~\u0000{q\u0000~\u0000uq\u0000~\u0000oq\u0000~\u0000iq\u0000~\u0000c"
+"q\u0000~\u0000]q\u0000~\u0000\u0016q\u0000~\u0000\u00c9q\u0000~\u0000\u00cfq\u0000~\u0000\u00d5q\u0000~\u0000\u00dbq\u0000~\u0000\u00e1q\u0000~\u0000\u00e8q\u0000~\u0000\u00e7q\u0000~\u0000\u00eeq\u0000~\u0000\u00edq\u0000~\u0000\u00f5"
+"q\u0000~\u0000\u00f4q\u0000~\u0000\u00fdq\u0000~\u0000\u00fcq\u0000~\u0000\rq\u0000~\u0001\tq\u0000~\u0001\bq\u0000~\u0001\u0016q\u0000~\u0001\u0015q\u0000~\u0001 q\u0000~\u0001\u001fq\u0000~\u0001&q\u0000~\u0001%"
+"q\u0000~\u0001\u001dq\u0000~\u0000\tq\u0000~\u0000Sq\u0000~\u0000Wq\u0000~\u0000Lq\u0000~\u0000\u000bq\u0000~\u0000Vq\u0000~\u0000Fq\u0000~\u0000Xq\u0000~\u0000Uq\u0000~\u0000\u0014q\u0000~\u0000\u00fa"
+"q\u0000~\u0001\u0006q\u0000~\u0001\u0013q\u0000~\u0000)q\u0000~\u0001\u0001q\u0000~\u0001\rq\u0000~\u0001\u0019q\u0000~\u0000Eq\u0000~\u0001*q\u0000~\u0000Yq\u0000~\u0000Gq\u0000~\u0000Nq\u0000~\u0000O"
+"q\u0000~\u0000\u0010q\u0000~\u0000Mq\u0000~\u0000Pq\u0000~\u0000\u000eq\u0000~\u0000Zq\u0000~\u0000\fq\u0000~\u0000\nq\u0000~\u0000Tq\u0000~\u0000Jq\u0000~\u0000\u00f2q\u0000~\u0000Qx"));
        }
        return new com.sun.msv.verifier.regexp.REDocumentDeclaration(schemaFragment);
    }

    public class Unmarshaller
        extends net.sourceforge.czt.circus.jaxb.gen.impl.runtime.AbstractUnmarshallingEventHandlerImpl
    {


        public Unmarshaller(net.sourceforge.czt.circus.jaxb.gen.impl.runtime.UnmarshallingContext context) {
            super(context, "----");
        }

        protected Unmarshaller(net.sourceforge.czt.circus.jaxb.gen.impl.runtime.UnmarshallingContext context, int startState) {
            this(context);
            state = startState;
        }

        public java.lang.Object owner() {
            return net.sourceforge.czt.circus.jaxb.gen.impl.RepParallelCompActionElementImpl.this;
        }

        public void enterElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname, org.xml.sax.Attributes __atts)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  0 :
                        if (("RepParallelCompAction" == ___local)&&("http://czt.sourceforge.net/circus" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 1;
                            return ;
                        }
                        break;
                    case  1 :
                        if (("Anns" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.circus.jaxb.gen.impl.RepParallelCompActionImpl)net.sourceforge.czt.circus.jaxb.gen.impl.RepParallelCompActionElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("RepExtChAction" == ___local)&&("http://czt.sourceforge.net/circus" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.circus.jaxb.gen.impl.RepParallelCompActionImpl)net.sourceforge.czt.circus.jaxb.gen.impl.RepParallelCompActionElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("StopAction" == ___local)&&("http://czt.sourceforge.net/circus" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.circus.jaxb.gen.impl.RepParallelCompActionImpl)net.sourceforge.czt.circus.jaxb.gen.impl.RepParallelCompActionElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("PrefixingAction" == ___local)&&("http://czt.sourceforge.net/circus" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.circus.jaxb.gen.impl.RepParallelCompActionImpl)net.sourceforge.czt.circus.jaxb.gen.impl.RepParallelCompActionElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("InterleaveAction" == ___local)&&("http://czt.sourceforge.net/circus" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.circus.jaxb.gen.impl.RepParallelCompActionImpl)net.sourceforge.czt.circus.jaxb.gen.impl.RepParallelCompActionElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("SkipAction" == ___local)&&("http://czt.sourceforge.net/circus" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.circus.jaxb.gen.impl.RepParallelCompActionImpl)net.sourceforge.czt.circus.jaxb.gen.impl.RepParallelCompActionElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("ActualParamAction" == ___local)&&("http://czt.sourceforge.net/circus" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.circus.jaxb.gen.impl.RepParallelCompActionImpl)net.sourceforge.czt.circus.jaxb.gen.impl.RepParallelCompActionElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("AssignmentCmd" == ___local)&&("http://czt.sourceforge.net/circus" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.circus.jaxb.gen.impl.RepParallelCompActionImpl)net.sourceforge.czt.circus.jaxb.gen.impl.RepParallelCompActionElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("ParallelCompAction" == ___local)&&("http://czt.sourceforge.net/circus" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.circus.jaxb.gen.impl.RepParallelCompActionImpl)net.sourceforge.czt.circus.jaxb.gen.impl.RepParallelCompActionElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("HideAction" == ___local)&&("http://czt.sourceforge.net/circus" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.circus.jaxb.gen.impl.RepParallelCompActionImpl)net.sourceforge.czt.circus.jaxb.gen.impl.RepParallelCompActionElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("RepParallelCompAction" == ___local)&&("http://czt.sourceforge.net/circus" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.circus.jaxb.gen.impl.RepParallelCompActionImpl)net.sourceforge.czt.circus.jaxb.gen.impl.RepParallelCompActionElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("MuAction" == ___local)&&("http://czt.sourceforge.net/circus" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.circus.jaxb.gen.impl.RepParallelCompActionImpl)net.sourceforge.czt.circus.jaxb.gen.impl.RepParallelCompActionElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("GuardedAction" == ___local)&&("http://czt.sourceforge.net/circus" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.circus.jaxb.gen.impl.RepParallelCompActionImpl)net.sourceforge.czt.circus.jaxb.gen.impl.RepParallelCompActionElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("IntChoiceAction" == ___local)&&("http://czt.sourceforge.net/circus" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.circus.jaxb.gen.impl.RepParallelCompActionImpl)net.sourceforge.czt.circus.jaxb.gen.impl.RepParallelCompActionElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("VarDeclCmd" == ___local)&&("http://czt.sourceforge.net/circus" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.circus.jaxb.gen.impl.RepParallelCompActionImpl)net.sourceforge.czt.circus.jaxb.gen.impl.RepParallelCompActionElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("RepInterleaveAction" == ___local)&&("http://czt.sourceforge.net/circus" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.circus.jaxb.gen.impl.RepParallelCompActionImpl)net.sourceforge.czt.circus.jaxb.gen.impl.RepParallelCompActionElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("SeqCompAction" == ___local)&&("http://czt.sourceforge.net/circus" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.circus.jaxb.gen.impl.RepParallelCompActionImpl)net.sourceforge.czt.circus.jaxb.gen.impl.RepParallelCompActionElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("ExtChoiceAction" == ___local)&&("http://czt.sourceforge.net/circus" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.circus.jaxb.gen.impl.RepParallelCompActionImpl)net.sourceforge.czt.circus.jaxb.gen.impl.RepParallelCompActionElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("IfGuardedCmd" == ___local)&&("http://czt.sourceforge.net/circus" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.circus.jaxb.gen.impl.RepParallelCompActionImpl)net.sourceforge.czt.circus.jaxb.gen.impl.RepParallelCompActionElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("SchemaAction" == ___local)&&("http://czt.sourceforge.net/circus" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.circus.jaxb.gen.impl.RepParallelCompActionImpl)net.sourceforge.czt.circus.jaxb.gen.impl.RepParallelCompActionElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("RepSeqCompAction" == ___local)&&("http://czt.sourceforge.net/circus" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.circus.jaxb.gen.impl.RepParallelCompActionImpl)net.sourceforge.czt.circus.jaxb.gen.impl.RepParallelCompActionElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("SpecStmtCmd" == ___local)&&("http://czt.sourceforge.net/circus" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.circus.jaxb.gen.impl.RepParallelCompActionImpl)net.sourceforge.czt.circus.jaxb.gen.impl.RepParallelCompActionElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("CallAction" == ___local)&&("http://czt.sourceforge.net/circus" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.circus.jaxb.gen.impl.RepParallelCompActionImpl)net.sourceforge.czt.circus.jaxb.gen.impl.RepParallelCompActionElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("FormalParamAction" == ___local)&&("http://czt.sourceforge.net/circus" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.circus.jaxb.gen.impl.RepParallelCompActionImpl)net.sourceforge.czt.circus.jaxb.gen.impl.RepParallelCompActionElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("ChaosAction" == ___local)&&("http://czt.sourceforge.net/circus" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.circus.jaxb.gen.impl.RepParallelCompActionImpl)net.sourceforge.czt.circus.jaxb.gen.impl.RepParallelCompActionElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("RepIntChAction" == ___local)&&("http://czt.sourceforge.net/circus" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.circus.jaxb.gen.impl.RepParallelCompActionImpl)net.sourceforge.czt.circus.jaxb.gen.impl.RepParallelCompActionElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("ActionDef" == ___local)&&("http://czt.sourceforge.net/circus" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.circus.jaxb.gen.impl.RepParallelCompActionImpl)net.sourceforge.czt.circus.jaxb.gen.impl.RepParallelCompActionElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("ActionDef" == ___local)&&("http://czt.sourceforge.net/circus" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.circus.jaxb.gen.impl.RepParallelCompActionImpl)net.sourceforge.czt.circus.jaxb.gen.impl.RepParallelCompActionElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        spawnHandlerFromEnterElement((((net.sourceforge.czt.circus.jaxb.gen.impl.RepParallelCompActionImpl)net.sourceforge.czt.circus.jaxb.gen.impl.RepParallelCompActionElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
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
                    case  1 :
                        spawnHandlerFromLeaveElement((((net.sourceforge.czt.circus.jaxb.gen.impl.RepParallelCompActionImpl)net.sourceforge.czt.circus.jaxb.gen.impl.RepParallelCompActionElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
                        return ;
                    case  2 :
                        if (("RepParallelCompAction" == ___local)&&("http://czt.sourceforge.net/circus" == ___uri)) {
                            context.popAttributes();
                            state = 3;
                            return ;
                        }
                        break;
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
                        spawnHandlerFromEnterAttribute((((net.sourceforge.czt.circus.jaxb.gen.impl.RepParallelCompActionImpl)net.sourceforge.czt.circus.jaxb.gen.impl.RepParallelCompActionElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
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
                        spawnHandlerFromLeaveAttribute((((net.sourceforge.czt.circus.jaxb.gen.impl.RepParallelCompActionImpl)net.sourceforge.czt.circus.jaxb.gen.impl.RepParallelCompActionElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
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
                            spawnHandlerFromText((((net.sourceforge.czt.circus.jaxb.gen.impl.RepParallelCompActionImpl)net.sourceforge.czt.circus.jaxb.gen.impl.RepParallelCompActionElementImpl.this).new Unmarshaller(context)), 2, value);
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
