package net.sourceforge.czt.eclipse.zeves.ui.core;

import java.util.Map;

import net.sourceforge.czt.eclipse.zeves.ui.ZEvesUIPlugin;
import net.sourceforge.czt.eclipse.zeves.ui.core.ZEvesSnapshot.FileSection;
import net.sourceforge.czt.zeves.ZEvesApi;
import net.sourceforge.czt.zeves.ZEvesException;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;

public class ZEvesUndoSectionCommand extends AbstractExecCommand {
	
	private final FileSection section;
	
	public ZEvesUndoSectionCommand(FileSection section) {
		this.section = section;
	}
	
	@Override
	public IStatus doExecute(IProgressMonitor monitor) {
		
		ZEves prover = ZEvesUIPlugin.getZEves();
		if (!prover.isRunning()) {
			return Status.OK_STATUS;
		}

		ZEvesApi zEvesApi = prover.getApi();
        ZEvesSnapshot snapshot = prover.getSnapshot();
        
        try {
			Map<String, Integer> fileUndoOffsets = 
				snapshot.undoThrough(zEvesApi, section);
			
			ResourceUtil.deleteMarkers(fileUndoOffsets);
		} catch (ZEvesException e) {
			return ZEvesUIPlugin.newErrorStatus(e.getMessage(), e);
		}
		
		return Status.OK_STATUS;
	}
	
}