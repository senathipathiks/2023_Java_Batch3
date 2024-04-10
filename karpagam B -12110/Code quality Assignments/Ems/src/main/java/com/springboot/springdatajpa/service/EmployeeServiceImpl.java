package com.springboot.springdatajpa.service;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

import com.springboot.springdatajpa.dao.EmployeeRepository;
import com.springboot.springdatajpa.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService
{
    private EmployeeRepository employeeRepository;
    
    public EmployeeServiceImpl(EmployeeRepository theEmployeeRepository)
    {
        employeeRepository = theEmployeeRepository;
    }
    
    @Override
    public List<Employee> findAll() 
    {
        return employeeRepository.findAll();
    }

    @Override
    public Employee findById(int theId) 
    {
        Optional<Employee> result = employeeRepository.findById(theId);
        Employee theEmployee = null;
        if(result.isPresent())
            theEmployee = result.get();
        else
            throw new NullPointerException("Employee id not found - " + theId);
        return theEmployee;
    }

    @Override
    public void save(Employee theEmployee) 
    {
        employeeRepository.save(theEmployee);
    }

    @Override
    public void deleteById(int theId) 
    {
        employeeRepository.deleteById(theId);
    }
}
