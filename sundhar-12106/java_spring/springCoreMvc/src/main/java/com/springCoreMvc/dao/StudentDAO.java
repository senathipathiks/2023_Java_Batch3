package com.springCoreMvc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springCoreMvc.bean.Student;
import com.springCoreMvc.dbutil.DBUtility;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Query;

@Component
public class StudentDAO {

	@Autowired
	DBUtility utility;

	public int insert(Student student) {

		EntityManager em = utility.getConnection();
		EntityTransaction et = em.getTransaction();

		try {
			et.begin();
			em.persist(student);
			et.commit();
			return 1;
		} catch (Exception e) {
			// TODO: handle exception
			return 0;
		}

	}

	public List<Integer> idlist() {

		EntityManager em = utility.getConnection();
		EntityTransaction et = em.getTransaction();
		
		et.begin();
		Query q = em.createQuery("select s.id from Student s");

		List<Integer> ls = q.getResultList();
		et.commit();
		System.out.println(ls);
		return ls;

	}

	public int delete(Student student) {

		EntityManager em = utility.getConnection();
		EntityTransaction et = em.getTransaction();

		if (student != null) {
			et.begin();
			em.remove(em.contains(student) ? student : em.merge(student));
			et.commit();
			return 1;
		}
		return 0;
	}

	public Student fetStudent(Student student) {

		EntityManager em = utility.getConnection();
		EntityTransaction et = em.getTransaction();
		System.out.println(student+"from fetch");
		et.begin();
		student = em.find(Student.class, student.getId());
		System.out.println("find " + student);
		return student;
	}
	
	public Student updateStudent(Student student) {
		
		EntityManager em = utility.getConnection();
		EntityTransaction et = em.getTransaction();
		
		et.begin();
		em.merge(student);
		et.commit();
		
		return student;
	}
	
	
	public List<Student> fetchAll() {
		
		EntityManager em = utility.getConnection();
		EntityTransaction et = em.getTransaction();
		
		et.begin();
		Query q = em.createQuery("select s from Student s");
		List<Student> ls = q.getResultList();
		System.out.println(ls);
		return ls;
	}

}
