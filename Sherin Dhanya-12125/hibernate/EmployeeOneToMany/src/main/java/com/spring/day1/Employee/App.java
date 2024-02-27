package com.spring.day1.Employee;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	 Configuration cfg=new Configuration().configure("hibernate.cfg.xml");
         SessionFactory factory=cfg.buildSessionFactory();
         Session session=factory.openSession();
         Transaction t=session.beginTransaction();

         Department d1=new Department(106,"it",e1);
         Department d2=new Department(104,"cse",e2);
         
         Employee e1=new Employee(34,"Ammu");
         Employee e2=new Employee(35,"rijo");
         Employee e3=new Employee(356,"rijo");
         
         session.persist(e1);
         session.persist(e2);
         session.persist(e3);
         t.commit();
    }
}
