package com.maven.day1.Student;

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
    	
    	// for student
    	
//    	Student s1=new Student(102, "Logesh", "Pazhani");
//    	
//    	
//    	Configuration cfg=new Configuration().configure("hibernate.cfg.xml");
//    	
//    	SessionFactory factory=cfg.buildSessionFactory();
//    	Session session=factory.openSession();
//    	Transaction t=session.beginTransaction();
//    	session.save(s1);
//    	t.commit();
//    	System.out.println("Succesfully");
//    	session.close(); 
    	
    	

    	Employee emp=new Employee(101, "Jothi", 1500, "Tirupattur");
    	
    	Configuration cfg=new Configuration().configure("hibernate.cfg.xml");
    	
    	SessionFactory factory=cfg.buildSessionFactory();
    	Session session=factory.openSession();
    	Transaction t=session.beginTransaction();
    	session.save(emp);
    	t.commit();    	
    	
    }
}