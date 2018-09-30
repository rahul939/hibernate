package com.luv2code.hibernate.demo;

import org.hibernate.cfg.Configuration;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.luv2code.hibernate.demo.entity.Stud;
//import com.mysql.cj.Session;


public class ReadStudentDemo {

	public static void main(String[] args) {

		//create session factory
		SessionFactory factory = new Configuration()
									.configure("hibernate.cfg.xml")
									.addAnnotatedClass(Stud.class)
									.buildSessionFactory();
		
		//Create a session
	
		Session session = factory.getCurrentSession(); 
		
		try {			
			// create a student object
			System.out.println("Creating new student object...");
			Stud tempStudent = new Stud("Mane1", "read1", "myread@luv2code.com");
			
			// start a transaction
			session.beginTransaction();
			
			// save the student object
			System.out.println("Saving the student...");
			System.out.println(tempStudent);
			session.save(tempStudent);
			
			// commit transaction
			
			System.out.println("Saved student. Generated id: " + tempStudent.getId());
			System.out.println("Save Student Generated Name:"+ tempStudent.getStudname());
			
			session.getTransaction().commit();
			
			// MY NEW CODE
			
			// find out the student's id: primary key
			
			
			// now get a new session and start transaction
			session = factory.getCurrentSession();
			session.beginTransaction();
			
			// retrieve student based on the id: primary key
		     System.out.println("\nGetting student with id: " + tempStudent.getId());
			
			Stud myStudent = session.get(Stud.class, tempStudent.getId());
			
			System.out.println("Get complete: " + myStudent.getStudname());
			
			// commit the transaction
			session.getTransaction().commit();
			
			System.out.println("Done!");
		}
		finally {
			factory.close();
		}
	}

}
