import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JProgressBar;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.SwingConstants;
import javax.swing.JMenuItem;
import javax.swing.JSplitPane;
import java.awt.Panel;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.ScrollPane;
import javax.swing.UIManager;
import javax.swing.JTable;


public class contacts {

	private JFrame frame;
	private Vector<Contact> contactes;
	private JTable table;
	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(boolean st) {
		frame.setVisible(st);
	}

	public contacts() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 769, 563);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\Atefeh\\Pictures\\fanni.PNG"));
		label.setBounds(606, 22, 126, 93);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("C:\\Users\\Atefeh\\Pictures\\ut.PNG"));
		label_1.setBounds(10, 11, 126, 105);
		frame.getContentPane().add(label_1);
		
		Panel leftpanel = new Panel();
		leftpanel.setBounds(20, 122, 126, 392);
		frame.getContentPane().add(leftpanel);
		
		Panel rightpanel = new Panel();
		rightpanel.setBounds(152, 121, 580, 393);
		frame.getContentPane().add(rightpanel);
		rightpanel.setLayout(null);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setBounds(108, 10, 89, 23);
		rightpanel.add(btnDelete);
		
		JButton btnNew = new JButton("New...");
		btnNew.setBounds(10, 10, 89, 23);
		rightpanel.add(btnNew);
		
		ScrollPane scrollPane = new ScrollPane();
		scrollPane.setBounds(10, 39, 560, 253);
		scrollPane.setBackground(UIManager.getColor("Button.background"));
		rightpanel.add(scrollPane);
		
		table = new JTable();
		table.setBounds(20, 51, 1, 1);
		rightpanel.add(table);
		
		Panel panel = new Panel();
		panel.setBounds(10, 298, 560, 85);
		rightpanel.add(panel);
		panel.setLayout(null);
		
		JLabel lblName = new JLabel("\u0646\u0627\u0645");
		lblName.setHorizontalAlignment(SwingConstants.RIGHT);
		lblName.setBounds(530, 11, 20, 14);
		panel.add(lblName);
		
		JLabel label_2 = new JLabel("\u0646\u0627\u0645 \u062E\u0627\u0646\u0648\u0627\u062F\u06AF\u06CC");
		label_2.setHorizontalAlignment(SwingConstants.RIGHT);
		label_2.setBounds(466, 31, 84, 14);
		panel.add(label_2);
		
		JLabel label_3 = new JLabel("\u0627\u06CC\u0645\u06CC\u0644");
		label_3.setHorizontalAlignment(SwingConstants.RIGHT);
		label_3.setBounds(504, 52, 46, 14);
		panel.add(label_3);
		
		JLabel name = new JLabel("");
		name.setBounds(10, 11, 459, 14);
		panel.add(name);
		
		JLabel lastname = new JLabel("");
		lastname.setBounds(10, 31, 459, 14);
		panel.add(lastname);
		
		JLabel email = new JLabel("");
		email.setBounds(10, 56, 459, 14);
		panel.add(email);
	}
}
