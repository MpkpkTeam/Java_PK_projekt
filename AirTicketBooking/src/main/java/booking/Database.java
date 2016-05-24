package booking;

import java.util.ArrayList;

//singleton design pattern

public class Database {

	private static Database instance;
	
	private ArrayList<Flight> flightsList=new ArrayList<Flight>();
	private ArrayList<Airport> airportsList=new ArrayList<Airport>();
	private ArrayList<Ticket> ticketsList=new ArrayList<Ticket>();
	
	private Database(){
		//nothing to do
	}

	public static Database getInstance(){
		if(instance==null) instance=new Database();
		return instance;
	}

	public ArrayList<Flight> getFlightsList() {
		return flightsList;
	}

	public void setFlightsList(ArrayList<Flight> flightsList) {
		this.flightsList = flightsList;
	}

	public ArrayList<Airport> getAirportsList() {
		return airportsList;
	}

	public void setAirportsList(ArrayList<Airport> airportsList) {
		this.airportsList = airportsList;
	}

	public ArrayList<Ticket> getTicketsList() {
		return ticketsList;
	}

	public void setTicketsList(ArrayList<Ticket> ticketsList) {
		this.ticketsList = ticketsList;
	}
}