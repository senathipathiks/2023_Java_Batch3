package com.jpa1.HQL;

import java.util.List;
import java.util.Random;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import jakarta.persistence.Query;

public class App 
{
    public static void main( String[] args )
    {
       
    	
    	Configuration cfg=new  Configuration().configure();
    	SessionFactory fact=cfg.buildSessionFactory();
    	Session session=fact.openSession();
    	Transaction tran=session.beginTransaction();
    	Random r=new Random();// Generate A Random Number
    	
    //	 For Insert
    	for (int i = 1; i < 20; i++) {
			Employee emp=new Employee();
			emp.seteId(i);
			emp.seteName("EmpName "+i);
			emp.seteDeptNo(r.nextInt(1,4));
			session.persist(emp);
		}
    	

//    	// List All the Data in Table
//    	
//    	@SuppressWarnings("deprecation")
//		Query query=session.createQuery("from Employee");// from employee is class name
//    	List<Employee> employee=query.getResultList();
//    	
//    	for (Employee e : employee) {
//			System.out.println(e);// Here it will Print Two String Type
//		}
    	
    	
    	
    	// Get the Value which the deptNo is greater than 1
    	
//    	@SuppressWarnings("deprecation")
//		Query query= session.createQuery("from Employee where eDeptNo>2");
//    	List<Employee> l=query.getResultList();
//    	
//    	for (Employee e : l) {
//			System.out.println(e);
//		}
    	
    	
    	// Show the Specific Value like id=10;
    	
//    	@SuppressWarnings("deprecation")
//		Query q=session.createQuery("from Employee where eId=10"); 
//		List<Employee> l=q.getResultList();
//    	
//    	for (Employee e : l) {
//			System.out.println(e);
//		}
    	
    	
    	//  Select Query execution
    	
//    	Query query=session.createQuery("select eId,eName,eDeptNo from Employee where eId=4");
//    	Object[] obj= (Object[])((org.hibernate.query.Query) query).uniqueResult();
//    	System.out.println("EmpId : "+obj[0]+"\nEmpName : "+obj[1]+"\nDeptNo : "+obj[2]);
   	
    	
    	// Select With Where Clause
    	
//    	@SuppressWarnings("deprecation")
//		Query query=session.createQuery("select eId,eName,eDeptNo from Employee where eDeptNo>1");
//    	List<Object[]> list= query.getResultList();
//    	for (Object[] obj : list) {
//			
//    		System.out.println("EmpId : "+obj[0]+"  EmpName : "+obj[1]+"  DeptNo : "+obj[2]);
//    	   	
//		} 	
    	
    	// Aggregate Function
    	
//    	@SuppressWarnings("deprecation")
//		Query query=session.createQuery("select count(eId) from Employee where eDeptNo>1");
//    	List list=(List)query.getResultList();
//    	for (Object object : list) {
//			System.out.println(object);
//		}
    	
//    	@SuppressWarnings("deprecation")
//		Query query=session.createQuery("select max(eId) from Employee where eDeptNo>1");
//    	List list=(List)query.getResultList();
//    	for (Object object : list) {
//			System.out.println(object);
//		}
    	
//    	@SuppressWarnings("deprecation")
//		Query query=session.createQuery("select min(eId) from Employee where eDeptNo>1");
//    	List list=(List)query.getResultList();
//    	for (Object object : list) {
//			System.out.println(object);
//		}
    	
//    	@SuppressWarnings("deprecation")
//		Query query=session.createQuery("select sum(eId) from Employee where eDeptNo>2");
//    	List list=(List)query.getResultList();
//    	for (Object object : list) {
//			System.out.println(object);
//		}
    	
//    	@SuppressWarnings("deprecation")
//		Query query=session.createQuery("select avg(eDeptNo) from Employee where eDeptNo>1");
//    	List list=(List)query.getResultList();
//    	for (Object object : list) {
//			System.out.println(object);
//		}
    	
    	// Update The element
    	
//    	Query q=session.createQuery("update Employee set eName=:n where eId=:i");
//    	q.setParameter("n","Jeeva");
//    	q.setParameter("i", 1);    	
//    	int status=q.executeUpdate();
//    	
//    	if(status>0) {
//    		System.out.println("Updated");
//    	}else
//    		System.out.println("Not Update");
//    	
    	
    	// Delete The element
    	
//    	Query q=session.createQuery("delete from  Employee set  where eId=:i");
//    	q.setParameter("i", 2); 
//    	int status=q.executeUpdate();    	
//    	if(status>0) {
//    		System.out.println("Deleted");
//    	}else
//    		System.out.println("Deletion Failed");
//    	
    	
    	
    	
    	tran.commit();
    	
    	
    	
    	
    }
}
