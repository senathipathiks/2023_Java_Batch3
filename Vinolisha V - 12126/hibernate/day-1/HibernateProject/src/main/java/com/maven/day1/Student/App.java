package com.maven.day1.Student;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;
public class App
{
    public static void main( String[] args )
    {
    	Student s1 = new Student(1,"vinolisha","Nagercoil");
    	Student s2=new Student(2, "Vino" , "Chennai");
    	Student s3=new Student(3,"Balu","Tirutani");
    	
    	
    	Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
    	SessionFactory factory=cfg.buildSessionFactory(); //will connect the connection database
    	Session session = factory.openSession();
    	Transaction t = session.beginTransaction(); //provide the commit and rollback
    	session.save(s1);
    	session.save(s2);
    	session.save(s3);
    	t.commit();
    }
}