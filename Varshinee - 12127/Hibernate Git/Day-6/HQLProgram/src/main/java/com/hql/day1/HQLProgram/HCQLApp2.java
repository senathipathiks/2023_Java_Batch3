package com.hql.day1.HQLProgram;

import java.util.List;
import java.util.Random;

import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Query;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.annotations.NamedQueries;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

/**
 * Hello world!
 *
 */
public class HCQLApp2 
{
	@SuppressWarnings({"unchecked","deprecation"})
    public static void main( String[] args )
    {
    	Configuration cfg=new Configuration().configure("hibernate.cfg.xml");
        SessionFactory factory=cfg.buildSessionFactory();
        Session session=factory.openSession();
        Transaction t=session.beginTransaction();
//        Random r=new Random(); //Generate a random number
        Criteria criteria=session.createCriteria(Employee.class);
        
        //List all the Employees
        
//        List<Employee> list=criteria.list();
//        for(Object li:list) {
//        	System.out.println(li);
//        }
//=======================================================================================================================
        //ID greater than 10
//        criteria.add(Restrictions.gt("eid", 10)); //gt(Greater than)lt(Lesser than)
//        List list=criteria.list();
//        for (Object li:list) {
//        	System.out.println(li);
//        }
//=======================================================================================================================     
        //Arrange in Descending order
//         criteria.addOrder(Order.desc("eid"));
//         List list=criteria.list();
//         for (Object li:list) {
//        	System.out.println(li);
//        }
//=======================================================================================================================        
        //Arrange in Ascending order
//        criteria.addOrder(Order.asc("eid"));
//         List list=criteria.list();
//         for (Object li:list) {
//        	System.out.println(li);
//        }
//=======================================================================================================================        
        //Limit the number of lists
//        criteria.setFirstResult(10);
//        criteria.setMaxResults(20);
//        List list=criteria.list();
//        for (Object li:list) {
//        	System.out.println(li);
//        }

//=======================================================================================================================      
        //Fetch data of a particular column by projection such as name
        criteria.setProjection(Projections.property("ename"));
        List list=criteria.list();
        for(Object li:list) {
        	System.out.println(li);
        }

        
    
    }   
}
