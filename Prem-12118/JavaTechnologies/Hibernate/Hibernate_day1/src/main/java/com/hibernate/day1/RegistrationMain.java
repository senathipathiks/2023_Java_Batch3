package com.hibernate.day1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RegistrationMain {

	static Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
	static SessionFactory factory = cfg.buildSessionFactory();
	static Session session = factory.openSession();
	static Transaction t = session.getTransaction();

	public static int register(Registration b) {

		int i = 0;
		t.begin();
		
		session.save(b);
		i++;
		t.commit();

		return i;

	}

}
