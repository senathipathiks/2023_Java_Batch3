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
    	
    	Department d1 = new Department(6, "Analyst");
    	Department d2 = new Department(2, "Admin");
    	Department d3 = new Department(3, "IT");
    	Department d4 = new Department(4, "Developer");
   
    	
    	Employee e1= new Employee(7, "Logesh",d4);

    	s.persist(e1);
    	
    	t.commit();
   	
    }
}
