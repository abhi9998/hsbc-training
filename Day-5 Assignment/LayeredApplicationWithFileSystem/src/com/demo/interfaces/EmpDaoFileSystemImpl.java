package com.demo.interfaces;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.FileWriter;

import com.demo.entity.Emp;
/**
 * 
 * @author Abhi Zanzarukiya
 *
 */

public class EmpDaoFileSystemImpl  implements EmpDao {
	FileWriter fw = null;
	FileReader fr = null;
	BufferedReader br = null;
	
	public EmpDaoFileSystemImpl()  {
		try {
		fw = new FileWriter("emp.txt",true);
			
		}catch(Exception e) {
			throw new RuntimeException("Error in connecting to database");
		}
	}

	@Override
	public String save(Emp emp) throws EmpAlreadyExistsException  {
		String app = null;
		try {
		
			boolean isDuplicated = isDuplicate(emp.getEmpId());
		
		
			if(isDuplicated==true)
				throw new EmpAlreadyExistsException("Emp with this id already exists");
		
		
			 app = emp.toString();
		
			fw.write(app+"\n");
			fw.flush();
		}catch(EmpAlreadyExistsException e) {
			throw e;
		}
		catch(Exception e) {
			throw new RuntimeException("Cannot save data to database");
		}
		//System.out.println("done daoimpl");
		return app;
	}
	
	private boolean isDuplicate(int empid) {
		try {
			br =new BufferedReader( new FileReader("emp.txt"));
			
			String line="";
			while((line=br.readLine())!=null) {
				if(line.contains(empid+"")) {
					br.close();
					return true;
				}
			}
			
		}catch(Exception e) {
			System.out.println(e);
		}
		return false;
	}
	
	
	

}
