package com.springboot.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.springboot.model.Movie;
 
public interface MovieRepository extends JpaRepository<Movie, Long> {

	
	@Query("select id from Movie order by id")
	public ArrayList<Integer> getId();
}
 
