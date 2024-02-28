package com.abi.mavenday5.HibeHQL;

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
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

public class App 
{
    public static void main( String[] args )
    {
        Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        Transaction t = session.beginTransaction();
        Random r = new Random();
        
        
        
        //Insering Value into Employee Class
//      for(int i=1;i<30;i++) {
//      	Employee emp = new Employee();
//      	emp.setEid(i);
//      	emp.setEname("Name:"+i);
//      	emp.setDept(r.nextInt(4));
//      	session.persist(emp);
//      }
        
        TypedQuery query = session.getNamedQuery("findEmployeeById");
        query.setParameter("eid", 10);
        
        
        
        
        List<Employee> list = query.getResultList();
        for(Employee li : list) {
        	System.out.println(li);
        }
       
        
        
        
       
        t.commit();
        
    }
}
