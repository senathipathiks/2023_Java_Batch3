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
//        Student s1=new Student();
//        
//        s1.setSid(1);
//        s1.setSname("Sathya");
//        s1.setScity("Chennai");
//        
//        Configuration cfg=new Configuration().configure("hibernate.cfg.xml");
//        SessionFactory factory=cfg.buildSessionFactory();
//        Session session=factory.openSession();
//        Transaction t=session.beginTransaction();
//        
//        session.save(s1);
//        t.commit();
        
        Employee e1=new Employee();
        
        e1.setEid(1);
        e1.setEname("Sathya");
        e1.setRole("Developer");
        e1.setLocation("Chennai");

        
        Configuration cfg=new Configuration().configure("hibernate.cfg.xml");
        SessionFactory factory=cfg.buildSessionFactory();
        Session session=factory.openSession();
        Transaction t=session.beginTransaction();
        
        session.save(e1);
        t.commit();
        
        
        
    }


}
