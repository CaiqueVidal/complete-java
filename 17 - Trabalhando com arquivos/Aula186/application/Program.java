package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Product> list = new ArrayList<>();
		
		System.out.println("Enter file path: ");
		String sourceFileStr = sc.nextLine();

		File sourceFile = new File(sourceFileStr);
		String sourceFolderStr = sourceFile.getParent();
		
		new File(sourceFile.getParent() + "\\out").mkdir();
		String targetFileStr = sourceFolderStr + "\\out\\summary.csv";
		
		
		try (BufferedReader br = new BufferedReader(new FileReader(sourceFileStr))){
			String line = br.readLine();
			while (line != null) {
				
				String[] fields = line.split(",");
				String name = fields[0];
				double price = Double.parseDouble(fields[1]);
				int quantity = Integer.parseInt(fields[2]);
				list.add(new Product(name, price, quantity));
				
				line = br.readLine();
			}
			
		} catch (IOException e) {
			System.out.println("Error reading file: " + e.getMessage());
		}
		
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr))){
			for (Product product : list) {
				bw.write(product.toString());
				bw.newLine();
			}
			System.out.print("Writing success");
		}
		catch (IOException e) {
			System.out.println("Error writing file: " + e.getMessage());
		}
		
		sc.close();
	}
}
