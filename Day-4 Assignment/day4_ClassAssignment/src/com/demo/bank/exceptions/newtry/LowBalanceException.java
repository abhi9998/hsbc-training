package com.demo.bank.exceptions.newtry;

public class LowBalanceException extends Exception {
	
	public  LowBalanceException() {
		// TODO Auto-generated constructor stub
	}
	
	public LowBalanceException(String message) {
		super(message);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Your balance is low";
	}
	

}
