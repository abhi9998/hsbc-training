package com.demo.questionten;
/**
 * 
 * @author Abhi Zanzarukiya
 *
 */
public class MainRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account a = new Account(10000,false);
		
		try {
			System.out.println(a.getBalance()+"is the balance");
		}catch(AccountBlockedException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			double balance =a.withdraw(1000);
			
			System.out.println("Transaction is successful. balance is "+balance);
		}catch(AccountBlockedException e) {
			System.out.println(e.getMessage());
			
		}catch(InsufficientBalanceException e) {
			System.out.println(e.getMessage());
		}
		
	//	a.blockAccount();
		
		try {
			double balance =a.withdraw(100000);
			
			System.out.println("Transaction is successful. balance is "+balance);
		}catch(AccountBlockedException e) {
			System.out.println(e.getMessage());
			
		}catch(InsufficientBalanceException e) {
			System.out.println(e.getMessage());
		}

	}

}
