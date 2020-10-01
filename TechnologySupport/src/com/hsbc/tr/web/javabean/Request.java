package com.hsbc.tr.web.javabean;
/**
 * This is the java bean for request.
 * @author Abhi Zanzarukiya
 *
 */
public class Request {
	
	private String email;
	private String software;
	private String os;
	private String description;
	
	public Request() {
		
	}
	
	public Request(String email, String software, String os, String description) {
		
		this.email=email;
		this.software=software;
		this.os=os;
		this.description=description;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSoftware() {
		return software;
	}

	public void setSoftware(String software) {
		this.software = software;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	

}
