package com.hsbc.tr.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Random;

import org.apache.derby.client.am.SqlException;

import com.hsbc.tr.dao.TechSupportDAO;
import com.hsbc.tr.web.javabean.Request;
import com.hsbc.tr.web.javabean.User;
/**
 * This is the implementation of the DAO interface which performs necessary DB operations.
 * @author Abhi Zanzarukiya
 *
 */
public class TechSupportJdbcImpl implements TechSupportDAO{
	
	static int count=1;
	
	@Override
	public String saveUser(User user) {
		Connection conn=null;
		try {
			try {
				String exists = isUser(user.getEmail()); 
					return null;
			}catch(RuntimeException e) {
			
			conn = getConnection();
			PreparedStatement pst = conn.prepareStatement("insert into customers (email,fname,lname,mobile) values(?,?,?,?)");
			pst.setString(1, user.getEmail());
			pst.setString(2, user.getFname());
			pst.setString(3,user.getLname());
			pst.setString(4, user.getMobile());
			
			int rowCount = pst.executeUpdate();
			
			
					return "User registered Successfully";
				
			}
		}catch(SQLException ex) {
			
			throw new RuntimeException(ex);
		}finally {
			
			try {
				if(conn!=null) {
					conn.close();
				}
			}catch(SQLException e3) {
				e3.printStackTrace();
			}
		}
		
	}

	@Override
	public String saveRequest(Request request) {
		Connection conn= null;
		
		try {
			conn = getConnection();
			PreparedStatement pst = conn.prepareStatement("insert into requests (requestid,email,software,os,description) values(?,?,?,?,?)");
			
			Random rand = new Random(); 
		    int rand_int1 = rand.nextInt(100000); 
		         
			pst.setInt(1,rand_int1);
			
			pst.setString(2, request.getEmail());
			pst.setString(3,request.getSoftware());
			pst.setString(4, request.getOs());
			pst.setString(5, request.getDescription());
			
			int rowCount = pst.executeUpdate();
			
			
					return isUser(request.getEmail());
			
		}catch(RuntimeException ex) {
			ex.printStackTrace();
			throw ex;
		}catch(SQLException ex) {
			ex.printStackTrace();
			throw new RuntimeException(ex);
		}finally {
			
			try {
				if(conn!=null) {
					conn.close();
				}
			}catch(SQLException e3) {
				e3.printStackTrace();
			}
		}
		
		
	}

	@Override
	public String isUser(String email) {
		Connection conn=null;
		
		try {
			conn = getConnection();
			PreparedStatement pst = conn.prepareStatement("select * from customers where email=?");
			pst.setString(1, email);
			ResultSet rs = pst.executeQuery();
			
			if(rs.next()) {
				return new User(rs.getString("EMAIL"),rs.getString("FNAME"),rs.getString("LNAME"),rs.getString("MOBILE")).toString();
			}else {
				throw  new RuntimeException("Not Found");
			}
			
			
		}catch(RuntimeException ex) {
			throw ex;
		}catch(SQLException ex) {
			throw new RuntimeException(ex);
		}finally {
			
			try {
				if(conn!=null) {
					conn.close();
				}
			}catch(SQLException e3) {
				e3.printStackTrace();
			}
		}
		
		
	}
	
	
	
	private Connection getConnection() throws SQLException {
		Connection conn = null;
		 
		try {
			//Load the driver
			Class.forName("org.apache.derby.jdbc.ClientDriver");
			//Get the connection
		conn =	DriverManager.getConnection("jdbc:derby://localhost:1527/techsupportdb");
			if(conn!=null) {
				System.out.println("Got the connection..");
			}
					
		}catch (ClassNotFoundException e) {
			System.out.println("Driver not found...");
		}catch(SQLException ex) {
			System.out.println("Exception:"+ex);
			throw ex;
		}
		
		return conn;

	}

	
}
