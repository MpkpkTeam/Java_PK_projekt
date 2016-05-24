package booking;

public class Flight {
	private String flightNumber;
	private Airport to;
	private Airport from;
	
	//	pricing:
	//			0 - Economy Class
	//			1 - Economy Plus Class
	//			2 - Business Class
	private int[] pricing=new int[3];
	
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
	
	public String viewFlight(){
		return "From "+this.from.getCity()+"("+this.from.getIATA()+")"+","+this.from.getCountry()+" to "+this.to.getCity()+"("+this.to.getIATA()+")"+","+this.to.getCountry();
	}

	public int[] getPricing() {
		return pricing;
	}

	public void setPricing(int[] pricing) {
		this.pricing = pricing;
	}
}