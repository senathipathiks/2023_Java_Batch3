package com.hibernate.util;

import java.sql.Connection;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.bean.Student;

public class HibernateUtil {
	 
	public static Session getConnection() {
			
			Configuration con = new Configuration().configure().addAnnotatedClass(Student.class);
			
			SessionFactory factory = con.buildSessionFactory();
			
			return factory.openSession();
			
		}
	 
}
