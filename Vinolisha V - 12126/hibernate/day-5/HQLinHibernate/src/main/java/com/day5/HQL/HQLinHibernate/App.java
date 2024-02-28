package com.day5.HQL.HQLinHibernate;

import java.util.Iterator;
import java.util.List;
import java.util.Random;

import javax.persistence.Query;

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
    	        
    	        Random r=new Random();
    	        
    	        //inserting the value into employee class
//    	        for(int i=1; i<30; i++) {
//    	        	Employee emp=new Employee();
//    	        	emp.setEid(i);
//    	        	emp.setEname("Name"+i);
//    	        	emp.setDept(r.nextInt(4));
//    	        	session.persist(emp);
//    	        	
//    	        }
    	        
    	        
    	        //list all the data in the table
//    	        Query query= session.createQuery("From Employee");
//    	        List<Employee> employee=query.getResultList();
//    	        for(Employee e: employee) {
//    	        	System.out.println(e);
//    	        }
    	        
    	        //Get the value which the deptno is greater than 1
//    	        Query query =session.createQuery("From Employee where dept>1");
//    	        List<Employee> employee=query.getResultList();
//    	        
//    	        for (Employee e : employee) {
//					System.out.println(e);
//				}
    	        
    	        //show the value which the id=10
//    	        Query query=session.createQuery("From Employee where eid=10"); 
//    	        List<Employee> employee=query.getResultList();
//    	        for (Employee e : employee) {
//					System.out.println(e);
//				}
    	        
    	        
    	        //select Query execution
//    	        Query query=session.createQuery("select eid,ename,dept From Employee where eid=4");
//    	        Object[] employee =(Object[])((org.hibernate.query.Query) query).uniqueResult();
//    	        System.out.println(employee[0]+":"+ employee[1]+ ":" + employee[2]);
    	       
    	        
    	        //select with where clause
//    	        Query query=session.createQuery("select eid, ename, dept From Employee where dept>1");
//    	        List<Object[]> employees =(List<Object[]>) query.getResultList();
//    	        for (Object[] e : employees) {
//    	        	System.out.println("Employee ID: "+ e[0] + " EmployeeName: " + e[1]+ " EmployeeDept: " + e[2]);
//					
//				}
//    	        
    	        
    	        //Aggregate function
    	        
//    	        Query query=session.createQuery("select count(eid) From Employee where dept>1");
//    	        List employees=(List) query.getResultList();
//    	        for (Object count : employees) {
//					System.out.println(count);
//				}
    	        
//    	        Query query=session.createQuery("select sum(eid) From Employee where dept>1");
//    	        List employee=(List)query.getResultList();
//    	        for (Object sum : employee) {
//					System.out.println(sum);
//				}

    	        
//    	        Query query=session.createQuery("select avg(eid) From Employee where dept>1");
//    	        List employee=(List)query.getResultList();
//    	        for (Object avg : employee) {
//					System.out.println(avg);
//				}
    	        
//    	        Query query=session.createQuery("select min(eid) From Employee where dept>1");
//    	        List employee=(List)query.getResultList();
//    	        for (Object min : employee) {
//					System.out.println(min);
//				}
    	        
    	        
//    	        Query query=session.createQuery("select max(eid) From Employee where dept>1");
//    	        List employee=(List)query.getResultList();
//    	        for (Object max : employee) {
//					System.out.println(max);
//				}
    	        
    	        
//    	        //update the element    	        
    	        Query query=session.createQuery("update Employee set name=:n where eid=:i");
    	        query.setParameter("n", "Thanisha");
    	        query.setParameter("i",6);
    	        int status=query.executeUpdate();
    	        if(status>0)
    	        	System.out.println("Updated Successfully");
    	        else
    	        	System.out.println("Not Update");

    	        
//    	        //delete the element
//    	        Query query=session.createQuery("delete from Employee where eid=29");
//    	        int status=query.executeUpdate();
//    	        if(status>0)
//    	        	System.out.println("Deleted Successfully");
//    	        else
//    	        	System.out.println("Not Found");
    	        
    	        
    	        
    	        
    	        t.commit();	           	        
    	        
    }
}
