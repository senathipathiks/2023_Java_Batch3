package com.springboot.controller;

    import java.util.ArrayList;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.http.ResponseEntity;
	import org.springframework.web.bind.annotation.CrossOrigin;
	import org.springframework.web.bind.annotation.DeleteMapping;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.PathVariable;
	import org.springframework.web.bind.annotation.PostMapping;
	import org.springframework.web.bind.annotation.PutMapping;
	import org.springframework.web.bind.annotation.RequestBody;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RestController;

import com.springboot.bean.Student;
import com.springboot.repo.StudentRepo;

	

	@RestController
	@CrossOrigin("*")
	@RequestMapping("sms/api")
	public class StudentController {
		
		@Autowired
		StudentRepo repo;
		
		//<-------------------------------------- Create  -------------------------------------->
		@PostMapping("CreateStudent")
		public String doInsertOperation(@RequestBody Student student) {
			String Msg="";
			try {		
				repo.save(student);
				Msg="Student Record Saved";
				
			} catch (Exception e) {
				Msg="Student Record Not Saved";
			}
			return Msg;
		}
		
		@GetMapping("GetAllStudent")
		public ArrayList<Student> getAllEmployee(){
			return (ArrayList<Student>) repo.findAll();
		}

		@DeleteMapping("DeleteStudent/{sid}")
		public String doDelete(@PathVariable("sid")int sid) {
			String Msg="";
			try {
				repo.deleteById(sid);
				Msg="Record Deleted";
			} catch (Exception e) {
				Msg="Record Not Deleted";
			}
			return Msg;	
		}
		
		@PutMapping("/UpdateStudent/{sid}")
		public String doupdate(@PathVariable int sid ,@RequestBody Student student) {
			String Msg="";
			try {	
				if (repo.existsById(sid)) {
					student.setSid(sid);
					repo.save(student);
					Msg="Record updated Successfully";
				}
				
			} catch (Exception e) {
				Msg="Record updation Failed";
			}
			
			return Msg;
		}
		
		@GetMapping("GetEmployeeById/{eid}")
		public Student findStudentById(@PathVariable("eid")int eid) {
			return repo.findById(eid).get();	
		}
		
		@GetMapping("IdList")
		public ArrayList<Integer> getIdList(){
			return repo.getId();
		}
	}


