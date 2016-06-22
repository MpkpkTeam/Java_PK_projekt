package mpkpk.project.interf;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class AddReservationController {
	
	protected RoomReservationModel Model;
	protected AddReservationView View;
	
	public AddReservationController(RoomReservationModel Model){
		
		this.Model = Model;
		View = new AddReservationView();

		this.View.addCheckFreeRoomsButtonListener(new AddCheckFreeRoomsButtonListener());
		this.View.addCancelButtonListener(new AddCancelButtonListener());
		this.View.addAddReservationButtonListener(new AddReservationButtonListener());
	}
	
	class AddCheckFreeRoomsButtonListener implements ActionListener{

		public void actionPerformed(ActionEvent e) {

			try {
				Model.CheckFreeRooms(View.comboBox.getSelectedItem().toString(), View.comboBox_1.getSelectedItem().toString(), View.comboBox_2.getSelectedItem().toString(), View.comboBox_3.getSelectedItem().toString(), View.comboBox_4.getSelectedItem().toString(), View.comboBox_5.getSelectedItem().toString(), View.comboBox_6.getSelectedItem().toString());
			} catch (NumberFormatException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
				View.setFreeRooms(Model.SetFreeRooms());
		}
	}
	
	class AddCancelButtonListener implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			View.Addreserwation.dispose();
			
		}
		
	}
	
	class AddReservationButtonListener implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			if(View.table.getSelectedRow() != -1)
			try {
				Model.AddReservation(View.textField.getText(), View.textField_1.getText(), View.textField_2.getText(), View.comboBox_6.getSelectedItem().toString(), View.table.getSelectedRow());
			}
			catch (NumberFormatException e1)
			{
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		}
		
	}
}
