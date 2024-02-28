package com.maven.day1.Student;


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
    	Student s1 = new Student();
    	
    	s1.setStudId(4);
    	s1.setStudCity("Salem");
    	s1.setStudName("Prem");
    	
    	
    	
    	
    	Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
    	SessionFactory factory=cfg.buildSessionFactory();
    	Session session=factory.openSession();
    	Transaction t = session.beginTransaction();
    	session.save(s1);
    	t.commit();
    	
    	

    }
}
 
