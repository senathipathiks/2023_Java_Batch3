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
		Student s = new Student();
		s.setName("Prsanth");

		Books b1 = new Books();
		b1.setBname("romeo juliet");
		b1.setStudent(s);
		Books b2 = new Books();
		b2.setBname("romeo ");
		b2.setStudent(s);
		Books b3 = new Books();
		b3.setBname("juliet");
		b3.setStudent(s);
		Books b4 = new Books();
		b4.setBname("jackie chan");
		b4.setStudent(s);
		
		books.add(b1);
		books.add(b2);
		books.add(b3);
		books.add(b4);

		s.setBook(books);
		

		et.begin();
		em.persist(s);
		et.commit();
	}
}
