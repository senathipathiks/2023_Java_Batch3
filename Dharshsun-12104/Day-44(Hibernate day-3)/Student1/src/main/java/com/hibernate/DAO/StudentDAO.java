package com.hibernate.DAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.bean.Student1;
import com.hibernate.util.HibernateUtil;

public class StudentDAO {
	public int insertStudent(Student1 stud) {
		int n=0;
		try {
			Session session=HibernateUtil.opensession();
			Transaction t = session.beginTransaction();
			n=(Integer)session.save(stud);
			t.commit();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return n;
	}
	public Student1 findStudent(int id) {
		Student1 obj = new Student1(); ;
		Session session=HibernateUtil.opensession();
		Transaction t = session.beginTransaction();
		Student1 temp = session.find(Student1.class,id);
		 
		obj.setId(temp.getId());
		obj.setName(temp.getName());
		obj.setCity(temp.getCity());
		
		return obj;
		
	}
	
	public List findallStudent() {
		Student1 obj = null;
		Session session=HibernateUtil.opensession();
		Transaction t = session.beginTransaction();
		List<Student1> studlist = session.createQuery("from Student1").list();
		System.out.println(studlist);
		t.commit();
		return studlist;
		
	}
	public int updateStudent(Student1 stud) {
		int n=0;
		try {
			Session session=HibernateUtil.opensession();
			Transaction t = session.beginTransaction();
			Student1 temp = session.find(Student1.class, stud.getId());
			temp.setName(stud.getName());
			temp.setCity(temp.getCity());
			n=(Integer)session.save(stud);
			t.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return n;
	}
	public Student1 deleteStudent(int id) {
		Student1 temp = null;
		Session session = HibernateUtil.opensession();
		Transaction t = session.beginTransaction();
		temp = session.find(Student1.class,id);
		t.commit();
		return temp;
	}
	
}
