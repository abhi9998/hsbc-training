package com.hsbc.tr.service;

import com.hsbc.tr.dao.TechSupportDAO;
import com.hsbc.tr.web.javabean.Request;
import com.hsbc.tr.web.javabean.User;

/**
 * This is the service which takes request from the controller and passes to the dao implementation.
 * @author Abhi Zanzarukiya
 *
 */

public class TechSupportService {
	
	TechSupportDAO dao;
	
	public TechSupportService() {
		
	}
	
	public TechSupportService(TechSupportDAO dao) {
		
		this.dao= dao;
	}
	
	public String registerUser(User user) {
		try {
		String resp = dao.saveUser(user);
		
		if(null==resp)
			throw new RuntimeException();
		else
		return resp;
		}catch(RuntimeException ex){
			throw new RuntimeException("Exists already");
		}
	}
	
	public String registerRequest(Request request) {
		
		String resp = dao.saveRequest(request);
		
		return resp;
	}
	
	public boolean validate(String email) {
		
		try {
			String resp = dao.isUser(email);
			return true;
		}catch(RuntimeException ex ) {
			return false;
		}
	}

}
