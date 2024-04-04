package com.sbaadharapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sbaadharapp.entity.Person;

@Repository
public interface PersonRepo extends JpaRepository<Person, Integer>{

}
