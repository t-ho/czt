package net.sourceforge.czt.eclipse.zeves.core;

import java.math.BigInteger;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;

import net.sourceforge.czt.base.ast.Term;
import net.sourceforge.czt.eclipse.editors.parser.IPositionProvider;
import net.sourceforge.czt.eclipse.editors.parser.ParsedData;
import net.sourceforge.czt.eclipse.editors.parser.TermPositionProvider;
import net.sourceforge.czt.eclipse.editors.zeditor.ZEditor;
import net.sourceforge.czt.eclipse.editors.zeditor.ZEditorUtil;
import net.sourceforge.czt.eclipse.editors.zeditor.ZEditorUtil.ReconcileRunnable;
import net.sourceforge.czt.eclipse.zeves.ZEvesPlugin;
import net.sourceforge.czt.zeves.ZEvesApi;
import net.sourceforge.czt.zeves.ZEvesException;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.text.IDocument;

public class ZEvesSubmitCommand extends AbstractExecCommand {
	
	private final ZEditor editor;
	private final BigInteger documentVersion;
	private final int offset;
	
	private final Object waitObj = new Object();
	private ParsedData parsedData = null;
	private boolean reconciled = false;
	
	public ZEvesSubmitCommand(ZEditor editor, int offset) {
		this.editor = editor;
		this.documentVersion = editor.getDocumentVersion();
		this.offset = offset;
	}

	@Override
	public IStatus doExecute(IProgressMonitor monitor) {
		
		ZEves prover = ZEvesPlugin.getZEves();
		if (!prover.isRunning()) {
			return ZEvesPlugin.newErrorStatus("Z/Eves prover is not running.", null);
		}
		
		final ZEvesApi zEvesApi = prover.getApi();
		
		IResource resource = ZEditorUtil.getEditorResource(editor);
        IDocument document = ZEditorUtil.getDocument(editor);
        IPositionProvider<Term> posProvider = new TermPositionProvider(document);
        
        ZEvesMarkers markers = resource != null ? new ZEvesMarkers(resource, document) : null;
        
        // TODO handle if resource is not available
        String filePath = ResourceUtil.getPath(resource);
		
        ZEvesSnapshot snapshot = ZEvesPlugin.getZEves().getSnapshot();
        int submittedOffsetInFile = snapshot.getLastPositionOffset(filePath);
        
        boolean submitNew = offset > submittedOffsetInFile;
        // when submitting, go from the next symbol than last submitted
        int start = submitNew ? submittedOffsetInFile + 1 : offset;
        
        if (start < 0) {
        	// adjust to start of the document
        	start = 0;
        }
        
		// submitting in a file, which is not the last in the snapshot
		// e.g. submit one file partially, then submit another
		if (snapshot.needUndo(filePath, start)) {
			// need to undo until the start, and then submit again
			try {
				
				Map<String, Integer> fileUndoOffsets = 
					snapshot.undoThrough(zEvesApi, filePath, start);
				
				ResourceUtil.deleteMarkers(fileUndoOffsets);
				
			} catch (ZEvesException e) {
				return ZEvesPlugin.newErrorStatus(e.getMessage(), e);
			}
		}
		
		if (!submitNew) {
			// undo only
			return Status.OK_STATUS;
		}
		
		if (monitor.isCanceled()) {
    		return Status.CANCEL_STATUS;
    	}
		
		/*
		 * ask the editor to reconcile - this is done for several reasons.
		 * First, updates could have been done right before the submit and we
		 * require an up-to-date AST to perform the submit. Forcing reconcile
		 * allows us to avoid waiting for the delayed reconciler to kick in.
		 * 
		 * Secondly, the option to reconcile on parse ("parse automatically")
		 * may have been switched off for the Z Editor. For this reason, we
		 * need to force reconcile manually to get an AST altogether.
		 */
		editor.forceReconcile();
		
		// wait until reconcile completes
    	ZEditorUtil.runOnReconcile(editor, documentVersion, new ReconcileRunnable() {
			@Override
			protected void run(ParsedData parsedData) {
				synchronized(waitObj) {
					
					ZEvesSubmitCommand.this.parsedData = parsedData;
					ZEvesSubmitCommand.this.reconciled = true;
					
					waitObj.notify();
				}
			}
		});

    	synchronized (waitObj) {
    		while (!reconciled) {
        		try {
					waitObj.wait();
				} catch (InterruptedException e) {}
        	}
		}
    	
    	if (monitor.isCanceled()) {
    		return Status.CANCEL_STATUS;
    	}
		
		Timer cancelMonitor = initCancelMonitor(zEvesApi, monitor);
		
		final ZEvesExecVisitor zEvesExec = new ZEvesExecVisitor(
				zEvesApi, snapshot, markers, 
				filePath, posProvider, parsedData.getSectionManager(), 
				start, offset, monitor);

		// wrap into try-finally, because OperationCanceledExpression
		// may be thrown from inside
		try {
			zEvesExec.execSpec(parsedData.getSpec());
		} finally {
			cancelMonitor.cancel();
			zEvesExec.finish();
		}

		return Status.OK_STATUS;
	}

	private Timer initCancelMonitor(final ZEvesApi zEvesApi, final IProgressMonitor monitor) {
		
		// if user cancels the task, check that in a separate thread,
		// because the main thread may be blocked by Z/Eves comms. Then
		// send abort to abort long-running Z/Eves task probably.
		final Timer timer = new Timer(true);
		TimerTask cancelMonitor = new TimerTask() {
			
			@Override
			public void run() {
				if (monitor.isCanceled()) {
					// send abort
					zEvesApi.sendAbort();
					timer.cancel();
				}
			}
		};
		// check for cancelation every 0.5 sec 
		int period = 500;
		timer.schedule(cancelMonitor, period, period);
		
		return timer;
	}
}