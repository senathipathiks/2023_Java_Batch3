package com.day4.Mapping.ManytoMany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args ) {
    Configuration cfg=new Configuration().configure("hibernate.cfg.xml");
    SessionFactory factory=cfg.buildSessionFactory();
    Session session=factory.openSession();
    Transaction t=session.beginTransaction();
    
    
    
    Answer a1=new Answer();
    a1.setAid(100);
    a1.setAname("Hibernate is a ORM");
    
    Answer a2=new Answer();
    a2.setAid(102);
    a2.setAname("Java spring boot is a tool");
    
    List<Answer> answer=new ArrayList();
    answer.add(a1);
  
    List<Answer> answer1=new ArrayList();
    answer1.add(a2);
    
    Question q1=new Question();
    q1.setQid(111);
    q1.setQname("What is hibernate");
    q1.setAnswer(answer);
    
    Question q2=new Question();
    q2.setQid(112);
    q2.setQname("What is Spring boot");
    q2.setAnswer(answer1);
    
    session.persist(q1);
    session.persist(q2);
    
    
    
    t.commit();
    		
    
    
}
}
