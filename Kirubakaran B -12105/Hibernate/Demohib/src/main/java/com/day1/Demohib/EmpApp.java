package com.day1.Demohib;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmpApp {

	public static void main(String[] args) {
	
		
		
		Employee e1=new Employee(101,"hemz","12000");
		
		Configuration cfg=new Configuration().configure();
		SessionFactory sf=cfg.buildSessionFactory();
	    Session s=sf.openSession();
	    Transaction t=s.beginTransaction();
	    s.save(e1);
	    t.commit();
	    System.out.println(e1);
	    
//	    e1 = s.get(Employee.class, 103);
//	    System.out.println(e1.getEname());
//	    System.out.println(e1.getEsal());
//	    t.commit();
//	    e1 = s.get(Employee.class, 102);
//	    
//	    e1.setEname("kiruba");
//	    e1.setEsal("24500");
//	    
//	   s.update(e1);
//	    t.commit();
//	    System.out.println("updated sucessfuly");
//	    System.out.println(e1);
	}

}
