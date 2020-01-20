package com.lti;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws SQLException {
	 
System.out.println("-----Welcome to Customer Managment--------");
		
		System.out.println("\n1.add_an_Customer\n"
		+"\n2.update_an_Customer\n"
				+"\n3.delete_an_Customer\n"
		+"\n4.search_an_employee\n"
		+"\nplease select an option\n");
		

		Scanner s=new Scanner(System.in);
		
		int option=s.nextInt();
		
      Customer c =new Customer();
      
      CustomerDao cd=new CustomerDaoImpl();
     
      
      switch(option){
		
		case 1:
			
			cd.addCustomer(c);
		
		
	}

}
}
