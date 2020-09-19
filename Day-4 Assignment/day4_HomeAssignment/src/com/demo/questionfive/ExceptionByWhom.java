package com.demo.questionfive;
/**
 * 
 * @author Abhi Zanzarukiya
 *
 */
public class ExceptionByWhom {
	
	/**
	 *  there is no compulsion for try to be handled by its corresponding catch only
		if there is nested try catch and if outer handles excpetion thrown by inner try
		and inner catch do not throw then outer catches it.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double result;
		try {
			try {
				result = 10/0;
			}catch(NullPointerException e){
				System.out.println("handled by corresponding null catch handler");
			}
		}catch(ArithmeticException e) {
			System.out.println("handled by outer arithmatic catch handler");
		}
		
		System.out.println("End of program");
	}

}
