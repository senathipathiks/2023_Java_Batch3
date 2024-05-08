package com.bms;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bms.entity.Account;
import com.bms.entity.Role;
import com.bms.repo.AccountRepo;

@SpringBootApplication
public class BankManagementSystemApplication implements CommandLineRunner {

	private AccountRepo accountRepo;

	public BankManagementSystemApplication(AccountRepo accountRepo) {
		super();
		this.accountRepo = accountRepo;
	}

	public static void main(String[] args) {
		SpringApplication.run(BankManagementSystemApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Account account = new Account();
		account.setAccountNumber(1122112212);
		account.setBalanceAmount(30000);
		account.setRole(Role.USER);
		accountRepo.save(account);

	}

}
