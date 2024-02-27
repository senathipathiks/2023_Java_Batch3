package com.day4.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.day4.bean2.ConEmployee;
import com.day4.bean2.Employee1;
import com.day4.bean2.RegEmployee;

public class App1 {

	public static void main(String[] args) {

		Configuration con = new Configuration().configure().addAnnotatedClass(Employee1.class)
				.addAnnotatedClass(RegEmployee.class).addAnnotatedClass(ConEmployee.class);

		SessionFactory factory = con.buildSessionFactory();
		Session session = factory.openSession();

		Transaction t = session.getTransaction();

		Employee1 reg = new RegEmployee(100, "Sundhar", 7800.89, 1000.67);
		Employee1 conEmp = new ConEmployee(100, "Sundhar", 780.89, "2 years");
		
		t.begin();
		session.save(reg);
		session.save(conEmp);
		t.commit();
	}

}
