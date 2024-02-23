package com.demo.sms;

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
//        Student s1=new Student();
    	Employee e1=new Employee();
        
        Configuration conf=new Configuration().configure("hibernate.cfg.xml");
        SessionFactory fac=conf.buildSessionFactory();
        Session session=fac.openSession();
        Transaction t=session.beginTransaction();
        
//        s1.setId(101);
//        s1.setName("srini");
//        s1.setCity("Neyveli");
        
        e1.setEmpId(12113);
        e1.setEmpName("Srinivasan");
        e1.setEmpDesig("SoftwareEngineer");
        
//        session.persist(s1);
        session.persist(e1);
        
        t.commit();
        
        
    }
}
