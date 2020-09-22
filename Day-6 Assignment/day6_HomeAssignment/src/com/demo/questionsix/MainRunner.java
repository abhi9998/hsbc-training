package com.demo.questionsix;
/**
 * 
 * @author Abhi Zanzarukiya
 *
 */


public class MainRunner {

	
	public static void main(String[] args) throws InterruptedException {
		
		Counter counter = new Counter();
		Thread t1 = new Thread(new com.demo.questionsix.MyThread(counter));
		Thread t2 = new Thread(new com.demo.questionsix.MyThread(counter));
		Thread t3 = new Thread(new com.demo.questionsix.MyThread(counter));
		
		t1.start();
		t2.start();
		t3.start();
		
		t1.join();
		t2.join();
		t3.join();

		System.out.println("End process");
	}

}
