//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.2-b15-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2004.01.29 at 12:59:34 NZDT 
//


package net.sourceforge.czt.zpatt.jaxb.gen.impl;

public class SubstListImpl implements net.sourceforge.czt.zpatt.jaxb.gen.SubstList, com.sun.xml.bind.JAXBObject, net.sourceforge.czt.oz.jaxb.gen.impl.runtime.UnmarshallableObject, net.sourceforge.czt.oz.jaxb.gen.impl.runtime.XMLSerializable, net.sourceforge.czt.oz.jaxb.gen.impl.runtime.ValidatableObject
{

    protected com.sun.xml.bind.util.ListImpl _Substitute = new com.sun.xml.bind.util.ListImpl(new java.util.ArrayList());
    public final static java.lang.Class version = (net.sourceforge.czt.zpatt.jaxb.gen.impl.JAXBVersion.class);
    private static com.sun.msv.grammar.Grammar schemaFragment;

    private final static java.lang.Class PRIMARY_INTERFACE_CLASS() {
        return (net.sourceforge.czt.zpatt.jaxb.gen.SubstList.class);
    }

    public java.util.List getSubstitute() {
        return _Substitute;
    }

    public net.sourceforge.czt.oz.jaxb.gen.impl.runtime.UnmarshallingEventHandler createUnmarshaller(net.sourceforge.czt.oz.jaxb.gen.impl.runtime.UnmarshallingContext context) {
        return new net.sourceforge.czt.zpatt.jaxb.gen.impl.SubstListImpl.Unmarshaller(context);
    }

    public void serializeBody(net.sourceforge.czt.oz.jaxb.gen.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        int idx1 = 0;
        final int len1 = _Substitute.size();
        while (idx1 != len1) {
            if (_Substitute.get(idx1) instanceof javax.xml.bind.Element) {
                context.childAsBody(((com.sun.xml.bind.JAXBObject) _Substitute.get(idx1 ++)), "Substitute");
            } else {
                context.startElement("http://czt.sourceforge.net/zpatt", "Substitute");
                int idx_0 = idx1;
                context.childAsURIs(((com.sun.xml.bind.JAXBObject) _Substitute.get(idx_0 ++)), "Substitute");
                context.endNamespaceDecls();
                int idx_1 = idx1;
                context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _Substitute.get(idx_1 ++)), "Substitute");
                context.endAttributes();
                context.childAsBody(((com.sun.xml.bind.JAXBObject) _Substitute.get(idx1 ++)), "Substitute");
                context.endElement();
            }
        }
    }

    public void serializeAttributes(net.sourceforge.czt.oz.jaxb.gen.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        int idx1 = 0;
        final int len1 = _Substitute.size();
        while (idx1 != len1) {
            if (_Substitute.get(idx1) instanceof javax.xml.bind.Element) {
                context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _Substitute.get(idx1 ++)), "Substitute");
            } else {
                idx1 += 1;
            }
        }
    }

    public void serializeURIs(net.sourceforge.czt.oz.jaxb.gen.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        int idx1 = 0;
        final int len1 = _Substitute.size();
        while (idx1 != len1) {
            if (_Substitute.get(idx1) instanceof javax.xml.bind.Element) {
                context.childAsURIs(((com.sun.xml.bind.JAXBObject) _Substitute.get(idx1 ++)), "Substitute");
            } else {
                idx1 += 1;
            }
        }
    }

    public java.lang.Class getPrimaryInterface() {
        return (net.sourceforge.czt.zpatt.jaxb.gen.SubstList.class);
    }

    public com.sun.msv.verifier.DocumentDeclaration createRawValidator() {
        if (schemaFragment == null) {
            schemaFragment = com.sun.xml.bind.validator.SchemaDeserializer.deserialize((
 "\u00ac\u00ed\u0000\u0005sr\u0000\u001dcom.sun.msv.grammar.ChoiceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun."
+"msv.grammar.BinaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0004exp1t\u0000 Lcom/sun/msv/gramm"
+"ar/Expression;L\u0000\u0004exp2q\u0000~\u0000\u0002xr\u0000\u001ecom.sun.msv.grammar.Expression"
+"\u00f8\u0018\u0082\u00e8N5~O\u0002\u0000\u0003I\u0000\u000ecachedHashCodeL\u0000\u0013epsilonReducibilityt\u0000\u0013Ljava/l"
+"ang/Boolean;L\u0000\u000bexpandedExpq\u0000~\u0000\u0002xp\u0007\u00bc\u00ef:ppsr\u0000 com.sun.msv.gramm"
+"ar.OneOrMoreExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001ccom.sun.msv.grammar.UnaryExp\u0000\u0000"
+"\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\u0003expq\u0000~\u0000\u0002xq\u0000~\u0000\u0003\u0007\u00bc\u00ef/sr\u0000\u0011java.lang.Boolean\u00cd r\u0080\u00d5\u009c\u00fa\u00ee\u0002"
+"\u0000\u0001Z\u0000\u0005valuexp\u0000psq\u0000~\u0000\u0000\u0007\u00bc\u00ef,q\u0000~\u0000\npsr\u0000\'com.sun.msv.grammar.trex.E"
+"lementPattern\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\tnameClasst\u0000\u001fLcom/sun/msv/grammar/"
+"NameClass;xr\u0000\u001ecom.sun.msv.grammar.ElementExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002Z\u0000\u001aig"
+"noreUndeclaredAttributesL\u0000\fcontentModelq\u0000~\u0000\u0002xq\u0000~\u0000\u0003\u0001\u00f8\u00bd/q\u0000~\u0000\np"
+"\u0000sq\u0000~\u0000\u0000\u0001\u00f8\u00bd$ppsq\u0000~\u0000\u0006\u0001\u00f8\u00bd\u0019q\u0000~\u0000\npsr\u0000 com.sun.msv.grammar.Attribu"
+"teExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003expq\u0000~\u0000\u0002L\u0000\tnameClassq\u0000~\u0000\rxq\u0000~\u0000\u0003\u0001\u00f8\u00bd\u0016q\u0000~\u0000\np"
+"sr\u00002com.sun.msv.grammar.Expression$AnyStringExpression\u0000\u0000\u0000\u0000\u0000\u0000"
+"\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003\u0000\u0000\u0000\bsq\u0000~\u0000\t\u0001q\u0000~\u0000\u0015sr\u0000 com.sun.msv.grammar.AnyNameCl"
+"ass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun.msv.grammar.NameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xp"
+"sr\u00000com.sun.msv.grammar.Expression$EpsilonExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001"
+"\u0002\u0000\u0000xq\u0000~\u0000\u0003\u0000\u0000\u0000\tq\u0000~\u0000\u0016q\u0000~\u0000\u001bsr\u0000#com.sun.msv.grammar.SimpleNameCla"
+"ss\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\tlocalNamet\u0000\u0012Ljava/lang/String;L\u0000\fnamespaceUR"
+"Iq\u0000~\u0000\u001dxq\u0000~\u0000\u0018t\u00004net.sourceforge.czt.zpatt.jaxb.gen.Substitute"
+"Elementt\u0000+http://java.sun.com/jaxb/xjc/dummy-elementssq\u0000~\u0000\f\u0005"
+"\u00c41\u00fbq\u0000~\u0000\np\u0000sr\u0000\u001fcom.sun.msv.grammar.SequenceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~"
+"\u0000\u0001\u0005\u00c41\u00f0ppsq\u0000~\u0000\f\u0001\u00f8\u00bd/pp\u0000sq\u0000~\u0000\u0000\u0001\u00f8\u00bd$ppsq\u0000~\u0000\u0006\u0001\u00f8\u00bd\u0019q\u0000~\u0000\npsq\u0000~\u0000\u0012\u0001\u00f8\u00bd\u0016q"
+"\u0000~\u0000\npq\u0000~\u0000\u0015q\u0000~\u0000\u0019q\u0000~\u0000\u001bsq\u0000~\u0000\u001ct\u0000-net.sourceforge.czt.zpatt.jaxb."
+"gen.Substituteq\u0000~\u0000 sq\u0000~\u0000\u0000\u0003\u00cbt\u00bcppsq\u0000~\u0000\u0012\u0003\u00cbt\u00b1q\u0000~\u0000\npsr\u0000\u001bcom.sun.m"
+"sv.grammar.DataExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\u0002dtt\u0000\u001fLorg/relaxng/datatype/D"
+"atatype;L\u0000\u0006exceptq\u0000~\u0000\u0002L\u0000\u0004namet\u0000\u001dLcom/sun/msv/util/StringPair"
+";xq\u0000~\u0000\u0003\u0001\u00eb\u0090]ppsr\u0000\"com.sun.msv.datatype.xsd.QnameType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002"
+"\u0000\u0000xr\u0000*com.sun.msv.datatype.xsd.BuiltinAtomicType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000x"
+"r\u0000%com.sun.msv.datatype.xsd.ConcreteType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\'com.s"
+"un.msv.datatype.xsd.XSDatatypeImpl\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\fnamespaceUri"
+"q\u0000~\u0000\u001dL\u0000\btypeNameq\u0000~\u0000\u001dL\u0000\nwhiteSpacet\u0000.Lcom/sun/msv/datatype/x"
+"sd/WhiteSpaceProcessor;xpt\u0000 http://www.w3.org/2001/XMLSchema"
+"t\u0000\u0005QNamesr\u00005com.sun.msv.datatype.xsd.WhiteSpaceProcessor$Col"
+"lapse\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000,com.sun.msv.datatype.xsd.WhiteSpaceProce"
+"ssor\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com.sun.msv.grammar.Expression$NullSetE"
+"xpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003\u0000\u0000\u0000\nq\u0000~\u0000\npsr\u0000\u001bcom.sun.msv.util.Str"
+"ingPair\u00d0t\u001ejB\u008f\u008d\u00a0\u0002\u0000\u0002L\u0000\tlocalNameq\u0000~\u0000\u001dL\u0000\fnamespaceURIq\u0000~\u0000\u001dxpq\u0000~"
+"\u00007q\u0000~\u00006sq\u0000~\u0000\u001ct\u0000\u0004typet\u0000)http://www.w3.org/2001/XMLSchema-inst"
+"anceq\u0000~\u0000\u001bsq\u0000~\u0000\u001ct\u0000\nSubstitutet\u0000 http://czt.sourceforge.net/zp"
+"attq\u0000~\u0000\u001bsr\u0000\"com.sun.msv.grammar.ExpressionPool\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\b"
+"expTablet\u0000/Lcom/sun/msv/grammar/ExpressionPool$ClosedHash;xp"
+"sr\u0000-com.sun.msv.grammar.ExpressionPool$ClosedHash\u00d7j\u00d0N\u00ef\u00e8\u00ed\u001c\u0002\u0000\u0004"
+"I\u0000\u0005countI\u0000\tthresholdL\u0000\u0006parentq\u0000~\u0000F[\u0000\u0005tablet\u0000![Lcom/sun/msv/g"
+"rammar/Expression;xp\u0000\u0000\u0000\t\u0000\u0000\u00009pur\u0000![Lcom.sun.msv.grammar.Expre"
+"ssion;\u00d68D\u00c3]\u00ad\u00a7\n\u0002\u0000\u0000xp\u0000\u0000\u0000\u00bfppq\u0000~\u0000\bppppppppppq\u0000~\u0000\u0005pppppppppppppq\u0000"
+"~\u0000\u0011q\u0000~\u0000&pppppppppq\u0000~\u0000\u0010q\u0000~\u0000%ppppppppppppppppppppppppppppppppp"
+"pq\u0000~\u0000*pppppppppppppppppppppppppppppppppppppppppppppppppppppq"
+"\u0000~\u0000#pppppppppppppppppppppppppppppppppppppppppppppppppppppppp"
+"pppppq\u0000~\u0000\u000b"));
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
            return net.sourceforge.czt.zpatt.jaxb.gen.impl.SubstListImpl.this;
        }

        public void enterElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname, org.xml.sax.Attributes __atts)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  1 :
                        if (("Substitute" == ___local)&&("http://czt.sourceforge.net/zpatt" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 2;
                            return ;
                        }
                        if (("Substitute" == ___local)&&("http://czt.sourceforge.net/zpatt" == ___uri)) {
                            _Substitute.add(((net.sourceforge.czt.zpatt.jaxb.gen.impl.SubstituteElementImpl) spawnChildFromEnterElement((net.sourceforge.czt.zpatt.jaxb.gen.impl.SubstituteElementImpl.class), 1, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        revertToParentFromEnterElement(___uri, ___local, ___qname, __atts);
                        return ;
                    case  0 :
                        if (("Substitute" == ___local)&&("http://czt.sourceforge.net/zpatt" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 2;
                            return ;
                        }
                        if (("Substitute" == ___local)&&("http://czt.sourceforge.net/zpatt" == ___uri)) {
                            _Substitute.add(((net.sourceforge.czt.zpatt.jaxb.gen.impl.SubstituteElementImpl) spawnChildFromEnterElement((net.sourceforge.czt.zpatt.jaxb.gen.impl.SubstituteElementImpl.class), 1, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        state = 1;
                        continue outer;
                    case  2 :
                        if (("DecorExpr" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Substitute.add(((net.sourceforge.czt.zpatt.jaxb.gen.impl.SubstituteImpl) spawnChildFromEnterElement((net.sourceforge.czt.zpatt.jaxb.gen.impl.SubstituteImpl.class), 3, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("ProdExpr" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Substitute.add(((net.sourceforge.czt.zpatt.jaxb.gen.impl.SubstituteImpl) spawnChildFromEnterElement((net.sourceforge.czt.zpatt.jaxb.gen.impl.SubstituteImpl.class), 3, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("BindExpr" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Substitute.add(((net.sourceforge.czt.zpatt.jaxb.gen.impl.SubstituteImpl) spawnChildFromEnterElement((net.sourceforge.czt.zpatt.jaxb.gen.impl.SubstituteImpl.class), 3, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("LetExpr" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Substitute.add(((net.sourceforge.czt.zpatt.jaxb.gen.impl.SubstituteImpl) spawnChildFromEnterElement((net.sourceforge.czt.zpatt.jaxb.gen.impl.SubstituteImpl.class), 3, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("ExistsExpr" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Substitute.add(((net.sourceforge.czt.zpatt.jaxb.gen.impl.SubstituteImpl) spawnChildFromEnterElement((net.sourceforge.czt.zpatt.jaxb.gen.impl.SubstituteImpl.class), 3, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("ThetaExpr" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Substitute.add(((net.sourceforge.czt.zpatt.jaxb.gen.impl.SubstituteImpl) spawnChildFromEnterElement((net.sourceforge.czt.zpatt.jaxb.gen.impl.SubstituteImpl.class), 3, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("TupleSelExpr" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Substitute.add(((net.sourceforge.czt.zpatt.jaxb.gen.impl.SubstituteImpl) spawnChildFromEnterElement((net.sourceforge.czt.zpatt.jaxb.gen.impl.SubstituteImpl.class), 3, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("ForallExpr" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Substitute.add(((net.sourceforge.czt.zpatt.jaxb.gen.impl.SubstituteImpl) spawnChildFromEnterElement((net.sourceforge.czt.zpatt.jaxb.gen.impl.SubstituteImpl.class), 3, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("SetExpr" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Substitute.add(((net.sourceforge.czt.zpatt.jaxb.gen.impl.SubstituteImpl) spawnChildFromEnterElement((net.sourceforge.czt.zpatt.jaxb.gen.impl.SubstituteImpl.class), 3, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("PipeExpr" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Substitute.add(((net.sourceforge.czt.zpatt.jaxb.gen.impl.SubstituteImpl) spawnChildFromEnterElement((net.sourceforge.czt.zpatt.jaxb.gen.impl.SubstituteImpl.class), 3, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("ImpliesExpr" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Substitute.add(((net.sourceforge.czt.zpatt.jaxb.gen.impl.SubstituteImpl) spawnChildFromEnterElement((net.sourceforge.czt.zpatt.jaxb.gen.impl.SubstituteImpl.class), 3, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("PowerExpr" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Substitute.add(((net.sourceforge.czt.zpatt.jaxb.gen.impl.SubstituteImpl) spawnChildFromEnterElement((net.sourceforge.czt.zpatt.jaxb.gen.impl.SubstituteImpl.class), 3, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("Expr1" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Substitute.add(((net.sourceforge.czt.zpatt.jaxb.gen.impl.SubstituteImpl) spawnChildFromEnterElement((net.sourceforge.czt.zpatt.jaxb.gen.impl.SubstituteImpl.class), 3, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("JokerExpr" == ___local)&&("http://czt.sourceforge.net/zpatt" == ___uri)) {
                            _Substitute.add(((net.sourceforge.czt.zpatt.jaxb.gen.impl.SubstituteImpl) spawnChildFromEnterElement((net.sourceforge.czt.zpatt.jaxb.gen.impl.SubstituteImpl.class), 3, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("RenameExpr" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Substitute.add(((net.sourceforge.czt.zpatt.jaxb.gen.impl.SubstituteImpl) spawnChildFromEnterElement((net.sourceforge.czt.zpatt.jaxb.gen.impl.SubstituteImpl.class), 3, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("Exists1Expr" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Substitute.add(((net.sourceforge.czt.zpatt.jaxb.gen.impl.SubstituteImpl) spawnChildFromEnterElement((net.sourceforge.czt.zpatt.jaxb.gen.impl.SubstituteImpl.class), 3, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("ApplExpr" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Substitute.add(((net.sourceforge.czt.zpatt.jaxb.gen.impl.SubstituteImpl) spawnChildFromEnterElement((net.sourceforge.czt.zpatt.jaxb.gen.impl.SubstituteImpl.class), 3, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("LambdaExpr" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Substitute.add(((net.sourceforge.czt.zpatt.jaxb.gen.impl.SubstituteImpl) spawnChildFromEnterElement((net.sourceforge.czt.zpatt.jaxb.gen.impl.SubstituteImpl.class), 3, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("SchExpr2" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Substitute.add(((net.sourceforge.czt.zpatt.jaxb.gen.impl.SubstituteImpl) spawnChildFromEnterElement((net.sourceforge.czt.zpatt.jaxb.gen.impl.SubstituteImpl.class), 3, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("RefExpr" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Substitute.add(((net.sourceforge.czt.zpatt.jaxb.gen.impl.SubstituteImpl) spawnChildFromEnterElement((net.sourceforge.czt.zpatt.jaxb.gen.impl.SubstituteImpl.class), 3, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("AndExpr" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Substitute.add(((net.sourceforge.czt.zpatt.jaxb.gen.impl.SubstituteImpl) spawnChildFromEnterElement((net.sourceforge.czt.zpatt.jaxb.gen.impl.SubstituteImpl.class), 3, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("QntExpr" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Substitute.add(((net.sourceforge.czt.zpatt.jaxb.gen.impl.SubstituteImpl) spawnChildFromEnterElement((net.sourceforge.czt.zpatt.jaxb.gen.impl.SubstituteImpl.class), 3, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("IffExpr" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Substitute.add(((net.sourceforge.czt.zpatt.jaxb.gen.impl.SubstituteImpl) spawnChildFromEnterElement((net.sourceforge.czt.zpatt.jaxb.gen.impl.SubstituteImpl.class), 3, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("TupleExpr" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Substitute.add(((net.sourceforge.czt.zpatt.jaxb.gen.impl.SubstituteImpl) spawnChildFromEnterElement((net.sourceforge.czt.zpatt.jaxb.gen.impl.SubstituteImpl.class), 3, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("Expr2N" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Substitute.add(((net.sourceforge.czt.zpatt.jaxb.gen.impl.SubstituteImpl) spawnChildFromEnterElement((net.sourceforge.czt.zpatt.jaxb.gen.impl.SubstituteImpl.class), 3, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("Expr0N" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Substitute.add(((net.sourceforge.czt.zpatt.jaxb.gen.impl.SubstituteImpl) spawnChildFromEnterElement((net.sourceforge.czt.zpatt.jaxb.gen.impl.SubstituteImpl.class), 3, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("HideExpr" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Substitute.add(((net.sourceforge.czt.zpatt.jaxb.gen.impl.SubstituteImpl) spawnChildFromEnterElement((net.sourceforge.czt.zpatt.jaxb.gen.impl.SubstituteImpl.class), 3, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("CondExpr" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Substitute.add(((net.sourceforge.czt.zpatt.jaxb.gen.impl.SubstituteImpl) spawnChildFromEnterElement((net.sourceforge.czt.zpatt.jaxb.gen.impl.SubstituteImpl.class), 3, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("SetCompExpr" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Substitute.add(((net.sourceforge.czt.zpatt.jaxb.gen.impl.SubstituteImpl) spawnChildFromEnterElement((net.sourceforge.czt.zpatt.jaxb.gen.impl.SubstituteImpl.class), 3, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("PreExpr" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Substitute.add(((net.sourceforge.czt.zpatt.jaxb.gen.impl.SubstituteImpl) spawnChildFromEnterElement((net.sourceforge.czt.zpatt.jaxb.gen.impl.SubstituteImpl.class), 3, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("BindSelExpr" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Substitute.add(((net.sourceforge.czt.zpatt.jaxb.gen.impl.SubstituteImpl) spawnChildFromEnterElement((net.sourceforge.czt.zpatt.jaxb.gen.impl.SubstituteImpl.class), 3, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("ProjExpr" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Substitute.add(((net.sourceforge.czt.zpatt.jaxb.gen.impl.SubstituteImpl) spawnChildFromEnterElement((net.sourceforge.czt.zpatt.jaxb.gen.impl.SubstituteImpl.class), 3, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("Expr2" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Substitute.add(((net.sourceforge.czt.zpatt.jaxb.gen.impl.SubstituteImpl) spawnChildFromEnterElement((net.sourceforge.czt.zpatt.jaxb.gen.impl.SubstituteImpl.class), 3, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("Qnt1Expr" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Substitute.add(((net.sourceforge.czt.zpatt.jaxb.gen.impl.SubstituteImpl) spawnChildFromEnterElement((net.sourceforge.czt.zpatt.jaxb.gen.impl.SubstituteImpl.class), 3, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("SchExpr" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Substitute.add(((net.sourceforge.czt.zpatt.jaxb.gen.impl.SubstituteImpl) spawnChildFromEnterElement((net.sourceforge.czt.zpatt.jaxb.gen.impl.SubstituteImpl.class), 3, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("CompExpr" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Substitute.add(((net.sourceforge.czt.zpatt.jaxb.gen.impl.SubstituteImpl) spawnChildFromEnterElement((net.sourceforge.czt.zpatt.jaxb.gen.impl.SubstituteImpl.class), 3, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("NumExpr" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Substitute.add(((net.sourceforge.czt.zpatt.jaxb.gen.impl.SubstituteImpl) spawnChildFromEnterElement((net.sourceforge.czt.zpatt.jaxb.gen.impl.SubstituteImpl.class), 3, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("MuExpr" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Substitute.add(((net.sourceforge.czt.zpatt.jaxb.gen.impl.SubstituteImpl) spawnChildFromEnterElement((net.sourceforge.czt.zpatt.jaxb.gen.impl.SubstituteImpl.class), 3, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("OrExpr" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Substitute.add(((net.sourceforge.czt.zpatt.jaxb.gen.impl.SubstituteImpl) spawnChildFromEnterElement((net.sourceforge.czt.zpatt.jaxb.gen.impl.SubstituteImpl.class), 3, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("NegExpr" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Substitute.add(((net.sourceforge.czt.zpatt.jaxb.gen.impl.SubstituteImpl) spawnChildFromEnterElement((net.sourceforge.czt.zpatt.jaxb.gen.impl.SubstituteImpl.class), 3, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("Expr" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Substitute.add(((net.sourceforge.czt.zpatt.jaxb.gen.impl.SubstituteImpl) spawnChildFromEnterElement((net.sourceforge.czt.zpatt.jaxb.gen.impl.SubstituteImpl.class), 3, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("Expr" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Substitute.add(((net.sourceforge.czt.zpatt.jaxb.gen.impl.SubstituteImpl) spawnChildFromEnterElement((net.sourceforge.czt.zpatt.jaxb.gen.impl.SubstituteImpl.class), 3, ___uri, ___local, ___qname, __atts)));
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
                        revertToParentFromLeaveElement(___uri, ___local, ___qname);
                        return ;
                    case  0 :
                        state = 1;
                        continue outer;
                    case  3 :
                        if (("Substitute" == ___local)&&("http://czt.sourceforge.net/zpatt" == ___uri)) {
                            context.popAttributes();
                            state = 1;
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
                        revertToParentFromEnterAttribute(___uri, ___local, ___qname);
                        return ;
                    case  0 :
                        state = 1;
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
                    case  1 :
                        revertToParentFromLeaveAttribute(___uri, ___local, ___qname);
                        return ;
                    case  0 :
                        state = 1;
                        continue outer;
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
                            revertToParentFromText(value);
                            return ;
                        case  0 :
                            state = 1;
                            continue outer;
                    }
                } catch (java.lang.RuntimeException e) {
                    handleUnexpectedTextException(value, e);
                }
                break;
            }
        }

    }

}
