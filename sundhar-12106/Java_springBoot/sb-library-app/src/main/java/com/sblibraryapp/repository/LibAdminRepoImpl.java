package com.sblibraryapp.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.sblibraryapp.entity.Librarian;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;

@Repository
@Transactional
public class LibAdminRepoImpl implements LibAdminRepo {

	private EntityManager em;

	private String findAll = "select l from Librarian l";
	private String findById = "select l from Librarian l where l.lId = :id";

	public LibAdminRepoImpl() {
		super();
	}

	@Autowired
	public LibAdminRepoImpl(EntityManager em) {
		super();
		this.em = em;
	}

	@Override
	public List<Librarian> getAll() {

		System.out.println("hello");
		Query q = em.createQuery(findAll);
		
		return q.getResultList();

	}

	@Override
	public Librarian getById(int id) {
		
		Query q = em.createQuery(findById);
		q.setParameter("id", id);

		return (Librarian) q.getSingleResult();
	}

}
