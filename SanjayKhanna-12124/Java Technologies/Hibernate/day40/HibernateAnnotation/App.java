package com.sms.mavan.HibernateAnnotation;

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
    	Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
    	SessionFactory factory = cfg.buildSessionFactory();
    	Session session = factory.openSession();
    	Transaction tans = session.getTransaction();
    	
    	Student stu1 = new Student();
    	stu1.setStuName("prasath");
    	stu1.setCity("Chennai");
    	
    	tans.begin();
    	session.save(stu1);
    	tans.commit();
    }
}
