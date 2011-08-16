/*
 * ZEditor.java
 * Copyright (C) 2006 Chengdong Xu
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */

package net.sourceforge.czt.eclipse.editors.zeditor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import net.sourceforge.czt.base.ast.Term;
import net.sourceforge.czt.eclipse.CZTPlugin;
import net.sourceforge.czt.eclipse.editors.CZTTextTools;
import net.sourceforge.czt.eclipse.editors.IZPartitions;
import net.sourceforge.czt.eclipse.editors.IZReconcilingListener;
import net.sourceforge.czt.eclipse.editors.OccurrencesFinderJob;
import net.sourceforge.czt.eclipse.editors.OccurrencesFinderJobCanceler;
import net.sourceforge.czt.eclipse.editors.ZCharacter;
import net.sourceforge.czt.eclipse.editors.ZPairMatcher;
import net.sourceforge.czt.eclipse.editors.ZSourceViewer;
import net.sourceforge.czt.eclipse.editors.ZSourceViewerConfiguration;
import net.sourceforge.czt.eclipse.editors.ZSpecDecorationSupport;
import net.sourceforge.czt.eclipse.editors.actions.CZTActionConstants;
import net.sourceforge.czt.eclipse.editors.actions.ContractSelectionAction;
import net.sourceforge.czt.eclipse.editors.actions.Convert2LatexAction;
import net.sourceforge.czt.eclipse.editors.actions.Convert2OldLatexAction;
import net.sourceforge.czt.eclipse.editors.actions.Convert2UnicodeAction;
import net.sourceforge.czt.eclipse.editors.actions.Convert2XMLAction;
import net.sourceforge.czt.eclipse.editors.actions.ExpandSelectionAction;
import net.sourceforge.czt.eclipse.editors.actions.GoToDeclarationAction;
import net.sourceforge.czt.eclipse.editors.actions.IZEditorActionDefinitionIds;
import net.sourceforge.czt.eclipse.editors.hover.SourceViewerInformationControl;
import net.sourceforge.czt.eclipse.editors.hover.UnicodeSourceViewerInformationControl;
import net.sourceforge.czt.eclipse.editors.latex.ZLatexPairMatcher;
import net.sourceforge.czt.eclipse.editors.parser.ParsedData;
import net.sourceforge.czt.eclipse.editors.parser.ZCompilerMessageParser;
import net.sourceforge.czt.eclipse.outline.CztTreeNode;
import net.sourceforge.czt.eclipse.outline.ZContentOutlinePage;
import net.sourceforge.czt.eclipse.preferences.PreferenceConstants;
import net.sourceforge.czt.eclipse.util.CztUI;
import net.sourceforge.czt.eclipse.util.IZAnnotationType;
import net.sourceforge.czt.eclipse.util.IZEncoding;
import net.sourceforge.czt.eclipse.util.IZFileType;
import net.sourceforge.czt.eclipse.util.IZMarker;
import net.sourceforge.czt.eclipse.util.Selector;
import net.sourceforge.czt.parser.util.CztError;
import net.sourceforge.czt.session.Markup;
import net.sourceforge.czt.z.ast.ZName;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.ListenerList;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IMenuManager;
// obsolete now: import org.eclipse.jface.internal.text.link.contentassist.HTMLTextPresenter;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.BadPartitioningException;
import org.eclipse.jface.text.DefaultInformationControl;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IDocumentExtension3;
import org.eclipse.jface.text.IDocumentExtension4;
import org.eclipse.jface.text.IInformationControl;
import org.eclipse.jface.text.IInformationControlCreator;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.ISynchronizable;
import org.eclipse.jface.text.ITypedRegion;
import org.eclipse.jface.text.Position;
import org.eclipse.jface.text.TextSelection;
import org.eclipse.jface.text.information.InformationPresenter;
import org.eclipse.jface.text.source.Annotation;
import org.eclipse.jface.text.source.IAnnotationModel;
import org.eclipse.jface.text.source.IAnnotationModelExtension;
import org.eclipse.jface.text.source.IOverviewRuler;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.jface.text.source.IVerticalRuler;
import org.eclipse.jface.text.source.projection.ProjectionAnnotation;
import org.eclipse.jface.text.source.projection.ProjectionAnnotationModel;
import org.eclipse.jface.text.source.projection.ProjectionSupport;
import org.eclipse.jface.text.source.projection.ProjectionViewer;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.jface.viewers.IPostSelectionProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.IPartListener2;
import org.eclipse.ui.IPartService;
import org.eclipse.ui.IWindowListener;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchPartReference;
import org.eclipse.ui.IWorkbenchPartSite;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.editors.text.EditorsUI;
import org.eclipse.ui.editors.text.TextEditor;
import org.eclipse.ui.texteditor.AbstractDecoratedTextEditorPreferenceConstants;
import org.eclipse.ui.texteditor.AnnotationPreference;
import org.eclipse.ui.texteditor.ChainedPreferenceStore;
import org.eclipse.ui.texteditor.IDocumentProvider;
import org.eclipse.ui.texteditor.IEditorStatusLine;
import org.eclipse.ui.texteditor.SourceViewerDecorationSupport;
import org.eclipse.ui.views.contentoutline.ContentOutline;
import org.eclipse.ui.views.contentoutline.IContentOutlinePage;

/**
 * @author Chengdong Xu
 */
public class ZEditor extends TextEditor implements IZReconcilingListener
{

  /**
   * Internal implementation class for a change listener.
   * @since 3.0
   */
  protected abstract class AbstractSelectionChangedListener
      implements
        ISelectionChangedListener
  {

    /**
     * Installs this selection changed listener with the given selection provider. If
     * the selection provider is a post selection provider, post selection changed
     * events are the preferred choice, otherwise normal selection changed events
     * are requested.
     *
     * @param selectionProvider
     */
    public void install(ISelectionProvider selectionProvider)
    {
      if (selectionProvider == null)
        return;

      if (selectionProvider instanceof IPostSelectionProvider) {
        IPostSelectionProvider provider = (IPostSelectionProvider) selectionProvider;
        provider.addPostSelectionChangedListener(this);
      }
      else {
        selectionProvider.addSelectionChangedListener(this);
      }
    }

    /**
     * Removes this selection changed listener from the given selection provider.
     *
     * @param selectionProvider the selection provider
     */
    public void uninstall(ISelectionProvider selectionProvider)
    {
      if (selectionProvider == null)
        return;

      if (selectionProvider instanceof IPostSelectionProvider) {
        IPostSelectionProvider provider = (IPostSelectionProvider) selectionProvider;
        provider.removePostSelectionChangedListener(this);
      }
      else {
        selectionProvider.removeSelectionChangedListener(this);
      }
    }
  }

  /**
   * Updates the Z outline page selection and this editor's range indicator.
   *
   * @since 3.0
   */
  private class EditorSelectionChangedListener
      extends
        AbstractSelectionChangedListener
  {

    /*
     * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
     */
    public void selectionChanged(SelectionChangedEvent event)
    {
      ZEditor.this.selectionChanged();
    }
  }

  /**
   * Updates the selection in the fEditor's widget with the selection of the outline page.
   */
  private class OutlineSelectionChangedListener
      extends
        AbstractSelectionChangedListener
  {
    public void selectionChanged(SelectionChangedEvent event)
    {
      doOutlineSelectionChanged(event);
    }
  }

  /**
   * Internal activation listener.
   * @since 3.0
   */
  private class ActivationListener implements IWindowListener
  {

    /*
     * @see org.eclipse.ui.IWindowListener#windowActivated(org.eclipse.ui.IWorkbenchWindow)
     * @since 3.1
     */
    public void windowActivated(IWorkbenchWindow window)
    {
      if (window == getEditorSite().getWorkbenchWindow()
          && fMarkOccurrenceAnnotations && isActivePart()) {
        fForcedMarkOccurrencesSelection = getSelectionProvider().getSelection();
        markOccurrenceAnnotations(((TextSelection) fForcedMarkOccurrencesSelection)
            .getOffset());
        //				SelectionListenerWithASTManager.getDefault().forceSelectionChange(ZEditor.this, (ITextSelection)fForcedMarkOccurrencesSelection);
      }
    }

    /*
     * @see org.eclipse.ui.IWindowListener#windowDeactivated(org.eclipse.ui.IWorkbenchWindow)
     * @since 3.1
     */
    public void windowDeactivated(IWorkbenchWindow window)
    {
      if (window == getEditorSite().getWorkbenchWindow()
          && fMarkOccurrenceAnnotations && isActivePart())
        removeOccurrenceAnnotations();
    }

    /*
     * @see org.eclipse.ui.IWindowListener#windowClosed(org.eclipse.ui.IWorkbenchWindow)
     * @since 3.1
     */
    public void windowClosed(IWorkbenchWindow window)
    {
    }

    /*
     * @see org.eclipse.ui.IWindowListener#windowOpened(org.eclipse.ui.IWorkbenchWindow)
     * @since 3.1
     */
    public void windowOpened(IWorkbenchWindow window)
    {
    }
  }

  /**
   * Runner that will toggle folding either instantly (if the editor is
   * visible) or the next time it becomes visible. If a runner is started when
   * there is already one registered, the registered one is canceled as
   * toggling folding twice is a no-op.
   * <p>
   * The access to the fFoldingRunner field is not thread-safe, it is assumed
   * that <code>runWhenNextVisible</code> is only called from the UI thread.
   * </p>
   *
   * @since 3.1
   */
  private final class ToggleFoldingRunner implements IPartListener2
  {
    /**
     * The workbench page we registered the part listener with, or
     * <code>null</code>.
     */
    private IWorkbenchPage fPage;

    /**
     * Does the actual toggling of projection.
     */
    private void toggleFolding()
    {
      ISourceViewer sourceViewer = getSourceViewer();
      if (sourceViewer instanceof ProjectionViewer) {
        ProjectionViewer pv = (ProjectionViewer) sourceViewer;
        if (pv.isProjectionMode() != isFoldingEnabled()) {
          if (pv.canDoOperation(ProjectionViewer.TOGGLE))
            pv.doOperation(ProjectionViewer.TOGGLE);
        }
      }
    }

    /**
     * Makes sure that the editor's folding state is correct the next time
     * it becomes visible. If it already is visible, it toggles the folding
     * state. If not, it either registers a part listener to toggle folding
     * when the editor becomes visible, or cancels an already registered
     * runner.
     */
    public void runWhenNextVisible()
    {
      // if there is one already: toggling twice is the identity
      if (fFoldingRunner != null) {
        fFoldingRunner.cancel();
        return;
      }
      IWorkbenchPartSite site = getSite();
      if (site != null) {
        IWorkbenchPage page = site.getPage();
        if (!page.isPartVisible(ZEditor.this)) {
          // if we're not visible - defer until visible
          fPage = page;
          fFoldingRunner = this;
          page.addPartListener(this);
          return;
        }
      }
      // we're visible - run now
      toggleFolding();
    }

    /**
     * Remove the listener and clear the field.
     */
    private void cancel()
    {
      if (fPage != null) {
        fPage.removePartListener(this);
        fPage = null;
      }
      if (fFoldingRunner == this)
        fFoldingRunner = null;
    }

    /*
     * @see org.eclipse.ui.IPartListener2#partVisible(org.eclipse.ui.IWorkbenchPartReference)
     */
    public void partVisible(IWorkbenchPartReference partRef)
    {
      if (ZEditor.this.equals(partRef.getPart(false))) {
        cancel();
        toggleFolding();
      }
    }

    /*
     * @see org.eclipse.ui.IPartListener2#partClosed(org.eclipse.ui.IWorkbenchPartReference)
     */
    public void partClosed(IWorkbenchPartReference partRef)
    {
      if (ZEditor.this.equals(partRef.getPart(false))) {
        cancel();
      }
    }

    public void partActivated(IWorkbenchPartReference partRef)
    {
    }

    public void partBroughtToTop(IWorkbenchPartReference partRef)
    {
    }

    public void partDeactivated(IWorkbenchPartReference partRef)
    {
    }

    public void partOpened(IWorkbenchPartReference partRef)
    {
    }

    public void partHidden(IWorkbenchPartReference partRef)
    {
    }

    public void partInputChanged(IWorkbenchPartReference partRef)
    {
    }
  }

  /**
   * Mutex for the reconciler. See https://bugs.eclipse.org/bugs/show_bug.cgi?id=63898
   * for a description of the problem.
   * <p>
   * TODO remove once the underlying problem (https://bugs.eclipse.org/bugs/show_bug.cgi?id=66176) is solved.
   * </p>
   */
  //	private final Object fReconcilerLock= new Object();
  private String fFileType = null;

  private Markup fMarkup = Markup.LATEX;

  private String fEncoding = null;

  /** The content outline page */
  private ZContentOutlinePage fOutlinePage;

  /** The outline page context menu id */
  private String fOutlinerContextMenuId;

  /** The fEditor selection changed listener. */
  private EditorSelectionChangedListener fEditorSelectionChangedListener;

  /** The selection changed listener */
  protected AbstractSelectionChangedListener fOutlineSelectionChangedListener = new OutlineSelectionChangedListener();

  /** The internal shell activation listener for updating occurrences. */
  private ActivationListener fActivationListener = new ActivationListener();

  /** Holds the current projection annotations. */
  private Annotation[] fProjectionAnnotations = null;

  /** Holds the folded projection annotations. */
  private Map<Annotation, Position> fFoldedProjectionAnnotations = new HashMap<Annotation, Position>();

  /** Holds the unfolded projection annotations. */
  private Map<Annotation, Position> fUnfoldedProjectionAnnotations = new HashMap<Annotation, Position>();

  /** Holds the current schema box annotations */
  private Annotation[] fSchemaBoxAnnotations = null;

  /** Holds the current occurrence annotations. */
  private Annotation[] fOccurrenceAnnotations = null;

  /** The term highlight annotation */
  private Annotation fTermHighlightAnnotation = null;

  /**
   * The document modification stamp at the time when the last
   * term highlight marking took place.
   */
  private long fMarkTermHighlightModificationStamp = IDocumentExtension4.UNKNOWN_MODIFICATION_STAMP;

  /**
   * The selection used when forcing occurrence marking
   * through code.
   */
  private ISelection fForcedMarkOccurrencesSelection;

  /**
   * The region of the word under the caret used to when
   * computing the current occurrence markings.
   */
  private IRegion fMarkOccurrenceTargetRegion;

  /**
   * Tells whether all occurrences of the element at the
   * current caret location are automatically marked in
   * this editor.
   */
  private boolean fMarkOccurrenceAnnotations;

  /**
   * The document modification stamp at the time when the last
   * occurrence marking took place.
   */
  private long fMarkOccurrenceModificationStamp = IDocumentExtension4.UNKNOWN_MODIFICATION_STAMP;

  private ProjectionAnnotationModel fProjectionAnnotationModel;

  /** The occurrences finder job */
  private OccurrencesFinderJob fOccurrencesFinderJob;

  /** The occurrences finder job canceler */
  private OccurrencesFinderJobCanceler fOccurrencesFinderJobCanceler;

  /** The folding runner. */
  private ToggleFoldingRunner fFoldingRunner;

  /** The projection support */
  private ProjectionSupport fProjectionSupport;

  /** The parsed tree */
  private ParsedData fParsedData;

  /** The term selector */
  private Selector fTermHighlightSelector;

  /** The term currently highlighted */
  private Term fHighlightedTerm = null;

  /** The styled text */
  private StyledText text;

  /** Preference key for matching brackets */
  protected final static String MATCHING_BRACKETS = PreferenceConstants.EDITOR_MATCHING_BRACKETS;

  /** Preference key for matching brackets color */
  protected final static String MATCHING_BRACKETS_COLOR = PreferenceConstants.EDITOR_MATCHING_BRACKETS_COLOR;

  /** The fEditor's bracket matcher */
  protected ZPairMatcher fBracketMatcher;

  /** Reconciling listeners. */
  private ListenerList fReconcilingListeners = new ListenerList(
      ListenerList.IDENTITY);

  /**
   * Mutex for the reconciler. See https://bugs.eclipse.org/bugs/show_bug.cgi?id=63898
   * for a description of the problem.
   * <p>
   * TODO remove once the underlying problem (https://bugs.eclipse.org/bugs/show_bug.cgi?id=66176) is solved.
   * </p>
   */
  private final Object fReconcilerLock = new Object();

  /**
   * Helper for managing the decoration support of this fEditor's viewer.
   *
   */
  private ZSpecDecorationSupport fZSpecDecorationSupport;

  /** The information presenter. */
  private InformationPresenter fInformationPresenter;
  
  private boolean fParsingEnabled;

  private boolean fReportProblemsWhileEditing;

  public ZEditor()
  {
    super();
    setEditorContextMenuId("#CZTEditorContext"); //$NON-NLS-1$
    setRulerContextMenuId("#CZTRulerContext"); //$NON-NLS-1$
    setOutlinerContextMenuId("#CZTOutlinerContext"); //$NON-NLS-1$
  }

  /**
   * @see org.eclipse.ui.texteditor.AbstractTextEditor#createActions()
   */
  protected void createActions()
  {
    super.createActions();

    IAction action = new GoToDeclarationAction(ZEditorMessages
        .getBundleForActionKeys(), "GotoDeclaration.", this); //$NON-NLS-1$
    action.setActionDefinitionId(IZEditorActionDefinitionIds.GO_TO_DECLARATION);
    setAction(CZTActionConstants.GO_TO_DECLARATION, action);

    action = new ExpandSelectionAction(
        ZEditorMessages.getBundleForActionKeys(), "HighlightEnclosing.", this);;
    action
        .setActionDefinitionId(IZEditorActionDefinitionIds.HIGHLIGHT_ENCLOSING_ELEMENT);
    setAction(CZTActionConstants.HIGHLIGHT_ENCLOSING, action);

    action = new ContractSelectionAction(ZEditorMessages
        .getBundleForActionKeys(), "RestoreLastHighlight.", this);
    action
        .setActionDefinitionId(IZEditorActionDefinitionIds.RESTORE_LAST_HIGHLIGHT);
    setAction(CZTActionConstants.RESTORE_LAST, action);

    action = new Convert2LatexAction(ZEditorMessages.getBundleForActionKeys(),
        "Convert2LaTeX.", this);
    action.setActionDefinitionId(IZEditorActionDefinitionIds.CONVERT_TO_LATEX);
    setAction(CZTActionConstants.CONVERT_TO_LATEX, action);

    action = new Convert2OldLatexAction(ZEditorMessages
        .getBundleForActionKeys(), "Convert2OldLaTeX.", this);
    action
        .setActionDefinitionId(IZEditorActionDefinitionIds.CONVERT_TO_OLD_LATEX);
    setAction(CZTActionConstants.CONVERT_TO_OLD_LATEX, action);

    action = new Convert2UnicodeAction(
        ZEditorMessages.getBundleForActionKeys(), "Convert2Unicode.", this);
    action
        .setActionDefinitionId(IZEditorActionDefinitionIds.CONVERT_TO_UNICODE);
    setAction(CZTActionConstants.CONVERT_TO_UNICODE, action);

    action = new Convert2XMLAction(ZEditorMessages.getBundleForActionKeys(),
        "Convert2XML.", this);
    action.setActionDefinitionId(IZEditorActionDefinitionIds.CONVERT_TO_XML);
    setAction(CZTActionConstants.CONVERT_TO_XML, action);

    //    markAsStateDependentAction("HighlightEnclosing", true); //$NON-NLS-1$
    //    markAsSelectionDependentAction("HighlightEnclosing", true); //$NON-NLS-1$
    //    PlatformUI.getWorkbench().getHelpSystem().setHelp(action, IZHelpContextIds.HIGHLIGHT_ENCLOSING_ACTION);
  }

  /**
   * @see org.eclipse.ui.editors.text.TextEditor#initializeEditor()
   */
  protected void initializeEditor()
  {
    super.initializeEditor();
    //    System.out.println("ZEditor.initializeEditor starts");
    IPreferenceStore store = createCombinedPreferenceStore(null);
    setPreferenceStore(store);
    CZTTextTools textTools = CZTPlugin.getDefault().getCZTTextTools();
    setSourceViewerConfiguration(new ZSourceViewerConfiguration(textTools
        .getColorManager(), store, this, IZPartitions.Z_PARTITIONING));
    fParsingEnabled = store.getBoolean(PreferenceConstants.EDITOR_PARSING_ENABLED);
    fMarkOccurrenceAnnotations = store
        .getBoolean(PreferenceConstants.EDITOR_MARK_OCCURRENCES);
    fReportProblemsWhileEditing = store.getString(
        PreferenceConstants.EDITOR_REPORT_PROBLEMS).equals(
        PreferenceConstants.EDITOR_REPORT_PROBLEMS_WHILE_EDITING);
  }

  /**
   * @see org.eclipse.ui.texteditor.AbstractDecoratedTextEditor#initializeKeyBindingScopes()
   */
  protected void initializeKeyBindingScopes()
  {
    setKeyBindingScopes(new String[]{"net.sourceforge.czt.eclipse.ZEditorScope"}); //$NON-NLS-1$
  }

  /**
   * @see org.eclipse.ui.texteditor.AbstractDecoratedTextEditor#createPartControl(org.eclipse.swt.widgets.Composite)
   */
  public void createPartControl(Composite parent)
  {
    super.createPartControl(parent);

    if (fZSpecDecorationSupport != null)
      fZSpecDecorationSupport.install(getPreferenceStore());

    ProjectionViewer projectionViewer = (ProjectionViewer) getSourceViewer();;
    fProjectionSupport = new ProjectionSupport(projectionViewer,
        getAnnotationAccess(), getSharedColors());
    fProjectionSupport
        .addSummarizableAnnotationType("org.eclipse.ui.workbench.texteditor.error"); //$NON-NLS-1$
    fProjectionSupport
        .addSummarizableAnnotationType("org.eclipse.ui.workbench.texteditor.warning"); //$NON-NLS-1$
    fProjectionSupport.setHoverControlCreator(new IInformationControlCreator()
    {
      public IInformationControl createInformationControl(Shell shell)
      {
        if (IZFileType.FILETYPE_UTF8.equalsIgnoreCase(getFileType())
            || IZFileType.FILETYPE_UTF16.equalsIgnoreCase(getFileType())) {
          return new UnicodeSourceViewerInformationControl(shell, SWT.TOOL
              | SWT.NO_TRIM | getOrientation(), SWT.NONE);
        }
        else
          return new SourceViewerInformationControl(shell, SWT.TOOL
              | SWT.NO_TRIM | getOrientation(), SWT.NONE);
      }
    });
    fProjectionSupport.install();

    //turn projection mode on
    projectionViewer.doOperation(ProjectionViewer.TOGGLE);

    fProjectionAnnotationModel = projectionViewer
        .getProjectionAnnotationModel();

    text = getSourceViewer().getTextWidget();
    if (IZFileType.FILETYPE_UTF8.equalsIgnoreCase(getFileType())
        || IZFileType.FILETYPE_UTF16.equalsIgnoreCase(getFileType())) {
      FontData viewFontData = new FontData();
      viewFontData.setName("CZT");
      //        viewFontData.setHeight(10);
      //        viewFontData.setStyle(SWT.BOLD);
      Font cztUnicodeFont = new Font(Display.getDefault(), viewFontData);
      text.setFont(cztUnicodeFont);
    }

    IInformationControlCreator informationControlCreator = new IInformationControlCreator()
    {
      public IInformationControl createInformationControl(Shell shell)
      {
        boolean cutDown = false;
        int style = cutDown ? SWT.NONE : (SWT.V_SCROLL | SWT.H_SCROLL);
        return new DefaultInformationControl(shell);
        // TODO: find an IInformationProvider that show HTML, so we can do this:
        //return new DefaultInformationControl(shell, SWT.RESIZE | SWT.TOOL,
        //    style, new HTMLTextPresenter(cutDown));
      }
    };

    fInformationPresenter = new InformationPresenter(informationControlCreator);
    fInformationPresenter.setSizeConstraints(60, 10, true, true);
    fInformationPresenter.install(getSourceViewer());
    fInformationPresenter.setDocumentPartitioning(IZPartitions.Z_PARTITIONING);

    fEditorSelectionChangedListener = new EditorSelectionChangedListener();
    fEditorSelectionChangedListener.install(getSelectionProvider());

    if (fMarkOccurrenceAnnotations)
      installOccurrencesFinder(true);

    //		if (isSemanticHighlightingEnabled())
    //			installSemanticHighlighting();

    PlatformUI.getWorkbench().addWindowListener(fActivationListener);
  }

  protected void configureSourceViewerDecorationSupport(
      SourceViewerDecorationSupport support)
  {
    //    System.out.println("ZEditor.configureSourceViewerDecorationSupport starts");
    if (IZFileType.FILETYPE_LATEX.equalsIgnoreCase(getFileType())) {
      support.setCharacterPairMatcher(new ZLatexPairMatcher(
          ZCharacter.BRACKETS_LATEX));
    }
    else if (IZFileType.FILETYPE_UTF8.equalsIgnoreCase(getFileType())
        || IZFileType.FILETYPE_UTF16.equalsIgnoreCase(getFileType()))
      support.setCharacterPairMatcher(new ZPairMatcher(
          ZCharacter.BRACKETS_UNICODE));
    support.setMatchingCharacterPainterPreferenceKeys(MATCHING_BRACKETS,
        MATCHING_BRACKETS_COLOR);
    super.configureSourceViewerDecorationSupport(support);
    //    System.out
    //        .println("ZEditor.configureSourceViewerDecorationSupport finishes");
  }

  /**
   * Configures the decoration support for this Z Editor's source viewer. Subclasses may override this
   * method, but should call their superclass' implementation at some point.
   *
   * @param support the decoration support to configure
   */
  protected void configureZSpecDecorationSupport(ZSpecDecorationSupport support)
  {
    AnnotationPreference schemaboxInfo = new AnnotationPreference();
    schemaboxInfo.setAnnotationType(IZAnnotationType.SCHEMABOX);
    schemaboxInfo
        .setColorPreferenceKey(PreferenceConstants.EDITOR_ANNOTATION_SCHEMABOX_LINE_COLOR);
    schemaboxInfo
        .setTextPreferenceKey(PreferenceConstants.EDITOR_ANNOTATION_SCHEMABOX_ENABLE);
    schemaboxInfo
        .setTextStylePreferenceKey(PreferenceConstants.EDITOR_ANNOTATION_SCHEMABOX_STYLE);
    schemaboxInfo.setPresentationLayer(0);
    support.setAnnotationPreference(schemaboxInfo);
  }

  /**
   * @inheritDoc
   * @see org.eclipse.ui.texteditor.AbstractTextEditor#createSourceViewer(org.eclipse.swt.widgets.Composite, org.eclipse.jface.text.source.IVerticalRuler, int)
   */
  protected final ISourceViewer createSourceViewer(Composite parent,
      IVerticalRuler verticalRuler, int styles)
  {
    IPreferenceStore store = getPreferenceStore();
    ISourceViewer viewer = createZSourceViewer(parent, verticalRuler,
        getOverviewRuler(), isOverviewRulerVisible(), styles, store);

    //        JavaUIHelp.setHelp(this, viewer.getTextWidget(), IJavaHelpContextIds.JAVA_EDITOR);

    ZSourceViewer zSourceViewer = null;
    if (viewer instanceof ZSourceViewer)
      zSourceViewer = (ZSourceViewer) viewer;

    // ensure source viewer decoration support has been created and configured
    getSourceViewerDecorationSupport(viewer);
    //  ensure source viewer decoration support has been created and configured
    getZSpecDecorationSupport(viewer);
    //    System.out.println("ZEditor.createSourceViewer finishes");
    return viewer;
  }

  public final ISourceViewer getViewer()
  {
    return getSourceViewer();
  }

  /*
   * @see AbstractTextEditor#createSourceViewer(Composite, IVerticalRuler, int)
   */
  protected ISourceViewer createZSourceViewer(Composite parent,
      IVerticalRuler verticalRuler, IOverviewRuler overviewRuler,
      boolean isOverviewRulerVisible, int styles, IPreferenceStore store)
  {
    return new ZSourceViewer(parent, verticalRuler, getOverviewRuler(),
        isOverviewRulerVisible(), styles, store);
  }

  protected ZSpecDecorationSupport getZSpecDecorationSupport(
      ISourceViewer viewer)
  {
    if (fZSpecDecorationSupport == null) {
      fZSpecDecorationSupport = new ZSpecDecorationSupport(viewer,
          getOverviewRuler(), getAnnotationAccess(), getSharedColors());
      configureZSpecDecorationSupport(fZSpecDecorationSupport);
    }
    return fZSpecDecorationSupport;
  }

  boolean isFoldingEnabled()
  {
    return CZTPlugin.getDefault().getPreferenceStore().getBoolean(
        PreferenceConstants.EDITOR_FOLDING_ENABLED);
  }

  /*
   * @see org.eclipse.ui.part.WorkbenchPart#getOrientation()
   * @since 3.1
   */
  public int getOrientation()
  {
    return SWT.LEFT_TO_RIGHT; //Z editors are always left to right by default
  }

  /**
   * Method declared on AbstractTextEditor
   */
  protected void editorContextMenuAboutToShow(IMenuManager menu)
  {
    super.editorContextMenuAboutToShow(menu);
    fillContextMenu(menu);
  }

  public void fillContextMenu(IMenuManager menuMgr)
  {

  }

  /**
   * Sets the outliner's context menu ID.
   *
   * @param menuId the menu ID
   */
  protected void setOutlinerContextMenuId(String menuId)
  {
    fOutlinerContextMenuId = menuId;
  }

  /**
   * Creates the outline page used with this fEditor.
   *
   * @return the created Java outline page
   */
  protected ZContentOutlinePage createOutlinePage()
  {
    ZContentOutlinePage page = new ZContentOutlinePage(fOutlinerContextMenuId,
        this);
    fOutlineSelectionChangedListener.install(page);
    setOutlinePageInput(page, this.fParsedData);
    return page;
  }

  /**
   * Informs the fEditor that its outliner has been closed.
   */
  public void outlinePageClosed()
  {
    if (fOutlinePage != null) {
      fOutlineSelectionChangedListener.uninstall(fOutlinePage);
      fOutlinePage = null;
      resetHighlightRange();
    }
  }

  /**
   * Synchronizes the outliner selection with the given element
   * position in the fEditor.
   *
   * @param element the java element to select
   */
  protected void synchronizeOutlinePage(int offset)
  {
    synchronizeOutlinePage(offset, true);
  }

  /**
   * Synchronizes the outliner selection with the given element
   * position in the fEditor.
   *
   * @param element the java element to select
   * @param checkIfOutlinePageActive <code>true</code> if check for active outline page needs to be done
   */
  protected void synchronizeOutlinePage(int offset,
      boolean checkIfOutlinePageActive)
  {
    if (fOutlinePage != null && offset > -1
        && !(checkIfOutlinePageActive && isZOutlinePageActive())) {
      fOutlineSelectionChangedListener.uninstall(fOutlinePage);
      fOutlinePage.select(offset);
      fOutlineSelectionChangedListener.install(fOutlinePage);
    }
  }

  /**
   * Synchronizes the outliner selection with the actual cursor
   * position in the fEditor.
   */
  public void synchronizeOutlinePageSelection()
  {
    synchronizeOutlinePage(getCursorOffset());
  }

  private void setOutlinePageInput(ZContentOutlinePage page, ParsedData data)
  {
    page.setInput(data);
  }

  protected boolean isActivePart()
  {
    IWorkbenchPart part = getActivePart();
    return part != null && part.equals(this);
  }

  private boolean isZOutlinePageActive()
  {
    IWorkbenchPart part = getActivePart();
    return part instanceof ContentOutline
        && ((ContentOutline) part).getCurrentPage() == fOutlinePage;
  }

  private IWorkbenchPart getActivePart()
  {
    IWorkbenchWindow window = getSite().getWorkbenchWindow();
    IPartService service = window.getPartService();
    IWorkbenchPart part = service.getActivePart();
    return part;
  }

  private int getCursorOffset()
  {
    String curPos = getCursorPosition();
    int colonPos = curPos.indexOf(":");
    // the line and column numbers are 1-based, so subtracted them by 1
    int line = Integer.parseInt(curPos.substring(0, colonPos - 1).trim()) - 1;
    int column = Integer.parseInt(curPos.substring(colonPos + 1).trim()) - 1;
    IDocument document = getDocumentProvider().getDocument(getEditorInput());
    int offset = -1;
    try {
      offset = document.getLineOffset(line) + column;
    } catch (BadLocationException ble) {
      offset = -1;
    }
    return offset;
  }

  public void updateFoldingStructure(Map<Position, String> positions)
  {
    Annotation[] oldAnnotations = fFoldedProjectionAnnotations.keySet()
        .toArray(new Annotation[fFoldedProjectionAnnotations.size()]);

    fFoldedProjectionAnnotations.clear();
    fUnfoldedProjectionAnnotations.clear();

    Set<Position> keySet = positions.keySet();
    String type;
    for (Position p : keySet) {
      ProjectionAnnotation annotation = new ProjectionAnnotation();
      type = positions.get(p);
      annotation.setText(positions.get(p));
      if (isFolded(type))
        fFoldedProjectionAnnotations.put(annotation, p);
      else
        fUnfoldedProjectionAnnotations.put(annotation, p);
    }

    if (isFoldingEnabled())
      fProjectionAnnotationModel.modifyAnnotations(oldAnnotations,
          fFoldedProjectionAnnotations, null);
  }

  // check whether it is folding type property
  private boolean isFoldingProperty(String property)
  {
    return PreferenceConstants.EDITOR_FOLDING_NARRATIVE.equals(property)
        || PreferenceConstants.EDITOR_FOLDING_ZCHAR.equals(property)
        || PreferenceConstants.EDITOR_FOLDING_ZED.equals(property)
        || PreferenceConstants.EDITOR_FOLDING_ZSECTION.equals(property)
        || PreferenceConstants.EDITOR_FOLDING_AX.equals(property)
        || PreferenceConstants.EDITOR_FOLDING_SCH.equals(property)
        || PreferenceConstants.EDITOR_FOLDING_GENAX.equals(property)
        || PreferenceConstants.EDITOR_FOLDING_GENSCH.equals(property)
        || PreferenceConstants.EDITOR_FOLDING_THEOREM.equals(property)
        || PreferenceConstants.EDITOR_FOLDING_PROOFSCRIPT.equals(property);
  }

  private boolean isFolded(String type)
  {
    if (IDocument.DEFAULT_CONTENT_TYPE.equals(type))
      return getPreferenceStore().getBoolean(
          PreferenceConstants.EDITOR_FOLDING_NARRATIVE);

    if (IZPartitions.Z_PARAGRAPH_LATEX_ZED.equals(type))
      return getPreferenceStore().getBoolean(
          PreferenceConstants.EDITOR_FOLDING_ZED);

    if (IZPartitions.Z_PARAGRAPH_LATEX_ZCHAR.equals(type))
      return getPreferenceStore().getBoolean(
          PreferenceConstants.EDITOR_FOLDING_ZCHAR);

    if ((IZPartitions.Z_PARAGRAPH_LATEX_ZSECTION.equals(type) || IZPartitions.Z_PARAGRAPH_UNICODE_ZSECTION
        .equals(type)))
      return getPreferenceStore().getBoolean(
          PreferenceConstants.EDITOR_FOLDING_ZSECTION);

    if ((IZPartitions.Z_PARAGRAPH_LATEX_AXDEF.equals(type) || IZPartitions.Z_PARAGRAPH_UNICODE_AXDEF
        .equals(type)))
      return getPreferenceStore().getBoolean(
          PreferenceConstants.EDITOR_FOLDING_AX);

    if ((IZPartitions.Z_PARAGRAPH_LATEX_SCHEMA.equals(type) || IZPartitions.Z_PARAGRAPH_UNICODE_SCHEMA
        .equals(type)))
      return getPreferenceStore().getBoolean(
          PreferenceConstants.EDITOR_FOLDING_SCH);

    if ((IZPartitions.Z_PARAGRAPH_LATEX_GENAX.equals(type) || IZPartitions.Z_PARAGRAPH_UNICODE_GENAX
        .equals(type)))
      return getPreferenceStore().getBoolean(
          PreferenceConstants.EDITOR_FOLDING_GENAX);

    if ((IZPartitions.Z_PARAGRAPH_LATEX_SCHEMA.equals(type) || IZPartitions.Z_PARAGRAPH_UNICODE_GENSCH
        .equals(type)))
      return getPreferenceStore().getBoolean(
          PreferenceConstants.EDITOR_FOLDING_GENSCH);

    if (IZPartitions.Z_PARAGRAPH_LATEX_THEOREM.equals(type))
      return getPreferenceStore().getBoolean(
          PreferenceConstants.EDITOR_FOLDING_THEOREM);
    
    if (IZPartitions.Z_PARAGRAPH_LATEX_PROOFSCRIPT.equals(type) || IZPartitions.Z_PARAGRAPH_UNICODE_PROOFSCRIPT
        .equals(type))
      return getPreferenceStore().getBoolean(
          PreferenceConstants.EDITOR_FOLDING_PROOFSCRIPT);

    return false;
  }

  private String getPropertyOfType(String type)
  {
    if (IDocument.DEFAULT_CONTENT_TYPE.equals(type))
      return PreferenceConstants.EDITOR_FOLDING_NARRATIVE;

    if (IZPartitions.Z_PARAGRAPH_LATEX_ZED.equals(type))
      return PreferenceConstants.EDITOR_FOLDING_ZED;

    if (IZPartitions.Z_PARAGRAPH_LATEX_ZCHAR.equals(type))
      return PreferenceConstants.EDITOR_FOLDING_ZCHAR;

    if ((IZPartitions.Z_PARAGRAPH_LATEX_ZSECTION.equals(type) || IZPartitions.Z_PARAGRAPH_UNICODE_ZSECTION
        .equals(type)))
      return PreferenceConstants.EDITOR_FOLDING_ZSECTION;

    if ((IZPartitions.Z_PARAGRAPH_LATEX_AXDEF.equals(type) || IZPartitions.Z_PARAGRAPH_UNICODE_AXDEF
        .equals(type)))
      return PreferenceConstants.EDITOR_FOLDING_AX;

    if ((IZPartitions.Z_PARAGRAPH_LATEX_SCHEMA.equals(type) || IZPartitions.Z_PARAGRAPH_UNICODE_SCHEMA
        .equals(type)))
      return PreferenceConstants.EDITOR_FOLDING_SCH;

    if ((IZPartitions.Z_PARAGRAPH_LATEX_GENAX.equals(type) || IZPartitions.Z_PARAGRAPH_UNICODE_GENAX
        .equals(type)))
      return PreferenceConstants.EDITOR_FOLDING_GENAX;

    if ((IZPartitions.Z_PARAGRAPH_LATEX_SCHEMA.equals(type) || IZPartitions.Z_PARAGRAPH_UNICODE_GENSCH
        .equals(type)))
      return PreferenceConstants.EDITOR_FOLDING_GENSCH;

    if (IZPartitions.Z_PARAGRAPH_LATEX_THEOREM.equals(type))
      return PreferenceConstants.EDITOR_FOLDING_THEOREM;
    
    if (IZPartitions.Z_PARAGRAPH_LATEX_PROOFSCRIPT.equals(type) || IZPartitions.Z_PARAGRAPH_UNICODE_PROOFSCRIPT
        .equals(type))
      return PreferenceConstants.EDITOR_FOLDING_PROOFSCRIPT;

    return null;
  }

  // Response to property changes
  private void updateFoldingState()
  {
    if (isFoldingEnabled())
      fProjectionAnnotationModel.modifyAnnotations(null,
          fFoldedProjectionAnnotations, null);
    else
      fProjectionAnnotationModel.modifyAnnotations(fFoldedProjectionAnnotations
          .keySet()
          .toArray(new Annotation[fFoldedProjectionAnnotations.size()]), null,
          null);
  }

  //Response to property changes
  private void updateFoldingType(String property, boolean newState)
  {
    if (fProjectionAnnotationModel == null)
      return;

    if (newState) {
      HashMap<Annotation, Position> additions = new HashMap<Annotation, Position>();
      Set<Annotation> unfolded = fUnfoldedProjectionAnnotations.keySet();
      for (Annotation ann : unfolded) {
        if (property.equals(getPropertyOfType(ann.getText()))) {
          additions.put(ann, fUnfoldedProjectionAnnotations.get(ann));
          fFoldedProjectionAnnotations.put(ann, fUnfoldedProjectionAnnotations
              .get(ann));
        }
      }

      for (Annotation ann : additions.keySet())
        fUnfoldedProjectionAnnotations.remove(ann);

      if (isFoldingEnabled())
        fProjectionAnnotationModel.modifyAnnotations(null, additions, null);
    }
    else {
      List<Annotation> deletions = new ArrayList<Annotation>();
      Set<Annotation> unfolded = fFoldedProjectionAnnotations.keySet();
      for (Annotation ann : unfolded) {
        if (property.equals(getPropertyOfType(ann.getText()))) {
          deletions.add(ann);
          fUnfoldedProjectionAnnotations.put(ann, fFoldedProjectionAnnotations
              .get(ann));
        }
      }

      for (Annotation ann : deletions)
        fFoldedProjectionAnnotations.remove(ann);

      if (isFoldingEnabled())
        fProjectionAnnotationModel.modifyAnnotations(deletions
            .toArray(new Annotation[deletions.size()]), null, null);
    }
  }

  public Annotation[] getSchemaBoxAnnotations()
  {
    return this.fSchemaBoxAnnotations;
  }

  public void updateSchemaBoxAnnotations(List<Position> positions)
  {
    Annotation[] annotations = new Annotation[positions.size()];

    //this will hold the new annotations along
    //with their corresponding positions
    Map<Annotation, Position> newAnnotations = new HashMap<Annotation, Position>();

    for (int i = 0; i < positions.size(); i++) {
      Annotation annotation = new Annotation(IZAnnotationType.SCHEMABOX, false,
          "Schema Box");

      newAnnotations.put(annotation, positions.get(i));

      annotations[i] = annotation;
    }

    IAnnotationModel annotationModel = this.getDocumentProvider()
        .getAnnotationModel(getEditorInput());
    if (annotationModel instanceof IAnnotationModelExtension) {
      ((IAnnotationModelExtension) annotationModel).replaceAnnotations(
          fSchemaBoxAnnotations, newAnnotations);
    }
    else {
      for (int i = 0; i < fSchemaBoxAnnotations.length; i++)
        annotationModel.removeAnnotation(fSchemaBoxAnnotations[i]);
      Iterator iter = newAnnotations.entrySet().iterator();
      while (iter.hasNext()) {
        Map.Entry mapEntry = (Map.Entry) iter.next();
        if (mapEntry.getValue() != null)
          annotationModel.addAnnotation((Annotation) mapEntry.getKey(),
              (Position) mapEntry.getValue());
      }

      fSchemaBoxAnnotations = (Annotation[]) newAnnotations.keySet().toArray(
          new Annotation[newAnnotations.keySet().size()]);
    }
  }

  public Annotation[] getOccurrenceAnnotations()
  {
    return this.fOccurrenceAnnotations;
  }

  public void markOccurrenceAnnotations(int offset)
  {
    if (fOccurrencesFinderJob != null)
      fOccurrencesFinderJob.cancel();

    if (!fMarkOccurrenceAnnotations)
      return;

    if (this.fParsedData == null)
      return;
    Selector termSelector = this.fParsedData.createTermSelector();
    if (termSelector == null)
      return;
    IDocument document = getDocumentProvider().getDocument(getEditorInput());
    Position word = findWordOfOffset(document, offset);
    //    if (word == null || word.length == 0)
    //      System.out.println("null word");

    Term term = termSelector.getTerm(word);
    if (term == null)
      return;
    else if (term instanceof ZName)
      fOccurrencesFinderJob = new OccurrencesFinderJob(this, term);
    else
      return;

    fOccurrencesFinderJob.run(new NullProgressMonitor());
  }

  protected void installOccurrencesFinder(boolean forceUpdate)
  {
    fMarkOccurrenceAnnotations = true;

    if (forceUpdate && getSelectionProvider() != null) {
      fForcedMarkOccurrencesSelection = getSelectionProvider().getSelection();
      markOccurrenceAnnotations(((TextSelection) fForcedMarkOccurrencesSelection)
          .getOffset());
    }

    if (fOccurrencesFinderJobCanceler == null) {
      fOccurrencesFinderJobCanceler = new OccurrencesFinderJobCanceler(this);
      fOccurrencesFinderJobCanceler.install();
    }
  }

  protected void uninstallOccurrencesFinder()
  {
    fMarkOccurrenceAnnotations = false;

    if (fOccurrencesFinderJob != null) {
      fOccurrencesFinderJob.cancel();
      fOccurrencesFinderJob = null;
    }

    if (fOccurrencesFinderJobCanceler != null) {
      fOccurrencesFinderJobCanceler.uninstall();
      fOccurrencesFinderJobCanceler = null;
    }

    removeOccurrenceAnnotations();
  }

  protected boolean isMarkingOccurrences()
  {
    return fMarkOccurrenceAnnotations;
  }

  public void setOccurrenceAnnotations(Annotation[] occurrenceAnnotations)
  {
    this.fOccurrenceAnnotations = occurrenceAnnotations;
  }

  public void removeOccurrenceAnnotations()
  {
    fMarkOccurrenceModificationStamp = IDocumentExtension4.UNKNOWN_MODIFICATION_STAMP;
    fMarkOccurrenceTargetRegion = null;

    IDocumentProvider documentProvider = getDocumentProvider();
    if (documentProvider == null)
      return;

    IAnnotationModel annotationModel = documentProvider
        .getAnnotationModel(getEditorInput());
    if (annotationModel == null || fOccurrenceAnnotations == null)
      return;

    synchronized (getAnnotationLock(annotationModel)) {
      if (annotationModel instanceof IAnnotationModelExtension) {
        ((IAnnotationModelExtension) annotationModel).replaceAnnotations(
            fOccurrenceAnnotations, null);
      }
      else {
        for (int i = 0, length = fOccurrenceAnnotations.length; i < length; i++)
          annotationModel.removeAnnotation(fOccurrenceAnnotations[i]);
      }
      fOccurrenceAnnotations = null;
    }
  }

  public Annotation getTermHighlightAnnotation()
  {
    return this.fTermHighlightAnnotation;
  }

  public void setTermHighlightAnnotation(Annotation termHighlightAnnotation)
  {
    this.fTermHighlightAnnotation = termHighlightAnnotation;
  }

  public void removeTermHighlightAnnotation()
  {
    fMarkOccurrenceModificationStamp = IDocumentExtension4.UNKNOWN_MODIFICATION_STAMP;

    IDocumentProvider documentProvider = getDocumentProvider();
    if (documentProvider == null)
      return;

    IAnnotationModel annotationModel = documentProvider
        .getAnnotationModel(getEditorInput());
    if (annotationModel == null || fTermHighlightAnnotation == null)
      return;

    synchronized (getAnnotationLock(annotationModel)) {
      if (annotationModel instanceof IAnnotationModelExtension) {
        ((IAnnotationModelExtension) annotationModel).replaceAnnotations(
            new Annotation[]{fTermHighlightAnnotation}, null);
      }
      else {
        annotationModel.removeAnnotation(fTermHighlightAnnotation);
      }
      fTermHighlightAnnotation = null;
    }
  }

  public void installEncodingSupport()
  {
    super.installEncodingSupport();

    String encoding = null;

    /*
     * Gets the encoding type based on the file type
     */
    if ((fFileType == null) || fFileType.equals("")) {
    }
    else if (fFileType.equals(IZFileType.FILETYPE_LATEX)) {
    }
    else if (fFileType.equals(IZFileType.FILETYPE_UTF8)) {
      encoding = IZEncoding.ENCODING_UTF_8;
    }
    else if (fFileType.equals(IZFileType.FILETYPE_UTF16)) {
      encoding = IZEncoding.ENCODING_UTF_16;
    }
    else {
    }

    if (encoding != null) {
      this.fEncodingSupport.setEncoding(encoding);
      setEncoding(encoding);
    }
  }

  public void handleCursorPositionChanged()
  {
    super.handleCursorPositionChanged();
  }

  public void setHighlightRange(int offset)
  {
    if (offset < 0) {
      this.resetHighlightRange();
      return;
    }

    try {
      ITypedRegion partition = null;
      IDocument document = getDocumentProvider().getDocument(getEditorInput());

      if (document instanceof IDocumentExtension3) {
        IDocumentExtension3 extension3 = (IDocumentExtension3) document;

        try {
          partition = extension3.getPartition(IZPartitions.Z_PARTITIONING,
              offset, false);
        } catch (BadPartitioningException be) {
          this.resetHighlightRange();
          return;
        }
      }
      else {
        partition = document.getPartition(offset);
      }

      setHighlightRange(partition.getOffset(), partition.getLength(), false);
    } catch (BadLocationException ble) {
      this.resetHighlightRange();
    }
  }

  /**
   * React to changed selection.
   *
   * @since 3.0
   */
  protected void selectionChanged()
  {
    if (getSelectionProvider() == null)
      return;
    ISelection selection = getSelectionProvider().getSelection();
    if (selection instanceof TextSelection) {
      TextSelection textSelection = (TextSelection) selection;
      removeTermHighlightAnnotation();
      fTermHighlightSelector = null;
      removeOccurrenceAnnotations();
      // PR 39995: [navigation] Forward history cleared after going back in navigation history:
      // mark only in navigation history if the cursor is being moved (which it isn't if
      // this is called from a PostSelectionEvent that should only update the magnet)
      if (isActivePart()
          && (textSelection.getOffset() != 0 || textSelection.getLength() != 0))
        markInNavigationHistory();

      setSelection(textSelection, !isActivePart());
    }
    //		updateStatusLine();
  }

  protected void setSelection(TextSelection selection, boolean moveCursor)
  {
    if (moveCursor) {
      this.selectAndReveal(selection.getOffset(), selection.getLength(),
          selection.getOffset(), 0);
      fForcedMarkOccurrencesSelection = selection;
      markOccurrenceAnnotations(selection.getOffset());
    }

    int cursorOffset = getCursorOffset();
    setHighlightRange(cursorOffset);

    if (!moveCursor) { // avoid Selector repeatedly working
      markOccurrenceAnnotations(cursorOffset);
      if (getPreferenceStore().getBoolean(
          PreferenceConstants.EDITOR_SYNC_OUTLINE_ON_CURSOR_MOVE)) {
        synchronizeOutlinePage(cursorOffset);
      }
    }
  }

  public void setOutlineSelection(int cursorOffset)
  {

    if (cursorOffset < 0)
      return;

    // set outliner selection
    if (fOutlinePage != null) {
      fOutlineSelectionChangedListener.uninstall(fOutlinePage);
      fOutlinePage.select(cursorOffset);
      fOutlineSelectionChangedListener.install(fOutlinePage);
    }
  }

  protected void doOutlineSelectionChanged(SelectionChangedEvent event)
  {

    CztTreeNode segment = null;

    ISelection selection = event.getSelection();
    Iterator iter = ((IStructuredSelection) selection).iterator();
    while (iter.hasNext()) {
      Object o = iter.next();
      if (o instanceof CztTreeNode) {
        segment = (CztTreeNode) o;
        break;
      }
    }

    if (!isActivePart() && CZTPlugin.getActivePage() != null)
      CZTPlugin.getActivePage().bringToTop(this);

    if (segment == null)
      return;

    Position position = segment.getNamePosition();
    if (position == null)
      return;

    TextSelection textSelection = new TextSelection(position.getOffset(),
        position.getLength());
    setSelection(textSelection, !isActivePart());
  }

  /** The <code>ZEditor</code> implementation of this 
   * <code>AbstractTextEditor</code> method performs any extra 
   * disposal actions required by the Z fEditor.
   */
  public void dispose()
  {
    if (fOutlinePage != null)
      fOutlinePage.setInput(null);

    //		if (fProjectionModelUpdater != null) {
    //			fProjectionModelUpdater.uninstall();
    //			fProjectionModelUpdater= null;
    //		}

    if (fProjectionSupport != null) {
      fProjectionSupport.dispose();
      fProjectionSupport = null;
    }

    // cancel possible running computation
    fMarkOccurrenceAnnotations = false;
    uninstallOccurrencesFinder();

    //		uninstallOverrideIndicator();

    //		uninstallSemanticHighlighting();

    if (fActivationListener != null) {
      PlatformUI.getWorkbench().removeWindowListener(fActivationListener);
      fActivationListener = null;
    }

    if (fEncodingSupport != null) {
      fEncodingSupport.dispose();
      fEncodingSupport = null;
    }

    //		if (fBracketMatcher != null) {
    //			fBracketMatcher.dispose();
    //			fBracketMatcher= null;
    //		}

    //		if (fSelectionHistory != null) {
    //			fSelectionHistory.dispose();
    //			fSelectionHistory= null;
    //		}

    if (fEditorSelectionChangedListener != null) {
      fEditorSelectionChangedListener.uninstall(getSelectionProvider());
      fEditorSelectionChangedListener = null;
    }

    if (fSourceViewerDecorationSupport != null) {
      fSourceViewerDecorationSupport.dispose();
      fSourceViewerDecorationSupport = null;
    }

    if (fZSpecDecorationSupport != null) {
      fZSpecDecorationSupport.dispose();
      fZSpecDecorationSupport = null;
    }

    super.dispose();
  }

  /** The <code>ZEditor</code> implementation of this 
   * <code>AbstractTextEditor</code> method performs any extra 
   * revert behavior required by the Z fEditor.
   */
  public void doRevertToSaved()
  {
    super.doRevertToSaved();
    if (!fReportProblemsWhileEditing) {
      createMarkers(fParsedData.getErrors(),
        ((IFileEditorInput) getEditorInput()).getFile(), getDocumentProvider()
            .getDocument(getEditorInput()));
      updateOutlinePage(fParsedData);
    }
  }

  /** The <code>ZEditor</code> implementation of this 
   * <code>AbstractTextEditor</code> method performs any extra 
   * save behavior required by the Z fEditor.
   * 
   * @param progressMonitor the progress monitor
   */
  public void doSave(IProgressMonitor progressMonitor)
  {
    super.doSave(progressMonitor);
    if (!fReportProblemsWhileEditing) {
      createMarkers(fParsedData.getErrors(),
        ((IFileEditorInput) getEditorInput()).getFile(), getDocumentProvider()
            .getDocument(getEditorInput()));
      updateOutlinePage(fParsedData);
    }
  }

  /** The <code>ZEditor</code> implementation of this 
   * <code>AbstractTextEditor</code> method performs any extra 
   * save as behavior required by the Z fEditor.
   */
  public void doSaveAs()
  {
    super.doSaveAs();
    if (!fReportProblemsWhileEditing) {
      createMarkers(fParsedData.getErrors(),
        ((IFileEditorInput) getEditorInput()).getFile(), getDocumentProvider()
            .getDocument(getEditorInput()));
      updateOutlinePage(fParsedData);
    }
  }

  /** The <code>JavaEditor</code> implementation of this 
   * <code>AbstractTextEditor</code> method performs sets the 
   * input of the outline page after AbstractTextEditor has set input.
   * 
   * @param input the fEditor input
   * @throws CoreException in case the input can not be set
   */
  public void doSetInput(IEditorInput input) throws CoreException
  {
    /**
     * Set the file type first
     */
    setFileType(input);
    super.doSetInput(input);
  }

  public void updateOutlinePage(ParsedData data)
  {
    if (fOutlinePage != null) {
      fOutlinePage.setInput(data);
    }
  }

  /** The <code>ZEditor</code> implementation of this 
   * <code>AbstractTextEditor</code> method performs gets
   * the Z content outline page if request is for an 
   * outline page.
   * 
   * @param required the required type
   * @return an adapter for the required type or <code>null</code>
   */
  public Object getAdapter(Class required)
  {
    if (IContentOutlinePage.class.equals(required)) {
      if (fOutlinePage == null) {
        fOutlinePage = createOutlinePage();
      }
      updateOutlinePage(getParsedData());
      return fOutlinePage;
    }

    if (fProjectionSupport != null) {
      Object adapter = fProjectionSupport.getAdapter(getSourceViewer(),
          required);
      if (adapter != null)
        return adapter;
    }

    return super.getAdapter(required);
  }

  public ZContentOutlinePage getContentOutlinePage()
  {
    return this.fOutlinePage;
  }

  /**
   * Returns the mutex for the reconciler. See https://bugs.eclipse.org/bugs/show_bug.cgi?id=63898
   * for a description of the problem.
   * <p>
   * TODO remove once the underlying problem (https://bugs.eclipse.org/bugs/show_bug.cgi?id=66176) is solved.
   * </p>
   * @return the lock reconcilers may use to synchronize on
   */
  public Object getReconcilerLock()
  {
    return fReconcilerLock;
  }

  /**
   * Returns the lock object for the given annotation model.
   *
   * @param annotationModel the annotation model
   * @return the annotation model's lock object
   * @since 3.0
   */
  public Object getAnnotationLock(IAnnotationModel annotationModel)
  {
    if (annotationModel instanceof ISynchronizable)
      return ((ISynchronizable) annotationModel).getLockObject();
    else
      return annotationModel;
  }

  /**
   * Returns the occurrences finder job
   */
  public OccurrencesFinderJob getOccurrencesFinderJob()
  {
    return fOccurrencesFinderJob;
  }

  /**
   * Returns the file type for the fEditor input
   */
  public String getFileType()
  {
    return fFileType;
  }

  /**
   * Sets the file type for the fEditor input
   */
  private void setFileType(IEditorInput input)
  {
    //    System.out.println("ZEditor.setFileType");
    if (input instanceof IFileEditorInput) {
      IFile file = ((IFileEditorInput) input).getFile();
      if (file != null)
        this.fFileType = file.getFileExtension().toLowerCase();
    }
    else {
      // if nothing was found, which should never happen
      this.fFileType = null;
    }

    if (IZFileType.FILETYPE_LATEX.equalsIgnoreCase(this.fFileType))
      setMarkup(Markup.LATEX);
    else if (IZFileType.FILETYPE_UTF8.equalsIgnoreCase(this.fFileType)
        || IZFileType.FILETYPE_UTF16.equalsIgnoreCase(this.fFileType))
      setMarkup(Markup.UNICODE);
    else
      setMarkup(null);
  }

  /**
   * Returns the markup of the fEditor input
   */
  public Markup getMarkup()
  {
    return fMarkup;
  }

  /**
   * Set the markup of the fEditor input
   */
  private void setMarkup(Markup markup)
  {
    this.fMarkup = markup;
  }

  /**
   * Returns the encoding of the fEditor input
   */
  public String getEncoding()
  {
    return fEncoding;
  }

  /**
   * Set the encoding of the fEditor input
   */
  private void setEncoding(String encoding)
  {
    this.fEncoding = encoding;
  }

  public ParsedData getParsedData()
  {
    if (this.fParsedData == null)
      this.fParsedData = new ParsedData(this.getEditorInput().getName());
    return this.fParsedData;
  }

  public void setParsedData(ParsedData data)
  {
    this.fParsedData = data;
  }

  public Position findWordOfOffset(IDocument document, int offset)
  {
    int regionStart = offset, regionEnd = offset;
    int line;
    int lineStart, lineEnd;
    try {
      line = document.getLineOfOffset(offset);
      lineStart = document.getLineOffset(line);
      lineEnd = lineStart + document.getLineLength(line) - 1;

      char curr = document.getChar(offset);

      if (!ZCharacter.isZWordPart(curr)) {
        if (offset > lineStart
            && ZCharacter.isZWordPart(document.getChar(offset - 1)))
          return findWordOfOffset(document, offset - 1);
        else if (offset < lineEnd && (curr == ' ' || curr == '\t'))
          return findWordOfOffset(document, offset + 1);
        else
          return new Position(offset, 1);
      }

      for (; regionStart >= lineStart; regionStart--)
        if (!ZCharacter.isZWordPart(document.getChar(regionStart)))
          break;
      regionStart++;

      for (; regionEnd <= lineEnd; regionEnd++)
        if (!ZCharacter.isZWordPart(document.getChar(regionEnd))) {
          break;
        }
      regionEnd--;

      return new Position(regionStart, regionEnd - regionStart + 1);

    } catch (BadLocationException ble) {
    }

    return null;
  }

  public void setTermHighlightSelector(Selector selector)
  {
    this.fTermHighlightSelector = selector;
  }

  public Selector getTermHighlightSelector()
  {
    return this.fTermHighlightSelector;
  }

  /*
   * @see AbstractTextEditor#handlePreferenceStoreChanged(PropertyChangeEvent)
   */
  protected void handlePreferenceStoreChanged(PropertyChangeEvent event)
  {

    String property = event.getProperty();

    System.out.println("Property: " + property);

    if (AbstractDecoratedTextEditorPreferenceConstants.EDITOR_TAB_WIDTH
        .equals(property)) {
      /*
       * Ignore tab setting since we rely on the formatter preferences.
       * We do this outside the try-finally block to avoid that EDITOR_TAB_WIDTH
       * is handled by the sub-class (AbstractDecoratedTextEditor).
       */
      return;
    }

    try {

      ISourceViewer sourceViewer = getSourceViewer();
      if (sourceViewer == null)
        return;
      /*
       if (isJavaEditorHoverProperty(property))
       updateHoverBehavior();
       */
      boolean newBooleanValue = false;
      Object newValue = event.getNewValue();
      if (newValue != null)
        newBooleanValue = Boolean.valueOf(newValue.toString()).booleanValue();

      if (PreferenceConstants.EDITOR_SYNC_OUTLINE_ON_CURSOR_MOVE
          .equals(property)) {
        if (newBooleanValue)
          selectionChanged();
        return;
      }

      if (PreferenceConstants.EDITOR_MARK_OCCURRENCES.equals(property)) {
        if (newBooleanValue != fMarkOccurrenceAnnotations) {
          fMarkOccurrenceAnnotations = newBooleanValue;
          if (!fMarkOccurrenceAnnotations)
            uninstallOccurrencesFinder();
          else
            installOccurrencesFinder(true);
        }
        return;
      }
      /*
       if (SemanticHighlightings.affectsEnablement(getPreferenceStore(), event)) {
       if (isSemanticHighlightingEnabled())
       installSemanticHighlighting();
       else
       uninstallSemanticHighlighting();
       return;
       }

       if (JavaCore.COMPILER_SOURCE.equals(property)) {
       if (event.getNewValue() instanceof String)
       fBracketMatcher.setSourceVersion((String) event.getNewValue());
       // fall through as others are interested in source change as well.
       }
       */
      ((ZSourceViewerConfiguration) getSourceViewerConfiguration())
          .handlePropertyChangeEvent(event);
      /*
       if (affectsOverrideIndicatorAnnotations(event)) {
       if (isShowingOverrideIndicators()) {
       if (fOverrideIndicatorManager == null)
       installOverrideIndicator(true);
       } else {
       if (fOverrideIndicatorManager != null)
       uninstallOverrideIndicator();
       }
       return;
       }

       if (PreferenceConstants.EDITOR_FOLDING_PROVIDER.equals(property)) {
       if (sourceViewer instanceof ProjectionViewer) {
       ProjectionViewer projectionViewer= (ProjectionViewer) sourceViewer;
       if (fProjectionModelUpdater != null)
       fProjectionModelUpdater.uninstall();
       // either freshly enabled or provider changed
       fProjectionModelUpdater= JavaPlugin.getDefault().getFoldingStructureProviderRegistry().getCurrentFoldingProvider();
       if (fProjectionModelUpdater != null) {
       fProjectionModelUpdater.install(this, projectionViewer);
       }
       }
       return;
       }

       if (DefaultCodeFormatterConstants.FORMATTER_TAB_SIZE.equals(property)
       || DefaultCodeFormatterConstants.FORMATTER_INDENTATION_SIZE.equals(property)
       || DefaultCodeFormatterConstants.FORMATTER_TAB_CHAR.equals(property)) {
       StyledText textWidget= sourceViewer.getTextWidget();
       int tabWidth= getSourceViewerConfiguration().getTabWidth(sourceViewer);
       if (textWidget.getTabs() != tabWidth)
       textWidget.setTabs(tabWidth);
       return;
       }
       */
      if (PreferenceConstants.EDITOR_FOLDING_ENABLED.equals(property)) {
        //        if (sourceViewer instanceof ProjectionViewer) {
        //          new ToggleFoldingRunner().runWhenNextVisible();         
        //        }
        updateFoldingState();
        return;
      }
      if (isFoldingProperty(property)) {
        updateFoldingType(property, newBooleanValue);
      }
      
      if (PreferenceConstants.EDITOR_PARSING_ENABLED.equals(property)) {
        fParsingEnabled = newBooleanValue;
      }
        

      if (PreferenceConstants.EDITOR_REPORT_PROBLEMS.equals(property)) {
        fReportProblemsWhileEditing = PreferenceConstants.EDITOR_REPORT_PROBLEMS_WHILE_EDITING
            .equals(newValue);
      }
    } finally {
      super.handlePreferenceStoreChanged(event);
    }

    if (AbstractDecoratedTextEditorPreferenceConstants.SHOW_RANGE_INDICATOR
        .equals(property)) {
      // superclass already installed the range indicator
      Object newValue = event.getNewValue();
      ISourceViewer viewer = getSourceViewer();
      if (newValue != null && viewer != null) {
        if (Boolean.valueOf(newValue.toString()).booleanValue()) {
          // adjust the highlightrange in order to get the magnet right after changing the selection
          Point selection = viewer.getSelectedRange();
          adjustHighlightRange(selection.x, selection.y);
        }
      }

    }
  }

  /**
   * Returns the boolean preference for the given key.
   *
   * @param store the preference store
   * @param key the preference key
   * @return <code>true</code> if the key exists in the store and its value is <code>true</code>
   * @since 3.0
   */
  private boolean getBoolean(IPreferenceStore store, String key)
  {
    return key != null && store.getBoolean(key);
  }

  /**
   * Sets the given message as error message to this fEditor's status line.
   *
   * @param msg message to be set
   */
  protected void setStatusLineErrorMessage(String msg)
  {
    IEditorStatusLine statusLine = (IEditorStatusLine) getAdapter(IEditorStatusLine.class);
    if (statusLine != null)
      statusLine.setMessage(true, msg, null);
  }

  /**
   * Sets the given message as message to this fEditor's status line.
   *
   * @param msg message to be set
   * @since 3.0
   */
  protected void setStatusLineMessage(String msg)
  {
    IEditorStatusLine statusLine = (IEditorStatusLine) getAdapter(IEditorStatusLine.class);
    if (statusLine != null)
      statusLine.setMessage(false, msg, null);
  }

  /*
   * @see StatusTextEditor#getStatusHeader(IStatus)
   */
  protected String getStatusHeader(IStatus status)
  {
    if (fEncodingSupport != null) {
      String message = fEncodingSupport.getStatusHeader(status);
      if (message != null)
        return message;
    }
    return super.getStatusHeader(status);
  }

  /*
   * @see StatusTextEditor#getStatusBanner(IStatus)
   */
  protected String getStatusBanner(IStatus status)
  {
    if (fEncodingSupport != null) {
      String message = fEncodingSupport.getStatusBanner(status);
      if (message != null)
        return message;
    }
    return super.getStatusBanner(status);
  }

  /*
   * @see StatusTextEditor#getStatusMessage(IStatus)
   */
  protected String getStatusMessage(IStatus status)
  {
    if (fEncodingSupport != null) {
      String message = fEncodingSupport.getStatusMessage(status);
      if (message != null)
        return message;
    }
    return super.getStatusMessage(status);
  }

  /**
   * Creates and returns the preference store for this editor with the given input.
   *
   * @param input The editor input for which to create the preference store
   * @return the preference store for this editor
   *
   * @since 3.0
   */
  private IPreferenceStore createCombinedPreferenceStore(IEditorInput input)
  {
    List<IPreferenceStore> stores = new ArrayList<IPreferenceStore>();

    //        IJavaProject project= EditorUtility.getJavaProject(input);
    //        if (project != null) {
    //            stores.add(new EclipsePreferencesAdapter(new ProjectScope(project.getProject()), JavaCore.PLUGIN_ID));
    //        }

    stores.add(CZTPlugin.getDefault().getPreferenceStore());
    //        stores.add(new PreferencesAdapter(JavaCore.getPlugin().getPluginPreferences()));
    stores.add(EditorsUI.getPreferenceStore());

    return new ChainedPreferenceStore((IPreferenceStore[]) stores
        .toArray(new IPreferenceStore[stores.size()]));
  }

  /*
   * @see org.eclipse.ui.texteditor.AbstractTextEditor#setPreferenceStore(org.eclipse.jface.preference.IPreferenceStore)
   */
  protected void setPreferenceStore(IPreferenceStore store)
  {
    super.setPreferenceStore(store);
    if (getSourceViewerConfiguration() instanceof ZSourceViewerConfiguration) {
      CZTTextTools textTools = CZTPlugin.getDefault().getCZTTextTools();
      setSourceViewerConfiguration(new ZSourceViewerConfiguration(textTools
          .getColorManager(), store, this, IZPartitions.Z_PARTITIONING));
    }
    if (getSourceViewer() instanceof ZSourceViewer)
      ((ZSourceViewer) getSourceViewer()).setPreferenceStore(store);
  }

  /* 
   * @see org.eclipse.ui.texteditor.AbstractTextEditor#affectsTextPresentation(org.eclipse.jface.util.PropertyChangeEvent)
   */
  public boolean affectsTextPresentation(PropertyChangeEvent event)
  {
    return ((ZSourceViewerConfiguration) getSourceViewerConfiguration())
        .affectsTextPresentation(event)
        || super.affectsTextPresentation(event);
  }

  public void updatedTitleImage(Image image)
  {
    setTitleImage(image);
  }

  /**
   * Jumps to the matching bracket.
   */
  /*
   public void gotoMatchingBracket()
   {
   ISourceViewer sourceViewer = getSourceViewer();
   IDocument document = sourceViewer.getDocument();
   if (document == null)
   return;

   IRegion selection = getSignedSelection(sourceViewer);

   int selectionLength = Math.abs(selection.getLength());
   if (selectionLength > 1) {
   //            setStatusLineErrorMessage(JavaEditorMessages.GotoMatchingBracket_error_invalidSelection);
   setStatusLineErrorMessage("JavaEditorMessages.GotoMatchingBracket_error_invalidSelection");
   sourceViewer.getTextWidget().getDisplay().beep();
   return;
   }

   // #26314
   int sourceCaretOffset = selection.getOffset() + selection.getLength();
   if (isSurroundedByBrackets(document, sourceCaretOffset))
   sourceCaretOffset -= selection.getLength();

   IRegion region = fBracketMatcher.match(document, sourceCaretOffset);
   if (region == null) {
   setStatusLineErrorMessage("ZEditorMessages.GotoMatchingBracket_error_noMatchingBracket");
   sourceViewer.getTextWidget().getDisplay().beep();
   return;
   }

   int offset = region.getOffset();
   int length = region.getLength();

   if (length < 1)
   return;

   int anchor = fBracketMatcher.getAnchor();
   // http://dev.eclipse.org/bugs/show_bug.cgi?id=34195
   int targetOffset = (ICharacterPairMatcher.RIGHT == anchor)
   ? offset + 1
   : offset + length;

   boolean visible = false;
   if (sourceViewer instanceof ITextViewerExtension5) {
   ITextViewerExtension5 extension = (ITextViewerExtension5) sourceViewer;
   visible = (extension.modelOffset2WidgetOffset(targetOffset) > -1);
   }
   else {
   IRegion visibleRegion = sourceViewer.getVisibleRegion();
   // http://dev.eclipse.org/bugs/show_bug.cgi?id=34195
   visible = (targetOffset >= visibleRegion.getOffset() && targetOffset <= visibleRegion
   .getOffset()
   + visibleRegion.getLength());
   }

   if (!visible) {
   setStatusLineErrorMessage("ZEditorMessages.GotoMatchingBracket_error_bracketOutsideSelectedElement");
   sourceViewer.getTextWidget().getDisplay().beep();
   return;
   }

   if (selection.getLength() < 0)
   targetOffset -= selection.getLength();

   sourceViewer.setSelectedRange(targetOffset, selection.getLength());
   sourceViewer.revealRange(targetOffset, selection.getLength());
   }
   */
  /*
   * Returns the signed current selection.
   * The length will be negative if the resulting selection
   * is right-to-left (RtoL).
   * <p>
   * The selection offset is model based.
   * </p>
   *
   * @param sourceViewer the source viewer
   * @return a region denoting the current signed selection, for a resulting RtoL selections length is < 0
   */
  /*
   protected IRegion getSignedSelection(ISourceViewer sourceViewer)
   {
   StyledText text = sourceViewer.getTextWidget();
   Point selection = text.getSelectionRange();

   if (text.getCaretOffset() == selection.x) {
   selection.x = selection.x + selection.y;
   selection.y = -selection.y;
   }

   selection.x = widgetOffset2ModelOffset(sourceViewer, selection.x);

   return new Region(selection.x, selection.y);
   }

   private static boolean isBracket(char character)
   {
   if (IZFileType.FILETYPE_LATEX.equalsIgnoreCase(getFileType())) {
   for (int i = 0; i != BRACKETS.length; ++i)
   if (character == BRACKETS[i])
   return true;
   }
   else if (IZFileType.FILETYPE_LATEX.equalsIgnoreCase(getFileType())
   || IZFileType.FILETYPE_LATEX.equalsIgnoreCase(getFileType())) {
   for (int i = 0; i != BRACKETS.length; ++i)
   if (character == BRACKETS[i])
   return true;
   }
   
   return false;
   }

   private static boolean isSurroundedByBrackets(IDocument document, int offset)
   {
   if (offset == 0 || offset == document.getLength())
   return false;

   try {
   return isBracket(document.getChar(offset - 1))
   && isBracket(document.getChar(offset));

   } catch (BadLocationException e) {
   return false;
   }
   }
   */

  /*
   * @see net.sourceforge.czt.eclipse.editors.IZReconcilingListener#aboutToBeReconciled()
   */
  
  public boolean isParsingEnabled()
  {
    return fParsingEnabled;
  }

  /**
   * Create markers according to the compiler output
   */
  protected void createMarkers(List<CztError> errors, IResource resource,
      IDocument document)
  {
    try {
      // first delete all the previous markers
      resource.deleteMarkers(IZMarker.PROBLEM, false, 0);

      ZCompilerMessageParser compMsgParser = new ZCompilerMessageParser();

      compMsgParser.parseCompilerMessage(document, resource, errors);
    } catch (CoreException ce) {
      CZTPlugin.getDefault().getLog().log(
          new Status(IStatus.ERROR, CztUI.ID_PLUGIN, 0, CZTPlugin
              .getResourceString("Error occurred when creating markers"), ce));
    } finally {

    }
  }

  public void aboutToBeReconciled()
  {
    // Notify listeners
    Object[] listeners = fReconcilingListeners.getListeners();
    for (int i = 0, length = listeners.length; i < length; ++i)
      ((IZReconcilingListener) listeners[i]).aboutToBeReconciled();
  }

  /*
   * @see net.sourceforge.czt.eclipse.editors.IZReconcilingListener#reconciled(net.sourceforge.czt.eclipse.editors.parser.ParsedData, boolean, org.eclipse.core.runtime.IProgressMonitor)
   */
  public void reconciled(ParsedData parsedData, boolean forced,
      IProgressMonitor progressMonitor)
  {
    fParsedData = parsedData;
    if (fReportProblemsWhileEditing || !this.isDirty())
      if (fParsedData != null)
        createMarkers(fParsedData.getErrors(),
            ((IFileEditorInput) getEditorInput()).getFile(), getDocumentProvider()
              .getDocument(getEditorInput()));
    updateOutlinePage(fParsedData);

    // Notify listeners
//    Object[] listeners = fReconcilingListeners.getListeners();
//    for (int i = 0, length = listeners.length; i < length; ++i)
//      ((IZReconcilingListener) listeners[i]).reconciled(parsedData, forced,
//          progressMonitor);

    // Update Z Outline page selection
//    if (!forced && !progressMonitor.isCanceled()) {
//      Shell shell = getSite().getShell();
//      if (shell != null && !shell.isDisposed()) {
//        shell.getDisplay().asyncExec(new Runnable()
//        {
//          public void run()
//          {
//            selectionChanged();
//          }
//        });
//      }
//    }
  }

  /**
   * Adds the given listener.
   * Has no effect if an identical listener was not already registered.
   *
   * @param listener  The reconcile listener to be added
   * @since 3.0
   */
  final void addReconcileListener(IZReconcilingListener listener)
  {
    synchronized (fReconcilingListeners) {
      fReconcilingListeners.add(listener);
    }
  }

  /**
   * Removes the given listener.
   * Has no effect if an identical listener was not already registered.
   *
   * @param listener  the reconcile listener to be removed
   * @since 3.0
   */
  final void removeReconcileListener(IZReconcilingListener listener)
  {
    synchronized (fReconcilingListeners) {
      fReconcilingListeners.remove(listener);
    }
  }
}
