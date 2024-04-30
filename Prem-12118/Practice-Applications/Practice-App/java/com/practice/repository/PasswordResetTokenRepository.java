package com.practice.repository;

import com.practice.model.PasswordResetToken;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface PasswordResetTokenRepository extends JpaRepository<PasswordResetToken, Long> {
    Optional<PasswordResetToken> findByToken(String token);
    
    List<PasswordResetToken> findByUsername(String username);

    // Define a method to delete the token by username
    void deleteByUsername(String username);
}
