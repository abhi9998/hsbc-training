package com.hsbc.tr.web.questionfour;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * This sends page via get and check on it via post
 * @author Abhi Zanzarukiya
 *
 */
public class DetailsPostWithoutForm extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			
			resp.setContentType("text/html");
			PrintWriter out = resp.getWriter();
			
			out.print("<!DOCTYPE html>\r\n" + 
					"<html>\r\n" + 
					"<head>\r\n" + 
					"<meta charset=\"ISO-8859-1\">\r\n" + 
					"<title>Enter Details here</title>\r\n" + 
					"<script type=\"text/javascript\">\r\n" + 
					"\r\n" + 
					"function check(){\r\n" + 
					"	\r\n" + 
					"	if(document.getElementById(\"email\").value==\"\"){\r\n" + 
					"		alert(\"enter email\");\r\n" + 
					"		return false;\r\n" + 
					"	}\r\n" + 
					"	if(document.getElementById(\"name\").value==\"\"){\r\n" + 
					"		alert(\"enter name\");\r\n" + 
					"		return false;\r\n" + 
					"	}\r\n" + 
					"	return true;\r\n" + 
					"	\r\n" + 
					"}</script>\r\n" + 
					"</head>\r\n" + 
					"<body>\r\n" + 
					"<h1>Enter the below details</h1>\r\n" + 
					"<hr>\r\n" + 
					"<form action=\"#\" method=\"post\" onsubmit=\"return check()\" >\r\n" + 
					"<table>\r\n" + 
					"<tr><td>Enter Name:</td><td><input id=\"name\" type=\"text\" name =\"name\"></td></tr>\r\n" + 
					"<tr><td>Enter Email:</td><td><input id=\"email\" type=\"email\" name =\"email\"></td></tr>\r\n" + 
					"<tr><td><input type=\"submit\" value=\"Submit\"></td></tr>\r\n" + 
					"\r\n" + 
					"</table>\r\n" + 
					"\r\n" + 
					"</form>\r\n" + 
					"</body>\r\n" + 
					"</html>");
			
			
			
			
	}
	
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
