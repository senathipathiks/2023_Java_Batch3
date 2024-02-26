package com.associate.EmployeeMap;

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
    public static void main( String[] args )
    {
    	
		Configuration cfg = new Configuration().configure().addAnnotatedClass(Employee.class).addAnnotatedClass(Dept.class);
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		Dept d1 = new Dept(33, "development");
		
		Employee e1 = new Employee(1, "Jeeva", d1);
		session.persist(e1);
		Employee e2 = new Employee(2, "Prasanth", d1);
		session.persist(e2);
		
		t.commit();
    }
}
