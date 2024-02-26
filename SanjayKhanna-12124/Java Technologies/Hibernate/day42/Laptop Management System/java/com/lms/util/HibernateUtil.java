package com.lms.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	
	public static Session connectionSession() {
	
	Configuration cfg = new Configuration().configure();
	SessionFactory factory = cfg.buildSessionFactory();
	Session session = factory.openSession();
	return session;
	
	}

}
