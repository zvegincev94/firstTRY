package net.zvegincev;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class LB1 {

	private JFrame frame;
	private JTextField textField;
	private JTextField txtY;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	private JTextField textField_25;
	private JTextField textField_26;
	private JTextField textField_27;
	private JTextField textField_28;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LB1 window = new LB1();
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
	public LB1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 635, 311);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblX = new JLabel("X1:");
		lblX.setBounds(10, 8, 16, 14);
		frame.getContentPane().add(lblX);
		
		JLabel lblY = new JLabel("Y1:");
		lblY.setBounds(10, 33, 16, 14);
		frame.getContentPane().add(lblY);
		
		textField = new JTextField();
		textField.setText("\u0412\u0432\u0435\u0434\u0438\u0442\u0435 \u0425");
		textField.setBounds(36, 5, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		txtY = new JTextField();
		txtY.setText("\u0412\u0432\u0435\u0434\u0438\u0442\u0435 Y");
		txtY.setBounds(36, 30, 86, 20);
		frame.getContentPane().add(txtY);
		txtY.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setText("\u0412\u0432\u0435\u0434\u0438\u0442\u0435 Y");
		textField_1.setColumns(10);
		textField_1.setBounds(158, 30, 86, 20);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setText("\u0412\u0432\u0435\u0434\u0438\u0442\u0435 \u0425");
		textField_2.setColumns(10);
		textField_2.setBounds(158, 5, 86, 20);
		frame.getContentPane().add(textField_2);
		
		JLabel lblX_1 = new JLabel("X2:");
		lblX_1.setBounds(132, 8, 16, 14);
		frame.getContentPane().add(lblX_1);
		
		JLabel lblY_1 = new JLabel("Y2:");
		lblY_1.setBounds(132, 33, 16, 14);
		frame.getContentPane().add(lblY_1);
		
		textField_3 = new JTextField();
		textField_3.setText("\u0412\u0432\u0435\u0434\u0438\u0442\u0435 Y");
		textField_3.setColumns(10);
		textField_3.setBounds(280, 30, 86, 20);
		frame.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setText("\u0412\u0432\u0435\u0434\u0438\u0442\u0435 \u0425");
		textField_4.setColumns(10);
		textField_4.setBounds(280, 5, 86, 20);
		frame.getContentPane().add(textField_4);
		
		JLabel lblX_2 = new JLabel("X3:");
		lblX_2.setBounds(254, 8, 16, 14);
		frame.getContentPane().add(lblX_2);
		
		JLabel lblY_2 = new JLabel("Y3:");
		lblY_2.setBounds(254, 33, 16, 14);
		frame.getContentPane().add(lblY_2);
		
		textField_5 = new JTextField();
		textField_5.setText("\u0412\u0432\u0435\u0434\u0438\u0442\u0435 Y");
		textField_5.setColumns(10);
		textField_5.setBounds(402, 30, 86, 20);
		frame.getContentPane().add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setText("\u0412\u0432\u0435\u0434\u0438\u0442\u0435 \u0425");
		textField_6.setColumns(10);
		textField_6.setBounds(402, 5, 86, 20);
		frame.getContentPane().add(textField_6);
		
		JLabel lblX_3 = new JLabel("X4:");
		lblX_3.setBounds(376, 8, 16, 14);
		frame.getContentPane().add(lblX_3);
		
		JLabel lblY_3 = new JLabel("Y4:");
		lblY_3.setBounds(376, 33, 16, 14);
		frame.getContentPane().add(lblY_3);
		
		textField_7 = new JTextField();
		textField_7.setText("\u0412\u0432\u0435\u0434\u0438\u0442\u0435 Y");
		textField_7.setColumns(10);
		textField_7.setBounds(524, 33, 86, 20);
		frame.getContentPane().add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setText("\u0412\u0432\u0435\u0434\u0438\u0442\u0435 \u0425");
		textField_8.setColumns(10);
		textField_8.setBounds(524, 8, 86, 20);
		frame.getContentPane().add(textField_8);
		
		JLabel lblX_4 = new JLabel("X5:");
		lblX_4.setBounds(498, 11, 16, 14);
		frame.getContentPane().add(lblX_4);
		
		JLabel lblY_4 = new JLabel("Y5:");
		lblY_4.setBounds(498, 36, 16, 14);
		frame.getContentPane().add(lblY_4);
		
		JLabel lblX_5 = new JLabel("X6:");
		lblX_5.setBounds(10, 64, 16, 14);
		frame.getContentPane().add(lblX_5);
		
		textField_9 = new JTextField();
		textField_9.setText("\u0412\u0432\u0435\u0434\u0438\u0442\u0435 \u0425");
		textField_9.setColumns(10);
		textField_9.setBounds(524, 64, 86, 20);
		frame.getContentPane().add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setText("\u0412\u0432\u0435\u0434\u0438\u0442\u0435 Y");
		textField_10.setColumns(10);
		textField_10.setBounds(524, 89, 86, 20);
		frame.getContentPane().add(textField_10);
		
		JLabel lblY_9 = new JLabel("Y10:");
		lblY_9.setBounds(498, 92, 22, 14);
		frame.getContentPane().add(lblY_9);
		
		JLabel lblX_9 = new JLabel("X10:");
		lblX_9.setBounds(498, 67, 22, 14);
		frame.getContentPane().add(lblX_9);
		
		textField_11 = new JTextField();
		textField_11.setText("\u0412\u0432\u0435\u0434\u0438\u0442\u0435 \u0425");
		textField_11.setColumns(10);
		textField_11.setBounds(402, 61, 86, 20);
		frame.getContentPane().add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setText("\u0412\u0432\u0435\u0434\u0438\u0442\u0435 Y");
		textField_12.setColumns(10);
		textField_12.setBounds(402, 86, 86, 20);
		frame.getContentPane().add(textField_12);
		
		JLabel lblY_8 = new JLabel("Y9:");
		lblY_8.setBounds(376, 89, 16, 14);
		frame.getContentPane().add(lblY_8);
		
		JLabel lblX_8 = new JLabel("X9:");
		lblX_8.setBounds(376, 64, 16, 14);
		frame.getContentPane().add(lblX_8);
		
		textField_13 = new JTextField();
		textField_13.setText("\u0412\u0432\u0435\u0434\u0438\u0442\u0435 \u0425");
		textField_13.setColumns(10);
		textField_13.setBounds(280, 61, 86, 20);
		frame.getContentPane().add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setText("\u0412\u0432\u0435\u0434\u0438\u0442\u0435 Y");
		textField_14.setColumns(10);
		textField_14.setBounds(280, 86, 86, 20);
		frame.getContentPane().add(textField_14);
		
		JLabel lblY_7 = new JLabel("Y8:");
		lblY_7.setBounds(254, 89, 16, 14);
		frame.getContentPane().add(lblY_7);
		
		JLabel lblX_7 = new JLabel("X8:");
		lblX_7.setBounds(254, 64, 16, 14);
		frame.getContentPane().add(lblX_7);
		
		textField_15 = new JTextField();
		textField_15.setText("\u0412\u0432\u0435\u0434\u0438\u0442\u0435 \u0425");
		textField_15.setColumns(10);
		textField_15.setBounds(158, 61, 86, 20);
		frame.getContentPane().add(textField_15);
		
		textField_16 = new JTextField();
		textField_16.setText("\u0412\u0432\u0435\u0434\u0438\u0442\u0435 Y");
		textField_16.setColumns(10);
		textField_16.setBounds(158, 86, 86, 20);
		frame.getContentPane().add(textField_16);
		
		JLabel lblY_6 = new JLabel("Y7:");
		lblY_6.setBounds(132, 89, 16, 14);
		frame.getContentPane().add(lblY_6);
		
		JLabel lblX_6 = new JLabel("X7:");
		lblX_6.setBounds(132, 64, 16, 14);
		frame.getContentPane().add(lblX_6);
		
		textField_17 = new JTextField();
		textField_17.setText("\u0412\u0432\u0435\u0434\u0438\u0442\u0435 \u0425");
		textField_17.setColumns(10);
		textField_17.setBounds(36, 61, 86, 20);
		frame.getContentPane().add(textField_17);
		
		textField_18 = new JTextField();
		textField_18.setText("\u0412\u0432\u0435\u0434\u0438\u0442\u0435 Y");
		textField_18.setColumns(10);
		textField_18.setBounds(36, 86, 86, 20);
		frame.getContentPane().add(textField_18);
		
		JLabel lblY_5 = new JLabel("Y6:");
		lblY_5.setBounds(10, 89, 16, 14);
		frame.getContentPane().add(lblY_5);
		
		JLabel lblMin = new JLabel("Min \u043F\u0440\u0438\u0433\u043E\u0434\u043D\u043E\u0441\u0442\u044C \u043F\u043E X");
		lblMin.setBounds(10, 120, 122, 14);
		frame.getContentPane().add(lblMin);
		
		textField_19 = new JTextField();
		textField_19.setBounds(132, 117, 86, 20);
		frame.getContentPane().add(textField_19);
		textField_19.setColumns(10);
		
		JLabel lblMax = new JLabel("Max \u043F\u0440\u0438\u0433\u043E\u0434\u043D\u043E\u0441\u0442\u044C \u043F\u043E X");
		lblMax.setBounds(10, 145, 122, 14);
		frame.getContentPane().add(lblMax);
		
		textField_20 = new JTextField();
		textField_20.setColumns(10);
		textField_20.setBounds(132, 142, 86, 20);
		frame.getContentPane().add(textField_20);
		
		JLabel lblMin_1 = new JLabel("Min \u043F\u0440\u0438\u0433\u043E\u0434\u043D\u043E\u0441\u0442\u044C \u043F\u043E Y");
		lblMin_1.setBounds(402, 123, 112, 14);
		frame.getContentPane().add(lblMin_1);
		
		textField_21 = new JTextField();
		textField_21.setColumns(10);
		textField_21.setBounds(524, 120, 86, 20);
		frame.getContentPane().add(textField_21);
		
		JLabel lblMax_1 = new JLabel("Max \u043F\u0440\u0438\u0433\u043E\u0434\u043D\u043E\u0441\u0442\u044C \u043F\u043E Y");
		lblMax_1.setBounds(402, 148, 112, 14);
		frame.getContentPane().add(lblMax_1);
		
		textField_22 = new JTextField();
		textField_22.setColumns(10);
		textField_22.setBounds(524, 145, 86, 20);
		frame.getContentPane().add(textField_22);
		
		JLabel lblX_10 = new JLabel("\u041F\u0440\u0438\u0433\u043E\u0434\u043D\u043E\u0441\u0442\u044C \u043F\u043E X");
		lblX_10.setBounds(10, 252, 99, 14);
		frame.getContentPane().add(lblX_10);
		
		JLabel lblMin_2 = new JLabel("Min \u043E\u043F\u0442\u0438\u043C\u0443\u043C \u043F\u043E X");
		lblMin_2.setBounds(10, 190, 99, 14);
		frame.getContentPane().add(lblMin_2);
		
		JLabel lblMax_2 = new JLabel("Max \u043E\u043F\u0442\u0438\u043C\u0443\u043C \u043F\u043E X");
		lblMax_2.setBounds(10, 215, 99, 14);
		frame.getContentPane().add(lblMax_2);
		
		textField_23 = new JTextField();
		textField_23.setColumns(10);
		textField_23.setBounds(102, 184, 86, 20);
		frame.getContentPane().add(textField_23);
		
		textField_24 = new JTextField();
		textField_24.setColumns(10);
		textField_24.setBounds(102, 209, 86, 20);
		frame.getContentPane().add(textField_24);
		
		JLabel lblMin_3 = new JLabel("Min \u043E\u043F\u0442\u0438\u043C\u0443\u043C \u043F\u043E Y");
		lblMin_3.setBounds(415, 190, 99, 14);
		frame.getContentPane().add(lblMin_3);
		
		textField_25 = new JTextField();
		textField_25.setColumns(10);
		textField_25.setBounds(524, 184, 86, 20);
		frame.getContentPane().add(textField_25);
		
		textField_26 = new JTextField();
		textField_26.setColumns(10);
		textField_26.setBounds(524, 209, 86, 20);
		frame.getContentPane().add(textField_26);
		
		JLabel lblMax_3 = new JLabel("Max \u043E\u043F\u0442\u0438\u043C\u0443\u043C \u043F\u043E Y");
		lblMax_3.setBounds(415, 215, 99, 14);
		frame.getContentPane().add(lblMax_3);
		
		textField_27 = new JTextField();
		textField_27.setBounds(102, 249, 86, 20);
		frame.getContentPane().add(textField_27);
		textField_27.setColumns(10);
		
		JLabel lblY_10 = new JLabel("\u041F\u0440\u0438\u0433\u043E\u0434\u043D\u043E\u0441\u0442\u044C \u043F\u043E Y");
		lblY_10.setBounds(432, 249, 99, 14);
		frame.getContentPane().add(lblY_10);
		
		textField_28 = new JTextField();
		textField_28.setColumns(10);
		textField_28.setBounds(524, 246, 86, 20);
		frame.getContentPane().add(textField_28);
	}
}