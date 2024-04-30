package com.lms.Repo;


import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.lms.bean.Book;

public interface BookRepo extends CrudRepository<Book, Integer> {
	
	
}
