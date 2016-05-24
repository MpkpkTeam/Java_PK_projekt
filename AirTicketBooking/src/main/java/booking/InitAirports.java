package booking;

public class InitAirports {
	void init(){
		Database database=Database.getInstance();
		database.getAirportsList().add(new Airport("WAW", "Warsaw", "Poland"));
		database.getAirportsList().add(new Airport("KRK", "Krakow", "Poland"));
		database.getAirportsList().add(new Airport("MUC", "Munic", "Germany"));
		database.getAirportsList().add(new Airport("FRA", "Frankfurt", "Germany"));
		database.getAirportsList().add(new Airport("LHR", "London", "England"));
		database.getAirportsList().add(new Airport("STN", "London", "England"));
	}
}
