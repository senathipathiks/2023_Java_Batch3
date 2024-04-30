package com.practice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.model.User;
import com.practice.repository.UserRepository;

import java.util.List;
import java.util.Optional;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private UserRepository userRepository;

    // Hardcoded admin credentials
    private static final String ADMIN_USERNAME = "Admin";
    private static final String ADMIN_PASSWORD = "Admin@123";

    @Override
    public boolean authenticate(String username, String password) {
        return ADMIN_USERNAME.equals(username) && ADMIN_PASSWORD.equals(password);
    }

    @Override
    public List<User> getAllUsersWithoutPassword() {
        List<User> users = userRepository.findAll();
        users.forEach(user -> user.setPassword(null)); // Remove password for each user
        return users;
    }
}
