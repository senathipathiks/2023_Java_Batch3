package com.sts.day1.Employee;


import java.util.ArrayList;

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
        
        Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		
		Department d1=new Department(141,"Sales");
		Department d2=new Department(142,"Marketing");
		
		
		Employee e1=new Employee(101,"Tamizh",d1);
		Employee e2=new Employee(102,"Sathya",d1);
		Employee e3=new Employee(103,"Gokul",d2);
		session.persist(e1);
		session.persist(e2);
		session.persist(e3);
		
		t.commit();
		
    }
}
