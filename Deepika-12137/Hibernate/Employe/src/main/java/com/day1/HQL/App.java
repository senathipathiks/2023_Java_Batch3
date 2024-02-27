package com.day1.HQL;


import java.util.List;
import java.util.Random;

import javax.persistence.*;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
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
        Random r=new Random();
        
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
//        List employees =(List) query.getResultList();
//        for(Object count : employees)
//        	System.out.println(count);
        
//        Query query = session.createQuery("select MAX(Eid) from Employe");
//        List employees =(List) query.getResultList();
//        for(Object max : employees)
//      	System.out.println(max);
        
//        Query query = session.createQuery("select min(eid) from Employe where dept > 1");
//        
//        List <Employe>emp = query.getResultList();
//        
//        System.out.println(emp);
        
//        for (Employe employe : emp) {
//			System.out.println(employe);
//		}
        
//        Query query = session.createQuery("select SUM(Eid) from Employe");
//        List employees =(List) query.getResultList();
//        for(Object sum: employees)
//      	System.out.println(sum);
 
//        Query q=session.createQuery("delete from Employe where Eid=1");
//        int status=q.executeUpdate();
//        
//        System.out.println(status);
//        if(status==0)
//        	System.out.println("Deleted successfuly");
//        else
//        	System.out.println("not found");
        
Criteria criteria = session.createCriteria(Employe.class);
    	
    	List<Employe> list=criteria.list();
    	for (Object emp : list) {
			System.out.println(emp);
		}
        t.commit();
    }
}
