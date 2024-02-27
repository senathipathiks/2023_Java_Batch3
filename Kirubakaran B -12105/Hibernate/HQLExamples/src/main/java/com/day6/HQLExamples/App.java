package com.day6.HQLExamples;

import java.util.List;
import java.util.Random;

import org.hibernate.NonUniqueResultException;
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
    public static void main( String[] args )
    {
    	Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory fact = cfg.buildSessionFactory();
		Session s = fact.openSession();
		Transaction t = s.beginTransaction();
		
		
		Random r=new Random();
//		for (int i = 1; i < 30; i++) {
//			Employee4 e=new Employee4();
//			e.setempid(i);
//			e.setempname("Name"+i);
//			e.setDept(r.nextInt(4));
//			s.persist(e);
//			
//		}
		
		//list all the data in the table
//		
//		Query query=s.createQuery("From Employee4");
//		List<Employee4> emp=query.getResultList();
//		
//		for (Employee4 e1 : emp) {
//		   System.out.println(e1);	
//		}
		
		
	//Get the value which the deptno is greater than 1
		
//		Query query=s.createQuery("From Employee4 where dept=2");
//		List<Employee4> emp=query.getResultList();
//		
//		for (Employee4 e1 : emp) {
//		   System.out.println(e1);	
//	}
//		Query query=s.createQuery("From Employee4 where id=2");
//		List<Employee4> emp=query.getResultList();
//		   System.out.println(emp);
//		
//		Query query=s.createQuery("select empname From Employee4 where empid>25 ");
//		
//		Object[] ew=(Object[]) ((org.hibernate.query.Query) query).uniqueResult();
//		System.out.println(ew[0]);
		
		
//		//Aggregate the function
//		Query query = s.createQuery("select count(empid) From Employee4 where dept>2");
//	    List employee4 =(List) query.getResultList();
//	    for(Object c : employee4)
//		System.out.println(c);
	    
//		Query query=s.createQuery("select sum(dept) From Employee4 ");
//	
//		Long ew=(Long) ((org.hibernate.query.Query) query).uniqueResult();
//	     System.out.println(ew);
		
//		  
//				Query query=s.createQuery("select avg(empid) From Employee4 ");
//			
//				double ew=(double) ((org.hibernate.query.Query) query).uniqueResult();
//			     System.out.println(ew);
//		
//		Query q=s.createQuery("update Employee4 set empname=:n where empid=:i");
//		q.setParameter("n", "kiruba");
//		q.setParameter("i", 3);
//		int sta=q.executeUpdate();
//		if(sta>0)
//			System.out.println("updated succesfully");
//		else
//			System.out.println("not updated");
		
		Query q=s.createQuery("delete from  Employee4 where empid=2");
		int sta=q.executeUpdate();
		if(sta>0)
		System.out.println("deleted succesfully");
		else
			System.out.println("not deleted");
		
		t.commit();
    }


}
