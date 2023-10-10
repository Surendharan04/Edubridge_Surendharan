package com.hiber3;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
	public static void main(String[] args) {
		Configuration config = new Configuration();
		config.configure();
		config.addAnnotatedClass(Country.class);
		config.addAnnotatedClass(User.class);

		SessionFactory sf = config.buildSessionFactory();
	
		Session session = sf.openSession();
		
		Transaction tx = session.beginTransaction();
		
		Country country1 = new Country(1,"USA");
		User u1 = new User(2,"Racheal",28);
		
		u1.setCountry(country1);
		session.save(country1);
		session.save(u1);
		
		tx.commit();	

		session.close();
	}
}

