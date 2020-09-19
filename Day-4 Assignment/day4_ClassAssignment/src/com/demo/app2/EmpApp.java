package com.demo.app2;

import com.demo.app2.dao.EmpDao;
import com.demo.app2.dao.EmpDaoImpl;
import com.demo.app2.dao.EmpService;

public class EmpApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmpDao dao = new EmpDaoImpl();
		
		EmpService service = new EmpService(dao);
		String resp = service.registerEmp(100,"James");
		System.out.println(resp);

	}

}
