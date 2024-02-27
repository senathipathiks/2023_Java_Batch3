package com.hibernate.day5.HQL1;

import java.util.Iterator;
import java.util.List;
import java.util.Random;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import jakarta.persistence.Query;

/**
 * Hello world!
 *
 */
public class App 
{
	@SuppressWarnings({"unchecked","deprecation"})
    public static void main( String[] args )
    {
    	Configuration cfg=new Configuration().configure("hibernate.cfg.xml");
        SessionFactory factory=cfg.buildSessionFactory();
        Session session=factory.openSession();
        Transaction t=session.beginTransaction();
        Random r=new Random();
        
//        for (int i = 0; i < 15; i++) {
//			Employee emp=new Employee();
//			emp.seteId(i);
//			emp.seteName("Name"+i);
//			emp.seteDept(r.nextInt(4));
//			session.persist(emp);
//		}
        
//        Query query=session.createQuery("From Employee");
//        List<Employee>list=query.getResultList();
//        for (Employee e : list) {
//			System.out.println(e);
//		}
        
//        Query query=session.createQuery("From Employee where eDept>1");
//        List<Employee>list=query.getResultList();
//        
//        for (Employee e : list) {
//			System.out.println(e);
//		}
        
//        Query query=session.createQuery("From Employee where eId=12");
//        List<Employee>list=query.getResultList();
//        Employee emp=(Employee)((org.hibernate.query.Query) query).uniqueResult();              
//			System.out.println(list);
//			System.out.println(emp);
        
//        Query query=session.createQuery("select eId,eName,eDept From Employee where eId=5");
//    
//      Object[] emp=(Object[])((org.hibernate.query.Query) query).uniqueResult();
//      System.out.println(emp[0]+" : "+emp[1]+" : "+emp[2]);
        
//        Query query=session.createQuery("select count(eId) from Employee where eDept>0");
//      List<Employee> list=query.getResultList();
//      
//      for (Object count : list) {
//			System.out.println(count);
//		}
        
//        Query query=session.createQuery("update Employee set eName=:n where eId=:i");
//        query.setParameter("n", "Srinivasan");
//        query.setParameter("i", 1);
//        int status=query.executeUpdate();
//        
//        if(status>0) {
//        	System.out.println("Success");
//        }
//        else
//        	System.out.println("Failure")

        Query query=session.createQuery("delete Employee where eId=9");
        
        int status=query.executeUpdate();
        if(status>0) {
        	System.out.println("Success");
        }
        else
        	System.out.println("Failure");
        
        t.commit();
    }
}
