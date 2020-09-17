package com.demo.inheritance.demo2;

public class TraineeEmployee extends Employee {
	private int performance;
	
	public TraineeEmployee(int id, String name, double salary, int performance) {
		super(id,name,salary);
		this.performance = performance;
		
	}

	@Override
	public String getDetails() {
		
		return super.getDetails()+" "+performance;
	}
}
