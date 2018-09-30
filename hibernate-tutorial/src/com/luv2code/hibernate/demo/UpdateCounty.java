package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Countries;

public class UpdateCounty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	         SessionFactory Factory =new Configuration()
	        		 					.configure("hibernate.cfg2.xml")
	        		 					.addAnnotatedClass(Countries.class)
	        		 					.buildSessionFactory();
	        		 					
	         Session session = Factory.getCurrentSession(); 
	try {
	    String re ="AR";   
	    session.beginTransaction();
	    
	    Countries myconry= session.get(Countries.class, re);
	    
	    
	    System.out.println("old name: " + myconry.getCOUNTRY_NAME());
	    
	     myconry.setCOUNTRY_NAME("Argo");
	     session.getTransaction().commit();
	     System.out.println("new  name: " + myconry.getCOUNTRY_NAME());
			
	}
	
	finally {
		
	}

	}
}
