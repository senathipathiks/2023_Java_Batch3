package com.practice.service;

import com.practice.model.PasswordResetToken;
import com.practice.model.User;
import com.practice.repository.PasswordResetTokenRepository; // Import the repository
import com.practice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Random;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordResetTokenRepository passwordResetTokenRepository;  

    @Autowired
    private EmailService emailService;

    @Override
    public User register(User user) {
        return userRepository.save(user);
    }

    @Override
    public User login(String username, String password) {
        User user = userRepository.findByUsername(username);
        if (user != null && user.getPassword().equals(password)) {
            return user;
        }
        return null;
    }

    @Override
    public void forgotPassword(String username) {
        // Implementation for sending email with OTP for password reset
        User user = userRepository.findByUsername(username);
        if (user != null) {
            String otp = generateOTP();
            emailService.sendEmail(user.getEmail(), "Password Reset OTP", "Your OTP is: " + otp);
            // Create and save the password reset token
            PasswordResetToken resetToken = new PasswordResetToken();
            resetToken.setToken(otp);
            resetToken.setUsername(username);
            passwordResetTokenRepository.save(resetToken);
        }
    }

    @Override
    public boolean verifyOTP(String username, String otp) {
        List<PasswordResetToken> resetTokens = passwordResetTokenRepository.findByUsername(username);
        for (PasswordResetToken resetToken : resetTokens) {
            if (otp.equals(resetToken.getToken())) {
                return true;
            }
        }
        return false; // OTP verification failed
    }

    @Override
    public void resetPassword(String username, String newPassword) {
        User user = userRepository.findByUsername(username);
        if (user != null) {
            // Update the user's password
            user.setPassword(newPassword);
            userRepository.save(user);
        }
    }


    private String generateOTP() {
        // Generate a random 6-digit OTP
        Random random = new Random();
        int otp = 100000 + random.nextInt(900000);
        return String.valueOf(otp);
    }
}
