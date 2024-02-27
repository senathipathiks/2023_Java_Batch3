package com.mon.jpa.sample2;

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
    	Transaction t = session.beginTransaction();
    	Department d1=new Department(140,"frontend");
        Department d2= new Department(104,"backend");
    	Employee e1 = new Employee(12115,"Heram",d1);
    	Employee e2 = new Employee(12117,"JohnWick",d2);
    	session.persist(e1);
    	session.persist(e2);
    	
    	t.commit();
    }
}
