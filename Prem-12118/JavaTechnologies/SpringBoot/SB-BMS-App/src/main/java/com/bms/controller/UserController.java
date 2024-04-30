package com.bms.controller;

import com.bms.bean.User;
import com.bms.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("http://localhost:3000")
public class UserController {

    @Autowired
    private UserRepo userRepo;

    @PostMapping("/CreateUser")
    public String insertUser(@RequestBody User user) {
        String msg = "";
        try {
            userRepo.save(user);
            msg = "User Object Saved";
        } catch (Exception e) {
            msg = "User Object not Saved";
        }
        return msg;
    }

    @PutMapping("/UpdateUser/{userId}")
    public String updateUser(@RequestBody User user) {
        String msg = "";
        try {
            userRepo.save(user);
            msg = "User Object Updated";
        } catch (Exception e) {
            msg = "User Object not updated";
        }
        return msg;
    }

    @DeleteMapping("/DeleteUserById/{userId}")
    public String deleteUser(@PathVariable("userId") Integer userId) {
        String msg = "";
        try {
            userRepo.deleteById(userId);
            msg = "User Object deleted";
        } catch (Exception e) {
            msg = "User Object not deleted";
        }
        return msg;
    }

    @GetMapping("/GetUserById/{userId}")
    public Optional<User> getUserById(@PathVariable Integer userId) {
        return userRepo.findById(userId);
    }

    @GetMapping("/GetAllUsers")
    public List<User> findAllUsers() {
        return (List<User>) userRepo.findAll();
    }
    @GetMapping("/GetAllUsersId")
    public List<Integer> findAllUsersId() {
        return (List<Integer>) userRepo.findAllId();
    }
}
