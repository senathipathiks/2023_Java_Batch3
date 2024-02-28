package com.day5.HCQLinHibernate;

import java.util.Iterator;
import java.util.List;
import java.util.Random;

import javax.persistence.Query;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;



public class App 
{
	@SuppressWarnings({"unchecked", "deprecation"})
    public static void main( String[] args )
    {
    	 
    	        Configuration cfg=new Configuration().configure("hibernate.cfg.xml");
    	        SessionFactory factory=cfg.buildSessionFactory();
    	        Session session=factory.openSession();
    	        Transaction t=session.beginTransaction();
    	        
    	        Criteria criteria=session.createCriteria(Employee.class);
    	        
    	        //List all the employee
//    	        List<Employee> list=criteria.list();
//    	        for (Object li : list) {
//				System.out.println(li);			
//				
//    	        }
    	        
    	        //Id greater than 10
//    	        criteria.add(Restrictions.gt("eid", 10));
//    	        List list=criteria.list();
//    	        for (Object li : list) {
//					System.out.println(li);
//				}
    	        
    	        //Id Lesser than 10
//    	        criteria.add(Restrictions.lt("eid", 10));
//    	        List list=criteria.list();
//    	        for (Object li : list) {
//					System.out.println(li);
//				}
    	        
    	        //Arrange in Descending order
//    	        criteria.addOrder(Order.desc("eid"));
//    	        List list=criteria.list();
//    	        for (Object li : list) {
//					System.out.println(li);
//				}
    	        
    	        
    	        //Arrange in Ascending order
//    	        criteria.addOrder(Order.asc("eid"));
//    	        List list=criteria.list();
//    	        for (Object li: list) {
//					System.out.println(li);
//				}
    	        
    	        //Limit the number of lists
//    	        criteria.setFirstResult(10);
//    	        criteria.setMaxResults(10);
//    	        List list=criteria.list();
//    	        for (Object li : list) {
//					System.out.println(li);
//				}
    	        
    	        //Fetch data of a particular column by projection such as name
    	        criteria.setProjection(Projections.property("ename"));
    	        List list=criteria.list();
    	        for (Object li : list) {
					System.out.println(li);
    	        }
    	        
    	        t.commit();	           	        
    	        
    

    }
}
