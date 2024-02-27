package com.hibernate.dao;

 
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.bean.Student;
import com.hibernate.util.HibernateUtil;
 

public class StudentDAO {
	
	public int insertStudent(Student stud)
	{
		System.out.println(stud);
		int n=0;
		try {
			Session session=HibernateUtil.getConnection();
			Transaction t=session.beginTransaction();
			n=(Integer)session.save(stud);
			t.commit();
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return n;
	}
	
	public int deleteStudent(int id) {
		int n = 0;
		try {
			Session session = HibernateUtil.getConnection();
			Student s1= session.get(Student.class,id);
			Transaction t = session.beginTransaction();
			session.remove(s1);
			t.commit();
			n=1;


		} catch (Exception e) {
			System.out.println(e);
		}
		return n;
	}
	
	public int updateStudent(Student stud)
	{
		System.out.println(stud);
		int n=0;
		try {
			Session session=HibernateUtil.getConnection();
			Student s1= session.get(Student.class, stud.getId());
			if(s1 != null) {
				s1.setName(stud.getName());
				s1.setCity(stud.getCity());
			Transaction t=session.beginTransaction();
			session.update(s1);
			t.commit();
			n=1;
			}
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return n;
	}
	
	public Student findStudent(int id) {
		Student stud = new Student();
		int n=0;
		
		try {
			Session session=HibernateUtil.getConnection();
			Student s1= session.get(Student.class, stud.getId());
			if(s1 != null) {
				s1.setName(stud.getName());
				s1.setCity(stud.getCity());
			Transaction t=session.beginTransaction();
			session.update(s1);
			t.commit();
			n=1;
			}
			
			
		}
		catch(Exception e) {
			
			
		}
		
		return stud;
	}
	
	}
