package com.hibernate.day5.EndToEnd;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	Configuration cfg=new Configuration().configure();
        SessionFactory factory=cfg.buildSessionFactory();
        Session session=factory.openSession();
        Transaction t=session.beginTransaction();
        
        User u1=new User();
        u1.setUserName("Srinivasan");
        
        Address add1=new Address();
        add1.setuStreet("Melpapanattu");
        add1.setuCity("Neyveli");
        
        
        Mobile m1=new Mobile();
        m1.setBrand("Samsung");
        m1.setModel("Galaxy s24 ultra");
        
        
        Vehicle v1=new Vehicle();
        v1.setvName("Vento");
        
        // user and address
        u1.setAddress(add1);
        add1.setUser(u1);
        
        //user and mobile        
        m1.setUser(u1);
        u1.getMob().add(m1);
        
        //user and vehicle
        v1.getUser().add(u1);
        u1.getVeh().add(v1);
        
        session.persist(u1);
//        session.persist(add1);
//        session.persist(m1);
//        session.persist(v1);
        
        t.commit();
        
        session.close();
        
        
        
    }
}
