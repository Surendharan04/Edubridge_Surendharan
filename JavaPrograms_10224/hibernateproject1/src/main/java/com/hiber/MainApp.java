package com.hiber;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainApp {
	public static void main(String[] args) {
		
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");	//Even if we don't give the cfg file it will load as it is default
		config.addAnnotatedClass(Student.class);
		
		SessionFactory sf = config.buildSessionFactory();
		Session session = sf.openSession();
		
		Transaction tx = session.beginTransaction();
		
		//Student student = new Student(1, "Aakash", 22, 50000.5f);	
		//Student student2 = new Student(2, "Mark", 23, 40000.0f);	
		Student student3 = new Student(3, "Nelson", 21, 45000.5f);
		Student student4 = new Student(4, "Surendharan", 22, 55000.0f);	
		/*When we update the student object it will update only the new database 
		if we commented out the create statement in config file*/
		
		session.save(student3);	//Once we save this it will call the insert command
		session.save(student4);
		
		tx.commit();	//After saving transaction will be committed
		session.close();	
	}
}
