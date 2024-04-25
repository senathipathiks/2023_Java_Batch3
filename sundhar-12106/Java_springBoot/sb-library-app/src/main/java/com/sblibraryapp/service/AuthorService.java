package com.sblibraryapp.service;

import java.util.List;

import com.sblibraryapp.entity.Author;

public interface AuthorService {

	Author getAurthor(int id);

	boolean saveAuthor(Author author);

	String updateAuthor(Author author);

	boolean removeAuthor(int id);

	List<Author> getAuthorByName(String name);

	List<Author> getAllAuthor();
	
	List<String> getAllNames();

}
