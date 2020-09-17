package com.demo.interfaces;

import com.demo.model.Emp;

public interface EmpDao {
	
	public Emp findById(int id);
	public String save(Emp e);
	public void listAll();

}
