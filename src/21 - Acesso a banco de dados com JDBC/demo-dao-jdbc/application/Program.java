package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
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

	}

}
