package com.cms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cms.bean.Course;

public interface CourseRepository extends JpaRepository<Course, Integer> {
	
    List<Course> findByCourseName(String courseName);
	
	@Query("select id from Course")
	public List<Integer> getAllCourseId();


}
