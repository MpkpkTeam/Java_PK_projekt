package booking;

import java.math.BigDecimal;

public class Main {
	public static void main(String[] argv) {
		CustomerPreferences pref=new CustomerPreferences();
		pref.setCurrencyNumber(3);
		System.out.println(new ChooseConvert().choose(pref).convert(new BigDecimal("400")));
	}
}