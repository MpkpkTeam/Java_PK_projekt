package booking;

import java.math.BigDecimal;

public class Main {
	public static void main(String[] argv) {
		CustomerPreferences pref=new CustomerPreferences();
		pref.setCurrencyNumber(3);
		System.out.println(new ChooseConvert().choose(pref).convert(new BigDecimal("400")));
		Database database=Database.getInstance();
		new InitAirports().init();
		new InitFlights().init();

		MenuController controller=new MenuController(new MenuView(), new MenuModel());
	}
}