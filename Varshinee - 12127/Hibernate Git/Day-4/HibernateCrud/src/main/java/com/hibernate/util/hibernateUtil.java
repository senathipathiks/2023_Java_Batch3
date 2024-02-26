package com.hibernate.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.bean.Student;
 
public class hibernateUtil {
 
	public static Session opensession() {
	   Configuration cfg=new Configuration().configure().addAnnotatedClass(Student.class);
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		return session;
	}
 
}