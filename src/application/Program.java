package application;

import java.text.SimpleDateFormat;
import java.util.Date;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-YYYY");
		
		Department obj = new Department( 23, "Marketing");
		
		Seller seller = new Seller(24, "Alex Bob", "alex@gmail.com", new Date(), 3000.00, obj);
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		
		System.out.println(obj);
		System.out.println(seller);
		
	}
}
