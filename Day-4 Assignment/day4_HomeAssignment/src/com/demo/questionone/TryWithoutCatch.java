package com.demo.questionone;
/**
 * 
 * @author Abhi Zanzarukiya
 *
 */

public class TryWithoutCatch {
	
	/***
	 * If you comment the finally block then there will be error.
	 * If present finally, it will get executed even if try throws exception
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double d;
		int a =10;
		int b =0;
		try {
			d =a/b;
		}
		finally {
			System.out.println("executed finally");
		}
		System.out.println("End of program");

	}

}
