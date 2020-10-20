package com.demo.spring.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.spring.entity.Customer;
import com.demo.spring.service.CustomerService;

@RestController
@CrossOrigin
public class CustomerRestController {

	@Autowired
	private CustomerService service;
	
	@PostMapping(path="/cust/save",produces=MediaType.TEXT_PLAIN_VALUE,consumes= {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<String> addCustomer(@RequestBody Customer cust){
		
		return ResponseEntity.ok(service.add(cust));
	}
	
	@GetMapping(path="/cust/findAll",produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Customer>> getAllCustomer(){
		return ResponseEntity.ok(service.getAll());
	}
	
	@GetMapping(path="/cust/find",produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity findCustomerById(@RequestParam("id") int id) {
		try {
			return ResponseEntity.ok(service.getbyId(id));
		}catch(RuntimeException ex) {
			return ResponseEntity.ok("Customer not found");
		}
	}
	
	
}
