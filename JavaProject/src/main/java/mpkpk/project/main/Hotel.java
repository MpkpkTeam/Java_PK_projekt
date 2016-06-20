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
	
	public Hotel(String name) // Constructor
	{
		this.Name = name;
		
		clients = new ArrayList<Client>();
		reservations = new ArrayList<Reservation>();
		rooms = new ArrayList<Room>();
		
		facade = new FacadeReservation(clients, reservations, rooms);
<<<<<<< HEAD
	
/*		ArrayList<Room> rrr = facade.FindEmptyRooms(new Date(123), new Date(456), 4);
=======
	/*
		ArrayList<Room> rrr = facade.FindEmptyRooms(new Date(100), new Date(600), 1);
>>>>>>> ace5cd1736d7a097879e27ab4a9b48eb0d88b3b9
		for(Room r : rrr)
		{
			System.out.print("Capacity: " + r.GetCapacity() + ", ");
			System.out.print("id: " + r.GetId() + ", ");
			System.out.println("Is Occupied: " + r.IsOccupied());
		}
<<<<<<< HEAD
	*/	
		facade.AddReservation(new Date(123), new Date(456), clients.get(0), 5, rooms.get(4));
		
		ArrayList<Reservation> qwe = facade.ListaAllReservation();
=======
		*/
		//facade.AddReservation(new Date(123), new Date(456), "qwe", "asd", 666, 1, rooms.get(6));
		
		/*ArrayList<Reservation> qwe = facade.ListaAllReservation();
>>>>>>> ace5cd1736d7a097879e27ab4a9b48eb0d88b3b9
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
