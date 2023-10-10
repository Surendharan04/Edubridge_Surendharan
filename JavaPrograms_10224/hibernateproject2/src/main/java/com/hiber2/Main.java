package com.hiber2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
	public static void main(String[] args) {
		Configuration config = new Configuration();
		config.configure();
		config.addAnnotatedClass(Course.class);
		config.addAnnotatedClass(Student.class);

		SessionFactory sf = config.buildSessionFactory();
	
		Session session = sf.openSession();
		
		Transaction tx = session.beginTransaction();
		
		Course course1 = new Course(107,"Selenium");	//Transient state
		Student student1 = new Student("Raj");
		
		student1.setCourse(course1);
		session.save(course1);	//Persistent state
		session.save(student1);
		
		tx.commit();	

		session.close();	//Detached state
	}
}
