package com.practice.service;

import com.practice.model.User;

import java.util.List;

public interface AdminService {
    boolean authenticate(String username, String password);
    List<User> getAllUsersWithoutPassword();
}
