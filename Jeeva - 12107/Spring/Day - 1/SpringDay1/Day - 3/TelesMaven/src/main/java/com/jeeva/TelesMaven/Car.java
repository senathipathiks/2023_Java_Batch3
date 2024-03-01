package com.jeeva.TelesMaven;

import org.springframework.stereotype.Component;

// if we write component here we don't need to Write bean in config.xml like name 
@Component
public class Car implements Vehicle {

	
	public void ride() {
		System.out.println("Iam Driving  Car");
	}

}
