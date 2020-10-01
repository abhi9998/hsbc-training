package com.hsbc.tr.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hsbc.tr.impl.TechSupportJdbcImpl;
import com.hsbc.tr.service.TechSupportService;
import com.hsbc.tr.web.javabean.Request;
import com.hsbc.tr.web.javabean.User;

/**
 * Servlet implementation class RegisterAndCheck which registers the user and also register the client issues in form of tech support request
 * 
 */
public class RegisterAndCheck extends HttpServlet {
	private static final long serialVersionUID = 1L;
		
	TechSupportService service;
		
	@Override
		public void init() throws ServletException {
		
			service=new TechSupportService(new TechSupportJdbcImpl());
		}

	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		System.out.println("here");
		//TechSupportJdbcImpl sup= new TechSupportJdbcImpl();
	
		response.setContentType("text/html");
		
		//System.out.println(sup.isUser(u));
		//String requestPath = request.getRequestURI();
		System.out.println(request.getParameter("button"));
		
		if(request.getParameter("button").equals("Register")) {
				
			User u = new User(request.getParameter("email"),
					request.getParameter("fname"),
					request.getParameter("lname"),
					request.getParameter("mobile"));
			
			try {
				String resp = service.registerUser(u);
				System.out.println(request.getSession().getAttribute("software")+"----");
				System.out.println(request.getSession().getAttribute("os")+"----");
				if((String)request.getSession().getAttribute("os")!=null) {
					
					try {
						String respo =service.registerRequest(new Request((String)request.getSession().getAttribute("email"),
								(String)request.getSession().getAttribute("software"),(String)request.getSession().getAttribute("os"),
								(String)request.getSession().getAttribute("description")));
						System.out.println(respo);
						request.setAttribute("resp", respo);
						
						request.getRequestDispatcher("/confirm.jsp").forward(request, response);
						}catch(RuntimeException ex) {
							response.getWriter().print("<h1>Some Error Occured</h1>");
						}
					
				}else {
				response.getWriter().print("<h3 style=\"color: green\">Registered Success<h3>");
				request.getRequestDispatcher("/index.jsp").include(request, response);
				}
				
			}catch(RuntimeException ex) {
				response.getWriter().print("<h1>Already exists</h1>");
			}
			
		}else {
			boolean validate= service.validate(request.getParameter("email"));
			System.out.println(validate);
			
			Request req = new Request(request.getParameter("email"),
					request.getParameter("software"),
					request.getParameter("os"),
					request.getParameter("description"));
			
			if(validate==true) {
				
				try {
				String resp =service.registerRequest(req);
				System.out.println(resp);
				request.setAttribute("resp", resp);
				
				request.getRequestDispatcher("/confirm.jsp").forward(request, response);
				}catch(RuntimeException ex) {
					response.getWriter().print("<h1>Some Error Occured</h1>");
				}
			}else {
				
				response.getWriter().print("<h1>You are not registered</h1>");
				request.getSession().setAttribute("email", req.getEmail());
				request.getSession().setAttribute("os", req.getOs());
				request.getSession().setAttribute("software", req.getSoftware());
				request.getSession().setAttribute("description", req.getDescription());
				request.getRequestDispatcher("/registerForm.jsp").forward(request, response);
				
			}
			
		}
		
	}

}
