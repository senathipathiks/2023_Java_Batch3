package com.spring.day1.Employee;

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
        Configuration cfg=new Configuration().configure("hibernate.cfg.xml");
        SessionFactory factory=cfg.buildSessionFactory();
        Session session=factory.openSession();
        Transaction t=session.beginTransaction();
        
        Department d1=new Department(143,"Sales");
        Department d2=new Department(144,"Marketing");
        Department d3=new Department(145,"Marketing");
        Employee e1=new Employee(108,"Sherin",d1);
        Employee e2=new Employee(109,"Brainy",d1);
        Employee e3=new Employee(110,"Fathi",d2);
        Employee e4=new Employee(111,"Priya",d3);
        
        session.persist(d1);
        session.persist(d2);
        session.persist(d3);
        
       
        
        session.persist(e1);
        session.persist(e2);
        session.persist(e3);
        session.persist(e4);
        
        t.commit();
        
    }
}
