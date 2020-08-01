package exercicio01.application;

import java.util.Scanner;

import exercicio01.entities.Rectangle;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Rectangle rectangle = new Rectangle();

		System.out.print("Enter width: ");
		rectangle.width = sc.nextDouble();
		System.out.print("Enter height: ");
		rectangle.height = sc.nextDouble();

		sc.close();

		System.out.printf("Area = %.2f %n", rectangle.area());
		System.out.printf("Perimeter = %.2f %n", rectangle.perimeter());
		System.out.printf("Diagonal = %.2f %n", rectangle.diagonal());

	}

}
