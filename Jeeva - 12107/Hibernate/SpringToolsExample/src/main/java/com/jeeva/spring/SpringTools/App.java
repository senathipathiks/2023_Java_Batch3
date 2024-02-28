package com.jeeva.spring.SpringTools;

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
    	Laptop l1= new Laptop(1,"Dell");
    	session.persist(l1);
    	Employee el=new Employee(105,"soori",l1);
    	session.persist(el);
    	
    	t.commit();
    }
}
