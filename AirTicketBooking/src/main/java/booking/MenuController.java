package booking;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuController {
	MenuView view;
	MenuModel model;
	
	public MenuController(MenuView view,MenuModel model) {
		this.view=view;
		this.model=model;
		
		this.view.AddSelectButtonListener(new MenuSelectButtonListener());
	}
	
	class MenuSelectButtonListener implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			if(view.isSelectedDirectSearchButton()==true){
				model.choosingView(1);
			}
			else if(view.isSelectedAvailableDestinationsButton()==true){
				model.choosingView(2);
			}
			else if(view.isSelectedPossiblyAirportsToDestinationButton()==true){
				model.choosingView(3);
			}
			
		}
		
	}
}
