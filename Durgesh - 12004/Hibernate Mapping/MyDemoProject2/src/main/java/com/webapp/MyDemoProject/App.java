package com.webapp.MyDemoProject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
    	SessionFactory sf = cfg.buildSessionFactory();
    	Session s = sf.openSession();
    	Transaction t = s.beginTransaction();
    	
    	Employee e1 = new Regular(101,"Raja","Developer",4500.85f,250);
    	Employee e2 = new Regular(121,"Vinay","Developer",5400.23f,279);
    	Employee e3 = new Contract(111,"Kamal","Developer",350.76f,4);


    	s.save(e1);
    	s.save(e2);
    	s.save(e3);

    	
    	t.commit();
   	
    	System.out.println("Entry Done");
    }
}
