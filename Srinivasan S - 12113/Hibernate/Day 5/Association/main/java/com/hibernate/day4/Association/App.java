package com.hibernate.day4.Association;

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
        
        Laptop l=new  Laptop(111,"Dell");
        session.persist(l);
        
        Employee emp=new Employee(1,"Srini",l);
        session.persist(emp);
        
        
        
        t.commit();
        
    }
}
