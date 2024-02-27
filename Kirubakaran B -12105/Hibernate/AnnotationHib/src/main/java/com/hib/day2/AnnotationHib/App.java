package com.hib.day2.AnnotationHib;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class App 
{
    public static void main( String[] args )
    {
       Employee1 e1=new Employee1();
		
		Configuration cfg=new Configuration().configure();
		SessionFactory sf=cfg.buildSessionFactory();
	    Session s=sf.openSession();
	    Transaction t=s.beginTransaction();
//	     e1=s.find(Employee1.class,52);
////    e1.setEname("jeeva");
//         s.delete(e1);
//	    t.commit();
//	    System.out.println(e1);
	    List<Employee1> ls=s.createQuery("from Employee1").list();
	    for (Employee1 em1 : ls) {
		     System.out.println(em1);	
		}
	    
	    
    }
}
