package com.demo.io.ser;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

import com.demo.io.entity.Emp;

public class MyEmpArrayDeserializer {

	public static void main(String[] args)  throws Exception{
		
		FileInputStream fis = new FileInputStream("D:\\training_hsbc\\io\\emp.ser");
		
		ObjectInputStream objIn = new ObjectInputStream(fis);
		
	//	Object obj = objIn.readObject();
	//	System.out.println(obj.getClass().getName());
	//	System.out.println(obj.getClass().getCity());
	//	Emp e =(Emp)obj;
		
		
		try {
		//	while(true) {
			Emp[] empList = (Emp[])objIn.readObject();
			for(Emp e:empList)
			System.out.println(empList[0].getEmpId()+" "+empList[1].getName());
		//	}
		}catch(EOFException e) {
			System.out.println("Done...");
		}
		
		objIn.close();
		//System.out.println(e.getEmpId()+" "+e.getName());
		

	}

}
