package com.luv2code.hibernate.demo;

import org.hibernate.cfg.Configuration;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.luv2code.hibernate.demo.entity.Countries;
//import com.luv2code.hibernate.demo.entity.Emp;
import com.luv2code.hibernate.demo.entity.Stud;

import java.util.List;
//import com.mysql.cj.Session;


public class ReadallEmp {

	public static void main(String[] args) {

		//create session factory
		SessionFactory factory = new Configuration()
									.configure("hibernate.cfg2.xml")
									.addAnnotatedClass(Countries.class)
									.buildSessionFactory();
		
		//Create a session
	
		Session session = factory.getCurrentSession(); 
		
		try {			
			// create a student object
			
			session.beginTransaction();
			@SuppressWarnings("unchecked")
			List<Countries> theStudents = session.createQuery("from Countries").getResultList();
			//Stud tempStudent = new Stud();
		//	List<Stud> allstud = session
		//						.createQuery("from stud")
		//						.getResultList();
			//
			for (Countries tempStudent :theStudents) {
				System.out.println(tempStudent.getCOUNTRY_NAME());
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
