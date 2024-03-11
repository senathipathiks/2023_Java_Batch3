package com.employeeApplication.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employeeApplication.dto.Employee;


public interface EmployeeRepo extends JpaRepository<Employee, Integer>{


}
