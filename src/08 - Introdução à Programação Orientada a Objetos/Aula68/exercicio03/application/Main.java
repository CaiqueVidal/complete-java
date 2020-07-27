package exercicio03.application;

import java.util.Scanner;

import exercicio03.entities.Student;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		System.out.print("Enter name: ");
		student.name = sc.nextLine();
		System.out.print("Enter grade1(max 30): ");
		student.grades[0] = sc.nextDouble();
		System.out.print("Enter grade2(max 35): ");
		student.grades[1] = sc.nextDouble();
		System.out.print("Enter grade3(max 35): ");
		student.grades[2] = sc.nextDouble();

		sc.close();
		
		System.out.printf("\nFinal Grade = %.2f %n", student.finalGrade());
		if (student.finalGrade() > 60) {
			System.out.println("Pass");
		}
		else{
			System.out.println("Failed");
			System.out.printf("Missing %.2f points", student.missingPoints() );
		}
		
	}

}
