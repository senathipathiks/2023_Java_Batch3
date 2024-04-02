package com.springdatajpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springdatajpa.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>
{
    //No CODE REPO
}
