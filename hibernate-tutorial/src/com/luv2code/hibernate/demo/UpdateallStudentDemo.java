package com.luv2code.hibernate.demo;

import org.hibernate.cfg.Configuration;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.luv2code.hibernate.demo.entity.Stud;
//import com.mysql.cj.Session;


public class UpdateallStudentDemo {

	public static void main(String[] args) {

		//create session factory
		SessionFactory factory = new Configuration()
									.configure("hibernate.cfg.xml")
									.addAnnotatedClass(Stud.class)
									.buildSessionFactory();
		
		//Create a session
	
		Session session = factory.getCurrentSession(); 
		
		try {			
			
			
			session.beginTransaction();
			
			session.createQuery("UPDATE Stud set div='fd' where roll='Duck'  ").executeUpdate();
			
             			
			
			session.getTransaction().commit();
			
			
			System.out.println("Update student ");
			
			
			
				
			 
			 
			 
			 
			
			
			//System.out.println("Done!");
		}
		finally {
			factory.close();
		}
	}

}
