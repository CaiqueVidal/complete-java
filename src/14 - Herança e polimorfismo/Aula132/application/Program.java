package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number od taxpayers: ");
		int n = sc.nextInt();
		
		List<TaxPayer> list = new ArrayList<>();
		
		for (int i=1; i<=n; i++) {
			System.out.println("Taxpayer #" + i + " data");
			System.out.print("Individual or company (i/c) ? ");
			char type = sc.next().charAt(0);
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Anual income: ");
			double anualIncome = sc.nextDouble();
			if (type == 'i') {
				System.out.print("Health expenditures: ");
				Double healthExpenditures = sc.nextDouble();
				list.add(new Individual(name, anualIncome, healthExpenditures));
			} else if (type == 'c') {
				System.out.print("Number of employees: ");
				int numberOfEmployees = sc.nextInt();
				list.add(new Company(name, anualIncome, numberOfEmployees));
			}
			
		}
		
		System.out.println("\nTAXES PAID: ");
		for (TaxPayer tp : list) {
			System.out.println(tp.getName() + ": $ " + String.format("%.2f", tp.tax()));
		}
		double sum = 0.0;
		for (TaxPayer tp : list) {
			sum += tp.tax();
		}
		
		System.out.println("TOTAL TAXES: $" + String.format("%.2f", sum));
		
		sc.close();
		
	}
	
}
