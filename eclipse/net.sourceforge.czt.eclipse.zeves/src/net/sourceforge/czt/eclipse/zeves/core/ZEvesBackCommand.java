package net.sourceforge.czt.eclipse.zeves.core;

import net.sourceforge.czt.eclipse.editors.zeditor.ZEditor;
import net.sourceforge.czt.eclipse.zeves.ZEvesPlugin;

public class ZEvesBackCommand extends AbstractUndoCommand {
	
	public ZEvesBackCommand(ZEditor editor) {
		super(editor);
	}
	
	@Override
	protected int getUndoOffset(String filePath) {
        // undo through the last offset - this will undo the last result
		ZEvesSnapshot snapshot = ZEvesPlugin.getZEves().getSnapshot();
		return snapshot.getLastPositionOffset(filePath);
	}
	
}