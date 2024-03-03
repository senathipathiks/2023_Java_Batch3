package com.balu.day1.Hibernate;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;
public class App1 
{
    public static void main( String[] args )
    {
    	Employee s1 = new Employee(1,"balu","chennai");
    	Employee s2 = new Employee(2,"Loki","chennai");
    	
    	Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
    	SessionFactory factory=cfg.buildSessionFactory();
    	Session session = factory.openSession();
    	Transaction t = session.beginTransaction();
    	session.save(s1);
    	session.save(s2);
    	t.commit();
    	
    }
}