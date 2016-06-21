package mpkpk.project.interf;

import javax.swing.JFrame;

import mpkpk.project.hotel.LessThanZeroClientsException;
import mpkpk.project.hotel.TooManyClientsException;
import mpkpk.project.hotel.WrongParametersException;
import mpkpk.project.main.Hotel;

public class RoomReservationModel {
	public ShowRooms Showfreerooms;
	public ShowClients Showclient;
	public ShowReservations Showreserwation;
	public AddReservation Addreserwation;
	Hotel hotel;

	public RoomReservationModel() throws WrongParametersException, TooManyClientsException, LessThanZeroClientsException{
		hotel = new Hotel("Hotel");
	}
	
	public void Showroom(){
		Showfreerooms = new ShowRooms(hotel.facade.ListAllRooms());

	}
	
	public void Showclients(){
		Showclient = new ShowClients(hotel.facade.ListAllClients());

	}
	
	public void Showreserwations(){
		Showreserwation = new ShowReservations(hotel.facade.ListaAllReservation());

	}
	
	public void Addreserwations(){
		Addreserwation = new AddReservation();
	}
}
