package com.demo.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.demo.spring.entity.Customer;
import com.demo.spring.interfaces.CustomerDao;

@Service
@CrossOrigin
public class CustomerService {
	
	@Autowired
	private CustomerDao dao;
	
	public List<Customer> getAll(){
		
		List<Customer> resp = dao.findAll();
		
		return resp;
	}
	
	public Customer getbyId(int id) {
		try {
			Customer resp = dao.findById(id);
			return resp;
		}catch(RuntimeException ex) {
			throw ex;
		}
	}
	
	public String add(Customer cust) {
		String resp = dao.save(cust);
		return resp;
	}

}
