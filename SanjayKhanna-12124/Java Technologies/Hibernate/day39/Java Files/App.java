package com.sms.mavenday1.Student;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.sms.maven.excerise.Employee;





/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        System.out.println( "Hello World!" );
    	
//    	Student s1 = new Student(1, "Sanjaykhanna", "Chennai");
    	Employee e1 = new Employee(12124, "Sanjay Khanna", 23);
    	Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
    	SessionFactory factory = cfg.buildSessionFactory();
    	Session session = factory.openSession();
    	Transaction tans = session.getTransaction();
    	tans.begin();
    	session.save(e1);
    	tans.commit();
    	
    	
    	
    }
}
