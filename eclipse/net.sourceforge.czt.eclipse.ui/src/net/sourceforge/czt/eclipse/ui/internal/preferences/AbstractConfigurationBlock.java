/**
 * 
 */

package net.sourceforge.czt.eclipse.ui.internal.preferences;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import net.sourceforge.czt.eclipse.ui.internal.editors.PixelConverter;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.PreferencePage;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.events.ExpansionAdapter;
import org.eclipse.ui.forms.events.ExpansionEvent;
import org.eclipse.ui.forms.widgets.ExpandableComposite;

/**
 * Configures Z Editor typing preferences.
 * 
 * @since 3.1
 * 
 * @author Chengdong Xu
 */
public abstract class AbstractConfigurationBlock
    implements
      IPreferenceConfigurationBlock
{

  /**
   * Use as follows:
   * 
   * <pre>
   * SectionManager manager= new SectionManager(Dialect.Z);
   * Composite composite= manager.createSectionComposite(parent);
   * 
   * Composite xSection= manager.createSection("section X"));
   * xSection.setLayout(new FillLayout());
   * new Button(xSection, SWT.PUSH); // add controls to section..
   * 
   * [...]
   * 
   * return composite; // return main composite
   * </pre>
   */
  protected final class SectionManager
  {
    /** The preference setting for keeping no section open. */
    private static final String __NONE = "__none"; //$NON-NLS-1$

    private Set<ExpandableComposite> fSections = new HashSet<ExpandableComposite>();

    private boolean fIsBeingManaged = false;

    private ExpansionAdapter fListener = new ExpansionAdapter()
    {
      public void expansionStateChanged(ExpansionEvent e)
      {
        ExpandableComposite source = (ExpandableComposite) e.getSource();
        updateSectionStyle(source);
        if (fIsBeingManaged)
          return;
        if (e.getState()) {
          try {
            fIsBeingManaged = true;
            for (Iterator<ExpandableComposite> iter = fSections.iterator(); iter.hasNext();) {
              ExpandableComposite composite = iter.next();
              if (composite != source)
                composite.setExpanded(false);
            }
          } finally {
            fIsBeingManaged = false;
          }
          if (fLastOpenKey != null && fDialogSettingsStore != null)
            fDialogSettingsStore.setValue(fLastOpenKey, source.getText());
        }
        else {
          if (!fIsBeingManaged && fLastOpenKey != null
              && fDialogSettingsStore != null)
            fDialogSettingsStore.setValue(fLastOpenKey, __NONE);
        }
        ExpandableComposite exComp = getParentExpandableComposite(source);
        if (exComp != null)
          exComp.layout(true, true);
        ScrolledPageContent parentScrolledComposite = getParentScrolledComposite(source);
        if (parentScrolledComposite != null) {
          parentScrolledComposite.reflow(true);
        }
      }
    };

    private Composite fBody;

    private final String fLastOpenKey;

    private final IPreferenceStore fDialogSettingsStore;

    private ExpandableComposite fFirstChild = null;

    /**
     * Creates a new section manager.
     */
    public SectionManager()
    {
      this(null, null);
    }

    /**
     * Creates a new section manager.
     */
    public SectionManager(IPreferenceStore dialogSettingsStore,
        String lastOpenKey)
    {
      fDialogSettingsStore = dialogSettingsStore;
      fLastOpenKey = lastOpenKey;
    }

    private void manage(ExpandableComposite section)
    {
      if (section == null)
        throw new NullPointerException();
      if (fSections.add(section))
        section.addExpansionListener(fListener);
      makeScrollableCompositeAware(section);
    }

    /**
     * Creates a new composite that can contain a set of expandable
     * sections. A <code>ScrolledPageComposite</code> is created and a new
     * composite within that, to ensure that expanding the sections will
     * always have enough space, unless there already is a
     * <code>ScrolledComposite</code> along the parent chain of
     * <code>parent</code>, in which case a normal <code>Composite</code>
     * is created.
     * <p>
     * The receiver keeps a reference to the inner body composite, so that
     * new sections can be added via <code>createSection</code>.
     * </p>
     * 
     * @param parent the parent composite
     * @return the newly created composite
     */
    public Composite createSectionComposite(Composite parent)
    {
      //org.eclipse.jface.text.Assert.isTrue(fBody == null);
      org.eclipse.core.runtime.Assert.isTrue(fBody == null);
      boolean isNested = isNestedInScrolledComposite(parent);
      Composite composite;
      if (isNested) {
        composite = new Composite(parent, SWT.NONE);
        fBody = composite;
      }
      else {
        composite = new ScrolledPageContent(parent);
        fBody = ((ScrolledPageContent) composite).getBody();
      }

      fBody.setLayout(new GridLayout());

      return composite;
    }

    /**
     * Creates an expandable section within the parent created previously by
     * calling <code>createSectionComposite</code>. Controls can be added 
     * directly to the returned composite, which has no layout initially.
     * 
     * @param label the display name of the section
     * @return a composite within the expandable section
     */
    public Composite createSection(String label)
    {
    	org.eclipse.core.runtime.Assert.isNotNull(fBody);
      final ExpandableComposite excomposite = new ExpandableComposite(fBody,
          SWT.NONE, ExpandableComposite.TWISTIE
              | ExpandableComposite.CLIENT_INDENT | ExpandableComposite.COMPACT);
      if (fFirstChild == null)
        fFirstChild = excomposite;
      excomposite.setText(label);
      String last = null;
      if (fLastOpenKey != null && fDialogSettingsStore != null)
        last = fDialogSettingsStore.getString(fLastOpenKey);

      if (fFirstChild == excomposite && !__NONE.equals(last)
          || label.equals(last)) {
        excomposite.setExpanded(true);
        if (fFirstChild != excomposite)
          fFirstChild.setExpanded(false);
      }
      else {
        excomposite.setExpanded(false);
      }
      excomposite.setLayoutData(new GridData(GridData.FILL, GridData.BEGINNING,
          true, false));

      updateSectionStyle(excomposite);
      manage(excomposite);

      Composite contents = new Composite(excomposite, SWT.NONE);
      excomposite.setClient(contents);

      return contents;
    }
  }

  protected static final int INDENT = 20;

  private OverlayPreferenceStore fStore;

  private Map<Button, String> fCheckBoxes = new HashMap<Button, String>();

  private SelectionListener fCheckBoxListener = new SelectionListener()
  {
    public void widgetDefaultSelected(SelectionEvent e)
    {
    }

    public void widgetSelected(SelectionEvent e)
    {
      Button button = (Button) e.widget;
      fStore.setValue(fCheckBoxes.get(button), button.getSelection());
    }
  };
  
  private Map<Button, String[]> fRadioButtons = new HashMap<Button, String[]>();
  
  private SelectionListener fRadioButtonListener = new SelectionListener()
  {
    public void widgetDefaultSelected(SelectionEvent e)
    {
    }
    
    public void widgetSelected(SelectionEvent e)
    {
      Button button = (Button) e.widget;
      if (button.getSelection()) {
        String[] info = fRadioButtons.get(button);
        fStore.setValue(info[0], info[1]);
      }
    }
  };

  private Map<Text, String> fTextFields = new HashMap<Text, String>();

  private ModifyListener fTextFieldListener = new ModifyListener()
  {
    public void modifyText(ModifyEvent e)
    {
      Text text = (Text) e.widget;
      fStore.setValue(fTextFields.get(text), text.getText());
    }
  };

  private ArrayList<Text> fNumberFields = new ArrayList<Text>();

  private ModifyListener fNumberFieldListener = new ModifyListener()
  {
    public void modifyText(ModifyEvent e)
    {
      numberFieldChanged((Text) e.widget);
    }
  };

  /**
   * List of master/slave listeners when there's a dependency.
   * 
   * @see #createDependency(Button, Control)
   * @since 3.0
   */
  private ArrayList<SelectionListener> fMasterSlaveListeners = new ArrayList<SelectionListener>();

  private StatusInfo fStatus;

  private final PreferencePage fMainPage;

  /**
   * 
   */
  public AbstractConfigurationBlock(OverlayPreferenceStore store)
  {
	  org.eclipse.core.runtime.Assert.isNotNull(store);
    fStore = store;
    fMainPage = null;
  }

  public AbstractConfigurationBlock(OverlayPreferenceStore store,
      PreferencePage mainPreferencePage)
  {
	  org.eclipse.core.runtime.Assert.isNotNull(store);
	  org.eclipse.core.runtime.Assert.isNotNull(mainPreferencePage);
    fStore = store;
    fMainPage = mainPreferencePage;
  }

  protected final ScrolledPageContent getParentScrolledComposite(Control control)
  {
    Control parent = control.getParent();
    while (!(parent instanceof ScrolledPageContent) && parent != null) {
      parent = parent.getParent();
    }
    if (parent instanceof ScrolledPageContent) {
      return (ScrolledPageContent) parent;
    }
    return null;
  }

  private final ExpandableComposite getParentExpandableComposite(Control control)
  {
    Control parent = control.getParent();
    while (!(parent instanceof ExpandableComposite) && parent != null) {
      parent = parent.getParent();
    }
    if (parent instanceof ExpandableComposite) {
      return (ExpandableComposite) parent;
    }
    return null;
  }

  protected void updateSectionStyle(ExpandableComposite excomposite)
  {
    excomposite.setFont(JFaceResources.getFontRegistry().getBold(
        JFaceResources.DIALOG_FONT));
  }

  private void makeScrollableCompositeAware(Control control)
  {
    ScrolledPageContent parentScrolledComposite = getParentScrolledComposite(control);
    if (parentScrolledComposite != null) {
      parentScrolledComposite.adaptChild(control);
    }
  }

  private boolean isNestedInScrolledComposite(Composite parent)
  {
    return getParentScrolledComposite(parent) != null;
  }

  protected Button addCheckBox(Composite parent, String label, String key,
      int indentation)
  {
    Button checkBox = new Button(parent, SWT.CHECK);
    checkBox.setText(label);

    GridData gd = new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING);
    gd.horizontalIndent = indentation;
    gd.horizontalSpan = 2;
    checkBox.setLayoutData(gd);
    checkBox.addSelectionListener(fCheckBoxListener);
    makeScrollableCompositeAware(checkBox);

    fCheckBoxes.put(checkBox, key);

    return checkBox;
  }
  
  protected Button addRadioButton(Composite parent, String label, String key,
      String value, int indentation)
  {
    Button radioButton = new Button(parent, SWT.RADIO);
    radioButton.setText(label);

    GridData gd = new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING);
    gd.horizontalIndent = indentation;
    gd.horizontalSpan = 2;
    radioButton.setLayoutData(gd);
    radioButton.addSelectionListener(fRadioButtonListener);
    makeScrollableCompositeAware(radioButton);

    fRadioButtons.put(radioButton, new String[]{key, value});

    return radioButton;
  }

  /**
   * Returns an array of size 2:
   *  - first element is of type <code>Label</code>
   *  - second element is of type <code>Text</code>
   * Use <code>getLabelControl</code> and <code>getTextControl</code> to get the 2 controls.
   * 
   * @param composite     the parent composite
   * @param label         the text field's label
   * @param key           the preference key
   * @param textLimit     the text limit
   * @param indentation   the field's indentation
   * @param isNumber      <code>true</code> iff this text field is used to e4dit a number
   * @return the controls added
   */
  protected Control[] addLabelledTextField(Composite composite, String label,
      String key, int textLimit, int indentation, boolean isNumber)
  {

    PixelConverter pixelConverter = new PixelConverter(composite);

    Label labelControl = new Label(composite, SWT.NONE);
    labelControl.setText(label);
    GridData gd = new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING);
    gd.horizontalIndent = indentation;
    labelControl.setLayoutData(gd);

    Text textControl = new Text(composite, SWT.BORDER | SWT.SINGLE);
    gd = new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING);
    gd.widthHint = pixelConverter.convertWidthInCharsToPixels(textLimit + 1);
    textControl.setLayoutData(gd);
    textControl.setTextLimit(textLimit);
    fTextFields.put(textControl, key);
    if (isNumber) {
      fNumberFields.add(textControl);
      textControl.addModifyListener(fNumberFieldListener);
    }
    else {
      textControl.addModifyListener(fTextFieldListener);
    }

    return new Control[]{labelControl, textControl};
  }

  protected void createDependency(final Button master, final Control slave)
  {
    createDependency(master, new Control[]{slave});
  }

  protected void createDependency(final Button master, final Control[] slaves)
  {
	  org.eclipse.core.runtime.Assert.isTrue(slaves.length > 0);
    for (Control slave : slaves)
      indent(slave);
    SelectionListener listener = new SelectionListener()
    {
      public void widgetSelected(SelectionEvent e)
      {
        boolean state = master.getSelection();
        for (int i = 0; i < slaves.length; i++) {
          slaves[i].setEnabled(state);
        }
      }

      public void widgetDefaultSelected(SelectionEvent e)
      {
      }
    };
    master.addSelectionListener(listener);
    fMasterSlaveListeners.add(listener);
  }

  protected static void indent(Control control)
  {
    ((GridData) control.getLayoutData()).horizontalIndent += INDENT;
  }

  /*
   * @see net.sourceforge.czt.eclipse.ui.preferences.IPreferenceConfigurationBlock#createControl(org.eclipse.swt.widgets.Composite)
   *//*
   public Control createControl(Composite parent)
   {
   // TODO Auto-generated method stub
   return null;
   }
   */
  /*
   * @see net.sourceforge.czt.eclipse.ui.preferences.IPreferenceConfigurationBlock#initialize()
   */
  public void initialize()
  {
    initializeFields();
  }

  private void initializeFields()
  {

    Iterator<Button> iter = fCheckBoxes.keySet().iterator();
    while (iter.hasNext()) {
      Button b = iter.next();
      String key = fCheckBoxes.get(b);
      b.setSelection(fStore.getBoolean(key));
    }
    
    iter = fRadioButtons.keySet().iterator();
    while (iter.hasNext()) {
      Button b = iter.next();
      String[] info = fRadioButtons.get(b);
      b.setSelection(info[1].equals(fStore.getString(info[0])));
    }
    
    Iterator<Text> iter2 = fTextFields.keySet().iterator();
    while (iter2.hasNext()) {
      Text t = iter2.next();
      String key = fTextFields.get(t);
      t.setText(fStore.getString(key));
    }

    // Update slaves
    Iterator<SelectionListener> iter3 = fMasterSlaveListeners.iterator();
    while (iter3.hasNext()) {
      SelectionListener listener = iter3.next();
      listener.widgetSelected(null);
    }

    updateStatus(new StatusInfo());
  }

  /* (non-Javadoc)
   * @see net.sourceforge.czt.eclipse.ui.preferences.IPreferenceConfigurationBlock#performOk()
   */
  public void performOk()
  {
  }

  /* (non-Javadoc)
   * @see net.sourceforge.czt.eclipse.ui.preferences.IPreferenceConfigurationBlock#performDefaults()
   */
  public void performDefaults()
  {
    initializeFields();
  }

  IStatus getStatus()
  {
    if (fStatus == null)
      fStatus = new StatusInfo();
    return fStatus;
  }

  /*
   * @see net.sourceforge.czt.eclipse.ui.preferences.IPreferenceConfigurationBlock#dispose()
   */
  public void dispose()
  {
  }

  private void numberFieldChanged(Text textControl)
  {
    String number = textControl.getText();
    IStatus status = validatePositiveNumber(number);
    if (!status.matches(IStatus.ERROR))
      fStore.setValue((String) fTextFields.get(textControl), number);
    updateStatus(status);
  }

  private IStatus validatePositiveNumber(String number)
  {
    StatusInfo status = new StatusInfo();
    if (number.length() == 0) {
      status.setError(PreferencesMessages.ZEditorPreferencePage_empty_input);
    }
    else {
      try {
        int value = Integer.parseInt(number);
        if (value < 0)
          status.setError(Messages.format(
              PreferencesMessages.ZEditorPreferencePage_invalid_input, number));
      } catch (NumberFormatException e) {
        status.setError(Messages.format(
            PreferencesMessages.ZEditorPreferencePage_invalid_input, number));
      }
    }
    return status;
  }

  protected void updateStatus(IStatus status)
  {
    if (fMainPage == null)
      return;
    fMainPage.setValid(status.isOK());
    StatusUtil.applyToStatusLine(fMainPage, status);
  }

  protected final OverlayPreferenceStore getPreferenceStore()
  {
    return fStore;
  }

  protected Composite createSubsection(Composite parent,
      SectionManager manager, String label)
  {
    if (manager != null) {
      return manager.createSection(label);
    }
    else {
      Group group = new Group(parent, SWT.SHADOW_NONE);
      group.setText(label);
      GridData data = new GridData(SWT.FILL, SWT.CENTER, true, false);
      group.setLayoutData(data);
      return group;
    }
  }
}
