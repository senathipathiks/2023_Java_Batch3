package com.springdatajpa.rest;

import java.util.List;
import java.util.Objects;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springdatajpa.entity.Employee;
import com.springdatajpa.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeRestController 
{
	@Autowired
    private EmployeeService employeeService;
    
    //find all employees
    @GetMapping("/employees")
    public List<Employee> findAll()
    {
        return employeeService.findAll();
    }
    
    //find an employee by id
    @GetMapping("/employees/{employeeId}")
    public Employee getEmployee(@PathVariable int employeeId)
    {
        Employee employee = employeeService.findById(employeeId);
        
        employee = Objects.requireNonNull(employee, "Employee Id not found "+ employeeId); 
        
        return employee;
    }
    
    //create an employee
    @PostMapping("/employees")
    public Employee addEmployee(@RequestBody Employee employee)
    {
        employeeService.save(employee);
        
        return employee;
    }
    
    //update an employee
    @PutMapping("/employees")
    public Employee updateEmployee(@RequestBody Employee employee)
    {
        employeeService.save(employee);
        
        return employee;
    }
    
    //delete an employee
    @DeleteMapping("/employees/{employeeId}")
    public String deleteEmployee(@PathVariable int employeeId)
    {
        Employee employee = employeeService.findById(employeeId);
        
        employee = Objects.requireNonNull(employee, "Employee Id not found "+ employeeId); 
        
        employeeService.deleteById(employeeId);
        
        return "Deleted Employee id - " + employeeId;
    }
}
