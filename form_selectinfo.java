package Home;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Home.select;

import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class form_selectinfo extends JFrame {

	private JPanel contentPane;
	public static JTextField textField;
	public static JTextField textField_1;
	public static JTextField textField_2;
	public static JTextField textField_3;
	public static JTextField textField_4;
	public static JTextField textField_5;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					form_selectinfo frame = new form_selectinfo();
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
	public form_selectinfo() {
		setTitle("Vehicle Allocation System");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 400);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(187, 11, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(187, 48, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(187, 79, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(187, 110, 86, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(187, 141, 86, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(187, 176, 86, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		
	
		
		JLabel lblConsumerNo = new JLabel("Car ID#");
		lblConsumerNo.setBounds(21, 17, 119, 14);
		contentPane.add(lblConsumerNo);
		
		JLabel lblConsumerName = new JLabel("Token No#");
		lblConsumerName.setBounds(21, 54, 109, 14);
		contentPane.add(lblConsumerName);
		
		JLabel lblFatherName = new JLabel("Date");
		lblFatherName.setBounds(21, 85, 119, 14);
		contentPane.add(lblFatherName);
		
		JLabel lblAddress = new JLabel("Time");
		lblAddress.setBounds(21, 113, 109, 17);
		contentPane.add(lblAddress);
		
		JLabel lblCnicNo = new JLabel("Day");
		lblCnicNo.setBounds(21, 147, 119, 14);
		contentPane.add(lblCnicNo);
		
		
		
		JRadioButton rdbtnCommercial = new JRadioButton("Male");
		buttonGroup.add(rdbtnCommercial);
		rdbtnCommercial.setBounds(164, 220, 109, 23);
		contentPane.add(rdbtnCommercial);
		
		JRadioButton rdbtnHome = new JRadioButton("Female");
		buttonGroup.add(rdbtnHome);
		rdbtnHome.setBounds(294, 220, 109, 23);
		contentPane.add(rdbtnHome);
		
		JLabel lblConnectionType = new JLabel("Gender");
		lblConnectionType.setBounds(21, 224, 119, 14);
		contentPane.add(lblConnectionType);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				tab obj=new tab();
				obj.setVisible(true);
				dispose();
				
			}
		});
		btnBack.setBounds(217, 300, 102, 20);
		contentPane.add(btnBack);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		btnCancel.setBounds(97, 300, 89, 23);
		contentPane.add(btnCancel);
	}
}
