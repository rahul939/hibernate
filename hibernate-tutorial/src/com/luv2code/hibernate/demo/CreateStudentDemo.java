package com.luv2code.hibernate.demo;

import org.hibernate.cfg.Configuration;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.luv2code.hibernate.demo.entity.Stud;
//import com.mysql.cj.Session;


public class CreateStudentDemo {

	public static void main(String[] args) {

		//create session factory
		SessionFactory factory = new Configuration()
									.configure("hibernate.cfg.xml")
									.addAnnotatedClass(Stud.class)
									.buildSessionFactory();
		
		//Create a session
	
		Session session = factory.getCurrentSession(); 
		
		try {
			//use session object to save the java object
			
		 
			//create a student  object 
			
			 Stud tempstud = new Stud("XYZ","33", "A+");
			//start a transaction
			
			 session.beginTransaction();
			//save the student object 
			 session.save(tempstud);
			 
			// commit the transaction
			
			session.getTransaction().commit();
		} 
		catch (Exception e) {
			e.getStackTrace();
		}
	}

}
