package com.demo.bank.exceptions.newtry;

public class Main {

	public static void main(String[] args) throws LowBalanceException {
		// TODO Auto-generated method stub
		//try {
		BankAccount b = new BankAccount(10000);
		
		System.out.println(b.withdraw(2000));
		b.withdraw(4000);
		// b.withdraw(5000);
		
		
	//	}catch(LowBalanceException e) {
	//		System.out.println("Low balance");
	//	}
		
		System.out.println("Done successfully");

	}

}
