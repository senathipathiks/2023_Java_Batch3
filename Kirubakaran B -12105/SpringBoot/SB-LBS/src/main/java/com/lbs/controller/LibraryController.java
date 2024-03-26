package com.lbs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lbs.model.Library;
import com.lbs.model.Library;
import com.lbs.repository.LibraryRepo;

@RestController
@CrossOrigin("http://localhost:3000/")
public class LibraryController {
	
	@Autowired
	LibraryRepo repo;
	
	@PostMapping("/Libraryins")
	public String getIns(@RequestBody Library lib) {
		
		String msg="";
		try {
			repo.save(lib);
			msg="Object inserted";
		}catch(Exception e) {
			msg="Object not inserted";
		}
		return msg;
	}
	@GetMapping("/Libraryfindall")
	public List<Library> getAll() {
		List<Library> list=repo.findAll();
		return list;
	}
	
	
	@DeleteMapping("/Librarydel/{lid}")
   public String getDel(@PathVariable int lid) {
		
		String msg="";
		try {
			repo.deleteById(lid);
			msg="Object deleted";
		}catch(Exception e) {
			msg="Object not deleted";
		}
		return msg;
	}
	
	@PutMapping("/Libraryupd")
	public String getUpd(@RequestBody Library lib) {
		
		String msg="";
		try {
			repo.save(lib);
			msg="Object updated";
		}catch(Exception e) {
			msg="Object not updated";
		}
		return msg;
	}
	
	@GetMapping("/Libraryfind/{lid}")
	public Library getFind(@PathVariable int lid) {
		return repo.findById(lid).get();
	}
	
	

}
