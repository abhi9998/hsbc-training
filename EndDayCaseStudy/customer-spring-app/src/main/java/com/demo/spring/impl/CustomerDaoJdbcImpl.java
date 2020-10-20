package com.demo.spring.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.demo.spring.entity.Customer;
import com.demo.spring.interfaces.CustomerDao;
@Primary
@Repository
public class CustomerDaoJdbcImpl implements CustomerDao {

	@Autowired
	JdbcTemplate jt;
	
	
	@Override
	public String save(Customer cust) {

		List<Integer> row= jt.query("select * from customers where custid="+cust.getCustomerId(), new RowMapper<Integer>() {
			@Override
			public Integer mapRow(ResultSet rs, int rowNum) throws SQLException {
					return rowNum;
			}
		});
		
		System.out.println("reached here");
		
		if(row.size() >0) {
			return "Customer Already Exists";
		}else {
			
			int row2 = jt.update(new PreparedStatementCreator() {
				
				@Override
				public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
					
					PreparedStatement pst = con.prepareStatement("insert into customers values (?,?,?)");
					pst.setInt(1, cust.getCustomerId());
					pst.setString(2, cust.getCustomerName());
					pst.setInt(3, cust.getMobile());
					return pst;
				}
			});
			
			if(row2>0) {
				return "Customer registered successfully";
			}else {
				return "Some error occured";
			}
			
		}
	}

	
	
	
	@Override
	public List<Customer> findAll() {
		
		 List<Customer> custList = jt.query("select * from customers", new RowMapper<Customer>() {

			@Override
			public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
				
				
				return new Customer(rs.getInt(1),rs.getString(2),rs.getInt(3));
			}
			
			
		});
		
		
			return custList;
		
		
	}

	@Override
	public Customer findById(int id) {
		Customer c = jt.queryForObject("select * from customers where custid="+id, new RowMapper<Customer>() {

			@Override
			public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
				
				
				return new Customer(rs.getInt(1),rs.getString(2),rs.getInt(3));
			}
			
			
		});
		
		if(c==null) {
			throw new RuntimeException("Customer do not exsists");
		}else {
			return c;
		}
	}

}
