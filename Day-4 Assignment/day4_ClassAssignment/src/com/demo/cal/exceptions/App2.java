package com.demo.cal.exceptions;

public class App2 {
	
	public int divide(int a,int b) {
		
		try {
			int ans;
			 ans = a/b;
			 return ans;
			
		}catch(ArithmeticException e) {
			e.printStackTrace();
			throw e;
			
		}
		
		//return 1;
		
	}

}
