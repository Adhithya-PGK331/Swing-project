package Swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Bmi {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	double Number1;
	double Number2;
	double result;
	String ans;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bmi window = new Bmi();
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
	public Bmi() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBackground(Color.GREEN);
		frame.setBounds(100, 100, 450, 442);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.GREEN);
		panel.setBounds(10, 0, 414, 62);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblBodyMassIndex = new JLabel("Body Mass Index");
		lblBodyMassIndex.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblBodyMassIndex.setBackground(Color.GREEN);
		lblBodyMassIndex.setBounds(110, 11, 345, 40);
		panel.add(lblBodyMassIndex);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.GREEN);
		panel_1.setBounds(10, 73, 414, 202);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblHeightm = new JLabel("Height(m):");
		lblHeightm.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblHeightm.setBounds(32, 11, 91, 24);
		panel_1.add(lblHeightm);
		
		JLabel lblWeightkg = new JLabel("Weight(kg):");
		lblWeightkg.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblWeightkg.setBounds(32, 46, 91, 24);
		panel_1.add(lblWeightkg);
		
		JLabel lblBmi = new JLabel("BMI");
		lblBmi.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblBmi.setBounds(32, 81, 77, 35);
		panel_1.add(lblBmi);
		JLabel label = new JLabel("");
		label.setBackground(Color.ORANGE);
		label.setBounds(118, 94, 46, 22);
		panel_1.add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setForeground(Color.RED);
		label_1.setBounds(218, 94, 157, 32);
		panel_1.add(label_1);
		
		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Number1 = Double.parseDouble(textField.getText());
				Number2=Double.parseDouble(textField_1.getText());
				result=(Number2/(Number1*Number1));
				ans=String.format("%.2f",result);
				label.setText(ans);
				if(result<18.5) {
				label_1.setText("Under Weight");
				}
				else if(result>=18.5 && result<=24.9) {
					label_1.setText("Normal Weight");
				}
				else if(result>=25 && result<=29.9) {
					label_1.setText("Over Weight");
				}
				else {
					label_1.setText("Obese");
				}
			}
		});
		btnCalculate.setBounds(42, 150, 89, 23);
		panel_1.add(btnCalculate);

		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
				textField_1.setText(null);
				label.setText(null);
				label_1.setText(null);
			}
		});
		btnClear.setBounds(162, 150, 77, 23);
		panel_1.add(btnClear);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnExit.setBounds(269, 150, 77, 23);
		panel_1.add(btnExit);
		
		textField = new JTextField();
		textField.setBounds(218, 11, 109, 28);
		panel_1.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(218, 50, 109, 24);
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.GREEN);
		panel_2.setBounds(10, 292, 414, 112);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
	}
}
