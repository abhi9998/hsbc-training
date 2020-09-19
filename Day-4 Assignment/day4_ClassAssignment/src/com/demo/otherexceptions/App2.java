package com.demo.otherexceptions;

public class App2 {
	
	public double divide(int a,int b) {
		double result =0.0;
		try {
		 result = a/b;
		
		//return result;
		}catch(RuntimeException e ) {
			//System.out.println(e);
			throw new RuntimeException("Something went wrong");
		}
		return result;
	}

}
