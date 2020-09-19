package com.demo.questiontwo;
/**
 * 
 * @author Abhi Zanzarukiya
 *
 */
public class CatchWithoutTry {
	
	/***
	 * If you comment the try block then there will be error. Catch only exists if there is a try
	 * If present catch, it will get executed if try throws exception
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double d;
		try {
			d=10/0;
		}
		
		catch(ArithmeticException e) {
			e.printStackTrace();
		}
		System.out.println("End of program");

	}

}
