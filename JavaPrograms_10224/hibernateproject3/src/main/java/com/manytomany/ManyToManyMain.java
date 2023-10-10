package com.manytomany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ManyToManyMain {
	public static void main(String[] args) {
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");	//The database is hibernatemtm for this - changed in the cfg file
		config.addAnnotatedClass(Project.class);
		config.addAnnotatedClass(Employee.class);

		SessionFactory sf = config.buildSessionFactory();
		Session session = sf.openSession();

		Project proj1 = new Project(1,"Angular Project");
		Project proj2 = new Project(2,"React Project");
		Project proj3 = new Project(3,"Web Application Project");

		List<Project> projList = new ArrayList<Project>();
		projList.add(proj1);
		projList.add(proj2);
		projList.add(proj3);

		Employee emp1 = new Employee(1001, "Surendharan");
		Employee emp2 = new Employee(1002, "Aakash");
		Employee emp3 = new Employee(1003, "Priya");

		List<Employee> empList = new ArrayList<Employee>();
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		
		emp1.setProjects(projList);
		//proj1.setEmployees(empList);

		Transaction tx = session.beginTransaction();
		session.save(emp1);
		session.save(emp2);
		session.save(emp3);

		session.save(proj1);
		session.save(proj2);
		session.save(proj3);

		
		tx.commit();
		session.close();
	}
}
