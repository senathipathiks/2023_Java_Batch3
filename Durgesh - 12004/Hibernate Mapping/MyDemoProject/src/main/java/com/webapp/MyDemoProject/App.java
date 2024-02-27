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
    	
    	Laptop l1 = new Laptop(2, "Hp");
    	s.persist(l1);
    	
    	Employee e1= new Employee(2,"Jennifer", "Analyst", l1);
    	s.persist(e1);
    	
    	t.commit();
   	
    }
}
