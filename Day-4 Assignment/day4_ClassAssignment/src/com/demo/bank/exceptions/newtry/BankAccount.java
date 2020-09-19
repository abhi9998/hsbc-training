package com.demo.bank.exceptions.newtry;

public class BankAccount  {
	
	private double balance=0.0;
	
	public BankAccount(double balance) {
		this.balance = balance;
	}
	
	public double withdraw(double amount) throws LowBalanceException  {   //throws LowBalanceException if lowbalance is extending exception also this addtion tell caller that i will throw it.
		try {
		if(amount>balance) {
			throw new LowBalanceException("Low Balance");
		}else {
			balance = balance- amount;
			System.out.println("Transaction successfull, new balance is  "+balance);
		}
		}catch(LowBalanceException e) {
			System.out.println(e.getMessage());
			throw e;
		}
		return balance;
		
	}

}
