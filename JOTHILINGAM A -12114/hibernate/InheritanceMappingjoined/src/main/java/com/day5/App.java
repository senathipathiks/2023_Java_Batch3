package com.day5;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
       Configuration cfg=new Configuration().configure("hibernate.cfg.xml");
       SessionFactory factory=cfg.buildSessionFactory();
       Session session=(Session) factory.openSession();
       Transaction t=session.beginTransaction();
       Employee e1=new RegularEmp(101, "jothi",10000.00f, 1000);
       Employee e2=new ContractEmp(102, "vino", 10000.00f, "2years");
       
       session.save(e1);
       session.save(e2);
     
       t.commit();
    }
}
