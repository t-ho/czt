/**
Copyright 2007, Leo Freitas
This file is part of the CZT project.

The CZT project contains free software; you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation; either version 2 of the License, or
(at your option) any later version.

The CZT project is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with CZT; if not, write to the Free Software
Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 */
package net.sourceforge.czt.dc.z;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.logging.Logger;
import net.sourceforge.czt.base.ast.Term;
import net.sourceforge.czt.parser.util.DefinitionTable;
import net.sourceforge.czt.parser.util.ErrorType;
import net.sourceforge.czt.parser.util.OpTable;
import net.sourceforge.czt.session.CommandException;
import net.sourceforge.czt.session.Key;
import net.sourceforge.czt.session.SectionInfo;
import net.sourceforge.czt.typecheck.z.ErrorAnn;
import net.sourceforge.czt.typecheck.z.util.TypeErrorException;
import net.sourceforge.czt.util.CztException;
import net.sourceforge.czt.util.Pair;
import net.sourceforge.czt.z.ast.AxPara;
import net.sourceforge.czt.z.ast.Box;
import net.sourceforge.czt.z.ast.ConjPara;
import net.sourceforge.czt.z.ast.Decl;
import net.sourceforge.czt.z.ast.Expr;
import net.sourceforge.czt.z.ast.FreePara;
import net.sourceforge.czt.z.ast.LocAnn;
import net.sourceforge.czt.z.ast.NarrPara;
import net.sourceforge.czt.z.ast.NarrSect;
import net.sourceforge.czt.z.ast.Para;
import net.sourceforge.czt.z.ast.Parent;
import net.sourceforge.czt.z.ast.Pred;
import net.sourceforge.czt.z.ast.Sect;
import net.sourceforge.czt.z.ast.SectTypeEnvAnn;
import net.sourceforge.czt.z.ast.Spec;
import net.sourceforge.czt.z.ast.TruePred;
import net.sourceforge.czt.z.ast.ZName;
import net.sourceforge.czt.z.ast.ZNameList;
import net.sourceforge.czt.z.ast.ZSchText;
import net.sourceforge.czt.z.ast.ZSect;
import net.sourceforge.czt.z.util.Factory;
import net.sourceforge.czt.z.util.ZUtils;
import net.sourceforge.czt.z.visitor.ParaVisitor;
import net.sourceforge.czt.z.visitor.ParentVisitor;
import net.sourceforge.czt.z.visitor.SectVisitor;
import net.sourceforge.czt.z.visitor.ZSectVisitor;

/**
 * <p>
 * Top-level domain checking class. Given a Z section or specification, it 
 * calculates the list of conjectures for each relevant paragraph. The results
 * are delivered either as child Z section with a list of conjectures or as a
 * list of paragraph / predicate pairs. For details on the nature of domain 
 * checks and their shape for every Z term, see {@link #DCTerm}.
 * </p>
 * <p>
 * To use it properly, first one need to set the section manager where the domain
 * checker will work. Next, one can request for either a packed child DC Z sect,
 * or a list of para/pred pairs for a given Z sect or Spec. If not section manager
 * is given, parent sections won't be checked and known standard definitions won't
 * be loaded. In this case, the \appliesTo function from dc\_toolkit.tex will always
 * be used to resolve domain checking conflicts. Although this is not a problem per se,
 * it leads to more complex domain check conjectures to prove. The DC toolkit is loaded
 * once every time the section manager changes.
 * </p>
 * <p>
 * During preprocessing, which happens once per each Z section, the section's 
 * definition and operator tables (and all of its parents) are loaded. This is
 * useful so that spurious domain checking conditions (e.g., those of declared 
 * total functions or operator templates) are avoided. Finally, two fine grained
 * parameters allow one to have \appliesTo applications as infix or no fix, and
 * one can also avoid processing specific parent sections (e.g., standard toolkit).
 * </p>
 * 
 * @author leo
 */
public class DomainChecker extends AbstractDCTerm<List<Pair<Para, Pred>>> implements
  SectVisitor<List<Pair<Para, Pred>>>,
  ZSectVisitor<List<Pair<Para, Pred>>>,
  ParentVisitor<List<Pair<Para, Pred>>>,
  ParaVisitor<List<Pair<Para, Pred>>>,
  DomainCheckPropertyKeys
  {

  private static final Logger logger_ = Logger.getLogger(DomainChecker.class.getName());
  /**
   * 
   */
  private SectionInfo sectInfo_;
  private ZSect dcToolkit_;
  private OpTable opTable_;
  private DefinitionTable defTable_;
  private DCTerm domainCheck_;
  private SortedSet<String> parentsToIgnore_;
  private boolean addTrivialDC_;
  private boolean processParents_;
  private boolean infixAppliesTo_;
  private boolean applyPredTransf_;
  
  /**
   * 
   */
  protected static final String[] EXTENDED_TOOLKIT_NAMES =
  {
    "whitespace",
    "fuzz_toolkit"
  };
  /**
   * 
   */
  protected static final String[] STANDARD_TOOLKIT_NAMES =
  {
    "prelude",
    "number_toolkit",
    "set_toolkit",
    "relation_toolkit",
    "function_toolkit",
    "sequence_toolkit",
    "standard_toolkit"
  };
  
  public DomainChecker()
  {
    this(new Factory());
  }
  
  public DomainChecker(Factory factory)
  {
    super(factory);    
    init(factory);
  }
   
  /**
   * 
   * @param manager
   */
  public DomainChecker(SectionInfo manager)
  {
    this(new Factory(), manager);
  }

  /**
   * 
   * @param factory
   * @param manager
   */
  public DomainChecker(Factory factory, SectionInfo manager)
  {
    this(factory);    
    setSectInfo(manager);
  }
  
  protected void init(Factory factory)
  {
    assert factory != null;
    domainCheck_ = new DCTerm(factory);
    parentsToIgnore_ = new TreeSet<String>();
    infixAppliesTo_ = PROP_DOMAINCHECK_USE_INFIX_APPLIESTO_DEFAULT;
    applyPredTransf_ = PROP_DOMAINCHECK_APPLY_PRED_TRANSFORMERS_DEFAULT;
    addTrivialDC_ = PROP_DOMAINCHECK_ADD_TRIVIAL_DC_DEFAULT;
    processParents_ = PROP_DOMAINCHECK_PROCESS_PARENTS_DEFAULT;    
  }
  
  /* PROPERTY RELATED METHODS */

  /**
   * 
   */
  protected void reset()
  {
    opTable_ = null;
    defTable_ = null;
    dcToolkit_ = null;
    clearParentsToIgnore();
    parentsToIgnore_.addAll(defaultParentsToIgnore());
  }

  /**
   * By default ignore all STANDARD_TOOLKIT_NAMES and EXTENDED_TOOLKIT_NAMES Z sections.
   * @return 
   */
  protected static SortedSet<String> defaultParentsToIgnore()
  {
    SortedSet<String> result = new TreeSet<String>(Arrays.asList(STANDARD_TOOLKIT_NAMES));
    result.addAll(Arrays.asList(EXTENDED_TOOLKIT_NAMES));
    result.add(DOMAIN_CHECK_TOOLKIT_NAME);
    return result;
  }

  /** CONFIGURATION METHODS
   * @param manager non-null manager
   */
  public void setSectInfo(SectionInfo manager)
  {
    if (manager == null)
    {
      throw new IllegalArgumentException("Cannot have a domain checker without a section manager");
    }
    sectInfo_ = manager;
    reset();
  }

  /**
   * Clears both sets of parents to process and to ignore
   */
  public void clearParentsToIgnore()
  {
    parentsToIgnore_.clear();
  }

  /**
   * Returns a unmodifiable set of section names not being domain checked. 
   * @return 
   */
  public SortedSet<String> getParentsToIgnore()
  {
    return Collections.unmodifiableSortedSet(parentsToIgnore_);
  }

  /**
   * 
   * @param parent
   */
  public void addParentSectionToIgnore(Parent parent)
  {
    assert parent != null;
    addParentSectionToIgnore(parent.getWord());
  }

  /**
   * 
   * @param parent
   */
  public void addParentSectionToIgnore(String parent)
  {
    assert parent != null && !parent.isEmpty() : "Invalid (null or empty) section name.";
    assert sectInfo_ != null : "must set section manager before adding parent sections to ignore";
    parentsToIgnore_.add(parent);
  }

  /**
   * 
   * @return
   */
  public boolean isUsingInfixAppliesTo()
  {
    return infixAppliesTo_;
  }

  /**
   * 
   * @param value
   */
  public void setInfixAppliesTo(boolean value)
  {
    infixAppliesTo_ = value;
  }

  /**
   * 
   * @return
   */
  public boolean isProcessingParents()
  {
    return processParents_;
  }
  
  public boolean isApplyingPredTransformers()
  {
    return applyPredTransf_;
  }
  
  /**
   * 
   * @param value
   */
  public void setProcessingParents(boolean value)
  {
    processParents_ = value;
  }

  public boolean isAddingTrivialDC()
  {
    return addTrivialDC_;
  }

  public void setAddingTrivialDC(boolean value)
  {
    addTrivialDC_ = value;
  }
  
  public void setApplyPredTransformers(boolean value)
  {
    applyPredTransf_ = value;
  }

  /* DC CALCULATION METHODS */

  /**
   * Creates the domain check predicate list for each paragraph within the given
   * ZSect. If processParents is true, all the parents outside {@link #getParentsToIgnore()}
   * are also processed and added to the result.
   * @param term Z section to domain check
   * @return list of domain check predicates for each paragraph of given Z section
   * @throws DomainCheckException 
   */
  protected List<Pair<Para, Pred>> processZSect(ZSect term)
    throws DomainCheckException
  {
    // load the toolkit, if not there already.
    loadDCToolkit();

    String sectName = term.getName();
    // if we should not process parents, just add the listed parents to the ignore list
    if (!isProcessingParents())
    {
      for (Parent parent : term.getParent())
      {
        addParentSectionToIgnore(parent);
      }
    }
    // process the ZSect 
    return collect(term);
  }
  
  /**
   * Collects the list of predicates associated with the top-level paragraphs for 
   * each section within the given Spec term. The list of parents to process determines
   * which parents should be included while processing the Spec.
   * @param term specification to domain check
   * @return map from section names to a list of domain check predicates for each paragraph of each Z section
   * @throws DomainCheckException 
   */
  protected SortedMap<String, List<Pair<Para, Pred>>> dc(Spec term)
    throws DomainCheckException
  {
    assert term != null : "Invalid (null) specification!";

    // process each one of the ZSect within Spec    
    SortedMap<String, List<Pair<Para, Pred>>> result = new TreeMap<String, List<Pair<Para, Pred>>>();
    for (Sect sect : term.getSect())
    {
      if (sect instanceof ZSect)
      {
        ZSect zsect = (ZSect) sect;
        List<Pair<Para, Pred>> dcList = processZSect(zsect);
        List<Pair<Para, Pred>> old = result.put(zsect.getName(), dcList);
        assert old == null : "Duplicated ZSect DC processing for " + zsect.getName();
      }
    }    
    return result;
  }

  /**
   * Collects the list of domain check predicates for each paragraph within the
   * given ZSect term. If process parents is true, section parents are processed
   * and added. 
   * @param term Z section to domain check
   * @return list of domain check predicates for each paragraph of given Z section
   * @throws DomainCheckException
   */
  protected List<Pair<Para, Pred>> dc(ZSect term)
    throws DomainCheckException
  {
    assert term != null : "Invalid (null) specification!";
    List<Pair<Para, Pred>> result = processZSect(term);
    return result;
  }
  
    /* INTERNAL AUXILIARY WRAPPING METHODS */
  
  /**
   * Creates a ZSect header as "\SECTION sectName_dc \parents sectName" and empty paragraphs
   * @param sectName
   * @return
   */
  private ZSect createDCZSectHeader(String sectName)
  {
    ZSect result = factory_.createZSect(sectName + DOMAIN_CHECK_GENERAL_NAME_SUFFIX,
      factory_.list(factory_.createParent(sectName),
      factory_.createParent(DOMAIN_CHECK_TOOLKIT_NAME)),
      factory_.createZParaList());
    return result;
  }

  protected static final String ONTHEFLY_SCHEMA_NAME = "OnTheFlySchemaDC";
  protected static int onTheFlySchemaNameSeed_ = 0;
  
  protected String createUniqueOnTheFlySchemaName() 
  { 
    String result = ONTHEFLY_SCHEMA_NAME + onTheFlySchemaNameSeed_;
    onTheFlySchemaNameSeed_++;
    return result;
  }
  
  private void loadDCToolkit() throws DomainCheckException
  {
    assert sectInfo_ != null : "Cannot load " + DOMAIN_CHECK_TOOLKIT_NAME + " without a section info!";
    if (dcToolkit_ == null)
    {
      // parse the dcToolkit within the section manager so that that operator 
      // table for (_appliesTo_) is available within it.      
      try
      {      
        dcToolkit_ = sectInfo_.get(new Key<ZSect>(DOMAIN_CHECK_TOOLKIT_NAME, ZSect.class));
        SectTypeEnvAnn type = sectInfo_.get(new Key<SectTypeEnvAnn>(DOMAIN_CHECK_TOOLKIT_NAME, SectTypeEnvAnn.class));
        if (type == null)
        {
          throw new DomainCheckException("A severe error has happened. The " + DOMAIN_CHECK_TOOLKIT_NAME + " section, which contains " +
            "domain check definitions for Z, does not typecheck. This can only happen if it has been wrongly modified.");
        }
      }
      catch (CommandException e)
      {
        throw new DomainCheckException("A command exception happened (see causes) while trying to parse / typecheck " + DOMAIN_CHECK_TOOLKIT_NAME, e);
      }
    }
    assert dcToolkit_ != null : "Could not load " + DOMAIN_CHECK_TOOLKIT_NAME;
  }
  
  protected static boolean RAISE_TYPE_WARNINGS = true; /* by default raise warnings as errors */
  
  protected int printErrors(List<? extends ErrorAnn> errors, boolean raiseWarnings)
  {    
    int result = 0;
    //print any errors
    for (ErrorAnn next : errors) {
      // raiseWarnings => next.getErrorType(ErrorType.ERROR) only
      if (raiseWarnings || next.getErrorType().equals(ErrorType.ERROR))
      {
        logger_.warning(next.toString());
        result++;
      }
    }
    return result;
  }

  /**
   * Adds to the given Z section the list of domain check predicates for each
   * coresponding paragraph as a conjecture paragraph. It updates the Z section
   * result list of paragraphs, see {@link #ZSect.getZParaList()}. It also updates
   * the section manager information.
   * @param result Z section to add given list as conjectures; it is usually given empty.
   * @param dcList list of domain checks for each paragraph to be added to Z section result.
   * @throws DomainCheckException 
   */
  protected void processDCZSect(ZSect result, List<Pair<Para, Pred>> dcList)
    throws DomainCheckException
  {
    assert result != null && dcList != null;

    // Add date it was created
    Date date = new Date();
    String narrText = "Created at " + date.toString() + ".\n\n";
    NarrPara narrPara = factory_.createNarrPara(factory_.list(narrText));
    result.getZParaList().add(narrPara);
    boolean addTrivialDC = isAddingTrivialDC();

    int dcCount = 0;    
    // process each Para DC
    for (Pair<Para, Pred> pair : dcList)
    {
      Para para = pair.getFirst();
      Pred paraDC = pair.getSecond();

      //!addTrivialDC ==> !(paraDC instanceof TruePred)      
      if (addTrivialDC || !(paraDC instanceof TruePred))
      {
        // since we cannot retrieve the theorem's name from a latex, neither
        // generate it from a ConjPara, just add some NarrText around instead.
        narrText = "";
        
        // add location information
        LocAnn loc = para.getAnn(LocAnn.class);
        if (loc != null)
        {  
          narrText = "DC for " + loc.toString() + "\n";          
        }
        else
        {
          narrText = "DC for " + para.toString() + "\n";
        }
        narrPara = factory_.createNarrPara(factory_.list(narrText));

        // retrieve genFormals in case of AxPara, or an empty list otherwise
        ZNameList genFormals = factory_.createZNameList();
        if (para instanceof AxPara)
        {
          genFormals.addAll(((AxPara) para).getZNameList());
        }
        ConjPara conjPara = factory_.createConjPara(genFormals, paraDC);

        // create the conjecture name or internal axiom name
        String conjName = null;
        int axiomCnt = 0;
        if (ZUtils.isAbbreviation(para))
        {
          conjName = ZUtils.assertZName(ZUtils.getAbbreviationName(para)).getWord();
        }
        else if (ZUtils.isSchema(para))
        {
          conjName = ZUtils.assertZName(ZUtils.getSchemaName(para)).getWord();
        }
        else if (para instanceof ConjPara)
        {
          conjName = ((ConjPara) para).getName();
        }
        else if (para instanceof FreePara)
        {
          // for multiple free types, just get the first name available.
          conjName = ZUtils.assertZFreetypeList(((FreePara) para).getFreetypeList()).get(0).getZName().getWord();
        }
        else if (para instanceof AxPara && ((AxPara) para).getBox().equals(Box.AxBox))
        {
          conjName = "axiom$" + axiomCnt;
          axiomCnt++;
        }

        // in any case, always have a name for it.
        if (conjName == null || conjName.isEmpty())
        {
          conjName = "dc$" + axiomCnt;
          axiomCnt++;
        }

        // add the conjecture name
        assert conjName != null && !conjName.isEmpty() : "Invalid conjecture name";
        ZName annName = factory_.createZName(conjName + DOMAIN_CHECK_CONJECTURE_NAME_SUFFIX);
        conjPara.getAnns().add(annName);
        //conjPara.setName(annName.getWord()); no need here ,since we create the ConjPara without ann        

        // add both narrative and dc conjecture paragraphs to the Z section result
        result.getZParaList().add(narrPara);
        result.getZParaList().add(conjPara);
        dcCount++;
      }
    }
    
    // add narrative para footer with the number of domain checks
    narrText = "Z section " + result.getName() + " has " + dcCount + 
      (dcCount == 1 ? " DC" : "DCs") + ".\n";
    if (addTrivialDC && dcCount > 0)
    {
      narrText += "(of which " + (dcList.size() - dcCount) + " were trivial).\n";
    }
    narrText += "\n";
    narrPara = factory_.createNarrPara(factory_.list(narrText));
    result.getZParaList().add(narrPara);
    
    // tell the section manager about the presence of this new Z section
    // no need to parse, we know it is okay - it's been constructed.
    String sectName = result.getName();
    sectInfo_.put(new Key<ZSect>(sectName, ZSect.class), result, null);
    
    // attempt to typecheck the DC Z section, which should succeed. 
    // raise a warning if it doesn't. 
    try
    {
      // type check result - if on-the-fly construction is wrong this will fail.
      sectInfo_.get(new Key<SectTypeEnvAnn>(sectName, SectTypeEnvAnn.class));
    }
    catch(CommandException e)
    {
      // TODO: should we raise an error, instead?
      logger_.warning("Command exception thrown while trying typecheck DC ZSect " + sectName);
      logger_.warning("Command exception : " + e.getMessage());
      if (e.getCause() != null)
      {
        logger_.warning("\t caused by " + e.getCause().getClass().getName() + " with message: " + e.getCause().getMessage());
        if (e.getCause() instanceof TypeErrorException)
        {
          int i = printErrors(((TypeErrorException)e.getCause()).getErrors(), RAISE_TYPE_WARNINGS);
          logger_.warning("Found " + i + " type erros/warnings, please check original specification for " + sectName);
        }
      }
      //throw new DomainCheckException("Command exception thrown while trying typecheck DC ZSect " + sectName, e);
    }         
  }
  
  /* WRAPPING METHODS */

  // CREATES List<ZSectDCEnvAnn> for each Spec ZSect
  /**
   * Domain checks all Z sections within the given specification term.
   * The result are children Z sections with the corresponding spec Z section
   * as its parent, and with domain check conjectures for all its paragraphs.
   * 
   * @param term specification to domain check
   * @return list of DC Z section as a list of domain check conjectures
   * @throws DomainCheckException 
   */
  public List<ZSectDCEnvAnn> createZSectDCEnvAnn(Spec term)
    throws DomainCheckException
  {
    // calculate the DC map for each ZSect within Spec term
    SortedMap<String, List<Pair<Para, Pred>>> dcMap = dc(term);
    
    // for each ZSect, create a DC ZSect child with the DC elements.
    List<ZSectDCEnvAnn> result = new ArrayList<ZSectDCEnvAnn>(dcMap.size());
    for (Map.Entry<String, List<Pair<Para, Pred>>> entry : dcMap.entrySet())
    {
      // create a bare ZSect header      
      String originalZSectName = entry.getKey();
      ZSect zsect = createDCZSectHeader(originalZSectName);
      List<Pair<Para, Pred>> dcs = entry.getValue();

      // update the paragraphs of DC Z Sect with DC conjectures
      processDCZSect(zsect, dcs);
      
      ZSect original = ZUtils.retrieveZSect(term, originalZSectName);
      assert original != null;
      
      // update the result
      result.add(new ZSectDCEnvAnn(originalZSectName, dcs));
    }

    // ensure result is consistent with collected info
    assert result.size() == dcMap.size() : "More DC's for mapped section than resulting List<ZSecT>!";

    return result;
  }

  // CREATES ZSectDCEnvAnn for ZSect
  /**
   * Domain checks the given Z sectio. The result is a Z sections with the 
   * given Z section as its parent, and with domain check conjectures for 
   * all its paragraphs.   
   * 
   * @param term Z section to domain check
   * @return DC Z section as a list of domain check conjectures
   * @throws DomainCheckException
   */
  public ZSectDCEnvAnn createZSectDCEnvAnn(ZSect term)
    throws DomainCheckException
  {
    assert term != null;
    String sectName = term.getName();

    // create section header: \SECTION sectName_dc \parents sectName
    ZSect zsectDC = createDCZSectHeader(sectName);

    // domain check sectName
    List<Pair<Para, Pred>> dcList = dc(term);

    // update the zsectDC and add it to the SectionManager
    // it is accessible as manager.get(new Key<ZSect>(sectName + "_dc", ZSect.class));
    processDCZSect(zsectDC, dcList);
    
    // create a ZSectDCEnvAnn with the original section name where
    // the dcList is associated with.
    ZSectDCEnvAnn result = new ZSectDCEnvAnn(sectName, dcList);
    return result;
  }

  // CREATES ZSectDCEnvAnn for ZSect, Para, Pred, Expr, or Decl  
  /**
   * Domain checks the given term, presuming it is a ZSect, Para, Pred,
   * Expr or Decl. The result is Z sections named "annonymous" with 
   * standard and dc toolkits as its parents, and with domain check 
   * conjectures for the term, if any. The result is a wrapped ZSectDCEnvAnn.
   * 
   * @param term Z section to domain check
   * @return DC Z section as a list of domain check conjectures
   * @throws DomainCheckException
   */
  public ZSectDCEnvAnn createZSectDCEnvAnn(Term term)
    throws DomainCheckException
  {
    assert term != null : "invalid general term to domain check";
    
    Para para;        
    if (term instanceof ZSect)
    {
      return createZSectDCEnvAnn((ZSect)term);
    }
    else if (term instanceof Para)
    {
      para = (Para) term;
    }
    else
    {
      // for everything else, create a schema text 
      ZSchText zSchText;
      if (term instanceof Pred)
      {
        // [ | pred ]
        zSchText = factory_.createZSchText(factory_.createZDeclList(), (Pred)term);
      }
      else if (term instanceof Expr)
      {
        // [ | pred(Expr) ]
        zSchText = factory_.createZSchText(factory_.createZDeclList(), factory_.createExprPred((Expr)term));
      }
      else if (term instanceof Decl)
      {
        // [ Decl | true ]
        zSchText = factory_.createZSchText(factory_.createZDeclList(
          factory_.list((Decl) term)), factory_.createTruePred());
      }
      else
      {
        // cannot be processed, raise exception
        throw new DomainCheckException("Invalid general term to domain check. It must be either " +
          "a paragraph, a declaration, a predicate, or an expression, yet a " + term.getClass().getName() + " was given.");
      }      
      // make it a schema named internally and uniquely
      assert zSchText != null;             
      para = factory_.createSchema(factory_.createZName(createUniqueOnTheFlySchemaName()), zSchText);
    }
    assert para != null;
    
    // create an empty section header
    ZSect zsect = factory_.createZSect("anonymous",
      factory_.list(factory_.createParent("standard_toolkit")),
      factory_.createZParaList());
    zsect.getZParaList().add(para);
    // domain check on-the-fly Z section
    ZSectDCEnvAnn result = createZSectDCEnvAnn(zsect);
    return result;
  }

  /**
   * Domain checks all Z sections within the given specification term.
   * The result are children Z sections with the corresponding spec Z section
   * as its parent, and with domain check conjectures for all its paragraphs.
   * This is a convenience method that relies on the result of {@link #createZSectDCEnvAnn(Spec, boolean, boolean)}.
   * The <code>specKey</code> parameter is necessary in order to update the section manager with
   * the DC Spec created by this method.
   * 
   * @param specKey section manager key associated with Spec? 
   * @param term specification to domain check
   * @return list of DC Z section as a list of domain check conjectures
   * @throws DomainCheckException 
   */
  public SpecDCEnvAnn createSpecDCEnvAnn(Spec term) throws DomainCheckException
  {
    // populate the term with its DC Z Sect children
    List<ZSectDCEnvAnn> sects = createZSectDCEnvAnn(term);

    // create an empty Spec
    Spec dcSpec = factory_.createSpec(factory_.<ZSect>list(), term.getVersion());
    
    // Add header for date it was created
    Date date = new Date();
    String narrText = "Domain checked specification created at " + date.toString() + ".\n\n";
    NarrSect header = factory_.createNarrSect(factory_.<String>list(narrText));    
    dcSpec.getSect().add(header);

    // populate the spec with each DC Z Sect child
    for (ZSectDCEnvAnn zsDCEnvAnn : sects)
    { 
      dcSpec.getSect().add(zsDCEnvAnn.getDCZSect(sectInfo_));
    }
    
    // update section manager with DC Z Spec information, with dependencies to given Spec        
    // if this term is known within the section manager.    
    Key<Spec> specKey = sectInfo_.retrieveKey(term);
    String specKeyName = "Specification"; // a general resource name
    if (specKey != null)
    {      
      specKeyName = specKey.getName();      
      Key<Spec> dcSpecKey = new Key<Spec>(specKeyName + DOMAIN_CHECK_GENERAL_NAME_SUFFIX, Spec.class);
      sectInfo_.put(dcSpecKey, dcSpec, new HashSet<Key<?>>(Collections.singleton(specKey)));            
    }
    
    // wrap the result to be returned - may have a null specKeyName
    SpecDCEnvAnn result = new SpecDCEnvAnn(specKeyName, sects);    
    return result;
  }

  /* TERM DC COLLECTION VISITING METHODS */
  /**
   * Collect all DC predicates from the terms within the given list.
   * This could be a ZParaList, a ListTerm<Parent>, or ListTerm<Sect>,
   * which comes from ZSect.getZParaList(), ZSect.getParent(), and
   * Spec.getSect().
   * @param <T>
   * @param list
   * @return 
   */
  protected <T extends Term> List<Pair<Para, Pred>> collect(T... list)
  {
    List<Pair<Para, Pred>> result = factory_.list();
    for (T term : list)
    {
      result.addAll(term.accept(this));
    }
    return result;
  }    

  /** TOP-LEVEL SPECIFICATION TERMS */
  /**
   * For UnparsedZSect or NarrSect, just return an empty list.
   * @param term
   * @return
   */
  @Override
  public List<Pair<Para, Pred>> visitSect(Sect term)
  {
    // just ignore other types of Sect
    return factory_.list();
  }  

  /**
   * For parent sections, calculate their dependant domain checks,
   * or lookup in the section manager
   * @param term
   * @return
   */
  @Override
  public List<Pair<Para, Pred>> visitParent(Parent term)
  {
    String sectName = term.getWord();

    // if this is one known parent to ignore, raise an error
    if (parentsToIgnore_.contains(sectName))
    {      
      logger_.info("Domain check is ignoring parent Z section " + sectName);
    }
    // otherwise collect information
    else
    {
      if (sectInfo_ != null)
      {
        try
        {
          // calculate the domain checks for the given section. this updates the
          // section manager to contain the appropriate parent information.
          ZSectDCEnvAnn zsDCEnvAnn = sectInfo_.get(new Key<ZSectDCEnvAnn>(sectName, ZSectDCEnvAnn.class));
        }
        catch (CommandException ex)
        {
          String parentsWarning = "Could not retrieve definitions for parent section " + sectName +
            ". Continuing without domain checking this parent (and its parents).";
          String cmdWarning = "CommandException thrown while trying to retrieve definitions for parent section " + sectName +
            " with the following message: " + ex.getMessage() + ". Continuing without domain checking this parent (and its parents).";

          // warns in case of failure, but do not stop.
          logger_.warning(parentsWarning);
          logger_.warning(cmdWarning);

          throw new CztException("Domain Check Exception thrown (see causes) while visiting Parent ZSect " + sectName,
            new DomainCheckException(parentsWarning, ex));
        }
      }
      else
      {
        logger_.warning("Could not retrieve DefinitionTable for section " + sectName +
          " because no section manager is set! AppliesTo will always be used.");
      //throw new CztException("Domain Check Exception thrown (see causes) while visiting ZSect " + sectName, 
      //  new DomainCheckException("Could not process requested parent section " + sectName + 
      //  " because no section manager is set!"));
      }
    }
    // result is always empty. the update happens at the section manager.
    return factory_.list();
  }

  @Override
  @SuppressWarnings("unchecked")
  public List<Pair<Para, Pred>> visitZSect(ZSect term)
  {
    String sectName = term.getName();

    // attempt retrieving defintion table.
    if (sectInfo_ != null)
    {
      try
      {
        // retrieve definition + operator tables for Z section being analysed        
        defTable_ = sectInfo_.get(new Key<DefinitionTable>(sectName, DefinitionTable.class));
        opTable_ = sectInfo_.get(new Key<OpTable>(sectName, OpTable.class));
      }
      catch (CommandException e)
      {
        defTable_ = null;
        opTable_ = null;
        String defWarning = "Could not retrieve definition and operator tables for section " + sectName +
          ". That means the appliesTo operator will always be used for ApplExpr.";
        String cmdWarning = "CommandException thrown while trying to retrieve definition and operator tables for " + sectName +
          " with the following message: " + e.getMessage() + ".";
        logger_.warning(defWarning);
        logger_.warning(cmdWarning);
        throw new CztException("Domain Check Exception thrown (see causes) while visiting ZSect " + sectName,
          new DomainCheckException(defWarning, e));
      }
    }
    else
    {
      logger_.warning("Could not retrieve definition and operator tables for section " + sectName +
        " because no section manager is set! AppliesTo will always be used.");
    //throw new CztException("Domain Check Exception thrown (see causes) while visiting ZSect " + sectName, 
    //  new DomainCheckException("Could not retrieve DefinitionTable for section " + sectName + 
    //  " because no section manager is set!"));
    }

    List<Pair<Para, Pred>> result = factory_.list();

    // process section parents
    result.addAll(collect(term.getParent().toArray(new Parent[0])));

    // collect all DC predicates from the declared paragraphs
    result.addAll(collect(term.getZParaList().toArray(new Para[0])));

    // clear definition and operator tables
    defTable_ = null;
    opTable_ = null;

    // return collected predicates
    return result;
  }

  /**
   * Retrieves for the given paragraph a corresponding domain check predicate
   * based over information on the current definition table.
   * 
   * @param term
   * @return
   */
  @Override
  public List<Pair<Para, Pred>> visitPara(Para term)
  {
    List<Pair<Para, Pred>> result = factory_.list();

    // collect DC predicates for the given ZSect paragraph with 
    // infered defTable and chosen infix form for \appliesTo.
    //
    // defTable_ is initialised at visitZSect ; null otherwise, in which 
    // case \appliesTo is always used since we cannot know about \dom info.
    Pred dcPred = domainCheck_.runDC(term, defTable_, isUsingInfixAppliesTo(), isApplyingPredTransformers());
    Pair<Para, Pred> pair = new Pair<Para, Pred>(term, dcPred);
    result.add(pair);
    return result;
  }
}