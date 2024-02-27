package com.day4.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.day4.bean.ContractEmployee;
import com.day4.bean.Employee;
import com.day4.bean.RegularEmployee;

public class App {
	public static void main(String[] args) {
		Configuration con = new Configuration().configure().addAnnotatedClass(Employee.class)
				.addAnnotatedClass(RegularEmployee.class).addAnnotatedClass(ContractEmployee.class);
		
		SessionFactory factory = con.buildSessionFactory();
		Session session = factory.openSession();
		
		Transaction t = session.getTransaction();
		
		Employee reg = new RegularEmployee(100, "Sundhar", 7800.89, 1000.67);
		Employee conEmp = new ContractEmployee(100, "Sundhar", 780.89, "2 years");
		
		t.begin();
		session.save(reg);
		session.save(conEmp);
		t.commit();
		System.out.println("success");
	}
}
