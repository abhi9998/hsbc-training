package com.demo.app;

import java.io.IOException;

import com.demo.interfaces.EmpAlreadyExistsException;
import com.demo.interfaces.EmpDaoFileSystemImpl;
import com.demo.interfaces.EmpService;
/**
 * 
 * @author Abhi Zanzarukiya
 *
 */

public class AppRunner {

	public static void main(String[] args){
		EmpService e= null;
		try {
		 e = new EmpService(new EmpDaoFileSystemImpl());
		}catch(RuntimeException ex) {
		
			System.out.println(ex);
		}
		try {
			
		System.out.println(e.registerEmp(1002, "Abhi", "Umatwava", 10020.0)+" successfully added");
		}catch(EmpAlreadyExistsException ex) {
			System.out.println(ex.getMessage());
		}
		catch(RuntimeException ex) {
			System.out.println(ex);
		}

	}

}
