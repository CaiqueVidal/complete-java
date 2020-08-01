package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student[] students = new Student[10];
		
		System.out.print("How many rooms will be rented?");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			sc.nextLine();
			System.out.println("\nRent #" +i+":");
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
			students[room] = new Student(room, name, email);
		}
		
		sc.close();
		
		System.out.println("\nBusy rooms:");
		for(int i=0; i<students.length; i++) {
			if(students[i] != null) {
				System.out.println(students[i]);
			}
		}
		
	}
}
