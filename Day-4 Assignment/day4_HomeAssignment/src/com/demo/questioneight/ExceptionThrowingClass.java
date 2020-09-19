package com.demo.questioneight;
/***
 * 
 * @author Abhi Zanzarukiya
 *
 */
public class ExceptionThrowingClass {

	String accessNull;
	public ExceptionThrowingClass() {
		
		
	}
	
	public int display() throws MyNullPointerException {
		
		try {
			return accessNull.length();
		}catch(NullPointerException e) {
			throw new MyNullPointerException("Trying to access which is not there");
		}
	}
}
