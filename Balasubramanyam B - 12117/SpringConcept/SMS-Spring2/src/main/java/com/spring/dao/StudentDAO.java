package com.spring.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.spring.bean.Student;
import com.spring.util.StudentUtil;

public class StudentDAO {
 
	public int insertStudent(Student stud)
	{
		int n=0;
		try {
			Session session=StudentUtil.opensession();
			Transaction t=(Transaction) session.beginTransaction();
			n=(Integer)session.save(stud);
			//n=1;
			//session.persist(t);
			t.commit();
			session.close();
		}
		catch (Exception e) {
			System.out.println(e);
		}
		return n;
	}
	public List<Integer> idList()
	{
		Session session = StudentUtil.opensession();
		Transaction transaction = session.beginTransaction();
		Query query =  session.createQuery("select id from Student");
		List<Integer> list = query.list();
		session.close();
		return list;
	}
	public void deleteStudent(Student bean) {
	Session session=StudentUtil.opensession();
	Transaction t=(Transaction) session.beginTransaction();
	session.delete(bean);
	t.commit();
	session.close();
}
	public void updateStudent(Student bean) {
		Session session=StudentUtil.opensession();
		Transaction t=(Transaction) session.beginTransaction();
		session.update(bean);
		t.commit();
		session.close();
	}
	public Student findStudent(Student bean) {
		Session session=StudentUtil.opensession();
		Transaction t=(Transaction) session.beginTransaction();
		Student stud=session.find(Student.class, bean.getId());
		t.commit();
		session.close();
		return stud;
	}
	@SuppressWarnings("unchecked")
	public List<Student> findallStudent() {
		Session session=StudentUtil.opensession();
		List<Student> stud =session.createQuery("from Student").list();
		session.close();
		return stud;
	}
}
 
