package com.day4.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.day4.bean.Deptartment;
import com.day4.bean.Employee;
import com.day4.bean.Laptop;

public class OneToManyDriver {

	public static void main(String[] args) throws InterruptedException {
		Configuration con = new Configuration().configure().addAnnotatedClass(Employee.class)
				.addAnnotatedClass(Deptartment.class).addAnnotatedClass(Laptop.class);

		SessionFactory factory = con.buildSessionFactory();

		Session session = factory.openSession();

		Transaction t = session.getTransaction();

		Laptop l = new Laptop();
		l.setLname("dell");
		l.setProcessor("intel i7");
		l.setStorage("512gb");
		
		Laptop l1 = new Laptop();
		l1.setLname("hp");
		l1.setProcessor("intel i7");
		l1.setStorage("512gb");
		
		Deptartment dept = new Deptartment();
		dept.setDept_name("development");
		Deptartment dept1 = new Deptartment();
		dept1.setDept_name("Testing");
		
		Employee e1 = new Employee("Sundhar Raj", dept, l);
		Employee e2 = new Employee("Prem Kumar", dept, l1);
		
		t.begin();
		System.out.println(e1 + "e1");
		session.persist(e1);
		Thread.sleep(2000);
		System.out.println(e2 + "e2");
		session.persist(e2);
		t.commit();
		session.close();
	}

}
