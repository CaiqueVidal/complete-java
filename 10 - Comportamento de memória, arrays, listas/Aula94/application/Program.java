package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> list = new ArrayList<>();
		
		System.out.print("How many employees will be registered?");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {			
			System.out.println("\nEmployee #" + i +":");
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			
			Employee emp = new Employee(id, name, salary);
			
			list.add(emp);
			
		}
		
		System.out.print("\nEnter the employee id that will have salary increase: ");
		int id = sc.nextInt();
		Integer idIndex= Employee.idIndex(list, id);
		
		if (idIndex == null) {
			System.out.println("This id does not exist!");
		} else {
			System.out.println("Enter the percentage: ");
			list.get(idIndex).increaseSalary(sc.nextDouble());
		}
		
		sc.close();
		
		System.out.println("\nList of employees:");
		for (Employee emp : list) {
			System.out.println(emp);
		}
		
	}
	
}
