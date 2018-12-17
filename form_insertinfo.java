package Home;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.ImageIcon;

public class form_insertinfo extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	public static JTextField textField_1;
	public static JTextField textField_2;
public static JTextField textField_3;
	public static  JTextField textField_4;
	public static JTextField textField_5;
	private final ButtonGroup buttonGroup = new ButtonGroup();
public static JComboBox comboBox;
	
	// Launching the application
	
String c;
int t;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
				form_insertinfo frame = new form_insertinfo();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public form_insertinfo() {
		
		setTitle("Vehicle Allocation System");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 639, 600);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		textField = new JTextField();
		textField.setBackground(new Color(192, 192, 192));
		textField.setForeground(new Color(0, 0, 0));
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBackground(new Color(192, 192, 192));
		textField_1.setForeground(new Color(0, 0, 0));
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBackground(new Color(192, 192, 192));
		textField_2.setForeground(new Color(0, 0, 0));
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBackground(new Color(192, 192, 192));
		textField_3.setForeground(new Color(0, 0, 0));
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBackground(new Color(192, 192, 192));
		textField_4.setForeground(new Color(0, 0, 0));
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBackground(new Color(192, 192, 192));
		textField_5.setForeground(new Color(0, 0, 0));
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		JRadioButton rdbtnCommercial = new JRadioButton("Male");
		rdbtnCommercial.setBackground(SystemColor.activeCaption);
		rdbtnCommercial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			c="Male";
			t=1;
			
			}
		});
		buttonGroup.add(rdbtnCommercial);
		contentPane.add(rdbtnCommercial);
		
		JRadioButton rdbtnHome = new JRadioButton("Female");
		rdbtnHome.setBackground(SystemColor.activeCaption);
		rdbtnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			c="Female";
		t=0;
			}
		});
		buttonGroup.add(rdbtnHome);
		contentPane.add(rdbtnHome);
		
		JButton btnInsertRecord = new JButton("Submit");
		btnInsertRecord.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				information obj=new information();
				obj.insert(textField.getText(),textField_1.getText(),textField_2.getText(),textField_3.getText(),textField_4.getText(),textField_5.getText());
			}
		});
		contentPane.add(btnInsertRecord);
		
		JLabel lblConsumerNo = new JLabel("Car No#");
		lblConsumerNo.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		contentPane.add(lblConsumerNo);
		
		JLabel lblConsumerName = new JLabel("Token No#");
		lblConsumerName.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		contentPane.add(lblConsumerName);
		
		JLabel lblFatherName = new JLabel("Date");
		lblFatherName.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		contentPane.add(lblFatherName);
		
		JLabel lblAddress = new JLabel("Time");
		lblAddress.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		contentPane.add(lblAddress);
		
		JLabel lblCnicNo = new JLabel("Day");
		lblCnicNo.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		contentPane.add(lblCnicNo);
		
		
		JLabel lblConnectionType = new JLabel("Gender");
		lblConnectionType.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		contentPane.add(lblConnectionType);
		
		comboBox = new JComboBox();
		comboBox.setBackground(SystemColor.activeCaption);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Dhaka", "Cumilla", "Chattogram", "Rajshahi", "Sylhet", "Barisal"}));
		contentPane.add(comboBox);
		
		JLabel lblDistrict = new JLabel("District");
		lblDistrict.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		contentPane.add(lblDistrict);
		
		JLabel lblThisFormIs = new JLabel("Enter Data");
		lblThisFormIs.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		contentPane.add(lblThisFormIs);
		
		JButton btnCancel = new JButton("Back");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				form_selectinfo obj=new form_selectinfo();
				obj.setVisible(true);
				dispose();
			}
		});
		contentPane.add(btnCancel);
		
		JButton btnCancel_1 = new JButton("Cancel");
		btnCancel_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		contentPane.add(btnCancel_1);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(""));
		contentPane.add(label);
	}
}
