package com.hibernate.annotation.InheritanceMapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

//import com.sample.bean.ContractEmployee;
//import com.sample.bean.Employee;
//import com.sample.bean.RegularEmployee;
//import com.sample.inheritance2.ContractEmployee;
//import com.sample.inheritance2.Employee;
//import com.sample.inheritance2.RegularEmployee;
import com.sample.inheritance3.ContractEmployee;
import com.sample.inheritance3.Employee;
import com.sample.inheritance3.RegularEmployee;



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
        Transaction tr = session.beginTransaction();
        Employee emp1 = new RegularEmployee(101, "sanjay", 13500, 1500);
        Employee emp2 = new ContractEmployee(102, "Sam", 800, "2 Years");
        session.save(emp1);
        session.save(emp2);
        tr.commit();
    }
}
