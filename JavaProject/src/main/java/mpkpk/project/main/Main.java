package mpkpk.project.main;
import mpkpk.project.hotel.*;
import mpkpk.project.interf.RoomReserwationControler;
import mpkpk.project.interf.RoomReserwationModel;
import mpkpk.project.interf.RoomReserwationView;
import mpkpk.project.interf.*;
public class Main {

	public static void main(String[] args) throws WrongParametersException, TooManyClientsException, LessThanZeroClientsException {
		System.out.println("Test");
		
<<<<<<< HEAD
		RoomReserwationModel Model = new RoomReserwationModel();
		RoomReserwationView View = new RoomReserwationView();
		RoomReserwationControler Controler = new RoomReserwationControler(Model, View);
		
=======
		Hotel hotel = new Hotel("TODO Nazwa");
>>>>>>> c194238f8fad720e05709345c9998cd7cec33918
	}
}
