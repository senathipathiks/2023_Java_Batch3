package com.maven.day1.Student;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;
public class App1
{
    public static void main( String[] args )
    {
    	Employee e1 = new Employee(1,"vinolisha","Nagercoil");
    	Employee e2=new Employee(2, "Vino" , "Chennai");
    	Employee e3=new Employee(3,"Balu","Tirutani");
    	
    	
    	Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
    	SessionFactory factory=cfg.buildSessionFactory();
    	Session session = factory.openSession();
    	Transaction t = session.beginTransaction();
    	session.save(e1);
    	session.save(e2);
    	session.save(e3);
    	t.commit();
    	
    	
    }
}
