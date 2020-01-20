package com.lti;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CustomerDaoImpl implements CustomerDao {

Connection con=null;
	
	final String url="jdbc:oracle:thin:@localhost:1521/XE";
	final String username="hr";
	final String password="hr";
	
	 public CustomerDaoImpl() throws SQLException {
			super();
			
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				System.out.println("driver loaded");
				
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			con=DriverManager.getConnection(url, username, password);
			System.out.println("connected");
			
		}
	
	
	
	@Override
	public int addCustomer(Customer c) throws SQLException {
		
		int cid=c.getCid();
		String cname=c.getCname();
		int cbalance=c.getCbalance();

		String sql="insert into Customer values(?,?,?)";
		
		PreparedStatement ps=con.prepareStatement(sql);
		
		ps.setInt(1,cid);
		ps.setString(2,cname);
		ps.setInt(3, cbalance);
		
		int i=ps.executeUpdate();
		 
		 return i;
		
	}

	@Override
	public void dispCustomer(int cid) {
		
	}

	@Override
	public void updateCustomer(int cid) {
		

	}

	@Override
	public void deleteCustomr(int cid) {
		

	}

}
