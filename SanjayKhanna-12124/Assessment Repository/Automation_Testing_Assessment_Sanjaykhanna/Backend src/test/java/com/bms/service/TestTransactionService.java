package com.bms.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.bms.entity.Payee;
import com.bms.entity.Transaction;

@SpringBootTest
@TestMethodOrder(OrderAnnotation.class)
class TestTransactionService {

	@Autowired
	private TransactionService transactionService;
	
	@Test
	void testaddTransaction1() {
		Payee payee = new Payee();
		payee.setPayeeId(3);
		Transaction transaction = new Transaction();
		transaction.setAmount(2000);
		transaction.setPayee(payee);
		assertEquals("Failed", transactionService.addTransaction(transaction));
	}
	
	@Test
	void testaddTransaction2() {
		Payee payee = new Payee();
		payee.setPayeeId(5);
		Transaction transaction = new Transaction();
		transaction.setAmount(2000);
		transaction.setPayee(payee);
		assertEquals("Failed", transactionService.addTransaction(transaction));
	}
	
	@Test
	void testGetTransactionList() {
		assertNotNull(transactionService.getTransactionList());
	}

}
