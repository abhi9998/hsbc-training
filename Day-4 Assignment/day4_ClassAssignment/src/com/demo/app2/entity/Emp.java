package com.demo.app2.entity;

public class Emp {
	private int id;
	private String name;
	
	public Emp(int id,String name) {
		this.name = name;
		this.id = id;
	}
	
	public String toString() {
		
		return id+" "+name;
	}

}
