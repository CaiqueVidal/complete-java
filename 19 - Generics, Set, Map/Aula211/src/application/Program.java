package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner (System.in);
		
		Set<Integer> courseA = new HashSet<>();
		Set<Integer> courseB = new HashSet<>();
		Set<Integer> courseC = new HashSet<>();
		
		System.out.print("How many students for course A? ");
		int n = sc.nextInt();
		for (int i=0; i<n; i++) {
			int number = sc.nextInt();
			courseA.add(number);
		}
		
		System.out.print("How many students for course B? ");
		n = sc.nextInt();
		for (int i=0; i<n; i++) {
			int number = sc.nextInt();
			courseB.add(number);
		}
		
		System.out.print("How many students for course C? ");
		n = sc.nextInt();
		for (int i=0; i<n; i++) {
			int number = sc.nextInt();
			courseC.add(number);
		}
		
		Set<Integer> total = new HashSet<>(courseA);
		total.addAll(courseB);
		total.addAll(courseC);
		
		System.out.println("Total students: " + total.size());
		
		sc.close();
	}
	
}
