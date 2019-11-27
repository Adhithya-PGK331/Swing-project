package Swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class First {

	private JFrame frame;
	private JLabel lblPassword;
	private JButton btnSignup;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					First window = new First();
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
	public First() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Login page");
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().setForeground(Color.BLUE);
		frame.getContentPane().setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 18));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnLogin = new JButton(new ImageIcon("C://Users/USER/Downloads/log.jpg"));
		
		
		btnLogin.setBackground(new Color(240, 240, 240));
		btnLogin.setForeground(Color.BLUE);
		btnLogin.setFont(new Font("Calibri Light", Font.BOLD, 24));
		btnLogin.setBounds(22, 144, 113, 107);
		frame.getContentPane().add(btnLogin);
		
		JLabel lblUserName = new JLabel("  User name");
		lblUserName.setForeground(Color.BLACK);
		lblUserName.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblUserName.setBounds(22, 9, 103, 20);
		frame.getContentPane().add(lblUserName);
		
		lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblPassword.setBounds(32, 43, 93, 14);
		frame.getContentPane().add(lblPassword);
		
		JCheckBox chckbxRemember = new JCheckBox("Remember");
		chckbxRemember.setBounds(263, 79, 78, 23);
		frame.getContentPane().add(chckbxRemember);
		
		btnSignup = new JButton(new ImageIcon("C:\\Users/USER/Downloads/reg.jpg"));
		btnSignup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnSignup.setBounds(263, 144, 113, 107);
		frame.getContentPane().add(btnSignup);
		
		textField = new JTextField();
		textField.setBounds(263, 11, 78, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JPasswordField();
		textField_1.setBounds(263, 42, 78, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
	}
}
