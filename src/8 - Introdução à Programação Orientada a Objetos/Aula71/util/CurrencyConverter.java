package util;

public class CurrencyConverter {

	public static final double IOF = 0.06;
	
	public static double convertCurrency(double price, double amount) {
		
		return ((price * IOF) + price) * amount;
	}
	
}
