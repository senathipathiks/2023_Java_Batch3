package com.hib.day1.Student;


import org.hibernate.*;

import org.hibernate.cfg.Configuration;


public class App 
{
    public static void main( String[] args )
    {
    	  Student s1=new Student(1,"kiruba","chennai");
          
          Configuration con = new Configuration().configure("hibernate.cfg.xml");
          SessionFactory factory=con.buildSessionFactory();
          Session session=factory.openSession();
          Transaction t=session.beginTransaction();
          session.save(s1);
          t.commit();
          
    }
}
