package com.demo.practical.service;

import com.demo.practical.entity.Product;
import com.demo.practical.exceptions.DuplicateProductException;
import com.demo.practical.interfaces.ProductDAO;
/**
 * This is the service class
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
	
	public String add(Product p) {
		
		try {
			 return dao.save(p);
		}catch(DuplicateProductException e) {
			throw e;
		}
	}
	
	public void showTopThree(String category) {
		
		dao.returnTopThree(category);
	}
	
	public String remove(int id ,String category) {
		try {
			return dao.remove(id, category);
		}catch(RuntimeException ex) {
			throw ex;
		}
	}
	

}
