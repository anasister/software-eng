import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JProgressBar;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.SwingConstants;
import javax.swing.JMenuItem;


public class Mainpage {

	private JFrame frame;

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(boolean st) {
		frame.setVisible(st);
	}

	public Mainpage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 633, 469);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\Atefeh\\Pictures\\fanni.PNG"));
		label.setBounds(481, 11, 126, 93);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("C:\\Users\\Atefeh\\Pictures\\ut.PNG"));
		label_1.setBounds(10, 11, 126, 105);
		frame.getContentPane().add(label_1);
		
		JMenu mnNewMenu = new JMenu("\u0646\u0627\u0645\u0647 \u0647\u0627");
		mnNewMenu.setHorizontalAlignment(SwingConstants.RIGHT);
		mnNewMenu.setBounds(29, 142, 107, 22);
		frame.getContentPane().add(mnNewMenu);
		
		JMenu mnNewMenu_1 = new JMenu("\u0645\u062E\u0627\u0637\u0628\u06CC\u0646");
		mnNewMenu_1.setBounds(29, 166, 107, 22);
		frame.getContentPane().add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("\u0645\u0634\u0627\u0647\u062F\u0647 \u0645\u062E\u0627\u0637\u0628\u06CC\u0646");
		mnNewMenu_1.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("\u0627\u0641\u0632\u0648\u062F\u0646 \u0645\u062E\u0627\u0637\u0628");
		mnNewMenu_1.add(mntmNewMenuItem_1);
	}
}
