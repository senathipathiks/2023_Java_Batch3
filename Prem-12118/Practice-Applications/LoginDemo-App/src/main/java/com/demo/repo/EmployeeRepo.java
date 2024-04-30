package com.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.demo.entity.Employee;

@EnableJpaRepositories
public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

 

}
