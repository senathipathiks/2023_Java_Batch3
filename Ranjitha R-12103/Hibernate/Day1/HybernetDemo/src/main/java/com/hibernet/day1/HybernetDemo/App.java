package com.hibernet.day1.HybernetDemo;

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
       //Student s1=new Student(1,"Ranjitha","Cuddalore");
       //Student s2=new Student(2,"Ram","Chennai");
    	//Employee e1=new Employee(1,"Arun","Vadalur");
    	Employee e2=new Employee(2,"Thamizh","Chennai");
      Configuration cfg=new Configuration().configure("hibernate.cfg.xml");
      SessionFactory factory= cfg.buildSessionFactory();
      Session session=factory.openSession();
      Transaction t=session.beginTransaction();
      //session.save(s1);
      //session.save(s2);
      session.save(e2);
      t.commit();
    }
}
