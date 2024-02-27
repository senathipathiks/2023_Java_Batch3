package com.mon.jpa.sample4;

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
    	
    	Employee e1 = new RegularEmployee(101,"Bass engira Baskaran",16000.00f,1000);
    	Employee e2 = new ContractEmployee(105,"Monalisa",25000.00f,"2 Years");
    	session.save(e1);
    	session.save(e2);
    	 
    	
    	t.commit();
    	
    	System.out.println("Success !!");
    }
}
