package com.example.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import com.example.model.Student;
import com.example.repository.StudentRepository;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;




@RestController
@CrossOrigin("http://localhost:3000/")
public class StudentController {
	
	@Autowired
	StudentRepository repo;
	
	@PostMapping("/CreateStudent")
	public String createStudent(@RequestBody Student student) {

		String msg = " ";
		try {
			repo.save(student);
			msg = "Employee Object Saved";
		} catch (Exception e) {
			msg = "Employee Object Not Saved";
		}
		return msg;

	}
	
		
	@GetMapping("/getStudentById/{id}")
	public Student getStudentById(@PathVariable("id")int id) {
           		   Student st = repo.findById(id).get();	
		
		return st;
	}
	
	@DeleteMapping("deleteStudentById/{id}")
	public String deleteStudent(@PathVariable("id")int id) {		
		String msg = " ";
		try {
			repo.deleteById(id);		   
			msg = "delete!!!!";
		} catch (Exception e) {
			msg = "delete Fail!!!!";
		}
		return msg;		
	}
	
	@PutMapping("/UpdateStudent")
	public String updateStudent(@RequestBody Student student) {

		String msg = " ";
		try {
			repo.save(student);
			msg = "Employee Object Saved";
		} catch (Exception e) {
			msg = "Employee Object Not Saved";
		}
		return msg;

	}
	
	@GetMapping("getStudentIdList")
	List<Integer> getIdListtt(){
		List<Integer> list=repo.getIdList();
		return list;
		
	}
	
	@GetMapping("getAllDetails")
	List<Student> getAllStudent() {		
		List<Student>  st=repo.findAll();		
		return st;
	}
	
	

}
