package com.day5.IntroHibernateMap;

import org.hibernate.cfg.Configuration;
import org.hibernate.*;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory fact = cfg.buildSessionFactory();
		Session s = fact.openSession();
		Transaction t = s.beginTransaction();
		Department2 d1 = new Department2(11, "HR");

		Employee2 e2 = new Employee2(22, "Kiruku", d1);
		Employee2 e3 = new Employee2(23, "vinotham", d1);

		s.persist(e2);
		s.persist(e3);
		t.commit();
	}
}
