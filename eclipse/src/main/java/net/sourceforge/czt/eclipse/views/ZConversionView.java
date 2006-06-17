/**
 * 
 */
package net.sourceforge.czt.eclipse.views;

import net.sourceforge.czt.eclipse.CZTPlugin;
import net.sourceforge.czt.eclipse.editors.IZPartitions;
import net.sourceforge.czt.eclipse.editors.ZSourceViewer;
import net.sourceforge.czt.eclipse.preferences.PreferenceConstants;
import net.sourceforge.czt.eclipse.preferences.SimpleZSourceViewerConfiguration;
import net.sourceforge.czt.eclipse.preferences.ZSourcePreviewerUpdater;
import net.sourceforge.czt.eclipse.util.IColorManager;
import net.sourceforge.czt.eclipse.util.IZFileType;

import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.jface.text.Document;
import org.eclipse.jface.text.IDocument;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.editors.text.EditorsUI;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.ui.texteditor.ChainedPreferenceStore;

/**
 * @author Chengdong Xu
 */
public class ZConversionView extends ViewPart
{
  
  private final String CONVERSION_NOT_AVAILABLE = "A conversion is not performed";
  IColorManager fColorManager = CZTPlugin.getDefault().getCZTTextTools().getColorManager();
  private Label fInformationLabel;
  private ZSourceViewer fSourceViewer;
  private FormData fDataAreaFormData;
  private IDocument fDocument;
  
  /**
   * 
   */
  public ZConversionView()
  {
    super();
  }

  /**
   * @see org.eclipse.ui.part.WorkbenchPart#createPartControl(org.eclipse.swt.widgets.Composite)
   */
  @Override
  public void createPartControl(Composite parent)
  {
    IPreferenceStore generalTextStore = EditorsUI.getPreferenceStore();
    IPreferenceStore store = new ChainedPreferenceStore(new IPreferenceStore[]{
        CZTPlugin.getDefault().getPreferenceStore(), generalTextStore});
    
    FormData formData;
    parent.setLayout(new FormLayout());
    fInformationLabel = new Label(parent, SWT.LEFT);
    formData = new FormData();
    formData.top = new FormAttachment(0, 5);
    formData.left = new FormAttachment(0, 5);
    formData.right = new FormAttachment(100, -5);
    formData.bottom = new FormAttachment(0, 25);
    fInformationLabel.setLayoutData((formData));
    
    formData = new FormData();
    formData.top = new FormAttachment(fInformationLabel, -5);
    formData.left = new FormAttachment(0, 5);
    formData.right = new FormAttachment(100, -5);
    formData.bottom = new FormAttachment(100, -5);
    
    fSourceViewer = new ZSourceViewer(parent, null, null, false, SWT.V_SCROLL
        | SWT.H_SCROLL | SWT.BORDER, store);
    fSourceViewer.getControl().setLayoutData((formData));
    
    SimpleZSourceViewerConfiguration configuration = new SimpleZSourceViewerConfiguration(
        fColorManager, store, null, IZPartitions.Z_PARTITIONING, false);
    fSourceViewer.configure(configuration);
    Font font = JFaceResources.getFont(PreferenceConstants.EDITOR_TEXT_FONT);
    fSourceViewer.getTextWidget().setFont(font);
    new ZSourcePreviewerUpdater(fSourceViewer, configuration, store);
    fSourceViewer.setEditable(false);
    fDocument = new Document();
    
    CZTPlugin.getDefault().getCZTTextTools().setupJavaDocumentPartitioner(
        fDocument, IZPartitions.Z_PARTITIONING, IZFileType.FILETYPE_LATEX);
    fSourceViewer.setDocument(fDocument);
    
    fInformationLabel.setText(CONVERSION_NOT_AVAILABLE);
  }

  /**
   * @see org.eclipse.ui.part.WorkbenchPart#setFocus()
   */
  @Override
  public void setFocus()
  {
    fSourceViewer.getControl().setFocus();
  }
  
  public void setStatus(String fileName, String sourceMarkup, String targetMarkup) {
    if (fileName != null && fileName.trim() != null
        && sourceMarkup != null && sourceMarkup.trim() != null
        && targetMarkup != null && targetMarkup.trim() != null) {
      String information = "SOURCE:" + fileName + " -- " + "Original Markup:" + sourceMarkup +
              " -- " + "Target Markup:" + targetMarkup;
      fInformationLabel.setText(information);
    }
    else
      initStatus();
  }
  
  private void initStatus() {
    fInformationLabel.setText(this.CONVERSION_NOT_AVAILABLE);
  }
  
  public void setConversionData(String fileName, String sourceMarkup, String targetMarkup, String data) {
    fDocument.set(data);
  }
}
