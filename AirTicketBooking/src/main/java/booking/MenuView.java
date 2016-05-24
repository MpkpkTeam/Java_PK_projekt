package booking;

import java.awt.GridLayout;

import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MenuView extends JFrame{
	private JPanel mainPanel;
	
	@SuppressWarnings("unused")
	private JLabel headerText;
	private JRadioButton directSearchButton;
	private JRadioButton availableDestinationsButton;
	private JRadioButton possiblyAirportsToDestinationButton;
	private JButton selectButton;
	private ButtonGroup buttonGroup;
	
	public MenuView() {
		this.setTitle("Air Ticket Booking");
		this.setSize(300, 300);
		layoutConfig();
		
		JLabel headerText=new JLabel("Select a way of booking a tickets:");
		availableDestinationsButton=new JRadioButton("Search for available destinations");
		possiblyAirportsToDestinationButton=new JRadioButton("Search a start airport for your destination");
		selectButton=new JButton("Select");
		buttonGroup=new ButtonGroup();
		
		directSearchButton=new JRadioButton("Select a direct connections");
		buttonGroup.add(directSearchButton);
		buttonGroup.add(availableDestinationsButton);
		buttonGroup.add(possiblyAirportsToDestinationButton);
		
		mainPanel.add(headerText);
		mainPanel.add(Box.createVerticalGlue());
		mainPanel.add(directSearchButton);
		mainPanel.add(availableDestinationsButton);
		mainPanel.add(possiblyAirportsToDestinationButton);
		mainPanel.add(Box.createVerticalGlue());
		mainPanel.add(selectButton);
		
		this.add(mainPanel);
		this.setVisible(true);
	}
	
	private void layoutConfig(){
		mainPanel=new JPanel();
		
		GridLayout mainPanelLayout=new GridLayout(8, 0);
		
		mainPanel.setLayout(mainPanelLayout);

	}
}