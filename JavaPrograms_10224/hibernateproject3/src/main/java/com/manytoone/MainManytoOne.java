package com.manytoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainManytoOne {
	public static void main(String[] args) {
		Configuration config = new Configuration()
		.configure()
		.addAnnotatedClass(Employee.class)
		.addAnnotatedClass(Department.class);	//Method Chaining
		
		/*Configuration config = new Configuration();
		config.configure();
		config.addAnnotatedClass(Employee.class);
		config.addAnnotatedClass(Department.class);*/

		SessionFactory sf = config.buildSessionFactory();
	
		Session session = sf.openSession();
		
		Transaction tx = session.beginTransaction();
		
		Department dept2 = new Department("HR","Chennai");	//Transient state
		Employee emp2 = new Employee("Surendhara",22,30000);
		
		emp2.setDepartment(dept2);
		dept2.setEmployee(emp2);
		session.save(dept2);	//Persistent state
		session.save(emp2);
		
		tx.commit();	

		session.close();	//Detached state
	}
}
