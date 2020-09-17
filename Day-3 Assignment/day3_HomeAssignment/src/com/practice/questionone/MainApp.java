package com.practice.questionone;
/**
 * 
 * @author Abhi Zanzarukiya
 *
 */
public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Peacock p = new Peacock("Blue","Omnivorous");
		
		p.run();
		
		Parrot pa = new Parrot("Green","Omnivorous");
		
		pa.run();
		
		Eagle e = new Eagle("Brown","Carnivorous");
		e.run();

	}

}
