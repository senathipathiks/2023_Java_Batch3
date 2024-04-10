package com.lms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lms.bean.Book;
import com.lms.repository.BookRepo;

@RestController
@RequestMapping("/library/book")
@CrossOrigin("http://localhost:3034")
public class LMSController {
	
	@Autowired
	BookRepo repo;
	
	@PostMapping
	public String doInsert(@RequestBody Book book) {
		String msg = "";
		try {
			repo.save(book);
			msg = "success";
		} catch (Exception e) {
			e.printStackTrace();
			msg = "Insertion Failure";
		}
		return msg;
	}
	
	@DeleteMapping
	public String doDelete(@RequestParam("id")int id) {
		String msg = "";
		try {
			repo.deleteById(id);;
			msg = "success";
		} catch (Exception e) {
			e.printStackTrace();
			msg = "Deletion Failure";
		}
		return msg;
	}
	
	@PutMapping
	public String doUpdate(@RequestBody Book book) {
		String msg = "";
		try {
			repo.save(book);
			msg = "success";
		} catch (Exception e) {
			e.printStackTrace();
			msg = "Updation Failure";
		}
		return msg;
	}
	
	@GetMapping
	public Book getBook(@RequestParam("id")int id) {
		return repo.findById(id).get();
	}
	
	@GetMapping("/getAllBooks")
	public List<Book> getAllBooks(){
		return repo.findAll();
	}
	
}
