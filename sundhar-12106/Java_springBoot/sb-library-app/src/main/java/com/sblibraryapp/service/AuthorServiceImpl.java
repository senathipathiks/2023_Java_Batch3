package com.sblibraryapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sblibraryapp.entity.Author;
import com.sblibraryapp.repository.AuthorRepo;

@Service
@Transactional
public class AuthorServiceImpl implements AuthorService{
	
	private AuthorRepo repo;

	public AuthorServiceImpl() {
		super();
	}
	
	@Autowired
	public AuthorServiceImpl(AuthorRepo repo) {
		super();
		this.repo = repo;
	}



	@Override
	public Author getAurthor(int id) {
		if(id > 0) {
			return repo.getAurthor(id);
		}
		return null;
	}

	@Override
	public boolean saveAuthor(Author author) {

		return repo.saveAuthor(author);
	}

	@Override
	public String updateAuthor(Author author) {
		
		return repo.updateAuthor(author);
	}

	@Override
	public boolean removeAuthor(int id) {
		
		Author author = repo.getAurthor(id);
		
		return repo.removeAuthor(author);
	}

	@Override
	public List<Author> getAuthorByName(String name) {
		
		return repo.getAuthorByName(name);
	}

	@Override
	public List<Author> getAllAuthor() {
		
		return repo.getAllAuthor();
	}

	@Override
	public List<String> getAllNames() {
		
		return repo.getAllNames();
	}

}
