package com.fullstack.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fullstack.bean.Department;
import com.fullstack.bean.Student;
import com.fullstack.repository.StudentRepository;

@RestController
@CrossOrigin("*")
public class StudentController {

	@Autowired
	StudentRepository repo;
	
	@PostMapping("/CreateStudent")
	 
	public  String createStudent(@RequestBody Student student) {
		String msg="";
		try {
			repo.saveAndFlush(student);
			msg="Student object created";
		}
		catch (Exception e) { 
			// TODO: handle exception
			e.printStackTrace();
			msg="Student object not created";
		}
		return msg;
	}
}
