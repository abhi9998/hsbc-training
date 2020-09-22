package com.demo.threads;

public class MyThread extends Thread{

	@Override
	public void run() {
		try {
			for(int i=0;i<10;i++) {
				System.out.println("Iteration number:"+i+" "+Thread.currentThread().getName());
				Thread.sleep(500);
			}
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	
	}
}
