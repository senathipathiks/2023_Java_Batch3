package com.maven.day4.Employee;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
    	SessionFactory factory=cfg.buildSessionFactory();
    	Session session=factory.openSession();
    	Transaction t = session.beginTransaction();
    	Laptop l1 =new Laptop(10,"Dell");
    	session.save(l1);
    	Employee e1=new Employee(5,"PREM",l1);
    	session.save(e1);
    	t.commit();
    }
}
