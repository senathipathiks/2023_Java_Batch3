package com.ems.dao;

import org.springframework.data.repository.CrudRepository;

import com.ems.bean.Employee;

public interface EmployeeDAO extends CrudRepository<Employee, Integer> {

}
