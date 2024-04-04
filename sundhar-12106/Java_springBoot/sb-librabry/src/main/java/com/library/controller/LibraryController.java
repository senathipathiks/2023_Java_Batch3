package com.library.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.library.dao.BookDAO;
import com.library.model.Book;



@RestController
@RequestMapping("/api/library/")
public class LibraryController {
	
	@Autowired
	BookDAO dao;
	
	
	@PostMapping
	public Book saveBook(@RequestBody Book book) {

		return dao.saveBook(book);
	}
	
	@GetMapping	
	public List<Book> getAllBooks() {
		return dao.fetchAllBook();
	}
	
	@PutMapping
	public Book putMethodName(@RequestBody Book book) {
		
		return dao.saveBook(book);
	}
	
	@GetMapping("fetch/{id}")
	public Book fetchById(@PathVariable String id) {
		return dao.fetchById(id);
	}
	
	@DeleteMapping("delete/{id}")
	public String deleteById(@PathVariable String id) {
		return dao.deleteById(id);
		
	}
	
	
	

}
