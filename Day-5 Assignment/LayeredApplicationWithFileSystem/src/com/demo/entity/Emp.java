package com.demo.entity;
/**
 * 
 * @author Abhi Zanzarukiya
 *
 */

public class Emp {
	
	private int empId;
	private String name;
	private String city;
	private double salary;
	public Emp() {
		
	}
	
	public Emp(int empId,String name, String city, double salary) {
		this.empId= empId;
		this.name= name;
		this.city = city;
		this.salary = salary;
	}
	
	public int getEmpId() {
		return empId;
	}

	public String toString() {
		return ""+empId+","+name+","+city+","+salary;
	}
}
