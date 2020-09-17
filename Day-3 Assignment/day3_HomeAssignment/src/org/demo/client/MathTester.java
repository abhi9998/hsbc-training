package org.demo.client;

import org.demo.tools.Calculator;
/**
 * 
 * @author Abhi Zanzarukiya
 *
 */
public class MathTester {

	public static void main(String[] args) {
		
		Calculator c = new Calculator(50, 20);
		
		System.out.println(c.add());
		
		System.out.println(c.subtract());
		
		System.out.println(c.multiply());

	}

}
