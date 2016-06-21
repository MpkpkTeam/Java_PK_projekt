package mpkpk.project.interf;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class AddReservationView{

	//table.getSelectedRow();
	public JFrame Addreserwation;
	private JTable table;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	public JButton btnCheckFreeRooms;
	public JButton btnAddReserwation;
	public JButton btnCancel;
	private JLabel lblPrice;
	
	public AddReservationView() {
		Addreserwation = new JFrame();
		
		Addreserwation.setResizable(false);
		Addreserwation.getContentPane().setLayout(null);

		Addreserwation.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Addreserwation.setBounds(100, 100, 723, 487);	
		Addreserwation.setVisible(true);
		
		JPanel panel = new JPanel();
		panel.setBounds(12, 13, 230, 389);
		Addreserwation.getContentPane().add(panel);
		
		JLabel lblFirstName = new JLabel("First Name");
		
		textField = new JTextField();
		textField.setColumns(10);
		
		JLabel lblLastName = new JLabel("Last Name");
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		JLabel lblDateFrom = new JLabel("Date From");
		
		JComboBox comboBox = new JComboBox();
		
		JComboBox comboBox_1 = new JComboBox();
		
		JComboBox comboBox_2 = new JComboBox();
		
		JLabel lblDateTo = new JLabel("Date To");
		
		JComboBox comboBox_3 = new JComboBox();
		
		JComboBox comboBox_4 = new JComboBox();
		
		JComboBox comboBox_5 = new JComboBox();
		
		JLabel lblPhone = new JLabel("Phone");
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		
		btnCheckFreeRooms = new JButton("Check free rooms");
		
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(86)
					.addComponent(lblFirstName)
					.addContainerGap(82, Short.MAX_VALUE))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(89)
					.addComponent(lblLastName)
					.addContainerGap(81, Short.MAX_VALUE))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(89)
					.addComponent(lblDateFrom)
					.addContainerGap(81, Short.MAX_VALUE))
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap(50, Short.MAX_VALUE)
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 134, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, 134, GroupLayout.PREFERRED_SIZE))
					.addGap(46))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(96)
					.addComponent(lblDateTo, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(81, Short.MAX_VALUE))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(32)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(comboBox_3, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(comboBox_4, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(comboBox_5, 0, 53, Short.MAX_VALUE)
						.addComponent(comboBox_2, 0, 53, Short.MAX_VALUE))
					.addContainerGap())
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(50)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(btnCheckFreeRooms)
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(47, Short.MAX_VALUE))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(97)
					.addComponent(lblPhone)
					.addContainerGap(98, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addComponent(lblFirstName)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblLastName)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblDateFrom)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBox_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblDateTo)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(comboBox_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBox_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBox_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblPhone)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
					.addComponent(btnCheckFreeRooms)
					.addGap(52))
		);
		panel.setLayout(gl_panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(252, 13, 460, 336);
		Addreserwation.getContentPane().add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		Object[] colnames = {"ID","Capacity","VIP"};
		Object[][] data = {
				{"0","2","yes"},
				};
		
		table = new JTable(data, colnames);
		panel_1.add(table, BorderLayout.CENTER);
		
		JScrollPane scrollPane = new JScrollPane(table);
		panel_1.add(scrollPane, BorderLayout.EAST);
		
		btnAddReserwation = new JButton("Add reserwation");
		btnAddReserwation.setBounds(454, 389, 153, 25);
		Addreserwation.getContentPane().add(btnAddReserwation);
		
		lblPrice = new JLabel("Price:");
		lblPrice.setBounds(444, 362, 56, 16);
		Addreserwation.getContentPane().add(lblPrice);
		
		btnCancel = new JButton("Cancel");
		btnCancel.setBounds(345, 389, 97, 25);
		Addreserwation.getContentPane().add(btnCancel);
		
	}
}
