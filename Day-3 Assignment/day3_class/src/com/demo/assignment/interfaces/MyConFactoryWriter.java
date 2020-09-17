package com.demo.assignment.interfaces;

import com.demo.assignment.impl.decorator.DecoratorWriter;
import com.demo.assignment.impl.html.HTMLWriter;
import com.demo.assignment.impl.plain.PlainWriter;

public class MyConFactoryWriter {
	
	public static Writer getMyConnection(String writerName) {
		if(writerName.equals("HTML")) {
			return new HTMLWriter();
		}else if (writerName.equals("Decorator")) {
			return new DecoratorWriter();
		}else if(writerName.equals("Plain")) {
			return new HTMLWriter();
		}else
			return null;
	}

}
