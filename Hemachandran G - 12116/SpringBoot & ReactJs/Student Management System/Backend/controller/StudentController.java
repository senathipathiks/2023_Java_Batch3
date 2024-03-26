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
import org.springframework.web.bind.annotation.RestController;

import com.sms.model.Student;
import com.sms.repository.StudentRepository;



@RestController
@CrossOrigin("http://localhost:3000")

public class StudentController {
	@Autowired
	StudentRepository repo;
	
	@GetMapping("/GetAllStudent")
	public List<Student> loadFindAllStudent() {
		
		 return (List<Student>) repo.findAll();
		}
	
	@PostMapping("/CreateStu")
    public String newStudent(@RequestBody Student newStudent) {
			   
		String msg;
		try {
			repo.save(newStudent);
			msg = "Data Saved Succesfully";
		} catch (Exception e) {
			e.printStackTrace();
			msg = " Data Failed to Insert";
		}
		return msg;
				
		  }
	
			
	
	@DeleteMapping("/DeleteStudent/{id}")
	public String DeleteStudent(@PathVariable("id") int id) {
		String msg="";
		try {
			repo.deleteById(id);
			msg="Student Object Deleted";
			}catch(Exception e) {
				msg="Student Object not Deleted";
			}
		return msg;
	}
//	
	@PutMapping("/UpdateStudent")
	public String UpdateStudent(@RequestBody Student student) {
		String msg="";
		try {
			repo.save(student);
			msg="Student Object Updated";
		}catch(Exception e) {
			msg="Student Object not Updated";
		}
		return msg;
	}
	
	@PostMapping("/EditOrDelete/{btn}")
	public String doEdit(@PathVariable  String btn , @RequestBody  Student student) {
		String msg="";
		
		if(btn.equals("Edit")) {
			repo.save(student);
			msg="Student Object Edited";
		}
		if(btn.equals("Delete")) {
			repo.delete(student);
			msg="Student Object Deleted";
		}
		return msg;
	}
	
	@GetMapping("/GetStudent/{id}")
	public Student performFind(@PathVariable("id") int id) {
		return repo.findById(id).get();
	} 
	
	@GetMapping("/GetStudentIds")
	public List<Integer> getStuId(){
		return repo.fetchStuIds();
	}
	
	

}
