package com.day1.HQL;


import java.util.Iterator;
import java.util.List;
import java.util.Random;

import javax.persistence.*;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;


/**
 * Hello world!
 *
 */
public class App 
{

    public static void main( String[] args )
    {
    	Configuration cfg=new Configuration().configure("hibernate.cfg.xml");
        SessionFactory factory=cfg.buildSessionFactory();
        Session session=factory.openSession();
        Transaction t= session.beginTransaction();
//        Random r=new Random();
//        
//        for(int i=1;i<20;i++) {
//        	Employe emp=new Employe();
//        	emp.setEid(i);
//        	emp.setEname("Name"+i);
//        	emp.setDept(r.nextInt(4));
//        	session.persist(emp);
//        }
        
//        Query query = session.createQuery("From Employe where dept>1");//Shows depts except 1st dept
//        List<Employe> employee=query.getResultList();
//        
//        for(Employe e:employee) 
//        {
//        	System.out.println(e);
//        }
        
        
//        Show the value which the id=10
//        Query query = session.createQuery("From Employe where Eid=10");
//        Employe employee = (Employe)((org.hibernate.query.Query) query).uniqueResult();
//        System.out.println(employee);
//        
        
////        Select query execution
//        Query query = session.createQuery("select Eid,Ename,dept From Employe where Eid=4");
//        Object[] employee= (Object[]) ((org.hibernate.query.Query) query).uniqueResult();
//        System.out.println(employee[0] +":"+employee[1]+":");
        
//        Select with where clause
//        Query query = session.createQuery("select Eid,Ename,dept From Employe where dept>1");
//        List<Object[]> employees =(List<Object[]>) query.getResultList();
//        for(Object[] employee :employees)
//        	System.out.println(employee[0]+":"+employee[1]+":"+employee[2]);
        
//        Aggregate function
//        Query query = session.createQuery("select count(Eid) From  Employe where dept>1");
//        List<Employe> employees =(List<Employe>) query.getResultList();
//        for(Object count : employees)
//        	System.out.println(count);
        
//        Query query = session.createQuery("select sum(Eid) From  Employe where dept>1");
//        List<Employe> employees =(List<Employe>) query.getResultList();
//        for(Object count : employees)
//        	System.out.println(count);
        
//        Query query = session.createQuery("select max(Eid) From  Employe where dept>1");
//        List<Employe> employees =(List<Employe>) query.getResultList();
//        for(Object count : employees)
//        	System.out.println(count);
        
//        Query query = session.createQuery("select min(Eid) From  Employe where dept>1");
//        List<Employe> employees =(List<Employe>) query.getResultList();
//        for(Object count : employees)
//        	System.out.println(count);
        
//        Query query = session.createQuery("select avg(Eid) From  Employe where dept>1");
//        List<Employe> employees =(List<Employe>) query.getResultList();
//        for(Object count : employees)
//        	System.out.println(count);
        
        
        
//        Query q=session.createQuery("update Employe set ename=:n where Eid=:i");  
//		q.setParameter("n","Deepika");  
//		q.setParameter("i",3);    
//		int status=q.executeUpdate();  
//		if (status>0)
//			System.out.println("Updated Successfully");
//		else
//			System.out.println("Not Updated"); 
		
//		
//		Query q=session.createQuery("delete from Employe where Eid=10");  
//		int status=q.executeUpdate();
//		if (status>0)
//			System.out.println("Deleted Successfully");
//		else
//			System.out.println("Not found");
//		
//        Criteria criteria = session.createCriteria(Employe.class);
//    	
//    	List<Employe> list=criteria.list();
//    	for (Object emp : list) {
//			System.out.println(emp);
//		}
        
//        ID greater than 8
//        criteria.add(Restrictions.gt("Eid",3));
//		List list=criteria.list();
//		for (Object li : list) {
//			System.out.println(li);
//		}
		 
		//Arrange in Descending order
//		criteria.addOrder(Order.desc("Eid"));  
//		List list=criteria.list();
//		for (Object li : list) {
//			System.out.println(li);
//		}
    	
//        Descending order
//		criteria.addOrder(Order.asc("Eid"));  
//		List list=criteria.list();
//		for (Object li : list) {
//			System.out.println(li);
//		}
		
		//Limit the number of lists
//		criteria.setFirstResult(11);  
//		criteria.setMaxResults(20);  
//		List list=criteria.list();
//		for (Object li : list) {
//			System.out.println(li);
//		}
		
		//fetch data of a particular column by projection such as name
//		criteria.setProjection(Projections.property("Eid"));  
//		List list=criteria.list();
//		for (Object li : list) {
//			System.out.println(li);
//		}
//		
		
//        Find employee by id
//		TypedQuery query = session.getNamedQuery("findEmployeById");
//		query.setParameter("Eid", 11);
//
//		List<Employe> employees = query.getResultList();
//
//		Iterator<Employe> itr = employees.iterator();
//		while (itr.hasNext()) {
//			Employe e = itr.next();
//			System.out.println(e);
//		}
		
//        TypedQuery query = session.getNamedQuery("findfindElementByDept");
//		query.setParameter("dept", 1);
//
//		List<Employe> employees = query.getResultList();
//
//		Iterator<Employe> itr = employees.iterator();
//		while (itr.hasNext()) {
//			Employe e = itr.next();
//			System.out.println(e);
//		}
		
		TypedQuery query = session.getNamedQuery("findElementByName");
		query.setParameter("Ename", " Name19");

		List<Employe> employees = query.getResultList();

		Iterator<Employe> itr = employees.iterator();
		while (itr.hasNext()) {
			Employe e = itr.next();
			System.out.println(e);
		}
        t.commit();
    }
    }
