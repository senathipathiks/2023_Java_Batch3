package com.sbempapp.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sbempapp.model.Student;

import jakarta.transaction.Transactional;


@Repository
@Transactional
public interface StudentRepo extends JpaRepository<Student, Integer>{

	
   @Query("select s.picture from Student s")
   List<byte[]> findAllByPicture();

}
