package com.day4.hibernate.HibernateMapping;



import java.util.ArrayList;

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
    	Configuration cfg=new Configuration().configure("hibernate.cfg.xml");
        SessionFactory factory= cfg.buildSessionFactory();
        Session session=factory.openSession();
        Transaction t=session.beginTransaction();
        
       Answer a1=new Answer();
       a1.setAnswername("Answer 1");
       a1.setPostedBy("kaviya");
       
       Answer a2=new Answer();
       a2.setAnswername("Answer 2");
       a2.setPostedBy("Sri");
       
       Question q1=new Question();  
       q1.setQname("What is Answer?");  
       ArrayList<Answer> l1=new ArrayList<Answer>();  
       l1.add(a1);  
       l1.add(a2);  
       q1.setAnswers(l1);  
       
       Answer a3=new Answer();
       a3.setAnswername("Answer 3");
       a3.setPostedBy("Anam");
       
       Answer a4=new Answer();
       a4.setAnswername("Answer 4");
       a4.setPostedBy("Vini");
       
       Question q2=new Question();  
       q2.setQname("What is Answer?");  
       ArrayList<Answer> l2=new ArrayList<Answer>();  
       l2.add(a3);  
       l2.add(a4);  
       q2.setAnswers(l2); 

        session.save(q1);
        session.save(q2);
        
        t.commit();
        System.out.println("Done");


        
        

        
            }
}
