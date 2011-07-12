/**
Copyright (C) 2004, 2005 Leo Freitas
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
package net.sourceforge.czt.typecheck.zeves;

import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import net.sourceforge.czt.base.ast.Term;
import net.sourceforge.czt.circus.util.PrintVisitor;
import net.sourceforge.czt.parser.util.ErrorType;
import net.sourceforge.czt.session.SectionManager;
import net.sourceforge.czt.util.CztLogger;

/**
 * A JUnit test class for testing the typechecker. This reads any
 * files not ending with a "_" from the directory tests/circus.
 *
 * If the file ends with ".error", then the test reads everything up
 * to the first "-" and that is the name of the error constant.
 *
 * If the file does not end in ".error" or "_", then no error is
 * expected.
 *
 * @author Leo Freitas
 */
public class TypeCheckerTest
  extends net.sourceforge.czt.typecheck.z.TypeCheckerTest
{

  // true => looks into tests/circus/debug/*.tex;
  // false=> looks into tests/circus/*.tex
  protected static boolean DEBUG_TESTING = false; // true;
  // true => executes the printing tests, which will reparse and print files.
  protected static boolean TESTING_PRINTING = false;
  protected static Level DEBUG_LEVEL = DEBUG_TESTING ? Level.FINEST : Level.WARNING;
  protected static List<String> TESTS_SOURCEDIR = new ArrayList<String>();

  static
  {
    File shouldDebug = new File("src/test/resources/tests/zeves/debug-please");
    try
    {
      System.out.println("shouldDebug? \n path = " + shouldDebug.getPath() + "\n abs path = " + shouldDebug.getAbsolutePath() + "\n can path = " + shouldDebug.getCanonicalPath() + " \n exists? = " + shouldDebug.exists());
    }
    catch (java.io.IOException e)
    {
    }
    DEBUG_TESTING = shouldDebug.exists();
    if (DEBUG_TESTING)
    {
      System.out.println("Debug mode is on");
      TESTS_SOURCEDIR.add("tests/zeves/debug");
      DEBUG_LEVEL = Level.FINEST;
    }
    else
    {
      System.out.println("Debug mode is off");
      TESTS_SOURCEDIR.add("tests/zeves");
      DEBUG_LEVEL = Level.WARNING;
    }
  }
  private final SectionManager manager_ = new SectionManager("zeves");

  public static Test suite()
  {
    CztLogger.getLogger(SectionManager.class).setLevel(Level.OFF);
    TestSuite suite = new TestSuite();

    TypeCheckerTest checkerTest = new TypeCheckerTest(false);
    checkerTest.collectTests(suite, TESTS_SOURCEDIR);
    return suite;
  }

  public TypeCheckerTest(boolean recursiveTypes)
  {
    super(false, recursiveTypes);
  }
  
  protected void collectTests(TestSuite suite, List<String> directoryNames) 
  {
    for(String dirName : directoryNames) {
      collectTests(suite, dirName);
    }
  }

  protected void collectTests(TestSuite suite, String directoryName)
  {
    String cztHome = System.getProperty("czt.home");
    //System.out.println("CZT-HOME = " + cztHome);
    if (cztHome == null || cztHome.length() == 0)
    {
      cztHome = manager_.getProperty("czt.path");
      //System.out.println("CZT-PATH = " + cztHome);
      if (cztHome == null)
      {
        cztHome = "";
      }
    }
    // if it is a list of directories...
    List<String> paths = Arrays.asList(cztHome);
    if (cztHome != null && cztHome.indexOf(File.pathSeparatorChar) != -1)
    {
      paths = Arrays.asList(cztHome.split(File.pathSeparator));
    }
    File[] files = null;
    for(String path : paths)
    {
      String fullDirectoryName = path.trim() + (!path.isEmpty() ? "\\" : "") + directoryName;
      System.out.println("Full directory name = " + fullDirectoryName);
      File directory = new File(fullDirectoryName);      
      if (!directory.isDirectory())
      {
        URL url = getClass().getResource("/");
        if (url != null)
        {
          System.out.println("Looking for tests under: " + url.getFile() + fullDirectoryName);
          directory = new File(url.getFile() + fullDirectoryName);
          if (!directory.isDirectory())
          {
            System.out.println("No tests to perform on " + directory.getAbsolutePath());
          }
          else
          {
            files = directory.listFiles();
          }
          break;
        }
        else
        {
          fail("Could not retrieve a valid testing set under " + directory.getAbsolutePath());
        }
      }
      else
      {
        files = directory.listFiles();
        break;
      }
    }
    if (files != null)
    {
      for (File file : files)
      {
        collectTest(suite, file);
      }
    }
  }

  protected void collectTest(TestSuite suite, File file)
  {
    String fileName = file.getName();
    String fullPath = file.getAbsolutePath();

    //if the file name ends with error, then we have a case with
    //the typechecker should throw the exception specified at the
    //start of the filename
    if (fileName.endsWith(".error"))
    {
      int dashIndex = fileName.lastIndexOf("-");
      int dotIndex  = fileName.lastIndexOf(".");
      if (dashIndex < 1 || dotIndex < 1)
      {
        fail(fileName + " does not specify an exception name");
      }      
      String exception = fileName.substring(dashIndex+1, dotIndex);
      System.out.println("Adding error test for " + exception);
      suite.addTest(createErrorTest(fullPath, exception));
    }
    //if the file name does not end with error, then we have a
    //normal case
    else if (fileName.endsWith(".tex"))
    {
      suite.addTest(createNormalTest(fullPath));
    }
  }

  protected SectionManager getManager()
  {
    return manager_;
  }
  
  protected Term parse(String file, SectionManager manager)
    throws Exception
  {
    Term term = super.parse(new File(file).toURL(), manager);
    if (DEBUG_TESTING && DEBUG_LEVEL.intValue() <= Level.INFO.intValue()) {
        System.out.flush();
        PrintVisitor pv = new PrintVisitor();
        System.out.println("DEBUG: AFTER PARSING, PrintVisitor for " + file);        
        System.out.println(pv.printProcessPara(term));
        System.out.println();
        System.out.println(term);
        System.out.flush();
    }
    return term;
  }
  
  protected List typecheck(Term term, SectionManager manager)
    throws Exception
  {
    return TypeCheckUtils.typecheck(term,
      manager,
      recursiveTypes_);
  }
  
  protected TestCase createNormalTest(String fullpath)
  {
    return new TestNormal(fullpath);
  }

  protected TestCase createErrorTest(String fullpath, String exception)
  {
    return new TestError(fullpath, exception);
  }

  class TestNormal
    extends TestCase
  {

    private String file_;

    TestNormal(String file)
    {
      file_ = file;
    }

    public void runTest()
    {
      SectionManager manager = getManager();
      List<? extends ErrorAnn> errors = new ArrayList<ErrorAnn>();
      Term term = null;
      try
      {
        System.out.println("Test normal: " + file_);
        term = parse(file_, manager);
        errors = typecheck(term, manager);
      }
      catch (RuntimeException e)
      {
        e.printStackTrace();
        fail("\nUnexpected runtime exception" +
          "\n\tFile: " + file_ +
          "\n\tException: " + e.toString());
      }
      catch (Throwable e)
      {
        e.printStackTrace();
        fail("\nUnexpected exception" +
          "\n\tFile: " + file_ +
          "\n\tException: " + e.toString());
      }
      if (errors.size() > 0)
      {
        for(ErrorAnn errorAnn : errors)
        {
          // only look for errors, not warnings
          if (errorAnn.getErrorType().equals(ErrorType.ERROR))
          {
            fail("\nUnexpected type error" +
              "\n\tFile: " + file_ +
              "\n\tException: " + errorAnn.getErrorMessage().toString() +
              "\nError: " + errorAnn.toString());
            break;
          }
        }
      }
    }
  }
  
  class TestError
    extends TestCase
  {

    private String file_;
    private String exception_;

    TestError(String file, String exception)
    {
      file_ = file;
      exception_ = exception;
    }

    public void runTest()
    {
      SectionManager manager = getManager();
      List<? extends ErrorAnn> errors = new ArrayList<ErrorAnn>();
      try
      {
        System.out.println("Test error: " + file_);
        Term term = parse(file_, manager);
        if (term == null)
        {
          fail("Parser returned null");
        }
        else
        {
          errors = typecheck(term, manager);
        }
      }
      catch (RuntimeException e)
      {
        e.printStackTrace();
        fail("\nUnexpected runtime exception" +
          "\n\tFile: " + file_ +
          "\n\tException: " + e.toString());
      }
      catch (Throwable e)
      {
        fail("\nUnexpected exception" +
          "\n\tFile: " + file_ +
          "\n\tException: " + e.toString());
      }
      if (errors.size() == 0)
      {
        fail("\nNo type error found" +
          "\n\tFile: " + file_ +
          "\n\tExpected: " + exception_);
      }
      else
      {
        String actual = null;
        boolean foundCorrectError = false;
        for(ErrorAnn errorAnn : errors)
        {
          // only look for errors, not warnings
          if (errorAnn.getErrorType().equals(ErrorType.ERROR))
          {
            actual = removeUnderscore(errorAnn.getErrorMessage().toString());
            foundCorrectError = (exception_.compareToIgnoreCase(actual) == 0);
            if (foundCorrectError) break;
          }
        }
        if (!foundCorrectError)
        {
          incorrectError(actual);
        }
      }
    }

    private String removeUnderscore(String string)
    {
      String result = new String();
      for (int i = 0; i < string.length(); i++)
      {
        char c = string.charAt(i);
        if (c != '_')
        {
          result += c;
        }
      }
      return result;
    }

    private void incorrectError(String error)
    {
      fail("\nIncorrect type error" +
        "\n\tFile: " + file_ +
        "\n\tError: " + exception_ +
        "\n\tActual: " + error);
    }
  }
}