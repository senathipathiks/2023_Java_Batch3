package sms.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import sms.bean.Student;

public class DBUtility {
	
	public static Session getConnection() {
		
		Configuration con = new Configuration().configure().addAnnotatedClass(Student.class);
		
		SessionFactory factory = con.buildSessionFactory();
		
		return factory.openSession();
		
	}

}
