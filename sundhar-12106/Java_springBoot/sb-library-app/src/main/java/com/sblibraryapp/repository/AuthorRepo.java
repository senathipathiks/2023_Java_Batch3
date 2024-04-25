package com.sblibraryapp.repository;

import java.util.List;

import com.sblibraryapp.entity.Author;

public interface AuthorRepo {
	
	Author getAurthor(int id);
	
	boolean saveAuthor(Author author);
	
	String updateAuthor(Author author);
	
	boolean removeAuthor(Author author);
	
	List<Author> getAuthorByName(String name);
	
	List<Author> getAllAuthor();
	
	List<String> getAllNames();

}
