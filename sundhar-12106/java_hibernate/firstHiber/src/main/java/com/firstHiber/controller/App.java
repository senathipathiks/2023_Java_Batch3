package com.firstHiber.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.firstHiber.bean.Student;

public class App 
{
    public static void main( String[] args )
    {
        Student s = new Student(101, "Sundhar Raj S", "Male", "CS", "Software Engineering");
        
        
        Configuration con = new Configuration().configure();
        SessionFactory sf = con.buildSessionFactory();
        Session sess = sf.openSession();
        
        Transaction t = sess.getTransaction();
        t.begin();
        sess.persist(s);
        t.commit();
        
    }
}
