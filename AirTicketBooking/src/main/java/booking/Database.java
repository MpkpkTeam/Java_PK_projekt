package booking;

import java.util.ArrayList;

//singleton design pattern

public class Database {

	private static Database instance;
	
	private static ArrayList<Flight> flightsList;
	private static ArrayList<Airport> airportsList;
	private static ArrayList<Ticket> ticketsList;
	private static ArrayList<Flight> resultList;
	
	private Database(){
		flightsList=new ArrayList<Flight>();
		airportsList=new ArrayList<Airport>();
		ticketsList=new ArrayList<Ticket>();
		resultList=new ArrayList<Flight>();
		
		initAirports();
		initFlights();
	}

	public static Database getInstance(){
		if(instance==null) instance=new Database();
		return instance;
	}

	public ArrayList<Flight> getFlightsList() {
		return Database.flightsList;
	}

	public void setFlightsList(ArrayList<Flight> flightsList) {
		Database.flightsList = flightsList;
	}

	public ArrayList<Airport> getAirportsList() {
		return Database.airportsList;
	}

	public void setAirportsList(ArrayList<Airport> airportsList) {
		Database.airportsList = airportsList;
	}

	public ArrayList<Ticket> getTicketsList() {
		return Database.ticketsList;
	}

	public void setTicketsList(ArrayList<Ticket> ticketsList) {
		Database.ticketsList = ticketsList;
	}

	public ArrayList<Flight> getResultList() {
		return Database.resultList;
	}

	public void setResultList(ArrayList<Flight> resultList) {
		Database.resultList = resultList;
	}
	
	private void initAirports(){
		airportsList.add(new Airport("WAW", "Warsaw", "Poland"));
		airportsList.add(new Airport("KRK", "Krakow", "Poland"));
		airportsList.add(new Airport("MUC", "Munich", "Germany"));
		airportsList.add(new Airport("FRA", "Frankfurt", "Germany"));
		airportsList.add(new Airport("LHR", "London", "England"));
		airportsList.add(new Airport("STN", "London", "England"));
		airportsList.add(new Airport("STN", "London", "England"));
	}
	
	private void initFlights(){
		//flights from Warsaw
		flightsList.add(new Flight("1", airportsList.get(0), airportsList.get(1)));
		flightsList.add(new Flight("2", airportsList.get(0), airportsList.get(2)));
		flightsList.add(new Flight("3", airportsList.get(0), airportsList.get(3)));
		flightsList.add(new Flight("4", airportsList.get(0), airportsList.get(4)));
		flightsList.add(new Flight("5", airportsList.get(0), airportsList.get(5)));
		
		//Flights from Krakow
		flightsList.add(new Flight("6", airportsList.get(1), airportsList.get(0)));
		flightsList.add(new Flight("7", airportsList.get(1), airportsList.get(2)));
		flightsList.add(new Flight("8", airportsList.get(1), airportsList.get(3)));
		flightsList.add(new Flight("9", airportsList.get(1), airportsList.get(4)));
		flightsList.add(new Flight("10", airportsList.get(1), airportsList.get(5)));
	}
}