package com.demo.assignment.impl.decorator;

import com.demo.assignment.interfaces.Writer;

public class DecoratorWriter implements Writer {

	@Override
	public String write(String message) {
		// TODO Auto-generated method stub
		return message+" Written by Decorator";
	}

}
