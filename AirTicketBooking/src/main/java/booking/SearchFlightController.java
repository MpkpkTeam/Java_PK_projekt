package booking;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SearchFlightController {
	
	private SearchFlightView view;
	private SearchFlightModel model;
	private int searchType;
	Database database;

	public SearchFlightController(SearchFlightView view,SearchFlightModel model) {
		this.view=view;
		this.model=model;
		
		database=Database.getInstance();
		
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
		}
		
	}
}
