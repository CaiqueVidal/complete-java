package services;

public interface Payment {
	double paymentFee(double amount);
	double interest(double amount, int months);
}
