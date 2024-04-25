package com.sblibraryapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sblibraryapp.entity.Book;
import com.sblibraryapp.service.LibraryService;

@RestController
public class LibraryController {

	private LibraryService service;

	public LibraryController() {
		super();
	}

	@Autowired
	public LibraryController(LibraryService service) {
		super();
		this.service = service;
	}

	@GetMapping
	public List<Book> getAll() {
		return service.getAll();
	}

	@GetMapping("/{id}")
	public Book getById(@PathVariable("id") int id) {
		return service.getBook(id);
	}

	@PutMapping
	public String updateLibrary(@RequestBody Book book) {
		
		return service.updateBook(book);

	}

	@PostMapping
	public boolean saveBook(@RequestBody Book book) {

		return service.saveBook(book);
	}

	@DeleteMapping("/{id}")
	public boolean deleteById(@PathVariable("id") int id) {
		return service.removeBook(id);
	}

	@GetMapping("names")
	public ResponseEntity<List<String>> getAllNames() {

		return new ResponseEntity<>(service.getAllNames(), HttpStatus.OK);

	}

}
