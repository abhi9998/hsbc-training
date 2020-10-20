package com.demo.spring.entity;

public class Customer {
	
	private int customerId;
	private String customerName;
	private int mobile;
	
	public Customer() {
		
	}

	public Customer(int customerId, String customerName, int mobile) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.mobile = mobile;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getMobile() {
		return mobile;
	}

	public void setMobile(int mobile) {
		this.mobile = mobile;
	}
	
	@Override
	public String toString() {
		return "["+customerId+" "+customerName+" "+mobile+"]";
	}

}
