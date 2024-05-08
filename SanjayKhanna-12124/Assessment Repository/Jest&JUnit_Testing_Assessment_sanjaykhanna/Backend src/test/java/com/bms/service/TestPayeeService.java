package com.bms.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.bms.entity.Account;
import com.bms.entity.Payee;

@SpringBootTest
@TestMethodOrder(OrderAnnotation.class)
class TestPayeeService {

	@Autowired
	private PayeeService payeeService;

	@Test
	@Order(1)
	public void testAddPayee1() {
		Payee payee = new Payee();
		Account account = new Account();
		account.setAccountNumber(1234567890);
		payee.setAccount(account);
		payee.setPayeeId(1);
		payee.setPayeeName("Sanjay Khanna");
		payee.setNickName("sk");
		assertEquals("success", payeeService.addPayee(payee));
	}
	
	@Test
	@Order(2)
	public void testAddPayee2() {
		Payee payee = new Payee();
		Account account = new Account();
		account.setAccountNumber(1234567880);
		payee.setAccount(account);
		payee.setPayeeId(2);
		payee.setPayeeName("Sanjay Khanna");
		payee.setNickName("s");
		assertEquals("success", payeeService.addPayee(payee));
	}
	
	@Test
	@Order(2)
	public void testAddPayee3() {
		Payee payee = new Payee();
		Account account = new Account();
		account.setAccountNumber(1234567899);
		payee.setAccount(account);
		payee.setPayeeId(3);
		payee.setPayeeName("Sanjay Khanna");
		payee.setNickName("san");
		assertEquals("success", payeeService.addPayee(payee));

	}

	@Test
	@Order(5)
	public void testAddPayee4() {
		Payee payee = new Payee();
		payee.setPayeeName("Sanjay Khanna");
		payee.setNickName("sk");
		assertEquals("Failed to add Payee", payeeService.addPayee(payee));

	}

	@Test
	@Order(5)
	public void testAddPayee5() {
		Payee payee = new Payee();
		Account account = new Account();
		account.setAccountNumber(1234567890);
		payee.setAccount(account);
		payee.setNickName("sk");
		assertEquals("Failed to add Payee", payeeService.addPayee(payee));

	}

	@Test
	@Order(6)
	public void testAddPayee6() {
		Payee payee = new Payee();
		payee.setPayeeName("Sanjay Khanna");
		Account account = new Account();
		account.setAccountNumber(1234567890);
		payee.setAccount(account);
		assertEquals("Failed to add Payee", payeeService.addPayee(payee));

	}
	
	@Test
	@Order(7)
	public void testDeletePayee1() {
		assertEquals("success", payeeService.deletePayee(1));
	}
	
	@Test
	@Order(8)
	public void testDeletePayee2() {
		assertEquals("success", payeeService.deletePayee(2));
	}

	@Test
	@Order(9)
	public void testDeletePayee3() {
		assertEquals("Failed to delete Payee", payeeService.deletePayee(1));
	}
	
	@Test
	@Order(10)
	public void testDeletePayee4() {
		assertEquals("Failed to delete Payee", payeeService.deletePayee(2));
	}
	
	@Test
	@Order(11)
	public void testGetPayee1() {
		assertNotNull(payeeService.getPayee(3));
	}

	@Test
	@Order(12)
	public void testGetPayeeList1() {
		assertEquals(true, payeeService.getPayeeList().size() > 0);
	}

	@Test
	@Order(13)
	public void testGetPayeeList2() {
		assertEquals(false, payeeService.getPayeeList().size() == 0);
	}
	
	@Test
	@Order(14)
	public void testGetPayeeList3() {
		assertNotNull(payeeService.getPayeeList());
	}
	
	@Test
	@Order(15)
	public void testUpdatePayee1() {
		Payee payee = new Payee();
		Account account = new Account();
		account.setAccountNumber(1234567800);
		payee.setAccount(account);
		payee.setPayeeName("Sanjay");
		payee.setNickName("sks");
		assertEquals("success", payeeService.updatePayee(payee));

	}
	
	@Test
	@Order(16)
	public void testUpdatePayee2() {
		Payee payee = new Payee();
		Account account = new Account();
		account.setAccountNumber(1234567800);
		payee.setAccount(account);
		payee.setPayeeName("Sanjay");
		payee.setNickName("s");
		assertEquals("Failed to update Payee", payeeService.updatePayee(payee));

	}

	
	

}
