package com.sms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sms.bean.Student;
import com.sms.dao.StudentDAO;

@Service
public class StudentService {

	
@Autowired
private StudentDAO dao;
	
public  String addStudent(Student student) {
	try {
		dao.save(student);
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println(e);
	}
	
	return "New Student has been added: "+student.getRoll();
	}

public  String deleteStudent(int roll) {
	
	try {
		dao.deleteById(roll);
	} catch (Exception e) {
		
		e.printStackTrace();
	}
	return "Roll number is deleted :"+roll;
	}

public  String updateStudent(Student student) {
	dao.save(student);
	return " Student has been updated: "+student.getRoll();
	}

public  String getStudent(Student student) {
	try {
		dao.save(student);
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println(e);
	}
	
	return "New Student has been Updated: "+student.getRoll();
	}

public List<Student> getAllStudents(){
	List<Student> list = null;
	try {
		list=(List<Student>)dao.findAll();
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println(e);
	}
	return list;
}
	
}
