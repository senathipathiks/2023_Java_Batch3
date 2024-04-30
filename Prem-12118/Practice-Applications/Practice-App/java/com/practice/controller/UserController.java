package com.practice.controller;

import com.practice.model.User;
import com.practice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("http://localhost:3000")
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public ResponseEntity<String> registerUser(@RequestBody User user) {
        User registeredUser = userService.register(user);
        if (registeredUser != null) {
            return ResponseEntity.ok().body("Registration successful!");
        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Registration failed.");
        }
    }


    @PostMapping("/login")
    public ResponseEntity<String> loginUser(@RequestParam String username, @RequestParam String password) {
        User user = userService.login(username, password);
        if (user != null) {
            return ResponseEntity.ok().body("Login successful!");
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid credentials.");
        }
    }


    @PostMapping("/forgot-password")
    public void forgotPassword(@RequestParam String username) {
        userService.forgotPassword(username);
    }

    @PostMapping("/verify-otp")
    public ResponseEntity<Boolean> verifyOTP(@RequestParam String username, @RequestParam String otp) {
        boolean isOTPValid = userService.verifyOTP(username, otp);
        return ResponseEntity.ok().body(isOTPValid);
    }

    @PostMapping("/reset-password")
    public void resetPassword(@RequestBody ResetPasswordRequest request) {
        userService.resetPassword(request.getUsername(), request.getNewPassword());
    }
}
