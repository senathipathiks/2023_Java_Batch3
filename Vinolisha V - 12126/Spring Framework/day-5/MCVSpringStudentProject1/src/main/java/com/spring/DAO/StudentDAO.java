package com.spring.DAO;

import java.util.List;

import org.hibernate.Hibernate;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.spring.bean.Student;
import com.spring.util.HibernateUtil;

public class StudentDAO {


	public int insertStudent(Student stud) {
		int n=0;
		try {
			Session session=HibernateUtil.openSession();
			Transaction t=session.beginTransaction();
			n=(Integer)session.save(stud);
			t.commit();
			session.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		return n;
	}
	
	//delete 
	public List<Integer> idList(){
		Session session = HibernateUtil.openSession();
		Transaction transaction = session.beginTransaction();
		
		Query query = session.createQuery("select id from Student");
		List<Integer> list = query.list();
		
		session.close();
		return list;
	}
	
	public void deleteStudent(Student bean) {
		Session session = HibernateUtil.openSession();
		Transaction t = session.beginTransaction();
		session.delete(bean);
		t.commit();
		session.close();

	}
	
	//update
	public void updateStudent1(Student bean){
		
	
		Session session=HibernateUtil.openSession();
		Transaction t=session.beginTransaction();
		session.update(bean);
		t.commit();
		session.close();
	
}
	
	//view 
	public Student findStudent(Student bean) {
		Session session=HibernateUtil.openSession();
		Transaction t= session.beginTransaction();
		Student stud=session.find(Student.class, bean.getSid());
		t.commit();
		session.close();
		return stud;
		
	}
	
	//view all
	public List<Student> findallStudent(){
		Session session=HibernateUtil.openSession();
		Transaction t=session.beginTransaction();
		List<Student> stud=session.createQuery("from Student").list();
		t.commit();
		session.close();
		return stud;
		
		
	}

	}


