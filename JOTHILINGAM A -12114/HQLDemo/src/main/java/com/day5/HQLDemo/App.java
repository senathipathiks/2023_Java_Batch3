package com.day5.HQLDemo;

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
    public static void main( String[] args )
    {
        Configuration cfg=new Configuration().configure("hibernate.cfg.xml");
        SessionFactory factory=cfg.buildSessionFactory();
        Session session=factory.openSession();
        Transaction t=session.beginTransaction();
        
//        Random r=new Random();  // to generate random numbers
        
//        for(int i=0;i<30;i++) {
//        	Employee emp=new Employee();
//        	t.begin();
//        	emp.setEroll(i);
//        	emp.setEname("name"+i);
//        	session.save(emp);
//        	t.commit();
//        }
        
        
        // List all the datas
        
//        Query query=session.createQuery("From Employee");
//        List<Employee> employee=query.getResultList();
//        for(Employee e:employee) {
//        	System.out.println(e);
//        }
        
        
        // get the value which is graeater than eroll 23
        
//        Query query=session.createQuery("From Employee where eroll>10");
//        List<Employee> employee=query.getResultList();
//        for(Employee e: employee) {
//        	System.out.println(e);
//        }
        
        
        // find by eroll
//        Query query=session.createQuery("From Employee where eroll=10");
//        Employee emp=(Employee)((org.hibernate.query.Query)query).uniqueResult();
//        System.out.println(emp);
        
        
        //select the particular details
//        Query query=session.createQuery("select  eroll,ename From Employee where eroll=10");
//        Object[] employee=(Object[])((org.hibernate.query.Query)query).uniqueResult();
//        System.out.println("Employee ID : "+ employee[0]+ " | Employee Name : " + employee[1]);
        
       
        // select with where clause
        
//        Query query=session.createQuery("select  eroll,ename From Employee where eroll>10");
//         List<Object[]> employee=(List<Object[]>) query.getResultList();
//       for(Object[] emp:employee) {
//    	   System.out.println("Employee ID : "+ emp[0]+ " | Employee Name : " + emp[1]);
//       }
        
       // aggregate function-count
        
//       Query query=session.createQuery("select  count(eroll) From Employee where eroll>0");
//       List employee=query.getResultList();
//       for(Object count: employee) {
//    	   System.out.println("No of count"+count);
//       }
    	   
    // aggregate function-min   
//       Query query=session.createQuery("select  min(eroll) From Employee");
//       List emp=(List) query.getResultList();
//       System.out.println(emp);
       
    // aggregate function-max
//       Query query=session.createQuery("select  max(eroll) From Employee");
//       List emp=(List) query.getResultList();
//       System.out.println(emp);
       
       
    // aggregate function-sum
//       Query query=session.createQuery("select  sum(eroll) From Employee");
//       List emp=(List) query.getResultList();
//       System.out.println(emp);
       
       
       //aggregate function-average
//       Query query=session.createQuery("select  avg(eroll) From Employee");
//       List emp=(List) query.getResultList();
//       System.out.println(emp);
       
       
       // Update the element
       
//       Query query=session.createQuery("update Employee set ename=:n where eroll=:i");
//       query.setParameter("n", "jothi");
//       query.setParameter("i", 3);
//       int n=query.executeUpdate();
//       if(n>0) {
//    	   System.out.println("Updated");
//       }
//       else {
//    	   System.out.println("Not Updated");
//	}
       
       // delete the element
       Query query=session.createQuery("delete from Employee  where eroll=:i");
       query.setParameter("i", 3);
       int n=query.executeUpdate();
       if(n>0) {
    	   System.out.println("Deleted");
       }
       else {
    	   System.out.println("Deletion Fail");
	}
        
        t.commit();
    }
}
