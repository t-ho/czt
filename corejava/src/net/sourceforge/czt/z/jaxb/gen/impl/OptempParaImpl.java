//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.4-b18-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2005.03.01 at 02:55:30 GMT 
//


package net.sourceforge.czt.z.jaxb.gen.impl;

public class OptempParaImpl
    extends net.sourceforge.czt.z.jaxb.gen.impl.ParaImpl
    implements net.sourceforge.czt.z.jaxb.gen.OptempPara, com.sun.xml.bind.JAXBObject, net.sourceforge.czt.circus.jaxb.gen.impl.runtime.UnmarshallableObject, net.sourceforge.czt.circus.jaxb.gen.impl.runtime.XMLSerializable, net.sourceforge.czt.circus.jaxb.gen.impl.runtime.ValidatableObject
{

    protected java.lang.String _Cat;
    protected com.sun.xml.bind.util.ListImpl _Oper;
    protected java.lang.String _Assoc;
    protected java.lang.Integer _Prec;
    public final static java.lang.Class version = (net.sourceforge.czt.z.jaxb.gen.impl.JAXBVersion.class);
    private static com.sun.msv.grammar.Grammar schemaFragment;

    private final static java.lang.Class PRIMARY_INTERFACE_CLASS() {
        return (net.sourceforge.czt.z.jaxb.gen.OptempPara.class);
    }

    public java.lang.String getCat() {
        return _Cat;
    }

    public void setCat(java.lang.String value) {
        _Cat = value;
    }

    protected com.sun.xml.bind.util.ListImpl _getOper() {
        if (_Oper == null) {
            _Oper = new com.sun.xml.bind.util.ListImpl(new java.util.ArrayList());
        }
        return _Oper;
    }

    public java.util.List getOper() {
        return _getOper();
    }

    public java.lang.String getAssoc() {
        return _Assoc;
    }

    public void setAssoc(java.lang.String value) {
        _Assoc = value;
    }

    public java.lang.Integer getPrec() {
        return _Prec;
    }

    public void setPrec(java.lang.Integer value) {
        _Prec = value;
    }

    public net.sourceforge.czt.circus.jaxb.gen.impl.runtime.UnmarshallingEventHandler createUnmarshaller(net.sourceforge.czt.circus.jaxb.gen.impl.runtime.UnmarshallingContext context) {
        return new net.sourceforge.czt.z.jaxb.gen.impl.OptempParaImpl.Unmarshaller(context);
    }

    public void serializeBody(net.sourceforge.czt.circus.jaxb.gen.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        int idx2 = 0;
        final int len2 = ((_Oper == null)? 0 :_Oper.size());
        super.serializeBody(context);
        while (idx2 != len2) {
            if (_Oper.get(idx2) instanceof javax.xml.bind.Element) {
                context.childAsBody(((com.sun.xml.bind.JAXBObject) _Oper.get(idx2 ++)), "Oper");
            } else {
                context.startElement("http://czt.sourceforge.net/zml", "Oper");
                int idx_0 = idx2;
                context.childAsURIs(((com.sun.xml.bind.JAXBObject) _Oper.get(idx_0 ++)), "Oper");
                context.endNamespaceDecls();
                int idx_1 = idx2;
                context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _Oper.get(idx_1 ++)), "Oper");
                context.endAttributes();
                context.childAsBody(((com.sun.xml.bind.JAXBObject) _Oper.get(idx2 ++)), "Oper");
                context.endElement();
            }
        }
    }

    public void serializeAttributes(net.sourceforge.czt.circus.jaxb.gen.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        int idx2 = 0;
        final int len2 = ((_Oper == null)? 0 :_Oper.size());
        if (_Assoc!= null) {
            context.startAttribute("", "Assoc");
            try {
                context.text(((java.lang.String) _Assoc), "Assoc");
            } catch (java.lang.Exception e) {
                net.sourceforge.czt.circus.jaxb.gen.impl.runtime.Util.handlePrintConversionException(this, e, context);
            }
            context.endAttribute();
        }
        context.startAttribute("", "Cat");
        try {
            context.text(((java.lang.String) _Cat), "Cat");
        } catch (java.lang.Exception e) {
            net.sourceforge.czt.circus.jaxb.gen.impl.runtime.Util.handlePrintConversionException(this, e, context);
        }
        context.endAttribute();
        if (_Prec!= null) {
            context.startAttribute("", "Prec");
            try {
                context.text(net.sourceforge.czt.base.util.CztDatatypeConverter.printInteger(((java.lang.Integer) _Prec)), "Prec");
            } catch (java.lang.Exception e) {
                net.sourceforge.czt.circus.jaxb.gen.impl.runtime.Util.handlePrintConversionException(this, e, context);
            }
            context.endAttribute();
        }
        super.serializeAttributes(context);
        while (idx2 != len2) {
            if (_Oper.get(idx2) instanceof javax.xml.bind.Element) {
                context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _Oper.get(idx2 ++)), "Oper");
            } else {
                idx2 += 1;
            }
        }
    }

    public void serializeURIs(net.sourceforge.czt.circus.jaxb.gen.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        int idx2 = 0;
        final int len2 = ((_Oper == null)? 0 :_Oper.size());
        super.serializeURIs(context);
        while (idx2 != len2) {
            if (_Oper.get(idx2) instanceof javax.xml.bind.Element) {
                context.childAsURIs(((com.sun.xml.bind.JAXBObject) _Oper.get(idx2 ++)), "Oper");
            } else {
                idx2 += 1;
            }
        }
    }

    public java.lang.Class getPrimaryInterface() {
        return (net.sourceforge.czt.z.jaxb.gen.OptempPara.class);
    }

    public com.sun.msv.verifier.DocumentDeclaration createRawValidator() {
        if (schemaFragment == null) {
            schemaFragment = com.sun.xml.bind.validator.SchemaDeserializer.deserialize((
 "\u00ac\u00ed\u0000\u0005sr\u0000\u001fcom.sun.msv.grammar.SequenceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.su"
+"n.msv.grammar.BinaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0004exp1t\u0000 Lcom/sun/msv/gra"
+"mmar/Expression;L\u0000\u0004exp2q\u0000~\u0000\u0002xr\u0000\u001ecom.sun.msv.grammar.Expressi"
+"on\u00f8\u0018\u0082\u00e8N5~O\u0002\u0000\u0002L\u0000\u0013epsilonReducibilityt\u0000\u0013Ljava/lang/Boolean;L\u0000\u000b"
+"expandedExpq\u0000~\u0000\u0002xpppsq\u0000~\u0000\u0000ppsq\u0000~\u0000\u0000ppsq\u0000~\u0000\u0000ppsq\u0000~\u0000\u0000ppsq\u0000~\u0000\u0000pp"
+"sr\u0000\u001dcom.sun.msv.grammar.ChoiceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0001ppsr\u0000\'com."
+"sun.msv.grammar.trex.ElementPattern\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\tnameClasst\u0000"
+"\u001fLcom/sun/msv/grammar/NameClass;xr\u0000\u001ecom.sun.msv.grammar.Elem"
+"entExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002Z\u0000\u001aignoreUndeclaredAttributesL\u0000\fcontentMode"
+"lq\u0000~\u0000\u0002xq\u0000~\u0000\u0003sr\u0000\u0011java.lang.Boolean\u00cd r\u0080\u00d5\u009c\u00fa\u00ee\u0002\u0000\u0001Z\u0000\u0005valuexp\u0000p\u0000sq\u0000"
+"~\u0000\u0000ppsq\u0000~\u0000\rpp\u0000sq\u0000~\u0000\u000bppsr\u0000 com.sun.msv.grammar.OneOrMoreExp\u0000\u0000"
+"\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001ccom.sun.msv.grammar.UnaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\u0003expq\u0000"
+"~\u0000\u0002xq\u0000~\u0000\u0003q\u0000~\u0000\u0012psr\u0000 com.sun.msv.grammar.AttributeExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002"
+"\u0000\u0002L\u0000\u0003expq\u0000~\u0000\u0002L\u0000\tnameClassq\u0000~\u0000\u000exq\u0000~\u0000\u0003q\u0000~\u0000\u0012psr\u00002com.sun.msv.gr"
+"ammar.Expression$AnyStringExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003sq\u0000~\u0000\u0011\u0001"
+"q\u0000~\u0000\u001csr\u0000 com.sun.msv.grammar.AnyNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom."
+"sun.msv.grammar.NameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com.sun.msv.gramma"
+"r.Expression$EpsilonExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003q\u0000~\u0000\u001dq\u0000~\u0000\"sr\u0000"
+"#com.sun.msv.grammar.SimpleNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\tlocalNamet"
+"\u0000\u0012Ljava/lang/String;L\u0000\fnamespaceURIq\u0000~\u0000$xq\u0000~\u0000\u001ft\u0000-net.sourcef"
+"orge.czt.z.jaxb.gen.TermA.AnnsTypet\u0000+http://java.sun.com/jax"
+"b/xjc/dummy-elementssq\u0000~\u0000\u000bppsq\u0000~\u0000\u0019q\u0000~\u0000\u0012psr\u0000\u001bcom.sun.msv.gram"
+"mar.DataExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\u0002dtt\u0000\u001fLorg/relaxng/datatype/Datatype"
+";L\u0000\u0006exceptq\u0000~\u0000\u0002L\u0000\u0004namet\u0000\u001dLcom/sun/msv/util/StringPair;xq\u0000~\u0000\u0003"
+"ppsr\u0000\"com.sun.msv.datatype.xsd.QnameType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000*com.s"
+"un.msv.datatype.xsd.BuiltinAtomicType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000%com.sun."
+"msv.datatype.xsd.ConcreteType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\'com.sun.msv.data"
+"type.xsd.XSDatatypeImpl\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\fnamespaceUriq\u0000~\u0000$L\u0000\btyp"
+"eNameq\u0000~\u0000$L\u0000\nwhiteSpacet\u0000.Lcom/sun/msv/datatype/xsd/WhiteSpa"
+"ceProcessor;xpt\u0000 http://www.w3.org/2001/XMLSchemat\u0000\u0005QNamesr\u0000"
+"5com.sun.msv.datatype.xsd.WhiteSpaceProcessor$Collapse\u0000\u0000\u0000\u0000\u0000\u0000"
+"\u0000\u0001\u0002\u0000\u0000xr\u0000,com.sun.msv.datatype.xsd.WhiteSpaceProcessor\u0000\u0000\u0000\u0000\u0000\u0000\u0000"
+"\u0001\u0002\u0000\u0000xpsr\u00000com.sun.msv.grammar.Expression$NullSetExpression\u0000\u0000"
+"\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003q\u0000~\u0000\u0012psr\u0000\u001bcom.sun.msv.util.StringPair\u00d0t\u001ejB\u008f\u008d\u00a0"
+"\u0002\u0000\u0002L\u0000\tlocalNameq\u0000~\u0000$L\u0000\fnamespaceURIq\u0000~\u0000$xpq\u0000~\u00005q\u0000~\u00004sq\u0000~\u0000#t\u0000"
+"\u0004typet\u0000)http://www.w3.org/2001/XMLSchema-instanceq\u0000~\u0000\"sq\u0000~\u0000#"
+"t\u0000\u0004Annst\u0000\u001ehttp://czt.sourceforge.net/zmlq\u0000~\u0000\"sq\u0000~\u0000\u000bppsq\u0000~\u0000\rp"
+"p\u0000sq\u0000~\u0000\u000bppsq\u0000~\u0000\u0016q\u0000~\u0000\u0012psq\u0000~\u0000\u0019q\u0000~\u0000\u0012pq\u0000~\u0000\u001cq\u0000~\u0000 q\u0000~\u0000\"sq\u0000~\u0000#t\u0000-ne"
+"t.sourceforge.czt.z.jaxb.gen.OperandElementq\u0000~\u0000\'sq\u0000~\u0000\rpp\u0000sq\u0000"
+"~\u0000\u000bppsq\u0000~\u0000\u0016q\u0000~\u0000\u0012psq\u0000~\u0000\u0019q\u0000~\u0000\u0012pq\u0000~\u0000\u001cq\u0000~\u0000 q\u0000~\u0000\"sq\u0000~\u0000#t\u0000.net.sou"
+"rceforge.czt.z.jaxb.gen.OperatorElementq\u0000~\u0000\'sq\u0000~\u0000\u000bppsq\u0000~\u0000\rpp"
+"\u0000sq\u0000~\u0000\u000bppsq\u0000~\u0000\u0016q\u0000~\u0000\u0012psq\u0000~\u0000\u0019q\u0000~\u0000\u0012pq\u0000~\u0000\u001cq\u0000~\u0000 q\u0000~\u0000\"sq\u0000~\u0000#q\u0000~\u0000Iq"
+"\u0000~\u0000\'sq\u0000~\u0000\rpp\u0000sq\u0000~\u0000\u000bppsq\u0000~\u0000\u0016q\u0000~\u0000\u0012psq\u0000~\u0000\u0019q\u0000~\u0000\u0012pq\u0000~\u0000\u001cq\u0000~\u0000 q\u0000~\u0000\""
+"sq\u0000~\u0000#q\u0000~\u0000Oq\u0000~\u0000\'sq\u0000~\u0000\u000bppsq\u0000~\u0000\u0016q\u0000~\u0000\u0012psq\u0000~\u0000\u000bq\u0000~\u0000\u0012psq\u0000~\u0000\rq\u0000~\u0000\u0012p"
+"\u0000sq\u0000~\u0000\u000bppsq\u0000~\u0000\u0016q\u0000~\u0000\u0012psq\u0000~\u0000\u0019q\u0000~\u0000\u0012pq\u0000~\u0000\u001cq\u0000~\u0000 q\u0000~\u0000\"sq\u0000~\u0000#q\u0000~\u0000Iq"
+"\u0000~\u0000\'sq\u0000~\u0000\rq\u0000~\u0000\u0012p\u0000sq\u0000~\u0000\u000bppsq\u0000~\u0000\u0016q\u0000~\u0000\u0012psq\u0000~\u0000\u0019q\u0000~\u0000\u0012pq\u0000~\u0000\u001cq\u0000~\u0000 q"
+"\u0000~\u0000\"sq\u0000~\u0000#q\u0000~\u0000Oq\u0000~\u0000\'q\u0000~\u0000\"sq\u0000~\u0000\u000bppsq\u0000~\u0000\u0019q\u0000~\u0000\u0012psq\u0000~\u0000*ppsr\u0000)com"
+".sun.msv.datatype.xsd.EnumerationFacet\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\u0006valuest\u0000"
+"\u000fLjava/util/Set;xr\u00009com.sun.msv.datatype.xsd.DataTypeWithVal"
+"ueConstraintFacet\"\u00a7Ro\u00ca\u00c7\u008aT\u0002\u0000\u0000xr\u0000*com.sun.msv.datatype.xsd.Dat"
+"aTypeWithFacet\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0005Z\u0000\fisFacetFixedZ\u0000\u0012needValueCheckFla"
+"gL\u0000\bbaseTypet\u0000)Lcom/sun/msv/datatype/xsd/XSDatatypeImpl;L\u0000\fc"
+"oncreteTypet\u0000\'Lcom/sun/msv/datatype/xsd/ConcreteType;L\u0000\tface"
+"tNameq\u0000~\u0000$xq\u0000~\u00001q\u0000~\u0000Bt\u0000\u0005Assocsr\u00005com.sun.msv.datatype.xsd.Wh"
+"iteSpaceProcessor$Preserve\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u00007\u0000\u0000sr\u0000#com.sun.msv"
+".datatype.xsd.StringType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001Z\u0000\risAlwaysValidxq\u0000~\u0000/q\u0000~"
+"\u00004t\u0000\u0006stringq\u0000~\u0000t\u0001q\u0000~\u0000vt\u0000\u000benumerationsr\u0000\u0011java.util.HashSet\u00baD\u0085"
+"\u0095\u0096\u00b8\u00b74\u0003\u0000\u0000xpw\f\u0000\u0000\u0000\u0010?@\u0000\u0000\u0000\u0000\u0000\u0002t\u0000\u0005Rightt\u0000\u0004Leftxq\u0000~\u0000:sq\u0000~\u0000;q\u0000~\u0000rq\u0000~\u0000"
+"Bsq\u0000~\u0000#t\u0000\u0005Assoct\u0000\u0000q\u0000~\u0000\"sq\u0000~\u0000\u0019ppsq\u0000~\u0000*ppsq\u0000~\u0000kq\u0000~\u0000Bt\u0000\u0003Catq\u0000~\u0000"
+"t\u0000\u0000q\u0000~\u0000vq\u0000~\u0000vq\u0000~\u0000xsq\u0000~\u0000yw\f\u0000\u0000\u0000\u0010?@\u0000\u0000\u0000\u0000\u0000\u0003t\u0000\u0007Generict\u0000\bRelationt"
+"\u0000\bFunctionxq\u0000~\u0000:sq\u0000~\u0000;q\u0000~\u0000\u0084q\u0000~\u0000Bsq\u0000~\u0000#t\u0000\u0003Catq\u0000~\u0000\u0080sq\u0000~\u0000\u000bppsq\u0000"
+"~\u0000\u0019q\u0000~\u0000\u0012psq\u0000~\u0000*ppsr\u0000/com.sun.msv.datatype.xsd.NonNegativeInt"
+"egerType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000$com.sun.msv.datatype.xsd.IntegerType\u0000"
+"\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000+com.sun.msv.datatype.xsd.IntegerDerivedType\u0099\u00f1]"
+"\u0090&6k\u00be\u0002\u0000\u0001L\u0000\nbaseFacetsq\u0000~\u0000oxq\u0000~\u0000/q\u0000~\u00004t\u0000\u0012nonNegativeIntegerq\u0000"
+"~\u00008sr\u0000*com.sun.msv.datatype.xsd.MinInclusiveFacet\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000"
+"xr\u0000#com.sun.msv.datatype.xsd.RangeFacet\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\nlimitVa"
+"luet\u0000\u0012Ljava/lang/Object;xq\u0000~\u0000mppq\u0000~\u00008\u0000\u0000sq\u0000~\u0000\u0090q\u0000~\u00004t\u0000\u0007integer"
+"q\u0000~\u00008sr\u0000,com.sun.msv.datatype.xsd.FractionDigitsFacet\u0000\u0000\u0000\u0000\u0000\u0000\u0000"
+"\u0001\u0002\u0000\u0001I\u0000\u0005scalexr\u0000;com.sun.msv.datatype.xsd.DataTypeWithLexical"
+"ConstraintFacetT\u0090\u001c>\u001azb\u00ea\u0002\u0000\u0000xq\u0000~\u0000nppq\u0000~\u00008\u0001\u0000sr\u0000#com.sun.msv.dat"
+"atype.xsd.NumberType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000/q\u0000~\u00004t\u0000\u0007decimalq\u0000~\u00008q\u0000~"
+"\u0000\u009et\u0000\u000efractionDigits\u0000\u0000\u0000\u0000q\u0000~\u0000\u0098t\u0000\fminInclusivesr\u0000)com.sun.msv.d"
+"atatype.xsd.IntegerValueType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\u0005valueq\u0000~\u0000$xr\u0000\u0010java"
+".lang.Number\u0086\u00ac\u0095\u001d\u000b\u0094\u00e0\u008b\u0002\u0000\u0000xpt\u0000\u00010q\u0000~\u0000:sq\u0000~\u0000;q\u0000~\u0000\u0093q\u0000~\u00004sq\u0000~\u0000#t\u0000\u0004P"
+"recq\u0000~\u0000\u0080q\u0000~\u0000\"sr\u0000\"com.sun.msv.grammar.ExpressionPool\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002"
+"\u0000\u0001L\u0000\bexpTablet\u0000/Lcom/sun/msv/grammar/ExpressionPool$ClosedHa"
+"sh;xpsr\u0000-com.sun.msv.grammar.ExpressionPool$ClosedHash\u00d7j\u00d0N\u00ef\u00e8"
+"\u00ed\u001c\u0003\u0000\u0003I\u0000\u0005countB\u0000\rstreamVersionL\u0000\u0006parentt\u0000$Lcom/sun/msv/gramma"
+"r/ExpressionPool;xp\u0000\u0000\u0000\u001e\u0001pq\u0000~\u0000\bq\u0000~\u0000Cq\u0000~\u0000Pq\u0000~\u0000]q\u0000~\u0000hq\u0000~\u0000(q\u0000~\u0000\t"
+"q\u0000~\u0000\u0007q\u0000~\u0000\u0005q\u0000~\u0000\\q\u0000~\u0000\fq\u0000~\u0000\u008cq\u0000~\u0000\u0013q\u0000~\u0000[q\u0000~\u0000\nq\u0000~\u0000\u0018q\u0000~\u0000Fq\u0000~\u0000Lq\u0000~\u0000S"
+"q\u0000~\u0000Xq\u0000~\u0000`q\u0000~\u0000eq\u0000~\u0000\u0006q\u0000~\u0000\u0015q\u0000~\u0000Eq\u0000~\u0000Kq\u0000~\u0000Rq\u0000~\u0000Wq\u0000~\u0000_q\u0000~\u0000dx"));
        }
        return new com.sun.msv.verifier.regexp.REDocumentDeclaration(schemaFragment);
    }

    public class Unmarshaller
        extends net.sourceforge.czt.circus.jaxb.gen.impl.runtime.AbstractUnmarshallingEventHandlerImpl
    {


        public Unmarshaller(net.sourceforge.czt.circus.jaxb.gen.impl.runtime.UnmarshallingContext context) {
            super(context, "--------------");
        }

        protected Unmarshaller(net.sourceforge.czt.circus.jaxb.gen.impl.runtime.UnmarshallingContext context, int startState) {
            this(context);
            state = startState;
        }

        public java.lang.Object owner() {
            return net.sourceforge.czt.z.jaxb.gen.impl.OptempParaImpl.this;
        }

        public void enterElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname, org.xml.sax.Attributes __atts)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  6 :
                        attIdx = context.getAttribute("", "Prec");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            eatText1(v);
                            state = 9;
                            continue outer;
                        }
                        state = 9;
                        continue outer;
                    case  9 :
                        if (("Anns" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.z.jaxb.gen.impl.ParaImpl)net.sourceforge.czt.z.jaxb.gen.impl.OptempParaImpl.this).new Unmarshaller(context)), 10, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        spawnHandlerFromEnterElement((((net.sourceforge.czt.z.jaxb.gen.impl.ParaImpl)net.sourceforge.czt.z.jaxb.gen.impl.OptempParaImpl.this).new Unmarshaller(context)), 10, ___uri, ___local, ___qname, __atts);
                        return ;
                    case  13 :
                        if (("Operand" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _getOper().add(((net.sourceforge.czt.z.jaxb.gen.impl.OperandElementImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.OperandElementImpl.class), 13, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("Operator" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _getOper().add(((net.sourceforge.czt.z.jaxb.gen.impl.OperatorElementImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.OperatorElementImpl.class), 13, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("Oper" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 11;
                            return ;
                        }
                        if (("Oper" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _getOper().add(((net.sourceforge.czt.z.jaxb.gen.impl.OperElementImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.OperElementImpl.class), 13, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        revertToParentFromEnterElement(___uri, ___local, ___qname, __atts);
                        return ;
                    case  11 :
                        _getOper().add(((net.sourceforge.czt.z.jaxb.gen.impl.OperImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.OperImpl.class), 12, ___uri, ___local, ___qname, __atts)));
                        return ;
                    case  3 :
                        attIdx = context.getAttribute("", "Cat");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            eatText2(v);
                            state = 6;
                            continue outer;
                        }
                        break;
                    case  0 :
                        attIdx = context.getAttribute("", "Assoc");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            eatText3(v);
                            state = 3;
                            continue outer;
                        }
                        state = 3;
                        continue outer;
                    case  10 :
                        if (("Operand" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _getOper().add(((net.sourceforge.czt.z.jaxb.gen.impl.OperandElementImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.OperandElementImpl.class), 13, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("Operator" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _getOper().add(((net.sourceforge.czt.z.jaxb.gen.impl.OperatorElementImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.OperatorElementImpl.class), 13, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("Oper" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 11;
                            return ;
                        }
                        if (("Oper" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _getOper().add(((net.sourceforge.czt.z.jaxb.gen.impl.OperElementImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.OperElementImpl.class), 13, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        break;
                }
                super.enterElement(___uri, ___local, ___qname, __atts);
                break;
            }
        }

        private void eatText1(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            try {
                _Prec = net.sourceforge.czt.base.util.CztDatatypeConverter.parseInteger(com.sun.xml.bind.WhiteSpaceProcessor.collapse(value));
            } catch (java.lang.Exception e) {
                handleParseConversionException(e);
            }
        }

        private void eatText2(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            try {
                _Cat = value;
            } catch (java.lang.Exception e) {
                handleParseConversionException(e);
            }
        }

        private void eatText3(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            try {
                _Assoc = value;
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
                        attIdx = context.getAttribute("", "Prec");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            eatText1(v);
                            state = 9;
                            continue outer;
                        }
                        state = 9;
                        continue outer;
                    case  9 :
                        spawnHandlerFromLeaveElement((((net.sourceforge.czt.z.jaxb.gen.impl.ParaImpl)net.sourceforge.czt.z.jaxb.gen.impl.OptempParaImpl.this).new Unmarshaller(context)), 10, ___uri, ___local, ___qname);
                        return ;
                    case  13 :
                        revertToParentFromLeaveElement(___uri, ___local, ___qname);
                        return ;
                    case  12 :
                        if (("Oper" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            context.popAttributes();
                            state = 13;
                            return ;
                        }
                        break;
                    case  11 :
                        _getOper().add(((net.sourceforge.czt.z.jaxb.gen.impl.OperImpl) spawnChildFromLeaveElement((net.sourceforge.czt.z.jaxb.gen.impl.OperImpl.class), 12, ___uri, ___local, ___qname)));
                        return ;
                    case  3 :
                        attIdx = context.getAttribute("", "Cat");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            eatText2(v);
                            state = 6;
                            continue outer;
                        }
                        break;
                    case  0 :
                        attIdx = context.getAttribute("", "Assoc");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            eatText3(v);
                            state = 3;
                            continue outer;
                        }
                        state = 3;
                        continue outer;
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
                    case  6 :
                        if (("Prec" == ___local)&&("" == ___uri)) {
                            state = 7;
                            return ;
                        }
                        state = 9;
                        continue outer;
                    case  9 :
                        spawnHandlerFromEnterAttribute((((net.sourceforge.czt.z.jaxb.gen.impl.ParaImpl)net.sourceforge.czt.z.jaxb.gen.impl.OptempParaImpl.this).new Unmarshaller(context)), 10, ___uri, ___local, ___qname);
                        return ;
                    case  13 :
                        revertToParentFromEnterAttribute(___uri, ___local, ___qname);
                        return ;
                    case  11 :
                        _getOper().add(((net.sourceforge.czt.z.jaxb.gen.impl.OperImpl) spawnChildFromEnterAttribute((net.sourceforge.czt.z.jaxb.gen.impl.OperImpl.class), 12, ___uri, ___local, ___qname)));
                        return ;
                    case  3 :
                        if (("Cat" == ___local)&&("" == ___uri)) {
                            state = 4;
                            return ;
                        }
                        break;
                    case  0 :
                        if (("Assoc" == ___local)&&("" == ___uri)) {
                            state = 1;
                            return ;
                        }
                        state = 3;
                        continue outer;
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
                    case  6 :
                        attIdx = context.getAttribute("", "Prec");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            eatText1(v);
                            state = 9;
                            continue outer;
                        }
                        state = 9;
                        continue outer;
                    case  9 :
                        spawnHandlerFromLeaveAttribute((((net.sourceforge.czt.z.jaxb.gen.impl.ParaImpl)net.sourceforge.czt.z.jaxb.gen.impl.OptempParaImpl.this).new Unmarshaller(context)), 10, ___uri, ___local, ___qname);
                        return ;
                    case  13 :
                        revertToParentFromLeaveAttribute(___uri, ___local, ___qname);
                        return ;
                    case  2 :
                        if (("Assoc" == ___local)&&("" == ___uri)) {
                            state = 3;
                            return ;
                        }
                        break;
                    case  11 :
                        _getOper().add(((net.sourceforge.czt.z.jaxb.gen.impl.OperImpl) spawnChildFromLeaveAttribute((net.sourceforge.czt.z.jaxb.gen.impl.OperImpl.class), 12, ___uri, ___local, ___qname)));
                        return ;
                    case  5 :
                        if (("Cat" == ___local)&&("" == ___uri)) {
                            state = 6;
                            return ;
                        }
                        break;
                    case  3 :
                        attIdx = context.getAttribute("", "Cat");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            eatText2(v);
                            state = 6;
                            continue outer;
                        }
                        break;
                    case  0 :
                        attIdx = context.getAttribute("", "Assoc");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            eatText3(v);
                            state = 3;
                            continue outer;
                        }
                        state = 3;
                        continue outer;
                    case  8 :
                        if (("Prec" == ___local)&&("" == ___uri)) {
                            state = 9;
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
                        case  6 :
                            attIdx = context.getAttribute("", "Prec");
                            if (attIdx >= 0) {
                                final java.lang.String v = context.eatAttribute(attIdx);
                                eatText1(v);
                                state = 9;
                                continue outer;
                            }
                            state = 9;
                            continue outer;
                        case  9 :
                            spawnHandlerFromText((((net.sourceforge.czt.z.jaxb.gen.impl.ParaImpl)net.sourceforge.czt.z.jaxb.gen.impl.OptempParaImpl.this).new Unmarshaller(context)), 10, value);
                            return ;
                        case  7 :
                            eatText1(value);
                            state = 8;
                            return ;
                        case  13 :
                            revertToParentFromText(value);
                            return ;
                        case  4 :
                            eatText2(value);
                            state = 5;
                            return ;
                        case  11 :
                            _getOper().add(((net.sourceforge.czt.z.jaxb.gen.impl.OperImpl) spawnChildFromText((net.sourceforge.czt.z.jaxb.gen.impl.OperImpl.class), 12, value)));
                            return ;
                        case  3 :
                            attIdx = context.getAttribute("", "Cat");
                            if (attIdx >= 0) {
                                final java.lang.String v = context.eatAttribute(attIdx);
                                eatText2(v);
                                state = 6;
                                continue outer;
                            }
                            break;
                        case  0 :
                            attIdx = context.getAttribute("", "Assoc");
                            if (attIdx >= 0) {
                                final java.lang.String v = context.eatAttribute(attIdx);
                                eatText3(v);
                                state = 3;
                                continue outer;
                            }
                            state = 3;
                            continue outer;
                        case  1 :
                            eatText3(value);
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
