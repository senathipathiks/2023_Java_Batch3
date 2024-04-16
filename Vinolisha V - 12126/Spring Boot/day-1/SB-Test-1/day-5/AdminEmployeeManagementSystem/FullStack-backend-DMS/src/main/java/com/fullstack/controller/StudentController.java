package com.fullstack.controller;

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

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fullstack.model.Admin;
import com.fullstack.model.Student;

import com.fullstack.repository.StudentRepository;

@RestController
@CrossOrigin("http://localhost:3001")
@RequestMapping("sms/api")
public class StudentController {

	@Autowired
	StudentRepository repo;

	@PostMapping("/insertstud")
	public String insertStud(@RequestBody Student newstud) {
		String Msg = "";
	
			System.out.println(newstud);
			repo.saveAndFlush(newstud);
			Msg = "Student Record Saved";	
		return Msg;
	}
	
	@GetMapping("getStudent")
	public List<Student> getAllStudent(){
		List<Student> list=repo.findAll();
		return list;
	}
    
	
//	@GetMapping("/getstud")
//	public List<Student> getAllStudent() {
//		List<Student> list = repo.findAll();
//		return list;
//
//	}

	@GetMapping("/student/{id}")
	public Student performFind(@PathVariable Integer id) {
		return repo.findById(id).get();

	}

	@PutMapping("/updateStud")
	public Student updateStudent(@RequestBody Student newStudent) {
		return repo.save(newStudent);

	}

	@DeleteMapping("/deleteStud/{id}")
	public String deleteStudent(@PathVariable("id") Integer id) {
		String msg = "";
		try {
			repo.deleteById(id);
			msg = "Student Details Deleted Successfully";

		} catch (Exception e) {
			msg = "Student Details Not Found";
		}
		return msg;

	}

	@GetMapping("/AutopopIdList")
	public List<Integer> doAutoPop() {
		return repo.getIdList();
	}

}
