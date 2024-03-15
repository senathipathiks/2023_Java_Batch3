package com.sbempapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sbempapp.model.Student;

public interface StudentRepo extends JpaRepository<Student, Integer>{

}
