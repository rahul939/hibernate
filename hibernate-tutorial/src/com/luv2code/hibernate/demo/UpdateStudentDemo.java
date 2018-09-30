package com.luv2code.hibernate.demo;

import org.hibernate.cfg.Configuration;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.luv2code.hibernate.demo.entity.Stud;
//import com.mysql.cj.Session;


public class UpdateStudentDemo {

	public static void main(String[] args) {

		//create session factory
		SessionFactory factory = new Configuration()
									.configure("hibernate.cfg.xml")
									.addAnnotatedClass(Stud.class)
									.buildSessionFactory();
		
		//Create a session
	
		Session session = factory.getCurrentSession(); 
		
		try {			
			
			int studentID=2;
			session.beginTransaction();
			
			
			
			System.out.println(" student. Generated id: " + studentID);
			
			Stud myStudent = session.get(Stud.class,  studentID);
			
			
			System.out.println("old name: " + myStudent.getStudname());
			
			System.out.println("Update student ");
			
			 myStudent.setStudname("kingslayer");
			
			
				
			 
			 
			 session.getTransaction().commit();
			 
			 System.out.println("new  name: " + myStudent.getStudname());
			
			
			//System.out.println("Done!");
		}
		finally {
			factory.close();
		}
	}

}
