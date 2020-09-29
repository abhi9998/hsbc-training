package com.hsbc.tr.web.questiontwo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sun.reflect.ReflectionFactory.GetReflectionFactoryAction;

/**
 * 
 * @author Abhi Zanzarukiya
 *
 */
public class MainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.print("<h1>This is in Main Servlet.</h1>");
		
		String mode = request.getParameter("mode");
		
		switch (mode) {
		case "forward":
			RequestDispatcher rd = request.getRequestDispatcher("/forwardhandler");
			rd.forward(request, response);
			break;

		case "include":
			RequestDispatcher rd1 = request.getRequestDispatcher("/includehandler");
			rd1.include(request, response);
			
			break;
			
		case "redirect":
			response.sendRedirect("http://www.google.com");
			break;
			
		case "default":
			out.print("<h1>Invalid input</h1>");
			break;
		}
	}

}
