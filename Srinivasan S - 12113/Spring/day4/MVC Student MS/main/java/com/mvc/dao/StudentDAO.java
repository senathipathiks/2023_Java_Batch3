package com.mvc.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.mvc.bean.Student;
import com.mvc.util.StudentUtil;

public class StudentDAO {
	
	public int insertStudent(Student stud) {
		int n=0;
		
		try {
			
			Session session=StudentUtil.opensession();
			Transaction t=session.beginTransaction();
			n= (Integer) session.save(stud);
			t.commit();
			session.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return n;
		
	}
	
	public List<Integer> listId(){
		
		Session session=StudentUtil.opensession();
		Transaction t=session.beginTransaction();
		
		Query q=session.createQuery("select sid from Student");
		List<Integer> list=q.list();
		
		session.close();
		return list;
		
	}
	
	public void deleteStud(Student bean) {
		try {
			Session session=StudentUtil.opensession();
			Transaction t=session.beginTransaction();
	        session.delete(bean);
			t.commit();
			session.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
			
	}

	public void updateStud(Student bean) {
		try {
			Session session=StudentUtil.opensession();
			Transaction t=session.beginTransaction();
	        session.update(bean);
			t.commit();
			session.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public Student searchStud(Student bean) {
		Student s=null;
		try {
			Session session=StudentUtil.opensession();
			Transaction t=session.beginTransaction();
			System.out.println(bean+"bean");
			s = session.find(Student.class, bean.getSid());
			System.out.println(s);
			t.commit();
			session.close();
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return s;
	}
	
	public List<Student> FindAll() {
		Session session=StudentUtil.opensession();
		Transaction t=session.beginTransaction();
		List<Student> stud=session.createQuery("from Student").list();
		System.out.println(stud);
		t.commit();
		session.close();
		return stud;
	}
		
}
