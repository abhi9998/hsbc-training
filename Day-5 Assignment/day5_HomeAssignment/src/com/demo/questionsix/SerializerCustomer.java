package com.demo.questionsix;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
/**
 * 
 * @author Abhi Zanzarukiya
 *
 */


public class SerializerCustomer {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileOutputStream fos = new FileOutputStream("customers.ser");
		ObjectOutputStream objOut = new ObjectOutputStream(fos);
		for(int i=0;i<3;i++) {
		Customer c = new Customer(50+i,"Abhi"+i,"Ahmedabad"+i);
		objOut.writeObject(c);
		}
		objOut.close();
		
		System.out.println("Customers serialized");
	}

}
