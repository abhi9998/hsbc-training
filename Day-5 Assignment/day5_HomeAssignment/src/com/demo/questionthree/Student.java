package com.demo.questionthree;
/**
 * 
 * @author Abhi Zanzarukiya
 *
 */
public class Student {
	
	private int stdId;
	private String name;
	private int standard;
	
	public Student() {
		
	}
	
	public int getStdId() {
		return stdId;
	}

	public void setStdId(int stdId) {
		this.stdId = stdId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStandard() {
		return standard;
	}

	public void setStandard(int standard) {
		this.standard = standard;
	}

	public Student(int stdId, String name,int standard) {
		this.stdId =stdId;
		this.name = name;
		this.standard = standard;
	}
	public String toString() {
		return stdId+","+name+","+standard;
	}
	

}
