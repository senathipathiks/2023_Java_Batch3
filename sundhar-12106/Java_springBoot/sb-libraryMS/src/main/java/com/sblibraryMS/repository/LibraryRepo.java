package com.sblibraryMS.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sblibraryMS.model.Library;

@Repository
public interface LibraryRepo extends JpaRepository<Library, Integer>{

}
