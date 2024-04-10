package com.sundhar.Employee;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main(String[] args) {
		 Employee emp=new Employee(102, "heram", "devops", 5000.00, 9444397577l, "jothilingamtpt@gmail.com");
		 
		 Configuration cfc = new Configuration().configure().addAnnotatedClass(Employee.class);
		 SessionFactory factory = cfc.buildSessionFactory();
		 Session session = factory.openSession();
		 Transaction t = session.beginTransaction();
		 session.persist(emp);
		 t.commit();
	}
  
}
