package com.hibernate.day4.Association;

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
        Configuration cfg=new Configuration().configure("hibernate.cfg.xml");
        SessionFactory factory=cfg.buildSessionFactory();
        Session session=factory.openSession();
        Transaction t=session.beginTransaction();
        
       Employee e1=new RegularEmp(1001,"Srinivasan",1000.0f,10000);
       
       Employee e2=new ContractEmp(1002,"Arun",500.0f,"2 years");       
        
      session.save(e1);
      session.save(e2);
        
       t.commit();
        
    }
}
