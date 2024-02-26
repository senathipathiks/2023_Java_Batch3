package com.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bean.Employee;

public class Employeeutil {

	public static Session openSession(){
		
		Configuration cfg = new Configuration().configure().addAnnotatedClass(Employee.class);
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		return session;
		
	}
}
