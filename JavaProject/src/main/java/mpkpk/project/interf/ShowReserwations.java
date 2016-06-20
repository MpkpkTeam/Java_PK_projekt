package mpkpk.project.interf;

import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

import javax.swing.JDialog;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JTable;

import mpkpk.project.hotel.Reservation;
import mpkpk.project.hotel.Room;

import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

public class ShowReserwations extends JDialog {
	public JTable table;
	
	public ShowReserwations(ArrayList<Reservation> reserwation) {
		
		Object[] colnames = {"ID","Date From","Date to","Client ID","Room ID"};
		Object[][] data = new String[reserwation.size()][5];
		
		DateFormat df = new SimpleDateFormat("YYYY-MM-DD", Locale.ENGLISH);

		int i=0;
		for(Reservation r : reserwation)
		{
			data[i][0] = Integer.toString(r.GetId());
			data[i][1] = df.format(r.GetFromDate());
			data[i][2] = df.format(r.GetToDate());
			data[i][3] = Integer.toString(r.GetClient().getId());
			data[i][4] = Integer.toString(r.GetRoom().GetId());
			
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
