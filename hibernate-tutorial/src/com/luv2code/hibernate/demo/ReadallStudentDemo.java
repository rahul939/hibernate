package com.luv2code.hibernate.demo;

import org.hibernate.cfg.Configuration;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.luv2code.hibernate.demo.entity.Stud;

import java.util.List;
//import com.mysql.cj.Session;


public class ReadallStudentDemo {

	public static void main(String[] args) {

		//create session factory
		SessionFactory factory = new Configuration()
									.configure("hibernate.cfg2.xml")
									.addAnnotatedClass(Stud.class)
									.buildSessionFactory();
		
		//Create a session
	
		Session session = factory.getCurrentSession(); 
		
		try {			
			// create a student object
			
			session.beginTransaction();
			@SuppressWarnings("unchecked")
			List<Stud> theStudents = session.createQuery("from Stud").getResultList();
			//Stud tempStudent = new Stud();
		//	List<Stud> allstud = session
		//						.createQuery("from stud")
		//						.getResultList();
			//
			for (Stud tempStudent :theStudents) {
				System.out.println(tempStudent.getStudname());
			}
			
			// commit the transaction
			session.getTransaction().commit();
			
			//System.out.println("Done!");
		}
		finally {
			factory.close();
		}
	}

}
