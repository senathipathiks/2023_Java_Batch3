package com.hibernate.day5.HQLExample.HQL_HCQL_NamedQuery;

import java.util.Iterator;
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

 

 

/**
 * Hello world!
 *
 */
public class App 

{
    public static void main( String[] args )
    {

    	Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
    	SessionFactory factory = cfg.buildSessionFactory();
    	Session session = factory.openSession();
    	Transaction t = session.beginTransaction();
    	
    	Criteria criteria=session.createCriteria(Employee.class);
    	
//Random r = new Random();
//    	
//    	for(int i=1;i<30;i++) {
//    		Employee emp = new Employee();
//    		emp.setEid(i);
//    		emp.setEname("Name"+i);
//    		emp.setDept(r.nextInt(4));
//    		session.persist(emp);
//    		
//    	}
//    	 
//    	t.commit();
    	
//    	Query query=session.createQuery("From Employee where dept>1");
//    	List<Employee> employee=query.getResultList();
//    	
//    	for(Employee e:employee) {
//    		
//    		System.out.println(e);
//    	}
    	
//    	Query query=session.createQuery("From Employee where eid=10");
//    	Employee employee=(Employee)((org.hibernate.query.Query)query).uniqueResult();
//    	System.out.println(employee);
    	
    	
//    	select query execution:
    	
//    	Query query=session.createQuery("select eid,ename,dept from Employee where eid=4"); 
//    	Object[] employee=(Object[])((org.hibernate.query.Query)query).uniqueResult();
//    	System.out.println(employee[0]+":"+employee[1]+":"+employee[2]);
    	
    	//Select with where clause
    	
//    	Query query=session.createQuery("select eid,ename,dept from Employee where eid=>1");
//    	List<Object []> employees=(List<Object[]>)query.getResultList();
//    	for(Object[] employee:employees)
//    		
//    		System.out.println(employee[0]+":"+employee[1]+":"+employee[2]);
//    	
    	
    	//Aggregate function
    	
//    	Query query =session.createQuery("select count(eid) From Employee where dept>1");
//    	List employees=(List) query.getResultList();
//    	System.out.println(employees);
    	
//    	Query query =session.createQuery("select sum(eid) From Employee where dept>1");
//    	Long employees=(Long)((org.hibernate.query.Query)query).uniqueResult();
//    	System.out.println(employees);
 
//    	Query query =session.createQuery("select avg(eid) From Employee where dept>1");
//    	double employees=(double)((org.hibernate.query.Query)query).uniqueResult();
//    	System.out.println(employees);
    	
    	
    	
    	//*** Update the element***//
    	
//    	Query q =session.createQuery("update Employee set ename=:n where eid=:i");
//    	q.setParameter("n","Prem");
//    	q.setParameter("i",3);
//    	int status=q.executeUpdate();
//    	if(status>0)
//    		System.out.println("Upadted Successfully");
//    	else
//    		System.out.println("Not Updated");
//    		
//  t.commit();
  
    	
    	
    	// ****** Delete the Element ******//
    	
//    	Query q =session.createQuery("delete from Employee where eid=3");
//    	int status=q.executeUpdate();
//    	if(status>0)
//    	{
//    		System.out.println("deleted successfully");
//    	}
//    	else
//    		System.out.println("Not deleted..");
//    	
//    	 t.commit();	
    	
    	//**********HCQL*************//
    	
    	
    	// list all :
    	
//    	List<Employee> list =criteria.list();
//    	for(Object li:list) {
//    		System.out.println(li);
//    		
//    	}
    	
    	//ID greater than 10
    	
//    	criteria.add(Restrictions.gt("eid",10));
//    	List list=criteria.list();
//    	for(Object li:list) {
//    		System.out.println(li);
//    	}
    	
    	//Arrange in Descending order
    	
//    	criteria.addOrder(Order.desc("eid"));
//    	List list=criteria.list();
//    	for(Object li:list)
//    	{
//    		System.out.println(li);
//    	}
    	
    	//Arrange in Ascending order
    	
//    	criteria.addOrder(Order.asc("eid"));
//    	List list=criteria.list();
//    	for(Object li:list)
//    	{
//    		System.out.println(li);
//    	}
    	
    	
    	//limit the numbers
    	
//    	criteria.setFirstResult(10);
//    	criteria.setMaxResults(20);
//    	
//    	List list =criteria.list();
//    	
//    	for (Object li:list) {
//    		System.out.println(li);
//    	}
    	
    	// fetch data of particular clum  by projections such as name
    	
//    	criteria.setProjection(Projections.property("ename"));
//    	List list=criteria.list();
//    	
//    	for (Object li:list) {
//    		
//    		System.out.println(li);
//    	}
//    	

    	
    	// Names Query  i) Annotation ii) by Mapping file
    	
    	
    	TypedQuery query =session.getNamedNativeQuery("findEmployeeByID");
    	query.setParameter("eid",10);
    	
    	List<Employee> employees=query.getResultList();
    	
    	Iterator<Employee> itr = employees.iterator();
    	while(itr.hasNext()) {
    		Employee e =itr.next();
    		System.out.println(e);
    	}
    	
    	t.commit();
    	
         
    }
}
