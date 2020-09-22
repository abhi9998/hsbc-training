package com.demo.questiontwo;
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
		
		Thread t1 = new Thread(new RunnableDemo("Helo"));
		Thread t2 = new Thread(new RunnableDemo("Good"));
		Thread t3 = new Thread(new RunnableDemo("World"));
		
		t1.start();
		t2.start();
		t3.start();
		
		t1.join();
		t2.join();
		t3.join();

		System.out.println("End process");
	}

}
