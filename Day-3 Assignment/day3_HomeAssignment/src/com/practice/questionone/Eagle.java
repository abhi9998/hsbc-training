package com.practice.questionone;
/**
 * 
 * @author Abhi Zanzarukiya
 *
 */
public class Eagle extends Bird {

	public Eagle(String color,String type) {
		super(color,type);
	}

	@Override
	void run() {
		System.out.println("Eagle do not run");
		
	}
	
	
}
