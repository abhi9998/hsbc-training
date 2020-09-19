package com.demo.questionsix;
/**
 * 
 * @author Abhi Zanzarukiya
 *
 */
public class HandleAllExceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/***
		 * If there are multliple catch the every exception thrown is handles by respective 
		 * catch block. However if you want you can handle any exception thrown by
		 * the try block with Exception catch. Exception is parent of all Exception class
		 */
		double result;
		String a[] = new String[1];
		
		try {
			result  = 10/0;
			a[0].length();
		}catch(NullPointerException e) {
			System.out.println("Null handled");
		}catch(ArithmeticException e) {
			System.out.println("Arithmatic Handles");
		}catch(Exception e){
			System.out.println("Any not handles by above catch is handles here");
		}
	}

}
