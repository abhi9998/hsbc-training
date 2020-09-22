package com.demo.questionone;
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
	
		for(int i=0;i<10;i++) {
			System.out.println(i+"-"+message);
		}
		
	}
}
