package com.sblibraryapp.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sblibraryapp.entity.Book;


public interface LibraryService {

	Book getBook(int id);

	boolean saveBook(Book book);

	String updateBook(Book book);

	boolean removeBook(int id);

	List<Book> getBookByName(String name);
	
	List<Book> getAll();
	
	List<String> getAllNames();

}
