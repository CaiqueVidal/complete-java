package application;

import java.util.Scanner;

import util.CurrencyConverter;

public class Program {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dollar price?");
		double dollarPrice = sc.nextDouble();
		System.out.print("How many dollars will be bought?");
		double dollarAmount = sc.nextDouble();
		
		sc.close();
		
		System.out.printf("Amount to be paid in reais = %.2f", CurrencyConverter.convertCurrency(dollarPrice, dollarAmount));
	}
}
