package booking;

import java.util.ArrayList;

//singleton design pattern

public class Database {

	private static Database instance;
	ArrayList<Flight> flightsList=new ArrayList<Flight>();
	
	
	private Database(){
		//nothing to do
	}

	public static Database getInstance(){
		if(instance==null) instance=new Database();
		return instance;
	}
}