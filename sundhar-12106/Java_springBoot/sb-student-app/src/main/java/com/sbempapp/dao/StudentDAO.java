package com.sbempapp.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sbempapp.model.Student;

@Repository
public class StudentDAO {
	
	
	@Autowired
	StudentRepo repo;
	
	//save
	public String saveStudentPicture(Student student) {
		
		repo.save(student);
		return "success";
		
	}

}
