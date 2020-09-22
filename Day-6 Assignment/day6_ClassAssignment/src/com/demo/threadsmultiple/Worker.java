package com.demo.threadsmultiple;

public class Worker implements Runnable {
	
	private String message;
	private MessagePrinter printer;
	
	public Worker(MessagePrinter printer, String message) {
		this.printer = printer;
		this.message = message;
	}
	
	public Worker(String message) {
		this.message= message;
	}

	@Override
	public void run() {
		
		
		
		//printer.print(message);
		synchronized (printer) {
			printer.print(message);
		}
		
	}

}
