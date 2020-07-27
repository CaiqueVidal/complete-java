package exercicio02.application;

import java.util.Scanner;
import exercicio02.entities.Employee;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Employee emp = new Employee();
		
		System.out.print("Name: ");
		emp.name = sc.nextLine();
		System.out.print("Gross salary: ");
		emp.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		emp.tax = sc.nextDouble();
		
		System.out.printf("%nEmployee: %s %n", emp);
		System.out.printf("%nWhich percentage to increase salary? ");
		double percentage = sc.nextDouble();
		emp.increaseSalary(percentage);
		System.out.printf("%nUpdated data: %s",emp);
		
		sc.close();
	}

}
