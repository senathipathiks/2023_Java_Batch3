package com.balu.day1.Hibernate;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;
public class App 
{
    public static void main( String[] args )
    {
    	Student s1 = new Student(1,"BALA","CHENNAI");
    	Student s2 = new Student(2,"Vino","CHENNAI");
    	
    	Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
    	SessionFactory factory=cfg.buildSessionFactory();
    	Session session = factory.openSession();
    	Transaction t = session.beginTransaction();
    	session.save(s1);
    	session.save(s2);
    	t.commit();
    }
}

