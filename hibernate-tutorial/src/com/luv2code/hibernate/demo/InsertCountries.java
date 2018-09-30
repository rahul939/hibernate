package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Countries;
//import com.luv2code.hibernate.demo.entity.Stud;

public class InsertCountries {

	public static void main(String[] args) {
		
		SessionFactory Factory = new Configuration().
								 configure("hibernate.cfg2.xml").
								 addAnnotatedClass(Countries.class).
								 buildSessionFactory();
		
			Session session = Factory.getCurrentSession();
			
			 int cot=3;
			 String con_name="BD";
			try {
				//use session object to save the java object
				
			 
				//create a student  object 
				
				 Countries tempCounty = new Countries("RR","33",cot);
				//start a transaction
				
				 session.beginTransaction();
				//save the student object 
				 session.save(tempCounty);
				 
				// commit the transaction
				
				session.getTransaction().commit();
			} 
			catch (Exception e) {
				e.getMessage();
			}
		
								 
	
	
	}

}
