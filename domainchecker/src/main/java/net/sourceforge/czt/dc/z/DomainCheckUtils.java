/*
  Copyright (C) 2004, 2006 Petra Malik
  Copyright (C) 2008 Leo Freitas
  This file is part of the czt project.

  The czt project contains free software; you can redistribute it and/or modify
  it under the terms of the GNU General Public License as published by
  the Free Software Foundation; either version 2 of the License, or
  (at your option) any later version.

  The czt project is distributed in the hope that it will be useful,
  but WITHOUT ANY WARRANTY; without even the implied warranty of
  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
  GNU General Public License for more details.

  You should have received a copy of the GNU General Public License
  along with czt; if not, write to the Free Software
  Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
*/
package net.sourceforge.czt.dc.z;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.SortedMap;
import java.util.TreeMap;
import net.sourceforge.czt.base.ast.Term;
import net.sourceforge.czt.base.util.UnsupportedAstClassException;
import net.sourceforge.czt.parser.util.ParseException;
import net.sourceforge.czt.print.util.CztPrintString;
import net.sourceforge.czt.print.util.LatexString;
import net.sourceforge.czt.print.util.UnicodeString;
import net.sourceforge.czt.print.util.XmlString;
import net.sourceforge.czt.session.Command;
import net.sourceforge.czt.session.CommandException;
import net.sourceforge.czt.session.Key;
import net.sourceforge.czt.session.Markup;
import net.sourceforge.czt.session.SectionManager;
import net.sourceforge.czt.typecheck.z.util.TypeErrorException;
import net.sourceforge.czt.util.CztException;
import net.sourceforge.czt.z.ast.Sect;
import net.sourceforge.czt.z.ast.SectTypeEnvAnn;
import net.sourceforge.czt.z.ast.Spec;
import net.sourceforge.czt.z.ast.ZSect;
import net.sourceforge.czt.z.util.Factory;

/**
 * Utilities for domain checking Z specifications.
 * This class provides a main method for command line use,
 * as well as several 'typecheck' methods that are designed
 * to be called by other Java classes.
 *
 * @author leo
 */
public class DomainCheckUtils implements DomainCheckPropertyKeys 
{  
  private final DomainChecker domainChecker_;
  
  /**
   * Do not generate instances of this class.
   * You should use the static methods directly.
   */
  protected DomainCheckUtils()
  {
    domainChecker_ = new DomainChecker();
  }
  
  protected DomainCheckUtils(Factory factory)
  {
    domainChecker_ = new DomainChecker(factory);
  }
  
  /* UTILITY SETUP METHODS */
  
  protected String name()
  {
    return "zeddomaincheck";
  }

  /** Print a usage message to System.err, describing the
   *  command line arguments accepted by main.
   */
  protected void printUsage()
  {
    System.err.println("usage: " + name() + " [-aptr] filename ...");
    System.err.println("flags: -a     use infix applies to definition.");
    System.err.println("       -b     print execution benchmarks.");
    System.err.println("       -p     process parent sections.");
    System.err.println("       -t     add trivial DC predicates.");
    System.err.println("       -r     apply predicate transformers.");
    System.err.println("       -w     raise type warnings as errors.");
    System.err.println("       -i <l> list of parents to ignore.");
    System.err.println("              a semicolon-separated list of section names");
    System.err.println("              (e.g., -cp ./tests;/user/myfiles).");
    System.err.println("              The list is mandatory and must not be empty.");    
    System.err.println("      -cp <l> specify the value for czt.path as");
    System.err.println("              a semicolon-separated list of dirs");
    System.err.println("              (e.g., -cp ./tests;/user/myfiles).");
    System.err.println("              The list is mandatory and must not be empty.");    
    System.err.println("\n");
        System.err.println("Default flags are: \"" +
        ((useInfixAppliesToDefault() ? "-a " : "") +
         (printBenchmarkDefault() ? "-b " : "") +
        (processParentsDefault() ? "-p " : "") +
        (addTrivialDCDefault() ? "-t " : "") +
        (applyPredTransfDefault() ? "-r " : "") +
        (raiseWarningsAsErrorsDefault() ? "-w" : "")).trim() +
        "\"");
  }

  protected boolean printBenchmarkDefault()
  {
    return true;
  }
  
  protected boolean raiseWarningsAsErrorsDefault()
  {
    return false;
  }
  
  protected boolean useInfixAppliesToDefault()
  {
    return PROP_DOMAINCHECK_USE_INFIX_APPLIESTO_DEFAULT;
  }

  protected boolean processParentsDefault()
  {
    return PROP_DOMAINCHECK_PROCESS_PARENTS_DEFAULT;
  }
  
  protected boolean addTrivialDCDefault()
  {
    return PROP_DOMAINCHECK_ADD_TRIVIAL_DC_DEFAULT;
  }  
  
  protected boolean applyPredTransfDefault()
  {
    return PROP_DOMAINCHECK_APPLY_PRED_TRANSFORMERS_DEFAULT;
  }
 
  protected String cztPathDefault()
  {
    return null;
  } 
  
  protected String parentToIgnoreListDefault()
  {
    return PROP_DOMAINCHECK_PARENTS_TO_IGNORE_DEFAULT;
  }
  
  protected String getExtension()
  {
    return SectionManager.DEFAULT_EXTENSION;
  }  
  
  /**
   * This method should be called as few times as possible, as it returns
   * a brand new section manager 
   * @param extension the CZT extension to use
   * @return a fresh new section manager. */
  protected SectionManager getSectionManager(String extension)
  {
    SectionManager sectionManager = new SectionManager(extension);
    sectionManager.putCommand(ZSectDCEnvAnn.class, DomainCheckUtils.getCommand());
    sectionManager.putCommand(SpecDCEnvAnn.class, DomainCheckUtils.getCommand());
    return sectionManager;
  }  
  
  /* UTILITY DOMAIN CHECK CALCULATION WRAPPING METHODS */
  
  /** Sets the domainChecker properties and initialisation up */
  protected void setupDomainChecker(SectionManager manager, List<String> parentsToIgnore,
    boolean useInfixAppliesto, boolean processParents, boolean addTrivialDC, boolean applyPredTrans)
  {
    // prepare the domain checker properties
    domainChecker_.setInfixAppliesTo(useInfixAppliesto);    
    domainChecker_.setProcessingParents(processParents);
    domainChecker_.setAddingTrivialDC(addTrivialDC);
    domainChecker_.setApplyPredTransformers(applyPredTrans);
    domainChecker_.setSectInfo(manager);
    
    // MUST be after setSectInfo, as it resets the default parent sections to ignore
    if (parentsToIgnore != null)
    {
      for(String parent : parentsToIgnore)
      {
        domainChecker_.addParentSectionToIgnore(parent);
      }    
    }
  }
  
  /** 
   * Retrieves the ZSect DC Env for the given term. It sets up the
   * domain checker and calls the underlying {@link #DomainChecker.createZSectDCEnvAnn(ZSect)}.
   * This method is useful for Command classes that need to calculate 
   * domain checks for ZSect to be stored in the section manager.
   * @param term Z section to calculate domain checks
   * @param manager section manager
   * @param parentsToIgnore 
   * @param useInfixAppliesto
   * @param processParents 
   * @param addTrivialDC 
   * @param applyPredTrans 
   * @return ZSect DC environment
   * @throws DomainCheckException if DC calculation throws an exception
   */
  protected ZSectDCEnvAnn retrieveZSectDCEnv(ZSect term, SectionManager manager, List<String> parentsToIgnore,
    boolean useInfixAppliesto, boolean processParents, boolean addTrivialDC, boolean applyPredTrans)
    throws DomainCheckException
  {
    assert term != null;    
    setupDomainChecker(manager, parentsToIgnore, useInfixAppliesto, 
      processParents, addTrivialDC, applyPredTrans);
    ZSectDCEnvAnn result = domainChecker_.createZSectDCEnvAnn(term);
    // check consistency between given z section and assigned name within the 
    // environment created by the domain checker calculator
    assert result != null && result.getOriginalZSectName().equals(term.getName());
    return result;
  }
  
  protected ZSectDCEnvAnn retrieveTermDCEnv(Term term, SectionManager manager, List<String> parentsToIgnore,
    boolean useInfixAppliesto, boolean processParents, boolean addTrivialDC, boolean applyPredTrans)
    throws DomainCheckException
  {
    assert term != null && !(term instanceof Spec);    
    setupDomainChecker(manager, parentsToIgnore, useInfixAppliesto, 
      processParents, addTrivialDC, applyPredTrans);
    ZSectDCEnvAnn result = domainChecker_.createZSectDCEnvAnn(term);
    return result;
  }
  
  /** 
   * Retrieves the Spec DC Env for the given term. It sets up the domain checker 
   * and calls the underlying {@link #DomainChecker.createSpecDCEnvAnn(Spec)}.
   * This method is useful for Command classes that need to calculate 
   * domain checks for Spec to be stored in the section manager.
   * @param term Z specification to calculate domain checks
   * @param manager section manager
   * @param parentsToIgnore 
   * @param useInfixAppliesto
   * @param processParents 
   * @param addTrivialDC 
   * @param applyPredTrans 
   * @return Spec DC environment
   * @throws DomainCheckException if DC calculation throws an exception
   */
  protected SpecDCEnvAnn retrieveSpecDCEnv(Spec term, SectionManager manager, List<String> parentsToIgnore,
    boolean useInfixAppliesto, boolean processParents, boolean addTrivialDC, boolean applyPredTrans)
    throws DomainCheckException
  {
    assert term != null;
    setupDomainChecker(manager, parentsToIgnore, useInfixAppliesto, 
      processParents, addTrivialDC, applyPredTrans);    
    SpecDCEnvAnn result = domainChecker_.createSpecDCEnvAnn(term);
    return result;
  }
  
  /** 
   * Local domain check method that retrieves the DC ZSect with all calculated 
   * domain checks for the given Z section. It calls {@link #retrieveZSectDCEnv(ZSect, 
   * SectionManager, List, boolean, boolean, boolean, boolean)} and extract the
   * inner section from the ZSect DC environment.
   * This method is useful for top-level use where the method's result
   * is the calculated domain checked section within the SectionManager.
   * Note this will not add the ZSectDCEnvAnn to the manager.
   * @param term Z section to calculate domain checks
   * @param manager section manager
   * @param parentsToIgnore 
   * @param useInfixAppliesto
   * @param processParents 
   * @param addTrivialDC 
   * @param applyPredTrans 
   * @return DC ZSect 
   * @throws DomainCheckException if DC calculation throws an exception,
   *         or if it is not possible to retrieve the DC ZSect from the
   *         resulting <code>ZSectDCEnvAnn</code>
   */
  protected ZSect lDomainCheck(ZSect term, SectionManager manager, List<String> parentsToIgnore,
    boolean useInfixAppliesto, boolean processParents, boolean addTrivialDC, boolean applyPredTrans)
    throws DomainCheckException
  {    
    assert term != null;
    ZSectDCEnvAnn result = retrieveZSectDCEnv(term, manager, parentsToIgnore, 
      useInfixAppliesto, processParents, addTrivialDC, applyPredTrans);
    if (result == null)
    {
      throw new DomainCheckException("Could not calculatee domain check conjectures for the given Z section " + term.getName());
    }    
    // check consistency between given z section and assigned name within the 
    // environment created by the domain checker calculator.
    ZSect dcZSect = result.getDCZSect(manager);    
    assert dcZSect != null && dcZSect.getName().startsWith(term.getName());
    return dcZSect;
  }
  
  protected ZSect lDomainCheckTerm(Term term, SectionManager manager, List<String> parentsToIgnore,
    boolean useInfixAppliesto, boolean processParents, boolean addTrivialDC, boolean applyPredTrans)
    throws DomainCheckException
  {    
    assert term != null;
    ZSectDCEnvAnn result = retrieveTermDCEnv(term, manager, parentsToIgnore, 
      useInfixAppliesto, processParents, addTrivialDC, applyPredTrans);
    if (result == null)
    {
      throw new DomainCheckException("Could not calculatee domain check conjectures for the given term");
    }    
    ZSect dcZSect = result.getDCZSect(manager);
    assert dcZSect != null;    
    return dcZSect;
  }
  
  /** 
   * Local domain check method that retrieves the DC Spec with all calculated 
   * domain checks for the given Spec. It calls {@link #retrieveSpecDCEnv(Spec, 
   * SectionManager, List, boolean, boolean, boolean, boolean)} and extract the
   * inner section from the ZSect DC environment.
   * This method is useful for top-level use where the method's result
   * is the calculated domain checked section within the SectionManager.
   * Note this will not add the SpecDCEnvAnn to the manager.
   * @param term Z spec to calculate domain checks
   * @param manager section manager
   * @param parentsToIgnore 
   * @param useInfixAppliesto
   * @param processParents 
   * @param addTrivialDC 
   * @param applyPredTrans 
   * @return DC Spec 
   * @throws DomainCheckException if DC calculation throws an exception,
   *         or if it is not possible to retrieve the DC ZSect from the
   *         resulting <code>ZSectDCEnvAnn</code>
   */
  protected Spec lDomainCheck(Spec term, SectionManager manager, List<String> parentsToIgnore,
    boolean useInfixAppliesto, boolean processParents, boolean addTrivialDC, boolean applyPredTrans)
    throws DomainCheckException
  {    
    SpecDCEnvAnn result = retrieveSpecDCEnv(term, manager, parentsToIgnore, useInfixAppliesto, 
      processParents, addTrivialDC, applyPredTrans);    
    if (result == null)
    {
      throw new DomainCheckException("Could not calculate domain check conjectures for the given specification term");
    }
    Spec dcSpec = result.getDCSpec(manager);
    assert dcSpec != null;    
    return dcSpec;
  }
  
  /* AUXILIARY TOP-LEVEL METHODS */
  
  /** 
   * For a file "./dir/foo.ext", returns "./dir/foo_dc.ext".   
   * If .ext is not present, _dc is just added to the end.
   * @param filename full file name to add _dc before .ext
   * @return file name with added _dc before .ext
   */
  public static String getDCFilename(String filename)
  {    
    int dotIdx = filename.lastIndexOf(".");
    if (dotIdx == -1)
    {
      return filename + DOMAIN_CHECK_GENERAL_NAME_SUFFIX;
    }
    else
    {
      return filename.substring(0, dotIdx) + 
        DOMAIN_CHECK_GENERAL_NAME_SUFFIX + 
        filename.substring(dotIdx);
    }    
  }
  
  /**
   * For a file "./dir/foo.ext" or ".\dir\foo.ext", removes
   * the path such that the result is "foo.ext". If "foo.ext"
   * is given, it is directly returned.
   * @param filename full file name to remove path
   * @return file name with path removed
   */
  public static String removePath(String filename)
  {
    int barIdx = filename.lastIndexOf(File.separatorChar);
    if (barIdx == -1) {barIdx = filename.lastIndexOf("/");}
    if (barIdx == -1) {barIdx = filename.lastIndexOf("\\");}    
    return barIdx == -1 ? filename : filename.substring(barIdx + 1);  
  }
    
  /**
   * For a file "./dir/foo.ext", returns "./dir/foo".
   * If no extension is present, the filename given is returned.
   * @param filename full file name to remove extension
   * @return filename without extension
   */
  public static String getFileNameNoExt(String filename)
  {    
    int dotIdx = filename.lastIndexOf(".");    
    return dotIdx == -1 ? filename : filename.substring(0, dotIdx);
  }
  
  public static String getSourceName(String filename)
  {
    // transforms c:\temp\myfile.tex into myfile
    String resource = removePath(getFileNameNoExt(filename));        
    return resource;
  }
  
  /* AUXILIARY TOP-LEVEL METHODS */
  
  protected static final DomainCheckUtils domainCheckUtils_ = createDomainCheckUtils();
  
  protected static DomainCheckUtils createDomainCheckUtils()
  {
    return new DomainCheckUtils();
  }
  
  public static ZSect domainCheck(ZSect term, SectionManager manager, List<String> parentsToIgnore,
    boolean useInfixAppliesto, boolean processParents, boolean addTrivialDC, boolean applyPredTrans)
    throws DomainCheckException
  {
    return domainCheckUtils_.lDomainCheck(term, manager, parentsToIgnore, useInfixAppliesto, 
      processParents, addTrivialDC, applyPredTrans);
  }
  
  public static Spec domainCheck(Spec term, SectionManager manager, List<String> parentsToIgnore,
    boolean useInfixAppliesto, boolean processParents, boolean addTrivialDC, boolean applyPredTrans)
    throws DomainCheckException
  {
    return domainCheckUtils_.lDomainCheck(term, manager, parentsToIgnore, useInfixAppliesto, 
      processParents, addTrivialDC, applyPredTrans);
  }
  
  public static ZSect domainCheckTerm(Term term, SectionManager manager, List<String> parentsToIgnore,
    boolean useInfixAppliesto, boolean processParents, boolean addTrivialDC, boolean applyPredTrans)
    throws DomainCheckException
  {
    return domainCheckUtils_.lDomainCheckTerm(term, manager, parentsToIgnore, 
      useInfixAppliesto, processParents, addTrivialDC, applyPredTrans);
  }
  
  public static void print(String fileName, SectionManager manager, Spec dcSpec) throws DomainCheckException
  {        
    // the new file name to print
    String dcFileName = getDCFilename(fileName);
    String dcFileNoDirNoPath = removePath(getFileNameNoExt(dcFileName));
    
    // check the section manager knows about the DC spec presence    
    try
    {
      manager.get(new Key<Spec>(dcFileNoDirNoPath, Spec.class));
    }
    catch (CommandException e)
    {
      throw new DomainCheckException("Cannot print the given domain checked specification for file " + fileName +
        ". It was not properly setup within the section manager, which generated an exception. Please, see" +
        " the cause for details.", e);
    }
    
    // prepare the printer's key depending on the markup extracted from the filename extension    
    Markup markup = Markup.getMarkup(dcFileName);    
    Key<? extends CztPrintString> key;
    switch (markup)
    {
      case LATEX:
        //output = manager.get(new Key<LatexString>(dcfilename, LatexString.class));
        key = new Key<LatexString>(dcFileNoDirNoPath, LatexString.class);
        break;
      case UNICODE:        
        //output = manager.get(new Key<UnicodeString>(dcspecToPrint, UnicodeString.class));
        key = new Key<UnicodeString>(dcFileNoDirNoPath, UnicodeString.class);
        break;
      case ZML:
        //output = manager.get(new Key<XmlString>(dcspecToPrint, XmlString.class));
        key = new Key<XmlString>(dcFileNoDirNoPath, XmlString.class);
        break;
      default: 
        throw new DomainCheckException("Invalid file name extension. Could not retrieve " +
          "its markup format to produce DC section for " + dcFileNoDirNoPath + " in file " + dcFileName);
    }  
    
    // compute the printed dcSpec
    CztPrintString output;
    try
    {
      output = manager.get(key);
    }
    catch (CommandException e)
    {
      throw new DomainCheckException("Cannot print the given domain checked specification for file " + fileName +
        ". The section manager could not instruct the right printer to perform the command. Please, see cause for details.", e);
    }
    
    // check weather the dcFileName already exists, deleting it if so.    
    File dcFile = new File(dcFileName);    
    String extraMsg = dcFileName;
    if (dcFile.exists())
    {
      extraMsg = ", which already existed";
      System.out.println("Deleting old DC generated file " + dcFileName);
      boolean couldDelete = dcFile.delete();
      if (couldDelete) { extraMsg += " but could not be deleted"; }
    }
    
    // write the printed result on to the dc filename
    try
    {
      FileWriter writer = new FileWriter(dcFileName);
      System.out.println("Printing DC sections for Spec as " + dcFileNoDirNoPath + 
        " in file " + dcFileName);
      writer.write(output.toString());
      writer.close();
    }
    catch (IOException e)
    {
      throw new DomainCheckException("Cannot print the given domain checked specification for file " + fileName +
        ". An I/O exception was throw while trying to save the printed results to file " + extraMsg +
        ". Please, see cause for details.", e);
    }
  }   
  
  /* TOP-LEVEL METHODS FOR STANT-ALONE EXECUTION */
  
  protected void run(String [] args)
  {
    int result = 0;
    
    if (args.length == 0) {
      printUsage();
      System.exit(result);
    }

    List<String> files = new java.util.ArrayList<String>();
    boolean printBenchmark = printBenchmarkDefault();
    boolean raiseWarnings = raiseWarningsAsErrorsDefault();
    boolean useInfixAppliesTo = useInfixAppliesToDefault();
    boolean processParents = processParentsDefault();
    boolean addTrivialDC = addTrivialDCDefault();    
    boolean applyPredTransf = applyPredTransfDefault();
    String cztpath = cztPathDefault();
    String parentsToIgnore = parentToIgnoreListDefault();
    for (int i = 0; i < args.length; i++) 
    {
      if ("-a".equals(args[i])) 
      {
        useInfixAppliesTo = true;
      }
      else if ("-b".equals(args[i])) 
      {
        printBenchmark = true;
      }
      else if ("-p".equals(args[i]))
      {
        processParents = true;
      }
      else if ("-w".equals(args[i]))
      {
        raiseWarnings = true;
      }
      else if ("-r".equals(args[i]))
      {
        applyPredTransf = true;
      }
      else if (args[i].equals("-i"))
      {
        if (i == args.length)
        {
          printUsage();
          System.err.println("\nYou need to provide an argument for `-i'");
          System.exit(result);
        }
        i++;        
        parentsToIgnore = args[i].trim();
      }
      else if (args[i].equals("-cp"))
      {          
        if (i == args.length)
        {
          printUsage();
          System.err.println("\nYou need to provide an argument for `-cp'");
          System.exit(result);
        }
        i++;
        cztpath = args[i].trim();        
      }      
      else if (args[i].startsWith("-")) 
      {
        printUsage();
        System.exit(result);
      }
      else
      {
        files.add(args[i]);    
      }        
    }       
    // retrieve section manager and update its CZT properties.
    SectionManager manager = getSectionManager(getExtension());    
    manager.setProperty(PROP_DOMAINCHECK_USE_INFIX_APPLIESTO, String.valueOf(useInfixAppliesTo));
    manager.setProperty(PROP_DOMAINCHECK_PROCESS_PARENTS, String.valueOf(processParents));
    manager.setProperty(PROP_DOMAINCHECK_ADD_TRIVIAL_DC, String.valueOf(addTrivialDC));           
    manager.setProperty(PROP_DOMAINCHECK_APPLY_PRED_TRANSFORMERS, String.valueOf(applyPredTransf));    
    
    // add a potentially old czt path (? TODO: decide to add this or not ?)
    String localcztpath = "";
    if (cztpath != null && !cztpath.trim().isEmpty())
    {
      String oldcztpath = manager.getProperty("czt.path");
      if (oldcztpath != null && !oldcztpath.trim().isEmpty())
      {
        cztpath = oldcztpath + ";" + cztpath;
      }      
      localcztpath = cztpath;
    }
    
    List<String> parentsToIgnoreList = null;
    if (parentsToIgnore != null && !parentsToIgnore.isEmpty())
    {
      String oldpipath = manager.getProperty(PROP_DOMAINCHECK_PARENTS_TO_IGNORE);
      if (oldpipath != null && !oldpipath.trim().isEmpty())
      {
        parentsToIgnore = oldpipath + ";" + parentsToIgnore;
      }
      manager.setProperty(PROP_DOMAINCHECK_PARENTS_TO_IGNORE, parentsToIgnore);            
      parentsToIgnoreList = manager.getListProperty(parentsToIgnore);
    }
    
    SortedMap<String, List<Long>> timesPerFile = new TreeMap<String, List<Long>>();        
    long zeroTime = System.currentTimeMillis();     
    long currentTime = zeroTime;
    long lastTime = zeroTime;        
    for (String file : files) 
    {            
      
      // add the file parent to the path as well.      
      File archive = new File(file);
      if (archive != null && archive.getParent() != null) 
      {
        String fileParent = archive.getParent();
        if (fileParent != null && !fileParent.isEmpty())
        {
          localcztpath = fileParent;
        }
        if (cztpath != null && !cztpath.isEmpty())
        {
          localcztpath = fileParent + ";" + cztpath;
        }             
      }            
      if (localcztpath != null && !localcztpath.trim().isEmpty())
      {
        manager.setProperty("czt.path", localcztpath);
      }      
      
      long parsingErrors = 0;
      long typeErrors = 0;      
      long parsingTime = 0;
      long typeCheckTime = 0;
      long domainCheckTime = 0;
      long printTime = 0;
      Spec spec = null;
      List<SectTypeEnvAnn> types = new ArrayList<SectTypeEnvAnn>();            
      try 
      {                
        // retrieve it as either a ZSect or Spec - expects file name to be section name
        spec = manager.get(new Key<Spec>(getFileNameNoExt(file), Spec.class));
      }      
      catch (ParseException exception) {
        parsingErrors = exception.getErrorList().size();
        exception.printErrorList();        
      }
      catch (CommandException e)
      {
        if (e.getCause() != null)
        { 
          System.err.println("Command exception has happened: \n\t" + e.getMessage());
          System.err.println("It was caused by: \n\t" + e.getCause().getMessage());            
          System.err.println("Perhaps the file does not contain a Z section with the same name.");
          e.printStackTrace();          
        }
        else
        {
          System.err.println("Command exception has happened without a cause: \n\t" + e.getMessage());
          System.err.println("Perhaps the file does not contain a Z section with the same name.");
          e.printStackTrace();
        }        
      }
      catch(UnsupportedAstClassException e)
      {
        System.err.println("An attempt to wrongly cast an AST class has happened.\n" +
          "This is usually a bug, and should not happen. Please report it to czt-devel@lists.sourceforge.net");    
        e.printStackTrace();        
      }
      catch(CztException f)
      {
        System.err.println("A general CztException has happened.\n" +
          "This is usually a bug, and should not happen. Please report it to czt-devel@lists.sourceforge.net");    
        f.printStackTrace();        
      }
      /* ex:
       * 0        40           
       * |--Parse--|--TypeCheck--|--DomainCheck--|--PrintDC--|      
       * lt = 0
       * ct = 40
       * pt = 40 (40 - 0)
       */            
      lastTime = currentTime;
      currentTime = System.currentTimeMillis();      
      parsingTime = currentTime - lastTime;        
      
      // typecheck + domain cehck each section      
      if (spec != null)
      {
        try 
        {
          for(Sect sect : spec.getSect())
          {
            if (sect instanceof ZSect)
            {
              ZSect zs = (ZSect)sect;
              SectTypeEnvAnn tp = manager.get(new Key<SectTypeEnvAnn>(zs.getName(), SectTypeEnvAnn.class));
              types.add(tp);
            }
          }
        }
        catch (CommandException e)
        {
          if (e.getCause() != null)
          {
            if (e.getCause() instanceof TypeErrorException)
            {
              TypeErrorException te = (TypeErrorException)e.getCause();
              typeErrors = domainChecker_.printErrors(te.errors(), raiseWarnings);
            }
            else
            {
              System.err.println("Command exception has happened: \n\t" + e.getMessage());
              System.err.println("It was caused by: \n\t" + e.getCause().getMessage());            
              System.err.println("Perhaps the file does not contain a Z section with the same name.");
              e.printStackTrace();
            }
          }
          else
          {
            System.err.println("Command exception has happened without a cause: \n\t" + e.getMessage());
            System.err.println("Perhaps the file does not contain a Z section with the same name.");
            e.printStackTrace();
          }
          System.exit(-1);
        }
        /* ex:
         * 0        40           
         * |--Parse--|--TypeCheck--|--DomainCheck--|--PrintDC--|      
         * lt = 0
         * ct = 40
         * pt = 40 (40 - 0)
         */            
        lastTime = currentTime;
        currentTime = System.currentTimeMillis();      
        typeCheckTime = currentTime - lastTime;        

        //if the typecheck succeeded, domain check the spec
        assert spec != null;            
        Spec dcSpec = null;
        try 
        {
          // create the domain checked section
          dcSpec = lDomainCheck(spec, manager, parentsToIgnoreList, useInfixAppliesTo, 
            processParents, addTrivialDC, applyPredTransf);
        }
        catch (DomainCheckException e) 
        {
          System.err.println("A domain check exception has happened: " + e.getMessage());
          e.printStackTrace();          
        }        
        // result is the number of errors to consider        
        result += typeErrors + parsingErrors;

        /* ex:
         * 0        40            100
         * |--Parse--|--TypeCheck--|--DomainCheck--|--PrintType--|         
         * lt = 40
         * ct = 100
         * tt = 60  (100-40)
         */
        lastTime = currentTime;
        currentTime = System.currentTimeMillis();
        domainCheckTime = currentTime - lastTime;

        if (dcSpec != null)
        {
          try 
          {
            System.out.println("Printing DC ZSect for " + file);
            print(file, manager, dcSpec);
          }                
          catch (DomainCheckException e)
          {
            System.err.println("Domain exception thrown while trying to domain check " + file);
            e.printStackTrace();          
          }
         
          /* ex:
           * 0        40            100
           * |--Parse--|--TypeCheck--|--DomainCheck--|--Print--|         
           * lt = 40
           * ct = 100
           * tt = 60  (100-40)
           */
          lastTime = currentTime;
          currentTime = System.currentTimeMillis();
          printTime = currentTime - lastTime;          
        } 
      }      
      timesPerFile.put(file, Arrays.asList(parsingErrors, typeErrors,
        parsingTime, typeCheckTime, domainCheckTime, printTime, typeCheckTime+domainCheckTime+printTime));
      // Reset the currentTime offset
    }    
    currentTime = System.currentTimeMillis();
    lastTime = currentTime;
    long totalTime = System.currentTimeMillis() - zeroTime;
    
    if (printBenchmark) 
    {      
      System.out.println(totalTime + "ms for " + files.size() + " files.");
      for(String file : timesPerFile.keySet()) 
      {
        List<Long> times = timesPerFile.get(file);
        System.out.println("\t" + times.get(6) + "ms for " + file + ":");
        System.out.println("\t\tparsing errors.." + times.get(0));
        System.out.println("\t\ttype errors....." + times.get(1));
        System.out.println("\t\tparser.........." + times.get(2) + "ms");
        System.out.println("\t\ttypechecker....." + times.get(3) + "ms");
        System.out.println("\t\tdomainchecker..." + times.get(4) + "ms");                
        System.out.println("\t\tprinter........." + times.get(5) + "ms");                
      }             
    }        
    System.exit(result);
  }
   
  public static void main(String[] args)
  {        
    domainCheckUtils_.run(args);
  }  

  /**
   * Get a Command object for use in SectionManager
   *
   * @return A command for typechecking sections.
   */
  public static Command getCommand()
  {
    return new DomainCheckerCommand();
  }
}
