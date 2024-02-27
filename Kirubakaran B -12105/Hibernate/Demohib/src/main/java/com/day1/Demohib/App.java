package com.day1.Demohib;

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
        Student s1 = new Student(102, "Kirubakaran", "kallakurichi");
        
        Configuration con = new Configuration().configure("hibernate.cfg.xml");
        SessionFactory sf = con.buildSessionFactory();
        Session ss = sf.openSession();
        Transaction t = ss.beginTransaction();
        ss.save(s1);
        t.commit();
    }
}
