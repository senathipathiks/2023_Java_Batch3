package com.day5.HQL;

import java.util.List;
import java.util.Map;
import java.util.Random;

import javax.persistence.Query;

import org.hibernate.Criteria;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App {
	@SuppressWarnings({ "unchecked", "deprecation", "rawtypes" })
	public static void main(String[] args) {

		Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();

		Random r = new Random();// Generate a random number

		for (int i = 1; i < 30; i++) {
			Employee emp = new Employee();
			emp.setEid(i);
			emp.setEname("Name" + i);
			emp.setDept(r.nextInt(4));
			session.persist(emp);

		}

		// List all the data in the table
//		Query query = session.createQuery("From Employee");
//		List<Employee> employee = query.getResultList();
//		for (Employee e : employee) {
//			System.out.println(e);
//		}

		// Get the value which the deptNo is greater than 1
//		Query query = session.createQuery("From Employee where dept>1");
//		List<Employee> employee = query.getResultList();
//		
//		for (Employee e : employee) {
//			System.out.println(e);
//		}

		// Show the value which the id = 10
//		Query query = session.createQuery("From Employee where eid=10");
//		Employee employee = (Employee)((org.hibernate.query.Query) query).uniqueResult();		
//		System.out.println(employee);

		// Select Query execution
//		Query query = session.createQuery("select eid,ename,dept From Employee where eid=4");
//		Object[] employee =(Object[])  ((org.hibernate.query.Query) query).uniqueResult();
//		System.out.println(employee[0] + " : " +employee[1]+" : "+employee[2]);

		// select with where clause
//		Query query = session.createQuery("select eid,ename,dept From Employee where dept>1");
//		List<Object[]> employees =(List<Object[]>) query.getResultList();
//		for(Object[] employee : employees)
//			System.out.println(employee[0] + " : " +employee[1]+" : "+employee[2]);

		// Aggregate function
//		Query query = session.createQuery("select count(eid) From Employee where dept>1");
//		List employees =(List) query.getResultList();
//			System.out.println(employees);

//		Query query = session.createQuery("select sum(dept) From Employee");
//		Long employees =(Long) ((org.hibernate.query.Query) query).uniqueResult();
//			System.out.println(employees);

//		Query query = session.createQuery("select avg(eid) From Employee where dept>1");
//		double employees =(double) ((org.hibernate.query.Query) query).uniqueResult();
//			System.out.println(employees);

		// Update the element
		Query q = session.createQuery("update Employee set ename=:n where eid=:i");
		q.setParameter("n", "Sathya");
		q.setParameter("i", 3);
		int status = q.executeUpdate();
		if (status > 0)
			System.out.println("Updated Successfully");
		else
			System.out.println("Not Updated");

		// Delete the element
//		Query q=session.createQuery("delete from Employee where id=40");  
//		int status=q.executeUpdate();
//		if (status>0)
//			System.out.println("Deleted Successfully");
//		else
//			System.out.println("Not found");

		t.commit();

	}

}
