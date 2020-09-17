package com.practice.questionone;
/**
 * 
 * @author Abhi Zanzarukiya
 *
 */
public class Parrot extends Bird {
	
	public Parrot(String color,String type) {
			super(color,type);
	}

	@Override
	void run() {
		System.out.println("Parrot runs slowly");
		
	}

}
