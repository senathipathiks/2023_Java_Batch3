package com.sampleofsat.mavenday2;

import java.util.Iterator;
import java.util.List;

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
    public static void main( String[] args )
    {
//        Employee e1 = new Employee(2, "Heram", "7449027175", "Chennai", 16000);
        Configuration cfg=new Configuration().configure("hibernate.cfg.xml");
        SessionFactory factory=cfg.buildSessionFactory();
        Session session=factory.openSession();
        Transaction t=session.getTransaction();
//       
//        Employee e1 = new Employee();
//        Employee e2 = new Employee();
//        e1.setEmpName("Hema");
//        e1.setEmpAddress("Chennai");
//        e1.setEmpPhnNo("7449029876");
//        e1.setEmpSalary(20000);
//        
//        e2.setEmpName("Vijay");
//        e2.setEmpAddress("Chennai");
//        e2.setEmpPhnNo("7449029876");
//        e2.setEmpSalary(25000);
//        
//       
//        
//        t.begin();
//       session.save(e1);
//       e1.setEmpName("Heram");
//       session.save(e2);
//        session.update(e1);
//        session.save(e2);
//        
//        Employee temp=session.find(Employee.class, 1);
//        temp.setEmpName("Hemachandran");
//        session.update(temp);
        
//        session.delete(temp);
//        t.commit();
        List<Employee> le = session.createQuery("from Employee").list();
        for(Employee e:le)
        {
        	System.out.println(e);
        }
        
        	System.out.println("Done!");
        
    }
}
