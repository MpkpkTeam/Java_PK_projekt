package mpkpk.project.interf;

import mpkpk.project.main.Hotel;

public class RoomReserwationModel {
	Hotel hotel = new Hotel("TODO Nazwa");
	public ShowRooms Showfreerooms;
	public ShowClients Showclient;
	
	public void Showroom(){
		Showfreerooms = new ShowRooms(hotel.facade.ListAllRooms());

	}
	
	public void Showclients(){
		Showclient = new ShowClients(hotel.facade.ListAllClients());

	}
}
