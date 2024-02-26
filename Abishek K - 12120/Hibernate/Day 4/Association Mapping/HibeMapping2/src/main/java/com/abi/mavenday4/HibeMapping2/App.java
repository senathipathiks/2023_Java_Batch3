package com.abi.mavenday4.HibeMapping2;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        Configuration cfg = new Configuration().configure("hibernate.cfg.xml"); 
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        Transaction t = session.beginTransaction();
        
        Answer an1 = new Answer();
        an1.setAns("Easy Programming");
        an1.setPostby("Arun");
        
        Answer an2 = new Answer();
        an2.setAns("Basic to learn");
        an2.setPostby("Sneha");
        
        Answer an3 = new Answer();
        an3.setAns("It is OOPS language");
        an3.setPostby("Abishek");
        
        Answer an4 = new Answer();
        an4.setAns("It has a good carrier growth");
        an4.setPostby("saran");
      
        
        List<Answer> list = new ArrayList<Answer>();
        list.add(an1);
        list.add(an2);
        
        List<Answer> list1 = new ArrayList();        
       list1.add(an3);
       list1.add(an4);
        
        
        Question q1 = new Question();
        q1.setQname("what is C program?");
        q1.setList(list);
        
        Question q2 = new Question();
        q2.setQname("what is JAVA?");
        q2.setList(list1);
        
        session.persist(q1);
        session.persist(q2);
        t.commit();
    }
}
