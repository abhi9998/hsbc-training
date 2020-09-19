package com.demo.cal.exceptions;

public class App1 {
	
	App2 a2;
	
	public App1() {
		a2 = new App2();
	}
	
	public int calculate(int a ,int b) {
	//	try {
		return a2.divide(a, b);
//		}catch(ArithmeticException e) {
	//		throw e;
	//	}
	}

}
