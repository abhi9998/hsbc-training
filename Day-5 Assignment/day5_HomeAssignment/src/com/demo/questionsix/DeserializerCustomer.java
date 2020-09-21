package com.demo.questionsix;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
/**
 * 
 * @author Abhi Zanzarukiya
 *
 */



public class DeserializerCustomer {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		FileInputStream fis = new FileInputStream("customers.ser");
		
		ObjectInputStream objIn = new ObjectInputStream(fis);
		
	//	Object obj = objIn.readObject();
	//	System.out.println(obj.getClass().getName());
	//	System.out.println(obj.getClass().getCity());
	//	Emp e =(Emp)obj;
		
		
		try {
			while(true) {
			Customer e = (Customer)objIn.readObject();
			
			System.out.println(e.getCustomertId()+" "+e.getName());
			}
		}catch(EOFException e) {
			System.out.println("Done...");
		}
		
		objIn.close();

	}

}
