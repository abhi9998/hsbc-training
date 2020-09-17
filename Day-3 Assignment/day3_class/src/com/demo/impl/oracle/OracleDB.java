package com.demo.impl.oracle;

import com.demo.interfaces.MyConnection;

public class OracleDB implements MyConnection {
	
	
	@Override
	public String getConnectionInfo() {
		// TODO Auto-generated method stub
		return "Connection established successfully";
	}
	
	
	
	@Override
	public String getDbDetails() {
		// TODO Auto-generated method stub
		return "Oracle DB 13c";
	}

}
