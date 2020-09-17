package com.demo.impl.hibernate;


import com.demo.interfaces.EmpDao;
import com.demo.model.Emp;

public class EmpDaoMockHibernateImpl implements EmpDao{

	@Override
	public Emp findById(int id) {
		System.out.println("JDBC: Employee found");
		return null;
	}

	@Override
	public String save(Emp e) {
		// TODO Auto-generated method stub
		return "JDBC: Employee saved";
	}

	@Override
	public void listAll() {
		// TODO Auto-generated method stub
		System.out.println("JDBC: Printed All");
		
	}

}
