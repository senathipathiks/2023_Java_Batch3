package com.hibernate.relationshipmappingday4.Employee1manytoone;

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
    	Department d1 = new Department(141,"Marketing");
    	Employee e1 = new Employee(102,"Dharshsun",d1);
    	session.save(d1);
    	session.save(e1);
    	
    	t.commit();
    	
    }
}
