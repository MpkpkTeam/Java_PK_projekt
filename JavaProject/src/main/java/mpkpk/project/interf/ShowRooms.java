package mpkpk.project.interf;

import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JTable;

import mpkpk.project.hotel.Room;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

public class ShowRooms extends JDialog {
	public JTable table;
	public ShowRooms(ArrayList<Room> room) {
		
		this.setModal(true);
		Object[] colnames = {"ID","Capacity","Occupied"};
		Object[][] data = new String[room.size()][3];
		
		int i=0;
		for(Room r : room)
		{
			data[i][0] = Integer.toString(r.GetId());
			data[i][1] = Integer.toString(r.GetCapacity());
			data[i][2] = Boolean.toString(r.IsOccupied());
			i++;
		}

		setBounds(100, 100, 487, 417);
		this.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		
		table = new JTable(data, colnames);
		getContentPane().add(table, BorderLayout.CENTER);		

		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
			}
		});
		getContentPane().add(btnOk, BorderLayout.SOUTH);
		
		JScrollPane scrollPane = new JScrollPane(table);
		getContentPane().add(scrollPane, BorderLayout.EAST);
		this.setResizable(false);
		this.setVisible(true);
			
	}

}
