package com.demo.threadsmultiple;

public class MessagePrinter {
	
	public  void print(String message) {
		System.out.print("["+message);
		try {
		Thread.sleep(5000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("]");
		
		//System.out.println(message+" "+Thread.currentThread().getName());
	}

}
