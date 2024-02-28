package com.sample.maven.HibernateQueryLanguage;

import java.util.List;
import java.util.Random;

import javax.persistence.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.sample.bean.Employee;

public class App 
{
    @SuppressWarnings("unchecked")
	public static void main( String[] args )
    {
       Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
       SessionFactory factory = cfg.buildSessionFactory();
       Session session = factory.openSession();
       Transaction tran = session.getTransaction();
       
//       tran.begin();
//       Random  r = new Random();
//       for(int i =1;i<30;i++) {
//    	   Employee emp = new Employee(i, "Employee"+i, r.nextFloat(15000));
//    	   session.persist(emp);
//       }
//       tran.commit();
       
//       Query q = session.createQuery("from Employee");
//       List<Employee> list = q.getResultList();
//       list.forEach(Em->System.out.println(Em.toString()));
       
//       List<Employee> list2 = session.createQuery("from Employee where empSalary > 10000").list();
//       list2.forEach(Em->System.out.println(Em.toString()));
       
//       Employee emp = (Employee)session.createQuery("from Employee where empId =25").getSingleResult();
//       System.out.println(emp.toString());
       
//       Object[] emp = (Object[])session.createQuery("select empId,empName from Employee where empId =25").getSingleResult();
//       System.out.println(emp[0]+" : "+emp[1]);
       
//       List<Object[]> emp = (List<Object[]>)session.createQuery("select empName,empSalary from Employee where empSalary>5000").list();
//       System.out.println("No of Record : "+emp.size());
//       emp.forEach(x -> System.out.println(x[0]+" : "+x[1]));
       
//       	List emp = (List)session.createQuery("select count(empSalary) from Employee where empSalary>5000").getResultList();
//       	emp.forEach(x -> System.out.println(x));
       	
//       	float maxSal = (float) session.createQuery("select max(empSalary) from Employee where empSalary>5000").getSingleResult();
//       	float minSal =  (float) session.createQuery("select min(empSalary) from Employee where empSalary>5000").getSingleResult();
//       	System.out.println("Maximum Salary : "+maxSal+"\nMinimum Salary : "+minSal);
       	
//       		double avgSal = (Double) session.createQuery("select avg(empSalary) from Employee").getSingleResult();
//       		System.out.println("Average Salary : "+avgSal);
//       		
//       		double sumSal =  (double) session.createQuery("select sum(empSalary) from Employee where empSalary>5000").getSingleResult();
//       		System.out.println("Sum of Salary : "+sumSal);
//       		
//       		Query query = session.createQuery("update Employee set empName= :a , empSalary = :b where empId = :c");
//       		tran.begin();
//       		query.setParameter("a", "Sanjay");
//       		query.setParameter("b", 13499.0f);
//       		query.setParameter("c", 4);
//       		query.executeUpdate();
//       		tran.commit();
//       		Employee emp = (Employee)session.createQuery("from Employee where empId =4").getSingleResult();
//       		System.out.println(emp.toString());

//		  		Query query = session.createQuery("delete from Employee");
//		  		tran.begin();
//		  		query.executeUpdate();
//		  		tran.commit();
       		
       	
       	List<Employee> list = (List<Employee>) session.createCriteria(Employee.class).list();
       	list.forEach(x -> System.out.println(x.toString()));
       		
    }
}
