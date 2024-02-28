package com.hibernate.day5.OneToOne;

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
        
        
        Details details=new Details();
        details.setUhouseNo(416);
        details.setuStreet("Anna salai");
        details.setuArea("Anna nagar");
        session.persist(details);
        
        User user=new User();
        
        user.setuName("Srini");
        user.setuCity("Chennai");
        user.setD(details);
        
        session.persist(user);
        
        
        
        t.commit();
    }
}
