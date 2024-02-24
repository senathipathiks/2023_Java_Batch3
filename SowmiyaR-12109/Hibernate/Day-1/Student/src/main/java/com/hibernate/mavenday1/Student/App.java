package com.hibernate.mavenday1.Student;

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
//        Student s1=new Student(1,"Sowmi","chennai");
//        Student s2=new Student(2,"Hari","Mumbai");
//    	Student s3=new Student(4,"Sherin","Trichy");
//        
//        Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
//        SessionFactory factory=cfg.buildSessionFactory();
//        Session session=factory.openSession();
//        Transaction t=session.beginTransaction();
////        session.save(s1);
//        session.save(s3);
//        t.commit();
//    	================================================================
    	
    	Employee e1=new Employee(1,"sowmi","chennai");
    	Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
      SessionFactory factory=cfg.buildSessionFactory();
      Session session=factory.openSession();
      Transaction t=session.beginTransaction();
//      session.save(s1);
      session.save(e1);
      t.commit();
    	
    
    }
}
