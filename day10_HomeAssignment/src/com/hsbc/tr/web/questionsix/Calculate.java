package com.hsbc.tr.web.questionsix;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * This servelet calculates the add subtract multiply divide operation
 * @author Abhi Zanzarukiya
 *
 */

public class Calculate extends HttpServlet {

		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			
			
			int a = Integer.parseInt(req.getParameter("value1"));
			int b = Integer.parseInt(req.getParameter("value2"));
			String button = req.getParameter("button");
			double ans =0;
			PrintWriter out = resp.getWriter();
			
			if(button.equals("Add")) {
				ans =a+b;
				out.write("<h1>The value of operation "+ button + " performed is "+ ans +"</h1>");
			}else if(button.equals("Subtract")) {
				ans=a-b;
				out.write("<h1>The value of operation "+ button + " performed is "+ ans +"</h1>");
			}else if(button.equals("Multiply")) {
				ans=a*b;
				out.write("<h1>The value of operation "+ button + " performed is "+ ans +"</h1>");
			}else {
				try {
				ans=a/b;
				out.write("<h1>The value of operation "+ button + " performed is "+ ans +"</h1>");
				
				}catch(ArithmeticException ex) {
					
					out.write("<h1>The divide operation not possible by 0</h1>");
				}
			}
			
			
			
		}
}
