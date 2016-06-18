package booking;

//factory design pattern

public class TicketFactory {
	
	CustomerPreferences pref;
	Ticket ticket;
	
	public Ticket factory() {
		switch(pref.getTypeOfTicket()){
		case 1:
			ticket=new EconomyClassTicket();
		case 2:
			ticket=new EconomyPlusClassTicket();
		case 3:
			ticket=new BusinessClassTicket();
		default:
			ticket=null;
		
		return ticket;
		}
	}

}
