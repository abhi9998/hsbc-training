package com.demo.questionseven;
/**
 * 
 * @author Abhi Zanzarukiya
 *
 */
public class MainRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		ExceptionThrowingConstructorClass c = new ExceptionThrowingConstructorClass();
		//System.out.println("Thing below execption throwing line");
		}catch(RuntimeException e) {
			System.out.println("message got is "+e.getMessage());
		}
	}

}
