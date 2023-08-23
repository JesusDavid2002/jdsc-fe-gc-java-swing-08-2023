package Ejercicio4;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MiniCalculadora extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MiniCalculadora frame = new MiniCalculadora();
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
	public MiniCalculadora() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 451, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(10, 31, 208, 27);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(217, 31, 208, 27);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(10, 101, 415, 27);
		contentPane.add(textField_2);
		
		JButton btnNewButton = new JButton("-");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double operacion = Double.parseDouble(textField.getText()) - Double.parseDouble(textField_1.getText());
				textField_2.setText(String.valueOf(operacion));
			}
		});
		
		btnNewButton.setBounds(115, 186, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("+");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double operacion = Double.parseDouble(textField.getText()) + Double.parseDouble(textField_1.getText());
				textField_2.setText(String.valueOf(operacion));
			}
		});
		
		btnNewButton_1.setBounds(10, 186, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("/");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				double operacion = Double.parseDouble(textField.getText()) / Double.parseDouble(textField_1.getText());
				textField_2.setText(String.valueOf(operacion));
			}
		});
		
		btnNewButton_2.setBounds(324, 186, 89, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("*");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				double operacion = Double.parseDouble(textField.getText()) * Double.parseDouble(textField_1.getText());
				textField_2.setText(String.valueOf(operacion));
			}
		});
		
		btnNewButton_3.setBounds(225, 186, 89, 23);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Limpiar");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField_2.setText("");
			}
		});
		
		btnNewButton_4.setBounds(336, 277, 89, 23);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_4_1 = new JButton("Salir");
		btnNewButton_4_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				System.exit(0);
			}
		});
		
		btnNewButton_4_1.setBounds(10, 277, 89, 23);
		contentPane.add(btnNewButton_4_1);
		
		JLabel lblNewLabel = new JLabel("Operador 1");
		lblNewLabel.setBounds(10, 11, 122, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Operador 2");
		lblNewLabel_1.setBounds(221, 11, 122, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Resultado");
		lblNewLabel_2.setBounds(10, 76, 106, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Opciones");
		lblNewLabel_3.setBounds(10, 139, 122, 14);
		contentPane.add(lblNewLabel_3);
	}

}
