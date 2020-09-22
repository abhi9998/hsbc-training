package com.demo.questionthree;
/**
 * 
 * @author Abhi Zanzarukiya
 *
 */
public class MainRunner {

	public static void main(String[] args) throws InterruptedException {
		
		//RunnableDemo t1 = new RunnableDemo("Hello");
		//RunnableDemo t2 = new RunnableDemo("Good");
		//RunnableDemo t3 = new RunnableDemo("World");
		
		
		start();

		System.out.println("End process");
	}
	
	public static void start() throws InterruptedException {
		
		Thread t1 = new Thread(new RunnableDemo("Helo"));
		t1.start();
		t1.join();
	}

}
