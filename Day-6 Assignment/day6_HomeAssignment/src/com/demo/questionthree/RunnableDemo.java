package com.demo.questionthree;
/**
 * 
 * @author Abhi Zanzarukiya
 *
 */
public class RunnableDemo implements Runnable{
	
	private String message;
	
	public RunnableDemo() {
		
	}
	public RunnableDemo(String message) {
		this.message = message;
	}
	
	@Override
	public void run() {
	
		for(int i=0;i<10;i++) {
			System.out.println(i+"-"+message);
		}
		
	}
}
