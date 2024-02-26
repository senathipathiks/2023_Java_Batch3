package com.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


import com.bean.Student;

public class Util {
	
	public static Session openSession(){
		
		Configuration cfg = new Configuration().configure().addAnnotatedClass(Student.class);
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		return session;
		
	}
}
