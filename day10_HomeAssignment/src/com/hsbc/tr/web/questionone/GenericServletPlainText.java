package com.hsbc.tr.web.questionone;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
/**
 * 
 * @author Abhi Zanzarukiya
 *
 */
public class GenericServletPlainText extends GenericServlet {

		/**
		 * http://localhost:8080/day10_HomeAssignment/questionone visit this to check the output
		 */
		@Override
		public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
			
			resp.setContentType("text");
			PrintWriter out = resp.getWriter();
			
			out.write("Welcome to Servlets Programming");
			
		}
}
