package booking;

//strategy design pattern

public class ChooseConvert {
	CashConvert choose(CustomerPreferences pref){
		if(pref.getCurrencyNumber()==0){
			return new ToPLN();
		}
		else if(pref.getCurrencyNumber()==1){
			return new ToUSD();
		}
		else if(pref.getCurrencyNumber()==2){
			return new ToGBP();
		}
		else if(pref.getCurrencyNumber()==3){
			return new ToEUR();
		}
		else{
			return null;
		}
	}
}