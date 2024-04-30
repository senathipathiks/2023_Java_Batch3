package com.practice.service;

import com.practice.model.User;

public interface UserService {
    User register(User user);
    User login(String username, String password);
    void forgotPassword(String username);
    boolean verifyOTP(String username, String otp);
    void resetPassword(String username, String newPassword);
}
