package com.abi.mavenday5.HibeHQL;

import java.util.List;
import java.util.Random;

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
        Transaction t = session.beginTransaction();
        Random r = new Random();
        
        
        
        //Insering Value into Employee Class
//        for(int i=1;i<30;i++) {
//        	Employee emp = new Employee();
//        	emp.setEid(i);
//        	emp.setEname("Name"+i);
//        	emp.setDept(r.nextInt(4));
//        	session.persist(emp);
//        }
//        
        
        //List all the data in the table
//        Query query= session.createQuery("From Employee");
//        List<Employee> emp = query.getResultList();
//        for(Employee e : emp) {
//        	System.out.println(e);
//        }
        
        //Get Value which the deptNo is greater than 1
//        Query query = session.createQuery("From Employee where dept>1");
//        List<Employee> emp = query.getResultList();
//        for(Employee e : emp) {
//        	System.out.println(e);
//        }
        
        //Show the value which the id=10
//        Query query = session.createQuery("From Employee where dept=3");
//        List<Employee> emp = query.getResultList();
//        for (Employee e : emp) {
//			System.out.println(e);
//		}
        
        //Select Query execution
//        Query query = session.createQuery("select eid,ename,dept From Employee where eid=4");
//        Object[] employee = (Object[]) ((org.hibernate.query.Query) query).uniqueResult();
//        System.out.println(employee[0]+":"+employee[1]+":"+employee[2]);
        
        //Select with where clause
//        Query query = session.createQuery("select eid,ename,dept From Employee where dept>1");
//        List<Object[]> employees = (List<Object[]>) query.getResultList();
//        for(Object[] e : employees) {
//        	System.out.println(e[0]+":"+e[1]+":"+e[2]);
//        }
        
        //Aggregate Function
//        Query query = session.createQuery("select count(eid) From Employee where dept>1");
//        List emp = query.getResultList();
//        for(Object count : emp) {
//        	System.out.println(count);
//        }
        
        //Update the Element
//        Query q = session.createQuery("update Employee set ename=:n where eid=:i");
//        q.setParameter("n", "Abishek");
//        q.setParameter("i", 4);
//        int status = q.executeUpdate();
//        if(status>0) {
//        	System.out.println("Updated Successfully");
//        }
//        else {
//        	System.out.println("Not Updated`");
//        }
        
        //Delete the Element
//        Query q = session.createQuery("delete From Employee where eid=8");
//        int status = q.executeUpdate();
//        if(status>0) {
//        	System.out.println("Deleted Successfully");
//        }
//        else {
//        	System.out.println("Deletion Failure");
//        }
        
        Criteria criteria = session.createCriteria(Employee.class);
        
        //List all the Employee
//        List<Employee> list = criteria.list();
//        for(Object li : list) {
//        	System.out.println(li);
//        }
        
        //ID greater than 10
//        criteria.add(Restrictions.gt("eid", 10)); //gt-greater than, lt- less than
//        List list = criteria.list();
//        for(Object li : list) {
//        	System.out.println(li);
//        }
        
        //Arrange in Descending Order
//        criteria.addOrder(Order.desc("eid"));  //asec - for ascending order
//        List list = criteria.list();
//        for(Object li : list) {
//        	System.out.println(li);
//        }
        
        //Limt the number of lists
//        criteria.setFirstResult(10);
//        criteria.setMaxResults(20);
//        List list = criteria.list();
//        for(Object li : list) {
//        	System.out.println(li);
//        }
        
        //fetch data of a particular column by projection such as name
//        criteria.setProjection(Projections.property("ename"));
//        List list = criteria.list();
//        for(Object li : list) {
//        	System.out.println(li);
//        }
        
        
        
        
        
        t.commit();
        
    }
}
