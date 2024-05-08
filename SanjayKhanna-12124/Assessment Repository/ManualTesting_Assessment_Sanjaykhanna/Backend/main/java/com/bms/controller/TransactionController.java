package com.bms.controller;

import java.util.Date;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bms.entity.Payee;
import com.bms.entity.Status;
import com.bms.entity.Transaction;
import com.bms.service.PayeeService;
import com.bms.service.TransactionService;

@RestController
@CrossOrigin("http://localhost:4040")
public class TransactionController {

	private TransactionService transactionService;

	private PayeeService payeeService;

	public TransactionController(TransactionService transactionService, PayeeService payeeService) {
		super();
		this.transactionService = transactionService;
		this.payeeService = payeeService;
	}

	@PostMapping("/saveTransaction")
	public String addTransaction(@RequestBody Transaction transaction) {
		double amount = transaction.getAmount();
		Payee payee = payeeService.getPayee(transaction.getPayee().getPayeeId()) ;
		payee.setBalanceAmount(payee.getBalanceAmount()+amount);
		Date date = new Date();
		transaction.setTransactionDate(date);
		try {
			payeeService.updatePayee(payee);
			transaction.setStatus(Status.COMPLETED);
		} catch (Exception e) {
			transaction.setStatus(Status.FAILED);
			e.printStackTrace();
		}
		return transactionService.addTransaction(transaction);	
	}
	
	@GetMapping("/getTransactions")
	public List<Transaction> getTransactions(){
		return transactionService.getTransactionList();
	}
}
