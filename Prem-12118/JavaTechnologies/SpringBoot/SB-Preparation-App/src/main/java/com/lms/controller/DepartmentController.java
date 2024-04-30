package com.lms.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import com.lms.Repo.DepartmentRepo;
import com.lms.bean.Department;

@RestController
@CrossOrigin("http://localhost:3000")
public class DepartmentController {
    @Autowired
    DepartmentRepo repo;
    
    
    

    @PostMapping("/CreateDepartment")
    public String InsertDepartment(@RequestBody Department department) {
        String msg = "";
        try {
            repo.save(department);
            msg = "Department Object Saved";
        } catch (Exception e) {
            msg = "Department Object not Saved";
        }
        return msg;
    }

    @PutMapping("/UpdateDepartment")
    public String updateDepartment(@RequestBody Department department) {
        String msg = "";
        try {
            repo.save(department);
            msg = "Department Object Updated";
        } catch (Exception e) {
            msg = "Department Object not updated";
        }
        return msg;
    }

    @DeleteMapping("/DeleteDepartmentById/{departmentId}")
    public String DeleteDepartment(@PathVariable("departmentId") Integer departmentId) {
        String msg = "";
        try {
            repo.deleteById(departmentId);
            msg = "Department Object deleted";
        } catch (Exception e) {
            msg = "Department Object not deleted";
        }
        return msg;
    }

    @GetMapping("/GetDepartmentById/{departmentId}")
    public Optional<Department> getDepartmentById(@PathVariable Integer departmentId) {
        return repo.findById(departmentId);
    }

    @GetMapping("/GetAllDepartments")
    public List<Department> FindAllDepartments() {
        return (List<Department>) repo.findAll();
    }
    
    @GetMapping("/GetDepartmentId")
    public List<Integer> FindDepartmentId() {
        return (List<Integer>) repo.getIdList();
    }
   
    
    
}

