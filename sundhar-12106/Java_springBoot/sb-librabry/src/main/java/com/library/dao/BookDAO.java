package com.library.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.library.model.Book;
import com.library.repository.BookRepository;

@Repository
public class BookDAO {
	
	@Autowired
	BookRepository repo;
	
	public Book saveBook(Book book) {
		return repo.save(book);
		
	}
	
	public Book fetchById(String id) {
		return repo.findById(id).get();
		
	}
	
	public List<Book> fetchAllBook() {
		return repo.findAll();
		
	}
	
	public String deleteById(String id) {
		repo.deleteById(id);
		return "deleted successfully..!";
		
	}

}
