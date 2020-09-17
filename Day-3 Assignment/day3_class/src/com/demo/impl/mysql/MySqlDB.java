package com.demo.impl.mysql;

import com.demo.interfaces.MyConnection;

public class MySqlDB implements MyConnection {
	
	
	@Override
	public String getConnectionInfo() {
		// TODO Auto-generated method stub
		return "Connection established successfully";
	}
	
	
	
	@Override
	public String getDbDetails() {
		// TODO Auto-generated method stub
		return "MySQL DB 8.3";
	}

}
