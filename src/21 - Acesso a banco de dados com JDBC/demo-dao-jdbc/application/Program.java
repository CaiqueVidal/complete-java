package application;


import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("--Test: seller findById--");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		System.out.println("\n--Test: seller findByDepartment--");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for (Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\n--Test: seller findAll--");
		list = sellerDao.findAll();
		for (Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\n--Test: seller insert--");
		Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, department);
		sellerDao.insert(newSeller);
		System.out.println("Inserted! New id = " + newSeller.getId());
		
		System.out.println("\n--Test: seller update--");
		seller = sellerDao.findById(7);
		seller.setName("Carl");
		seller.setEmail("carl@gmail.com");
		seller.setBaseSalary(3800.0);
		sellerDao.update(seller);
		System.out.println("Update completed");
		
		System.out.println("\n--Test: seller delete--");
		System.out.println("Enter id for delete test: ");
		int id = sc.nextInt();
		sellerDao.deleteById(id);
		System.out.println("Delete completed");
		
		sc.close();
	}

}
