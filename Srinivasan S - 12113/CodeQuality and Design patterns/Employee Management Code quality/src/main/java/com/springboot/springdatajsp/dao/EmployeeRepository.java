package com.springboot.springdatajsp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.springdatajsp.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>
{
    
}
