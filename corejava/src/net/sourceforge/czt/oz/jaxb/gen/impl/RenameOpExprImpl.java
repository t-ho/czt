//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.2-b15-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2004.01.29 at 12:59:34 NZDT 
//


package net.sourceforge.czt.oz.jaxb.gen.impl;

public class RenameOpExprImpl
    extends net.sourceforge.czt.oz.jaxb.gen.impl.OperationExprImpl
    implements net.sourceforge.czt.oz.jaxb.gen.RenameOpExpr, com.sun.xml.bind.JAXBObject, net.sourceforge.czt.oz.jaxb.gen.impl.runtime.UnmarshallableObject, net.sourceforge.czt.oz.jaxb.gen.impl.runtime.XMLSerializable, net.sourceforge.czt.oz.jaxb.gen.impl.runtime.ValidatableObject
{

    protected com.sun.xml.bind.util.ListImpl _NameNamePair = new com.sun.xml.bind.util.ListImpl(new java.util.ArrayList());
    protected net.sourceforge.czt.oz.jaxb.gen.OperationExpr _OperationExpr;
    public final static java.lang.Class version = (net.sourceforge.czt.oz.jaxb.gen.impl.JAXBVersion.class);
    private static com.sun.msv.grammar.Grammar schemaFragment;

    private final static java.lang.Class PRIMARY_INTERFACE_CLASS() {
        return (net.sourceforge.czt.oz.jaxb.gen.RenameOpExpr.class);
    }

    public java.util.List getNameNamePair() {
        return _NameNamePair;
    }

    public net.sourceforge.czt.oz.jaxb.gen.OperationExpr getOperationExpr() {
        return _OperationExpr;
    }

    public void setOperationExpr(net.sourceforge.czt.oz.jaxb.gen.OperationExpr value) {
        _OperationExpr = value;
    }

    public net.sourceforge.czt.oz.jaxb.gen.impl.runtime.UnmarshallingEventHandler createUnmarshaller(net.sourceforge.czt.oz.jaxb.gen.impl.runtime.UnmarshallingContext context) {
        return new net.sourceforge.czt.oz.jaxb.gen.impl.RenameOpExprImpl.Unmarshaller(context);
    }

    public void serializeBody(net.sourceforge.czt.oz.jaxb.gen.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        int idx1 = 0;
        final int len1 = _NameNamePair.size();
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
            if (_NameNamePair.get(idx1) instanceof javax.xml.bind.Element) {
                context.childAsBody(((com.sun.xml.bind.JAXBObject) _NameNamePair.get(idx1 ++)), "NameNamePair");
            } else {
                context.startElement("http://czt.sourceforge.net/zml", "NameNamePair");
                int idx_2 = idx1;
                context.childAsURIs(((com.sun.xml.bind.JAXBObject) _NameNamePair.get(idx_2 ++)), "NameNamePair");
                context.endNamespaceDecls();
                int idx_3 = idx1;
                context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _NameNamePair.get(idx_3 ++)), "NameNamePair");
                context.endAttributes();
                context.childAsBody(((com.sun.xml.bind.JAXBObject) _NameNamePair.get(idx1 ++)), "NameNamePair");
                context.endElement();
            }
        }
    }

    public void serializeAttributes(net.sourceforge.czt.oz.jaxb.gen.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        int idx1 = 0;
        final int len1 = _NameNamePair.size();
        super.serializeAttributes(context);
        if (_OperationExpr instanceof javax.xml.bind.Element) {
            context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _OperationExpr), "OperationExpr");
        }
        while (idx1 != len1) {
            if (_NameNamePair.get(idx1) instanceof javax.xml.bind.Element) {
                context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _NameNamePair.get(idx1 ++)), "NameNamePair");
            } else {
                idx1 += 1;
            }
        }
    }

    public void serializeURIs(net.sourceforge.czt.oz.jaxb.gen.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        int idx1 = 0;
        final int len1 = _NameNamePair.size();
        super.serializeURIs(context);
        if (_OperationExpr instanceof javax.xml.bind.Element) {
            context.childAsURIs(((com.sun.xml.bind.JAXBObject) _OperationExpr), "OperationExpr");
        }
        while (idx1 != len1) {
            if (_NameNamePair.get(idx1) instanceof javax.xml.bind.Element) {
                context.childAsURIs(((com.sun.xml.bind.JAXBObject) _NameNamePair.get(idx1 ++)), "NameNamePair");
            } else {
                idx1 += 1;
            }
        }
    }

    public java.lang.Class getPrimaryInterface() {
        return (net.sourceforge.czt.oz.jaxb.gen.RenameOpExpr.class);
    }

    public com.sun.msv.verifier.DocumentDeclaration createRawValidator() {
        if (schemaFragment == null) {
            schemaFragment = com.sun.xml.bind.validator.SchemaDeserializer.deserialize((
 "\u00ac\u00ed\u0000\u0005sr\u0000\u001fcom.sun.msv.grammar.SequenceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.su"
+"n.msv.grammar.BinaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0004exp1t\u0000 Lcom/sun/msv/gra"
+"mmar/Expression;L\u0000\u0004exp2q\u0000~\u0000\u0002xr\u0000\u001ecom.sun.msv.grammar.Expressi"
+"on\u00f8\u0018\u0082\u00e8N5~O\u0002\u0000\u0003I\u0000\u000ecachedHashCodeL\u0000\u0013epsilonReducibilityt\u0000\u0013Ljava"
+"/lang/Boolean;L\u0000\u000bexpandedExpq\u0000~\u0000\u0002xp(\u00a2\u008f\fppsq\u0000~\u0000\u0000!+\u008c\u00d6ppsr\u0000\u001dcom"
+".sun.msv.grammar.ChoiceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0001\u0005\u00914%ppsr\u0000\'com.sun"
+".msv.grammar.trex.ElementPattern\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\tnameClasst\u0000\u001fLc"
+"om/sun/msv/grammar/NameClass;xr\u0000\u001ecom.sun.msv.grammar.Element"
+"Exp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002Z\u0000\u001aignoreUndeclaredAttributesL\u0000\fcontentModelq\u0000"
+"~\u0000\u0002xq\u0000~\u0000\u0003\u0005\u00914\u001asr\u0000\u0011java.lang.Boolean\u00cd r\u0080\u00d5\u009c\u00fa\u00ee\u0002\u0000\u0001Z\u0000\u0005valuexp\u0000p\u0000sq"
+"\u0000~\u0000\u0000\u0005\u00914\u000fppsq\u0000~\u0000\t\u0001\u00f8\u00bd/pp\u0000sq\u0000~\u0000\u0007\u0001\u00f8\u00bd$ppsr\u0000 com.sun.msv.grammar.O"
+"neOrMoreExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001ccom.sun.msv.grammar.UnaryExp\u0000\u0000\u0000\u0000\u0000\u0000"
+"\u0000\u0001\u0002\u0000\u0001L\u0000\u0003expq\u0000~\u0000\u0002xq\u0000~\u0000\u0003\u0001\u00f8\u00bd\u0019q\u0000~\u0000\u000epsr\u0000 com.sun.msv.grammar.Attr"
+"ibuteExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003expq\u0000~\u0000\u0002L\u0000\tnameClassq\u0000~\u0000\nxq\u0000~\u0000\u0003\u0001\u00f8\u00bd\u0016q\u0000~"
+"\u0000\u000epsr\u00002com.sun.msv.grammar.Expression$AnyStringExpression\u0000\u0000\u0000"
+"\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003\u0000\u0000\u0000\bsq\u0000~\u0000\r\u0001q\u0000~\u0000\u0018sr\u0000 com.sun.msv.grammar.AnyNam"
+"eClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun.msv.grammar.NameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000"
+"\u0000xpsr\u00000com.sun.msv.grammar.Expression$EpsilonExpression\u0000\u0000\u0000\u0000\u0000"
+"\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003\u0000\u0000\u0000\tq\u0000~\u0000\u0019q\u0000~\u0000\u001esr\u0000#com.sun.msv.grammar.SimpleName"
+"Class\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\tlocalNamet\u0000\u0012Ljava/lang/String;L\u0000\fnamespac"
+"eURIq\u0000~\u0000 xq\u0000~\u0000\u001bt\u0000-net.sourceforge.czt.z.jaxb.gen.TermA.AnnsT"
+"ypet\u0000+http://java.sun.com/jaxb/xjc/dummy-elementssq\u0000~\u0000\u0007\u0003\u0098v\u00dbp"
+"psq\u0000~\u0000\u0015\u0003\u0098v\u00d0q\u0000~\u0000\u000epsr\u0000\u001bcom.sun.msv.grammar.DataExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L"
+"\u0000\u0002dtt\u0000\u001fLorg/relaxng/datatype/Datatype;L\u0000\u0006exceptq\u0000~\u0000\u0002L\u0000\u0004namet"
+"\u0000\u001dLcom/sun/msv/util/StringPair;xq\u0000~\u0000\u0003\u0001\u00eb\u0090]ppsr\u0000\"com.sun.msv.d"
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
+"//czt.sourceforge.net/zmlq\u0000~\u0000\u001esq\u0000~\u0000\u0007\u001b\u009aX\u00acppsq\u0000~\u0000\u0007\u0019\u00a1\u009b{ppsq\u0000~\u0000\u0007"
+"\u0017\u00a8\u00deJppsq\u0000~\u0000\u0007\u0015\u00b0!\u0019ppsq\u0000~\u0000\u0007\u0013\u00b7c\u00e8ppsq\u0000~\u0000\u0007\u0011\u00be\u00a6\u00b7ppsq\u0000~\u0000\u0007\u000f\u00c5\u00e9\u0086ppsq\u0000~\u0000\u0007"
+"\r\u00cd,Uppsq\u0000~\u0000\u0007\u000b\u00d4o$ppsq\u0000~\u0000\u0007\t\u00db\u00b1\u00f3ppsq\u0000~\u0000\u0007\u0007\u00e2\u00f4\u00c2ppsq\u0000~\u0000\u0007\u0005\u00ea7\u0091ppsq\u0000~\u0000\u0007"
+"\u0003\u00f1z`ppsq\u0000~\u0000\t\u0001\u00f8\u00bd/pp\u0000sq\u0000~\u0000\u0007\u0001\u00f8\u00bd$ppsq\u0000~\u0000\u0012\u0001\u00f8\u00bd\u0019q\u0000~\u0000\u000epsq\u0000~\u0000\u0015\u0001\u00f8\u00bd\u0016q\u0000~"
+"\u0000\u000epq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000.net.sourceforge.czt.oz.jaxb.gen.E"
+"xChoiceOpExprq\u0000~\u0000#sq\u0000~\u0000\t\u0001\u00f8\u00bd/pp\u0000sq\u0000~\u0000\u0007\u0001\u00f8\u00bd$ppsq\u0000~\u0000\u0012\u0001\u00f8\u00bd\u0019q\u0000~\u0000\u000eps"
+"q\u0000~\u0000\u0015\u0001\u00f8\u00bd\u0016q\u0000~\u0000\u000epq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u00003net.sourceforge.czt.o"
+"z.jaxb.gen.RenameOpExprElementq\u0000~\u0000#sq\u0000~\u0000\t\u0001\u00f8\u00bd/pp\u0000sq\u0000~\u0000\u0007\u0001\u00f8\u00bd$pp"
+"sq\u0000~\u0000\u0012\u0001\u00f8\u00bd\u0019q\u0000~\u0000\u000epsq\u0000~\u0000\u0015\u0001\u00f8\u00bd\u0016q\u0000~\u0000\u000epq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000*net."
+"sourceforge.czt.oz.jaxb.gen.ConjOpExprq\u0000~\u0000#sq\u0000~\u0000\t\u0001\u00f8\u00bd/pp\u0000sq\u0000~"
+"\u0000\u0007\u0001\u00f8\u00bd$ppsq\u0000~\u0000\u0012\u0001\u00f8\u00bd\u0019q\u0000~\u0000\u000epsq\u0000~\u0000\u0015\u0001\u00f8\u00bd\u0016q\u0000~\u0000\u000epq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000"
+"\u001ft\u0000.net.sourceforge.czt.oz.jaxb.gen.DistConjOpExprq\u0000~\u0000#sq\u0000~\u0000"
+"\t\u0001\u00f8\u00bd/pp\u0000sq\u0000~\u0000\u0007\u0001\u00f8\u00bd$ppsq\u0000~\u0000\u0012\u0001\u00f8\u00bd\u0019q\u0000~\u0000\u000epsq\u0000~\u0000\u0015\u0001\u00f8\u00bd\u0016q\u0000~\u0000\u000epq\u0000~\u0000\u0018q\u0000~"
+"\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u00002net.sourceforge.czt.oz.jaxb.gen.BasicOpExprE"
+"lementq\u0000~\u0000#sq\u0000~\u0000\t\u0001\u00f8\u00bd/pp\u0000sq\u0000~\u0000\u0007\u0001\u00f8\u00bd$ppsq\u0000~\u0000\u0012\u0001\u00f8\u00bd\u0019q\u0000~\u0000\u000epsq\u0000~\u0000\u0015\u0001\u00f8"
+"\u00bd\u0016q\u0000~\u0000\u000epq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000+net.sourceforge.czt.oz.jaxb."
+"gen.ParenOpExprq\u0000~\u0000#sq\u0000~\u0000\t\u0001\u00f8\u00bd/pp\u0000sq\u0000~\u0000\u0007\u0001\u00f8\u00bd$ppsq\u0000~\u0000\u0012\u0001\u00f8\u00bd\u0019q\u0000~\u0000\u000e"
+"psq\u0000~\u0000\u0015\u0001\u00f8\u00bd\u0016q\u0000~\u0000\u000epq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u00001net.sourceforge.czt"
+".oz.jaxb.gen.ScopeEnrichOpExprq\u0000~\u0000#sq\u0000~\u0000\t\u0001\u00f8\u00bd/pp\u0000sq\u0000~\u0000\u0007\u0001\u00f8\u00bd$pp"
+"sq\u0000~\u0000\u0012\u0001\u00f8\u00bd\u0019q\u0000~\u0000\u000epsq\u0000~\u0000\u0015\u0001\u00f8\u00bd\u0016q\u0000~\u0000\u000epq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000)net."
+"sourceforge.czt.oz.jaxb.gen.SeqOpExprq\u0000~\u0000#sq\u0000~\u0000\t\u0001\u00f8\u00bd/pp\u0000sq\u0000~\u0000"
+"\u0007\u0001\u00f8\u00bd$ppsq\u0000~\u0000\u0012\u0001\u00f8\u00bd\u0019q\u0000~\u0000\u000epsq\u0000~\u0000\u0015\u0001\u00f8\u00bd\u0016q\u0000~\u0000\u000epq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001f"
+"t\u00000net.sourceforge.czt.oz.jaxb.gen.DistChoiceOpExprq\u0000~\u0000#sq\u0000~"
+"\u0000\t\u0001\u00f8\u00bd/pp\u0000sq\u0000~\u0000\u0007\u0001\u00f8\u00bd$ppsq\u0000~\u0000\u0012\u0001\u00f8\u00bd\u0019q\u0000~\u0000\u000epsq\u0000~\u0000\u0015\u0001\u00f8\u00bd\u0016q\u0000~\u0000\u000epq\u0000~\u0000\u0018q\u0000"
+"~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000.net.sourceforge.czt.oz.jaxb.gen.ParallelOpE"
+"xprq\u0000~\u0000#sq\u0000~\u0000\t\u0001\u00f8\u00bd/pp\u0000sq\u0000~\u0000\u0007\u0001\u00f8\u00bd$ppsq\u0000~\u0000\u0012\u0001\u00f8\u00bd\u0019q\u0000~\u0000\u000epsq\u0000~\u0000\u0015\u0001\u00f8\u00bd\u0016q"
+"\u0000~\u0000\u000epq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000-net.sourceforge.czt.oz.jaxb.gen"
+".DistSeqOpExprq\u0000~\u0000#sq\u0000~\u0000\t\u0001\u00f8\u00bd/pp\u0000sq\u0000~\u0000\u0007\u0001\u00f8\u00bd$ppsq\u0000~\u0000\u0012\u0001\u00f8\u00bd\u0019q\u0000~\u0000\u000ep"
+"sq\u0000~\u0000\u0015\u0001\u00f8\u00bd\u0016q\u0000~\u0000\u000epq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u00001net.sourceforge.czt."
+"oz.jaxb.gen.HideOpExprElementq\u0000~\u0000#sq\u0000~\u0000\t\u0001\u00f8\u00bd/pp\u0000sq\u0000~\u0000\u0007\u0001\u00f8\u00bd$pps"
+"q\u0000~\u0000\u0012\u0001\u00f8\u00bd\u0019q\u0000~\u0000\u000epsq\u0000~\u0000\u0015\u0001\u00f8\u00bd\u0016q\u0000~\u0000\u000epq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u00006net.s"
+"ourceforge.czt.oz.jaxb.gen.OpPromotionExprElementq\u0000~\u0000#sq\u0000~\u0000\t"
+"\u0001\u00f8\u00bd/pp\u0000sq\u0000~\u0000\u0007\u0001\u00f8\u00bd$ppsq\u0000~\u0000\u0012\u0001\u00f8\u00bd\u0019q\u0000~\u0000\u000epsq\u0000~\u0000\u0015\u0001\u00f8\u00bd\u0016q\u0000~\u0000\u000epq\u0000~\u0000\u0018q\u0000~\u0000"
+"\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u00002net.sourceforge.czt.oz.jaxb.gen.AssoParallelO"
+"pExprq\u0000~\u0000#sq\u0000~\u0000\u0012\u0007w\u00021ppsq\u0000~\u0000\u0007\u0007w\u0002.ppsq\u0000~\u0000\t\u0001\u00f8\u00bd/pp\u0000sq\u0000~\u0000\u0007\u0001\u00f8\u00bd$pps"
+"q\u0000~\u0000\u0012\u0001\u00f8\u00bd\u0019q\u0000~\u0000\u000epsq\u0000~\u0000\u0015\u0001\u00f8\u00bd\u0016q\u0000~\u0000\u000epq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u00002net.s"
+"ourceforge.czt.z.jaxb.gen.NameNamePairElementq\u0000~\u0000#sq\u0000~\u0000\t\u0005~D\u00fd"
+"pp\u0000sq\u0000~\u0000\u0000\u0005~D\u00f2ppsq\u0000~\u0000\t\u0001\u00f8\u00bd/pp\u0000sq\u0000~\u0000\u0007\u0001\u00f8\u00bd$ppsq\u0000~\u0000\u0012\u0001\u00f8\u00bd\u0019q\u0000~\u0000\u000epsq\u0000~"
+"\u0000\u0015\u0001\u00f8\u00bd\u0016q\u0000~\u0000\u000epq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000+net.sourceforge.czt.z.ja"
+"xb.gen.NameNamePairq\u0000~\u0000#sq\u0000~\u0000\u0007\u0003\u0085\u0087\u00beppsq\u0000~\u0000\u0015\u0003\u0085\u0087\u00b3q\u0000~\u0000\u000epq\u0000~\u0000)sq\u0000"
+"~\u0000\u001fq\u0000~\u0000:q\u0000~\u0000;q\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000\fNameNamePairq\u0000~\u0000>sr\u0000\"com.sun.msv."
+"grammar.ExpressionPool\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\bexpTablet\u0000/Lcom/sun/msv/"
+"grammar/ExpressionPool$ClosedHash;xpsr\u0000-com.sun.msv.grammar."
+"ExpressionPool$ClosedHash\u00d7j\u00d0N\u00ef\u00e8\u00ed\u001c\u0002\u0000\u0004I\u0000\u0005countI\u0000\tthresholdL\u0000\u0006p"
+"arentq\u0000~\u0000\u00b6[\u0000\u0005tablet\u0000![Lcom/sun/msv/grammar/Expression;xp\u0000\u0000\u00008"
+"\u0000\u0000\u00009pur\u0000![Lcom.sun.msv.grammar.Expression;\u00d68D\u00c3]\u00ad\u00a7\n\u0002\u0000\u0000xp\u0000\u0000\u0000\u00bfp"
+"pppppppq\u0000~\u0000\u00a1ppq\u0000~\u0000Iq\u0000~\u0000\u00a0ppppq\u0000~\u0000$ppppppq\u0000~\u0000Eppq\u0000~\u0000\u0014q\u0000~\u0000Nq\u0000~\u0000"
+"Tq\u0000~\u0000Zq\u0000~\u0000`q\u0000~\u0000fq\u0000~\u0000lq\u0000~\u0000rq\u0000~\u0000xq\u0000~\u0000~q\u0000~\u0000\u0084q\u0000~\u0000\u0011q\u0000~\u0000Mq\u0000~\u0000Sq\u0000~\u0000"
+"Yq\u0000~\u0000_q\u0000~\u0000eq\u0000~\u0000kq\u0000~\u0000qq\u0000~\u0000wq\u0000~\u0000}q\u0000~\u0000\u0083q\u0000~\u0000\u008aq\u0000~\u0000\u0089q\u0000~\u0000\u0090q\u0000~\u0000\u008fq\u0000~\u0000"
+"Aq\u0000~\u0000\u0096q\u0000~\u0000\u0095q\u0000~\u0000\u009cq\u0000~\u0000\u009bq\u0000~\u0000\u0006q\u0000~\u0000\u00a4q\u0000~\u0000\u00a3q\u0000~\u0000\u00acq\u0000~\u0000Hq\u0000~\u0000\u00abq\u0000~\u0000\u0005pppp"
+"ppq\u0000~\u0000\u000fpppq\u0000~\u0000Dpppppppq\u0000~\u0000\u00b0ppppq\u0000~\u0000@ppppq\u0000~\u0000\bppppppq\u0000~\u0000Kpppp"
+"ppppppppq\u0000~\u0000Gppppppppppppq\u0000~\u0000Cppppppppppq\u0000~\u0000\u00a9pq\u0000~\u0000?ppppppppp"
+"ppq\u0000~\u0000Jppppppppppppq\u0000~\u0000Fppppppppppppq\u0000~\u0000Bppppppppppppp"));
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
            return net.sourceforge.czt.oz.jaxb.gen.impl.RenameOpExprImpl.this;
        }

        public void enterElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname, org.xml.sax.Attributes __atts)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  1 :
                        if (("ExChoiceOpExpr" == ___local)&&("http://czt.sourceforge.net/object-z" == ___uri)) {
                            _OperationExpr = ((net.sourceforge.czt.oz.jaxb.gen.impl.ExChoiceOpExprImpl) spawnChildFromEnterElement((net.sourceforge.czt.oz.jaxb.gen.impl.ExChoiceOpExprImpl.class), 2, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("RenameOpExpr" == ___local)&&("http://czt.sourceforge.net/object-z" == ___uri)) {
                            _OperationExpr = ((net.sourceforge.czt.oz.jaxb.gen.impl.RenameOpExprElementImpl) spawnChildFromEnterElement((net.sourceforge.czt.oz.jaxb.gen.impl.RenameOpExprElementImpl.class), 2, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("ConjOpExpr" == ___local)&&("http://czt.sourceforge.net/object-z" == ___uri)) {
                            _OperationExpr = ((net.sourceforge.czt.oz.jaxb.gen.impl.ConjOpExprImpl) spawnChildFromEnterElement((net.sourceforge.czt.oz.jaxb.gen.impl.ConjOpExprImpl.class), 2, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("DistConjOpExpr" == ___local)&&("http://czt.sourceforge.net/object-z" == ___uri)) {
                            _OperationExpr = ((net.sourceforge.czt.oz.jaxb.gen.impl.DistConjOpExprImpl) spawnChildFromEnterElement((net.sourceforge.czt.oz.jaxb.gen.impl.DistConjOpExprImpl.class), 2, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("BasicOpExpr" == ___local)&&("http://czt.sourceforge.net/object-z" == ___uri)) {
                            _OperationExpr = ((net.sourceforge.czt.oz.jaxb.gen.impl.BasicOpExprElementImpl) spawnChildFromEnterElement((net.sourceforge.czt.oz.jaxb.gen.impl.BasicOpExprElementImpl.class), 2, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("ParenOpExpr" == ___local)&&("http://czt.sourceforge.net/object-z" == ___uri)) {
                            _OperationExpr = ((net.sourceforge.czt.oz.jaxb.gen.impl.ParenOpExprImpl) spawnChildFromEnterElement((net.sourceforge.czt.oz.jaxb.gen.impl.ParenOpExprImpl.class), 2, ___uri, ___local, ___qname, __atts));
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
                        if (("DistChoiceOpExpr" == ___local)&&("http://czt.sourceforge.net/object-z" == ___uri)) {
                            _OperationExpr = ((net.sourceforge.czt.oz.jaxb.gen.impl.DistChoiceOpExprImpl) spawnChildFromEnterElement((net.sourceforge.czt.oz.jaxb.gen.impl.DistChoiceOpExprImpl.class), 2, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("ParallelOpExpr" == ___local)&&("http://czt.sourceforge.net/object-z" == ___uri)) {
                            _OperationExpr = ((net.sourceforge.czt.oz.jaxb.gen.impl.ParallelOpExprImpl) spawnChildFromEnterElement((net.sourceforge.czt.oz.jaxb.gen.impl.ParallelOpExprImpl.class), 2, ___uri, ___local, ___qname, __atts));
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
                        if (("OpPromotionExpr" == ___local)&&("http://czt.sourceforge.net/object-z" == ___uri)) {
                            _OperationExpr = ((net.sourceforge.czt.oz.jaxb.gen.impl.OpPromotionExprElementImpl) spawnChildFromEnterElement((net.sourceforge.czt.oz.jaxb.gen.impl.OpPromotionExprElementImpl.class), 2, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("AssoParallelOpExpr" == ___local)&&("http://czt.sourceforge.net/object-z" == ___uri)) {
                            _OperationExpr = ((net.sourceforge.czt.oz.jaxb.gen.impl.AssoParallelOpExprImpl) spawnChildFromEnterElement((net.sourceforge.czt.oz.jaxb.gen.impl.AssoParallelOpExprImpl.class), 2, ___uri, ___local, ___qname, __atts));
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
                    case  3 :
                        if (("OldName" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _NameNamePair.add(((net.sourceforge.czt.z.jaxb.gen.impl.NameNamePairImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.NameNamePairImpl.class), 4, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        break;
                    case  5 :
                        if (("NameNamePair" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 3;
                            return ;
                        }
                        if (("NameNamePair" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _NameNamePair.add(((net.sourceforge.czt.z.jaxb.gen.impl.NameNamePairElementImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.NameNamePairElementImpl.class), 5, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        revertToParentFromEnterElement(___uri, ___local, ___qname, __atts);
                        return ;
                    case  6 :
                        if (("Anns" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _OperationExpr = ((net.sourceforge.czt.oz.jaxb.gen.impl.OperationExprImpl) spawnChildFromEnterElement((net.sourceforge.czt.oz.jaxb.gen.impl.OperationExprImpl.class), 7, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        _OperationExpr = ((net.sourceforge.czt.oz.jaxb.gen.impl.OperationExprImpl) spawnChildFromEnterElement((net.sourceforge.czt.oz.jaxb.gen.impl.OperationExprImpl.class), 7, ___uri, ___local, ___qname, __atts));
                        return ;
                    case  0 :
                        if (("Anns" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.oz.jaxb.gen.impl.OperationExprImpl)net.sourceforge.czt.oz.jaxb.gen.impl.RenameOpExprImpl.this).new Unmarshaller(context)), 1, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        spawnHandlerFromEnterElement((((net.sourceforge.czt.oz.jaxb.gen.impl.OperationExprImpl)net.sourceforge.czt.oz.jaxb.gen.impl.RenameOpExprImpl.this).new Unmarshaller(context)), 1, ___uri, ___local, ___qname, __atts);
                        return ;
                    case  2 :
                        if (("NameNamePair" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 3;
                            return ;
                        }
                        if (("NameNamePair" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _NameNamePair.add(((net.sourceforge.czt.z.jaxb.gen.impl.NameNamePairElementImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.NameNamePairElementImpl.class), 5, ___uri, ___local, ___qname, __atts)));
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
                    case  4 :
                        if (("NameNamePair" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            context.popAttributes();
                            state = 5;
                            return ;
                        }
                        break;
                    case  5 :
                        revertToParentFromLeaveElement(___uri, ___local, ___qname);
                        return ;
                    case  7 :
                        if (("OperationExpr" == ___local)&&("http://czt.sourceforge.net/object-z" == ___uri)) {
                            context.popAttributes();
                            state = 2;
                            return ;
                        }
                        break;
                    case  6 :
                        _OperationExpr = ((net.sourceforge.czt.oz.jaxb.gen.impl.OperationExprImpl) spawnChildFromLeaveElement((net.sourceforge.czt.oz.jaxb.gen.impl.OperationExprImpl.class), 7, ___uri, ___local, ___qname));
                        return ;
                    case  0 :
                        spawnHandlerFromLeaveElement((((net.sourceforge.czt.oz.jaxb.gen.impl.OperationExprImpl)net.sourceforge.czt.oz.jaxb.gen.impl.RenameOpExprImpl.this).new Unmarshaller(context)), 1, ___uri, ___local, ___qname);
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
                    case  0 :
                        spawnHandlerFromEnterAttribute((((net.sourceforge.czt.oz.jaxb.gen.impl.OperationExprImpl)net.sourceforge.czt.oz.jaxb.gen.impl.RenameOpExprImpl.this).new Unmarshaller(context)), 1, ___uri, ___local, ___qname);
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
                    case  0 :
                        spawnHandlerFromLeaveAttribute((((net.sourceforge.czt.oz.jaxb.gen.impl.OperationExprImpl)net.sourceforge.czt.oz.jaxb.gen.impl.RenameOpExprImpl.this).new Unmarshaller(context)), 1, ___uri, ___local, ___qname);
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
                        case  0 :
                            spawnHandlerFromText((((net.sourceforge.czt.oz.jaxb.gen.impl.OperationExprImpl)net.sourceforge.czt.oz.jaxb.gen.impl.RenameOpExprImpl.this).new Unmarshaller(context)), 1, value);
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
