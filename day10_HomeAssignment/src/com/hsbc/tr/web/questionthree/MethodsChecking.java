package com.hsbc.tr.web.questionthree;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
/**
 * When the first request is hit, the init method is one time initiated and then service one. After that per request service is executed
 * And when you turn off the server then once during that time destroy gets executed/
 * @author Abhi Zanzarukiya
 *
 */
public class MethodsChecking extends GenericServlet {
	
	public  MethodsChecking() {
	
	}

	@Override
	public void init() throws ServletException {
		System.out.println("init method is executed");
	}
	
	@Override
	public void destroy() {
	System.out.println("destroy method is executed");
	}
	
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("service method is executed");
	}
}
