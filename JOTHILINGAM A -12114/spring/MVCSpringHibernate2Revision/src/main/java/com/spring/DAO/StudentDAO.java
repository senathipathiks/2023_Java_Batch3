package com.spring.DAO;



import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;


import com.spring.bean.Student;
import com.spring.util.HibernateUtil;

public class StudentDAO {
	
	public int insertStudent(Student stud)
	{
		int n=0;
		try
		{		
			System.out.println(stud);
			Session session= HibernateUtil.opensession();
			Transaction t = session.beginTransaction();
		    session.persist(stud);
		    n=1;
			t.commit();
			session.close();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return n;
	}
	
	public List<Integer> idList()
	{
		Session session = HibernateUtil.opensession();
		Transaction transaction = session.beginTransaction();
		
		Query query = session.createQuery("select id from Student");
		List<Integer> list = query.list();
		
		transaction.commit();
		session.close();
		return list;
	}
	
	public void deleteStudent(Student bean)
	{
		Session session=HibernateUtil.opensession();
		Transaction t = session.beginTransaction();
		
		session.delete(bean);
		t.commit();
		session.close();
		
	}
	
public Student fetchMethod(String id){
		
		Session session = HibernateUtil.opensession();
		Transaction t = session.beginTransaction();
		
		
		Student temp = session.find(Student.class,id);
	
		
		return temp;
	
	}
	



	public void updateStudent(Student bean)
	{
		Session session=HibernateUtil.opensession();
		Transaction t = session.beginTransaction();
		
		session.update(bean);
		t.commit();
		session.close();
		
	}
	
	public Student viewStudent(Student bean)
	{
		Session session=HibernateUtil.opensession();
		Transaction t = session.beginTransaction();
		
		Student stu = session.find(Student.class, bean.getId());
		System.out.println(stu);
		t.commit();
		session.close();
		return stu;
	}
	
	
	public List<Student> findallStudent()
	{
		Session session=HibernateUtil.opensession();
		Transaction t = session.beginTransaction();
		
		Query query = session.createQuery("from Student");
		List<Student> list = query.list();
		System.out.println(list);
		t.commit();
		session.close();
		return list;
	}
	
	
}



