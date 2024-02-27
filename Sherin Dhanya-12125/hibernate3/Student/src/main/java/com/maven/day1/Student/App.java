package com.maven.day1.Student;

import org.hibernate.cfg.Configuration;
import org.hibernate.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Employee s1= new Employee(3,"kiruba","bca");
        
        Configuration cfg=new Configuration().configure("hibernate.cfg.xml");
        SessionFactory factory=cfg.buildSessionFactory();
        Session session=factory.openSession();
        Transaction t=session.beginTransaction();
        session.save(s1);
        t.commit();
        session.close();
    }
}
