package com.sts.day1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		
		Employee e1=new RegularEmployee(101, "Sathya",10000.0f, 1000);
		Employee e2=new ContractEmployee(102, "Sathya", 10000.0f, "2 years");
		session.save(e2);
		session.save(e1);
		
		t.commit();
    }
}
