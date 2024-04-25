package com.sblibraryapp.repository;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.sblibraryapp.entity.Author;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;

@Repository
public class AuthorRepoImpl implements AuthorRepo {

	private EntityManager em;

	private String queryFindByName = "select a from Author a where a.name = :name";
	private String findAll = "select a from Author a";
	private String findAllNames = "select a.authorName from Author a";

	public AuthorRepoImpl() {
		super();
	}

	@Autowired
	public AuthorRepoImpl(EntityManager em) {
		super();
		this.em = em;
	}

	@Override
	public Author getAurthor(int id) {

		return em.find(Author.class, id);
	}

	@Override
	public boolean saveAuthor(Author author) {
		try {
			em.persist(author);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public String updateAuthor(Author author) {
		if (author != null) {
			em.clear();
			em.merge(author);
			return "updated successfully...!";
		}
		return "Not updated";
	}

	@Override
	public boolean removeAuthor(Author author) {

		try {
			em.remove(author);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public List<Author> getAuthorByName(String name) {

		List<Author> author = null;

		try {
			Query q = em.createQuery(queryFindByName);

			q.setParameter("name", name);
			author = q.getResultList();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return author;
	}

	@Override
	public List<Author> getAllAuthor() {

		List<Author> author = null;

		try {
			Query q = em.createQuery(findAll);

			author = q.getResultList();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return author;
	}

	@Override
	public List<String> getAllNames() {
		
		List<String> author = null;

		try {
			Query q = em.createQuery(findAllNames);

			author = q.getResultList();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return author;
	}

}
