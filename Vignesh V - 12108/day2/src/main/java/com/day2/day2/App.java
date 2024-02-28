package com.day2.day2;

import java.util.List;

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
		Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();

//		Employee s1=new Employee(); 
//		s1.setEid(1);
//		s1.setName("vignesh");
//		
//		s1.setEid(2);
//		s1.setName("surya");
//		
////		
//		Employee temp=session.find(Employee.class,1);
//		temp.setName("sena");
//		session.update(temp);
		t.commit();

		List<Employee> temp = session.createQuery("from Employee").list();

		for (Employee e : temp) {
			System.out.println(e);

		}

	}
}
