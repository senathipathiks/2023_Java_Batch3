package com.spring.dao;

import java.util.ArrayList;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.spring.bean.Student;
import com.spring.util.HibernateUtil;

public class StudentDAO {

	public int insertStudent(Student stud) {
		int n = 0;
		try {
			Session session = HibernateUtil.opensession();
			Transaction transaction = session.beginTransaction();
			session.persist(stud);
			transaction.commit();
			n = 1;
		} catch (Exception e) {
			System.out.println(e);
		}
		return n;
	}

	public ArrayList<Integer> getIds() {
		ArrayList<Integer> idList = new ArrayList<Integer>();
		Session session = HibernateUtil.opensession();
		idList = (ArrayList<Integer>) session.createQuery("select sid from Student").list();
		Transaction transaction = session.beginTransaction();
		session.close();
		return idList;
	}

	public boolean deleteStudent(Student stud) {
		try {
			Session session = HibernateUtil.opensession();
			Transaction t = session.beginTransaction();
			session.delete(stud);
			t.commit();
			session.close();
			return true;
		} catch (Exception e) {
			System.out.println(e);
		}
		return false;
	}

	public Student getStudent(Student s) {
		try {
			Session session = HibernateUtil.opensession();
			Student stud = session.get(Student.class, s.getSid());
			session.close();
			return stud;
		} catch (Exception e) {
			System.out.println(e);
		}
		return null;

	}

	public boolean updateStudent(Student stud) {
		try {
			Session session = HibernateUtil.opensession();
			Student s=session.get(Student.class, stud.getSid());
			
			if(s!=null) {
				Transaction t = session.beginTransaction();
				s.setSname(stud.getSname());
				s.setScity(stud.getScity());
				session.update(s);
				t.commit();
				session.close();
				return true;
			}
			
		} catch (Exception e) {
			System.out.println(e);
		}
		return false;

	}
	
	
public ArrayList<Student> getStudentsList(){
	ArrayList<Student> list=new ArrayList<Student>();
	Session session=HibernateUtil.opensession();
	list=(ArrayList<Student>) session.createQuery("from Student").list();
	return list;
			
}
	
}
