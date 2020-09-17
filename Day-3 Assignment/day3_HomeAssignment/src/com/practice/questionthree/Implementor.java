package com.practice.questionthree;
/**
 * 
 * @author Abhi Zanzarukiya
 *
 */
public class Implementor implements Second {

	@Override
	public void callFromFirst() {
		System.out.println("This call is of interface "+Implementor.name1);
		
	}

	@Override
	public void callFromSecond() {
		System.out.println("This call is of interface "+Implementor.name2);
		
	}

}
