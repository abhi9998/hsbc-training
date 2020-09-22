package com.demo.questionsix;
/**
 * 
 * @author Abhi Zanzarukiya
 *
 */
public class Counter {
	
	private static int count =1;
	
	synchronized public void increament() {
		
		System.out.println(count+"out of 30"+Thread.currentThread().getName());
		count++;
	}

}
