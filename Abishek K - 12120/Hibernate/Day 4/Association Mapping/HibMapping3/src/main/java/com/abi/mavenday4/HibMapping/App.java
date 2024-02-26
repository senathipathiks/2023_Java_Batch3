package com.abi.mavenday4.HibMapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
       Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
       SessionFactory factory = cfg.buildSessionFactory();
       Session session = factory.openSession();
       Transaction t = session.beginTransaction();
       
       Department d1 = new Department(101, "Developer");
       Department d2 = new Department(111, "Testing");
       Employee e1 = new Employee(12120, "Abishek", d1);
       Employee e2 = new Employee(12111, "Loki", d2);
       Employee e3 = new Employee(14589, "Vishnu", d2);
       Employee e4 = new Employee(45788, "Dharsan", d1);
       session.persist(e1);
       session.persist(e2);
       session.persist(e3);
       session.persist(e4);
       
       t.commit();
    }
}
