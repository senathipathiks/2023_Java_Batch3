package com.hibernate.mavenday1.Student;

import org.hibernate.SessionFactory;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        System.out.println( "Hello World!" );
//    	Student s1=new Student(3,"Kiruba","Goa");
    	Employee s1 = new Employee(6,"Chandru","Chennai");

    	Configuration cfg=new Configuration().configure("hibernate.cfg.xml");
    	SessionFactory factory=cfg.buildSessionFactory();
    	Session session=factory.openSession();
    	Transaction t=session.beginTransaction();
    	session.save(s1);
    	t.commit();
    	
    }
}
