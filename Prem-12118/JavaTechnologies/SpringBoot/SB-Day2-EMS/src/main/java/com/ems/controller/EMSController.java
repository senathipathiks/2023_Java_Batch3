package com.ems.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.ems.bean.Employee;
import com.ems.dao.EmployeeRepo;

@RestController
@CrossOrigin("http://localhost:3000")
public class EMSController {
    @Autowired
    EmployeeRepo repo;

    @PostMapping("/CreateEmployee")
    public String InsertEmployee(@RequestBody Employee employee) {
        String msg = "";
        try {
            repo.save(employee);
            msg = "Employee Object Saved";
        } catch (Exception e) {
            msg = "Employee not Object Saved";
        }
        return msg;

    }

    @PutMapping("/UpdateEmployee")
    public String updateEmployee(@RequestBody Employee employee) {
        String msg = "";
        try {
            repo.save(employee);
            msg = "Employee Object Updated";
        } catch (Exception e) {
            msg = "Employee object not updated";
        }
        return msg;

    }

    @DeleteMapping("/DeleteById/{eid}")
    public String DeleteEmployee(@PathVariable("eid") int eid) {

        String msg = "";
        try {
            repo.deleteById(eid);
            msg = "Employee Object deleted";
        } catch (Exception e) {
            msg = "Employee  Object not deleted";
        }
        return msg;
    }

    @DeleteMapping("/DeleteByName/{ename}")
    public String DeleteEmployeebyName(@PathVariable("ename") String ename) {
    	System.out.println("delete by name");

        String msg = "";
        try {
            repo.deleteByEname(ename);
            msg = "Employee Object deleted";
        } catch (Exception e) {
            msg = "Employee  Object not deleted";
        }
        return msg;
    }


    @GetMapping("/GetEmployeeById/{eid}")
    public Optional<Employee> getEmployeeById(@PathVariable Integer eid) {
        return repo.findById(eid);
    }

    @GetMapping("/GetEmployeeByName/{ename}")
    public List<Employee> GetEmployee(@PathVariable("ename") String ename) {
        return repo.findByEname(ename);
    }

    @GetMapping("/GetOptions/Id")
    public List<Object> getOptions() {
        return repo.getIdList();
    }

    @GetMapping("/GetOptions/Name")
    public List<Object> getOptionsName() {
        return repo.getNameList();
    }
 

    @GetMapping("/GetAllEmployee")
    public List<Employee> FindAllEmployee() {
        return (List<Employee>) repo.findAll();
    }

    @PostMapping("/EditEmployee")
    public String editEmployee(@RequestBody Employee employee) {
        String msg = "";
        try {
            repo.save(employee);
            msg = "Employee Object Updated";
        } catch (Exception e) {
            msg = "Failed to update Employee Object";
        }
        return msg;
    }

    @RequestMapping("/Add")
    public ModelAndView LoadAddEmployee(Employee employee) {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("FindAllEmployee");
        try {
            if (employee != null) {
                repo.save(employee);
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        List<Employee> emp = (List<Employee>) repo.findAll();
        mv.addObject("Emp", emp);

        return mv;
    }
}
