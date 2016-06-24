package mpkpk.project.main;

import java.util.ArrayList;

import mpkpk.project.*;
import mpkpk.project.hotel.Client;
import mpkpk.project.hotel.FacadeReservation;
import mpkpk.project.hotel.Reservation;
import mpkpk.project.hotel.Room;

public class Hotel
{

	public String Name; // Hotel name

	ArrayList<Client> clients; // List of clients
	ArrayList<Reservation> reservations; // List of reservations
	ArrayList<Room> rooms; // List of rooms

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
