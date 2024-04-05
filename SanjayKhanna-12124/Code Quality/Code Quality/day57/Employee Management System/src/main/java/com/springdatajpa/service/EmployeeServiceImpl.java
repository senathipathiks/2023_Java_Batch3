package com.springdatajpa.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springdatajpa.dao.EmployeeRepository;
import com.springdatajpa.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService
{
	 @Autowired
    private EmployeeRepository employeeRepository;
    
    @Override
    public List<Employee> findAll() 
    {
        return employeeRepository.findAll();
    }

    
    @Override
    public Employee findById(int id) 
    {
        Optional<Employee> result = employeeRepository.findById(id);
        Employee employee = null;
        if(result.isPresent())
            employee = result.get();
        else
            throw new RuntimeException("Employee id not found - " + id);
        return employee;
    }

    @Override
    public void save(Employee employee) 
    {
        employeeRepository.save(employee);
    }

    @Override
    public void deleteById(int id) 
    {
        employeeRepository.deleteById(id);
    }
}
