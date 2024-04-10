package com.hibernate.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;


import com.hibernate.bean.Student;
import com.hibernate.utill.HibernateUtill;

public class StdDao {

	public int insert(Student stud) {
		int n = 0;
		System.out.println(stud);
		System.out.println("I m dao");
		Session session = HibernateUtill.openession();
		Transaction t = session.beginTransaction();
		
	    n=(Integer) session.save(stud);
		
		t.commit();

		return n;
	}
	
	public int delete(int id) {
		System.out.println("HI"+id);
		int n=0;
		Session session = HibernateUtill.openession();
		Transaction t = session.beginTransaction();
		Student s=search(id);
		if(s != null) {
			session.remove(s);
			n = 1;
		}
		t.commit();
		return n;		
	}
	
	
	public int update(Student stud) {
		int n=0;
		Session session = HibernateUtill.openession();
		Transaction t = session.beginTransaction();
		Student std= session.merge(stud);		
		t.commit();		
		return n;
		
	}
	public static Student search(int id) {
		
		Session session = HibernateUtill.openession();
		Transaction t = session.beginTransaction();
		System.out.println("search trans");
		Student stud=session.find(Student.class, id);
		System.out.println(stud);
		
		t.commit();
		return stud;
		
	}
	
public List viewAll() {
		
		Session session = HibernateUtill.openession();
		Transaction t = session.beginTransaction();
		List<Student> list = (List) session.createQuery("from Student").list();
		t.commit();
		return list;
		
	}

	
	

}
