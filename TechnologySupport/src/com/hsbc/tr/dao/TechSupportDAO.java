package com.hsbc.tr.dao;

import com.hsbc.tr.impl.TechSupportJdbcImpl;
import com.hsbc.tr.web.javabean.Request;
import com.hsbc.tr.web.javabean.User;
/**
 * This is the DAO interface describing the methods as contract.
 * @author Abhi Zanzarukiya
 *
 */
public interface TechSupportDAO {
	
	public String saveUser(User user);
	public String saveRequest(Request request);
	public String isUser(String email);
	
	

}
