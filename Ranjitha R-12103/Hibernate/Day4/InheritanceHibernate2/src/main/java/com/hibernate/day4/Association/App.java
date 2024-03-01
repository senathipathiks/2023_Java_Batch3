package com.hibernate.day4.Association;

import java.util.ArrayList;

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
//		ArrayList<Employee> list = new ArrayList<Employee>();
//
//		Department d1 = new Department(103, "sales");
//		Department d2 = new Department(104, "Markting");
//		Employee e1 = new Employee(105, "Ramkumar", d1);
//		Employee e2 = new Employee(106, "Rajkumar", d1);
//		Employee e3 = new Employee(107, "Ranjith", d2);
//		session.persist(e1);
//		session.persist(e2);
//		session.persist(e3);
//		t.commit();

		Employees e1 = new RegularEmp(101, "Arunkumar", 1000.0f, 1000);
		Employees e2 = new ContractEmp(102, "Arun", 1000.0f, "2 years");
		session.save(e1);
		session.save(e2);
		t.commit();
		System.out.println("Success");
	}
}
