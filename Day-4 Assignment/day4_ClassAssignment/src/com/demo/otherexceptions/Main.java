package com.demo.otherexceptions;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		App2 app2 = new App2();
		App1 app1 = new App1(app2);
		try {
		double result  =app1.calculate(2, 0);
		}catch(RuntimeException e) {
			System.out.println(e);
		}
		
		
		System.out.println("Done sucessfully");

	}

}
