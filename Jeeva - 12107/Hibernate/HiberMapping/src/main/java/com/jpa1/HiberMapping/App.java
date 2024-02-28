package com.jpa1.HiberMapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	

    	Configuration cfg= new Configuration().configure("hibernate.cfg.xml");
    	SessionFactory sfact=cfg.buildSessionFactory();
    	Session session=sfact.getCurrentSession();
    	Transaction t=session.beginTransaction();
    	
    	Address e=new Address(10,"ar Street","chennai");
    	session.persist(e);
    	
    	User user=new User(0, null, e);
    	
    	
    	
    }
}
