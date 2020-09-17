package com.practice.questionseven;
/**
 * 
 * @author Abhi Zanzarukiya
 *
 */
public class B extends A {
	
	
	
	public B(int a) {
		super(a);
	}
	
	public void call() {
		super.call();
		System.out.println("call from Child");
	}

}
