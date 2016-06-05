package booking;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class SearchFlightController {
	
	private SearchFlightView view;
	private SearchFlightModel model;
	private int searchType;
	Database database;
	CustomerPreferences pref;

	public SearchFlightController(SearchFlightView view,SearchFlightModel model) {
		this.view=view;
		this.model=model;
		
		database=Database.getInstance();
		pref=CustomerPreferences.getInstance();
		
		this.view.addSearchButtonListener(new searchButtonListener());
		this.view.addBookButtonListener(new bookButtonListener());
	}
	
	class searchButtonListener implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			
			if(view.isSelectedDirectConnectionOption()){
				searchType=1;
			}
			else if(view.isSelectedAvailableDestinationsOption()){
				searchType=2;
			}
			else if(view.isSelectedStartAirportOption()){
				searchType=3;
			}
			
			//setting currency
			
			if(view.isSelectedPlnOption()){
				pref.setCurrencyNumber(0);
			}
			else if(view.isSelectedUsdOption()){
				pref.setCurrencyNumber(1);
			}
			else if(view.isSelectedGbpOption()){
				pref.setCurrencyNumber(2);
			}
			else if(view.isSelectedGbpOption()){
				pref.setCurrencyNumber(3);
			}
			
			//setting type of ticket
			
			if(view.isSelectedEconomyClassOption()){
				pref.setTypeOfTicket(0);
			}
			else if(view.isSelectedEconomyPlusClassOption()){
				pref.setTypeOfTicket(1);
			}
			else if(view.isSelectedBusinessClassOption()){
				pref.setTypeOfTicket(2);
			}
			
			model.search(view.getStartAirport(), view.getEndAirport(), searchType);
			
			view.clearResults();
			
			for(int i=0;i<database.getResultList().size();i++){
				view.addResult(database.getResultList().get(i).viewFlight());
			}
			
		}
	}
	
	class bookButtonListener implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			
			System.out.println(view.choosenFlight());
			System.out.println(database.getResultList().get(view.choosenFlight()).viewFlight());
			System.out.println("Type of ticket"+pref.getTypeOfTicket());
			System.out.println("Currency:"+pref.getCurrencyNumber());
			
			new OrderDetailsView();
		}
		
	}
}
