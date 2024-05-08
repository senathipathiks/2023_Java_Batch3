package com.bms.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.bms.entity.Transaction;
import com.bms.service.TransactionService;

@RestController
@CrossOrigin("http://localhost:4040")
public class TransactionController {
	@Autowired
	private TransactionService transactionService;



	@PostMapping("/saveTransaction")
	public String addTransaction(@RequestBody Transaction transaction) {
		return transactionService.addTransaction(transaction);	
	}
	
	@GetMapping("/getTransactions")
	public List<Transaction> getTransactions(){
		return transactionService.getTransactionList();
	}
}
