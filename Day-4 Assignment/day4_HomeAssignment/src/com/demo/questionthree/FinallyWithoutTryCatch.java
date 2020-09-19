package com.demo.questionthree;
/**
 * 
 * @author Abhi Zanzarukiya
 *
 */
public class FinallyWithoutTryCatch {
	
	/***
	 * Yes if there is finally with try and there is no catch it will not show error but if try
	 *  throws exception it will not be handled as there is no catch there. 
	 * 
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double d;
		try {
			d=10/0;
		}
		
		finally {
			System.out.println("Hello from finally block");
		}
		System.out.println("End of program");

	}

}
