package com.demo.questionsix;
/**
 * 
 * @author Abhi Zanzarukiya
 *
 */
public class MyThread implements Runnable{
	
	static  int count=0;
	Counter counter;

	public MyThread() {
		
	}
	
	public MyThread(Counter counter ) {
		this.counter = counter;
	}
	
	@Override
	 public void run() {
		
	  
		for(int i=0;i<10;i++) {
			counter.increament();
		}
	
		
	//	throw new RuntimeException("error");
		
	
	}
}
