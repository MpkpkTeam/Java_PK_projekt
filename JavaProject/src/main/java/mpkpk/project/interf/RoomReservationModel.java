package mpkpk.project.interf;

import java.util.ArrayList;
import java.util.Date;

import javax.swing.JFrame;

import mpkpk.project.hotel.LessThanZeroClientsException;
import mpkpk.project.hotel.Room;
import mpkpk.project.hotel.TooManyClientsException;
import mpkpk.project.hotel.WrongParametersException;
import mpkpk.project.main.Hotel;

public class RoomReservationModel {
	public ShowRooms Showfreerooms;
	public ShowClients Showclient;
	public ShowReservations Showreserwation;
	Hotel hotel;
	
	private Date date_from;
	private Date date_to;
	private String[][] data;
	public ArrayList<Room> rooms;

	public RoomReservationModel() throws Exception{
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
	
	///// 2 Controller
	
	@SuppressWarnings("deprecation")
	public void CheckFreeRooms(String year_from, String month_from, String day_from, String year_to, String month_to, String day_to, String Capacity) throws NumberFormatException, Exception{
		
		date_from = new Date(Integer.parseInt(year_from)-1900, Integer.parseInt(month_from)-1, Integer.parseInt(day_from));
		date_to = new Date(Integer.parseInt(year_to)-1900, Integer.parseInt(month_to)-1, Integer.parseInt(day_to));
	
		rooms = hotel.facade.FindEmptyRooms(date_from, date_to, Integer.parseInt(Capacity));
		
	}
	
	public String[][] SetFreeRooms(){
		
		data = new String[rooms.size()][4];
			
		int i=0;
		for(Room r : rooms)
		{
			data[i][0] = Integer.toString(r.GetId());
			data[i][1] = Integer.toString(r.GetCapacity());
			if(r.IsVip())
				data[i][2] = "yes";
			else
				data[i][2] = "no";
			i++;
		}
		return data;
	}
	
	public void AddReservation(String Name, String Surname, String Phone, String Capacity, int NumbRoom) throws NumberFormatException, Exception{
		
		int ID = Integer.parseInt(data[NumbRoom][0]);
		
		Room tmp = null;
		for(Room r : hotel.facade.ListAllRooms())
		{
			if(r.GetId() == ID)
				tmp = r;
		}
		
		hotel.facade.AddReservation(date_from, date_to, Name, Surname, Integer.parseInt(Phone), Integer.parseInt(Capacity), tmp);
	}
	
}
