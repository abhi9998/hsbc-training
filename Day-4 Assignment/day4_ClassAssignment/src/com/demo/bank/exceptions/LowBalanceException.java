package com.demo.bank.exceptions;

public class LowBalanceException extends RuntimeException {
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Your balance is low";
	}
	

}
