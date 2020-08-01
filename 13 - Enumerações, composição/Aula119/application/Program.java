package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdfBirth = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Enter cliente data");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date birthDate = sdfBirth.parse(sc.next());
		Client client = new Client(name, email, birthDate);
		
		System.out.println("Enter order data");
		System.out.print("Status: ");
		OrderStatus status = OrderStatus.valueOf(sc.next());
		Order order = new Order(new Date(), status, client);
		
		System.out.print("How many items to this order? ");
		int nItems = sc.nextInt();
		
		for (int i=0; i<nItems; i++) {
			System.out.println("Enter #" + (i+1) + " item data");
			System.out.print("Product name: ");
			sc.nextLine();
			String productName = sc.nextLine();
			System.out.print("Product price: ");
			double productPrice = sc.nextDouble();
			Product product = new Product(productName, productPrice);
			
			System.out.print("Quantity: ");
			int quantity = sc.nextInt();
			OrderItem orderItem = new OrderItem(quantity, product);
			
			order.addItem(orderItem);
		}
		
		System.out.println("\nORDER SUMARY: ");
		System.out.println(order);
		
		
		sc.close();
		
	}
	
}
