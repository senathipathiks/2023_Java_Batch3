package com.maven.day4.Employeee;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


 
public class App 
{
    public static void main( String[] args )
    {

    	Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
    	SessionFactory factory=cfg.buildSessionFactory();
    	Session session=factory.openSession();
    	Transaction t = session.beginTransaction();
    	department d1 =new department(2,"Technical team");
    	session.save(d1);
    	Employee e1=new Employee(3,"Gokul",d1);
    	session.save(e1);
    	t.commit();
    }
}
