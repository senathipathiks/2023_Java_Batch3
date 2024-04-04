package com.springboot.springdatajpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.springdatajpa.entity.Employee;

/************************************************* 

* Author: Sundhar Raj S

* Assignment: Code Quality

* Class: EmployeeRepository

************************************************/ 
public interface EmployeeRepository extends JpaRepository<Employee, Integer>
{
    //No CODE REPO
}
