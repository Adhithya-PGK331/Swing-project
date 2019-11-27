package Swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class Hotelmanagementsystem {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Hotelmanagementsystem window = new Hotelmanagementsystem();
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
	public Hotelmanagementsystem() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 936, 602);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.setBounds(10, 11, 900, 75);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Hotel Management System");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblNewLabel.setBounds(103, 11, 751, 53);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_1.setBounds(10, 97, 383, 183);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblChickenBurger = new JLabel("Chicken Burger");
		lblChickenBurger.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblChickenBurger.setBounds(10, 11, 93, 33);
		panel_1.add(lblChickenBurger);
		
		JLabel lblChickenBurgerMeal = new JLabel("Chicken Burger Meal");
		lblChickenBurgerMeal.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblChickenBurgerMeal.setBounds(10, 42, 115, 33);
		panel_1.add(lblChickenBurgerMeal);
		
		JLabel lblCheeseBurger = new JLabel("Cheese Burger");
		lblCheeseBurger.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCheeseBurger.setBounds(10, 70, 93, 33);
		panel_1.add(lblCheeseBurger);
		
		JLabel lblDrink = new JLabel("Drink");
		lblDrink.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDrink.setBounds(10, 104, 93, 33);
		panel_1.add(lblDrink);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(10, 131, 64, 20);
		panel_1.add(comboBox);
		
		JCheckBox chckbxHomeDelivery = new JCheckBox("Home Delivery");
		chckbxHomeDelivery.setBounds(6, 153, 97, 23);
		panel_1.add(chckbxHomeDelivery);
		
		textField = new JTextField();
		textField.setBounds(190, 17, 86, 20);
		panel_1.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(190, 48, 86, 20);
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(190, 76, 86, 20);
		panel_1.add(textField_2);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(Color.BLACK);
		separator.setBounds(10, 101, 363, 2);
		panel_1.add(separator);
		
		JLabel lblQty = new JLabel("Qty");
		lblQty.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblQty.setBounds(190, 113, 46, 14);
		panel_1.add(lblQty);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(190, 131, 86, 20);
		panel_1.add(textField_3);
		
		JCheckBox chckbxTax = new JCheckBox("Tax");
		chckbxTax.setBounds(190, 153, 97, 23);
		panel_1.add(chckbxTax);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_2.setBounds(403, 100, 310, 180);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(10, 291, 383, 113);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblCostOfDrinks = new JLabel("Cost of Drinks");
		lblCostOfDrinks.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCostOfDrinks.setBounds(10, 11, 118, 20);
		panel_3.add(lblCostOfDrinks);
		
		textField_4 = new JTextField();
		textField_4.setBounds(192, 11, 86, 20);
		panel_3.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(192, 42, 86, 20);
		panel_3.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(192, 73, 86, 20);
		panel_3.add(textField_6);
		
		JLabel lblCostOfMeal = new JLabel("Cost of Meal");
		lblCostOfMeal.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCostOfMeal.setBounds(10, 45, 118, 20);
		panel_3.add(lblCostOfMeal);
		
		JLabel lblCostOfDelivery = new JLabel("Cost of Delivery");
		lblCostOfDelivery.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCostOfDelivery.setBounds(10, 76, 118, 20);
		panel_3.add(lblCostOfDelivery);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(403, 291, 310, 113);
		frame.getContentPane().add(panel_4);
		panel_4.setLayout(null);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(723, 103, 187, 301);
		frame.getContentPane().add(panel_5);
		panel_5.setLayout(null);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBounds(10, 415, 900, 138);
		frame.getContentPane().add(panel_6);
		panel_6.setLayout(null);
	}
}
