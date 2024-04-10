package com.bms.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bms.bean.Transaction;
import com.bms.repository.TransactionRepository;

@RestController
@CrossOrigin("*")
@RequestMapping("bms/tc/api")
public class TransactionController {
	
	@Autowired
	TransactionRepository repo;
	
	@PostMapping("CreateTransaction")
	public String createTransaction(@RequestBody Transaction transaction){
		String Msg="";
		try {
			repo.save(transaction);
			Msg="Created Successfully";
		} catch (Exception e) {
			Msg="Creation Failed";
		}
		return Msg;
	}
	
	@PutMapping("UpdateTransaction/{transactionId}")
	public String updateTransaction(@RequestBody Transaction transaction, @PathVariable int transactionId) {
		String Msg="";
		try {	
			if (repo.existsById(transactionId)) {
				transaction.setTransactionId(transactionId);
				repo.save(transaction);
				Msg="Record updated Successfully";
			}
			
		} catch (Exception e) {
			Msg="Record updation Failed";
		}
		
		return Msg;
	}
	
	@DeleteMapping("DeleteTransaction/{transactionId}")
	public String deleteTransaction(@PathVariable("transactionId")int transactionId) {
		String Msg="";
		try {
			repo.deleteById(transactionId);
			Msg="Record Deleted";
		} catch (Exception e) {
			Msg="Record Not Deleted";
		}
		return Msg;	
	}
	
	@GetMapping("GetAllTransaction")
	public ArrayList<Transaction> getAllTransaction(){
		return (ArrayList<Transaction>) repo.findAll();
	}
	
	@GetMapping("GetTransactionById/{transactionId}")
	public Transaction findTransactionById(@PathVariable("transactionId")int transactionId) {
		return repo.findById(transactionId).get();	
	}
	
	@GetMapping("IdList")
	public ArrayList<Integer> getIdList(){
		return repo.getId();
	}
}
