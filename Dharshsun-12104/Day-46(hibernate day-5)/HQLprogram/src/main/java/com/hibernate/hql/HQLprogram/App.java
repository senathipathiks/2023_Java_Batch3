package com.hibernate.hql.HQLprogram;

import java.util.Iterator;
import java.util.List;
import java.util.Random;
import javax.persistence.*;
import javax.persistence.Query;

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
    	Transaction t=session.beginTransaction();
    	
    	Criteria criteria = session.createCriteria(Employee.class);
//    	
//    	List<Employee> list=criteria.list();
//    	for(Object li : list) {
//    		System.out.println(li);
    	
//    	 
//    	criteria.setFirstResult(10);  
//    	criteria.setMaxResults(20);  
//    	List list=criteria.list();  
//    	for(Object li:list) {
//    		System.out.println(li);
//    	}
    	
//    	criteria.setProjection(Projections.property("ename"));
//    	List list=criteria.list();
//    	for(Object li : list) {
//    		System.out.println(li);
//    	}
    	
    	
    	
//    	criteria.add(Restrictions.gt("eid",10));
//    	List list = criteria.list();
//    	for(Object li:list) {
//    	System.out.println(li);
//    	}
    	
    	//arrange in descending order
//    	criteria.addOrder(Order.desc("eid"));
//    	List list = criteria.list();
//    	for(Object li:list) {
//    	System.out.println(li);
//    	}
    	
    	//arrange in ascending order
//    	criteria.addOrder(Order.asc("eid"));
//    	List list = criteria.list();
//    	for(Object li:list) {
//    	System.out.println(li);
//    	}
    	
    	
//    	Random r = new Random();
    	
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
    	
//    	Query query = session.createQuery("From Employee"); //here employee is class name
//    	List<Employee> employee = query.getResultList();
//    	for(Employee e:employee) {
//    		System.out.println(e);
//    	}
//    	t.commit();
    	
//    	Query query = session.createQuery("From Employee where dept>1");
//    	List<Employee> employee = query.getResultList();
//    	
//    	for(Employee e:employee) {
//    		System.out.println(e);
//    	}
    	//select query execution
//    	Query query = session.createQuery("From Employee where eid=10");
//    	Employee employee = (Employee)((org.hibernate.query.Query) query).uniqueResult();
//    	System.out.println(employee);
    	
    	//select with where clause
//    	Query query = session.createQuery("select eid,ename,dept From Employee where eid=4");
//    	Object[] employee = (Object[])((org.hibernate.query.Query) query).uniqueResult();
//    	System.out.println(employee[0]+":"+employee[1]+":"+employee[2]);
    	
    	//select with where clause
//    	Query query = session.createQuery("select eid,ename,dept From Employee where dept>1");
//    	List<Object[]> employees = (List<Object[]>) query.getResultList();
//    	for(Object[] employee:employees)
//    		System.out.println(employee[0]+":"+employee[1]+":"+employee[2]);
    	
    	//aggregate function
//    	Query query = session.createQuery("select count(eid) From Employee where dept>1");
//    	List employees = (List) query.getResultList();
//    	for(Object count:employees)
//    		System.out.println(count);
    	
//    	Query query = session.createQuery("select sum(dept) From Employee");
//    	Long employees = (Long)((org.hibernate.query.Query) query).uniqueResult();
//    	System.out.println(employees);
    	
//    	Query query = session.createQuery("select avg(eid) From Employee");
//    	double employees = (double)((org.hibernate.query.Query) query).uniqueResult();
//    	System.out.println(employees);
    	
//    	Query q = session.createQuery("update Employee set ename=:n where eid=:i");
//    	q.setParameter("n", "SanjayKhanna");
//    	q.setParameter("i",3);
//    	int status=q.executeUpdate();
//    	if(status>0)
//    		System.out.println("updated successfully");
//    	else
//    		System.out.println("Not updated");
//   
//    	t.commit();
    	
//    	Query q = session.createQuery("delete from Employee where id=29");
//    	int status=q.executeUpdate();
//    	if(status>0)
//    		System.out.println("Deleted successfully");
//    	else
//    		System.out.println("Not found");
//    	
//    	t.commit();
    	
//    	TypedQuery query = session.getNamedQuery("findElementByDept");
//    	query.setParameter("dept", 1);
//    	
//    	List<Employee> employees = query.getResultList();
//    	
//    	Iterator<Employee> itr = employees.iterator();
//    	while(itr.hasNext()) {
//    		Employee e = itr.next();
//    		System.out.println(e);
//    		session.persist(e);
//    	}
    	
//    	TypedQuery query = session.getNamedQuery("findEmployeeById");
//    	query.setParameter("eid", 10);
//    	
//    	List<Employee> employees = query.getResultList();
//    	
//    	Iterator<Employee> itr = employees.iterator();
//    	while(itr.hasNext()) {
//    		Employee e = itr.next();
//    		System.out.println(e);
//    		session.persist(e);
//    	}
    	
    	Query query = session.getNamedQuery("findElementByName");
    	query.setParameter("ename", "Name1");
    	
    	List<Employee> employees = query.getResultList();
    	
    	for (Employee employee : employees) {
			System.out.println(employee);
		}
    	t.commit();
    }
}

