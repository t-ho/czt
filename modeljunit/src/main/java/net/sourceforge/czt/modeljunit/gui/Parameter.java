/**
 * The TestingParameter class includes all the value of PanelTestDesign,
 * Application can store these parameters into file or load them from file
 */

package net.sourceforge.czt.modeljunit.gui;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import net.sourceforge.czt.modeljunit.RandomTester;

/*
 * Parameter.java
 * @author rong ID : 1005450 13th Aug 2007
 */

public class Parameter
{
  public static final String DEFAULT_DIRECTORY = System.getProperty("user.dir");

  // Number of coverage options
  public static final int NUM_COVERAGE = 4;

  /**
   * Package related variables
   */
  private static String m_strPackageTopFolder;

  private static String m_strPackageLocation;

  private static String m_strPackageName;

  public static String getPackageTopFolder()
  {
    return m_strPackageTopFolder;
  }

  public static void setPackageTopFolder(String folder)
  {
    m_strPackageTopFolder = folder;
  }

  public static String getPackageLocation()
  {
    return m_strPackageLocation;
  }

  public static String getPackageName()
  {
    return m_strPackageName;
  }

  public static void setPackageLocation(String location)
  {
    m_strPackageLocation = location;
  }

  public static void setPackageName(String name)
  {
    m_strPackageName = name;
  }

  /**
   * Testing parameters, dot graph
   * */
  private static boolean m_bGenerateGraph;

  public static boolean getGenerateGraph()
  {
    return m_bGenerateGraph;
  }

  public static void setGenerateGraph(boolean print)
  {
    m_bGenerateGraph = print;
  }

  /**
   * Reset probability
   *
   * Set the probability of doing a reset during random walks.
   * Note that the average length of each test sequence will
   * be roughly proportional to the inverse of this probability.
   *
   * If this is set to 0.0, then resets will only be done
   * when we reach a dead-end state (no enabled actions).
   * This means that if the FSM contains a loop that does not
   * have a path back to the initial state, then the random walks
   * may get caught in that loop forever. For this reason,
   * a non-zero probability is recommended.
   */
  private static double m_dResetProbability = RandomTester.DEFAULT_RESET_PROBABILITY;

  public static double getResetProbability()
  {
    return m_dResetProbability;
  }

  public static void setResetProbability(double probability)
  {
    m_dResetProbability = probability;
  }

  /**
   * Test generation verbosity
   * whether user wants show verbosity or not
   */
  private static boolean m_bVerbosity = true;

  public static boolean getVerbosity()
  {
    return m_bVerbosity;
  }

  public static void setVerbosity(boolean verb)
  {
    m_bVerbosity = verb;
  }

  /**
   * Test failure verbosity
   *
   */
  private static boolean m_bFailureVerbosity;

  public static boolean getFailureVerbosity()
  {
    return m_bFailureVerbosity;
  }

  public static void setFailureVerbosity(boolean verb)
  {
    m_bFailureVerbosity = verb;
  }

  /**
   * Class name, just includes the name of the class and suffix
   */
  private static String m_strClassName;

  public static String getClassName()
  {
    return m_strClassName;
  }

  public static void setClassName(String classname)
  {
    m_strClassName = classname;
  }

  /**
   * The absolute path of model (class or java file) includes path and file name
   */
  private static String m_strModelLocation;

  public static String getModelLocation()
  {
    return m_strModelLocation;
  }

  public static void setModelLocation(String location)
  {
    m_strModelLocation = location;
  }

  /**
   * Algorithm name
   * When user select new algorithm from GUI, this value will be changed. 
   */
  private static String m_strAlgorithmName;

  public static String getAlgorithmName()
  {
    return m_strAlgorithmName;
  }

  public static void setAlgorithmName(String algorithmname)
  {
    m_strAlgorithmName = algorithmname;
  }

  /**
   * Test case class name
   */
  private static String m_strTestCaseVariableName;

  public static String getTestCaseVariableName()
  {
    return m_strTestCaseVariableName;
  }

  public static void setTestCaseVariableName(String name)
  {
    m_strTestCaseVariableName = name;
  }

  /**
   * Transition Coverage options
   * 0. State coverage
   * 1. Transition coverage
   * 2. Transition pair coverage
   * 3. Action coverage
   */
  private static boolean[] m_bCoverageOption = new boolean[4];

  public static boolean[] getCoverageOption()
  {
    return m_bCoverageOption;
  }

  public static void setCoverageOption(boolean[] options)
  {
    m_bCoverageOption = options;
  }

  /**
   * Working directory
   */
  private static String m_strModelChooserDirectory;

  public static String getModelChooserDirectory()
  {
    return m_strModelChooserDirectory;
  }

  public static void setModelChooserDirectory(String directory)
  {
    m_strModelChooserDirectory = directory;
  }

  /*
   * When user open a file selection dialog the default location is
   * 0. To use last time directory, 1. To use default path, the default
   * path is the location that the application running.
   */
  private static int m_nFileChooserOpenMode;

  public static int getFileChooserOpenMode()
  {
    return m_nFileChooserOpenMode;
  }

  public static void setFileChooserOpenMode(int mode)
  {
    m_nFileChooserOpenMode = mode;
  }

  /**
   * The function will test whether a model was loaded 
   * and whether a algorithm was selected, if both been done, return true
   * otherwise return false 
   * @return if user can use the model to test return true otherwise return false
   */
  public static boolean isTestRunnable(boolean bShowErrMsg)
  {
    if (m_strClassName == null || !TestExeModel.isModelLoaded()
        || m_strClassName.length() == 0) {
      if (bShowErrMsg)
        ErrorMessage.DisplayErrorMessage("NO MODEL", "No model loaded!");
      return false;
    }
    return true;
  }

  // 0.State coverage color
  // 1.Transition coverage color
  // 2.Transition pair coverage color
  // 3.Action coverage color
  private static Color[] m_colorLine;

  public static void setCoverageLineColors(Color[] color)
  {
    m_colorLine = color;
  }

  // Lazy initialization the line color
  public static Color[] getCoverageLineColors()
  {
    if (m_colorLine == null) {
      m_colorLine = new Color[4];
      m_colorLine[0] = Color.BLACK;
      m_colorLine[1] = Color.RED;
      m_colorLine[2] = Color.GREEN;
      m_colorLine[3] = Color.BLUE;
    }
    return m_colorLine;
  }

  //-------------------- Functions about setting.txt ---------------------

  private static File recreateSettingFile()
  {
    // Get the java file in the current directory
    String currentDirectory = System.getProperty("user.dir");
    File file = new File(currentDirectory + File.separator + "setting.txt");
    if (file.exists())
      file.delete();
    // Create new setting file
    try {
      file.createNewFile();
    }
    catch (IOException e) {
      e.printStackTrace();
    }
    return file;
  }

  public static void createDefaultSettingFile()
  {
    String currentDirectory = System.getProperty("user.dir");
    File file = recreateSettingFile();
    // Write settings
    try {
      System.out.println("create default setting file");
      BufferedWriter out = new BufferedWriter(new FileWriter(file));
      out.write("Model directory=" + currentDirectory);
      out.close();
    }
    catch (IOException e) {
      e.printStackTrace();
    }
  }

  public static void readSettingFile()
  {
    // Get the java file in the current directory
    String currentDirectory = System.getProperty("user.dir");
    File file = new File(currentDirectory + File.separator + "setting.txt");
    // Generate new setting file
    if (!file.exists()) {
      Parameter.createDefaultSettingFile();
    }
    else
      System.out.println(file.getPath());
    try {
      BufferedReader in = new BufferedReader(new FileReader(file));
      String str;
      String[] parameters;
      while ((str = in.readLine()) != null) {
        parameters = str.split("=");
        // read model class location
        if (parameters[0].equalsIgnoreCase("Model directory"))
          m_strModelChooserDirectory = parameters[1];
        if (parameters[0].equalsIgnoreCase("Package location"))
          m_strPackageLocation = parameters[1];
        if (parameters[0].equalsIgnoreCase("Package name")) {
          m_strPackageName = parameters[1];
          // Compose package top folder
          char[] name = m_strPackageName.toCharArray();
          for (int i = 0; i < name.length; i++) {
            if (name[i] == '.')
              name[i] = File.separator.charAt(0);
          }
          String strName = new String(name);
          m_strPackageTopFolder = m_strPackageLocation + File.separator
              + strName;
        }
      }
      in.close();
    }
    catch (IOException e) {
    }
  }

  public static void wirteSettingFile()
  {
    File file = recreateSettingFile();
    String br = System.getProperty("line.separator");
    // Write current settings
    try {
      System.out.println("create default setting file");
      BufferedWriter out = new BufferedWriter(new FileWriter(file));
      out.write("Model directory=" + Parameter.getModelChooserDirectory() + br);
      out.write("Package location=" + Parameter.getPackageLocation() + br);
      out.write("Package name=" + Parameter.getPackageName() + br);
      out.close();
    }
    catch (IOException e) {
      e.printStackTrace();
    }
  }

  //----------------------Override toString----------------------
  public String toString()
  {
    return "class name: " + m_strClassName + ", \nLocation: "
        + m_strModelLocation + ", \nAlgorithm: " + m_strAlgorithmName
        + ", \nCoverage: " + m_bCoverageOption[0] + ", " + m_bCoverageOption[1]
        + ", " + m_bCoverageOption[2] + ".";
  }
}
