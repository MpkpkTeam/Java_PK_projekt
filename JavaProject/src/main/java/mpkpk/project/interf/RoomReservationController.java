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
		this.View.addShowreservationsButtonListener(new ShowreservationButtonListener());
		this.View.addAddreservationButtonListener(new AddreservationButtonListener());
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
	
	class ShowreservationButtonListener implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			
			Model.Showreservations();
			
		}		
		
	}
	
	///	2 controllers
	class AddreservationButtonListener implements ActionListener{
		
		public void actionPerformed(ActionEvent e){
			
			AddReservationController Controller = new AddReservationController(Model); 
		}
	}
	
}
