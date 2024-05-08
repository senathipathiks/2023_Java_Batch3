package com.bms.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bms.entity.Payee;
import com.bms.entity.Transaction;
import com.bms.repo.TransactionRepo;

@Service
public class TransactionService {

	private TransactionRepo transactionRepo;

	public TransactionService(TransactionRepo transactionRepo) {
		super();
		this.transactionRepo = transactionRepo;
	}

	public String addTransaction(Transaction transaction) {
		String msg = "";
		try {
			transactionRepo.save(transaction);
			msg = "Transaction Completed";
		} catch (Exception e) {
			e.printStackTrace();
			msg = "Failed";
		}
		return msg;
	}
	
	public List<Transaction> getTransactionList(){
		return transactionRepo.findAll();
	}

	public void DeleteTransactions(Payee payee) {
		transactionRepo.deleteByPayee(payee);
	}
	
}
