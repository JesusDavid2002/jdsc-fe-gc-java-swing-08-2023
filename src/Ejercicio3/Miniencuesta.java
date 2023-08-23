package Ejercicio3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Enumeration;
import java.awt.event.ActionEvent;

public class Miniencuesta extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Miniencuesta frame = new Miniencuesta();
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
	public Miniencuesta() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Elije un SO");
		lblNewLabel.setBounds(35, 27, 116, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Elije tu especialidad");
		lblNewLabel_1.setBounds(265, 27, 131, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Horas dedicadas en el ordenador");
		lblNewLabel_2.setBounds(116, 148, 200, 14);
		contentPane.add(lblNewLabel_2);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Programación");
		chckbxNewCheckBox.setBounds(265, 54, 131, 23);
		contentPane.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Diseño gráfico");
		chckbxNewCheckBox_1.setBounds(265, 80, 131, 23);
		contentPane.add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("Administración");
		chckbxNewCheckBox_2.setBounds(265, 106, 131, 23);
		contentPane.add(chckbxNewCheckBox_2);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Windows");
		rdbtnNewRadioButton.setBounds(35, 54, 109, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Linux");
		rdbtnNewRadioButton_1.setBounds(35, 80, 109, 23);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Mac");
		rdbtnNewRadioButton_2.setBounds(35, 106, 109, 23);
		contentPane.add(rdbtnNewRadioButton_2);
		
		ButtonGroup btnGroup = new ButtonGroup();
		btnGroup.add(rdbtnNewRadioButton);
		btnGroup.add(rdbtnNewRadioButton_1);
		btnGroup.add(rdbtnNewRadioButton_2);
		
		JSlider slider = new JSlider();
		slider.setPaintTicks(true);
		slider.setPaintLabels(true);
		slider.setMaximum(10);
		slider.setMajorTickSpacing(10);	
		slider.setMinorTickSpacing(0);
		slider.setBounds(96, 173, 200, 39);
		contentPane.add(slider);
		
		JButton btnNewButton = new JButton("Mostrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				 String selectedOperatingSystem = "";
	                for (Enumeration<AbstractButton> buttons = btnGroup.getElements(); buttons.hasMoreElements();) {
	                    AbstractButton button = buttons.nextElement();
	                    if (button.isSelected()) {
	                        selectedOperatingSystem = button.getText();
	                        break;
	                    }
	                }

	                ArrayList selectedCheckBoxes = new ArrayList();
	                
	                if (chckbxNewCheckBox.isSelected()) {
	                	selectedCheckBoxes.add(chckbxNewCheckBox.getText());
	                }
	                if (chckbxNewCheckBox_1.isSelected()) {
	                	selectedCheckBoxes.add(chckbxNewCheckBox_1.getText());
	                }
	                if (chckbxNewCheckBox_2.isSelected()) {
	                	selectedCheckBoxes.add(chckbxNewCheckBox_2.getText());
	                }

	                int hoursSpent = slider.getValue();

	                JOptionPane.showMessageDialog(null,
	                        "Como sistema operativo has elegido: " + selectedOperatingSystem + "\n" +
	                        "Como especializacion/es has elegido: " + selectedCheckBoxes + "\n" +
	                        "Has dedicado " + hoursSpent + " horas en el ordenador");
	            }
		});
		
		btnNewButton.setBounds(146, 227, 89, 23);
		contentPane.add(btnNewButton);
	}
}
