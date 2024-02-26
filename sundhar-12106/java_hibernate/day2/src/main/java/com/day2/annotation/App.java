package com.day2.annotation;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.day2.annotation.bean.Employee;

public class App 
{
    public static void main( String[] args )
    {
        
    	Configuration con = new Configuration().configure().addAnnotatedClass(Employee.class);
    	SessionFactory factory = con.buildSessionFactory();
    	Session session = factory.openSession();
    	Transaction t = session.getTransaction();
    	
//    	Employee e1 = new Employee();
//    	
//    	e1.seteName("JothiLingam");
//    	e1.seteDesig("Test Engineer");
//    	e1.setePhone(9234567695l);
//    	e1.setEsal(6700);
//    	
//    	t.begin();
//    	session.merge(e1);
//    	t.commit();
    	
    	Query<Employee>  qe= session.createQuery("from Employee");
    	
    	List<Employee> le = qe.list();
    	
    	le.forEach(e->System.out.println(e));
    }
}
