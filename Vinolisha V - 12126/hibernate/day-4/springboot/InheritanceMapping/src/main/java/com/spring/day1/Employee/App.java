package com.spring.day1.Employee;

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
        
       Employee e1=new RegularEmp(101,"Sena",10000.00f,1000);
       Employee e2=new ContractEmp(102,"Gowtham",10000.00f,"2 years");
       
       session.save(e1);
       session.save(e2);
       
       t.commit();
       System.out.println("Success");
       
    }
}
