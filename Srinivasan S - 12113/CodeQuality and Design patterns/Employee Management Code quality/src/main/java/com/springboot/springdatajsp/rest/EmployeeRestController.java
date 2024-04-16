package com.springboot.springdatajsp.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.springdatajsp.entity.Employee;
import com.springboot.springdatajsp.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeRestController 
{
	@Autowired
    private EmployeeService employeeService;
    
//    public EmployeeRestController(EmployeeService employeeService)
//    {
//        employeeService = employeeService;
//    }
    
    @GetMapping("/employees")
    public List<Employee> findAll()
    {
        return employeeService.findAll();
    }
    
    @GetMapping("/employees/{employeeId}")
    public Employee getEmployee(@PathVariable int employeeId)
    {
        Employee theEmployee = employeeService.findById(employeeId);
        if(theEmployee == null)
        {
            throw new NullPointerException	("Employee Id not found - " + employeeId);
        }
        return theEmployee;
    }
    
    @PostMapping("/employees")
    public Employee addEmployee(@RequestBody Employee employee)
    {
    	employee.setId(0);
        employeeService.save(employee);
        return employee;
    }
    
    @PutMapping("/employees")
    public Employee updateEmployee(@RequestBody Employee employee)
    {
        employeeService.save(employee);
        return employee;
    }
    
    @DeleteMapping("/employees/{employeeId}")
    public String deleteEmployee(@PathVariable int employeeId)
    {
        Employee theEmployee = employeeService.findById(employeeId);
        if(theEmployee == null)
        {
            throw new NullPointerException("Employee Id not found - " + employeeId);
        }
        employeeService.deleteById(employeeId);
        return "Deleted Employee id - " + employeeId;
    }
}
