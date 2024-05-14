package com.sblibraryapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sblibraryapp.entity.Librarian;
import com.sblibraryapp.repository.LibAdminRepo;
import com.sblibraryapp.repository.LibraryRepo;

@RestController
@RequestMapping("/lib")
public class LibAdminController {

	private LibAdminRepo repo;

	public LibAdminController() {
		super();
	}

	@Autowired
	public LibAdminController(LibAdminRepo repo) {
		super();
		this.repo = repo;
	}
	
	@GetMapping
	public List<Librarian> getAll() {
		return repo.getAll();
		
	}
	
	@GetMapping("/{id}")
	public Librarian getById(@PathVariable("id") int id) {
		System.out.println(id);
		return repo.getById(id);
		
	}

}
