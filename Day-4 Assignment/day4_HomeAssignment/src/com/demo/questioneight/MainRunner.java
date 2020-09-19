package com.demo.questioneight;
/***
 * 
 * @author Abhi Zanzarukiya
 *
 */
public class MainRunner {
	/**
	 * Main handler class
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ExceptionThrowingClass c = new ExceptionThrowingClass();
		
		try {
			System.out.println(c.display());
		} catch (MyNullPointerException e) {
			// TODO Auto-generated catch block
			System.out.println("Message from method that"+e.getMessage());
		}
		
	}

}
