package com.demo.practical.service;

import java.util.List;

import com.demo.practical.entity.Product;
import com.demo.practical.exceptions.DuplicateProductException;
import com.demo.practical.exceptions.NoProductExistsException;
import com.demo.practical.interfaces.ProductDAO;
/**
 * This is the service class which receives request from main interaction layer
 * @author Abhi Zanzarukiya
 *
 */
public class ProductService {
	
	ProductDAO dao;
	
	public ProductService() {
		
	}
	
	public ProductService(ProductDAO dao) {
		this.dao =dao;
	}
	
	/**
	 * This methods add product in data store according to its type
	 * @param p is the product object passed 
	 * @return Success message 
	 */
	public String add(Product p) {
		
		try {
			 return dao.save(p);
		}catch(DuplicateProductException e) {
			throw new RuntimeException("Duplicate product");
		}
	}
	
	/**
	 * This lists top three items of particular category
	 * @param category String representing which category user passed
	 */
	public void showTopThree(String category) {
		
		List<Product> pro=dao.returnTopThree(category);
		for(Product p: pro) {
			System.out.println(p);
		}
		
	}
	
	/**
	 * This removes the  object of given id from category
	 * @param id - itemCode of the item
	 * @param category - category of the item
	 * @return Success message
	 */
	public String remove(int id ,String category) {
		try {
			return dao.remove(id, category);
		}catch(NoProductExistsException ex) {
			throw new RuntimeException("No product to remove");
		}
	}
	

}
