package com.demo.inheritance.demo2;

public class App2 {

	public static void printDetails(Person p) {
		System.out.println(p.getDetails());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person p = new Person(100,"Abhi");
		
		Employee e = new Employee(102, "Arun", 45000);
		
		System.out.println(p.getDetails());
		
		System.out.println(e.getDetails());
		
		Person p2 = new Employee(103,"Abhi2",3000);
		System.out.println(p2.getDetails());
	//	Person p1 = new Person(101,"Abhi Zanzarukiya");
		
		
		printDetails(e);
	//	Employee e1 = new TraineeEmployee(102,"Abhi Zanzarukiya",5000,5);
	//	System.out.println(e1.getDetails());
		Object o = e;
		System.out.println(o.getClass().getName());
		System.out.println(e); //calls toString method when passed in println method
		//every developer asked to overwrite the toSting 
	}

}
