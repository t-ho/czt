//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.2-b15-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2004.07.23 at 10:52:41 NZST 
//


package net.sourceforge.czt.z.jaxb.gen.impl;

public class RefNameImpl
    extends net.sourceforge.czt.z.jaxb.gen.impl.NameImpl
    implements net.sourceforge.czt.z.jaxb.gen.RefName, com.sun.xml.bind.JAXBObject, net.sourceforge.czt.oz.jaxb.gen.impl.runtime.UnmarshallableObject, net.sourceforge.czt.oz.jaxb.gen.impl.runtime.XMLSerializable, net.sourceforge.czt.oz.jaxb.gen.impl.runtime.ValidatableObject
{

    protected java.lang.Object _Decl;
    public final static java.lang.Class version = (net.sourceforge.czt.z.jaxb.gen.impl.JAXBVersion.class);
    private static com.sun.msv.grammar.Grammar schemaFragment;

    private final static java.lang.Class PRIMARY_INTERFACE_CLASS() {
        return (net.sourceforge.czt.z.jaxb.gen.RefName.class);
    }

    public java.lang.Object getDecl() {
        return _Decl;
    }

    public void setDecl(java.lang.Object value) {
        _Decl = value;
    }

    public net.sourceforge.czt.oz.jaxb.gen.impl.runtime.UnmarshallingEventHandler createUnmarshaller(net.sourceforge.czt.oz.jaxb.gen.impl.runtime.UnmarshallingContext context) {
        return new net.sourceforge.czt.z.jaxb.gen.impl.RefNameImpl.Unmarshaller(context);
    }

    public void serializeBody(net.sourceforge.czt.oz.jaxb.gen.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        super.serializeBody(context);
    }

    public void serializeAttributes(net.sourceforge.czt.oz.jaxb.gen.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        if (_Decl!= null) {
            context.startAttribute("", "Decl");
            try {
                context.text(context.onIDREF(((com.sun.xml.bind.marshaller.IdentifiableObject)((java.lang.Object) _Decl))), "Decl");
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
        return (net.sourceforge.czt.z.jaxb.gen.RefName.class);
    }

    public com.sun.msv.verifier.DocumentDeclaration createRawValidator() {
        if (schemaFragment == null) {
            schemaFragment = com.sun.xml.bind.validator.SchemaDeserializer.deserialize((
 "\u00ac\u00ed\u0000\u0005sr\u0000\u001fcom.sun.msv.grammar.SequenceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.su"
+"n.msv.grammar.BinaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0004exp1t\u0000 Lcom/sun/msv/gra"
+"mmar/Expression;L\u0000\u0004exp2q\u0000~\u0000\u0002xr\u0000\u001ecom.sun.msv.grammar.Expressi"
+"on\u00f8\u0018\u0082\u00e8N5~O\u0002\u0000\u0003I\u0000\u000ecachedHashCodeL\u0000\u0013epsilonReducibilityt\u0000\u0013Ljava"
+"/lang/Boolean;L\u0000\u000bexpandedExpq\u0000~\u0000\u0002xp\u000b.\u00feqppsq\u0000~\u0000\u0000\b\u00d7C\u0003ppsq\u0000~\u0000\u0000\u0007"
+"\u0093\u000bZppsr\u0000\u001dcom.sun.msv.grammar.ChoiceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0001\u0003M\u00c1\u00abp"
+"psr\u0000\'com.sun.msv.grammar.trex.ElementPattern\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\tna"
+"meClasst\u0000\u001fLcom/sun/msv/grammar/NameClass;xr\u0000\u001ecom.sun.msv.gra"
+"mmar.ElementExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002Z\u0000\u001aignoreUndeclaredAttributesL\u0000\fco"
+"ntentModelq\u0000~\u0000\u0002xq\u0000~\u0000\u0003\u0003M\u00c1\u00a0sr\u0000\u0011java.lang.Boolean\u00cd r\u0080\u00d5\u009c\u00fa\u00ee\u0002\u0000\u0001Z\u0000\u0005"
+"valuexp\u0000p\u0000sq\u0000~\u0000\u0000\u0003M\u00c1\u0095ppsq\u0000~\u0000\n\u0000Q\r\u00e4pp\u0000sq\u0000~\u0000\b\u0000Q\r\u00d9ppsr\u0000 com.sun.m"
+"sv.grammar.OneOrMoreExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001ccom.sun.msv.grammar.Un"
+"aryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\u0003expq\u0000~\u0000\u0002xq\u0000~\u0000\u0003\u0000Q\r\u00ceq\u0000~\u0000\u000fpsr\u0000 com.sun.msv."
+"grammar.AttributeExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003expq\u0000~\u0000\u0002L\u0000\tnameClassq\u0000~\u0000\u000bx"
+"q\u0000~\u0000\u0003\u0000Q\r\u00cbq\u0000~\u0000\u000fpsr\u00002com.sun.msv.grammar.Expression$AnyStringE"
+"xpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003\u0000\u0000\u0000\bsq\u0000~\u0000\u000e\u0001q\u0000~\u0000\u0019sr\u0000 com.sun.msv.gr"
+"ammar.AnyNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun.msv.grammar.NameCla"
+"ss\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com.sun.msv.grammar.Expression$EpsilonExp"
+"ression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003\u0000\u0000\u0000\tq\u0000~\u0000\u001aq\u0000~\u0000\u001fsr\u0000#com.sun.msv.gramma"
+"r.SimpleNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\tlocalNamet\u0000\u0012Ljava/lang/String"
+";L\u0000\fnamespaceURIq\u0000~\u0000!xq\u0000~\u0000\u001ct\u0000-net.sourceforge.czt.z.jaxb.gen"
+".TermA.AnnsTypet\u0000+http://java.sun.com/jaxb/xjc/dummy-element"
+"ssq\u0000~\u0000\b\u0002\u00fc\u00b3\u00acppsq\u0000~\u0000\u0016\u0002\u00fc\u00b3\u00a1q\u0000~\u0000\u000fpsr\u0000\u001bcom.sun.msv.grammar.DataExp"
+"\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\u0002dtt\u0000\u001fLorg/relaxng/datatype/Datatype;L\u0000\u0006exceptq"
+"\u0000~\u0000\u0002L\u0000\u0004namet\u0000\u001dLcom/sun/msv/util/StringPair;xq\u0000~\u0000\u0003\u00016\f\u00a3ppsr\u0000\"c"
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
+"Annst\u0000\u001ehttp://czt.sourceforge.net/zmlq\u0000~\u0000\u001fsq\u0000~\u0000\n\u0004EI\u00aapp\u0000sq\u0000~\u0000"
+"\u0000\u0004EI\u009fppsq\u0000~\u0000\'\u0001\u00f1\u0011\u00caq\u0000~\u0000\u000fpsr\u0000#com.sun.msv.datatype.xsd.StringTy"
+"pe\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001Z\u0000\risAlwaysValidxq\u0000~\u0000,q\u0000~\u00001t\u0000\u0006stringsr\u00005com.sun"
+".msv.datatype.xsd.WhiteSpaceProcessor$Preserve\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000"
+"~\u00004\u0001q\u0000~\u00007sq\u0000~\u00008q\u0000~\u0000Eq\u0000~\u00001sq\u0000~\u0000\b\u0002T7\u00d0ppsq\u0000~\u0000\u0016\u0002T7\u00c5q\u0000~\u0000\u000fpq\u0000~\u0000*sq"
+"\u0000~\u0000 q\u0000~\u0000;q\u0000~\u0000<q\u0000~\u0000\u001fsq\u0000~\u0000 t\u0000\u0004Wordq\u0000~\u0000?sq\u0000~\u0000\b\u0001D7\u00a4ppsq\u0000~\u0000\u0013\u0001D7\u0099q"
+"\u0000~\u0000\u000fpsq\u0000~\u0000\b\u0001D7\u0096q\u0000~\u0000\u000fpsq\u0000~\u0000\b\u0000\u00f3)\u00b0q\u0000~\u0000\u000fpsq\u0000~\u0000\b\u0000\u00a2\u001b\u00caq\u0000~\u0000\u000fpsq\u0000~\u0000\n\u0000"
+"Q\r\u00e4q\u0000~\u0000\u000fp\u0000sq\u0000~\u0000\b\u0000Q\r\u00d9ppsq\u0000~\u0000\u0013\u0000Q\r\u00ceq\u0000~\u0000\u000fpsq\u0000~\u0000\u0016\u0000Q\r\u00cbq\u0000~\u0000\u000fpq\u0000~\u0000\u0019q"
+"\u0000~\u0000\u001dq\u0000~\u0000\u001fsq\u0000~\u0000 t\u0000)net.sourceforge.czt.z.jaxb.gen.NextStrokeq"
+"\u0000~\u0000$sq\u0000~\u0000\n\u0000Q\r\u00e4q\u0000~\u0000\u000fp\u0000sq\u0000~\u0000\b\u0000Q\r\u00d9ppsq\u0000~\u0000\u0013\u0000Q\r\u00ceq\u0000~\u0000\u000fpsq\u0000~\u0000\u0016\u0000Q\r\u00cbq"
+"\u0000~\u0000\u000fpq\u0000~\u0000\u0019q\u0000~\u0000\u001dq\u0000~\u0000\u001fsq\u0000~\u0000 t\u0000\'net.sourceforge.czt.z.jaxb.gen."
+"InStrokeq\u0000~\u0000$sq\u0000~\u0000\n\u0000Q\r\u00e4q\u0000~\u0000\u000fp\u0000sq\u0000~\u0000\b\u0000Q\r\u00d9ppsq\u0000~\u0000\u0013\u0000Q\r\u00ceq\u0000~\u0000\u000fpsq"
+"\u0000~\u0000\u0016\u0000Q\r\u00cbq\u0000~\u0000\u000fpq\u0000~\u0000\u0019q\u0000~\u0000\u001dq\u0000~\u0000\u001fsq\u0000~\u0000 t\u0000(net.sourceforge.czt.z."
+"jaxb.gen.OutStrokeq\u0000~\u0000$sq\u0000~\u0000\n\u0000Q\r\u00e4q\u0000~\u0000\u000fp\u0000sq\u0000~\u0000\b\u0000Q\r\u00d9ppsq\u0000~\u0000\u0013\u0000Q"
+"\r\u00ceq\u0000~\u0000\u000fpsq\u0000~\u0000\u0016\u0000Q\r\u00cbq\u0000~\u0000\u000fpq\u0000~\u0000\u0019q\u0000~\u0000\u001dq\u0000~\u0000\u001fsq\u0000~\u0000 t\u0000/net.sourcefo"
+"rge.czt.z.jaxb.gen.NumStrokeElementq\u0000~\u0000$q\u0000~\u0000\u001fsq\u0000~\u0000\b\u0002W\u00bbippsq\u0000"
+"~\u0000\u0016\u0002W\u00bb^q\u0000~\u0000\u000fpsq\u0000~\u0000\'\u0000\u00c1\u008c\u0090ppsr\u0000\"com.sun.msv.datatype.xsd.IDREFT"
+"ype\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000#com.sun.msv.datatype.xsd.NcnameType\u0000\u0000\u0000\u0000\u0000\u0000\u0000"
+"\u0001\u0002\u0000\u0000xr\u0000\"com.sun.msv.datatype.xsd.TokenType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000Cq"
+"\u0000~\u00001t\u0000\u0005IDREFq\u0000~\u00005\u0000q\u0000~\u00007sq\u0000~\u00008q\u0000~\u0000rq\u0000~\u00001sq\u0000~\u0000 t\u0000\u0004Declt\u0000\u0000q\u0000~\u0000\u001f"
+"sr\u0000\"com.sun.msv.grammar.ExpressionPool\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\bexpTable"
+"t\u0000/Lcom/sun/msv/grammar/ExpressionPool$ClosedHash;xpsr\u0000-com."
+"sun.msv.grammar.ExpressionPool$ClosedHash\u00d7j\u00d0N\u00ef\u00e8\u00ed\u001c\u0002\u0000\u0004I\u0000\u0005count"
+"I\u0000\tthresholdL\u0000\u0006parentq\u0000~\u0000x[\u0000\u0005tablet\u0000![Lcom/sun/msv/grammar/E"
+"xpression;xp\u0000\u0000\u0000\u0018\u0000\u0000\u00009pur\u0000![Lcom.sun.msv.grammar.Expression;\u00d68"
+"D\u00c3]\u00ad\u00a7\n\u0002\u0000\u0000xp\u0000\u0000\u0000\u00bfppppppppppppppppppppppppppq\u0000~\u0000Qpppppppppppppp"
+"q\u0000~\u0000\u0010pppppppq\u0000~\u0000\u0015q\u0000~\u0000Uq\u0000~\u0000[q\u0000~\u0000aq\u0000~\u0000gppq\u0000~\u0000Apppq\u0000~\u0000\u0012q\u0000~\u0000Tq\u0000~"
+"\u0000Zq\u0000~\u0000\tq\u0000~\u0000`q\u0000~\u0000fq\u0000~\u0000\u0006q\u0000~\u0000kpppppppppppppppppppppppppppppppq\u0000"
+"~\u0000Pppq\u0000~\u0000Opppppppq\u0000~\u0000Ippq\u0000~\u0000Nppppppppppppppq\u0000~\u0000\u0005ppppppq\u0000~\u0000\u0007p"
+"pppppppq\u0000~\u0000Rpppppppppppq\u0000~\u0000%pppppppppppppppppppppppppppppppp"
+"pp"));
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
            return net.sourceforge.czt.z.jaxb.gen.impl.RefNameImpl.this;
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
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.z.jaxb.gen.impl.NameImpl)net.sourceforge.czt.z.jaxb.gen.impl.RefNameImpl.this).new Unmarshaller(context)), 4, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("Word" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.z.jaxb.gen.impl.NameImpl)net.sourceforge.czt.z.jaxb.gen.impl.RefNameImpl.this).new Unmarshaller(context)), 4, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        spawnHandlerFromEnterElement((((net.sourceforge.czt.z.jaxb.gen.impl.NameImpl)net.sourceforge.czt.z.jaxb.gen.impl.RefNameImpl.this).new Unmarshaller(context)), 4, ___uri, ___local, ___qname, __atts);
                        return ;
                    case  0 :
                        attIdx = context.getAttribute("", "Decl");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            eatText1(v);
                            state = 3;
                            continue outer;
                        }
                        state = 3;
                        continue outer;
                    case  4 :
                        revertToParentFromEnterElement(___uri, ___local, ___qname, __atts);
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
                context.addPatcher(new java.lang.Runnable() {


                    public void run() {
                        _Decl = ((java.lang.Object) context.getObjectFromId(com.sun.xml.bind.WhiteSpaceProcessor.collapse(value)));
                    }

                }
                );
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
                    case  3 :
                        spawnHandlerFromLeaveElement((((net.sourceforge.czt.z.jaxb.gen.impl.NameImpl)net.sourceforge.czt.z.jaxb.gen.impl.RefNameImpl.this).new Unmarshaller(context)), 4, ___uri, ___local, ___qname);
                        return ;
                    case  0 :
                        attIdx = context.getAttribute("", "Decl");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            eatText1(v);
                            state = 3;
                            continue outer;
                        }
                        state = 3;
                        continue outer;
                    case  4 :
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
                    case  3 :
                        spawnHandlerFromEnterAttribute((((net.sourceforge.czt.z.jaxb.gen.impl.NameImpl)net.sourceforge.czt.z.jaxb.gen.impl.RefNameImpl.this).new Unmarshaller(context)), 4, ___uri, ___local, ___qname);
                        return ;
                    case  0 :
                        if (("Decl" == ___local)&&("" == ___uri)) {
                            state = 1;
                            return ;
                        }
                        state = 3;
                        continue outer;
                    case  4 :
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
                    case  3 :
                        spawnHandlerFromLeaveAttribute((((net.sourceforge.czt.z.jaxb.gen.impl.NameImpl)net.sourceforge.czt.z.jaxb.gen.impl.RefNameImpl.this).new Unmarshaller(context)), 4, ___uri, ___local, ___qname);
                        return ;
                    case  2 :
                        if (("Decl" == ___local)&&("" == ___uri)) {
                            state = 3;
                            return ;
                        }
                        break;
                    case  0 :
                        attIdx = context.getAttribute("", "Decl");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            eatText1(v);
                            state = 3;
                            continue outer;
                        }
                        state = 3;
                        continue outer;
                    case  4 :
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
                        case  3 :
                            spawnHandlerFromText((((net.sourceforge.czt.z.jaxb.gen.impl.NameImpl)net.sourceforge.czt.z.jaxb.gen.impl.RefNameImpl.this).new Unmarshaller(context)), 4, value);
                            return ;
                        case  1 :
                            eatText1(value);
                            state = 2;
                            return ;
                        case  0 :
                            attIdx = context.getAttribute("", "Decl");
                            if (attIdx >= 0) {
                                final java.lang.String v = context.eatAttribute(attIdx);
                                eatText1(v);
                                state = 3;
                                continue outer;
                            }
                            state = 3;
                            continue outer;
                        case  4 :
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
