package com.demo.spring.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.demo.spring.entity.Customer;
import com.demo.spring.interfaces.CustomerDao;

@Repository
public class CustomerDaoImpl implements CustomerDao {

	private HashMap<Integer,Customer> custMap;
	
	
	public CustomerDaoImpl() {
		custMap= new HashMap<>();
		
		custMap.put(101, new Customer(101, "Abhi1", 1111111111));
		custMap.put(102, new Customer(102, "Abhi2", 1111111111));
		custMap.put(103, new Customer(103, "Abhi3", 1111111111));
		custMap.put(104, new Customer(104, "Abhi4", 1111111111));
		custMap.put(105, new Customer(105, "Abhi5", 1111111111));
		custMap.put(106, new Customer(106, "Abhi6", 1111111111));
		
	}
	
	
	@Override
	public String save(Customer cust) {
		
		if(custMap.containsKey(cust.getCustomerId())) {
			return "Customer Already Exists";
		}else {
			custMap.put(cust.getCustomerId(), cust);
			return "Customer Saved Successfully";
		}
	}

	@Override
	public List<Customer> findAll() {
		
		ArrayList<Customer> custList = new ArrayList<>(custMap.values());
		
		return custList;
	}

	@Override
	public Customer findById(int id) {
		
		if(custMap.containsKey(id)==false) {
			throw new RuntimeException("Employee Not Found");
		}else {
		
			Customer resp = custMap.get(id);
			return resp;
		}
		
	}

}
