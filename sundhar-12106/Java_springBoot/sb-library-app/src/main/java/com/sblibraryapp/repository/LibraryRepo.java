package com.sblibraryapp.repository;

import java.util.List;

import com.sblibraryapp.entity.Book;

public interface LibraryRepo {
	
	Book getBook(int id);
	
	boolean saveBook(Book book);
	
	String updateBook(Book book);
	
	boolean removeBook(Book book);
	
	List<Book> getBookByName(String name);
	
	List<Book> getAll();
	
	List<String> getAllNames();

}
