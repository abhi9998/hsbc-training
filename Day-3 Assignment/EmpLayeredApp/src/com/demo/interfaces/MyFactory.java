package com.demo.interfaces;

import com.demo.impl.hibernate.EmpDaoMockHibernateImpl;
import com.demo.impl.jdbc.EmpDaoMockJdbcImpl;

public class MyFactory  {
	
	public static EmpDao getDao(String name) {
		
		if(name.equals("jdbc"))
			return new EmpDaoMockJdbcImpl();
		else if(name.equals("hibernate"))
			return new EmpDaoMockHibernateImpl();
		else
			return null;
	}

}
