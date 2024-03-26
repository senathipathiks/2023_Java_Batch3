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
import com.sms.repository.StudentRepo;

@RestController
@CrossOrigin("http://localhost:3000")
public class StudentController {

	
	
	@Autowired
	StudentRepo repo;
	
	@PostMapping("/Studentins")
	public String getInsert(@RequestBody Student stud) {
		String msg="";
		try {
			repo.save(stud);
			msg="record inserted successfully";
		} catch (Exception e) {
			
			msg="record not insterted";
		}
		return msg;		
	}
	
	@GetMapping("Studentfindall")
	public List<Student> getAll(){
		
		List<Student> list=repo.findAll();
		return list;
	}
	@PutMapping("/Studentupd")
	public String getUpdate(@RequestBody Student stud) {
		String msg="";
		try {
			repo.save(stud);
			msg="record updated successfully";
		} catch (Exception e) {
			
			msg="record not updated";
		}
		return msg;		
	}
	
	@GetMapping("/Studentfind/{sid}")
	public Student getById(@PathVariable int sid ) {
		return repo.findById(sid).get();
	}
	
	@DeleteMapping("/Studentdel/{sid}")
	public String getDelete(@PathVariable int sid) {
		String msg="";
		try {
			repo.deleteById(sid);
			msg="record deleted successfully";
		} catch (Exception e) {
			
			msg="record not deleted";
		}
		return msg;		
	}
	
	@GetMapping("/Autopop")
	public List<Integer> autoPop(){
		
		return repo.getIdList();
	}
}
