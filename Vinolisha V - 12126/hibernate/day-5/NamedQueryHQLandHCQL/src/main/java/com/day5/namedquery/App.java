package com.day5.namedquery;

import java.util.Iterator;
import java.util.List;
import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App 
{
	@SuppressWarnings({"unchecked", "deprecation"})
    public static void main( String[] args )
    {
    	 
    	        Configuration cfg=new Configuration().configure("hibernate.cfg.xml");
    	        SessionFactory factory=cfg.buildSessionFactory();
    	        Session session=factory.openSession();
    	        Transaction t=session.beginTransaction();
    	        
    	       TypedQuery query=session.getNamedQuery("findEmployeeById");
    	       query.setParameter("eid", 10);
    	       
    	       List<Employee> employees = query.getResultList();
    	       
    	       for (Employee e : employees) {
				System.out.println(e);
				
			}
    	        
    	        t.commit();	           	        
    	        
    }
}
