package com.hql.day1.HQLProgram;

import java.util.Iterator;
import java.util.List;
import java.util.Random;

import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
	@SuppressWarnings({"unchecked","deprecation"})
    public static void main( String[] args )
    {
    	Configuration cfg=new Configuration().configure("hibernate.cfg.xml");
        SessionFactory factory=cfg.buildSessionFactory();
        Session session=factory.openSession();
        Transaction t=session.beginTransaction();
//        Random r=new Random(); //Generate a random number
 
        
//        for(int i=1;i<30;i++) {
//        	Employee emp=new Employee();
//        	emp.setEid(i);
//        	emp.setEname("Name"+i);
//        	emp.setDept(r.nextInt(4));
//        	session.persist(emp);
//        }
//=======================================================================================================================
        //List all the data in the table
//        Query query=session.createQuery("From Employee");
//        List<Employee> employee=query.getResultList();
//        for (Employee e:employee) {
//        	System.out.println(e);
//        }
//=======================================================================================================================     
        //Get the values which the deptNo is greater than 1
//        Query query=session.createQuery("From Employee where dept>1");
//        List<Employee> employee=query.getResultList();
//        for (Employee e:employee) {
//        	System.out.println(e);
//        }
//=======================================================================================================================        
        //Show the value which the id=10
//        Query query=session.createQuery("From Employee where eid=10");
//        Employee employee=(Employee)((org.hibernate.query.Query)query).uniqueResult();
//        System.out.println(employee);
//=======================================================================================================================        
        //Select Query execution
//        Query query=session.createQuery("select eid,ename,dept From Employee where eid=4");
//        Object[] employee=(Object[]) ((org.hibernate.query.Query)query).uniqueResult();
//        System.out.println(employee[0] + " : " +employee[1]+" : "+employee[2]);
//=======================================================================================================================      
        //Select with where clause
//        Query query=session.createQuery("select eid,ename,dept From Employee where dept>1");
//        List<Object[]> employees=(List<Object[]>) query.getResultList();
//        for(Object[] employee:employees)
//        	System.out.println(employee[0] +" : " +employee[1]+" : "+employee[2]);
//=======================================================================================================================
        //Aggregate function
//        Query query=session.createQuery("select count(eid) From Employee where dept>1");
//        List employees=(List) query.getResultList();
//        for(Object count:employees)
//        System.out.println("Count"+" "+count);
//        t.commit();
//        
//        Query query0=session.createQuery("select avg(eid) From Employee");
//        List employees0=(List) query0.getResultList();
//        for(Object avg:employees0)
//        System.out.println("Average"+" "+avg);
//        t.commit();
        
//        Query query1=session.createQuery("select min(eid) From Employee");
//        List employees1=(List) query1.getResultList();
//        for(Object min:employees1)
//        System.out.println("Minimum"+" "+min);
//        t.commit();
//        
//        Query query2=session.createQuery("select max(eid) From Employee");
//        List employees2=(List) query2.getResultList();
//        for(Object max:employees2)
//        System.out.println("Maximum"+" "+max);
//        t.commit();
        
//        Query query3=session.createQuery("select sum(eid) From Employee");
//        List employees3=(List) query3.getResultList();
//        for(Object sum:employees3)
//        System.out.println("Sum"+" "+sum);
//        
//=======================================================================================================================
        //update the element
//        Query q=session.createQuery("update Employee set name=:n where eid=:i");
//        q.setParameter("n", "Varshini yokesh");
//        q.setParameter("i", 5);
//        int status=q.executeUpdate();
//        if(status>0)
//        	System.out.println("Updated Successfully");
//        else
//        	System.err.println("Not Updated");
//=======================================================================================================================
//        //delete the element
//        Query q=session.createQuery("delete from Employee where id=2");
//        int status=q.executeUpdate();
//        if(status>0)
//        	System.out.println("Deleted Successfully");
//        else
//        	System.err.println("Not Deleted");
//        t.commit();  


        
    }
    
}
