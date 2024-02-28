package com.day3.JPA.JPAExamples;



import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class App {
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("course_db");

		EntityManager em = emf.createEntityManager();
		
		System.out.println(emf);
		EntityTransaction t = em.getTransaction();
		Course c1 = new Course(103, "C++", "CSE");
		System.out.println(t);
		
		t.begin();
		em.persist(c1);
		t.commit();
		
		emf.close();

	}
}
