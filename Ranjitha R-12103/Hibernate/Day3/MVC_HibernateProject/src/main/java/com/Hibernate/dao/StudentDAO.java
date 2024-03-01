package com.Hibernate.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.Hibernate.bean.Student;
import com.Hibernate.util.HibernateUtil;

public class StudentDAO {

	public int insertStudentDetails(Student stud) {

		int n = 0;
		try {
			Session session = HibernateUtil.opensession();
			Transaction t = session.beginTransaction();
			n = (Integer) session.save(stud);
			t.commit();
		} catch (Exception e) {
			System.out.println(e);
		}

		return n;
	}

	public int updateStudentDetails(Student stud) {

		int n = 0;
		Session session = HibernateUtil.opensession();
		Transaction t = session.beginTransaction();

		Student st = session.find(Student.class, stud.getSid());
//		st.setSid(stud.getSid());
		st.setSname(stud.getSname());
		st.setSdept(stud.getSdept());
		st.setAddress(stud.getAddress());

		session.update(stud);
		t.commit();
		t.begin();
		return n;

	}
//	========================DELETE

	public int deleteStudentDetails(int id) {
		int n = 0;
		try {
			Session session = HibernateUtil.opensession();
			Transaction t = session.beginTransaction();

//		sid = session.find(Student.class, sid);
			session.delete(id);
			t.commit();
		} catch (Exception e) {
			System.out.println(e);
		}
		return n;

	}

	public Student findStudentDetails(int sid) {
		Student obj = null;

		Session session = HibernateUtil.opensession();
		Transaction t = session.beginTransaction();
		Student stud = session.find(Student.class, sid);
		obj = new Student();
		obj.setSid(stud.getSid());
		obj.setSname(stud.getSname());
		obj.setSdept(stud.getSdept());
		obj.setAddress(stud.getAddress());

		return obj;
	}

	public List findAllStudentDetails() {
		Student obj = null;
		Session session = HibernateUtil.opensession();
		Transaction t = session.beginTransaction();
		List<Student> slist = session.createQuery("from Student").list();

		t.commit();
		return slist;
	}
}
