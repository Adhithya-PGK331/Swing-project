package Swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Label;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class Heightnweightconverter {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	double Number1;
	double Number2;
	double result1;
	double result2;
	String ans1;
	String ans2;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Heightnweightconverter window = new Heightnweightconverter();
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
	public Heightnweightconverter() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().setForeground(new Color(0, 0, 0));
		frame.setForeground(Color.GRAY);
		frame.setBounds(100, 100, 450, 422);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblHeight = new JLabel("Height:");
		lblHeight.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblHeight.setBounds(45, 139, 46, 14);
		frame.getContentPane().add(lblHeight);
		
		JLabel lblWeight = new JLabel("Weight:");
		lblWeight.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblWeight.setBounds(45, 199, 46, 14);
		frame.getContentPane().add(lblWeight);
		
		JLabel lblUsMeasurement = new JLabel("US Measurement");
		lblUsMeasurement.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblUsMeasurement.setBounds(112, 82, 126, 33);
		frame.getContentPane().add(lblUsMeasurement);
		
		JLabel lblMetric = new JLabel("Metric");
		lblMetric.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblMetric.setBounds(311, 91, 46, 14);
		frame.getContentPane().add(lblMetric);

		JLabel label = new JLabel("");
		label.setBounds(311, 140, 46, 14);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setBounds(311, 199, 46, 14);
		frame.getContentPane().add(label_1);
		
		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Number1=Double.parseDouble(textField.getText());
				Number2=Double.parseDouble(textField_1.getText());
				result1=(Number1/3.371);
				result2=(Number2/2.215);
				ans1=String.format("%.2f",result1);
				label.setText(ans1);
				ans2=String.format("%.2f",result2);
				label_1.setText(ans2);
	}
		});
		btnOk.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnOk.setBounds(113, 267, 89, 23);
		frame.getContentPane().add(btnOk);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
				textField_1.setText(null);

			}
		});
		btnCancel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnCancel.setBounds(239, 268, 89, 23);
		frame.getContentPane().add(btnCancel);
		
		JLabel lblHelp = new JLabel("Help");
		lblHelp.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblHelp.setBounds(10, 56, 46, 14);
		frame.getContentPane().add(lblHelp);
		
		JLabel lblAbout = new JLabel("About");
		lblAbout.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblAbout.setBounds(45, 56, 46, 14);
		frame.getContentPane().add(lblAbout);
		
		textField = new JTextField();
		textField.setBounds(112, 131, 126, 33);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(112, 191, 126, 33);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JTextArea txtrHeightAndWeight = new JTextArea();
		txtrHeightAndWeight.setFont(new Font("Calibri Light", Font.BOLD, 15));
		txtrHeightAndWeight.setForeground(Color.WHITE);
		txtrHeightAndWeight.setBackground(Color.BLUE);
		txtrHeightAndWeight.setText("           Height and Weight Converter v.Beta 0.12.1");
		txtrHeightAndWeight.setBounds(0, 0, 434, 23);
		frame.getContentPane().add(txtrHeightAndWeight);
		
	}
}
