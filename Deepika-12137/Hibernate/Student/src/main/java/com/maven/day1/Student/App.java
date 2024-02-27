package com.maven.day1.Student;


import org.hibernate.cfg.Configuration;
import org.hibernate.*;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        Student s1=new Student();
//        s1.setSid(1);
//        s1.setSname("Sam");
//        s1.setCity("Chennai");
//        
//        Configuration cfg=new Configuration().configure("hibernate.cfg.xml");
//        SessionFactory factory=cfg.buildSessionFactory();
//        Session session=factory.openSession();
//        Transaction t=session.beginTransaction();
//        
//        
//        session.save(s1);
//        t.commit();
        
        Employee s1=new Employee();
        s1.setEmpid(1);
        s1.setEmpname("Sena");
        s1.setEmprole("Trainer");
        s1.setSalary(1000);
        
        

      Configuration cfg=new Configuration().configure("hibernate.cfg.xml");
      SessionFactory factory=cfg.buildSessionFactory();
      Session session=factory.openSession();
      Transaction t=session.beginTransaction();
      
      session.save(s1);
      t.commit();
    	
    }
}
