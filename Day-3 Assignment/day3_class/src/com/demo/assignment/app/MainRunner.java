package com.demo.assignment.app;

import com.demo.assignment.interfaces.MyConFactoryWriter;
import com.demo.assignment.interfaces.Writer;

public class MainRunner {

	public static void main(String[] args) {
		
		Writer w  = MyConFactoryWriter.getMyConnection("HTML");
		
		System.out.println(w.write("Hello"));

	}

}
