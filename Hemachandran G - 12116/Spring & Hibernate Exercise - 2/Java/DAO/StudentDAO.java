package com.spring.DAO;



import java.util.List;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.spring.bean.Student;

import com.spring.util.HibernateUtill;

public class StudentDAO {
	
	public int insert(Student stud) {
		int n = 0;
		System.out.println(stud);
//		System.out.println("I m dao");
		Session session = HibernateUtill.opensession();
		Transaction t = session.beginTransaction();
		
	    n=(Integer) session.save(stud);
		
		t.commit();
 
		return n;
	}
	
	public List<Integer> idList(){
		Session session = HibernateUtill.opensession();
		Transaction t = session.beginTransaction();
		System.out.println("query");
		Query q = session.createQuery("select sID from Student");
		List<Integer> list = q.list();
		
		session.close();
		
		return list;
		
	}
	
	public int deleteStudent(Student bean) {
		int n=0;
		Session session = HibernateUtill.opensession();
		Transaction t = session.beginTransaction();
		   session.delete(bean);
		   n++;
		t.commit();
		session.close();
		
		return n;
	}
	
	
	public void UpdateStudent(Student bean) {
		
		Session session = HibernateUtill.opensession();
		Transaction t = session.beginTransaction();
		   session.delete(bean);
		   
		t.commit();
		session.close();
		
	
	}
}
