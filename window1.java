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
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("\u0646\u0627\u0645 \u06A9\u0627\u0631\u0628\u0631\u06CC");
		label.setBounds(222, 98, 46, 14);
		frame.getContentPane().add(label);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(128, 126, 88, 20);
		frame.getContentPane().add(passwordField);
		
		JLabel label_1 = new JLabel("\u0631\u0645\u0632 \u0639\u0628\u0648\u0631");
		label_1.setBounds(222, 129, 46, 14);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("\u0628\u0647 \u0633\u0627\u0645\u0627\u0646\u0647 \u062C\u0627\u0645\u0639 \u0622\u0645\u0648\u0632\u0634 \u062A\u062D\u0635\u06CC\u0644\u0627\u062A \u062A\u06A9\u06CC\u0644\u06CC \u062E\u0648\u0634 \u0622\u0645\u062F\u06CC\u062F");
		label_2.setBounds(106, 26, 318, 14);
		frame.getContentPane().add(label_2);
		
		textField = new JTextField();
		textField.setBounds(128, 95, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton button = new JButton("\u0648\u0631\u0648\u062F");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().equals("admin") && passwordField.getText().equals("12345") )
					System.out.println("you are logged in");
			}
		});
		button.setBounds(152, 170, 89, 23);
		frame.getContentPane().add(button);
		

	}
}
