package com.sblibraryapp.controller;

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

import com.sblibraryapp.entity.Author;
import com.sblibraryapp.service.AuthorService;

@RestController
@RequestMapping("/admin")
public class AuthorController {
	
	private AuthorService service;

	public AuthorController() {
		super();
	}

	@Autowired
	public AuthorController(AuthorService service) {
		super();
		this.service = service;
	}
	
	@GetMapping
	public List<Author> getAll() {
		System.out.println("hello");
		return service.getAllAuthor();
		
	}
	
	@GetMapping("/{id}")
	public Author getById(@PathVariable("id") int id) {
		return service.getAurthor(id);
		
	}
	
	@GetMapping("names")
	public List<String> getAllNames() {
		return service.getAllNames();
		
	}
	
	@PostMapping
	public boolean saveAuthor(@RequestBody Author author) {
		return service.saveAuthor(author);
		
	}
	
	@PutMapping
	public String updateAuthor(@RequestBody Author author) {
		return service.updateAuthor(author);
		
	}
	
	@DeleteMapping("/{id}")
	public boolean deleteById(@PathVariable("id") int id) {
		return service.removeAuthor(id);
		
	}
	
	
	

}
