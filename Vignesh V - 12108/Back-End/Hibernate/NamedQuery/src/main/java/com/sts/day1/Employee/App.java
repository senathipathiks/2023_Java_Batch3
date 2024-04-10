package com.sts.day1.Employee;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;

import javax.persistence.TypedQuery;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {

		Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		
//		Random r=new Random();
//		
//		for (int i = 1; i < 20; i++) {
//			Employee e=new Employee();
//			e.setEid(i);
//			e.setEname("Name" +i);
//			e.setDept(r.nextInt(4));
//			session.persist(e);
//		}

		TypedQuery query = session.getNamedQuery("findEmployeeById");
		query.setParameter("eid", 10);

		List<Employee> employees = query.getResultList();

		Iterator<Employee> itr = employees.iterator();
		while (itr.hasNext()) {
			Employee e = itr.next();
			System.out.println(e);
		}
		
//		TypedQuery query = session.getNamedQuery("findElementByDept");
//		query.setParameter("dept", 1);
//
//		List<Employee> employees = query.getResultList();
//
//		Iterator<Employee> itr = employees.iterator();
//		while (itr.hasNext()) {
//			Employee e = itr.next();
//			System.out.println(e);
//		}
		
		
//		TypedQuery query = session.getNamedQuery("findElementByName");
//		query.setParameter("name", " Name20");
//
//		List<Employee> employees = query.getResultList();
//
//		Iterator<Employee> itr = employees.iterator();
//		while (itr.hasNext()) {
//			Employee e = itr.next();
//			System.out.println(e);
//		}
		
//		TypedQuery query = session.getNamedQuery("findElementByName");
//		query.setParameter("name", " Name3");
//		List<Employee> employees = query.getResultList();
//		Iterator<Employee> itr = employees.iterator();
//		while (itr.hasNext()) {
//			Employee e = itr.next();
//			System.out.println(e);
//		}

		t.commit();

	}
}
