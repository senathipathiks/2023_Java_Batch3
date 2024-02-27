package com.day5.Hibernate.HibernateQueryLanguage;

import java.util.List;
import java.util.Random;

import javax.persistence.Query;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;


/**
 * Hello world!
 *
 */
public class App 
{ 
	@SuppressWarnings({"unchecked","deprecation"}) //it will not give warning for unused variables
    public static void main( String[] args )
    {
    	Configuration cfg=new Configuration().configure("hibernate.cfg.xml");
        SessionFactory factory=cfg.buildSessionFactory();
        Session session =factory.openSession();
        Transaction t=session.beginTransaction();
        
         Random r=new Random();//Generate a random number
        
//        for(int i=1;i<30;i++) {
//        	Employee emp=new Employee();
//        	emp.setEid(i);
//        	emp.setEname("Name"+i);
//        	emp.setDept(r.nextInt(4)); // it will generate random number from 0 to 4
//        	}
        
        //to list all the data in the table (HQL)
        
//        
//        Query query=session.createQuery("from Employee"); // we have to mention class name i.e Employee
//        List<Employee> employee=query.getResultList();
//        for(Employee e:employee) {
//        	System.out.println(e);
//
//        }
//        
        
        
         //Get the value which the deptno is greaterthan 1
//        Query query=session.createQuery("from Employee where dept>1");
//        List<Employee> employee=query.getResultList();
//        for(Employee e:employee) {
//      	System.out.println(e);
//      	}
        
        
//        //show the id which the id =20
//        Query query=session.createQuery("from Employee where eid=20 ");
//        List<Employee> employee=query.getResultList();
//    	  System.out.println(employee);
//        
        
       //select Query Execution
//          Query query=session.createQuery("select eid,dept,ename from Employee where eid=4");
//          Object[] employee=(Object[])((org.hibernate.query.Query)query).uniqueResult();
//
//          System.out.println(employee[0]+":"+employee[1]+":"+employee[2]);
        
      // select with where class
//      Query query=session.createQuery("select eid,dept,ename from Employee where dept>1");
//      List<Object[]> employees=(List<Object[]>)query.getResultList();
//      for(Object[] employee :employees) {
//    	  System.out.println(employee[0]+":"+employee[1]+":"+employee[2]);
//      }
//      
        
      //Aggregate function
//      Query query=session.createQuery("select avg(eid) from Employee where dept>0");
//      List employees=(List)query.getResultList();
//      for(Object count:employees) {
//    	  System.out.println(count);
//      }
      
        
        //UPDATE THE ELEMENT
//       Query query=session.createQuery("update Employee set ename=:n where eid=:i");
//       query.setParameter("n", "Anand");
//       query.setParameter("i", 7 );
//       int status=query.executeUpdate();
//       if(status>0) {
//    	   System.out.println("Record Updated Successfully !!");
//       }
//       else {
//    	   System.out.println("Record updation failure !!");
//       }
      
        
//        //DELETE THE ELEMENT
//        Query query=session.createQuery("delete from Employee where eid=27");
//        int status=query.executeUpdate();
//        if(status>0) {
//        	System.out.println("Record deleted Successfully !!");
//        }
//        else {
//        	System.out.println("Record deletion failure");
//        }
//        
         
         Criteria criteria=session.createCriteria(Employee.class);// hcql language creation of criteria
         
//         //List all the employees
//         List<Employee> list=criteria.list();
//         for(Object li:list) {
//        	 System.out.println(li);
//         }
         
//         //retrieve ID greater than 10
//         criteria.add(Restrictions.gt("eid", 10));
//         List list=criteria.list();
//         for(Object li:list) {
//        	 System.out.println(li);
//         }
         
//         //Arrange in Descending order
//         criteria.addOrder(Order.desc("eid"));
//         List list=criteria.list();
//         for(Object li:list)
//         {
//        	 System.out.println(li);
//         }
         

//         //Arrange in Ascending order
//         criteria.addOrder(Order.asc("eid"));
//         List list=criteria.list();
//         for(Object li:list)
//         {
//        	 System.out.println(li);
//         }
         
         //Limit the number of lists (from 10 -20)
         
//         criteria.setFirstResult(10);
//         criteria.setMaxResults(10); // how many elements yu want to print after that initial element
//         List list=criteria.list();
//         for(Object li:list)
//         {
//        	 System.out.println(li);
//         }
         
         
         // fetch data of a particular column by projection such as name
         criteria.setProjection(Projections.property("ename"));
         List list=criteria.list();
         for(Object li:list)
         {
        	 System.out.println(li);
        }
         
         
        t.commit();
}
}
