package com.sblibraryMS.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sblibraryMS.model.Library;
import com.sblibraryMS.repository.LibraryRepo;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

@RestController
@AllArgsConstructor
@RequiredArgsConstructor
public class LibraryController {

	
	private LibraryRepo repo;
	private String name;
	
	

	@PostMapping
	public Library postMethodName(@RequestBody Library library) {
		System.out.println(library.getLName()+" : "+name);
		return repo.save(library);
	}

}
