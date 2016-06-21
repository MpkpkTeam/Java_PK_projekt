package mpkpk.project.interf;

import javax.swing.*;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class RoomReserwationView {
	
	public JButton btnAddReserwation = new JButton("Add reserwation");
	public JButton btnShowClients = new JButton("Show clients");
	public JButton btnShowRooms = new JButton("Show rooms");
	public JButton btnShowReserwations = new JButton("Show reserwations");
	public JFrame jfrm;
	
	public RoomReserwationView(){
		jfrm = new JFrame("RoomReserwation");
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jfrm.setSize(500, 350);
		jfrm.setLocationRelativeTo(null);
		jfrm.setResizable(false);
		

	
		GroupLayout groupLayout = new GroupLayout(jfrm.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(45)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
						.addComponent(btnShowClients, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnShowReserwations))
					.addPreferredGap(ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
						.addComponent(btnShowRooms, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnAddReserwation))
					.addGap(56))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(55)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(btnShowRooms)
							.addGap(62)
							.addComponent(btnAddReserwation))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(btnShowClients)
							.addGap(62)
							.addComponent(btnShowReserwations)))
					.addContainerGap(86, Short.MAX_VALUE))
		);
		jfrm.getContentPane().setLayout(groupLayout);
		
		jfrm.setVisible(true);
		
	}
	
	void addShowRoomsButtonListener(ActionListener listenforShowRoomsbtn){
		
		btnShowRooms.addActionListener(listenforShowRoomsbtn);
		
	}
	
	void addShowClientsButtonListener(ActionListener listenforShowClientsbtn){
		
		btnShowClients.addActionListener(listenforShowClientsbtn);
		
	}
	
	void addShowReserwationsButtonListener(ActionListener listenforShowReserwationsbtn){
		
		btnShowReserwations.addActionListener(listenforShowReserwationsbtn);
		
	}
	
	void addAddReserwationButtonListener(ActionListener listenforAddReserwationbtn){
		
		btnAddReserwation.addActionListener(listenforAddReserwationbtn);
	}
	
}
