package booking;

public class InitFlights {
	void init(){
		Database database=Database.getInstance();
		//flights from Warsaw
		database.getFlightsList().add(new Flight("1", database.getAirportsList().get(0), database.getAirportsList().get(1)));
		database.getFlightsList().add(new Flight("2", database.getAirportsList().get(0), database.getAirportsList().get(2)));
		database.getFlightsList().add(new Flight("3", database.getAirportsList().get(0), database.getAirportsList().get(3)));
		database.getFlightsList().add(new Flight("4", database.getAirportsList().get(0), database.getAirportsList().get(4)));
		database.getFlightsList().add(new Flight("5", database.getAirportsList().get(0), database.getAirportsList().get(5)));
		
		//Flights from Krakow
		database.getFlightsList().add(new Flight("6", database.getAirportsList().get(1), database.getAirportsList().get(0)));
		database.getFlightsList().add(new Flight("7", database.getAirportsList().get(1), database.getAirportsList().get(2)));
		database.getFlightsList().add(new Flight("8", database.getAirportsList().get(1), database.getAirportsList().get(3)));
		database.getFlightsList().add(new Flight("9", database.getAirportsList().get(1), database.getAirportsList().get(4)));
		database.getFlightsList().add(new Flight("10", database.getAirportsList().get(1), database.getAirportsList().get(5)));
	}
}
