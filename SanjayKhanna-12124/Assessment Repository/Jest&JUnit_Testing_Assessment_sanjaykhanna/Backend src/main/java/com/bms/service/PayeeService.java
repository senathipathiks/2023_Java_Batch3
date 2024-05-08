package com.bms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bms.entity.Account;
import com.bms.entity.Payee;
import com.bms.entity.Role;
import com.bms.repo.AccountRepo;
import com.bms.repo.PayeeRepo;

@Service
public class PayeeService {
	
	@Autowired
	private PayeeRepo payeeRepo;
	@Autowired
	private AccountRepo accountRepo;

	public String addPayee(Payee payee) {
		String msg = "";
		try {
			Account account = payee.getAccount();
			account.setRole(Role.PAYEE);
			accountRepo.save(account);
			payee.setAccount(accountRepo.findById(account.getAccountNumber()).get());
			payeeRepo.saveAndFlush(payee);
			msg = "success";
		} catch (Exception e) {
			e.printStackTrace();
			msg = "Failed to add Payee";
		}

		return msg;
	}

	public String deletePayee(int payeeId) {
		String msg = "";

		try {
			Payee payee = payeeRepo.findById(payeeId).get();
			payeeRepo.deleteById(payeeId);
			accountRepo.delete(payee.getAccount());
			;
			msg = "success";
		} catch (Exception e) {
			e.printStackTrace();
			msg = "Failed to delete Payee";
		}

		return msg;
	}

	public String updatePayee(Payee payee) {
		String msg = "";

		try {
			accountRepo.save(payee.getAccount());
			payeeRepo.save(payee);
			msg = "success";
		} catch (Exception e) {
			e.printStackTrace();
			msg = "Failed to update Payee";
		}

		return msg;
	}

	public List<Payee> getPayeeList() {
		return payeeRepo.findAll();
	}

	public Payee getPayee(int payeeId) {
		return payeeRepo.findById(payeeId).get();
	}

}
