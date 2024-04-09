package com.springboot.springdatajpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.springdatajpa.entity.Employee;



public interface EmployeeRepository extends JpaRepository<Employee, Integer>
{
    //No CODE REPO
}
