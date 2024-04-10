package com.day5.ManyToOne;

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
       Session session=(Session) factory.openSession();
       Transaction t=session.beginTransaction();
       
       Department d1=new Department(200, "Hr");
       Department d2=new Department(201, "Devops");
       Employee e1=new Employee(345, "keert", d1);
       Employee e2=new Employee(452, "vino", d1);
       
       session.persist(e1);
       session.persist(e2);
      
      
       t.commit();
    }
}
