package mpkpk.project.interf;

import mpkpk.project.main.Hotel;

import java.awt.event.*;

public class RoomReservationController {
	
	
	protected RoomReservationModel Model;
	protected RoomReservationView View;
	
	public RoomReservationController(RoomReservationModel Model, RoomReservationView View){
		
		this.Model = Model;
		this.View = View;
		
		this.View.addShowRoomsButtonListener(new ShowRoomButtonListener());
		this.View.addShowClientsButtonListener(new ShowClientsButtonListener());
		this.View.addShowReserwationsButtonListener(new ShowReserwationButtonListener());
		this.View.addAddReserwationButtonListener(new AddReserwationButtonListener());
	}
	
	class ShowRoomButtonListener implements ActionListener{

		public void actionPerformed(ActionEvent e) {

			Model.Showroom();
			
		}
	}
	
	class ShowClientsButtonListener implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			
			Model.Showclients();
			
		}
	}
	
	class ShowReserwationButtonListener implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			
			Model.Showreserwations();
			
		}		
		
	}
	
	class AddReserwationButtonListener implements ActionListener{
		
		public void actionPerformed(ActionEvent e){
			
			Model.Addreserwations();
			
		}
	}
	
}
