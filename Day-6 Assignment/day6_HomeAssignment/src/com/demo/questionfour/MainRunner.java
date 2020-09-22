package com.demo.questionfour;
/**
 * 
 * @author Abhi Zanzarukiya
 *
 */
public class MainRunner {

	/**
	 * If join is not maintained then if thread throws runtime exception and if main end without waiting 
	 * then there wont be catching of that exception 
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {
		
		MyThread t1 = new MyThread("Hello");
		
		
		t1.start();
		
		//t3.join();  

		System.out.println("End process");
	}

}
