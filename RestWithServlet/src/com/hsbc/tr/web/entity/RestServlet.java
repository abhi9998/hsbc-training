package com.hsbc.tr.web.entity;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.json.JSONObject;
/**
 * This describes how different kind of formats are served to the client according to the request asked for.
 * @author Abhi Zanzarukiya
 *
 */

@WebServlet("/api") 		//replaces need for web.xml
public class RestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		String id = request.getParameter("id");
		try {
			
			Emp e = new Emp(Integer.parseInt(id), "Abhi", "Juna", 20000);
			System.out.println(request.getHeader("Accept")+"---here");	
			if(request.getHeader("Accept").equals("application/json")) {
				response.setContentType("text/json");
				System.out.println("Accept header is "+request.getHeader("Accept"));
				

				
				JSONObject obj = new JSONObject(e);
				response.getWriter().write(obj.toString());
			}else if(request.getHeader("Accept").equals("application/xml")) {
							response.setContentType("text/xml");
							JAXBContext context = JAXBContext.newInstance(Emp.class);
							Marshaller marshaller = context.createMarshaller();
							marshaller.marshal(e, response.getWriter());
			}else {
				response.sendError(406);
			}
			
		} catch (Exception e) {
		
			e.printStackTrace();
		}
	}

}
