package mpkpk.project.main;

import java.util.ArrayList;
import mpkpk.project.hotel.*;

public class Hotel
{

	public String Name; // Hotel name

	ArrayList<Client> clients; // List of clients
	ArrayList<Reservation> reservations; // List of reservations
	ArrayList<Room> rooms; // List of rooms

	
	public FacadeReservation facade;
	
	public Hotel(String name) throws WrongParametersException, TooManyClientsException, LessThanZeroClientsException // Constructor


	FacadeReservation facade;

	public Hotel(String name) throws Exception
	{
		this.Name = name;

		clients = new ArrayList<Client>();
		reservations = new ArrayList<Reservation>();
		rooms = new ArrayList<Room>();

		facade = new FacadeReservation(clients, reservations, rooms);


	}
}
