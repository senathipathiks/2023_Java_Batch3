package com.sbmobilerepairapp;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.sbmobilerepairapp.controller.UserController;
import com.sbmobilerepairapp.entity.Appointment;
import com.sbmobilerepairapp.entity.Shops;
import com.sbmobilerepairapp.entity.User;

@SpringBootTest
class UserTest {
	
	@Autowired
	private UserController controller;
	
	@Test
	void getShopsByIdPositive() {
		
		User user = controller.getById(1);
		
		assertThat(user).isNotNull();
		
	}
	
	
	@Test
	void getShopsByIdNegative() {
		
		assertThrows(NoSuchElementException.class, ()->{
			controller.getById(5);
		});
		
	}
	


}
