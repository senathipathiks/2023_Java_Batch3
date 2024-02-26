package com.Employee.Employee;

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
    	 Employee s1 = new Employee();
         
         s1.setEid(101);
         s1.setEname("Arun");
         
         s1.setEcity("Chennai");
         
         System.out.println(s1);
         
         Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
         SessionFactory factory = cfg.buildSessionFactory();
         Session session = factory.openSession();
         Transaction t = session.beginTransaction();
         
         session.save(s1);
         t.commit();
    }
}
