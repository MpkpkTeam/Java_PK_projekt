package booking;

public class Flight {
	private String flightNumber;
	private Airport to;
	private Airport from;
	
	public Flight(String flightNumber,Airport to,Airport from) {
		this.flightNumber=flightNumber;
		this.to=to;
		this.from=from;
	}
	
	public String getFlightNumber(){
		return flightNumber;
	}
	
	public Airport getTo(){
		return to;
	}
	
	public Airport getFrom(){
		return from;
	}
}