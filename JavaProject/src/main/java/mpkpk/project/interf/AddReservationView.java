package mpkpk.project.interf;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;

import mpkpk.project.hotel.Room;

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

	
	public JFrame Addreserwation;
	private DefaultTableModel dataModel;
	public JTable table;
	public JTextField textField;
	public JTextField textField_1;
	public JTextField textField_2;
	public JButton btnCheckFreeRooms;
	public JButton btnAddReserwation;
	public JButton btnCancel;
	private JLabel lblPrice;
	public JComboBox comboBox;
	public JComboBox comboBox_1;
	public JComboBox comboBox_2;
	public JComboBox comboBox_3;
	public JComboBox comboBox_4;
	public JComboBox comboBox_5;
	public JComboBox comboBox_6;
	private String years[] = {"2016", "2017", "2018"};
	private String months[];
	private String days[];
	private String Capacity[] = {"1", "2", "3", "4"};
	public double price = 0.0;
	
	
	public AddReservationView() {
		Addreserwation = new JFrame();
		Addreserwation.setResizable(false);
		Addreserwation.getContentPane().setLayout(null);

		Addreserwation.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
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
		
		months = new String[12];
		for(int i=0;i<12;i++)
			months[i]="" + (i+1);
		
		days = new String[31];
		for(int i=0;i<31;i++)
			days[i]="" + (i+1);
		
		comboBox = new JComboBox(years);
		
		comboBox_1 = new JComboBox(months);
		
		comboBox_2 = new JComboBox(days);
		
		JLabel lblDateTo = new JLabel("Date To");
		
		comboBox_3 = new JComboBox(years);
		
		comboBox_4 = new JComboBox(months);
		
		comboBox_5 = new JComboBox(days);
		
		JLabel lblPhone = new JLabel("Phone");
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		
		btnCheckFreeRooms = new JButton("Check free rooms");
		
		JLabel lblNumberOfPeople = new JLabel("Number Of People");
		
		comboBox_6 = new JComboBox(Capacity);
		
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
					.addGap(97)
					.addComponent(lblPhone)
					.addContainerGap(98, Short.MAX_VALUE))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(50)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(btnCheckFreeRooms)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(10)
							.addComponent(lblNumberOfPeople))
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(47, Short.MAX_VALUE))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(91)
					.addComponent(comboBox_6, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(89, Short.MAX_VALUE))
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
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNumberOfPeople)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(comboBox_6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
					.addComponent(btnCheckFreeRooms)
					.addGap(39))
		);
		panel.setLayout(gl_panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(252, 13, 460, 336);
		Addreserwation.getContentPane().add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		Object[] colnames = {"ID","Capacity","VIP"};
		Object[] data = {"-","-","-"};
		
	    dataModel = new DefaultTableModel();
	    dataModel.setColumnIdentifiers(colnames);
	    dataModel.addRow(data);
	    
	    table = new JTable(dataModel);
	    
		
		panel_1.add(table, BorderLayout.CENTER);
		
		JScrollPane scrollPane = new JScrollPane(table);
		panel_1.add(scrollPane, BorderLayout.EAST);
		
		btnAddReserwation = new JButton("Add reserwation");
		btnAddReserwation.setBounds(454, 389, 153, 25);
		Addreserwation.getContentPane().add(btnAddReserwation);
		
		lblPrice = new JLabel("Price: " + price);
		lblPrice.setBounds(444, 362, 56, 16);
		Addreserwation.getContentPane().add(lblPrice);
		
		btnCancel = new JButton("Cancel");
		btnCancel.setBounds(345, 389, 97, 25);
		Addreserwation.getContentPane().add(btnCancel);
		//table.getSelectedRow();
	}
	
	void addCheckFreeRoomsButtonListener(ActionListener listenforCheckFreeRoomsbtn){
		btnCheckFreeRooms.addActionListener(listenforCheckFreeRoomsbtn);
	}
	
	void addCancelButtonListener(ActionListener listenforCancelButton){
		btnCancel.addActionListener(listenforCancelButton);
	}
	
	void addAddReservationButtonListener(ActionListener listenforAddReservationButton){
			btnAddReserwation.addActionListener(listenforAddReservationButton);
	}
	
	void setFreeRooms(String[][] data){
		dataModel.setRowCount(0);
		
		for(int j=0;j<data.length;j++)
			dataModel.addRow(data[j]);
		
		dataModel.fireTableDataChanged();
	}
	
	
}
