package com.day4.controller;

import java.util.ArrayList;

import com.day4.bean.Books;
import com.day4.bean.Student;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class App {
	public static void main(String[] args) {
		EntityManager em = Persistence.createEntityManagerFactory("book").createEntityManager();
		EntityTransaction et = em.getTransaction();

		ArrayList<Books> books = new ArrayList<Books>();
		ArrayList<Student> stu = new ArrayList<Student>();
		
		
		Student s = new Student();
		s.setName("Srinivasan");
		
		Books b = new Books();
		b.setBname("Ikky guy");
		stu.add(s);
		b.setStudent(stu);
		
		books.add(b);
		s.setBook(books);
		

		et.begin();
		em.persist(b);
		em.persist(s);
		et.commit();
	}
}
