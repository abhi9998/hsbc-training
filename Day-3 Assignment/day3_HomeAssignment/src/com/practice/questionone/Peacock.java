package com.practice.questionone;
/**
 * 
 * @author Abhi Zanzarukiya
 *
 */
public class Peacock extends Bird {

	public Peacock(String color,String type) {
		super(color,type);
	}

	@Override
	void run() {
		System.out.println("Peacock run fast");
		
	}
	
	
}
