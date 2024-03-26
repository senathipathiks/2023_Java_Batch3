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

import com.cms.bean.Course;
import com.cms.repository.CourseRepository;

@RestController
@CrossOrigin("*")
public class CourseController {
	
	@Autowired
	private CourseRepository courserepo;

	// to insert the data
	@PostMapping("/doCourseInsert")
	Course newCourse(@RequestBody Course newCourse) {
		return courserepo.save(newCourse);

	}

	// to get all the data from the database
	@GetMapping("/getAllCourseList")
	List<Course> getAllCourses() {
		return (List<Course>) courserepo.findAll();
	}
	
	//delete by id
	@DeleteMapping("/doCourseDelete/{id}")
	public String DeleteCourse(@PathVariable("id") int id) {
		String msg = "";
		try {
			courserepo.deleteById(id);
			msg = "Course Data Deleted";
		} catch (Exception e) {
			msg = "Course Data not Deleted";
		}
		return msg;
	}
	
	// get the data from name
		@GetMapping("/findByStudName/{courseName}")
		List<Course> getCourseByName(@PathVariable String courseName) {
			List<Course> lib = courserepo.findByCourseName(courseName);
			return lib;

		}

	

	//get by id
	@GetMapping("/GetCourseId/{id}")
	public Course doCourseFind(@PathVariable("id") int id) {
		return courserepo.findById(id).get();
	}

	
	//update
	@PutMapping("/doCourseUpdate")
	Course updateCourse(@RequestBody Course course) {

		return courserepo.save(course);
	}



	
	//to get all the Id  
	@GetMapping("/getCourseIdList")
	List<Integer> getCoursebylist() {
		List<Integer> idlist = courserepo.getAllCourseId();
		return idlist;
		}

}
