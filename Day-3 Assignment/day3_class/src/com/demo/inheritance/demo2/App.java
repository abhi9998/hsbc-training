package com.demo.inheritance.demo2;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person p = new Person(100,"Abhi");
		
		Employee e = new Employee(102, "Arun", 45000);
		
		System.out.println(p.getDetails());
		
		System.out.println(e.getDetails());
		
	//	Person p1 = new Person(101,"Abhi Zanzarukiya");
		
		Employee e1 = new TraineeEmployee(102,"Abhi Zanzarukiya",5000,5);
		System.out.println(e1.getDetails());
	}

}
