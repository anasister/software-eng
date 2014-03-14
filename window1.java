import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.InputMethodListener;
import java.awt.event.InputMethodEvent;
import javax.swing.JButton;
import javax.swing.JLayeredPane;
import java.awt.Canvas;
import javax.swing.ImageIcon;
import java.awt.Label;
import java.awt.Color;


public class window1 {

	private JFrame frame;
	private JPasswordField passwordField;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					window1 window = new window1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public window1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 535, 360);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("\u0646\u0627\u0645 \u06A9\u0627\u0631\u0628\u0631\u06CC");
		label.setBounds(275, 157, 46, 14);
		frame.getContentPane().add(label);
		
		passwordField = new JPasswordField();
		passwordField.setBackground(new Color(255, 255, 240));
		passwordField.setBounds(155, 189, 88, 20);
		frame.getContentPane().add(passwordField);
		
		JLabel label_1 = new JLabel("\u0631\u0645\u0632 \u0639\u0628\u0648\u0631");
		label_1.setBounds(275, 192, 46, 14);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("\u0628\u0647 \u0633\u0627\u0645\u0627\u0646\u0647 \u062C\u0627\u0645\u0639 \u0622\u0645\u0648\u0632\u0634 \u062A\u062D\u0635\u06CC\u0644\u0627\u062A \u062A\u06A9\u06CC\u0644\u06CC \u062E\u0648\u0634 \u0622\u0645\u062F\u06CC\u062F");
		label_2.setBounds(128, 26, 318, 14);
		frame.getContentPane().add(label_2);
		
		textField = new JTextField();
		textField.setBackground(new Color(255, 255, 240));
		textField.setBounds(155, 154, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton button = new JButton("\u0648\u0631\u0648\u062F");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().equals("admin") && passwordField.getText().equals("12345") ){
					System.out.println("you are logged in");
					frame.setVisible(false);
					Mainpage con = new Mainpage();
					con.setFrame(true);
				}
			}
		});
		button.setBounds(210, 220, 89, 23);
		frame.getContentPane().add(button);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Atefeh\\Pictures\\ut.PNG"));
		lblNewLabel.setBounds(8, 13, 110, 99);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Atefeh\\Pictures\\fanni.PNG"));
		lblNewLabel_1.setBounds(396, 13, 113, 91);
		frame.getContentPane().add(lblNewLabel_1);
		

	}
}
