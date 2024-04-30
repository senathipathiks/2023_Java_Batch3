package com.practice.controller;

import com.practice.model.User;
import com.practice.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
@RequestMapping("/api/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @PostMapping("/login")
    
    public String loginAdmin(@RequestParam String username, @RequestParam String password) {
        if (adminService.authenticate(username, password)) {
            return "Admin login successful!";
        } else {
            return "Invalid admin credentials!";
        }
    }

    @GetMapping("/users")
    public List<User> getAllUsers() {
        return adminService.getAllUsersWithoutPassword();
    }
}
