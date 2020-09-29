package com.hsbc.tr.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * 
 * @author Abhi Zanzarukiya
 *
 */

public class QuestionOne extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		
		String username= getServletConfig().getInitParameter("username");
		String password= getServletConfig().getInitParameter("password");
		String url= getServletConfig().getInitParameter("url");
		
		out.print("<h1>This is servelet s1</h1>");
		out.print("<h2>Username:"+username+"</h2>");
		out.print("<h2>Password:"+password+"</h2>");
		out.print("<h2>URL:"+url+"</h2>");
	}

}
