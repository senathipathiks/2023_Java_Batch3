package com.jpa1.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class App {
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jeeva");
		EntityManager m = emf.createEntityManager();
		EntityTransaction t = m.getTransaction();

		Course c = new Course(7, "C++", "ECE");

		t.begin();
		m.persist(c);
		t.commit();

		// EntityManager used to create and use crude operations

	}
}
