package com.demo.spring.interfaces;

import java.util.List;

import com.demo.spring.entity.Customer;

public interface CustomerDao {
	
	public String save(Customer cust);
	public List<Customer> findAll();
	public Customer findById(int id);

}
