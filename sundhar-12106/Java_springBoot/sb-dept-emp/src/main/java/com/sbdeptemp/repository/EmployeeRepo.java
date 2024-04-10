package com.sbdeptemp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sbdeptemp.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer>{

}
