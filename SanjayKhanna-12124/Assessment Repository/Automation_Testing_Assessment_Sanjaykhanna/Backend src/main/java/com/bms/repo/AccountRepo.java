package com.bms.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bms.entity.Account;
import com.bms.entity.Role;

public interface AccountRepo extends JpaRepository<Account, Long> {

	Optional<Account> findByRole(Role role);
	
}
