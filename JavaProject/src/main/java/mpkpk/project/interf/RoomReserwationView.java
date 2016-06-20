package mpkpk.project.interf;

import javax.swing.*;
import java.awt.*;
import javax.swing.GroupLayout.Alignment;

class RoomReserwationView {
	public RoomReserwationView(){
		JFrame jfrm = new JFrame("RoomReserwation");
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btnCheckFreeRooms = new JButton("Check free rooms");
		
		JButton btnAddReserwation = new JButton("Add reserwation");
		GroupLayout groupLayout = new GroupLayout(jfrm.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(146)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(btnAddReserwation, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnCheckFreeRooms, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addContainerGap(151, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(69)
					.addComponent(btnCheckFreeRooms)
					.addGap(18)
					.addComponent(btnAddReserwation)
					.addContainerGap(113, Short.MAX_VALUE))
		);
		jfrm.getContentPane().setLayout(groupLayout);
		
	}
}
