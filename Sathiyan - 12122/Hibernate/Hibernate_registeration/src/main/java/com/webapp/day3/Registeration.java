package com.webapp.day3;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;



public class Registeration {
	
	public static int register(User u) {
		

		Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();

		int i = (Integer) session.save(u);

		t.commit();

		return i;

	}

}
