package com.day4.hibernate.HibernateMapping;

import java.util.ArrayList;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class App 
{
	public static void main( String[] args )
    {
    	Configuration cfg=new Configuration().configure("hibernate.cfg.xml");
        SessionFactory factory= cfg.buildSessionFactory();
        Session session=factory.openSession();
        Transaction t=session.beginTransaction();
        
        Answer a1=new Answer();
        a1.setAnswername("It is ORM Framework");
        a1.setPostedBy("kp");
        
        Answer a2=new Answer();
        a2.setAnswername("It is a object relational modal");
        a2.setPostedBy("Edwin");
        
        ArrayList<Answer> l1=new ArrayList<Answer>();    
        l1.add(a1);    
        l1.add(a2);      
        
        Question q1=new Question();    
        q1.setQname("What is Hibernate?");    
        q1.setAnswers(l1);  
        session.save(q1);
        
        t.commit();
        System.out.println("Done");
}
}
