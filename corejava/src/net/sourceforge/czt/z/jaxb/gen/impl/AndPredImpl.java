//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.2-b15-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2004.01.29 at 12:59:34 NZDT 
//


package net.sourceforge.czt.z.jaxb.gen.impl;

public class AndPredImpl
    extends net.sourceforge.czt.z.jaxb.gen.impl.Pred2Impl
    implements net.sourceforge.czt.z.jaxb.gen.AndPred, com.sun.xml.bind.JAXBObject, net.sourceforge.czt.oz.jaxb.gen.impl.runtime.UnmarshallableObject, net.sourceforge.czt.oz.jaxb.gen.impl.runtime.XMLSerializable, net.sourceforge.czt.oz.jaxb.gen.impl.runtime.ValidatableObject
{

    protected java.lang.String _Op;
    public final static java.lang.Class version = (net.sourceforge.czt.z.jaxb.gen.impl.JAXBVersion.class);
    private static com.sun.msv.grammar.Grammar schemaFragment;

    private final static java.lang.Class PRIMARY_INTERFACE_CLASS() {
        return (net.sourceforge.czt.z.jaxb.gen.AndPred.class);
    }

    public java.lang.String getOp() {
        if (_Op == null) {
            return "And";
        } else {
            return _Op;
        }
    }

    public void setOp(java.lang.String value) {
        _Op = value;
    }

    public net.sourceforge.czt.oz.jaxb.gen.impl.runtime.UnmarshallingEventHandler createUnmarshaller(net.sourceforge.czt.oz.jaxb.gen.impl.runtime.UnmarshallingContext context) {
        return new net.sourceforge.czt.z.jaxb.gen.impl.AndPredImpl.Unmarshaller(context);
    }

    public void serializeBody(net.sourceforge.czt.oz.jaxb.gen.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        super.serializeBody(context);
    }

    public void serializeAttributes(net.sourceforge.czt.oz.jaxb.gen.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        if (_Op!= null) {
            context.startAttribute("", "Op");
            try {
                context.text(((java.lang.String) _Op), "Op");
            } catch (java.lang.Exception e) {
                net.sourceforge.czt.oz.jaxb.gen.impl.runtime.Util.handlePrintConversionException(this, e, context);
            }
            context.endAttribute();
        }
        super.serializeAttributes(context);
    }

    public void serializeURIs(net.sourceforge.czt.oz.jaxb.gen.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        super.serializeURIs(context);
    }

    public java.lang.Class getPrimaryInterface() {
        return (net.sourceforge.czt.z.jaxb.gen.AndPred.class);
    }

    public com.sun.msv.verifier.DocumentDeclaration createRawValidator() {
        if (schemaFragment == null) {
            schemaFragment = com.sun.xml.bind.validator.SchemaDeserializer.deserialize((
 "\u00ac\u00ed\u0000\u0005sr\u0000\u001fcom.sun.msv.grammar.SequenceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.su"
+"n.msv.grammar.BinaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0004exp1t\u0000 Lcom/sun/msv/gra"
+"mmar/Expression;L\u0000\u0004exp2q\u0000~\u0000\u0002xr\u0000\u001ecom.sun.msv.grammar.Expressi"
+"on\u00f8\u0018\u0082\u00e8N5~O\u0002\u0000\u0003I\u0000\u000ecachedHashCodeL\u0000\u0013epsilonReducibilityt\u0000\u0013Ljava"
+"/lang/Boolean;L\u0000\u000bexpandedExpq\u0000~\u0000\u0002xpFp\u0086\u0000ppsq\u0000~\u0000\u0000D\u0002\u008b\u00bbppsq\u0000~\u0000\u0000$"
+"v\u00b8\u00a8ppsr\u0000\u001dcom.sun.msv.grammar.ChoiceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0001\u0004\u00ea\u00e5\u0095p"
+"psr\u0000\'com.sun.msv.grammar.trex.ElementPattern\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\tna"
+"meClasst\u0000\u001fLcom/sun/msv/grammar/NameClass;xr\u0000\u001ecom.sun.msv.gra"
+"mmar.ElementExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002Z\u0000\u001aignoreUndeclaredAttributesL\u0000\fco"
+"ntentModelq\u0000~\u0000\u0002xq\u0000~\u0000\u0003\u0004\u00ea\u00e5\u008asr\u0000\u0011java.lang.Boolean\u00cd r\u0080\u00d5\u009c\u00fa\u00ee\u0002\u0000\u0001Z\u0000\u0005"
+"valuexp\u0000p\u0000sq\u0000~\u0000\u0000\u0004\u00ea\u00e5\u007fppsq\u0000~\u0000\n\u0001\u00f8\u00bd/pp\u0000sq\u0000~\u0000\b\u0001\u00f8\u00bd$ppsr\u0000 com.sun.m"
+"sv.grammar.OneOrMoreExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001ccom.sun.msv.grammar.Un"
+"aryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\u0003expq\u0000~\u0000\u0002xq\u0000~\u0000\u0003\u0001\u00f8\u00bd\u0019q\u0000~\u0000\u000fpsr\u0000 com.sun.msv."
+"grammar.AttributeExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003expq\u0000~\u0000\u0002L\u0000\tnameClassq\u0000~\u0000\u000bx"
+"q\u0000~\u0000\u0003\u0001\u00f8\u00bd\u0016q\u0000~\u0000\u000fpsr\u00002com.sun.msv.grammar.Expression$AnyStringE"
+"xpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003\u0000\u0000\u0000\bsq\u0000~\u0000\u000e\u0001q\u0000~\u0000\u0019sr\u0000 com.sun.msv.gr"
+"ammar.AnyNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun.msv.grammar.NameCla"
+"ss\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com.sun.msv.grammar.Expression$EpsilonExp"
+"ression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003\u0000\u0000\u0000\tq\u0000~\u0000\u001aq\u0000~\u0000\u001fsr\u0000#com.sun.msv.gramma"
+"r.SimpleNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\tlocalNamet\u0000\u0012Ljava/lang/String"
+";L\u0000\fnamespaceURIq\u0000~\u0000!xq\u0000~\u0000\u001ct\u0000-net.sourceforge.czt.z.jaxb.gen"
+".TermA.AnnsTypet\u0000+http://java.sun.com/jaxb/xjc/dummy-element"
+"ssq\u0000~\u0000\b\u0002\u00f2(Kppsq\u0000~\u0000\u0016\u0002\u00f2(@q\u0000~\u0000\u000fpsr\u0000\u001bcom.sun.msv.grammar.DataExp"
+"\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\u0002dtt\u0000\u001fLorg/relaxng/datatype/Datatype;L\u0000\u0006exceptq"
+"\u0000~\u0000\u0002L\u0000\u0004namet\u0000\u001dLcom/sun/msv/util/StringPair;xq\u0000~\u0000\u0003\u0001\u00eb\u0090]ppsr\u0000\"c"
+"om.sun.msv.datatype.xsd.QnameType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000*com.sun.msv."
+"datatype.xsd.BuiltinAtomicType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000%com.sun.msv.dat"
+"atype.xsd.ConcreteType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\'com.sun.msv.datatype.xs"
+"d.XSDatatypeImpl\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\fnamespaceUriq\u0000~\u0000!L\u0000\btypeNameq\u0000"
+"~\u0000!L\u0000\nwhiteSpacet\u0000.Lcom/sun/msv/datatype/xsd/WhiteSpaceProce"
+"ssor;xpt\u0000 http://www.w3.org/2001/XMLSchemat\u0000\u0005QNamesr\u00005com.su"
+"n.msv.datatype.xsd.WhiteSpaceProcessor$Collapse\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr"
+"\u0000,com.sun.msv.datatype.xsd.WhiteSpaceProcessor\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xps"
+"r\u00000com.sun.msv.grammar.Expression$NullSetExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002"
+"\u0000\u0000xq\u0000~\u0000\u0003\u0000\u0000\u0000\nq\u0000~\u0000\u000fpsr\u0000\u001bcom.sun.msv.util.StringPair\u00d0t\u001ejB\u008f\u008d\u00a0\u0002\u0000\u0002"
+"L\u0000\tlocalNameq\u0000~\u0000!L\u0000\fnamespaceURIq\u0000~\u0000!xpq\u0000~\u00002q\u0000~\u00001sq\u0000~\u0000 t\u0000\u0004ty"
+"pet\u0000)http://www.w3.org/2001/XMLSchema-instanceq\u0000~\u0000\u001fsq\u0000~\u0000 t\u0000\u0004"
+"Annst\u0000\u001ehttp://czt.sourceforge.net/zmlq\u0000~\u0000\u001fsq\u0000~\u0000\b\u001f\u008b\u00d3\u000eppsq\u0000~\u0000\b"
+"\u001d\u0093\u0015\u00ddppsq\u0000~\u0000\b\u001b\u009aX\u00acppsq\u0000~\u0000\b\u0019\u00a1\u009b{ppsq\u0000~\u0000\b\u0017\u00a8\u00deJppsq\u0000~\u0000\b\u0015\u00b0!\u0019ppsq\u0000~\u0000\b"
+"\u0013\u00b7c\u00e8ppsq\u0000~\u0000\b\u0011\u00be\u00a6\u00b7ppsq\u0000~\u0000\b\u000f\u00c5\u00e9\u0086ppsq\u0000~\u0000\b\r\u00cd,Uppsq\u0000~\u0000\b\u000b\u00d4o$ppsq\u0000~\u0000\b"
+"\t\u00db\u00b1\u00f3ppsq\u0000~\u0000\b\u0007\u00e2\u00f4\u00c2ppsq\u0000~\u0000\b\u0005\u00ea7\u0091ppsq\u0000~\u0000\b\u0003\u00f1z`ppsq\u0000~\u0000\n\u0001\u00f8\u00bd/pp\u0000sq\u0000~\u0000"
+"\b\u0001\u00f8\u00bd$ppsq\u0000~\u0000\u0013\u0001\u00f8\u00bd\u0019q\u0000~\u0000\u000fpsq\u0000~\u0000\u0016\u0001\u00f8\u00bd\u0016q\u0000~\u0000\u000fpq\u0000~\u0000\u0019q\u0000~\u0000\u001dq\u0000~\u0000\u001fsq\u0000~\u0000 "
+"t\u0000(net.sourceforge.czt.z.jaxb.gen.FalsePredq\u0000~\u0000$sq\u0000~\u0000\n\u0001\u00f8\u00bd/pp"
+"\u0000sq\u0000~\u0000\b\u0001\u00f8\u00bd$ppsq\u0000~\u0000\u0013\u0001\u00f8\u00bd\u0019q\u0000~\u0000\u000fpsq\u0000~\u0000\u0016\u0001\u00f8\u00bd\u0016q\u0000~\u0000\u000fpq\u0000~\u0000\u0019q\u0000~\u0000\u001dq\u0000~\u0000\u001f"
+"sq\u0000~\u0000 t\u0000-net.sourceforge.czt.z.jaxb.gen.NegPredElementq\u0000~\u0000$s"
+"q\u0000~\u0000\n\u0001\u00f8\u00bd/pp\u0000sq\u0000~\u0000\b\u0001\u00f8\u00bd$ppsq\u0000~\u0000\u0013\u0001\u00f8\u00bd\u0019q\u0000~\u0000\u000fpsq\u0000~\u0000\u0016\u0001\u00f8\u00bd\u0016q\u0000~\u0000\u000fpq\u0000~\u0000"
+"\u0019q\u0000~\u0000\u001dq\u0000~\u0000\u001fsq\u0000~\u0000 t\u0000*net.sourceforge.czt.z.jaxb.gen.FactEleme"
+"ntq\u0000~\u0000$sq\u0000~\u0000\n\u0001\u00f8\u00bd/pp\u0000sq\u0000~\u0000\b\u0001\u00f8\u00bd$ppsq\u0000~\u0000\u0013\u0001\u00f8\u00bd\u0019q\u0000~\u0000\u000fpsq\u0000~\u0000\u0016\u0001\u00f8\u00bd\u0016q\u0000"
+"~\u0000\u000fpq\u0000~\u0000\u0019q\u0000~\u0000\u001dq\u0000~\u0000\u001fsq\u0000~\u0000 t\u0000*net.sourceforge.czt.z.jaxb.gen.I"
+"mpliesPredq\u0000~\u0000$sq\u0000~\u0000\n\u0001\u00f8\u00bd/pp\u0000sq\u0000~\u0000\b\u0001\u00f8\u00bd$ppsq\u0000~\u0000\u0013\u0001\u00f8\u00bd\u0019q\u0000~\u0000\u000fpsq\u0000~"
+"\u0000\u0016\u0001\u00f8\u00bd\u0016q\u0000~\u0000\u000fpq\u0000~\u0000\u0019q\u0000~\u0000\u001dq\u0000~\u0000\u001fsq\u0000~\u0000 t\u0000\'net.sourceforge.czt.z.ja"
+"xb.gen.TruePredq\u0000~\u0000$sq\u0000~\u0000\n\u0001\u00f8\u00bd/pp\u0000sq\u0000~\u0000\b\u0001\u00f8\u00bd$ppsq\u0000~\u0000\u0013\u0001\u00f8\u00bd\u0019q\u0000~\u0000\u000f"
+"psq\u0000~\u0000\u0016\u0001\u00f8\u00bd\u0016q\u0000~\u0000\u000fpq\u0000~\u0000\u0019q\u0000~\u0000\u001dq\u0000~\u0000\u001fsq\u0000~\u0000 t\u0000-net.sourceforge.czt"
+".z.jaxb.gen.QntPredElementq\u0000~\u0000$sq\u0000~\u0000\n\u0001\u00f8\u00bd/pp\u0000sq\u0000~\u0000\b\u0001\u00f8\u00bd$ppsq\u0000~"
+"\u0000\u0013\u0001\u00f8\u00bd\u0019q\u0000~\u0000\u000fpsq\u0000~\u0000\u0016\u0001\u00f8\u00bd\u0016q\u0000~\u0000\u000fpq\u0000~\u0000\u0019q\u0000~\u0000\u001dq\u0000~\u0000\u001fsq\u0000~\u0000 t\u0000-net.sour"
+"ceforge.czt.z.jaxb.gen.MemPredElementq\u0000~\u0000$sq\u0000~\u0000\n\u0001\u00f8\u00bd/pp\u0000sq\u0000~\u0000"
+"\b\u0001\u00f8\u00bd$ppsq\u0000~\u0000\u0013\u0001\u00f8\u00bd\u0019q\u0000~\u0000\u000fpsq\u0000~\u0000\u0016\u0001\u00f8\u00bd\u0016q\u0000~\u0000\u000fpq\u0000~\u0000\u0019q\u0000~\u0000\u001dq\u0000~\u0000\u001fsq\u0000~\u0000 "
+"t\u0000%net.sourceforge.czt.z.jaxb.gen.OrPredq\u0000~\u0000$sq\u0000~\u0000\n\u0001\u00f8\u00bd/pp\u0000sq"
+"\u0000~\u0000\b\u0001\u00f8\u00bd$ppsq\u0000~\u0000\u0013\u0001\u00f8\u00bd\u0019q\u0000~\u0000\u000fpsq\u0000~\u0000\u0016\u0001\u00f8\u00bd\u0016q\u0000~\u0000\u000fpq\u0000~\u0000\u0019q\u0000~\u0000\u001dq\u0000~\u0000\u001fsq\u0000"
+"~\u0000 t\u0000)net.sourceforge.czt.z.jaxb.gen.ExistsPredq\u0000~\u0000$sq\u0000~\u0000\n\u0001\u00f8"
+"\u00bd/pp\u0000sq\u0000~\u0000\b\u0001\u00f8\u00bd$ppsq\u0000~\u0000\u0013\u0001\u00f8\u00bd\u0019q\u0000~\u0000\u000fpsq\u0000~\u0000\u0016\u0001\u00f8\u00bd\u0016q\u0000~\u0000\u000fpq\u0000~\u0000\u0019q\u0000~\u0000\u001dq"
+"\u0000~\u0000\u001fsq\u0000~\u0000 t\u0000+net.sourceforge.czt.z.jaxb.gen.Pred2Elementq\u0000~\u0000"
+"$sq\u0000~\u0000\n\u0001\u00f8\u00bd/pp\u0000sq\u0000~\u0000\b\u0001\u00f8\u00bd$ppsq\u0000~\u0000\u0013\u0001\u00f8\u00bd\u0019q\u0000~\u0000\u000fpsq\u0000~\u0000\u0016\u0001\u00f8\u00bd\u0016q\u0000~\u0000\u000fpq\u0000"
+"~\u0000\u0019q\u0000~\u0000\u001dq\u0000~\u0000\u001fsq\u0000~\u0000 t\u0000*net.sourceforge.czt.z.jaxb.gen.Exists1"
+"Predq\u0000~\u0000$sq\u0000~\u0000\n\u0001\u00f8\u00bd/pp\u0000sq\u0000~\u0000\b\u0001\u00f8\u00bd$ppsq\u0000~\u0000\u0013\u0001\u00f8\u00bd\u0019q\u0000~\u0000\u000fpsq\u0000~\u0000\u0016\u0001\u00f8\u00bd\u0016"
+"q\u0000~\u0000\u000fpq\u0000~\u0000\u0019q\u0000~\u0000\u001dq\u0000~\u0000\u001fsq\u0000~\u0000 t\u0000-net.sourceforge.czt.z.jaxb.gen"
+".AndPredElementq\u0000~\u0000$sq\u0000~\u0000\n\u0001\u00f8\u00bd/pp\u0000sq\u0000~\u0000\b\u0001\u00f8\u00bd$ppsq\u0000~\u0000\u0013\u0001\u00f8\u00bd\u0019q\u0000~\u0000\u000f"
+"psq\u0000~\u0000\u0016\u0001\u00f8\u00bd\u0016q\u0000~\u0000\u000fpq\u0000~\u0000\u0019q\u0000~\u0000\u001dq\u0000~\u0000\u001fsq\u0000~\u0000 t\u0000&net.sourceforge.czt"
+".z.jaxb.gen.IffPredq\u0000~\u0000$sq\u0000~\u0000\n\u0001\u00f8\u00bd/pp\u0000sq\u0000~\u0000\b\u0001\u00f8\u00bd$ppsq\u0000~\u0000\u0013\u0001\u00f8\u00bd\u0019q"
+"\u0000~\u0000\u000fpsq\u0000~\u0000\u0016\u0001\u00f8\u00bd\u0016q\u0000~\u0000\u000fpq\u0000~\u0000\u0019q\u0000~\u0000\u001dq\u0000~\u0000\u001fsq\u0000~\u0000 t\u00003net.sourceforge"
+".czt.zpatt.jaxb.gen.JokerPredElementq\u0000~\u0000$sq\u0000~\u0000\n\u0001\u00f8\u00bd/pp\u0000sq\u0000~\u0000\b"
+"\u0001\u00f8\u00bd$ppsq\u0000~\u0000\u0013\u0001\u00f8\u00bd\u0019q\u0000~\u0000\u000fpsq\u0000~\u0000\u0016\u0001\u00f8\u00bd\u0016q\u0000~\u0000\u000fpq\u0000~\u0000\u0019q\u0000~\u0000\u001dq\u0000~\u0000\u001fsq\u0000~\u0000 t"
+"\u0000.net.sourceforge.czt.z.jaxb.gen.ExprPredElementq\u0000~\u0000$sq\u0000~\u0000\n\u0001"
+"\u00f8\u00bd/pp\u0000sq\u0000~\u0000\b\u0001\u00f8\u00bd$ppsq\u0000~\u0000\u0013\u0001\u00f8\u00bd\u0019q\u0000~\u0000\u000fpsq\u0000~\u0000\u0016\u0001\u00f8\u00bd\u0016q\u0000~\u0000\u000fpq\u0000~\u0000\u0019q\u0000~\u0000\u001d"
+"q\u0000~\u0000\u001fsq\u0000~\u0000 t\u0000)net.sourceforge.czt.z.jaxb.gen.ForallPredq\u0000~\u0000$"
+"sq\u0000~\u0000\b\u001f\u008b\u00d3\u000eppsq\u0000~\u0000\b\u001d\u0093\u0015\u00ddppsq\u0000~\u0000\b\u001b\u009aX\u00acppsq\u0000~\u0000\b\u0019\u00a1\u009b{ppsq\u0000~\u0000\b\u0017\u00a8\u00deJpp"
+"sq\u0000~\u0000\b\u0015\u00b0!\u0019ppsq\u0000~\u0000\b\u0013\u00b7c\u00e8ppsq\u0000~\u0000\b\u0011\u00be\u00a6\u00b7ppsq\u0000~\u0000\b\u000f\u00c5\u00e9\u0086ppsq\u0000~\u0000\b\r\u00cd,Upp"
+"sq\u0000~\u0000\b\u000b\u00d4o$ppsq\u0000~\u0000\b\t\u00db\u00b1\u00f3ppsq\u0000~\u0000\b\u0007\u00e2\u00f4\u00c2ppsq\u0000~\u0000\b\u0005\u00ea7\u0091ppsq\u0000~\u0000\b\u0003\u00f1z`pp"
+"sq\u0000~\u0000\n\u0001\u00f8\u00bd/pp\u0000sq\u0000~\u0000\b\u0001\u00f8\u00bd$ppsq\u0000~\u0000\u0013\u0001\u00f8\u00bd\u0019q\u0000~\u0000\u000fpsq\u0000~\u0000\u0016\u0001\u00f8\u00bd\u0016q\u0000~\u0000\u000fpq\u0000~"
+"\u0000\u0019q\u0000~\u0000\u001dq\u0000~\u0000\u001fsq\u0000~\u0000 q\u0000~\u0000Tq\u0000~\u0000$sq\u0000~\u0000\n\u0001\u00f8\u00bd/pp\u0000sq\u0000~\u0000\b\u0001\u00f8\u00bd$ppsq\u0000~\u0000\u0013\u0001"
+"\u00f8\u00bd\u0019q\u0000~\u0000\u000fpsq\u0000~\u0000\u0016\u0001\u00f8\u00bd\u0016q\u0000~\u0000\u000fpq\u0000~\u0000\u0019q\u0000~\u0000\u001dq\u0000~\u0000\u001fsq\u0000~\u0000 q\u0000~\u0000Zq\u0000~\u0000$sq\u0000~"
+"\u0000\n\u0001\u00f8\u00bd/pp\u0000sq\u0000~\u0000\b\u0001\u00f8\u00bd$ppsq\u0000~\u0000\u0013\u0001\u00f8\u00bd\u0019q\u0000~\u0000\u000fpsq\u0000~\u0000\u0016\u0001\u00f8\u00bd\u0016q\u0000~\u0000\u000fpq\u0000~\u0000\u0019q\u0000"
+"~\u0000\u001dq\u0000~\u0000\u001fsq\u0000~\u0000 q\u0000~\u0000`q\u0000~\u0000$sq\u0000~\u0000\n\u0001\u00f8\u00bd/pp\u0000sq\u0000~\u0000\b\u0001\u00f8\u00bd$ppsq\u0000~\u0000\u0013\u0001\u00f8\u00bd\u0019q"
+"\u0000~\u0000\u000fpsq\u0000~\u0000\u0016\u0001\u00f8\u00bd\u0016q\u0000~\u0000\u000fpq\u0000~\u0000\u0019q\u0000~\u0000\u001dq\u0000~\u0000\u001fsq\u0000~\u0000 q\u0000~\u0000fq\u0000~\u0000$sq\u0000~\u0000\n\u0001\u00f8"
+"\u00bd/pp\u0000sq\u0000~\u0000\b\u0001\u00f8\u00bd$ppsq\u0000~\u0000\u0013\u0001\u00f8\u00bd\u0019q\u0000~\u0000\u000fpsq\u0000~\u0000\u0016\u0001\u00f8\u00bd\u0016q\u0000~\u0000\u000fpq\u0000~\u0000\u0019q\u0000~\u0000\u001dq"
+"\u0000~\u0000\u001fsq\u0000~\u0000 q\u0000~\u0000lq\u0000~\u0000$sq\u0000~\u0000\n\u0001\u00f8\u00bd/pp\u0000sq\u0000~\u0000\b\u0001\u00f8\u00bd$ppsq\u0000~\u0000\u0013\u0001\u00f8\u00bd\u0019q\u0000~\u0000\u000f"
+"psq\u0000~\u0000\u0016\u0001\u00f8\u00bd\u0016q\u0000~\u0000\u000fpq\u0000~\u0000\u0019q\u0000~\u0000\u001dq\u0000~\u0000\u001fsq\u0000~\u0000 q\u0000~\u0000rq\u0000~\u0000$sq\u0000~\u0000\n\u0001\u00f8\u00bd/pp"
+"\u0000sq\u0000~\u0000\b\u0001\u00f8\u00bd$ppsq\u0000~\u0000\u0013\u0001\u00f8\u00bd\u0019q\u0000~\u0000\u000fpsq\u0000~\u0000\u0016\u0001\u00f8\u00bd\u0016q\u0000~\u0000\u000fpq\u0000~\u0000\u0019q\u0000~\u0000\u001dq\u0000~\u0000\u001f"
+"sq\u0000~\u0000 q\u0000~\u0000xq\u0000~\u0000$sq\u0000~\u0000\n\u0001\u00f8\u00bd/pp\u0000sq\u0000~\u0000\b\u0001\u00f8\u00bd$ppsq\u0000~\u0000\u0013\u0001\u00f8\u00bd\u0019q\u0000~\u0000\u000fpsq\u0000"
+"~\u0000\u0016\u0001\u00f8\u00bd\u0016q\u0000~\u0000\u000fpq\u0000~\u0000\u0019q\u0000~\u0000\u001dq\u0000~\u0000\u001fsq\u0000~\u0000 q\u0000~\u0000~q\u0000~\u0000$sq\u0000~\u0000\n\u0001\u00f8\u00bd/pp\u0000sq\u0000"
+"~\u0000\b\u0001\u00f8\u00bd$ppsq\u0000~\u0000\u0013\u0001\u00f8\u00bd\u0019q\u0000~\u0000\u000fpsq\u0000~\u0000\u0016\u0001\u00f8\u00bd\u0016q\u0000~\u0000\u000fpq\u0000~\u0000\u0019q\u0000~\u0000\u001dq\u0000~\u0000\u001fsq\u0000~"
+"\u0000 q\u0000~\u0000\u0084q\u0000~\u0000$sq\u0000~\u0000\n\u0001\u00f8\u00bd/pp\u0000sq\u0000~\u0000\b\u0001\u00f8\u00bd$ppsq\u0000~\u0000\u0013\u0001\u00f8\u00bd\u0019q\u0000~\u0000\u000fpsq\u0000~\u0000\u0016\u0001"
+"\u00f8\u00bd\u0016q\u0000~\u0000\u000fpq\u0000~\u0000\u0019q\u0000~\u0000\u001dq\u0000~\u0000\u001fsq\u0000~\u0000 q\u0000~\u0000\u008aq\u0000~\u0000$sq\u0000~\u0000\n\u0001\u00f8\u00bd/pp\u0000sq\u0000~\u0000\b\u0001"
+"\u00f8\u00bd$ppsq\u0000~\u0000\u0013\u0001\u00f8\u00bd\u0019q\u0000~\u0000\u000fpsq\u0000~\u0000\u0016\u0001\u00f8\u00bd\u0016q\u0000~\u0000\u000fpq\u0000~\u0000\u0019q\u0000~\u0000\u001dq\u0000~\u0000\u001fsq\u0000~\u0000 q\u0000"
+"~\u0000\u0090q\u0000~\u0000$sq\u0000~\u0000\n\u0001\u00f8\u00bd/pp\u0000sq\u0000~\u0000\b\u0001\u00f8\u00bd$ppsq\u0000~\u0000\u0013\u0001\u00f8\u00bd\u0019q\u0000~\u0000\u000fpsq\u0000~\u0000\u0016\u0001\u00f8\u00bd\u0016q"
+"\u0000~\u0000\u000fpq\u0000~\u0000\u0019q\u0000~\u0000\u001dq\u0000~\u0000\u001fsq\u0000~\u0000 q\u0000~\u0000\u0096q\u0000~\u0000$sq\u0000~\u0000\n\u0001\u00f8\u00bd/pp\u0000sq\u0000~\u0000\b\u0001\u00f8\u00bd$p"
+"psq\u0000~\u0000\u0013\u0001\u00f8\u00bd\u0019q\u0000~\u0000\u000fpsq\u0000~\u0000\u0016\u0001\u00f8\u00bd\u0016q\u0000~\u0000\u000fpq\u0000~\u0000\u0019q\u0000~\u0000\u001dq\u0000~\u0000\u001fsq\u0000~\u0000 q\u0000~\u0000\u009cq"
+"\u0000~\u0000$sq\u0000~\u0000\n\u0001\u00f8\u00bd/pp\u0000sq\u0000~\u0000\b\u0001\u00f8\u00bd$ppsq\u0000~\u0000\u0013\u0001\u00f8\u00bd\u0019q\u0000~\u0000\u000fpsq\u0000~\u0000\u0016\u0001\u00f8\u00bd\u0016q\u0000~\u0000\u000f"
+"pq\u0000~\u0000\u0019q\u0000~\u0000\u001dq\u0000~\u0000\u001fsq\u0000~\u0000 q\u0000~\u0000\u00a2q\u0000~\u0000$sq\u0000~\u0000\n\u0001\u00f8\u00bd/pp\u0000sq\u0000~\u0000\b\u0001\u00f8\u00bd$ppsq\u0000"
+"~\u0000\u0013\u0001\u00f8\u00bd\u0019q\u0000~\u0000\u000fpsq\u0000~\u0000\u0016\u0001\u00f8\u00bd\u0016q\u0000~\u0000\u000fpq\u0000~\u0000\u0019q\u0000~\u0000\u001dq\u0000~\u0000\u001fsq\u0000~\u0000 q\u0000~\u0000\u00a8q\u0000~\u0000$"
+"sq\u0000~\u0000\n\u0001\u00f8\u00bd/pp\u0000sq\u0000~\u0000\b\u0001\u00f8\u00bd$ppsq\u0000~\u0000\u0013\u0001\u00f8\u00bd\u0019q\u0000~\u0000\u000fpsq\u0000~\u0000\u0016\u0001\u00f8\u00bd\u0016q\u0000~\u0000\u000fpq\u0000~"
+"\u0000\u0019q\u0000~\u0000\u001dq\u0000~\u0000\u001fsq\u0000~\u0000 q\u0000~\u0000\u00aeq\u0000~\u0000$sq\u0000~\u0000\b\u0002m\u00fa@ppsq\u0000~\u0000\u0016\u0002m\u00fa5q\u0000~\u0000\u000fpsq\u0000~"
+"\u0000\'\u0001\u001f\u00c6\u00c2ppsr\u0000)com.sun.msv.datatype.xsd.EnumerationFacet\u0000\u0000\u0000\u0000\u0000\u0000\u0000"
+"\u0001\u0002\u0000\u0001L\u0000\u0006valuest\u0000\u000fLjava/util/Set;xr\u00009com.sun.msv.datatype.xsd."
+"DataTypeWithValueConstraintFacet\"\u00a7Ro\u00ca\u00c7\u008aT\u0002\u0000\u0000xr\u0000*com.sun.msv.d"
+"atatype.xsd.DataTypeWithFacet\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0005Z\u0000\fisFacetFixedZ\u0000\u0012ne"
+"edValueCheckFlagL\u0000\bbaseTypet\u0000)Lcom/sun/msv/datatype/xsd/XSDa"
+"tatypeImpl;L\u0000\fconcreteTypet\u0000\'Lcom/sun/msv/datatype/xsd/Concr"
+"eteType;L\u0000\tfacetNameq\u0000~\u0000!xq\u0000~\u0000.q\u0000~\u0000?t\u0000\u0002Opsr\u00005com.sun.msv.dat"
+"atype.xsd.WhiteSpaceProcessor$Preserve\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u00004\u0000\u0000sr\u0000"
+"#com.sun.msv.datatype.xsd.StringType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001Z\u0000\risAlwaysVa"
+"lidxq\u0000~\u0000,q\u0000~\u00001t\u0000\u0006stringq\u0000~\u0001\u001a\u0001q\u0000~\u0001\u001ct\u0000\u000benumerationsr\u0000\u0011java.uti"
+"l.HashSet\u00baD\u0085\u0095\u0096\u00b8\u00b74\u0003\u0000\u0000xpw\f\u0000\u0000\u0000\u0010?@\u0000\u0000\u0000\u0000\u0000\u0004t\u0000\u0002NLt\u0000\u0003Andt\u0000\u0004Semit\u0000\u0005Cha"
+"inxq\u0000~\u00007sq\u0000~\u00008q\u0000~\u0001\u0018q\u0000~\u0000?sq\u0000~\u0000 t\u0000\u0002Opt\u0000\u0000q\u0000~\u0000\u001fsr\u0000\"com.sun.msv.g"
+"rammar.ExpressionPool\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\bexpTablet\u0000/Lcom/sun/msv/g"
+"rammar/ExpressionPool$ClosedHash;xpsr\u0000-com.sun.msv.grammar.E"
+"xpressionPool$ClosedHash\u00d7j\u00d0N\u00ef\u00e8\u00ed\u001c\u0002\u0000\u0004I\u0000\u0005countI\u0000\tthresholdL\u0000\u0006pa"
+"rentq\u0000~\u0001*[\u0000\u0005tablet\u0000![Lcom/sun/msv/grammar/Expression;xp\u0000\u0000\u0000g\u0000"
+"\u0000\u0000rpur\u0000![Lcom.sun.msv.grammar.Expression;\u00d68D\u00c3]\u00ad\u00a7\n\u0002\u0000\u0000xp\u0000\u0000\u0001\u007fq\u0000"
+"~\u0000\u0087q\u0000~\u0000\u0081q\u0000~\u0000{q\u0000~\u0000\u00c4q\u0000~\u0000\u00bfq\u0000~\u0000\u00aaq\u0000~\u0000\u00a4q\u0000~\u0000\u009eq\u0000~\u0000\u0098q\u0000~\u0000\u0092q\u0000~\u0000\u008cq\u0000~\u0000\u0086q\u0000"
+"~\u0000\u0080q\u0000~\u0000zq\u0000~\u0000tq\u0000~\u0000nq\u0000~\u0000hq\u0000~\u0000bq\u0000~\u0000\\q\u0000~\u0000Vq\u0000~\u0000Pq\u0000~\u0000\u0012q\u0000~\u0000uq\u0000~\u0000oq\u0000"
+"~\u0000iq\u0000~\u0000cq\u0000~\u0000]q\u0000~\u0000Wq\u0000~\u0000Qq\u0000~\u0000\u0015q\u0000~\u0000Nq\u0000~\u0000\u00bdq\u0000~\u0000\u00caq\u0000~\u0000\u00c9q\u0000~\u0000\u00cfq\u0000~\u0000\u00ceq\u0000"
+"~\u0000\u00d4q\u0000~\u0000\u00d3q\u0000~\u0000\u00d9q\u0000~\u0000\u00d8q\u0000~\u0000\u00deq\u0000~\u0000\u00ddq\u0000~\u0000\u00e3q\u0000~\u0000\u00e2q\u0000~\u0000\u00e8q\u0000~\u0000\u00e7q\u0000~\u0000Mq\u0000~\u0000\u00bcq\u0000"
+"~\u0000\u00edq\u0000~\u0000\u00ecq\u0000~\u0000\u00f2q\u0000~\u0000\u00f1q\u0000~\u0000\u00f7q\u0000~\u0000\u00f6q\u0000~\u0000\u00fcq\u0000~\u0000\u00fbq\u0000~\u0001\u0001q\u0000~\u0001\u0000q\u0000~\u0001\u0006q\u0000~\u0001\u0005q\u0000"
+"~\u0001\u000bq\u0000~\u0001\nq\u0000~\u0000Lq\u0000~\u0000\u00bbq\u0000~\u0000\u0006q\u0000~\u0001\u000eq\u0000~\u0000\u0005pppppppppppq\u0000~\u0000Kq\u0000~\u0000\u00bapppppp"
+"ppppppppq\u0000~\u0000Jq\u0000~\u0000\u00b9ppppppppppppppq\u0000~\u0000Iq\u0000~\u0000\u00b8ppppppppppppppq\u0000~\u0000"
+"Hq\u0000~\u0000\u00b7pppppppppppppq\u0000~\u0000\u0007q\u0000~\u0000Gq\u0000~\u0000\u00b6ppppppppppppppq\u0000~\u0000Fq\u0000~\u0000\u00b5pp"
+"ppppppppppppq\u0000~\u0000Eq\u0000~\u0000\u00b4ppppppppppppppq\u0000~\u0000Dq\u0000~\u0000\u00b3pppppppppppppp"
+"q\u0000~\u0000Cq\u0000~\u0000\u00b2ppppppppppppppq\u0000~\u0000Bq\u0000~\u0000\u00b1q\u0000~\u0000%pppppppppppppq\u0000~\u0000Aq\u0000~"
+"\u0000\u00b0pppq\u0000~\u0000\u0010ppppppppppq\u0000~\u0000@q\u0000~\u0000\u00afpppppppppq\u0000~\u0000\tpppppppppppppppp"
+"pppppppppppppppppppppppppppppppppppppppppppppppppppppppppppp"
+"pppppppppppppppppppppppppppppppppq\u0000~\u0000\u00c5q\u0000~\u0000\u00c0q\u0000~\u0000\u00abq\u0000~\u0000\u00a5q\u0000~\u0000\u009fq\u0000"
+"~\u0000\u0099q\u0000~\u0000\u0093q\u0000~\u0000\u008d"));
        }
        return new com.sun.msv.verifier.regexp.REDocumentDeclaration(schemaFragment);
    }

    public class Unmarshaller
        extends net.sourceforge.czt.oz.jaxb.gen.impl.runtime.AbstractUnmarshallingEventHandlerImpl
    {


        public Unmarshaller(net.sourceforge.czt.oz.jaxb.gen.impl.runtime.UnmarshallingContext context) {
            super(context, "-----");
        }

        protected Unmarshaller(net.sourceforge.czt.oz.jaxb.gen.impl.runtime.UnmarshallingContext context, int startState) {
            this(context);
            state = startState;
        }

        public java.lang.Object owner() {
            return net.sourceforge.czt.z.jaxb.gen.impl.AndPredImpl.this;
        }

        public void enterElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname, org.xml.sax.Attributes __atts)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  4 :
                        revertToParentFromEnterElement(___uri, ___local, ___qname, __atts);
                        return ;
                    case  0 :
                        attIdx = context.getAttribute("", "Op");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            eatText1(v);
                            state = 3;
                            continue outer;
                        }
                        state = 3;
                        continue outer;
                    case  3 :
                        if (("Anns" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.z.jaxb.gen.impl.Pred2Impl)net.sourceforge.czt.z.jaxb.gen.impl.AndPredImpl.this).new Unmarshaller(context)), 4, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("FalsePred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.z.jaxb.gen.impl.Pred2Impl)net.sourceforge.czt.z.jaxb.gen.impl.AndPredImpl.this).new Unmarshaller(context)), 4, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("NegPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.z.jaxb.gen.impl.Pred2Impl)net.sourceforge.czt.z.jaxb.gen.impl.AndPredImpl.this).new Unmarshaller(context)), 4, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("Fact" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.z.jaxb.gen.impl.Pred2Impl)net.sourceforge.czt.z.jaxb.gen.impl.AndPredImpl.this).new Unmarshaller(context)), 4, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("ImpliesPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.z.jaxb.gen.impl.Pred2Impl)net.sourceforge.czt.z.jaxb.gen.impl.AndPredImpl.this).new Unmarshaller(context)), 4, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("TruePred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.z.jaxb.gen.impl.Pred2Impl)net.sourceforge.czt.z.jaxb.gen.impl.AndPredImpl.this).new Unmarshaller(context)), 4, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("QntPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.z.jaxb.gen.impl.Pred2Impl)net.sourceforge.czt.z.jaxb.gen.impl.AndPredImpl.this).new Unmarshaller(context)), 4, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("MemPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.z.jaxb.gen.impl.Pred2Impl)net.sourceforge.czt.z.jaxb.gen.impl.AndPredImpl.this).new Unmarshaller(context)), 4, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("OrPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.z.jaxb.gen.impl.Pred2Impl)net.sourceforge.czt.z.jaxb.gen.impl.AndPredImpl.this).new Unmarshaller(context)), 4, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("ExistsPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.z.jaxb.gen.impl.Pred2Impl)net.sourceforge.czt.z.jaxb.gen.impl.AndPredImpl.this).new Unmarshaller(context)), 4, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("Pred2" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.z.jaxb.gen.impl.Pred2Impl)net.sourceforge.czt.z.jaxb.gen.impl.AndPredImpl.this).new Unmarshaller(context)), 4, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("Exists1Pred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.z.jaxb.gen.impl.Pred2Impl)net.sourceforge.czt.z.jaxb.gen.impl.AndPredImpl.this).new Unmarshaller(context)), 4, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("AndPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.z.jaxb.gen.impl.Pred2Impl)net.sourceforge.czt.z.jaxb.gen.impl.AndPredImpl.this).new Unmarshaller(context)), 4, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("IffPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.z.jaxb.gen.impl.Pred2Impl)net.sourceforge.czt.z.jaxb.gen.impl.AndPredImpl.this).new Unmarshaller(context)), 4, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("JokerPred" == ___local)&&("http://czt.sourceforge.net/zpatt" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.z.jaxb.gen.impl.Pred2Impl)net.sourceforge.czt.z.jaxb.gen.impl.AndPredImpl.this).new Unmarshaller(context)), 4, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("ExprPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.z.jaxb.gen.impl.Pred2Impl)net.sourceforge.czt.z.jaxb.gen.impl.AndPredImpl.this).new Unmarshaller(context)), 4, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("ForallPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.z.jaxb.gen.impl.Pred2Impl)net.sourceforge.czt.z.jaxb.gen.impl.AndPredImpl.this).new Unmarshaller(context)), 4, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("Pred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.z.jaxb.gen.impl.Pred2Impl)net.sourceforge.czt.z.jaxb.gen.impl.AndPredImpl.this).new Unmarshaller(context)), 4, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("Pred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.z.jaxb.gen.impl.Pred2Impl)net.sourceforge.czt.z.jaxb.gen.impl.AndPredImpl.this).new Unmarshaller(context)), 4, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        spawnHandlerFromEnterElement((((net.sourceforge.czt.z.jaxb.gen.impl.Pred2Impl)net.sourceforge.czt.z.jaxb.gen.impl.AndPredImpl.this).new Unmarshaller(context)), 4, ___uri, ___local, ___qname, __atts);
                        return ;
                }
                super.enterElement(___uri, ___local, ___qname, __atts);
                break;
            }
        }

        private void eatText1(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            try {
                _Op = value;
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
                    case  4 :
                        revertToParentFromLeaveElement(___uri, ___local, ___qname);
                        return ;
                    case  0 :
                        attIdx = context.getAttribute("", "Op");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            eatText1(v);
                            state = 3;
                            continue outer;
                        }
                        state = 3;
                        continue outer;
                    case  3 :
                        spawnHandlerFromLeaveElement((((net.sourceforge.czt.z.jaxb.gen.impl.Pred2Impl)net.sourceforge.czt.z.jaxb.gen.impl.AndPredImpl.this).new Unmarshaller(context)), 4, ___uri, ___local, ___qname);
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
                    case  4 :
                        revertToParentFromEnterAttribute(___uri, ___local, ___qname);
                        return ;
                    case  0 :
                        if (("Op" == ___local)&&("" == ___uri)) {
                            state = 1;
                            return ;
                        }
                        state = 3;
                        continue outer;
                    case  3 :
                        spawnHandlerFromEnterAttribute((((net.sourceforge.czt.z.jaxb.gen.impl.Pred2Impl)net.sourceforge.czt.z.jaxb.gen.impl.AndPredImpl.this).new Unmarshaller(context)), 4, ___uri, ___local, ___qname);
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
                    case  4 :
                        revertToParentFromLeaveAttribute(___uri, ___local, ___qname);
                        return ;
                    case  0 :
                        attIdx = context.getAttribute("", "Op");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            eatText1(v);
                            state = 3;
                            continue outer;
                        }
                        state = 3;
                        continue outer;
                    case  3 :
                        spawnHandlerFromLeaveAttribute((((net.sourceforge.czt.z.jaxb.gen.impl.Pred2Impl)net.sourceforge.czt.z.jaxb.gen.impl.AndPredImpl.this).new Unmarshaller(context)), 4, ___uri, ___local, ___qname);
                        return ;
                    case  2 :
                        if (("Op" == ___local)&&("" == ___uri)) {
                            state = 3;
                            return ;
                        }
                        break;
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
                        case  4 :
                            revertToParentFromText(value);
                            return ;
                        case  0 :
                            attIdx = context.getAttribute("", "Op");
                            if (attIdx >= 0) {
                                final java.lang.String v = context.eatAttribute(attIdx);
                                eatText1(v);
                                state = 3;
                                continue outer;
                            }
                            state = 3;
                            continue outer;
                        case  3 :
                            spawnHandlerFromText((((net.sourceforge.czt.z.jaxb.gen.impl.Pred2Impl)net.sourceforge.czt.z.jaxb.gen.impl.AndPredImpl.this).new Unmarshaller(context)), 4, value);
                            return ;
                        case  1 :
                            eatText1(value);
                            state = 2;
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
