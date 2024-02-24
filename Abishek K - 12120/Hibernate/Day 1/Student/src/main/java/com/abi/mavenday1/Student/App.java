package com.abi.mavenday1.Student;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App 
{
    public static void main( String[] args )
    {
        
//    	Student s1 = new Student();
//    	s1.setStudid(1);
//    	s1.setStuname("Abishek");
//    	s1.setStucity("Mohanur");
    	
    	Employee e1 = new Employee();
    	Employee e2 = new Employee();
    	e2.setEmpid(11);
    	e2.setEmpname("Abishek");
    	e2.setEmprole("Developer");
    	e2.setSalary(100);
    	
    	e1.setEmpid(22);
    	e1.setEmpname("Jeeva");
    	e1.setEmprole("Java Developer");
    	e1.setSalary(2000);
    	
    	Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
    	SessionFactory factory = cfg.buildSessionFactory();
    	Session session = factory.openSession();
    	Transaction t = session.beginTransaction();
    	session.save(e1);
    	session.save(e2);
    	t.commit();
    }
}
