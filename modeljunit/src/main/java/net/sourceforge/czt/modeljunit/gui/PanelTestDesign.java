package net.sourceforge.czt.modeljunit.gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.*;

public class PanelTestDesign extends JPanel
	implements ActionListener{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5316043261026727079L;
	// Model panel
	private JPanel m_panelModel;
	private JLabel m_labTestModel = new JLabel("Test Model:");
	private JTextField m_txtFilePath;
	private JButton m_butOpenModel;
	// Algorithm panel
	private final static int H_SPACE = 6;
	private int m_nCurAlgo;
	private JPanel m_panelAlgorithmBase;
	private JComboBox m_combAlgorithmSelection = new JComboBox();
	private AlgorithmPanel[] m_panelAlgorithm;
	private OptionPanelDefault m_panelDefaultOption;
	// Coverage matrix panel
	private JPanel m_panelCoverageMatrix;
	private int m_nCheckBox = 3;
	private JCheckBox[] m_checkCoverage;
	private boolean[] m_bChecked;
	// Base panel
	private static PanelTestDesign m_panel = null;
	// Test parameters
	private TestingParameter m_paraSetting = new TestingParameter();
	public TestingParameter getSetting()
	{ return m_paraSetting; }
	// Generated code
	private String m_strCode;
	public String getCode(){ return m_strCode;}
	public static PanelTestDesign createTestDesignPanel(){
		if(m_panel == null)
			m_panel = new PanelTestDesign();
		return m_panel;
	}
	private PanelTestDesign(){
		this.setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
		// ------ Setup model panel ------
		m_txtFilePath = new JTextField();
		m_txtFilePath.setColumns(26);
		m_butOpenModel = new JButton("...");
		m_butOpenModel.addActionListener(this);
		m_panelModel = new JPanel();
		m_panelModel.setLayout(new FlowLayout());
		//m_panelModel.setLayout(new BorderLayout());
		// m_panelModel.add(Box.createHorizontalStrut(H));
		m_panelModel.add(m_labTestModel);
		// m_panelModel.add(Box.createHorizontalStrut(H));
		m_panelModel.add(m_txtFilePath);
		// m_panelModel.add(Box.createHorizontalStrut(H));
		m_panelModel.add(m_butOpenModel);
		// m_panelModel.add(Box.createHorizontalGlue());
		m_panelModel.setPreferredSize(new Dimension(30,40));
		this.add(m_panelModel);
		this.add(Box.createVerticalStrut(H_SPACE));
		// ------ Initialize algorithm panel ------
		m_nCurAlgo = 0;
		m_panelAlgorithmBase = new JPanel();
		// m_panelAlgorithmBase.setLayout();
		// m_panelAlgorithmBase.add(Box.createHorizontalStrut(H));
		m_panelAlgorithm = new AlgorithmPanel[3];
		m_panelAlgorithm[0] = new AlgorithmPanel("Algorithm selection","Select an algorithm from combobox.","default.gif");
		m_panelAlgorithm[0].setOptionPanel(new OptionPanelDefault());
		m_panelAlgorithm[1] = new AlgorithmPanel("Random","Random algorithm to travsal the model","random.gif");
		m_panelAlgorithm[1].setOptionPanel(new OptionPanelRandomWalking());
		m_panelAlgorithm[2] = new AlgorithmPanel("Greedy","Greedy algorithm to travsal the model","greedy.gif");
		m_panelAlgorithm[2].setOptionPanel(new OptionPanelGreedy());
		m_combAlgorithmSelection.addItem(m_panelAlgorithm[0].getAlgorithmName());
		m_combAlgorithmSelection.addItem(m_panelAlgorithm[1].getAlgorithmName());
		m_combAlgorithmSelection.addItem(m_panelAlgorithm[2].getAlgorithmName());
		m_combAlgorithmSelection.addActionListener(this);
		m_panelAlgorithmBase.add(m_combAlgorithmSelection);
		// m_panelAlgorithmBase.add(Box.createHorizontalStrut(H_SPACE));
		m_panelDefaultOption = new OptionPanelDefault();
		m_panelAlgorithmBase.add(m_panelDefaultOption);
		// m_panelAlgorithmBase.add(Box.createHorizontalStrut(H_SPACE));
		this.add(m_panelAlgorithmBase);
		this.add(Box.createHorizontalStrut(H_SPACE));
		// ------ Coverage matrix panel ------
		m_panelCoverageMatrix = new JPanel();
		m_panelCoverageMatrix.setLayout(new BoxLayout(m_panelCoverageMatrix,BoxLayout.Y_AXIS));
		m_checkCoverage = new JCheckBox[m_nCheckBox];
		m_checkCoverage[0] = new JCheckBox("Coverage Matrix option1");
		m_checkCoverage[1] = new JCheckBox("Coverage Matrix option2");
		m_checkCoverage[2] = new JCheckBox("Coverage Matrix option3");
		Color bg = new Color(206,206,206);
		
		m_bChecked = new boolean[m_nCheckBox];
		for(int i=0;i<m_nCheckBox;i++){
			m_checkCoverage[i].setBackground(bg);
			m_checkCoverage[i].addActionListener(this);
			m_bChecked[i] = false;
			m_panelCoverageMatrix.add(m_checkCoverage[i]);
		}
		m_panelCoverageMatrix.setBackground(bg);
		this.add(m_panelCoverageMatrix);
		this.add(Box.createVerticalGlue());
	}
	public PanelTestDesign clone()
	{ return null; }
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==this.m_combAlgorithmSelection)
		{
			m_panelAlgorithmBase.removeAll();
			m_panelAlgorithmBase.setLayout(new FlowLayout());
			m_panelAlgorithmBase.add(m_combAlgorithmSelection);
			m_nCurAlgo = m_combAlgorithmSelection.getSelectedIndex();
			// Display the algorithm related panel
			if(m_panelAlgorithm[m_nCurAlgo].getOptionPanel() == null)
				System.out.println("Error: Algorithm panel is null");
			m_panelAlgorithmBase.add(m_panelAlgorithm[m_nCurAlgo].getOptionPanel());
			m_panelAlgorithmBase.revalidate();
			// Update the setting
			m_paraSetting.m_strAlgorithmName = 
				m_panelAlgorithm[m_nCurAlgo].getAlgorithmName();
		}
		if(e.getSource() == m_butOpenModel)
		{
			System.out.println("File chooser open");
			String[] extensions= {"java","class"};
			FileChooserFilter javaFileFilter = new FileChooserFilter(extensions, "Java Files");
			JFileChooser chooser = new JFileChooser();
			chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
			chooser.setDialogTitle("Opne model file");
			chooser.addChoosableFileFilter(javaFileFilter);
			int option = chooser.showOpenDialog(this.m_panelModel);
			
			if(option == JFileChooser.APPROVE_OPTION)
			{
				File f = chooser.getSelectedFile();
				String[] fileName = f.getName().split("\\.");
				m_paraSetting.m_strClassName = fileName[0];
				m_paraSetting.m_strModelLocation = f.getAbsolutePath();
				// Update the text field component
				this.m_txtFilePath.setText(m_paraSetting.m_strClassName+
						" ( "+m_paraSetting.m_strModelLocation+" )");
				m_txtFilePath.setCaretPosition(0);
			}
		}
		// Check the coverage matrix options
		for(int i=0; i<m_nCheckBox; i++)
		{
			if(e.getSource() == m_checkCoverage[i])
			{
				m_bChecked[i] = !m_bChecked[i];
				System.out.println("Check box "+i+" state is "+m_bChecked[i]);
			}
		}
	}
	
	public void generateCode()
	{
		StringBuffer buf = new StringBuffer();

		buf.append("import net.sourceforge.czt.modeljunit.*;\n");
		buf.append("import net.sourceforge.czt.modeljunit.coverage.CoverageMetric;\n");
		buf.append("import net.sourceforge.czt.modeljunit.coverage.TransitionCoverage;\n");
		buf.append("public class "+m_paraSetting.m_strClassName+"Tester\n{\n");
		buf.append("\tpublic static void main(String args[])\n\t{\n\t");
		buf.append("\t"+m_paraSetting.m_strClassName+" model = new " +
				m_paraSetting.m_strClassName + "();\n");
		buf.append("\t}\n");
		buf.append("}");
		m_strCode = buf.toString();
		System.out.println(m_strCode);
	}
	
	private class FileChooserFilter
	extends javax.swing.filechooser.FileFilter {
		private String m_description = null;
		private String[] m_extension = null;
		public FileChooserFilter(String[] extension, String description) {
			m_description = description;
			m_extension = new String[extension.length];
			for(int i=0; i< extension.length; i++)
			{
				m_extension[i] = "."+extension[i].toLowerCase();
			}
		}
		public String getDescription() {
			return m_description;
		}
		@Override
		public boolean accept(File f) {
			if (f == null)
				return false;
			if (f.isDirectory())
				return true;
			for(int i = 0; i<m_extension.length; i++)
			{
				if(f.getName().toLowerCase().endsWith(m_extension[i]))
					return true;
			}
			return false;
		}
	}
}
