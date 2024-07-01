

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculator extends JFrame {
	private JPanel container;
	private JTextField p1tf1;
	private JTextField p1tf2;
	private JTextField p1tf3;
	private JTextField p1tf4;
	private JTextField p1tf5;
	private JTextField p1tf6;
	private JTextField textField;
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
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator();
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
	public Calculator() {
		setAlwaysOnTop(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1001, 655);
		container = new JPanel();
		container.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(container);
		container.setLayout(null);
		
		JPanel headerPanel = new JPanel();
		headerPanel.setBounds(31, 22, 891, 74);
		container.add(headerPanel);
		headerPanel.setLayout(null);
		JLabel lblNewLabel = new JLabel("Conversion Calculator");
		lblNewLabel.setFont(new Font("Bookman Old Style", Font.BOLD, 18));
		lblNewLabel.setBounds(383, 10, 239, 46);
		headerPanel.add(lblNewLabel);
		
		JPanel panel2 = new JPanel();
		panel2.setBounds(-15, 66, 525, 110);
		headerPanel.add(panel2);
		panel2.setLayout(null);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(341, 28, 96, 19);
		panel2.add(textField);
		
		JLabel lblNewLabel_1_4 = new JLabel("Latitude:");
		lblNewLabel_1_4.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		lblNewLabel_1_4.setBounds(248, 28, 83, 14);
		panel2.add(lblNewLabel_1_4);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(341, 62, 96, 19);
		panel2.add(textField_1);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Longitude:");
		lblNewLabel_1_1_2.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		lblNewLabel_1_1_2.setBounds(248, 62, 96, 14);
		panel2.add(lblNewLabel_1_1_2);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(341, 97, 96, 19);
		panel2.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(341, 138, 96, 19);
		panel2.add(textField_3);
		
		JLabel lblNewLabel_1_1_1_2 = new JLabel("Bearing :");
		lblNewLabel_1_1_1_2.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		lblNewLabel_1_1_1_2.setBounds(213, 136, 118, 19);
		panel2.add(lblNewLabel_1_1_1_2);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Distance :");
		lblNewLabel_1_1_1_1_1.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		lblNewLabel_1_1_1_1_1.setBounds(248, 95, 118, 19);
		panel2.add(lblNewLabel_1_1_1_1_1);
		
		JButton btnNewButton_1 = new JButton("Calculate");
		btnNewButton_1.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		btnNewButton_1.setBounds(289, 193, 118, 21);
		panel2.add(btnNewButton_1);
		
		JButton btnClear_1 = new JButton("Clear");
		btnClear_1.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		btnClear_1.setBounds(452, 193, 89, 21);
		panel2.add(btnClear_1);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(306, 263, 96, 19);
		panel2.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(536, 263, 96, 19);
		panel2.add(textField_5);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Latitude:");
		lblNewLabel_1_2_1.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		lblNewLabel_1_2_1.setBounds(219, 255, 96, 30);
		panel2.add(lblNewLabel_1_2_1);
		
		JLabel lblNewLabel_1_3_1 = new JLabel("Longitude:");
		lblNewLabel_1_3_1.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		lblNewLabel_1_3_1.setBounds(425, 268, 83, 14);
		panel2.add(lblNewLabel_1_3_1);
		
		JPanel panel3 = new JPanel();
		panel3.setBounds(80, 10, 293, 67);
		headerPanel.add(panel3);
		panel3.setLayout(null);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(290, 69, 96, 19);
		panel3.add(textField_6);
		
		JLabel lblNewLabel_1_5 = new JLabel("Latitude:");
		lblNewLabel_1_5.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		lblNewLabel_1_5.setBounds(204, 74, 80, 14);
		panel3.add(lblNewLabel_1_5);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(500, 69, 96, 19);
		panel3.add(textField_7);
		
		JLabel lblNewLabel_1_1_3 = new JLabel("Longitude:");
		lblNewLabel_1_1_3.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		lblNewLabel_1_1_3.setBounds(407, 69, 109, 14);
		panel3.add(lblNewLabel_1_1_3);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(407, 117, 96, 19);
		panel3.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(407, 164, 96, 19);
		panel3.add(textField_9);
		
		JLabel lblNewLabel_1_1_1_3 = new JLabel("Bearing of AB ");
		lblNewLabel_1_1_1_3.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		lblNewLabel_1_1_1_3.setBounds(262, 162, 118, 19);
		panel3.add(lblNewLabel_1_1_1_3);
		
		JLabel lblNewLabel_1_1_1_1_2 = new JLabel("Distance Between AB");
		lblNewLabel_1_1_1_1_2.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		lblNewLabel_1_1_1_1_2.setBounds(177, 115, 220, 19);
		panel3.add(lblNewLabel_1_1_1_1_2);
		
		JButton btnNewButton_2 = new JButton("Calculate");
		btnNewButton_2.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		btnNewButton_2.setBounds(298, 209, 118, 21);
		panel3.add(btnNewButton_2);
		
		JButton btnClear_2 = new JButton("Clear");
		btnClear_2.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		btnClear_2.setBounds(500, 211, 89, 21);
		panel3.add(btnClear_2);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(290, 263, 96, 19);
		panel3.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(536, 263, 96, 19);
		panel3.add(textField_11);
		
		JLabel lblNewLabel_1_2_2 = new JLabel("X:");
		lblNewLabel_1_2_2.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		lblNewLabel_1_2_2.setBounds(262, 263, 59, 14);
		panel3.add(lblNewLabel_1_2_2);
		
		JLabel lblNewLabel_1_3_2 = new JLabel("Y:");
		lblNewLabel_1_3_2.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		lblNewLabel_1_3_2.setBounds(515, 266, 26, 14);
		panel3.add(lblNewLabel_1_3_2);
		
		JPanel comboPanel = new JPanel();
		comboPanel.setBounds(66, 115, 856, 82);
		container.add(comboPanel);
		comboPanel.setLayout(null);
		JComboBox  comboBox = new JComboBox ();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"X Y From Bearing And Distance", "Lat Long From X  Y", "Lat Long From Distance Bearing", "X  Y From Lat, Long", "X Y Distance"}));
		comboBox.setBounds(257, 10, 512, 38);
		comboPanel.add(comboBox);
		
		JPanel panel1 = new JPanel();
		panel1.setBounds(3, 10, 244, 74);
		comboPanel.add(panel1);
		panel1.setLayout(null);
		
		p1tf1 = new JTextField();
		p1tf1.setBounds(290, 69, 96, 19);
		panel1.add(p1tf1);
		p1tf1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("X A=");
		lblNewLabel_1.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(243, 74, 41, 14);
		panel1.add(lblNewLabel_1);
		
		p1tf2 = new JTextField();
		p1tf2.setBounds(517, 62, 96, 19);
		panel1.add(p1tf2);
		p1tf2.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Y A=");
		lblNewLabel_1_1.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		lblNewLabel_1_1.setBounds(472, 64, 41, 14);
		panel1.add(lblNewLabel_1_1);
		
		p1tf3 = new JTextField();
		p1tf3.setColumns(10);
		p1tf3.setBounds(407, 117, 96, 19);
		panel1.add(p1tf3);
		
		p1tf4 = new JTextField();
		p1tf4.setColumns(10);
		p1tf4.setBounds(407, 164, 96, 19);
		panel1.add(p1tf4);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Bearing of AB ");
		lblNewLabel_1_1_1.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		lblNewLabel_1_1_1.setBounds(262, 162, 118, 19);
		panel1.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Distance Between AB (m):");
		lblNewLabel_1_1_1_1.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		lblNewLabel_1_1_1_1.setBounds(177, 115, 220, 19);
		panel1.add(lblNewLabel_1_1_1_1);
		
		JButton btnNewButton = new JButton("Calculate");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Button 1 has been clicked"+ p1tf1);
						}
		});
		btnNewButton.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		btnNewButton.setBounds(298, 209, 118, 21);
		panel1.add(btnNewButton);
		
		JButton btnClear = new JButton("Clear");
		btnClear.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		btnClear.setBounds(500, 211, 89, 21);
		panel1.add(btnClear);
		
		p1tf5 = new JTextField();
		p1tf5.setColumns(10);
		p1tf5.setBounds(306, 263, 96, 19);
		panel1.add(p1tf5);
		
		p1tf6 = new JTextField();
		p1tf6.setColumns(10);
		p1tf6.setBounds(550, 263, 96, 19);
		panel1.add(p1tf6);
		
		JLabel lblNewLabel_1_2 = new JLabel("X B=");
		lblNewLabel_1_2.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		lblNewLabel_1_2.setBounds(255, 266, 41, 14);
		panel1.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Y B =");
		lblNewLabel_1_3.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		lblNewLabel_1_3.setBounds(500, 266, 41, 14);
		panel1.add(lblNewLabel_1_3);
		
		JPanel panel1_1 = new JPanel();
		panel1_1.setLayout(null);
		panel1_1.setBounds(41, 221, 906, 339);
		container.add(panel1_1);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(338, 38, 96, 19);
		panel1_1.add(textField_12);
		
		JLabel lblNewLabel_1_6 = new JLabel("X A:");
		lblNewLabel_1_6.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		lblNewLabel_1_6.setBounds(284, 43, 55, 14);
		panel1_1.add(lblNewLabel_1_6);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(532, 43, 96, 19);
		panel1_1.add(textField_13);
		
		JLabel lblNewLabel_1_1_4 = new JLabel("Y A:");
		lblNewLabel_1_1_4.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		lblNewLabel_1_1_4.setBounds(489, 43, 41, 14);
		panel1_1.add(lblNewLabel_1_1_4);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(445, 214, 96, 19);
		panel1_1.add(textField_15);
		
		JLabel lblNewLabel_1_1_1_4 = new JLabel("Distance Between AB:");
		lblNewLabel_1_1_1_4.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		lblNewLabel_1_1_1_4.setBounds(252, 214, 186, 19);
		panel1_1.add(lblNewLabel_1_1_1_4);
		
		JButton btnNewButton_3 = new JButton("Calculate");
		btnNewButton_3.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		btnNewButton_3.setBounds(319, 165, 126, 21);
		panel1_1.add(btnNewButton_3);
		
		JButton btnClear_3 = new JButton("Clear");
		btnClear_3.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		btnClear_3.setBounds(539, 165, 89, 21);
		panel1_1.add(btnClear_3);
		
		textField_16 = new JTextField();
		textField_16.setColumns(10);
		textField_16.setBounds(338, 88, 96, 19);
		panel1_1.add(textField_16);
		
		textField_17 = new JTextField();
		textField_17.setColumns(10);
		textField_17.setBounds(532, 88, 96, 19);
		panel1_1.add(textField_17);
		
		JLabel lblNewLabel_1_2_3 = new JLabel("X B:");
		lblNewLabel_1_2_3.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		lblNewLabel_1_2_3.setBounds(284, 88, 41, 14);
		panel1_1.add(lblNewLabel_1_2_3);
		
		JLabel lblNewLabel_1_3_3 = new JLabel("Y B :");
		lblNewLabel_1_3_3.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		lblNewLabel_1_3_3.setBounds(489, 93, 41, 14);
		panel1_1.add(lblNewLabel_1_3_3);
	}
}

