package com.cms.controller;

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

import com.cms.bean.Student;
import com.cms.repository.StudentRepository;


@RestController
@CrossOrigin("*")
public class StudentController {
	
	@Autowired
	private StudentRepository sturepo;

	// to insert the data
	@PostMapping("/doInsert")
	Student newStudent(@RequestBody Student newStudent) {
		return sturepo.save(newStudent);

	}

	// to get all the data from the database
	@GetMapping("/getAllStudentList")
	List<Student> getAllStudents() {
		return (List<Student>) sturepo.findAll();
	}
	
	//delete by id
	@DeleteMapping("/dostudDelete/{studentId}")
	public String DeleteStudent(@PathVariable("studentId") int studentId) {
		String msg = "";
		try {
			sturepo.deleteById(studentId);
			msg = "Student Data Deleted";
		} catch (Exception e) {
			msg = "Student Data not Deleted";
		}
		return msg;
	}
	
	// get the data from name
		@GetMapping("/findByStudName/{studentName}")
		List<Student> getStudentByName(@PathVariable String studentName) {
			List<Student> lib = sturepo.findByStudentName(studentName);
			return lib;

		}

	

	//get by id
	@GetMapping("/GetStudentId/{studentId}")
	public Student performFind(@PathVariable("studentId") int studentId) {
		return sturepo.findById(studentId).get();
	}

	
	//update
	@PutMapping("/doUpdate")
	Student updateStudent(@RequestBody Student stud) {

		return sturepo.save(stud);
	}



	
	//to get all the Id  
	@GetMapping("/getAllIdList")
	List<Integer> getStudentbylist() {
		List<Integer> idList = sturepo.getAllStudentId();
		return idList;
		}
	
	
	
	

}
