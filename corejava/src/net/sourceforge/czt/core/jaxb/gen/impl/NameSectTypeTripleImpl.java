//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.1-05/30/2003 05:06 AM(java_re)-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2003.10.08 at 02:45:10 NZDT 
//


package net.sourceforge.czt.core.jaxb.gen.impl;

public class NameSectTypeTripleImpl implements net.sourceforge.czt.core.jaxb.gen.NameSectTypeTriple, com.sun.xml.bind.JAXBObject, net.sourceforge.czt.zpatt.jaxb.gen.impl.runtime.UnmarshallableObject, net.sourceforge.czt.zpatt.jaxb.gen.impl.runtime.XMLSerializable, net.sourceforge.czt.zpatt.jaxb.gen.impl.runtime.ValidatableObject
{

    protected net.sourceforge.czt.core.jaxb.gen.Type _Type;
    protected net.sourceforge.czt.core.jaxb.gen.DeclName _Name;
    protected java.lang.String _Sect;
    public final static java.lang.Class version = (net.sourceforge.czt.core.jaxb.gen.impl.JAXBVersion.class);
    private static com.sun.msv.grammar.Grammar schemaFragment;

    private final static java.lang.Class PRIMARY_INTERFACE_CLASS() {
        return (net.sourceforge.czt.core.jaxb.gen.NameSectTypeTriple.class);
    }

    public net.sourceforge.czt.core.jaxb.gen.Type getType() {
        return _Type;
    }

    public void setType(net.sourceforge.czt.core.jaxb.gen.Type value) {
        _Type = value;
    }

    public net.sourceforge.czt.core.jaxb.gen.DeclName getName() {
        return _Name;
    }

    public void setName(net.sourceforge.czt.core.jaxb.gen.DeclName value) {
        _Name = value;
    }

    public java.lang.String getSect() {
        return _Sect;
    }

    public void setSect(java.lang.String value) {
        _Sect = value;
    }

    public net.sourceforge.czt.zpatt.jaxb.gen.impl.runtime.UnmarshallingEventHandler createUnmarshaller(net.sourceforge.czt.zpatt.jaxb.gen.impl.runtime.UnmarshallingContext context) {
        return new net.sourceforge.czt.core.jaxb.gen.impl.NameSectTypeTripleImpl.Unmarshaller(context);
    }

    public void serializeElementBody(net.sourceforge.czt.zpatt.jaxb.gen.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        context.startElement("http://czt.sourceforge.net/zml", "Name");
        context.childAsURIs(((com.sun.xml.bind.JAXBObject) _Name));
        context.endNamespaceDecls();
        context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _Name));
        context.endAttributes();
        context.childAsElementBody(((com.sun.xml.bind.JAXBObject) _Name));
        context.endElement();
        context.startElement("http://czt.sourceforge.net/zml", "Sect");
        context.endNamespaceDecls();
        context.endAttributes();
        try {
            context.text(((java.lang.String) _Sect));
        } catch (java.lang.Exception e) {
            net.sourceforge.czt.zpatt.jaxb.gen.impl.runtime.Util.handlePrintConversionException(this, e, context);
        }
        context.endElement();
        if (_Type instanceof net.sourceforge.czt.core.jaxb.gen.Type) {
            if (_Type instanceof javax.xml.bind.Element) {
                context.childAsElementBody(((com.sun.xml.bind.JAXBObject) _Type));
            } else {
                context.startElement("http://czt.sourceforge.net/zml", "Type");
                context.childAsURIs(((com.sun.xml.bind.JAXBObject) _Type));
                context.endNamespaceDecls();
                context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _Type));
                context.endAttributes();
                context.childAsElementBody(((com.sun.xml.bind.JAXBObject) _Type));
                context.endElement();
            }
        } else {
            if (_Type instanceof net.sourceforge.czt.core.jaxb.gen.GenTypeElement) {
                context.childAsElementBody(((com.sun.xml.bind.JAXBObject) _Type));
            } else {
                if (_Type instanceof net.sourceforge.czt.core.jaxb.gen.ProdTypeElement) {
                    context.childAsElementBody(((com.sun.xml.bind.JAXBObject) _Type));
                } else {
                    if (_Type instanceof net.sourceforge.czt.core.jaxb.gen.PowerTypeElement) {
                        context.childAsElementBody(((com.sun.xml.bind.JAXBObject) _Type));
                    } else {
                        if (_Type instanceof net.sourceforge.czt.core.jaxb.gen.SchemaTypeElement) {
                            context.childAsElementBody(((com.sun.xml.bind.JAXBObject) _Type));
                        } else {
                            if (_Type instanceof net.sourceforge.czt.core.jaxb.gen.GivenTypeElement) {
                                context.childAsElementBody(((com.sun.xml.bind.JAXBObject) _Type));
                            } else {
                                throw new org.xml.sax.SAXException("type mismatch error");
                            }
                        }
                    }
                }
            }
        }
    }

    public void serializeAttributes(net.sourceforge.czt.zpatt.jaxb.gen.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        if (!(_Type instanceof net.sourceforge.czt.core.jaxb.gen.Type)) {
            if (_Type instanceof net.sourceforge.czt.core.jaxb.gen.GenTypeElement) {
                context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _Type));
            } else {
                if (_Type instanceof net.sourceforge.czt.core.jaxb.gen.ProdTypeElement) {
                    context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _Type));
                } else {
                    if (_Type instanceof net.sourceforge.czt.core.jaxb.gen.PowerTypeElement) {
                        context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _Type));
                    } else {
                        if (_Type instanceof net.sourceforge.czt.core.jaxb.gen.SchemaTypeElement) {
                            context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _Type));
                        } else {
                            if (_Type instanceof net.sourceforge.czt.core.jaxb.gen.GivenTypeElement) {
                                context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _Type));
                            } else {
                                throw new org.xml.sax.SAXException("type mismatch error");
                            }
                        }
                    }
                }
            }
        }
    }

    public void serializeAttributeBody(net.sourceforge.czt.zpatt.jaxb.gen.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        context.startElement("http://czt.sourceforge.net/zml", "Name");
        context.childAsURIs(((com.sun.xml.bind.JAXBObject) _Name));
        context.endNamespaceDecls();
        context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _Name));
        context.endAttributes();
        context.childAsElementBody(((com.sun.xml.bind.JAXBObject) _Name));
        context.endElement();
        context.startElement("http://czt.sourceforge.net/zml", "Sect");
        context.endNamespaceDecls();
        context.endAttributes();
        try {
            context.text(((java.lang.String) _Sect));
        } catch (java.lang.Exception e) {
            net.sourceforge.czt.zpatt.jaxb.gen.impl.runtime.Util.handlePrintConversionException(this, e, context);
        }
        context.endElement();
        if (_Type instanceof net.sourceforge.czt.core.jaxb.gen.Type) {
            if (_Type instanceof javax.xml.bind.Element) {
                context.childAsAttributeBody(((com.sun.xml.bind.JAXBObject) _Type));
            } else {
                context.startElement("http://czt.sourceforge.net/zml", "Type");
                context.childAsURIs(((com.sun.xml.bind.JAXBObject) _Type));
                context.endNamespaceDecls();
                context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _Type));
                context.endAttributes();
                context.childAsElementBody(((com.sun.xml.bind.JAXBObject) _Type));
                context.endElement();
            }
        } else {
            if (_Type instanceof net.sourceforge.czt.core.jaxb.gen.GenTypeElement) {
                context.childAsAttributeBody(((com.sun.xml.bind.JAXBObject) _Type));
            } else {
                if (_Type instanceof net.sourceforge.czt.core.jaxb.gen.ProdTypeElement) {
                    context.childAsAttributeBody(((com.sun.xml.bind.JAXBObject) _Type));
                } else {
                    if (_Type instanceof net.sourceforge.czt.core.jaxb.gen.PowerTypeElement) {
                        context.childAsAttributeBody(((com.sun.xml.bind.JAXBObject) _Type));
                    } else {
                        if (_Type instanceof net.sourceforge.czt.core.jaxb.gen.SchemaTypeElement) {
                            context.childAsAttributeBody(((com.sun.xml.bind.JAXBObject) _Type));
                        } else {
                            if (_Type instanceof net.sourceforge.czt.core.jaxb.gen.GivenTypeElement) {
                                context.childAsAttributeBody(((com.sun.xml.bind.JAXBObject) _Type));
                            } else {
                                throw new org.xml.sax.SAXException("type mismatch error");
                            }
                        }
                    }
                }
            }
        }
    }

    public void serializeURIs(net.sourceforge.czt.zpatt.jaxb.gen.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        if (!(_Type instanceof net.sourceforge.czt.core.jaxb.gen.Type)) {
            if (_Type instanceof net.sourceforge.czt.core.jaxb.gen.GenTypeElement) {
                context.childAsURIs(((com.sun.xml.bind.JAXBObject) _Type));
            } else {
                if (_Type instanceof net.sourceforge.czt.core.jaxb.gen.ProdTypeElement) {
                    context.childAsURIs(((com.sun.xml.bind.JAXBObject) _Type));
                } else {
                    if (_Type instanceof net.sourceforge.czt.core.jaxb.gen.PowerTypeElement) {
                        context.childAsURIs(((com.sun.xml.bind.JAXBObject) _Type));
                    } else {
                        if (_Type instanceof net.sourceforge.czt.core.jaxb.gen.SchemaTypeElement) {
                            context.childAsURIs(((com.sun.xml.bind.JAXBObject) _Type));
                        } else {
                            if (_Type instanceof net.sourceforge.czt.core.jaxb.gen.GivenTypeElement) {
                                context.childAsURIs(((com.sun.xml.bind.JAXBObject) _Type));
                            } else {
                                throw new org.xml.sax.SAXException("type mismatch error");
                            }
                        }
                    }
                }
            }
        }
    }

    public java.lang.Class getPrimaryInterface() {
        return (net.sourceforge.czt.core.jaxb.gen.NameSectTypeTriple.class);
    }

    public com.sun.msv.verifier.DocumentDeclaration createRawValidator() {
        if (schemaFragment == null) {
            schemaFragment = com.sun.xml.bind.validator.SchemaDeserializer.deserialize((
 "\u00ac\u00ed\u0000\u0005sr\u0000\u001fcom.sun.msv.grammar.SequenceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.su"
+"n.msv.grammar.BinaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0004exp1t\u0000 Lcom/sun/msv/gra"
+"mmar/Expression;L\u0000\u0004exp2q\u0000~\u0000\u0002xr\u0000\u001ecom.sun.msv.grammar.Expressi"
+"on\u00f8\u0018\u0082\u00e8N5~O\u0002\u0000\u0003I\u0000\u000ecachedHashCodeL\u0000\u0013epsilonReducibilityt\u0000\u0013Ljava"
+"/lang/Boolean;L\u0000\u000bexpandedExpq\u0000~\u0000\u0002xp\n\u0001\u00a7Kppsq\u0000~\u0000\u0000\u0002\u0090\u00d5\u0006ppsr\u0000\'com"
+".sun.msv.grammar.trex.ElementPattern\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\tnameClasst"
+"\u0000\u001fLcom/sun/msv/grammar/NameClass;xr\u0000\u001ecom.sun.msv.grammar.Ele"
+"mentExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002Z\u0000\u001aignoreUndeclaredAttributesL\u0000\fcontentMod"
+"elq\u0000~\u0000\u0002xq\u0000~\u0000\u0003\u0001|\u00f6\u00e3pp\u0000sq\u0000~\u0000\u0007\u0001|\u00f6\u00d8pp\u0000sr\u0000\u001dcom.sun.msv.grammar.Cho"
+"iceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0001\u0001|\u00f6\u00cdppsr\u0000 com.sun.msv.grammar.OneOrMo"
+"reExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001ccom.sun.msv.grammar.UnaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L"
+"\u0000\u0003expq\u0000~\u0000\u0002xq\u0000~\u0000\u0003\u0001|\u00f6\u00c2sr\u0000\u0011java.lang.Boolean\u00cd r\u0080\u00d5\u009c\u00fa\u00ee\u0002\u0000\u0001Z\u0000\u0005value"
+"xp\u0000psr\u0000 com.sun.msv.grammar.AttributeExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003expq\u0000~"
+"\u0000\u0002L\u0000\tnameClassq\u0000~\u0000\bxq\u0000~\u0000\u0003\u0001|\u00f6\u00bfq\u0000~\u0000\u0012psr\u00002com.sun.msv.grammar.E"
+"xpression$AnyStringExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003\u0000\u0000\u0000\bsq\u0000~\u0000\u0011\u0001q\u0000~"
+"\u0000\u0016sr\u0000 com.sun.msv.grammar.AnyNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun"
+".msv.grammar.NameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com.sun.msv.grammar.E"
+"xpression$EpsilonExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003\u0000\u0000\u0000\tq\u0000~\u0000\u0017q\u0000~\u0000\u001csr"
+"\u0000#com.sun.msv.grammar.SimpleNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\tlocalName"
+"t\u0000\u0012Ljava/lang/String;L\u0000\fnamespaceURIq\u0000~\u0000\u001exq\u0000~\u0000\u0019t\u0000*net.source"
+"forge.czt.core.jaxb.gen.DeclNamet\u0000+http://java.sun.com/jaxb/"
+"xjc/dummy-elementssq\u0000~\u0000\u001dt\u0000\u0004Namet\u0000\u001ehttp://czt.sourceforge.net"
+"/zmlsq\u0000~\u0000\u0007\u0001\u0013\u00de\u001epp\u0000sr\u0000\u001bcom.sun.msv.grammar.DataExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L"
+"\u0000\u0002dtt\u0000\u001fLorg/relaxng/datatype/Datatype;L\u0000\u0006exceptq\u0000~\u0000\u0002L\u0000\u0004namet"
+"\u0000\u001dLcom/sun/msv/util/StringPair;xq\u0000~\u0000\u0003\u0001\u0013\u00de\u0013q\u0000~\u0000\u0012psr\u0000#com.sun.m"
+"sv.datatype.xsd.StringType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001Z\u0000\risAlwaysValidxr\u0000*com"
+".sun.msv.datatype.xsd.BuiltinAtomicType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000%com.su"
+"n.msv.datatype.xsd.ConcreteType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\'com.sun.msv.da"
+"tatype.xsd.XSDatatypeImpl\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\fnamespaceUriq\u0000~\u0000\u001eL\u0000\bt"
+"ypeNameq\u0000~\u0000\u001eL\u0000\nwhiteSpacet\u0000.Lcom/sun/msv/datatype/xsd/WhiteS"
+"paceProcessor;xpt\u0000 http://www.w3.org/2001/XMLSchemat\u0000\u0006string"
+"sr\u00005com.sun.msv.datatype.xsd.WhiteSpaceProcessor$Preserve\u0000\u0000\u0000"
+"\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000,com.sun.msv.datatype.xsd.WhiteSpaceProcessor\u0000\u0000\u0000\u0000"
+"\u0000\u0000\u0000\u0001\u0002\u0000\u0000xp\u0001sr\u00000com.sun.msv.grammar.Expression$NullSetExpressi"
+"on\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003\u0000\u0000\u0000\nq\u0000~\u0000\u0012psr\u0000\u001bcom.sun.msv.util.StringPair"
+"\u00d0t\u001ejB\u008f\u008d\u00a0\u0002\u0000\u0002L\u0000\tlocalNameq\u0000~\u0000\u001eL\u0000\fnamespaceURIq\u0000~\u0000\u001expq\u0000~\u00001q\u0000~\u00000"
+"sq\u0000~\u0000\u001dt\u0000\u0004Sectq\u0000~\u0000$sq\u0000~\u0000\f\u0007p\u00d2@ppsq\u0000~\u0000\f\u0005\u00f3\u00dbfppsq\u0000~\u0000\f\u0004v\u00e4\u008cppsq\u0000~\u0000\f"
+"\u0002\u00f9\u00ed\u00b2ppsq\u0000~\u0000\u0007\u0001|\u00f6\u00d8pp\u0000sq\u0000~\u0000\f\u0001|\u00f6\u00cdppsq\u0000~\u0000\u000e\u0001|\u00f6\u00c2q\u0000~\u0000\u0012psq\u0000~\u0000\u0013\u0001|\u00f6\u00bfq\u0000~"
+"\u0000\u0012pq\u0000~\u0000\u0016q\u0000~\u0000\u001aq\u0000~\u0000\u001csq\u0000~\u0000\u001dt\u00000net.sourceforge.czt.core.jaxb.gen"
+".GenTypeElementq\u0000~\u0000!sq\u0000~\u0000\u0007\u0001|\u00f6\u00d8pp\u0000sq\u0000~\u0000\f\u0001|\u00f6\u00cdppsq\u0000~\u0000\u000e\u0001|\u00f6\u00c2q\u0000~\u0000\u0012"
+"psq\u0000~\u0000\u0013\u0001|\u00f6\u00bfq\u0000~\u0000\u0012pq\u0000~\u0000\u0016q\u0000~\u0000\u001aq\u0000~\u0000\u001csq\u0000~\u0000\u001dt\u00001net.sourceforge.czt"
+".core.jaxb.gen.ProdTypeElementq\u0000~\u0000!sq\u0000~\u0000\u0007\u0001|\u00f6\u00d8pp\u0000sq\u0000~\u0000\f\u0001|\u00f6\u00cdpp"
+"sq\u0000~\u0000\u000e\u0001|\u00f6\u00c2q\u0000~\u0000\u0012psq\u0000~\u0000\u0013\u0001|\u00f6\u00bfq\u0000~\u0000\u0012pq\u0000~\u0000\u0016q\u0000~\u0000\u001aq\u0000~\u0000\u001csq\u0000~\u0000\u001dt\u00002net."
+"sourceforge.czt.core.jaxb.gen.PowerTypeElementq\u0000~\u0000!sq\u0000~\u0000\u0007\u0001|\u00f6"
+"\u00d8pp\u0000sq\u0000~\u0000\f\u0001|\u00f6\u00cdppsq\u0000~\u0000\u000e\u0001|\u00f6\u00c2q\u0000~\u0000\u0012psq\u0000~\u0000\u0013\u0001|\u00f6\u00bfq\u0000~\u0000\u0012pq\u0000~\u0000\u0016q\u0000~\u0000\u001aq\u0000"
+"~\u0000\u001csq\u0000~\u0000\u001dt\u00003net.sourceforge.czt.core.jaxb.gen.SchemaTypeElem"
+"entq\u0000~\u0000!sq\u0000~\u0000\u0007\u0001|\u00f6\u00d8pp\u0000sq\u0000~\u0000\f\u0001|\u00f6\u00cdppsq\u0000~\u0000\u000e\u0001|\u00f6\u00c2q\u0000~\u0000\u0012psq\u0000~\u0000\u0013\u0001|\u00f6\u00bfq"
+"\u0000~\u0000\u0012pq\u0000~\u0000\u0016q\u0000~\u0000\u001aq\u0000~\u0000\u001csq\u0000~\u0000\u001dt\u00002net.sourceforge.czt.core.jaxb.g"
+"en.GivenTypeElementq\u0000~\u0000!sr\u0000\"com.sun.msv.grammar.ExpressionPo"
+"ol\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\bexpTablet\u0000/Lcom/sun/msv/grammar/ExpressionPo"
+"ol$ClosedHash;xpsr\u0000-com.sun.msv.grammar.ExpressionPool$Close"
+"dHash\u00d7j\u00d0N\u00ef\u00e8\u00ed\u001c\u0002\u0000\u0004I\u0000\u0005countI\u0000\tthresholdL\u0000\u0006parentq\u0000~\u0000^[\u0000\u0005tablet\u0000"
+"![Lcom/sun/msv/grammar/Expression;xp\u0000\u0000\u0000\u0012\u0000\u0000\u00009pur\u0000![Lcom.sun.m"
+"sv.grammar.Expression;\u00d68D\u00c3]\u00ad\u00a7\n\u0002\u0000\u0000xp\u0000\u0000\u0000\u00bfpppppppppppppppq\u0000~\u0000;p"
+"ppppppppppppppppppppppppppq\u0000~\u0000>ppppppppppppppppppppppppppppp"
+"pppppppppppppppq\u0000~\u0000<pppppq\u0000~\u0000\u0010q\u0000~\u0000Aq\u0000~\u0000Gq\u0000~\u0000Mq\u0000~\u0000\u0006q\u0000~\u0000Sq\u0000~\u0000Y"
+"ppppq\u0000~\u0000\rq\u0000~\u0000@q\u0000~\u0000Fq\u0000~\u0000Lq\u0000~\u0000Rq\u0000~\u0000Xpppppppq\u0000~\u0000\u0005pppppppppppppp"
+"ppppppppppppppppppppppppppppq\u0000~\u0000=ppppppppppppppppppppppppppp"
+"pp"));
        }
        return new com.sun.msv.verifier.regexp.REDocumentDeclaration(schemaFragment);
    }

    public class Unmarshaller
        extends net.sourceforge.czt.zpatt.jaxb.gen.impl.runtime.AbstractUnmarshallingEventHandlerImpl
    {


        public Unmarshaller(net.sourceforge.czt.zpatt.jaxb.gen.impl.runtime.UnmarshallingContext context) {
            super(context, "----------");
        }

        protected Unmarshaller(net.sourceforge.czt.zpatt.jaxb.gen.impl.runtime.UnmarshallingContext context, int startState) {
            this(context);
            state = startState;
        }

        public java.lang.Object owner() {
            return net.sourceforge.czt.core.jaxb.gen.impl.NameSectTypeTripleImpl.this;
        }

        public void enterElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname, org.xml.sax.Attributes __atts)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  3 :
                        if (("Sect" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            context.pushAttributes(__atts, true);
                            state = 4;
                            return ;
                        }
                        break;
                    case  6 :
                        if (("Type" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 8;
                            return ;
                        }
                        if (("GenType" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Type = ((net.sourceforge.czt.core.jaxb.gen.impl.GenTypeElementImpl) spawnChildFromEnterElement((net.sourceforge.czt.core.jaxb.gen.impl.GenTypeElementImpl.class), 7, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("ProdType" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Type = ((net.sourceforge.czt.core.jaxb.gen.impl.ProdTypeElementImpl) spawnChildFromEnterElement((net.sourceforge.czt.core.jaxb.gen.impl.ProdTypeElementImpl.class), 7, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("PowerType" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Type = ((net.sourceforge.czt.core.jaxb.gen.impl.PowerTypeElementImpl) spawnChildFromEnterElement((net.sourceforge.czt.core.jaxb.gen.impl.PowerTypeElementImpl.class), 7, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("SchemaType" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Type = ((net.sourceforge.czt.core.jaxb.gen.impl.SchemaTypeElementImpl) spawnChildFromEnterElement((net.sourceforge.czt.core.jaxb.gen.impl.SchemaTypeElementImpl.class), 7, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("GivenType" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Type = ((net.sourceforge.czt.core.jaxb.gen.impl.GivenTypeElementImpl) spawnChildFromEnterElement((net.sourceforge.czt.core.jaxb.gen.impl.GivenTypeElementImpl.class), 7, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        break;
                    case  7 :
                        revertToParentFromEnterElement(___uri, ___local, ___qname, __atts);
                        return ;
                    case  1 :
                        attIdx = context.getAttribute("", "Id");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().enterElement(___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("Anns" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Name = ((net.sourceforge.czt.core.jaxb.gen.impl.DeclNameImpl) spawnChildFromEnterElement((net.sourceforge.czt.core.jaxb.gen.impl.DeclNameImpl.class), 2, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("Word" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Name = ((net.sourceforge.czt.core.jaxb.gen.impl.DeclNameImpl) spawnChildFromEnterElement((net.sourceforge.czt.core.jaxb.gen.impl.DeclNameImpl.class), 2, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        _Name = ((net.sourceforge.czt.core.jaxb.gen.impl.DeclNameImpl) spawnChildFromEnterElement((net.sourceforge.czt.core.jaxb.gen.impl.DeclNameImpl.class), 2, ___uri, ___local, ___qname, __atts));
                        return ;
                    case  0 :
                        if (("Name" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 1;
                            return ;
                        }
                        break;
                    case  8 :
                        if (("Anns" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Type = ((net.sourceforge.czt.core.jaxb.gen.impl.TypeImpl) spawnChildFromEnterElement((net.sourceforge.czt.core.jaxb.gen.impl.TypeImpl.class), 9, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        _Type = ((net.sourceforge.czt.core.jaxb.gen.impl.TypeImpl) spawnChildFromEnterElement((net.sourceforge.czt.core.jaxb.gen.impl.TypeImpl.class), 9, ___uri, ___local, ___qname, __atts));
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
                    case  7 :
                        revertToParentFromLeaveElement(___uri, ___local, ___qname);
                        return ;
                    case  5 :
                        if (("Sect" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            context.popAttributes();
                            state = 6;
                            return ;
                        }
                        break;
                    case  1 :
                        attIdx = context.getAttribute("", "Id");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveElement(___uri, ___local, ___qname);
                            return ;
                        }
                        _Name = ((net.sourceforge.czt.core.jaxb.gen.impl.DeclNameImpl) spawnChildFromLeaveElement((net.sourceforge.czt.core.jaxb.gen.impl.DeclNameImpl.class), 2, ___uri, ___local, ___qname));
                        return ;
                    case  9 :
                        if (("Type" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            context.popAttributes();
                            state = 7;
                            return ;
                        }
                        break;
                    case  8 :
                        _Type = ((net.sourceforge.czt.core.jaxb.gen.impl.TypeImpl) spawnChildFromLeaveElement((net.sourceforge.czt.core.jaxb.gen.impl.TypeImpl.class), 9, ___uri, ___local, ___qname));
                        return ;
                    case  2 :
                        if (("Name" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
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
                    case  7 :
                        revertToParentFromEnterAttribute(___uri, ___local, ___qname);
                        return ;
                    case  1 :
                        if (("Id" == ___local)&&("" == ___uri)) {
                            _Name = ((net.sourceforge.czt.core.jaxb.gen.impl.DeclNameImpl) spawnChildFromEnterAttribute((net.sourceforge.czt.core.jaxb.gen.impl.DeclNameImpl.class), 2, ___uri, ___local, ___qname));
                            return ;
                        }
                        _Name = ((net.sourceforge.czt.core.jaxb.gen.impl.DeclNameImpl) spawnChildFromEnterAttribute((net.sourceforge.czt.core.jaxb.gen.impl.DeclNameImpl.class), 2, ___uri, ___local, ___qname));
                        return ;
                    case  8 :
                        _Type = ((net.sourceforge.czt.core.jaxb.gen.impl.TypeImpl) spawnChildFromEnterAttribute((net.sourceforge.czt.core.jaxb.gen.impl.TypeImpl.class), 9, ___uri, ___local, ___qname));
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
                    case  7 :
                        revertToParentFromLeaveAttribute(___uri, ___local, ___qname);
                        return ;
                    case  1 :
                        attIdx = context.getAttribute("", "Id");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveAttribute(___uri, ___local, ___qname);
                            return ;
                        }
                        _Name = ((net.sourceforge.czt.core.jaxb.gen.impl.DeclNameImpl) spawnChildFromLeaveAttribute((net.sourceforge.czt.core.jaxb.gen.impl.DeclNameImpl.class), 2, ___uri, ___local, ___qname));
                        return ;
                    case  8 :
                        _Type = ((net.sourceforge.czt.core.jaxb.gen.impl.TypeImpl) spawnChildFromLeaveAttribute((net.sourceforge.czt.core.jaxb.gen.impl.TypeImpl.class), 9, ___uri, ___local, ___qname));
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
                        case  4 :
                            eatText0(value);
                            state = 5;
                            return ;
                        case  7 :
                            revertToParentFromText(value);
                            return ;
                        case  1 :
                            attIdx = context.getAttribute("", "Id");
                            if (attIdx >= 0) {
                                context.consumeAttribute(attIdx);
                                context.getCurrentHandler().text(value);
                                return ;
                            }
                            _Name = ((net.sourceforge.czt.core.jaxb.gen.impl.DeclNameImpl) spawnChildFromText((net.sourceforge.czt.core.jaxb.gen.impl.DeclNameImpl.class), 2, value));
                            return ;
                        case  8 :
                            _Type = ((net.sourceforge.czt.core.jaxb.gen.impl.TypeImpl) spawnChildFromText((net.sourceforge.czt.core.jaxb.gen.impl.TypeImpl.class), 9, value));
                            return ;
                    }
                } catch (java.lang.RuntimeException e) {
                    handleUnexpectedTextException(value, e);
                }
                break;
            }
        }

        private void eatText0(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            try {
                _Sect = value;
            } catch (java.lang.Exception e) {
                handleParseConversionException(e);
            }
        }

    }

}
