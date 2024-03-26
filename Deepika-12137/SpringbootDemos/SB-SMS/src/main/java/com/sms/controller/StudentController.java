package com.sms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sms.bean.Student;
import com.sms.service.StudentService;

@RestController
@CrossOrigin("http://localhost:1237")
public class StudentController {
    
	@Autowired
	private StudentService studentservice;
	
	@PostMapping("/add")
	public String addStudent(@RequestBody Student student) {
		return studentservice.addStudent(student);
	}
	
	@GetMapping("/getAll")
	public List<Student> listStudent() {
		return studentservice.getAllStudents();
	}
	
	@DeleteMapping("/delete/{roll}")
	public String deleteStudent(@PathVariable int roll) {
		return studentservice.deleteStudent(roll);
	}
	

	@PutMapping("/all")
	public String updateStudent(@RequestBody Student student) {
		return studentservice.getStudent(student);
	}
	
	
}
