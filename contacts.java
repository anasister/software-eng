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
import javax.swing.JScrollPane;
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
import javax.swing.table.TableColumn;
import javax.swing.border.BevelBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.LineBorder;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import java.awt.SystemColor;
import javax.swing.table.AbstractTableModel;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;


public class contacts {

	private JFrame frame;
	private Vector<Student> students;
	private Vector<Teacher> teachers;
	private JTable table;
	private JTextField n;
	private JTextField ln;
	private JTextField m;
	private JTextField sh;
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
		students = new Vector<Student>();
		teachers = new Vector<Teacher>();
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
		FlowLayout flowLayout = (FlowLayout) leftpanel.getLayout();
		flowLayout.setHgap(14);
		leftpanel.setForeground(SystemColor.menu);
		leftpanel.setBounds(20, 122, 126, 392);
		frame.getContentPane().add(leftpanel);
		
		final JList list = new JList();

		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"\u062F\u0627\u0646\u0634 \u062C\u0648", "\u0627\u0633\u062A\u0627\u062F"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list.setSelectedIndex(0);
		leftpanel.add(list);
		
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
		TableColumn column = new TableColumn();
		
		Panel panel = new Panel();
		panel.setBounds(10, 270, 560, 113);
		rightpanel.add(panel);
		panel.setLayout(null);
		
		JLabel lblName = new JLabel("\u0646\u0627\u0645");
		lblName.setHorizontalAlignment(SwingConstants.RIGHT);
		lblName.setBounds(530, 39, 20, 14);
		panel.add(lblName);
		
		JLabel label_2 = new JLabel("\u0646\u0627\u0645 \u062E\u0627\u0646\u0648\u0627\u062F\u06AF\u06CC");
		label_2.setHorizontalAlignment(SwingConstants.RIGHT);
		label_2.setBounds(466, 59, 84, 14);
		panel.add(label_2);
		
		JLabel label_3 = new JLabel("\u0627\u06CC\u0645\u06CC\u0644");
		label_3.setHorizontalAlignment(SwingConstants.RIGHT);
		label_3.setBounds(504, 80, 46, 14);
		panel.add(label_3);
		
		
		n = new JTextField();
		n.setBounds(10, 11, 475, 20);
		panel.add(n);
		n.setColumns(10);

		ln = new JTextField();
		ln.setColumns(10);
		ln.setBounds(10, 59, 475, 20);
		panel.add(ln);
		
		m = new JTextField();
		m.setColumns(10);
		m.setBounds(10, 82, 475, 20);
		panel.add(m);
		
		sh = new JTextField();
		sh.setColumns(10);
		sh.setBounds(10, 36, 475, 20);
		panel.add(sh);
		
		JLabel label_4 = new JLabel("\u0634.\u062F/\u0634.\u067E");
		label_4.setBounds(495, 14, 55, 14);
		panel.add(label_4);
		
		final SimpleModel studentTable = new SimpleModel();
		studentTable.addColumn("شماره دانشجویی");
		studentTable.addColumn("نام");
		studentTable.addColumn("نام خانوادگی");
		studentTable.addColumn("ایمیل");
		
		final SimpleModel teacherTable = new SimpleModel();
		teacherTable.addColumn("شماره پرسنلی");
		teacherTable.addColumn("نام");
		teacherTable.addColumn("نام خانوادگی");
		teacherTable.addColumn("ایمیل");
		
		table = new JTable(studentTable);
		if(list.getSelectedIndex()==1)
			table.setModel(teacherTable);
		table.setBounds(1, 48, 558, 170);
		rightpanel.add(table);
		table.setRowSelectionAllowed(true);
		table.setFillsViewportHeight(true);
		for(int i=0;i<students.size();i++)
		{
			String[] fiel= {students.get(i).getId(), students.get(i).getFirstName(),students.get(i).getLastName(), students.get(i).getEmail()}; 
			studentTable.addRow(fiel);
		}
		table.setBorder(new LineBorder(new Color(0, 0, 0)));
		table.setVisible(true);
		
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(10, 44, 560, 220);
		rightpanel.add(scrollPane);
		scrollPane.setBackground(UIManager.getColor("Button.background"));
		//ACTIONS:
		//****************ON NEW...***********************
		btnNew.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(list.getSelectedIndex()==0){
					Student new_student = new  Student(n.getText(),ln.getText(),m.getText(),sh.getText());
					students.add(new_student);
					String[] fiel= {sh.getText() ,n.getText(),ln.getText(),m.getText()}; 
					studentTable.addRow(fiel);
					
				}
				else{
					Teacher new_teacher = new  Teacher(n.getText(),ln.getText(),m.getText(),sh.getText());
					teachers.add(new_teacher);
					String[] fiel= {sh.getText() ,n.getText(),ln.getText(),m.getText()}; 
					teacherTable.addRow(fiel);
				}
			}
		});
		//************SELECT TABLE(STUDENT/TEACHER)*******************
		list.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent arg0) {
				if(list.getSelectedIndex()==0){
					table.setModel(studentTable);
					
				}
				else{
					table.setModel(teacherTable);
				}
			}
		});
		//*************ON DELET******************
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int del_item = table.getSelectedRow();
				if(del_item>=0){
					if(list.getSelectedIndex()==0){
						students.remove(del_item);
						studentTable.removeRow(del_item);
						
					}
					else{
						teachers.remove(del_item);
						teacherTable.removeRow(del_item);
					}
				}
					
			}
		});
		
	}
}
