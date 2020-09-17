package com.demo.inheritance.demo3;

public class MainApp {
	public static void main(String[] args) {
		Figure ref;
		
		Triangle t = new Triangle(10, 10);
		Rectangle r = new Rectangle(10, 20);
		Circle c = new Circle(31);
		
		ref =t ;
		ref.area();
		
		ref = c ;
		ref.area();
		
		ref =r;
		ref.area();
	}

}
