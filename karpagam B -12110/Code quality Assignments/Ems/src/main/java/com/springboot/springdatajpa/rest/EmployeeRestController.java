package com.springboot.springdatajpa.rest;

import java.util.List;


import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.springdatajpa.entity.Employee;
import com.springboot.springdatajpa.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeRestController 
{
    private EmployeeService employeeService;
    
    public EmployeeRestController(EmployeeService theEmployeeService)
    {
        employeeService = theEmployeeService;
    }
    
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
            throw new NullPointerException("Employee Id not found - " + employeeId);
        }
        return theEmployee;
    }
    
    @PostMapping("/employees")
    public Employee addEmployee(@RequestBody EmployeeDTO employe)
    {
        Employee persistentEmp = new Employee();

        employeeService.save(persistentEmp);
        return persistentEmp;
    }
    
    @PutMapping("/employees")
    public Employee getEmployee(@RequestBody EmployeeDTO employee)
    {
        Employee persistentEmployee = new Employee();

        employeeService.save(persistentEmployee);
		return persistentEmployee;
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
