package com.hsbc.tr.web.questionfour;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * Servlet shows details
 * @author Abhi Zanzarukiya
 *
 */

public class DetailsPost extends HttpServlet{

	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
			String name = req.getParameter("name");
			String email = req.getParameter("email");
			
			resp.setContentType("text/html");
			PrintWriter out = resp.getWriter();
			out.write("<h2>Details Submitted is</h2>");
			out.write("<h3>Name is: "+ name+"</h3>");
			out.write("<h3>Email is: "+ email+"</h3>");
	}
}
