package application;


import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
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
		List<Seller> listSeller = sellerDao.findByDepartment(department);
		for (Seller obj : listSeller) {
			System.out.println(obj);
		}
		
		System.out.println("\n--Test: seller findAll--");
		listSeller = sellerDao.findAll();
		for (Seller obj : listSeller) {
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
		int idSeller = sc.nextInt();
		sellerDao.deleteById(idSeller);
		System.out.println("Seller deletion completed");
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("\n--Test: department findById--");
		Department department2 = departmentDao.findById(2);
		System.out.println(department2);
		
		System.out.println("\n--Test: department findAll--");
		List<Department> listDepartment = departmentDao.findAll();
		for (Department obj : listDepartment) {
			System.out.println(obj);
		}
		
		System.out.println("\n--Test: department insert--");
		Department newDepartment = new Department(null, "Clothes");
		departmentDao.insert(newDepartment);
		System.out.println("Inserted! New Id = " + newDepartment.getId());
		
		System.out.println("\n--Test: department update--");
		department = departmentDao.findById(3);
		department.setName("Music");
		departmentDao.update(department);
		System.out.println("Update completed");
		
		System.out.println("\n--Test: department delete--");
		System.out.println("Enter id for delete test: ");
		int idDepartment = sc.nextInt();
		departmentDao.deleteById(idDepartment);
		System.out.println("Department deletion completed");
		
		sc.close();
	}

}
