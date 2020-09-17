package com.demo.app;

import java.io.ObjectInputStream.GetField;

import com.demo.interfaces.EmpDao;
import com.demo.interfaces.MyFactory;
import com.demo.model.Emp;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmpDao e = MyFactory.getDao("jdbc");
		
		System.out.println(e.save(new Emp(100,"Abhi")));
		
		e.listAll();
		
		e.findById(100);

	}

}
