package com.maven.day1.Student;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		Employee e = new Employee();

//    	s1.setSid(1);
//    	s1.setScity("Salem");
//    	s1.setSname("Prem");
//    	
//    	s1.setSid(2);
//    	s1.setScity("karur");
//    	s1.setSname("vignesh");

		e.setEmpId(1);
		e.setEmpName("Vicky");
		e.setEmpCity("Karur");
		
		e.setEmpId(2);
		e.setEmpName("Surya");
		e.setEmpCity("Tmalai");


		
		Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		session.save(e);
		t.commit();

	}
}
