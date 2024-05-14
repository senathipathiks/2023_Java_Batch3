package com.sbmobilerepairapp;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.sbmobilerepairapp.controller.AppointmentController;
import com.sbmobilerepairapp.entity.Appointment;
import com.sbmobilerepairapp.entity.Shops;
import com.sbmobilerepairapp.entity.User;

@SpringBootTest
public class AppointmentTest {
	
	@Autowired
	private AppointmentController controller;
	
	
	@Disabled
	@Test
	void testAddAppointment() {
		
		Shops shops = new Shops();
		shops.setsId(1);
		
		User user = new User();
		user.setuId(3);
		
		List<Shops> shopsList = new ArrayList<>();
		
		shopsList.add(shops);
		
		List<User> usersList = new ArrayList<>();
		
		usersList.add(user);
		
		
		
		Appointment appointment = new Appointment();
		
		appointment.setpModel("iPhone 15 pro");
		appointment.setrDescription("Battery Draining due to internal issue");
		appointment.setShops(shopsList);
		appointment.setUsers(usersList);
				
				
	    boolean result = controller.saveAppointment(appointment);
	    
	    assertThat(result).isTrue();		
	}
	
	

}
