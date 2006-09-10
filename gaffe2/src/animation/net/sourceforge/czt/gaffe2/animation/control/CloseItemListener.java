/**
 * 
 */

package net.sourceforge.czt.gaffe2.animation.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import net.sourceforge.czt.gaffe2.animation.model.StepTree;
import net.sourceforge.czt.gaffe2.animation.view.MainFrame;
import net.sourceforge.czt.gaffe2.animation.view.OperationPane;
import net.sourceforge.czt.gaffe2.animation.view.OutputPane;
import net.sourceforge.czt.gaffe2.animation.view.StatePane;
import net.sourceforge.czt.gaffe2.animation.view.StatusLabel;
import net.sourceforge.czt.gaffe2.animation.view.ToolBar;

/**
 * @author Linan Zhang
 *
 */
public class CloseItemListener implements ActionListener
{
  /**
   * 
   */
  public CloseItemListener()
  {
  }

  /* (non-Javadoc)
   * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
   */
  public void actionPerformed(ActionEvent arg0)
  {
    StatePane.getCurrentPane().reset();
    OutputPane.getCurrentPane().reset();
    OperationPane.getCurrentPane().reset();
    ToolBar.getCurrentToolBar().reset();
    StepTree.reset();
    MainFrame.getFrameSplit().setVisible(false);
    StatusLabel.setMessage("Ready");
  }

}
