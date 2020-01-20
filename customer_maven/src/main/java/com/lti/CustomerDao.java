package com.lti;

import java.sql.SQLException;

public interface CustomerDao {
	
 int addCustomer(Customer c) throws SQLException;
 void dispCustomer(int cid);
 void updateCustomer(int cid);
 void deleteCustomr(int cid);

}
