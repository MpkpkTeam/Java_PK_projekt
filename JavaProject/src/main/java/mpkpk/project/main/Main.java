package mpkpk.project.main;
import mpkpk.project.hotel.*;
import mpkpk.project.interf.RoomReservationController;
import mpkpk.project.interf.RoomReservationModel;
import mpkpk.project.interf.RoomReservationView;

public class Main {

	public static void main(String[] args) throws WrongParametersException, TooManyClientsException, LessThanZeroClientsException {
		System.out.println("Test");
		
		RoomReservationView View = new RoomReservationView();
		RoomReservationModel Model = new RoomReservationModel();
		
		RoomReservationController Controller = new RoomReservationController(Model, View);
	}
}
