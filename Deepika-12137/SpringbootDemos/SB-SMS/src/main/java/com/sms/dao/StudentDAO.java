package com.sms.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sms.bean.Student;

public interface StudentDAO extends JpaRepository<Student, Integer> {

	

}
