package com.hsbc.tr.web.javabean;

/**
 * This is the javabean of User
 * @author Abhi Zanzarukiya
 *
 */
public class User {
	
	private String email;
	private String fname;
	private String lname;
	private String mobile;
	
	public User() {
	
	}
	
	public User(String email, String fname, String lname, String mobile) {
		
		this.email=email;
		this.fname=fname;
		this.lname=lname;
		this.mobile=mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	public String toString() {
		
		return email+" "+fname+" "+lname+" "+mobile;
	}
	
	

}
