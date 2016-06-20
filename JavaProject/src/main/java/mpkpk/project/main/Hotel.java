package mpkpk.project.main;

import java.util.ArrayList;
import java.util.Date;

import mpkpk.project.hotel.*;

public class Hotel {
	
	public String Name; // Hotel name
	
	ArrayList<Client> clients; // List of clients
	ArrayList<Reservation> reservations; // List of reservations
	ArrayList<Room> rooms; // List of rooms
	
	public FacadeReservation facade;
	
	public Hotel(String name) throws WrongParametersException, TooManyClientsException, LessThanZeroClientsException // Constructor
	{
		this.Name = name;
		
		clients = new ArrayList<Client>();
		reservations = new ArrayList<Reservation>();
		rooms = new ArrayList<Room>();
		
		facade = new FacadeReservation(clients, reservations, rooms);
	/*
		ArrayList<Room> rrr = facade.FindEmptyRooms(new Date(100), new Date(600), 1);
		for(Room r : rrr)
		{
			System.out.print("Capacity: " + r.GetCapacity() + ", ");
			System.out.print("id: " + r.GetId() + ", ");
			System.out.println("Is Occupied: " + r.IsOccupied());
		}
		*/
		//facade.AddReservation(new Date(123), new Date(456), "qwe", "asd", 666, 1, rooms.get(6));
		
		/*ArrayList<Reservation> qwe = facade.ListaAllReservation();
		for(Reservation r : qwe)
		{
			System.out.println("Reservation id: " + r.GetId() + ", Client name: " + r.GetClient().GetName() + ", Pokoj: " + r.GetRoom().GetId());
		}
		*/
		for(Reservation r : reservations)
		{
			System.out.print("id: " + r.GetId() + ", ");
			System.out.println("Room id: " + r.GetRoom().GetId());
		}
		
		
	}
}
