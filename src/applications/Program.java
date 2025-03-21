package applications;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("=========== TEST 1: seller findById ==========");
		Seller seller = sellerDao.findById(3);
		
		
		System.out.println(seller);
		
		System.out.println("\n=========== TEST 2: seller findById ==========");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findSellerByDepartment(department);
		
		for(Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\n=========== TEST 3: seller findAll ==========");
		
		list = sellerDao.findAll();
		
		for(Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\n=========== TEST 4: Insert ==========");
		Seller Vendedor1 = new Seller(null, "Greg", "greg@email.com", new Date(), 4000.0, department);
		
		sellerDao.insert(Vendedor1);
		
		System.out.println("Inserted! New id = " + Vendedor1.getId());
		
		System.out.println("\n=========== TEST 5: UPDATE ==========");
		seller = sellerDao.findById(9);
		seller.setName("Martha Waine");
		sellerDao.update(seller);
		System.out.println("Update completo");
	}

}
