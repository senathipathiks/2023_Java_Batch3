package com.sms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sms.entity.Student;
import com.sms.repository.DepartmentRepo;
import com.sms.repository.StudentRepo;

@RestController
@CrossOrigin("http://localhost:3000")
public class StudentController {

	@Autowired
	StudentRepo stuRepo;

	@Autowired
	DepartmentRepo deptRepo;

	@PostMapping("/createStudent")
	public String createStudent(@RequestBody Student s) {
		String msg = "";

		try {
			stuRepo.saveAndFlush(s);
			msg = "success";
		} catch (Exception e) {
			e.printStackTrace();
			msg = "fail";
		}

		return msg;

	}

	@GetMapping("/readAllStudent")
	public List<Student> readAllStudent() {
		return stuRepo.getAllStudent();
	}

	@GetMapping("/readStudent")
	public Student readStudent(@RequestParam("stuId") int id) {
		return stuRepo.findById(id).get();
	}

	@DeleteMapping("/deleteStudent")
	public String deleteStudent(@RequestParam("stuId") int id) {
		String msg = "";
		try {
			stuRepo.deleteById(id);
			msg = "success";
		} catch (Exception e) {
			e.printStackTrace();
			msg = "fail";
		}
		return msg;
	}

	@PutMapping("/updateStudent")
	public String updateStudent(@RequestBody Student s) {
		String msg = "";

		try {
			stuRepo.saveAndFlush(s);
			msg = "success";
		} catch (Exception e) {
			e.printStackTrace();
			msg = "fail";
		}

		return msg;
	}

}
