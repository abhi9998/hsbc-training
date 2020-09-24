package com.demo.practical.app;

import java.util.Scanner;

import com.demo.practical.entity.Apparel;
import com.demo.practical.entity.Electronics;
import com.demo.practical.entity.FoodItems;
import com.demo.practical.impl.ProductDAOHashMapImpl;
import com.demo.practical.service.ProductService;
/**
 * This is the main interaction layer which takes input from user about adding product, removing product and displaying top 3 products of each category.
 * @author Abhi Zanzarukiya
 *
 */
public class MainApp {

	public static void main(String[] aargs) {
		// TODO Auto-generated method stub
		
		ProductService pser = new ProductService(new ProductDAOHashMapImpl());
		
	
		Scanner s= new Scanner(System.in);
		while(true){
			System.out.println("Select option");
			System.out.println("1 - Add Product");
			System.out.println("2 - Remove Product");
			System.out.println("3 - Top Three Product");
			System.out.println("4 - Exit");
			
			int opt = s.nextInt();
			s.nextLine();
			switch(opt) {
			
			case 1: {
					System.out.println("select what to insert");
					System.out.println("1- Food");
					System.out.println("2- Apparel");
					System.out.println("3- Electronics");
					opt =s.nextInt();
					s.nextLine();
					switch(opt) {
						
						case 1:{
							System.out.println("itemCode itemName, unitPrice, DateOfM, DateOfE, Vegeterian, Quantity");
							String input = s.nextLine();
							String args[] = input.split(" ");
							try {
							pser.add(new FoodItems(Integer.parseInt(args[0]),
									args[1],
									Double.valueOf(args[2]),
									args[3],
									args[4],
									args[5],
									Integer.parseInt(args[6])));
							}catch(RuntimeException ex) {
								System.out.println(ex.getMessage());
							}
							break;
							
						}
						
						case 2:{
							System.out.println("itemCode itemName, unitPrice, size, material, quantity");
							String input = s.nextLine();
							String args[] = input.split(" ");
							try {
							pser.add(new Apparel(Integer.parseInt(args[0]),
									args[1],
									Double.valueOf(args[2]),
									args[3],
									args[4],
									Integer.parseInt(args[5])));
							}catch(RuntimeException e) {
								System.out.println(e.getMessage());
							}
							break;
						}
						
						case 3:{
							System.out.println("itemCode itemName, unitPrice, warrenty, quantity");
							String input = s.nextLine();
							String args[] = input.split(" ");
							try {
							pser.add(new Electronics(Integer.parseInt(args[0]),
									args[1],
									Double.valueOf(args[2]),
									Integer.valueOf(args[3]),
									Integer.parseInt(args[4])));
							}catch(RuntimeException e) {
								System.out.println(e.getMessage());
							}
							break;
							}
					}
					break;
				}
			
			case 2:{
				System.out.println("Enter id and category to remove");
				String line = s.nextLine();
				String args[]=line.split(" ");
				try {
				pser.remove(Integer.valueOf(args[0]), args[1]);
				}catch(RuntimeException e) {
					System.out.println(e.getMessage());
				}
				break;
				
			}
			
			case 3:{
				System.out.println("Enter category to print FoodItems or Electronics or Apparel");
				String line = s.nextLine();
				pser.showTopThree(line);
				break;
			}
			
			case 4:{
				return;
			}
			
			
			}
		}
	}

}
