package com.bms.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bms.entity.Account;
import com.bms.entity.Payee;
import com.bms.entity.Role;
import com.bms.entity.Status;
import com.bms.entity.Transaction;
import com.bms.repo.AccountRepo;
import com.bms.repo.TransactionRepo;

@Service
public class TransactionService {

	@Autowired
	private TransactionRepo transactionRepo;
	@Autowired
	private AccountRepo accountRepo;
	@Autowired
	private PayeeService payeeService;

	public String addTransaction(Transaction transaction) {
		String msg = "success";
		try {
			Date date = new Date();
			transaction.setTransactionDate(date);
			Payee payee = payeeService.getPayee(transaction.getPayee().getPayeeId());
			Account account = accountRepo.findByRole(Role.USER).get();
			if (account.getBalanceAmount() == 0 || account.getBalanceAmount() < transaction.getAmount()) {
				transaction.setStatus(Status.FAILED);
				msg = "failed";
			} else {
				account.setBalanceAmount(account.getBalanceAmount() - transaction.getAmount());
				payee.getAccount().setBalanceAmount(payee.getAccount().getBalanceAmount() + transaction.getAmount());
				accountRepo.save(account);
				payeeService.updatePayee(payee);
				transaction.setStatus(Status.COMPLETED);
			}

			transactionRepo.save(transaction);
		} catch (Exception e) {
			e.printStackTrace();
			msg = "Failed";
		}
		return msg;
	}

	public List<Transaction> getTransactionList() {
		return transactionRepo.findAll();
	}

	public void DeleteTransactions(Payee payee) {
		transactionRepo.deleteByPayee(payee);
	}

}
