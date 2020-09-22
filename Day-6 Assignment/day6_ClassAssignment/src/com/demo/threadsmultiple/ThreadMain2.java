package com.demo.threadsmultiple;

public class ThreadMain2 {

	public static void main(String[] args) throws InterruptedException {
		
		MessagePrinter printer = new MessagePrinter();
		System.out.println("Main thread starts..");
//		Worker worker1 = new Worker("Hello");
//		Worker worker2 = new Worker("Good");
//		Worker worker3 = new Worker("World");
//		Thread t1 = new Thread(worker1);
//		Thread t2 = new Thread(worker2);
//		Thread t3 = new Thread(worker3);
		
		Thread t1  = new Thread(new Worker(printer,"Helo"));
		Thread t2  = new Thread(new Worker(printer,"Good"));
		Thread t3  = new Thread(new Worker(printer,"World"));
		//t1.setPriority(1);
		//t2.setPriority(6);
		//t3.setPriority(10);
		t1.start();
		t2.start();
		t3.start();
		t1.join();
		t2.join();
		t3.join();
		System.out.println("Main thread exits..");

	}

}
