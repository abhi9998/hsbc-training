package com.demo.inheritance.demo3;

public class Triangle extends Figure {

	public Triangle(int dim1,int dim2) {
		super(dim1,dim2);
	}
	
	public double area() {
		return 0.5*dim1*dim2;
	}
}
