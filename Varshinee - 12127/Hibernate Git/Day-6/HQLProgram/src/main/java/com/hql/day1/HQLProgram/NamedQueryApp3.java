package com.hql.day1.HQLProgram;

import java.util.Iterator;
import java.util.List;

import javax.persistence.TypedQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class NamedQueryApp3 {

	public static void main(String[] args) {
		Configuration cfg=new Configuration().configure("hibernate.cfg.xml");
        SessionFactory factory=cfg.buildSessionFactory();
        Session session=factory.openSession();
        Transaction t=session.beginTransaction();
        
		TypedQuery query=session.getNamedQuery("findEmployeeById");
		query.setParameter("eid", 20);
		
		List<NamedQueryEx> employees=query.getResultList();
		
		Iterator<NamedQueryEx> itr=employees.iterator(); 
		while(itr.hasNext()) {
			NamedQueryEx e=itr.next();
			System.out.println(e);
		}
		

	}

}
