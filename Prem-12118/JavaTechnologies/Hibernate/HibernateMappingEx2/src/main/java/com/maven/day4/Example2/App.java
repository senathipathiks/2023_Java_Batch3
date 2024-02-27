package com.maven.day4.Example2;

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
	
	Employee e1 = new RegularEmployee(102,"Prem",16000.00f,1000);
	Employee e2 = new ContractEmployee(107,"Hema",25000.00f,"2 Years");
	
	session.save(e1);
	session.save(e2);
	
	
	t.commit();
	
}
}
