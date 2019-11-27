package Swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.AbstractButton;
import javax.swing.ComboBoxEditor;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextPane;

public class ScientificCalculator {

	private JFrame frame;
	private JTextField textField;
	double num1;double num2;
	double result;
	String op;
	double pi=3.14159;
	String ans;
	double US=302.96;
	double INDIA=100.68;double CHINA=343.22;
	private JTextField textField_1;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ScientificCalculator window = new ScientificCalculator();
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
	public ScientificCalculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBackground(new Color(240, 240, 240));
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.setBounds(100, 100, 891, 492);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 593, 46);
		frame.getContentPane().add(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		

		JMenuItem mntmStandard = new JMenuItem("Standard");
		mntmStandard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.setBounds(100, 100, 330, 550);
				textField.setBounds(10, 27, 285, 56);
			}
		});
		

		JMenuItem mntmScientific = new JMenuItem("Scientific\r\n");
		mntmScientific.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setBounds(100, 100, 635, 492);
				textField.setBounds(100, 100, 450, 56);

			}
		});
		mnFile.add(mntmScientific);
		mnFile.add(mntmStandard);
		

		JMenuItem mntmUnitConversion = new JMenuItem("Unit Conversion");
		mntmUnitConversion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					frame.setBounds(100, 100, 891, 492);
					textField.setBounds(100, 100, 450, 56);

						}
			
		});
		mnFile.add(mntmUnitConversion);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mntmExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame =new JFrame("Exit");
				if(JOptionPane.showConfirmDialog(frame,"Confirm","Exit",JOptionPane.YES_OPTION)==JOptionPane.YES_NO_OPTION) 
				{System.exit(0);
				}
				
			}
		});
		mnFile.add(mntmExit);
		
		textField = new JTextField();
		textField.setBounds(10, 108, 583, 85);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton button_34 = new JButton("0");
		button_34.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_34.getText();
				textField.setText(Number);
			}
		});
		button_34.setBounds(10, 404, 104, 37);
		frame.getContentPane().add(button_34);
		
		JButton button_36 = new JButton(".");
		button_36.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"." );
			}
		});
		button_36.setBounds(137, 404, 46, 37);
		frame.getContentPane().add(button_36);
		
		JButton button_45 = new JButton("-");
		button_45.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="-";
			}
		});
		button_45.setBounds(193, 356, 46, 37);
		frame.getContentPane().add(button_45);
		
		JButton button_46 = new JButton("3");
		button_46.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_46.getText();
				textField.setText(Number);
			}
		});
		button_46.setBounds(137, 356, 46, 37);
		frame.getContentPane().add(button_46);
		
		JButton button_47 = new JButton("2");
		button_47.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_47.getText();
				textField.setText(Number);
			}
		});
		button_47.setBounds(68, 356, 59, 37);
		frame.getContentPane().add(button_47);
		
		JButton button_48 = new JButton("1");
		button_48.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_48.getText();
				textField.setText(Number);
			}
		});
		button_48.setBounds(10, 356, 46, 37);
		frame.getContentPane().add(button_48);
		
		JButton button = new JButton("4");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button.getText();
				textField.setText(Number);
			}
		});
		button.setBounds(10, 310, 46, 37);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("5");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_1.getText();
				textField.setText(Number);
			}
		});
		button_1.setBounds(68, 310, 59, 37);
		frame.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("6");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_2.getText();
				textField.setText(Number);
			}
		});
		button_2.setBounds(137, 310, 46, 37);
		frame.getContentPane().add(button_2);
		
		JButton button_3 = new JButton("*");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="*";
			}
		});
		button_3.setBounds(193, 308, 46, 37);
		frame.getContentPane().add(button_3);
		
		JButton button_9 = new JButton("7");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_9.getText();
				textField.setText(Number);
			}
		});
		button_9.setBounds(10, 266, 46, 37);
		frame.getContentPane().add(button_9);
		
		JButton button_10 = new JButton("8");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_10.getText();
				textField.setText(Number);
			}
		});
		button_10.setBounds(68, 266, 59, 37);
		frame.getContentPane().add(button_10);
		
		JButton button_11 = new JButton("9");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_11.getText();
				textField.setText(Number);
			}
		});
		button_11.setBounds(137, 266, 46, 37);
		frame.getContentPane().add(button_11);
		
		JButton button_12 = new JButton("/");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="/";
			}
		});
		button_12.setBounds(193, 266, 46, 37);
		frame.getContentPane().add(button_12);
		
		JButton button_18 = new JButton("<-");
		button_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String b=null;
				if(textField.getText().length()>0)
				{
					StringBuilder strB=new StringBuilder(textField.getText());
					strB.deleteCharAt(textField.getText().length()-1);
					b=strB.toString();
					textField.setText(b);
					
				}
			}
		});
		button_18.setBounds(10, 218, 46, 37);
		frame.getContentPane().add(button_18);
		
		JButton btnCe = new JButton("CE");
		btnCe.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnCe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);

			}
		});
		btnCe.setBounds(68, 218, 59, 37);
		frame.getContentPane().add(btnCe);
		
		JButton btnC_1 = new JButton("C");
		btnC_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                textField.setText(null);

			}
		});
		btnC_1.setBounds(137, 218, 46, 37);
		frame.getContentPane().add(btnC_1);
		
		JButton button_21 = new JButton("+-");
		button_21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				ans=String.format("%.2f", num1);
                textField.setText("-"+ans);

			}
		});
		button_21.setBounds(193, 218, 46, 37);
		frame.getContentPane().add(button_21);
		
		JButton btnL = new JButton("Log");
		btnL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
                num1=Math.log(num1);
                textField.setText(String.valueOf(num1));
			}
		});
		btnL.setBounds(317, 218, 60, 37);
		frame.getContentPane().add(btnL);
		
		JButton btnSin = new JButton("Sin");
		btnSin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				  num1=Double.parseDouble(textField.getText());
	                num1=Math.sin(num1);
	                textField.setText(String.valueOf(num1));
	           
			}
		});
		btnSin.setBounds(387, 218, 70, 37);
		frame.getContentPane().add(btnSin);
		
		JButton btnSinh = new JButton("Sinh");
		btnSinh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				  num1=Double.parseDouble(textField.getText());
	                num1=Math.sinh(num1);
	                textField.setText(String.valueOf(num1));
	           
			}
		});
		btnSinh.setBounds(467, 218, 72, 37);
		frame.getContentPane().add(btnSinh);
		
		JButton btnMod = new JButton("Mod");
		btnMod.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
                textField.setText(null);
                op="Mod";
			}
		});
		btnMod.setBounds(549, 218, 70, 37);
		frame.getContentPane().add(btnMod);
		
		JButton btnCos = new JButton("Cos");
		btnCos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				  num1=Double.parseDouble(textField.getText());
	                num1=Math.cos(num1);
	                textField.setText(String.valueOf(num1));
	           
			}
		});
		btnCos.setBounds(387, 266, 70, 37);
		frame.getContentPane().add(btnCos);
		
		JButton btnCosh = new JButton("Cosh");
		btnCosh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				  num1=Double.parseDouble(textField.getText());
	                num1=Math.cosh(num1);
	                textField.setText(String.valueOf(num1));
	           
			}
		});
		btnCosh.setBounds(469, 266, 70, 37);
		frame.getContentPane().add(btnCosh);
		
		JButton btnInx = new JButton("lnx");
		btnInx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
                num1=Math.pow(2,num1);
                textField.setText(String.valueOf(num1));
			}
		});
		btnInx.setBounds(549, 266, 70, 37);
		frame.getContentPane().add(btnInx);
		
		JButton btnTan = new JButton("Tan");
		btnTan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				  num1=Double.parseDouble(textField.getText());
	                num1=Math.tan(num1);
	                textField.setText(String.valueOf(num1));
	           
			}
		});
		btnTan.setBounds(387, 310, 70, 37);
		frame.getContentPane().add(btnTan);
		
		JButton btnTanh = new JButton("Tanh");
		btnTanh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				  num1=Double.parseDouble(textField.getText());
	                num1=Math.tanh(num1);
	                textField.setText(String.valueOf(num1));
	           
			}
		});
		btnTanh.setBounds(469, 310, 70, 37);
		frame.getContentPane().add(btnTanh);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                textField.setText(null);

			}
		});
		btnC.setBounds(549, 310, 70, 37);
		frame.getContentPane().add(btnC);
		
		JButton btnCbr = new JButton("Cbr");
		btnCbr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
                textField.setText("");

				op="cbr";

			}
		});
		btnCbr.setBounds(387, 356, 70, 37);
		frame.getContentPane().add(btnCbr);
		
		JButton btnRund = new JButton("Round");
		btnRund.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
                num1=Math.round(num1);
                textField.setText(String.valueOf(num1));
			}
		});
		btnRund.setBounds(469, 356, 70, 37);
		frame.getContentPane().add(btnRund);
		
		JButton btnpi = new JButton("2pi");
		btnpi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
                textField.setText("");
				num1=2*pi*num1;
                textField.setText(String.valueOf(num1));

			}
		});
		btnpi.setBounds(549, 356, 70, 37);
		frame.getContentPane().add(btnpi);
		
		JButton btnBin = new JButton("Bin");
		btnBin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a=Integer.parseInt(textField.getText());
						textField.setText(Integer.toBinaryString(a));
			}
		});
		btnBin.setBounds(387, 404, 70, 37);
		frame.getContentPane().add(btnBin);
		
		JButton btnHex = new JButton("Hex");
		btnHex.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				int a=Integer.parseInt(textField.getText());
				textField.setText(Integer.toHexString(a));}
		});
		btnHex.setBounds(469, 404, 70, 37);
		frame.getContentPane().add(btnHex);
		
		JButton btnOctane = new JButton("Oct..");
		btnOctane.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a=Integer.parseInt(textField.getText());
				textField.setText(Integer.toOctalString(a));
			}
		});
		btnOctane.setBounds(549, 404, 70, 37);
		frame.getContentPane().add(btnOctane);
		
		JButton button_7 = new JButton("=");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ans;
				num2=Double.parseDouble(textField.getText());
				if(op=="+") {
					result=num1 + num2;
					ans=String.format("%.2f",result);
					textField.setText(ans);
				}
				if(op=="-") {
					result=num1 - num2;
					ans=String.format("%.2f",result);
					textField.setText(ans);
				}
				
				if(op=="*") {
					result=num1 * num2;
					ans=String.format("%.2f",result);
					textField.setText(ans);
				}
				
				if(op=="/") {
					result=num1 / num2;
					ans=String.format("%.2f",result);
					textField.setText(ans);
				}
				if(op=="%") {
					result=num1 % num2;
					ans=String.format("%.2f",result);
					textField.setText(ans);
				}
				if(op=="Mod") {
					result=num1 % num2;
					ans=String.format("%.2f",result);
					textField.setText(ans);
				}
				if(op=="x^y") {
					result=Math.pow(num1,num2);
					ans=String.format("%.2f",result);
					textField.setText(ans);
				}
				if(op=="cbr") {
					result=(num1/num2)*100;
					ans=String.format("%.2f",result);
					textField.setText(ans);
				}
				if(op=="1/x") {
					result=1/num1;
					ans=String.format("%.2f",result);
					textField.setText(ans);
				}
                

				
			}
		});
		button_7.setBounds(247, 356, 60, 85);
		frame.getContentPane().add(button_7);
		
		JButton button_6 = new JButton("+");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="+";
			}
		});
		button_6.setBounds(193, 404, 46, 37);
		frame.getContentPane().add(button_6);
		
		JPanel panel = new JPanel();
		panel.setForeground(Color.BLACK);
		panel.setBackground(Color.WHITE);
		panel.setBounds(639, 51, 201, 392);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		textField_1 = new JTextField();
		textField_1.setBounds(39, 207, 128, 32);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"US", "INDIA", "CHINA"}));
		comboBox.setToolTipText("");
		comboBox.setBounds(39, 127, 128, 20);
		panel.add(comboBox);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setBackground(Color.YELLOW);
		lblNewLabel.setBounds(65, 271, 68, 20);
		panel.add(lblNewLabel);
		
		JButton btnConvert = new JButton("Convert");
		btnConvert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double bp=Double.parseDouble(textField_1.getText());
				if(comboBox.getSelectedItem().equals("INDIA"))
				{
					String c=String.format("Rs %.2f",bp*INDIA);
					lblNewLabel.setText(c);
				}
				if(comboBox.getSelectedItem().equals("US"))
				{
					String c=String.format("Rs %.2f",bp*US);
					lblNewLabel.setText(c);
				}
				if(comboBox.getSelectedItem().equals("CHINA"))
				{
					String c=String.format("Rs %.2f",bp*CHINA);
					lblNewLabel.setText(c);
				}

			}
		});
		btnConvert.setBounds(10, 345, 89, 23);
		panel.add(btnConvert);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_1.setText(null);
				lblNewLabel.setText(null);
			}
		});
		btnClear.setBounds(109, 345, 89, 23);
		panel.add(btnClear);
		
		JLabel lblCurrencyConverter = new JLabel("CURRENCY CONVERTER");
		lblCurrencyConverter.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblCurrencyConverter.setBounds(10, 52, 188, 32);
		panel.add(lblCurrencyConverter);
		
		
		
		
		JButton btnPi = new JButton("pi");
		btnPi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
                textField.setText("");
				num1=num1*pi;
                textField.setText(String.valueOf(num1));

			}
		});
		btnPi.setBounds(317, 266, 60, 37);
		frame.getContentPane().add(btnPi);
		
		JButton btnXy = new JButton("x^y");
		btnXy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
                textField.setText("");
				op="x^y";
				}
		});
		btnXy.setBounds(317, 310, 60, 37);
		frame.getContentPane().add(btnXy);
		
		JButton btnX = new JButton("x^2");
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
                textField.setText("");
                num1=num1*num1;
                textField.setText(String.valueOf(num1));

			}
		});
		btnX.setBounds(317, 356, 60, 37);
		frame.getContentPane().add(btnX);
		
		JButton btnX_1 = new JButton("x^3");
		btnX_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
                textField.setText("");
                num1=num1*num1*num1;
                textField.setText(String.valueOf(num1));
			}
		});
		btnX_1.setBounds(317, 404, 60, 37);
		frame.getContentPane().add(btnX_1);
		
		JButton btnSqrt = new JButton("Sqrt");
		btnSqrt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
                num1=Math.sqrt(num1);
                textField.setText(String.valueOf(num1));
			}
		});
		btnSqrt.setBounds(247, 218, 60, 37);
		frame.getContentPane().add(btnSqrt);
		
		JButton button_13 = new JButton("%");
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
                textField.setText(null);
                op="%";
			}
		});
		button_13.setBounds(247, 266, 60, 37);
		frame.getContentPane().add(button_13);
		
		JButton btnx = new JButton("1/x");
		btnx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
                textField.setText("");
                num1=1/num1;
                textField.setText(String.valueOf(num1));

			}
		});
		btnx.setBounds(247, 310, 60, 37);
		frame.getContentPane().add(btnx);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.BLACK);
		panel_1.setBounds(629, 36, 220, 418);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
	}
}
