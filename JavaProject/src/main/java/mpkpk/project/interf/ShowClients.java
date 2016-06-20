package mpkpk.project.interf;

import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JDialog;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JTable;

import mpkpk.project.hotel.Client;
import mpkpk.project.hotel.Room;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

public class ShowClients extends JDialog {
	private JTable table;
	
	public ShowClients(ArrayList<Client> client) {
		
		Object[] colnames = {"ID","First Name","Last Name","Phone"};
		Object[][] data = new String[client.size()][4];
		
		int i=0;
		for(Client c : client)
		{
			data[i][0] = Integer.toString(c.getId());
			data[i][1] = c.GetFirstName();
			data[i][2] = c.GetLastName();
			data[i][3] = Integer.toString(c.GetPhoneNumber());
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
