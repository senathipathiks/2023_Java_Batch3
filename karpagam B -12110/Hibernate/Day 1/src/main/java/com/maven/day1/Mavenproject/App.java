package com.maven.day1.Mavenproject;

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
       Student s1=new Student(3,"Anu","Sivakasi");
    	
      Configuration cfg=new Configuration().configure("hibernate.cfg.xml");
      SessionFactory factory= cfg.buildSessionFactory();
      Session session=factory.openSession();
      Transaction t=session.beginTransaction();
      session.save(s1);
      t.commit();
    }
}