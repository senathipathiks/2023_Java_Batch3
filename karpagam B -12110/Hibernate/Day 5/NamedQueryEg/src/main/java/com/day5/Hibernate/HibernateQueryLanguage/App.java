package com.day5.Hibernate.HibernateQueryLanguage;

import java.util.List;
import java.util.Random;

import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;


/**
 * Hello world!
 *
 */
public class App 
{ 
	@SuppressWarnings({"unchecked","deprecation"}) //it will not give warning for unused variables
    public static void main( String[] args )
    {
    	Configuration cfg=new Configuration().configure("hibernate.cfg.xml");
        SessionFactory factory=cfg.buildSessionFactory();
        Session session =factory.openSession();
        Transaction t=session.beginTransaction();
        
        TypedQuery query=session.getNamedQuery("findEmployeeById");
        query.setParameter("eid", 1);
        
        List<Employee> employees=query.getResultList();
        
        
        employees.forEach(x->System.out.println(x));
        	
		
        
       
}
}
