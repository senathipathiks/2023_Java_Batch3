package com.spring.day2.HQLPrg;

import java.util.Iterator;
import java.util.List;
import java.util.Random;

import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

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
    public static void main( String[] args )
    {
	 Configuration cfg=new Configuration().configure("hibernate.cfg.xml");
    SessionFactory factory=cfg.buildSessionFactory();
    Session session=factory.openSession();
    Transaction t=session.beginTransaction();
    Random r=new Random();
    
//    for(int i=1;i<30;i++) {
//    	Employee emp=new Employee();
//    	emp.setEid(i);
//    	emp.setEname("Name" + i);
//    	emp.setDept(r.nextInt(4));
//    	session.persist(emp);
//    }
   
//    To list all the data in the table
//    Query query = session.createQuery("From Employee");
//    List<Employee> employee=query.getResultList();
//    for(Employee e: employee) {
//    	System.out.println(e);
//    }
    
//   Get the value from the department which is greater than 1
//    Query query = session.createQuery("From Employee where dept>1");
//    List<Employee> employee = query.getResultList();
//    for(Employee e: employee) {
//    	System.out.println(e);
//    }
    
//    show the value of id=10
//    Query query = session.createQuery("From Employee where eid=10");
//    Employee employee =(Employee)((org.hibernate.query.Query)query).uniqueResult();
//    System.out.println(employee);
    
//    select query execution
//    Query query = session.createQuery("select eid,ename,dept From Employee where eid=4");
//    Object[]employee = (Object[])((org.hibernate.query.Query)query).uniqueResult();
//    System.out.println("Employee Id = " + employee[0] + "\nEmployee Name = " + employee[1] + "\nDepartment = " + employee[2]);
    
//    using where clause 
//    Query query = session.createQuery("select eid, ename, dept From Employee where dept>1");
//    List<Object[]> employees = (List<Object[]>) query.getResultList();
//    for(Object[] employee : employees)
//    	System.out.println("Employee Id = " + employee[0] + "\nEmployee Name = " + employee[1] + "\nDepartment = " + employee[2]);
    
//    Aggregrate function ---->count
//    Query query1 = session.createQuery("select count(eid) From Employee ");
//    List employees1 =(List) query1.getResultList();
//    for(Object count : employees1)
//    System.out.println("Count = " + count);
//   
////    //    Aggregrate function ---->max
//    
//    Query query2 = session.createQuery("select max(eid) From Employee ");
//    List employees2 =(List) query2.getResultList();
//    for(Object max : employees2)
//    System.out.println("Maximun = " + max);
//    
////  Aggregrate function ---->min
//    
//    Query query3 = session.createQuery("select min(eid) From Employee ");
//    List employees3 =(List) query3.getResultList();
//    for(Object min : employees3)
//    System.out.println("Minimum = " + min);
////    
//////  Aggregrate function ---->count
////    
//    Query query4 = session.createQuery("select sum(eid) From Employee ");
//    List employees4 =(List) query4.getResultList();
//    for(Object sum : employees4)
//    System.out.println("Sum = " + sum);
//    
////  Aggregrate function ---->avg
//    
//    Query query5 = session.createQuery("select avg(eid) From Employee ");
//    List employees5 =(List) query5.getResultList();
//    for(Object avg : employees5)
//    System.out.println("Average = " + avg);
//    
////   update the element
//    Query q= session.createQuery("update Employee set name = :n where eid=:i");
//    q.setParameter("n", "Sowmiya");
//    q.setParameter("i", 4);
//    int status = q.executeUpdate();
//    if(status>0)
//    	System.out.println("Updated successfully");
//    else
//    	System.out.println("Not updated");
//    
//  // delete the element
//    Query q1= session.createQuery("delete From Employee where id =30");
//    int status1 = q1.executeUpdate();
//    if(status1>0)
//    	System.out.println("Updated successfully");
//    else
//    	System.out.println("Not found");
    
    
 //===========================HCQL========================================================
//    Criteria criteria =session.createCriteria(Employee.class);
    
    //List all the elements
//    List<Employee> list = criteria.list();
//    for(Object li : list) {
//    	System.out.println(li);
//    }
    
//    Id greater than 10
//    criteria.add(Restrictions.gt("eid", 10));
//    List list= criteria.list();
//    for(Object li: list) {
//    	System.out.println("List of HCQL =" + li);
//    }
  
//    Arrange in descending order
//    criteria.addOrder(Order.desc("eid"));
//    List list= criteria.list();
//    for(Object li: list) {
//    	System.out.println("List of HCQL in descending order = " + li);
//    }
     
//  Arrange in Ascending order
//  criteria.addOrder(Order.asc("eid"));
//  List list= criteria.list();
//  for(Object li: list) {
//  	System.out.println("List of HCQL in Ascending order = " + li);
//  }  
   
//  limit the number of elements
//  criteria.setFirstResult(10);
//  criteria.setMaxResults(10);
//  List list = criteria.list();
//  for(Object li: list) {
//	  	System.out.println(li);
//	  } 
    
//    fetching the data from a particular column by projection such as name
//    criteria.setProjection(Projections.property("ename"));
//    List list=criteria.list();
//    for(Object li: list) {
//	  	System.out.println(li);
//	  } 
    	
//===========================Named Query========================================
   TypedQuery query = session.getNamedQuery("findEmployeeById");
   query.setParameter("eid", 10);
   List<Employee> employees = query.getResultList();
   Iterator<Employee> itr = employees.iterator();
   while(itr.hasNext()) {
	   Employee e= itr.next();
	   System.out.println(e);
   }
    		
   
}
}
























