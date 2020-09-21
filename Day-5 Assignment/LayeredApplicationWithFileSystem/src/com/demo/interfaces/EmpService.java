package com.demo.interfaces;

import java.io.IOException;

import com.demo.entity.Emp;
/**
 * 
 * @author Abhi Zanzarukiya
 *
 */
public class EmpService {
	EmpDao dao; 
	
	public EmpService() {
		
	}
	public EmpService(EmpDao dao) {
		this.dao= dao;
	}
	
	public String registerEmp(int id, String name,String city,double salary) throws EmpAlreadyExistsException  {
		String resp;
		if(id<0||salary<0) {
			throw new RuntimeException("Improper data entry");
		}
		try {
		 resp = dao.save(new Emp(id,name,city,salary));
		
		}catch(EmpAlreadyExistsException e) {
			throw e;
		}
		catch(RuntimeException e) {
			throw e;
			
		}
		
			System.out.println("done service");
			return resp;
	}

}
