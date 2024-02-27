package com.day1.Employee.Employee;

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
         Transaction t= session.beginTransaction();
         Laptop l1=new Laptop(121,"Dell");
         session.persist(l1);
         Employee e1=new Employee(123,"Sena",l1);
         session.persist(e1);
         
         t.commit();
         
    }
}
