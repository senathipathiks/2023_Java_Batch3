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
        
        Laptop l1=new Laptop(142,"Lenova");
        Laptop l2=new Laptop(155, "Dell");
        
        session.persist(l1);
        session.persist(l2);
        
        Employee e1=new Employee(106,"Viisha",l1);
        Employee e2=new Employee(107,"Vinolisha",l2);
        
        session.persist(e1);
        session.persist(e2);
        
        t.commit();
        
    }
}
