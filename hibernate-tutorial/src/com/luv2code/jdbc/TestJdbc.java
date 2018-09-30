package com.luv2code.jdbc;

import java.sql.DriverManager;

//import com.sun.corba.se.pept.transport.Connection;
import java.sql.Connection;
import java.sql.*;
public class TestJdbc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  
      //String jdbcurl = "jdbc:Oracle:thin:@192.168.2.2:1521";
	
      
      
	try {
		//Class.forName("oracle.jdbc.driver.OracleDriver");  
		Connection con=DriverManager.getConnection(  
				"jdbc:oracle:thin:@192.168.2.2:1521:orcl","SYSTEM","rah939");
		System.out.println("sucess");
	} catch (Exception e) {
		e.printStackTrace();
	}
	
	}

}
