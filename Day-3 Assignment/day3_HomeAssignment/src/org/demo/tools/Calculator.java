package org.demo.tools;
/**
 * 
 * @author Abhi Zanzarukiya
 *
 */
public class Calculator {
	protected int x ;
	protected int y;
	
	public Calculator(int x ,int y) {
		this.x =x;
		this.y=y;
	}
	
	public int add() {
		return x+y;
	}
	
	public int subtract() {
		return x-y;
	}
	
	public int multiply() {
		return x*y;
	}

}
