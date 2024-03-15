package com.sbempapp.service;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import com.sbempapp.dao.StudentDAO;
import com.sbempapp.model.Student;

@Service
public class StudentService {
	
	@Autowired
	StudentDAO dao;
	
	//save Student Picture
	public String saveStudentPicture(MultipartFile file) throws IOException {
		
		String fileName = StringUtils.cleanPath(file.getOriginalFilename());
		System.out.println("file name : "+fileName);
		Student dbFile = new Student();
		dbFile.setName(fileName);
		dbFile.setType(file.getContentType());
		dbFile.setPicture(file.getBytes());
		
		return dao.saveStudentPicture(dbFile);
		
	}

}
