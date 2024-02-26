package com.hibernate.relationshipmappingday4.Employee;

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
//        System.out.println( "Hello World!" );
    	Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
    	SessionFactory factory = cfg.buildSessionFactory();
    	Session session = factory.openSession();
    	Transaction t=session.beginTransaction();
    	Laptop l1 = new Laptop(141,"Lenovo");
    	Employee e1 = new Employee(102,"Dharshsun",l1);
    	session.save(l1);
    	session.save(e1);
    	
    	t.commit();
    	
    }
}
