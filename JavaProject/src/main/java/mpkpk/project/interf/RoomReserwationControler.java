package mpkpk.project.interf;

import mpkpk.project.main.Hotel;

import java.awt.event.*;

public class RoomReserwationControler {
	
	
	protected RoomReserwationModel Model;
	protected RoomReserwationView View;
	
	public RoomReserwationControler(RoomReserwationModel Model, RoomReserwationView View){
		
		this.Model = Model;
		this.View = View;
		
		this.View.addShowRoomsButtonListener(new ShowRoomButtonListener());
		this.View.addShowClientsButtonListener(new ShowClientsButtonListener());
	}
	
	class ShowRoomButtonListener implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			View.jfrm.setVisible(false);
			Model.Showroom();
			
		}
	}
	
	class ShowClientsButtonListener implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			
			Model.Showclients();
			
		}
	}
	
}
