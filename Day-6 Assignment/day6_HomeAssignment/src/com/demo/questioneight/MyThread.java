package com.demo.questioneight;
/**
 * 
 * @author Abhi Zanzarukiya
 *
 */
public class MyThread extends Thread{
	
	private String message;
	
	public MyThread() {
		
	}
	public MyThread(String message) {
		this.message = message;
	}
	
	@Override
	public void run() {
	
		System.out.println("From thread "+Thread.currentThread().getPriority());
		
	}
}
