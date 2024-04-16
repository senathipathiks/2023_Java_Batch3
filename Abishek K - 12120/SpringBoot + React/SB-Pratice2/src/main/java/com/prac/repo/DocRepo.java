package com.prac.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prac.bean.Document;

public interface DocRepo extends JpaRepository<Document, Integer> {

}
