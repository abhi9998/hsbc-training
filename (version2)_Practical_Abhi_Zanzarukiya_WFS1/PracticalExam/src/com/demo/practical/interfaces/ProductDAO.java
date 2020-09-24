package com.demo.practical.interfaces;

import java.util.List;

import com.demo.practical.entity.Product;
import com.demo.practical.exceptions.DuplicateProductException;
import com.demo.practical.exceptions.NoProductExistsException;
/**
 * THis is the interface
 * @author Abhi Zanzarukiya
 *
 */
public interface ProductDAO {
	
	/**
	 * This is used to save the product
	 * @param p Product object
	 * @return Success Message
	 * @throws DuplicateProductException
	 */
	public String save(Product p) throws DuplicateProductException ;
	
	/**
	 * This is used to get topthree sales
	 * @param category is the string of whose topthree we want to find
	 * @return List
	 */
	public List<Product> returnTopThree(String category);
	
	/**
	 * This is used to remove the item from the store
	 * @param id is of item
	 * @param category categorty of item
	 * @return Success message
	 * @throws NoProductExistsException
	 */
	public String remove(int id, String category) throws NoProductExistsException;

}
