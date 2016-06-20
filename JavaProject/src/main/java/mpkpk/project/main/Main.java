package mpkpk.project.main;
import mpkpk.project.hotel.*;
import mpkpk.project.interf.RoomReserwationControler;
import mpkpk.project.interf.RoomReserwationModel;
import mpkpk.project.interf.RoomReserwationView;

public class Main {

	public static void main(String[] args) throws WrongParametersException, TooManyClientsException, LessThanZeroClientsException {
		System.out.println("Test");
		
		RoomReserwationView View = new RoomReserwationView();
		RoomReserwationModel Model = new RoomReserwationModel();
		
		RoomReserwationControler Controler = new RoomReserwationControler(Model, View);
	}
}
