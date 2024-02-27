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
        
        Department d3=new Department(1113,"Development");
//        Department d4=new Department(1112,"Testing");
        
        Employee emp1=new Employee(10,"Kaviya", d3);
        Employee emp2=new Employee(11,"Sundar",d3);
//        Employee emp3=new Employee(6,"Varshinee",d4);
        session.persist(emp1);
        session.persist(emp2);
//        session.persist(emp3);
         t.commit();
         Employee emp3=new Employee(12,"Kaviya", d3);

         t.begin();
         session.persist(emp3);
         t.commit();
        
    }
}
