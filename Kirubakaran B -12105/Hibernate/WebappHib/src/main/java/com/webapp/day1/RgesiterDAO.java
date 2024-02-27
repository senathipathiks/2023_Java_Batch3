package com.webapp.day1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RgesiterDAO {

	public static int register(Register obj) {
		
		  Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
			 SessionFactory factory = cfg.buildSessionFactory();
			 Session s = factory.openSession();
			 Transaction t = s.beginTransaction();
			 int i=(Integer)s.save(obj);
			 t.commit();
		return i;
		
	}
}
