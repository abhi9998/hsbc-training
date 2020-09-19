package com.demo.questionten;
/**
 * 
 * @author Abhi Zanzarukiya
 *
 */
public class Account implements AccountOperationsInterface {
	
	double balance;
	boolean isBlocked;
	
	public Account(double balance,boolean isBlocked) {
		this.balance = balance;
		this.isBlocked = isBlocked;
	}

	@Override
	public double deposit(double amt) throws AccountBlockedException {
		// TODO Auto-generated method stub
		if(isBlocked==true) {
			throw new AccountBlockedException("Your account is blocked ");
		}else {
			this.balance += amt;
			return balance;
		}
	}

	@Override
	public double withdraw(double amt) throws AccountBlockedException, InsufficientBalanceException {
		if(isBlocked==true) {
			throw new AccountBlockedException("Your account is Blocked");
		}
		else {
			
			if(balance<amt) {
				throw new InsufficientBalanceException("Your balance is low "+balance);
			}else {
				balance -=amt;
				return balance;
			}
		}

	}

	@Override
	public double getBalance() throws AccountBlockedException {
		// TODO Auto-generated method stub
		if(isBlocked==true) {
			throw new AccountBlockedException("Your account is blocked");
		}else {
			return balance;
		}
	}

	@Override
	public void blockAccount() {
		
		isBlocked=true;
		
	}
	
	

}
