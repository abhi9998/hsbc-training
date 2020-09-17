package com.practice.questionone;
/**
 * 
 * @author Abhi Zanzarukiya
 *
 */
public abstract class Bird {
	
	protected String color;
	protected String type;
	
	public Bird(String color,String type){
		this.color = color;
		this.type = type;
	}
	
	abstract void run();

}
