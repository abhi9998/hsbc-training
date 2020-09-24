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
	
	public String save(Product p) throws DuplicateProductException ;
	public List<Product> returnTopThree(String category);
	public String remove(int id, String category) throws NoProductExistsException;

}
