package com.spring.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.spring.bean.Student;
import com.spring.util.HibernateUtil;

public class StudentDAO {

	public int insertStudent(Student stud)
	{
		int n=0;
		try {
			Session session=HibernateUtil.opensession();
			Transaction t=(Transaction) session.beginTransaction();
			//n=(Integer)session.save(stud);
			n=1;
			session.persist(t);
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
		Session session = HibernateUtil.opensession();
		Transaction transaction = session.beginTransaction();
		Query query =  session.createQuery("select id from Student");
		List<Integer> list = query.list();
		session.close();
		return list;
	}
	public void deleteStudent(Student bean) {
	Session session=HibernateUtil.opensession();
	Transaction t=(Transaction) session.beginTransaction();
	session.delete(bean);
	t.commit();
	session.close();
}
}
