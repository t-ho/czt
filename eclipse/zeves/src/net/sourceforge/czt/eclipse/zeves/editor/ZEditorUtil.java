package net.sourceforge.czt.eclipse.zeves.editor;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.jface.text.IDocument;
import org.eclipse.ui.texteditor.ITextEditor;

import net.sourceforge.czt.eclipse.editors.zeditor.ZEditor;

public class ZEditorUtil {

	public static int getCaretPosition(ZEditor editor) {
		return editor.getViewer().getTextWidget().getCaretOffset();
	}

	public static IResource getEditorResource(ZEditor editor) {
		
		if (editor == null) {
			return null;
		}
		
		return (IResource) ((IAdaptable) editor.getEditorInput()).getAdapter(IResource.class);
	}
	
	public static IDocument getDocument(ITextEditor editor) {
		
		if (editor == null) {
			return null;
		}
		
		return editor.getDocumentProvider().getDocument(editor.getEditorInput());
	}

}