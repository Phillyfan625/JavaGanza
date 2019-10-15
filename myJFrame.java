package App;

import java.awt.*;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class myJFrame extends JFrame
{
	public myJFrame ()
	{
		super ("JavaGanza");
  	 	myJPanel mjp = new myJPanel();
		add(mjp);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize (640, 480);
		setVisible(true);
	}

}
