package com.bms.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bms.entity.Payee;
import com.bms.service.PayeeService;
import com.bms.service.TransactionService;

@RestController
@CrossOrigin("http://localhost:4040")
public class PayeeController {

	private PayeeService payeeService;
	
	private TransactionService transactionService;
	
	public PayeeController(PayeeService payeeService, TransactionService transactionService) {
		super();
		this.payeeService = payeeService;
		this.transactionService = transactionService;
	}

	@PostMapping("/addPayee")
	public String addPayee(@RequestBody Payee payee) {
		return payeeService.addPayee(payee);
	}
	
	@DeleteMapping("/deletePayee")
	public String deletePayee(@RequestParam("payeeId")int payeeId) {
		transactionService.DeleteTransactions(payeeService.getPayee(payeeId));
		return payeeService.deletePayee(payeeId);
	}
	
	@PutMapping("/updatePayee")
	public String updatePayee(@RequestBody Payee payee) {
		return payeeService.updatePayee(payee);
	}
	
	@GetMapping("/getPayees")
	public List<Payee> getPayees(){
		return payeeService.getPayeeList();
	}
	
	@GetMapping("/getPayee")
	public Payee getPayee(@RequestParam("payeeId")int payeeId) {
		return payeeService.getPayee(payeeId);
	}
	
}
