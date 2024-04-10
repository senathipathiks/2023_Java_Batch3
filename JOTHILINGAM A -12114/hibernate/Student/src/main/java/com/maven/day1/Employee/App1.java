package com.maven.day1.Employee;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App1 {
	public static void main(String[] args) {
//		Employee1 emp1=new Employee1(101, "Jothi", "Developer", 100, 9444397577l, "Jothilingamtpt@gmail.com");
		Configuration cfg=new Configuration().configure("hibernate1.cfg.xml");
    	
    	SessionFactory factory=cfg.buildSessionFactory();
    	Session session=factory.openSession();
    	Transaction t=session.beginTransaction();
//    	session.save(emp1);
//    	t.commit(); 		
    	
    	
    	
    	//delete
    	
    	Employee1  emp=session.find(Employee1.class,101);
    	System.out.println(emp);
    	session.remove(emp);
    	t.commit();
    	System.out.println("Succesful");
    	
	}
}
