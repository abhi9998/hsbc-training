package com.hsbc.tr.web.questiontwo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GreetingMessage extends HttpServlet {

	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
			resp.setContentType("text/html");
			PrintWriter out = resp.getWriter();
			
			String name = req.getParameter("name");
			
			out.print("<h2>Greetings "+ name+" !!! </h2>");
	}
}
