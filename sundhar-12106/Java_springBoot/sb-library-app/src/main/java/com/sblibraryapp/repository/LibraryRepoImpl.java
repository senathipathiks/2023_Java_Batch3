package com.sblibraryapp.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sblibraryapp.entity.Book;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;

@Repository
public class LibraryRepoImpl implements LibraryRepo {

	private EntityManager em;

	private String queryFindByName = "select b from Book b where b.name = :name";
	private String findAll = "select b from Book b";
	private String findAllNames = "select b.bookName from Book b";

	public LibraryRepoImpl() {
		super();
	}

	@Autowired
	public LibraryRepoImpl(EntityManager em) {
		super();
		this.em = em;
	}

	@Override
	public Book getBook(int id) {

		Book book = null;

		try {
			book = em.find(Book.class, id);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return book;

	}

	@Override
	public boolean saveBook(Book book) {
		try {

			System.out.println(book);
			em.persist(book);

			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}

	@Override
	public String updateBook(Book book) {

		if (book != null) {
			em.clear();
			em.merge(book);
			return "updated successfully...!";
		}
		return "Not updated";
	}

	@Override
	public boolean removeBook(Book book) {
		try {

			em.remove(book);

			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public List<Book> getBookByName(String name) {

		List<Book> books = null;

		try {
			Query q = em.createQuery(queryFindByName);

			q.setParameter("name", name);
			books = q.getResultList();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return books;
	}

	@Override
	public List<Book> getAll() {

		List<Book> books = null;

		try {
			Query q = em.createQuery(findAll);

			books = q.getResultList();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return books;
	}

	@Override
	public List<String> getAllNames() {

		List<String> names = null;

		try {
			Query q = em.createQuery(findAllNames);

			names = q.getResultList();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return names;
	}

}
