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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Font;


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
		frame.getContentPane().setFont(new Font("Tahoma", Font.BOLD, 11));
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
		
		JButton btnNewButton = new JButton("\u0646\u0627\u0645\u0647 \u0647\u0627");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(490, 152, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(240, 255, 255));
		panel.setBorder(null);
		panel.setBounds(467, 115, 140, 304);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("\u0645\u062E\u0627\u0637\u0628\u06CC\u0646");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.setVisible(false);
				contacts con = new contacts();
				con.setFrame(true);
			}
		});
		btnNewButton_1.setBounds(23, 73, 89, 23);
		panel.add(btnNewButton_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(176, 224, 230));
		panel_1.setBounds(10, 115, 446, 304);
		frame.getContentPane().add(panel_1);
	}
}
