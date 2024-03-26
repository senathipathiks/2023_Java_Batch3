package com.lms.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lms.model.Library;
import com.lms.repository.Repository;

@RestController

@CrossOrigin("http://localhost:3001")
public class LibraryController {
	
	@Autowired
	Repository repo;
	
	@GetMapping("Get")
	public List<Library> loadAll(){
		List<Library> libList = (List<Library>) repo.findAll();
		return libList; 
	}
	
	@GetMapping("GetById/{bookId}")
	public Optional<Library> getById(@PathVariable int bookId) {
		return repo.findById(bookId);
	}
	
	@PostMapping("Create")
	public String performInsert(@RequestBody Library lib) {
		String msg;
		try {
			repo.save(lib);
			msg = "Record Insertion Success";
		} catch (Exception e) {
			msg = "Record Insertion Failure";
		}
		
		return msg;
	}
	
	@PutMapping("Update/{bookId}")
	public Optional<Object> performUpdate(@RequestBody Library lib, @PathVariable int bookId) {
		return repo.findById(bookId).map(library ->{
			library.setBookName(lib.getBookName());
			library.setAuthorName(lib.getAuthorName());
			library.setBookPrice(lib.getBookPrice());
			library.setBookType(lib.getBookType());
			return repo.save(library);
		});
	}
	
	@DeleteMapping("Delete/{bookId}")
	public String performDelete(@PathVariable("bookId") int bookId) {
		String msg;
		try {
			repo.deleteById(bookId);
			msg="Record Deleted Successful";
		}catch (Exception e) {
			msg = "Deletion Failure";
		}
		
		return msg;
	}

}
