//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.2-b15-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2004.01.06 at 09:18:18 NZDT 
//


package net.sourceforge.czt.oz.jaxb.gen.impl;

public class HideOpExprImpl
    extends net.sourceforge.czt.oz.jaxb.gen.impl.OperationExprImpl
    implements net.sourceforge.czt.oz.jaxb.gen.HideOpExpr, com.sun.xml.bind.JAXBObject, net.sourceforge.czt.oz.jaxb.gen.impl.runtime.UnmarshallableObject, net.sourceforge.czt.oz.jaxb.gen.impl.runtime.XMLSerializable, net.sourceforge.czt.oz.jaxb.gen.impl.runtime.ValidatableObject
{

    protected com.sun.xml.bind.util.ListImpl _HideName = new com.sun.xml.bind.util.ListImpl(new java.util.ArrayList());
    protected net.sourceforge.czt.oz.jaxb.gen.OperationExpr _OperationExpr;
    public final static java.lang.Class version = (net.sourceforge.czt.oz.jaxb.gen.impl.JAXBVersion.class);
    private static com.sun.msv.grammar.Grammar schemaFragment;

    private final static java.lang.Class PRIMARY_INTERFACE_CLASS() {
        return (net.sourceforge.czt.oz.jaxb.gen.HideOpExpr.class);
    }

    public java.util.List getHideName() {
        return _HideName;
    }

    public net.sourceforge.czt.oz.jaxb.gen.OperationExpr getOperationExpr() {
        return _OperationExpr;
    }

    public void setOperationExpr(net.sourceforge.czt.oz.jaxb.gen.OperationExpr value) {
        _OperationExpr = value;
    }

    public net.sourceforge.czt.oz.jaxb.gen.impl.runtime.UnmarshallingEventHandler createUnmarshaller(net.sourceforge.czt.oz.jaxb.gen.impl.runtime.UnmarshallingContext context) {
        return new net.sourceforge.czt.oz.jaxb.gen.impl.HideOpExprImpl.Unmarshaller(context);
    }

    public void serializeBody(net.sourceforge.czt.oz.jaxb.gen.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        int idx1 = 0;
        final int len1 = _HideName.size();
        super.serializeBody(context);
        if (_OperationExpr instanceof javax.xml.bind.Element) {
            context.childAsBody(((com.sun.xml.bind.JAXBObject) _OperationExpr), "OperationExpr");
        } else {
            context.startElement("http://czt.sourceforge.net/object-z", "OperationExpr");
            context.childAsURIs(((com.sun.xml.bind.JAXBObject) _OperationExpr), "OperationExpr");
            context.endNamespaceDecls();
            context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _OperationExpr), "OperationExpr");
            context.endAttributes();
            context.childAsBody(((com.sun.xml.bind.JAXBObject) _OperationExpr), "OperationExpr");
            context.endElement();
        }
        while (idx1 != len1) {
            context.startElement("http://czt.sourceforge.net/object-z", "HideName");
            int idx_2 = idx1;
            context.childAsURIs(((com.sun.xml.bind.JAXBObject) _HideName.get(idx_2 ++)), "HideName");
            context.endNamespaceDecls();
            int idx_3 = idx1;
            context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _HideName.get(idx_3 ++)), "HideName");
            context.endAttributes();
            context.childAsBody(((com.sun.xml.bind.JAXBObject) _HideName.get(idx1 ++)), "HideName");
            context.endElement();
        }
    }

    public void serializeAttributes(net.sourceforge.czt.oz.jaxb.gen.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        int idx1 = 0;
        final int len1 = _HideName.size();
        super.serializeAttributes(context);
        if (_OperationExpr instanceof javax.xml.bind.Element) {
            context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _OperationExpr), "OperationExpr");
        }
        while (idx1 != len1) {
            idx1 += 1;
        }
    }

    public void serializeURIs(net.sourceforge.czt.oz.jaxb.gen.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        int idx1 = 0;
        final int len1 = _HideName.size();
        super.serializeURIs(context);
        if (_OperationExpr instanceof javax.xml.bind.Element) {
            context.childAsURIs(((com.sun.xml.bind.JAXBObject) _OperationExpr), "OperationExpr");
        }
        while (idx1 != len1) {
            idx1 += 1;
        }
    }

    public java.lang.Class getPrimaryInterface() {
        return (net.sourceforge.czt.oz.jaxb.gen.HideOpExpr.class);
    }

    public com.sun.msv.verifier.DocumentDeclaration createRawValidator() {
        if (schemaFragment == null) {
            schemaFragment = com.sun.xml.bind.validator.SchemaDeserializer.deserialize((
 "\u00ac\u00ed\u0000\u0005sr\u0000\u001fcom.sun.msv.grammar.SequenceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.su"
+"n.msv.grammar.BinaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0004exp1t\u0000 Lcom/sun/msv/gra"
+"mmar/Expression;L\u0000\u0004exp2q\u0000~\u0000\u0002xr\u0000\u001ecom.sun.msv.grammar.Expressi"
+"on\u00f8\u0018\u0082\u00e8N5~O\u0002\u0000\u0003I\u0000\u000ecachedHashCodeL\u0000\u0013epsilonReducibilityt\u0000\u0013Ljava"
+"/lang/Boolean;L\u0000\u000bexpandedExpq\u0000~\u0000\u0002xp\u0017X\u00bf\u00e6ppsq\u0000~\u0000\u0000\u0015\u00c0(\u00feppsr\u0000\u001dcom"
+".sun.msv.grammar.ChoiceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0001\u0002A\u0099%ppsr\u0000\'com.sun"
+".msv.grammar.trex.ElementPattern\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\tnameClasst\u0000\u001fLc"
+"om/sun/msv/grammar/NameClass;xr\u0000\u001ecom.sun.msv.grammar.Element"
+"Exp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002Z\u0000\u001aignoreUndeclaredAttributesL\u0000\fcontentModelq\u0000"
+"~\u0000\u0002xq\u0000~\u0000\u0003\u0002A\u0099\u001asr\u0000\u0011java.lang.Boolean\u00cd r\u0080\u00d5\u009c\u00fa\u00ee\u0002\u0000\u0001Z\u0000\u0005valuexp\u0000p\u0000sq"
+"\u0000~\u0000\u0000\u0002A\u0099\u000fppsq\u0000~\u0000\t\u0001dw\u00fbpp\u0000sq\u0000~\u0000\u0007\u0001dw\u00f0ppsr\u0000 com.sun.msv.grammar.O"
+"neOrMoreExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001ccom.sun.msv.grammar.UnaryExp\u0000\u0000\u0000\u0000\u0000\u0000"
+"\u0000\u0001\u0002\u0000\u0001L\u0000\u0003expq\u0000~\u0000\u0002xq\u0000~\u0000\u0003\u0001dw\u00e5q\u0000~\u0000\u000epsr\u0000 com.sun.msv.grammar.Attr"
+"ibuteExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003expq\u0000~\u0000\u0002L\u0000\tnameClassq\u0000~\u0000\nxq\u0000~\u0000\u0003\u0001dw\u00e2q\u0000~"
+"\u0000\u000epsr\u00002com.sun.msv.grammar.Expression$AnyStringExpression\u0000\u0000\u0000"
+"\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003\u0000\u0000\u0000\bsq\u0000~\u0000\r\u0001q\u0000~\u0000\u0018sr\u0000 com.sun.msv.grammar.AnyNam"
+"eClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun.msv.grammar.NameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000"
+"\u0000xpsr\u00000com.sun.msv.grammar.Expression$EpsilonExpression\u0000\u0000\u0000\u0000\u0000"
+"\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003\u0000\u0000\u0000\tq\u0000~\u0000\u0019q\u0000~\u0000\u001esr\u0000#com.sun.msv.grammar.SimpleName"
+"Class\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\tlocalNamet\u0000\u0012Ljava/lang/String;L\u0000\fnamespac"
+"eURIq\u0000~\u0000 xq\u0000~\u0000\u001bt\u0000-net.sourceforge.czt.z.jaxb.gen.TermA.AnnsT"
+"ypet\u0000+http://java.sun.com/jaxb/xjc/dummy-elementssq\u0000~\u0000\u0007\u0000\u00dd!\u000fp"
+"psq\u0000~\u0000\u0015\u0000\u00dd!\u0004q\u0000~\u0000\u000epsr\u0000\u001bcom.sun.msv.grammar.DataExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L"
+"\u0000\u0002dtt\u0000\u001fLorg/relaxng/datatype/Datatype;L\u0000\u0006exceptq\u0000~\u0000\u0002L\u0000\u0004namet"
+"\u0000\u001dLcom/sun/msv/util/StringPair;xq\u0000~\u0000\u0003\u00003\u00b11ppsr\u0000\"com.sun.msv.d"
+"atatype.xsd.QnameType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000*com.sun.msv.datatype.xsd"
+".BuiltinAtomicType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000%com.sun.msv.datatype.xsd.Co"
+"ncreteType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\'com.sun.msv.datatype.xsd.XSDatatype"
+"Impl\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\fnamespaceUriq\u0000~\u0000 L\u0000\btypeNameq\u0000~\u0000 L\u0000\nwhiteS"
+"pacet\u0000.Lcom/sun/msv/datatype/xsd/WhiteSpaceProcessor;xpt\u0000 ht"
+"tp://www.w3.org/2001/XMLSchemat\u0000\u0005QNamesr\u00005com.sun.msv.dataty"
+"pe.xsd.WhiteSpaceProcessor$Collapse\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000,com.sun.ms"
+"v.datatype.xsd.WhiteSpaceProcessor\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com.sun.m"
+"sv.grammar.Expression$NullSetExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003\u0000\u0000\u0000\n"
+"q\u0000~\u0000\u000epsr\u0000\u001bcom.sun.msv.util.StringPair\u00d0t\u001ejB\u008f\u008d\u00a0\u0002\u0000\u0002L\u0000\tlocalName"
+"q\u0000~\u0000 L\u0000\fnamespaceURIq\u0000~\u0000 xpq\u0000~\u00001q\u0000~\u00000sq\u0000~\u0000\u001ft\u0000\u0004typet\u0000)http://"
+"www.w3.org/2001/XMLSchema-instanceq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000\u0004Annst\u0000\u001ehttp:"
+"//czt.sourceforge.net/zmlq\u0000~\u0000\u001esq\u0000~\u0000\u0007\u0013~\u008f\u00d4ppsq\u0000~\u0000\u0007\u0012\u001a\u0017\u00d7ppsq\u0000~\u0000\u0007"
+"\u0010\u00b5\u009f\u00dappsq\u0000~\u0000\u0007\u000fQ\'\u00ddppsq\u0000~\u0000\u0007\r\u00ec\u00af\u00e0ppsq\u0000~\u0000\u0007\f\u00887\u00e3ppsq\u0000~\u0000\u0007\u000b#\u00bf\u00e6ppsq\u0000~\u0000\u0007"
+"\t\u00bfG\u00e9ppsq\u0000~\u0000\u0007\bZ\u00cf\u00ecppsq\u0000~\u0000\u0007\u0006\u00f6W\u00efppsq\u0000~\u0000\u0007\u0005\u0091\u00df\u00f2ppsq\u0000~\u0000\u0007\u0004-g\u00f5ppsq\u0000~\u0000\u0007"
+"\u0002\u00c8\u00ef\u00f8ppsq\u0000~\u0000\t\u0001dw\u00fbpp\u0000sq\u0000~\u0000\u0007\u0001dw\u00f0ppsq\u0000~\u0000\u0012\u0001dw\u00e5q\u0000~\u0000\u000epsq\u0000~\u0000\u0015\u0001dw\u00e2q\u0000~"
+"\u0000\u000epq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u00003net.sourceforge.czt.oz.jaxb.gen.R"
+"enameOpExprElementq\u0000~\u0000#sq\u0000~\u0000\t\u0001dw\u00fbpp\u0000sq\u0000~\u0000\u0007\u0001dw\u00f0ppsq\u0000~\u0000\u0012\u0001dw\u00e5q\u0000"
+"~\u0000\u000epsq\u0000~\u0000\u0015\u0001dw\u00e2q\u0000~\u0000\u000epq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u00001net.sourceforge."
+"czt.oz.jaxb.gen.ScopeEnrichOpExprq\u0000~\u0000#sq\u0000~\u0000\t\u0001dw\u00fbpp\u0000sq\u0000~\u0000\u0007\u0001dw"
+"\u00f0ppsq\u0000~\u0000\u0012\u0001dw\u00e5q\u0000~\u0000\u000epsq\u0000~\u0000\u0015\u0001dw\u00e2q\u0000~\u0000\u000epq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000)n"
+"et.sourceforge.czt.oz.jaxb.gen.SeqOpExprq\u0000~\u0000#sq\u0000~\u0000\t\u0001dw\u00fbpp\u0000sq"
+"\u0000~\u0000\u0007\u0001dw\u00f0ppsq\u0000~\u0000\u0012\u0001dw\u00e5q\u0000~\u0000\u000epsq\u0000~\u0000\u0015\u0001dw\u00e2q\u0000~\u0000\u000epq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000"
+"~\u0000\u001ft\u00002net.sourceforge.czt.oz.jaxb.gen.AssoParallelOpExprq\u0000~\u0000"
+"#sq\u0000~\u0000\t\u0001dw\u00fbpp\u0000sq\u0000~\u0000\u0007\u0001dw\u00f0ppsq\u0000~\u0000\u0012\u0001dw\u00e5q\u0000~\u0000\u000epsq\u0000~\u0000\u0015\u0001dw\u00e2q\u0000~\u0000\u000epq\u0000"
+"~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000.net.sourceforge.czt.oz.jaxb.gen.Parall"
+"elOpExprq\u0000~\u0000#sq\u0000~\u0000\t\u0001dw\u00fbpp\u0000sq\u0000~\u0000\u0007\u0001dw\u00f0ppsq\u0000~\u0000\u0012\u0001dw\u00e5q\u0000~\u0000\u000epsq\u0000~\u0000\u0015"
+"\u0001dw\u00e2q\u0000~\u0000\u000epq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000.net.sourceforge.czt.oz.jax"
+"b.gen.DistConjOpExprq\u0000~\u0000#sq\u0000~\u0000\t\u0001dw\u00fbpp\u0000sq\u0000~\u0000\u0007\u0001dw\u00f0ppsq\u0000~\u0000\u0012\u0001dw\u00e5"
+"q\u0000~\u0000\u000epsq\u0000~\u0000\u0015\u0001dw\u00e2q\u0000~\u0000\u000epq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u00006net.sourceforg"
+"e.czt.oz.jaxb.gen.OpPromotionExprElementq\u0000~\u0000#sq\u0000~\u0000\t\u0001dw\u00fbpp\u0000sq"
+"\u0000~\u0000\u0007\u0001dw\u00f0ppsq\u0000~\u0000\u0012\u0001dw\u00e5q\u0000~\u0000\u000epsq\u0000~\u0000\u0015\u0001dw\u00e2q\u0000~\u0000\u000epq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000"
+"~\u0000\u001ft\u00002net.sourceforge.czt.oz.jaxb.gen.BasicOpExprElementq\u0000~\u0000"
+"#sq\u0000~\u0000\t\u0001dw\u00fbpp\u0000sq\u0000~\u0000\u0007\u0001dw\u00f0ppsq\u0000~\u0000\u0012\u0001dw\u00e5q\u0000~\u0000\u000epsq\u0000~\u0000\u0015\u0001dw\u00e2q\u0000~\u0000\u000epq\u0000"
+"~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000-net.sourceforge.czt.oz.jaxb.gen.DistSe"
+"qOpExprq\u0000~\u0000#sq\u0000~\u0000\t\u0001dw\u00fbpp\u0000sq\u0000~\u0000\u0007\u0001dw\u00f0ppsq\u0000~\u0000\u0012\u0001dw\u00e5q\u0000~\u0000\u000epsq\u0000~\u0000\u0015\u0001"
+"dw\u00e2q\u0000~\u0000\u000epq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u00001net.sourceforge.czt.oz.jaxb"
+".gen.HideOpExprElementq\u0000~\u0000#sq\u0000~\u0000\t\u0001dw\u00fbpp\u0000sq\u0000~\u0000\u0007\u0001dw\u00f0ppsq\u0000~\u0000\u0012\u0001d"
+"w\u00e5q\u0000~\u0000\u000epsq\u0000~\u0000\u0015\u0001dw\u00e2q\u0000~\u0000\u000epq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000+net.sourcefo"
+"rge.czt.oz.jaxb.gen.ParenOpExprq\u0000~\u0000#sq\u0000~\u0000\t\u0001dw\u00fbpp\u0000sq\u0000~\u0000\u0007\u0001dw\u00f0p"
+"psq\u0000~\u0000\u0012\u0001dw\u00e5q\u0000~\u0000\u000epsq\u0000~\u0000\u0015\u0001dw\u00e2q\u0000~\u0000\u000epq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u00000net"
+".sourceforge.czt.oz.jaxb.gen.DistChoiceOpExprq\u0000~\u0000#sq\u0000~\u0000\t\u0001dw\u00fb"
+"pp\u0000sq\u0000~\u0000\u0007\u0001dw\u00f0ppsq\u0000~\u0000\u0012\u0001dw\u00e5q\u0000~\u0000\u000epsq\u0000~\u0000\u0015\u0001dw\u00e2q\u0000~\u0000\u000epq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~"
+"\u0000\u001esq\u0000~\u0000\u001ft\u0000.net.sourceforge.czt.oz.jaxb.gen.ExChoiceOpExprq\u0000~"
+"\u0000#sq\u0000~\u0000\t\u0001dw\u00fbpp\u0000sq\u0000~\u0000\u0007\u0001dw\u00f0ppsq\u0000~\u0000\u0012\u0001dw\u00e5q\u0000~\u0000\u000epsq\u0000~\u0000\u0015\u0001dw\u00e2q\u0000~\u0000\u000epq"
+"\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000*net.sourceforge.czt.oz.jaxb.gen.ConjO"
+"pExprq\u0000~\u0000#sq\u0000~\u0000\u0012\u0001\u0098\u0096\u00e3ppsq\u0000~\u0000\t\u0001\u0098\u0096\u00e0pp\u0000sq\u0000~\u0000\u0000\u0001\u0098\u0096\u00d5ppsq\u0000~\u0000\t\u0001dw\u00fbpp\u0000"
+"sq\u0000~\u0000\u0007\u0001dw\u00f0ppsq\u0000~\u0000\u0012\u0001dw\u00e5q\u0000~\u0000\u000epsq\u0000~\u0000\u0015\u0001dw\u00e2q\u0000~\u0000\u000epq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001es"
+"q\u0000~\u0000\u001ft\u0000&net.sourceforge.czt.z.jaxb.gen.RefNameq\u0000~\u0000#sq\u0000~\u0000\u0007\u00004\u001e"
+"\u00d5ppsq\u0000~\u0000\u0015\u00004\u001e\u00caq\u0000~\u0000\u000epq\u0000~\u0000)sq\u0000~\u0000\u001fq\u0000~\u0000:q\u0000~\u0000;q\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000\bHideNa"
+"met\u0000#http://czt.sourceforge.net/object-zsr\u0000\"com.sun.msv.gram"
+"mar.ExpressionPool\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\bexpTablet\u0000/Lcom/sun/msv/gram"
+"mar/ExpressionPool$ClosedHash;xpsr\u0000-com.sun.msv.grammar.Expr"
+"essionPool$ClosedHash\u00d7j\u00d0N\u00ef\u00e8\u00ed\u001c\u0002\u0000\u0004I\u0000\u0005countI\u0000\tthresholdL\u0000\u0006paren"
+"tq\u0000~\u0000\u00b0[\u0000\u0005tablet\u0000![Lcom/sun/msv/grammar/Expression;xp\u0000\u0000\u00005\u0000\u0000\u00009"
+"pur\u0000![Lcom.sun.msv.grammar.Expression;\u00d68D\u00c3]\u00ad\u00a7\n\u0002\u0000\u0000xp\u0000\u0000\u0000\u00bfppppp"
+"pppppppq\u0000~\u0000Jpppppppppppppq\u0000~\u0000Gpppppppppppppq\u0000~\u0000Dpppppppppppp"
+"pq\u0000~\u0000Apq\u0000~\u0000\u00a2pppppppppppppq\u0000~\u0000\u00a0q\u0000~\u0000Kpppppppppppq\u0000~\u0000\u0006pq\u0000~\u0000Hppp"
+"ppppppppppq\u0000~\u0000Eppppppppq\u0000~\u0000\u0014q\u0000~\u0000Nq\u0000~\u0000Tq\u0000~\u0000Zq\u0000~\u0000`q\u0000~\u0000fq\u0000~\u0000lq\u0000"
+"~\u0000rq\u0000~\u0000xq\u0000~\u0000~q\u0000~\u0000\u0084q\u0000~\u0000\u0011q\u0000~\u0000\u000fq\u0000~\u0000Mq\u0000~\u0000Sq\u0000~\u0000Yq\u0000~\u0000_q\u0000~\u0000eq\u0000~\u0000kq\u0000"
+"~\u0000qq\u0000~\u0000wq\u0000~\u0000}q\u0000~\u0000\u0083q\u0000~\u0000\u008aq\u0000~\u0000\u0089q\u0000~\u0000Bq\u0000~\u0000\u0090q\u0000~\u0000\u008fq\u0000~\u0000\u0096q\u0000~\u0000\u0095q\u0000~\u0000\u009cq\u0000"
+"~\u0000\u009bq\u0000~\u0000?q\u0000~\u0000\u00a5q\u0000~\u0000\bq\u0000~\u0000\u00a4q\u0000~\u0000Iq\u0000~\u0000\u00a9ppppppppppppq\u0000~\u0000Fq\u0000~\u0000\u0005ppppp"
+"pppppppq\u0000~\u0000Cpppq\u0000~\u0000$pppppppppq\u0000~\u0000@pppp"));
        }
        return new com.sun.msv.verifier.regexp.REDocumentDeclaration(schemaFragment);
    }

    public class Unmarshaller
        extends net.sourceforge.czt.oz.jaxb.gen.impl.runtime.AbstractUnmarshallingEventHandlerImpl
    {


        public Unmarshaller(net.sourceforge.czt.oz.jaxb.gen.impl.runtime.UnmarshallingContext context) {
            super(context, "--------");
        }

        protected Unmarshaller(net.sourceforge.czt.oz.jaxb.gen.impl.runtime.UnmarshallingContext context, int startState) {
            this(context);
            state = startState;
        }

        public java.lang.Object owner() {
            return net.sourceforge.czt.oz.jaxb.gen.impl.HideOpExprImpl.this;
        }

        public void enterElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname, org.xml.sax.Attributes __atts)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  5 :
                        if (("HideName" == ___local)&&("http://czt.sourceforge.net/object-z" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 3;
                            return ;
                        }
                        revertToParentFromEnterElement(___uri, ___local, ___qname, __atts);
                        return ;
                    case  1 :
                        if (("RenameOpExpr" == ___local)&&("http://czt.sourceforge.net/object-z" == ___uri)) {
                            _OperationExpr = ((net.sourceforge.czt.oz.jaxb.gen.impl.RenameOpExprElementImpl) spawnChildFromEnterElement((net.sourceforge.czt.oz.jaxb.gen.impl.RenameOpExprElementImpl.class), 2, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("ScopeEnrichOpExpr" == ___local)&&("http://czt.sourceforge.net/object-z" == ___uri)) {
                            _OperationExpr = ((net.sourceforge.czt.oz.jaxb.gen.impl.ScopeEnrichOpExprImpl) spawnChildFromEnterElement((net.sourceforge.czt.oz.jaxb.gen.impl.ScopeEnrichOpExprImpl.class), 2, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("SeqOpExpr" == ___local)&&("http://czt.sourceforge.net/object-z" == ___uri)) {
                            _OperationExpr = ((net.sourceforge.czt.oz.jaxb.gen.impl.SeqOpExprImpl) spawnChildFromEnterElement((net.sourceforge.czt.oz.jaxb.gen.impl.SeqOpExprImpl.class), 2, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("AssoParallelOpExpr" == ___local)&&("http://czt.sourceforge.net/object-z" == ___uri)) {
                            _OperationExpr = ((net.sourceforge.czt.oz.jaxb.gen.impl.AssoParallelOpExprImpl) spawnChildFromEnterElement((net.sourceforge.czt.oz.jaxb.gen.impl.AssoParallelOpExprImpl.class), 2, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("ParallelOpExpr" == ___local)&&("http://czt.sourceforge.net/object-z" == ___uri)) {
                            _OperationExpr = ((net.sourceforge.czt.oz.jaxb.gen.impl.ParallelOpExprImpl) spawnChildFromEnterElement((net.sourceforge.czt.oz.jaxb.gen.impl.ParallelOpExprImpl.class), 2, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("DistConjOpExpr" == ___local)&&("http://czt.sourceforge.net/object-z" == ___uri)) {
                            _OperationExpr = ((net.sourceforge.czt.oz.jaxb.gen.impl.DistConjOpExprImpl) spawnChildFromEnterElement((net.sourceforge.czt.oz.jaxb.gen.impl.DistConjOpExprImpl.class), 2, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("OpPromotionExpr" == ___local)&&("http://czt.sourceforge.net/object-z" == ___uri)) {
                            _OperationExpr = ((net.sourceforge.czt.oz.jaxb.gen.impl.OpPromotionExprElementImpl) spawnChildFromEnterElement((net.sourceforge.czt.oz.jaxb.gen.impl.OpPromotionExprElementImpl.class), 2, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("BasicOpExpr" == ___local)&&("http://czt.sourceforge.net/object-z" == ___uri)) {
                            _OperationExpr = ((net.sourceforge.czt.oz.jaxb.gen.impl.BasicOpExprElementImpl) spawnChildFromEnterElement((net.sourceforge.czt.oz.jaxb.gen.impl.BasicOpExprElementImpl.class), 2, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("DistSeqOpExpr" == ___local)&&("http://czt.sourceforge.net/object-z" == ___uri)) {
                            _OperationExpr = ((net.sourceforge.czt.oz.jaxb.gen.impl.DistSeqOpExprImpl) spawnChildFromEnterElement((net.sourceforge.czt.oz.jaxb.gen.impl.DistSeqOpExprImpl.class), 2, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("HideOpExpr" == ___local)&&("http://czt.sourceforge.net/object-z" == ___uri)) {
                            _OperationExpr = ((net.sourceforge.czt.oz.jaxb.gen.impl.HideOpExprElementImpl) spawnChildFromEnterElement((net.sourceforge.czt.oz.jaxb.gen.impl.HideOpExprElementImpl.class), 2, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("ParenOpExpr" == ___local)&&("http://czt.sourceforge.net/object-z" == ___uri)) {
                            _OperationExpr = ((net.sourceforge.czt.oz.jaxb.gen.impl.ParenOpExprImpl) spawnChildFromEnterElement((net.sourceforge.czt.oz.jaxb.gen.impl.ParenOpExprImpl.class), 2, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("DistChoiceOpExpr" == ___local)&&("http://czt.sourceforge.net/object-z" == ___uri)) {
                            _OperationExpr = ((net.sourceforge.czt.oz.jaxb.gen.impl.DistChoiceOpExprImpl) spawnChildFromEnterElement((net.sourceforge.czt.oz.jaxb.gen.impl.DistChoiceOpExprImpl.class), 2, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("ExChoiceOpExpr" == ___local)&&("http://czt.sourceforge.net/object-z" == ___uri)) {
                            _OperationExpr = ((net.sourceforge.czt.oz.jaxb.gen.impl.ExChoiceOpExprImpl) spawnChildFromEnterElement((net.sourceforge.czt.oz.jaxb.gen.impl.ExChoiceOpExprImpl.class), 2, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("ConjOpExpr" == ___local)&&("http://czt.sourceforge.net/object-z" == ___uri)) {
                            _OperationExpr = ((net.sourceforge.czt.oz.jaxb.gen.impl.ConjOpExprImpl) spawnChildFromEnterElement((net.sourceforge.czt.oz.jaxb.gen.impl.ConjOpExprImpl.class), 2, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("OperationExpr" == ___local)&&("http://czt.sourceforge.net/object-z" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 6;
                            return ;
                        }
                        if (("OperationExpr" == ___local)&&("http://czt.sourceforge.net/object-z" == ___uri)) {
                            _OperationExpr = ((net.sourceforge.czt.oz.jaxb.gen.impl.OperationExprElementImpl) spawnChildFromEnterElement((net.sourceforge.czt.oz.jaxb.gen.impl.OperationExprElementImpl.class), 2, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        break;
                    case  2 :
                        if (("HideName" == ___local)&&("http://czt.sourceforge.net/object-z" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 3;
                            return ;
                        }
                        break;
                    case  6 :
                        if (("Anns" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _OperationExpr = ((net.sourceforge.czt.oz.jaxb.gen.impl.OperationExprImpl) spawnChildFromEnterElement((net.sourceforge.czt.oz.jaxb.gen.impl.OperationExprImpl.class), 7, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        _OperationExpr = ((net.sourceforge.czt.oz.jaxb.gen.impl.OperationExprImpl) spawnChildFromEnterElement((net.sourceforge.czt.oz.jaxb.gen.impl.OperationExprImpl.class), 7, ___uri, ___local, ___qname, __atts));
                        return ;
                    case  3 :
                        attIdx = context.getAttribute("", "Decl");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().enterElement(___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("Anns" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _HideName.add(((net.sourceforge.czt.z.jaxb.gen.impl.RefNameImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.RefNameImpl.class), 4, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("Word" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _HideName.add(((net.sourceforge.czt.z.jaxb.gen.impl.RefNameImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.RefNameImpl.class), 4, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        _HideName.add(((net.sourceforge.czt.z.jaxb.gen.impl.RefNameImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.RefNameImpl.class), 4, ___uri, ___local, ___qname, __atts)));
                        return ;
                    case  0 :
                        if (("Anns" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.oz.jaxb.gen.impl.OperationExprImpl)net.sourceforge.czt.oz.jaxb.gen.impl.HideOpExprImpl.this).new Unmarshaller(context)), 1, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        spawnHandlerFromEnterElement((((net.sourceforge.czt.oz.jaxb.gen.impl.OperationExprImpl)net.sourceforge.czt.oz.jaxb.gen.impl.HideOpExprImpl.this).new Unmarshaller(context)), 1, ___uri, ___local, ___qname, __atts);
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
                    case  5 :
                        revertToParentFromLeaveElement(___uri, ___local, ___qname);
                        return ;
                    case  4 :
                        if (("HideName" == ___local)&&("http://czt.sourceforge.net/object-z" == ___uri)) {
                            context.popAttributes();
                            state = 5;
                            return ;
                        }
                        break;
                    case  6 :
                        _OperationExpr = ((net.sourceforge.czt.oz.jaxb.gen.impl.OperationExprImpl) spawnChildFromLeaveElement((net.sourceforge.czt.oz.jaxb.gen.impl.OperationExprImpl.class), 7, ___uri, ___local, ___qname));
                        return ;
                    case  7 :
                        if (("OperationExpr" == ___local)&&("http://czt.sourceforge.net/object-z" == ___uri)) {
                            context.popAttributes();
                            state = 2;
                            return ;
                        }
                        break;
                    case  3 :
                        attIdx = context.getAttribute("", "Decl");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveElement(___uri, ___local, ___qname);
                            return ;
                        }
                        _HideName.add(((net.sourceforge.czt.z.jaxb.gen.impl.RefNameImpl) spawnChildFromLeaveElement((net.sourceforge.czt.z.jaxb.gen.impl.RefNameImpl.class), 4, ___uri, ___local, ___qname)));
                        return ;
                    case  0 :
                        spawnHandlerFromLeaveElement((((net.sourceforge.czt.oz.jaxb.gen.impl.OperationExprImpl)net.sourceforge.czt.oz.jaxb.gen.impl.HideOpExprImpl.this).new Unmarshaller(context)), 1, ___uri, ___local, ___qname);
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
                    case  5 :
                        revertToParentFromEnterAttribute(___uri, ___local, ___qname);
                        return ;
                    case  6 :
                        _OperationExpr = ((net.sourceforge.czt.oz.jaxb.gen.impl.OperationExprImpl) spawnChildFromEnterAttribute((net.sourceforge.czt.oz.jaxb.gen.impl.OperationExprImpl.class), 7, ___uri, ___local, ___qname));
                        return ;
                    case  3 :
                        if (("Decl" == ___local)&&("" == ___uri)) {
                            _HideName.add(((net.sourceforge.czt.z.jaxb.gen.impl.RefNameImpl) spawnChildFromEnterAttribute((net.sourceforge.czt.z.jaxb.gen.impl.RefNameImpl.class), 4, ___uri, ___local, ___qname)));
                            return ;
                        }
                        _HideName.add(((net.sourceforge.czt.z.jaxb.gen.impl.RefNameImpl) spawnChildFromEnterAttribute((net.sourceforge.czt.z.jaxb.gen.impl.RefNameImpl.class), 4, ___uri, ___local, ___qname)));
                        return ;
                    case  0 :
                        spawnHandlerFromEnterAttribute((((net.sourceforge.czt.oz.jaxb.gen.impl.OperationExprImpl)net.sourceforge.czt.oz.jaxb.gen.impl.HideOpExprImpl.this).new Unmarshaller(context)), 1, ___uri, ___local, ___qname);
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
                    case  5 :
                        revertToParentFromLeaveAttribute(___uri, ___local, ___qname);
                        return ;
                    case  6 :
                        _OperationExpr = ((net.sourceforge.czt.oz.jaxb.gen.impl.OperationExprImpl) spawnChildFromLeaveAttribute((net.sourceforge.czt.oz.jaxb.gen.impl.OperationExprImpl.class), 7, ___uri, ___local, ___qname));
                        return ;
                    case  3 :
                        attIdx = context.getAttribute("", "Decl");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveAttribute(___uri, ___local, ___qname);
                            return ;
                        }
                        _HideName.add(((net.sourceforge.czt.z.jaxb.gen.impl.RefNameImpl) spawnChildFromLeaveAttribute((net.sourceforge.czt.z.jaxb.gen.impl.RefNameImpl.class), 4, ___uri, ___local, ___qname)));
                        return ;
                    case  0 :
                        spawnHandlerFromLeaveAttribute((((net.sourceforge.czt.oz.jaxb.gen.impl.OperationExprImpl)net.sourceforge.czt.oz.jaxb.gen.impl.HideOpExprImpl.this).new Unmarshaller(context)), 1, ___uri, ___local, ___qname);
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
                        case  5 :
                            revertToParentFromText(value);
                            return ;
                        case  6 :
                            _OperationExpr = ((net.sourceforge.czt.oz.jaxb.gen.impl.OperationExprImpl) spawnChildFromText((net.sourceforge.czt.oz.jaxb.gen.impl.OperationExprImpl.class), 7, value));
                            return ;
                        case  3 :
                            attIdx = context.getAttribute("", "Decl");
                            if (attIdx >= 0) {
                                context.consumeAttribute(attIdx);
                                context.getCurrentHandler().text(value);
                                return ;
                            }
                            _HideName.add(((net.sourceforge.czt.z.jaxb.gen.impl.RefNameImpl) spawnChildFromText((net.sourceforge.czt.z.jaxb.gen.impl.RefNameImpl.class), 4, value)));
                            return ;
                        case  0 :
                            spawnHandlerFromText((((net.sourceforge.czt.oz.jaxb.gen.impl.OperationExprImpl)net.sourceforge.czt.oz.jaxb.gen.impl.HideOpExprImpl.this).new Unmarshaller(context)), 1, value);
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
