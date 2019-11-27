package Swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Temperatureconverter2 {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	double Number;
	double result;
	String ans;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Temperatureconverter2 window = new Temperatureconverter2();
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
	public Temperatureconverter2() {
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
		
		textField = new JTextField();
		textField.setBounds(193, 11, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblInput = new JLabel("Input");
		lblInput.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblInput.setBounds(143, 10, 64, 20);
		frame.getContentPane().add(lblInput);
		
		JLabel lblInputScale = new JLabel("Input Scale");
		lblInputScale.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblInputScale.setBounds(10, 44, 94, 20);
		frame.getContentPane().add(lblInputScale);
		
		
		JLabel lblOutputScale = new JLabel("Output Scale");
		lblOutputScale.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblOutputScale.setBounds(288, 47, 109, 14);
		frame.getContentPane().add(lblOutputScale);
		
		JRadioButton rdbtnCelcius = new JRadioButton("Celcius");
		rdbtnCelcius.setFont(new Font("Tahoma", Font.BOLD, 11));
		rdbtnCelcius.setBounds(10, 84, 109, 23);
		frame.getContentPane().add(rdbtnCelcius);
		rdbtnCelcius.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) {
				Number=Double.parseDouble(textField.getText());
				
			}
		});
		
		JRadioButton rdbtnFahrenheit = new JRadioButton("Fahrenheit");
		rdbtnFahrenheit.setFont(new Font("Tahoma", Font.BOLD, 11));
		rdbtnFahrenheit.setBounds(288, 133, 109, 23);
		frame.getContentPane().add(rdbtnFahrenheit);
		rdbtnFahrenheit.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) {
				Number=Double.parseDouble(textField.getText());
				result=((Number - 32) * 5/9);
				ans=String.format("%.2f",result);
				textField_1.setText(ans);
			}
		});
		
		JRadioButton rdbtnKelvin = new JRadioButton("Kelvin");
		rdbtnKelvin.setFont(new Font("Tahoma", Font.BOLD, 11));
		rdbtnKelvin.setBounds(288, 183, 109, 23);
		frame.getContentPane().add(rdbtnKelvin);
		rdbtnKelvin.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) {
				Number=Double.parseDouble(textField.getText());
				result=(Number + 273.15 );
				ans=String.format("%.2f",result);
				textField_1.setText(ans);
			}
		});
		
		JRadioButton rdbtnCelcius_1 = new JRadioButton("Celcius");
		rdbtnCelcius_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		rdbtnCelcius_1.setBounds(288, 84, 109, 23);
		frame.getContentPane().add(rdbtnCelcius_1);
		rdbtnKelvin.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) {
				Number=Double.parseDouble(textField.getText());
				result=((Number  - 32) * 5/9 );
				ans=String.format("%.2f",result);
				textField_1.setText(ans);
			}
		});
		JRadioButton rdbtnFahrenheit_1 = new JRadioButton("Fahrenheit");
		rdbtnFahrenheit_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		rdbtnFahrenheit_1.setBounds(10, 133, 109, 23);
		frame.getContentPane().add(rdbtnFahrenheit_1);
		rdbtnKelvin.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) {
				Number=Double.parseDouble(textField.getText());
				result=((Number  *9/5) + 32 );
				ans=String.format("%.2f",result);
				textField_1.setText(ans);
			}
		});
		JRadioButton rdbtnKelvin_1 = new JRadioButton("Kelvin");
		rdbtnKelvin_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		rdbtnKelvin_1.setBounds(10, 183, 109, 23);
		frame.getContentPane().add(rdbtnKelvin_1);
		rdbtnKelvin.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) {
				Number=Double.parseDouble(textField.getText());
				result=(Number   + 273.15);
				ans=String.format("%.2f",result);
				textField_1.setText(ans);
			}
		});
		
		JLabel lblOutput = new JLabel("Output");
		lblOutput.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblOutput.setBounds(143, 223, 46, 20);
		frame.getContentPane().add(lblOutput);
		
		textField_1 = new JTextField();
		textField_1.setBounds(193, 223, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		
	}
}
