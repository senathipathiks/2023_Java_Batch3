package com.day4.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.day4.bean.ContractEmployee;
import com.day4.bean.Employee;
import com.day4.bean.RegularEmployee;
import com.day4.bean1.ConEmployee;
import com.day4.bean1.Employee1;
import com.day4.bean1.RegEmployee;

public class App2 {

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
		System.out.println("success");
	}

}
