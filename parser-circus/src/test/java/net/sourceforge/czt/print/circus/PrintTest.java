/*
 * PrintTest.java
 *
 * Created on 01 May 2007, 13:22
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package net.sourceforge.czt.print.circus;

import java.io.File;
import java.io.FileWriter;
import java.util.logging.Level;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import net.sourceforge.czt.base.ast.Term;
import net.sourceforge.czt.parser.circus.ParserTest;
import net.sourceforge.czt.session.FileSource;
import net.sourceforge.czt.session.SectionManager;
import net.sourceforge.czt.util.CztException;
import net.sourceforge.czt.util.CztLogger;

/**
 *
 * @author leo
 */
public class PrintTest  extends ParserTest
{
  public static Test suite()
  {
    CztLogger.getLogger(SectionManager.class).setLevel(Level.OFF);
    TestSuite suite = new TestSuite();
    PrintTest printTests = new PrintTest();
    printTests.collectTests(suite, TESTS_SOURCEDIR);        
    System.out.println("Number of (hoppefully) successful tests to run: " + suite.countTestCases());
    return suite;
  }
  
  protected void collectTest(TestSuite suite, File file)
  {   
    // DO NOTHING, FOR NOW
    //super.collectTest(suite, file);
  }
  
  protected FileWriter print(Term term, String file) throws Exception
  {      
    assert term != null && file != null;
    FileWriter writer = new FileWriter(file);    
    PrintUtils.printLatex(term, writer, getSectionManager());
    if (DEBUG_TESTING) {
        System.out.flush();
        System.out.println("DEBUG: AFTER PRINTING, saved to " + file);                
        System.out.flush();
    }    
    return writer;
  }
  
  protected TestNormal createTestCase(String name) {
      return new TestNormal(name);
  }
  
  public static final String PRINT_LATEX_EXT = ".print";
  
  protected class TestNormal extends ParserTest.TestNormal
  {
    protected TestNormal(String file)
    {
      super(file);
    }
  
    protected String getFile() {
        return super.getFile() + PRINT_LATEX_EXT;
    }
    
    public void runTest()
    { 
      // parse the file
      System.out.println("PARSING FOR PRINTING");
      innerTest();
      assertTrue("Could not parse file " + super.getFile() + " for printing", getTerm() != null);
      
      try
      {
        System.out.println("PREPARING FOR PRINTING");
        FileWriter writer = print(getTerm(), getFile());
        if (writer == null)
        {
          fail("Printer returned null writer (i.e., printing error)");
        }
        writer.close();
      }            
      catch (net.sourceforge.czt.util.CztException f)
      {
        printCauses(f);
        fail(lineSeparator_ + "Unexpected print exception" +
            lineSeparator_ + "\tFile: " + getFile() +
            lineSeparator_ + "\tException: " + f.toString());               
      }
      catch (RuntimeException e)
      {
        printCauses(e);
        fail(lineSeparator_ + "Unexpected runtime exception" +
            lineSeparator_ + "\tFile: " + getFile() +
            lineSeparator_ + "\tException: " + e.toString());                
      }
      catch (Throwable e)
      {        
        printCauses(e);
        fail(lineSeparator_ + "Unexpected exception" +
            lineSeparator_ + "\tFile: " + getFile() +
            lineSeparator_ + "\tException: " + e.toString());        
      }
    }
  }
}