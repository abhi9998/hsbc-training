package com.demo.questioneight;
/**
 * 
 * @author Abhi Zanzarukiya
 *
 */
public class MainRunner {

	public static void main(String[] args) throws InterruptedException {
		
		MyThread t1 = new MyThread("Hello");
		MyThread t2 = new MyThread("Good");
		MyThread t3 = new MyThread("World");
		t1.setPriority(10);
		t2.setPriority(8);
		t3.setPriority(5);
		t1.start();
		t2.start();
		t3.start();
		
		t1.join();
		t2.join();
		t3.join();

		System.out.println("End process");
	}

}
