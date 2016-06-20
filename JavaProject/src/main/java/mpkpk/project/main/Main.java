package mpkpk.project.main;
import mpkpk.project.hotel.*;
import mpkpk.project.interf.RoomReserwationControler;
import mpkpk.project.interf.RoomReserwationModel;
import mpkpk.project.interf.RoomReserwationView;
import mpkpk.project.interf.*;
public class Main {

	public static void main(String[] args) {
		System.out.println("Test");
		
		RoomReserwationModel Model = new RoomReserwationModel();
		RoomReserwationView View = new RoomReserwationView();
		RoomReserwationControler Controler = new RoomReserwationControler(Model, View);
		
	}
}
