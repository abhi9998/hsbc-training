package com.demo.assignment.impl.plain;

import com.demo.assignment.interfaces.Writer;

public class PlainWriter implements Writer {

	@Override
	public String write(String message) {
		// TODO Auto-generated method stub
		return message+" Written By Plain";
	}

}
