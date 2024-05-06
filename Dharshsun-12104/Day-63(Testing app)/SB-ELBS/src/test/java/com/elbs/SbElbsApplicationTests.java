package com.elbs;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.elbs.model.Bill;
import com.elbs.model.Tariff;
import com.elbs.model.User;
import com.elbs.service.TariffService;

@SpringBootTest
public class SbElbsApplicationTests {

	@Autowired
	TariffService service;
	


	@Test
	void testInsertTariff() throws Exception {
		Tariff tariff = new Tariff();
		tariff.setTariffId(21);
		tariff.setTariffCategory("Exclusive for honoured");
		tariff.setTariffAmount(13);
		tariff.setTariffStatus("new");
		boolean result = service.doInsertTariff(tariff);
		assertEquals(true, result);

	}

	@Test
	void updationTest() {
		Tariff tariff = new Tariff(20, "Standard", 100, "new");
		boolean result = service.doUpdateService(tariff);
		assertEquals(true, result);
	}

	@Test
	void findTariffTest() {
		int id = 14;
		Tariff result = service.findTariffService(id);
		assertNotNull(result);
	}

	@Test
	void deletionTest() {

		boolean result = service.doDeleteService(10);
		assertEquals(true, result);
	}
	
	
	@Test
	void testInsertUser() throws Exception {
		
		
		Bill bill = new Bill();
		bill.setBillId(1);
		
		Tariff tariff = new Tariff();
		tariff.setTariffId(1);
		
		User user = new User();
		user.setUserId(21);
		user.setUserName("Chandru");
		user.setUserLocation("Puducherry");
		user.setUserSubsidies("subsidies applicable - localresident");
		user.setBill(bill);
		user.setTariff(tariff);
		
		boolean result = service.doInsertUser(user);
		assertEquals(true, result);

}
	@Test
	void deleteUserTest() {

		boolean result = service.doDeleteUserService(21);
		assertEquals(true, result);
	}
	
	@Test
	void findUserTest() {
		int id = 23;
		User result = service.findUserService(id);
		assertNotNull(result);
	
	}
	
	@Test
	void testInsertBill() throws Exception {
		Bill bill = new Bill();
		bill.setBillId(5);
		bill.setUnitAmount(12);
		bill.setBillAmount(1350);
		bill.setBillPaidStatus("paid");
		boolean result = service.doInsertBill(bill);
		assertEquals(true, result);

	}
	
	@Test
	void deleteBillTest() {

		boolean result = service.doDeleteBillService(5);
		assertEquals(true, result);
	}
	@Test
	void findBillTest() {
		int id = 4;
		Bill result = service.findBillService(id);
		assertNotNull(result);
	
	}
	
}