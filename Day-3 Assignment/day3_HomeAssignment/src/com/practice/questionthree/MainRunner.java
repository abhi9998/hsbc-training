package com.practice.questionthree;
/**
 * 
 * @author Abhi Zanzarukiya
 *
 */
public class MainRunner {

	public static void main(String[] args) {
		
		First f = new Implementor();
		f.callFromFirst();
		
		Second s = new Implementor();
		s.callFromSecond();
		
		Implementor i = new Implementor();
		i.callFromFirst();
		i.callFromSecond();
	}

}
