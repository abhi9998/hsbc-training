package com.demo.practical.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;


import com.demo.practical.entity.Apparel;
import com.demo.practical.entity.Electronics;
import com.demo.practical.entity.FoodItems;
import com.demo.practical.entity.Product;
import com.demo.practical.exceptions.DuplicateProductException;
import com.demo.practical.exceptions.NoProductExistsException;
import com.demo.practical.interfaces.ProductDAO;
/**
 * This is the implementation of ProductDAO
 * @author Abhi Zanzarukiya
 *
 */

public class ProductDAOHashMapImpl  implements ProductDAO{
	
	static HashSet<Integer> idSet  = new HashSet<>();
	static Map<Integer,FoodItems> foodList  = new HashMap<Integer,FoodItems>();
	static Map<Integer,Apparel> apparelList  = new HashMap<Integer,Apparel>();
	static Map<Integer,Electronics> electronicsList  = new HashMap<Integer,Electronics>();
	
	public  ProductDAOHashMapImpl() {
	
		electronicsList.put(1013, new Electronics(1013, "TV", 3000, 12, 100));
		electronicsList.put(1026, new Electronics(1026, "Mobile", 8000, 24, 97));
		electronicsList.put(1114, new Electronics(1114, "Watch", 1500, 18, 54));
		electronicsList.put(1115, new Electronics(1115, "Tablet", 1500, 18, 104));
		
		foodList.put(101,  new FoodItems(101, "Milk", 100, "12/09/2020","13/09/2020", "Yes", 40));
		foodList.put(102,  new FoodItems(102, "Curd", 50, "12/09/2020","13/09/2020", "Yes", 20));
		//foodList.put(111,  new FoodItems(111, "Cake", 1050, "12/09/2020","13/09/2020", "No", 12));
		
		apparelList.put(222, new Apparel(222, "T-shirt", 100, "Large", "Cotton", 50));
		apparelList.put(432, new Apparel(432, "shirt", 1000, "Medium", "Cotton", 32));
		apparelList.put(325, new Apparel(325, "Sweater", 500, "Large", "Medium", 20));
		idSet.add(1013);
		idSet.add(1026);
		idSet.add(1114);
		idSet.add(101);
		idSet.add(111);
		idSet.add(102);
		idSet.add(222);
		idSet.add(432);
		idSet.add(325);
		idSet.add(1115);
	}
	

	@Override
	/**
	 * Saves the product
	 */
	public String save(Product p) throws DuplicateProductException  {
		try {
			if(idSet.contains(p.getItemCode())){
	
				throw new DuplicateProductException();
			}else {
				//System.out.println(p.getClass().getName()+"here");
				if(p.getClass().getSimpleName().equals("FoodItems")) {
					foodList.put(p.getItemCode(), (FoodItems)p);
					idSet.add(p.getItemCode());
			
				}else if(p.getClass().getSimpleName().equals("Apparel")) {
					
					apparelList.put(p.getItemCode(), (Apparel)p);
					idSet.add(p.getItemCode());
				}else {
					electronicsList.put(p.getItemCode(), (Electronics)p);
					idSet.add(p.getItemCode());
				}
				return "Product Added SuccessFully";
			}
		}catch(DuplicateProductException ex) {
			throw ex;
		}
		
	}
	

	@Override
	/**
	 * Return top three
	 */
	public List<Product> returnTopThree(String category) {
		if(category.equals("FoodItems")) {
			
			
			List<FoodItems> custValue = new ArrayList<FoodItems>(foodList.values());
			Collections.sort(custValue, new MyListSorter());
			List<Product> resp = new ArrayList<>();
			int i=0;
			for(FoodItems f :custValue) {
				resp.add(f);
				i++;
				if(i==3)
					return resp;
			}
			return resp;
			
		}else if(category.equals("Electronics")) {
			List<Electronics> custValue = new ArrayList<Electronics>(electronicsList.values());
			Collections.sort(custValue, new MyListSorter());
			List<Product> resp = new ArrayList<>();
			int i=0;
			for(Electronics f :custValue) {
				resp.add(f);
				i++;
				if(i==3)
					return resp;
			}
			return resp;
			
		}else {
			
			List<Apparel> custValue = new ArrayList<Apparel>(apparelList.values());
			Collections.sort(custValue, new MyListSorter());
			List<Product> resp = new ArrayList<>();
			int i=0;
			for(Apparel f :custValue) {
				resp.add(f);
				i++;
				if(i==3)
					return resp;
			}
			return resp;
		}
		
	}

	@Override
	/**
	 * Remove the product
	 */
	public String remove(int id, String category) throws NoProductExistsException  {
		
		try {
			if(category.equals("FoodItems")) {
				if(foodList.containsKey(id)) {
					foodList.remove(id);
					idSet.remove(id);
					return "Removed";
				}else {
					throw new NoProductExistsException();
				}
			}else if(category.equals("Apparel")) {
				if(apparelList.containsKey(id)) {
					apparelList.remove(id);
					idSet.remove(id);
					return "Removed";
				}else {
					throw new NoProductExistsException();
				}
			}else {
				if(electronicsList.containsKey(id)) {
					electronicsList.remove(id);
					idSet.remove(id);
					return "Removed";
				}else {
					throw new NoProductExistsException();
				}
			}
		}catch(NoProductExistsException ex) {
			throw ex;
		}
		
	}
	
	

}

class MyListSorter implements Comparator<Product>{

	@Override
	public int compare(Product arg0, Product arg1) {
		// TODO Auto-generated method stub
		if((arg1.getQuantity())>(arg0.getQuantity())) {
			return 1;
		}else {
			return -1;
		}
		
	}
	
}
