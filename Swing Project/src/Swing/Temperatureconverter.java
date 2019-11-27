package Swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Temperatureconverter {

	private JFrame frame;
	private JTextField textField;
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
					Temperatureconverter window = new Temperatureconverter();
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
	public Temperatureconverter() {
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
		textField.setBounds(178, 34, 114, 40);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblDegrees = new JLabel("Degrees");
		lblDegrees.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblDegrees.setBounds(55, 32, 78, 40);
		frame.getContentPane().add(lblDegrees);
		
		JLabel lblResult = new JLabel("Result = ");
		lblResult.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblResult.setBounds(109, 132, 92, 27);
		frame.getContentPane().add(lblResult);
		
		JLabel label = new JLabel("");
		label.setBounds(211, 132, 46, 27);
		frame.getContentPane().add(label);
		
		JButton btnToCelsius = new JButton("To Celsius");
		btnToCelsius.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Number=Double.parseDouble(textField.getText());
				result=((Number - 32) * 5/9);
				ans=String.format("%.2f",result);
				label.setText(ans);
				 
			}
		});
		btnToCelsius.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnToCelsius.setBounds(37, 193, 106, 23);
		frame.getContentPane().add(btnToCelsius);
		
		JButton btnToFahrenheit = new JButton("To Fahrenheit");
		btnToFahrenheit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Number=Double.parseDouble(textField.getText());
				result=((Number * 9/5) + 32);
				ans=String.format("%.2f",result);
				label.setText(ans);
			}
		});
		btnToFahrenheit.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnToFahrenheit.setBounds(219, 193, 106, 23);
		frame.getContentPane().add(btnToFahrenheit);
	}

}
