package Tasks;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Metric_Conversion_GUI {
 
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() { 
				try {
					Metric_Conversion_GUI window = new Metric_Conversion_GUI();
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
	public Metric_Conversion_GUI() {
		initialize();
	} 

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 551, 420);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.CYAN);
		panel.setBounds(0, 0, 535, 381);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel convTypePrompt = new JLabel("Select A Conversion");
		convTypePrompt.setBounds(63, 104, 121, 26);
		panel.add(convTypePrompt);
		
		JComboBox converType = new JComboBox();
		converType.setModel(new DefaultComboBoxModel(new String[] {"Select One", " _ ", "Inches (in) to Centimeters (cm)", "Feet (ft) to Meters (m)", "Gallons (gal) to Liters (L)", "Pound (lb) to Kilograms (kg)"}));
		converType.setBounds(194, 104, 186, 26);
		panel.add(converType);
		
		JLabel Welcome = new JLabel("Welcome to Metric Conversion");
		Welcome .setBounds(174, 40, 186, 37);
		panel.add(Welcome);
		
		JLabel lblFormula = new JLabel("Formula:");
		lblFormula.setBounds(107, 202, 121, 26);
		panel.add(lblFormula); 
		
		JLabel Release = new JLabel("");
		Release.setBounds(182, 233, 198, 37);
		panel.add(Release);
		
		JButton typeCheck = new JButton("Convert For Me");
		typeCheck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String Conversion_From_One_To_Another = " ";
				 
				 if(converType.getSelectedItem().equals("Select One"))
				 {
					 Conversion_From_One_To_Another = "Please Select A Metric Conversion";
				 }
				 else if(converType.getSelectedItem().equals(" _ "))
				 {
					 Conversion_From_One_To_Another = "Please Select A Metric Conversion";
				 }
				 else if(converType.getSelectedItem().equals("Inches (in) to Centimeters (cm)"))
				 {
					 Conversion_From_One_To_Another = "1 Inch (in) = 2.54 Centimeters (cm)";
				 }
				 else if(converType.getSelectedItem().equals("Feet (ft) to Meters (m)"))
				 {
					 Conversion_From_One_To_Another = "1 Foot (ft) = 0.3048 Meters (m)";
				 }
				 else if(converType.getSelectedItem().equals("Gallons (gal) to Liters (L)"))
				 {
					 Conversion_From_One_To_Another = "1 Gallon (gal) = 4.5461 Liters (L)";
				 }
				 else if(converType.getSelectedItem().equals("Pound (lb) to Kilograms (kg)"))
				 {
					 Conversion_From_One_To_Another = "1 Pound (lb) = 0.4536 Kilograms (kg)";
				 }
				 
				 Release.setText(Conversion_From_One_To_Another);
			}
		});
		typeCheck.setBounds(404, 106, 121, 23);
		panel.add(typeCheck);
	
	}
}


